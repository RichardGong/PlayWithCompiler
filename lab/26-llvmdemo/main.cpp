/**
 * 使用llvm的示例程序。
 * 能使用IRBuilder，生成一个简单程序的IR，并执行。
 * 示例代码相当于下面的C语言代码：
 *
 */

#include <iostream>

#include "llvm/IR/Verifier.h"
#include "llvm/IR/DerivedTypes.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/Function.h"
#include "llvm/IR/Type.h"
#include "llvm/IR/LegacyPassManager.h"
#include "llvm/Transforms/InstCombine/InstCombine.h"
#include "llvm/Transforms/Scalar.h"
#include "llvm/Transforms/Scalar/GVN.h"
#include "llvm/Transforms/Utils.h"
#include "llvm/Support/TargetSelect.h"
#include "llvm/Support/FileSystem.h"
#include "llvm/Support/Host.h"
#include "llvm/Support/raw_ostream.h"
#include "llvm/Support/TargetRegistry.h"
#include "llvm/Target/TargetMachine.h"
#include "llvm/Target/TargetOptions.h"

#include <cctype>
#include <cstdio>
#include <map>
#include <string>
#include <vector>
#include "DemoJIT.h"

using namespace llvm;
using namespace llvm::orc;
using namespace std;


static LLVMContext TheContext;
static IRBuilder<> Builder(TheContext);
static std::unique_ptr<Module> TheModule;
static std::map<std::string, Value *> NamedValues;
static std::unique_ptr<legacy::FunctionPassManager> TheFPM;
static std::unique_ptr<DemoJIT> TheJIT;

/**
相当于为下面的程序生成IR：
int fun1(int a, int b){
    return a + b;
}
**/
Function * codegen_fun1(){
    //函数类型
    vector<Type *> argTypes(2, Type::getInt32Ty(TheContext));
    FunctionType *fun1Type = FunctionType::get(Type::getInt32Ty(TheContext), argTypes, false);

    //函数对象
    Function *fun = Function::Create(fun1Type, Function::ExternalLinkage, "fun1", TheModule.get());

    //设置参数名称
    string argNames[2] = {"a", "b"};
    unsigned i = 0;
    for (auto &arg : fun->args()){
        arg.setName(argNames[i++]);
    }

    //创建一个基本块
    BasicBlock *BB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(BB);

    //在基本快里创建语句
    //把参数变量存到NamedValues里面备用
    NamedValues.clear();
    for (auto &Arg : fun->args())
        NamedValues[Arg.getName()] = &Arg;

    //做加法
    Value *L = NamedValues["a"];
    Value *R = NamedValues["b"];
    Value *addtmp= Builder.CreateAdd(L, R);

    //返回值
    Builder.CreateRet(addtmp);

    //验证函数的正确性
    verifyFunction(*fun);

    return fun;
}


/**
 * 一个外部函数，由__main来调用。
 */
#ifdef _WIN32
#define DLLEXPORT __declspec(dllexport)
#else
#define DLLEXPORT
#endif
extern "C" DLLEXPORT void foo(int a){
    printf("in foo: %d\n",a);
}


/**
 * 相当于为下面的函数生成代码：
 相当于为下面的函数生成IR：
  int fun_ifstmt(int a){
     if (a > 2)
         return 2;
     else
         return 3;
  }
 * @return
 */
Function * codegen_ifstmt(){
    vector<Type *> argTypes(1, Type::getInt32Ty(TheContext));
    FunctionType *funType = FunctionType::get(Type::getInt32Ty(TheContext), argTypes, false);
    Function *fun = Function::Create(funType, Function::ExternalLinkage, "fun_ifstmt", TheModule.get());

    //入口基本块
    BasicBlock *entryBB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(entryBB);


    //设置参数名称
    string argNames[1] = {"a"};
    unsigned i = 0;
    for (auto &arg : fun->args()){
        arg.setName(argNames[i++]);
    }

    NamedValues.clear();
    for (auto &Arg : fun->args())
        NamedValues[Arg.getName()] = &Arg;

    //计算a>2
    Value * L = NamedValues["a"];
    Value * R = ConstantInt::get(TheContext, APInt(32, 2, true));
    Value * cond = Builder.CreateICmpUGE(L, R, "cmptmp");

    BasicBlock *ThenBB =BasicBlock::Create(TheContext, "then", fun);
    BasicBlock *ElseBB = BasicBlock::Create(TheContext, "else");
    BasicBlock *MergeBB = BasicBlock::Create(TheContext, "ifcont");
    Builder.CreateCondBr(cond, ThenBB, ElseBB);

    //ThenBB
    Builder.SetInsertPoint(ThenBB);
    Value *ThenV = ConstantInt::get(TheContext, APInt(32, 2, true));
    Builder.CreateBr(MergeBB);

    //ElseBB
    fun->getBasicBlockList().push_back(ElseBB);
    Builder.SetInsertPoint(ElseBB);
    Value *ElseV = ConstantInt::get(TheContext, APInt(32, 3, true));
    Builder.CreateBr(MergeBB);

    //MergeBB
    fun->getBasicBlockList().push_back(MergeBB);
    Builder.SetInsertPoint(MergeBB);
    //PHI节点：整型，两个候选值
    PHINode *PN = Builder.CreatePHI(Type::getInt32Ty(TheContext), 2);
    PN->addIncoming(ThenV, ThenBB); //前序基本块是ThenBB时，采用ThenV
    PN->addIncoming(ElseV, ElseBB); //前序基本块是ElseBB时，采用ElseV

    //返回值
    Builder.CreateRet(PN);

    return fun;
}

/**
 * 相当于为下面的函数生成IR：
  int fun_localvar(int a){
     int b = 0;
     if (a > 2)
         b = 2;
     else
         b = 3;
     return b;
  }
 * @return
 */
Function * codegen_localvar(){
    vector<Type *> argTypes(1, Type::getInt32Ty(TheContext));
    FunctionType *funType = FunctionType::get(Type::getInt32Ty(TheContext), argTypes, false);
    Function *fun = Function::Create(funType, Function::ExternalLinkage, "fun_localvar", TheModule.get());

    //入口基本块
    BasicBlock *entryBB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(entryBB);

    //本地变量b
    AllocaInst *b = Builder.CreateAlloca(Type::getInt32Ty(TheContext), nullptr, "b");
    Value* initValue = ConstantInt::get(TheContext, APInt(32, 0, true));

    Builder.CreateStore(initValue, b);


    //设置参数名称
    string argNames[1] = {"a"};
    unsigned i = 0;
    for (auto &arg : fun->args()){
        arg.setName(argNames[i++]);
    }

    NamedValues.clear();
    for (auto &Arg : fun->args())
        NamedValues[Arg.getName()] = &Arg;

    //计算a>2
    Value * L = NamedValues["a"];
    Value * R = ConstantInt::get(TheContext, APInt(32, 2, true));
    Value * cond = Builder.CreateICmpUGE(L, R, "cmptmp");

    BasicBlock *ThenBB =BasicBlock::Create(TheContext, "then", fun);
    BasicBlock *ElseBB = BasicBlock::Create(TheContext, "else");
    BasicBlock *MergeBB = BasicBlock::Create(TheContext, "ifcont");
    Builder.CreateCondBr(cond, ThenBB, ElseBB);

    //ThenBB
    Builder.SetInsertPoint(ThenBB);
    Value *ThenV = ConstantInt::get(TheContext, APInt(32, 2, true));
    Builder.CreateStore(ThenV, b);
    Builder.CreateBr(MergeBB);

    //ElseBB
    fun->getBasicBlockList().push_back(ElseBB);
    Builder.SetInsertPoint(ElseBB);
    Value *ElseV = ConstantInt::get(TheContext, APInt(32, 3, true));
    Builder.CreateStore(ElseV, b);
    Builder.CreateBr(MergeBB);

    //MergeBB
    fun->getBasicBlockList().push_back(MergeBB);
    Builder.SetInsertPoint(MergeBB);

    //返回值
    Builder.CreateRet(b);

    return fun;
}

/**
 * 不带参数的一个入口函数
 * @return
 */
Function * codegen_main(){
    //创建main函数
    FunctionType *mainType = FunctionType::get(Type::getInt32Ty(TheContext), false);
    Function *main = Function::Create(mainType, Function::ExternalLinkage, "__main", TheModule.get());

    //创建一个基本块
    BasicBlock *BB = BasicBlock::Create(TheContext, "", main);
    Builder.SetInsertPoint(BB);

    //计算参数的值
    int argValues[2] = {2, 3};
    std::vector<Value *> ArgsV;
    for (unsigned i = 0; i<2; ++i) {
        Value * value = ConstantInt::get(TheContext, APInt(32,argValues[i],true));
        ArgsV.push_back(value);
        if (!ArgsV.back())
            return nullptr;
    }

    Function *callee = TheModule->getFunction("fun1");
    Value * rtn = Builder.CreateCall(callee, ArgsV, "calltmp");


    //调用一个外部函数foo
    vector<Type *> argTypes(1, Type::getInt32Ty(TheContext));
    FunctionType *fooType = FunctionType::get(Type::getVoidTy(TheContext), argTypes, false);

    Function *foo = Function::Create(fooType, Function::ExternalLinkage, "foo", TheModule.get());

    std::vector<Value *> ArgsV2;
    ArgsV2.push_back(rtn);
    if (!ArgsV2.back())
        return nullptr;

    Builder.CreateCall(foo, ArgsV2, "calltmp2");

    //调用fun_ifstmt
    Function *fun_ifstmt = TheModule->getFunction("fun_ifstmt");
    rtn = Builder.CreateCall(fun_ifstmt, ArgsV2, "calltmp3");

    //返回值
    Builder.CreateRet(rtn);

    return main;
}


/**
 * 生成二进制目标文件output.o。
 */
int emit_object() {

    TheModule = std::make_unique<Module>("llvmdemo", TheContext);

    //初始化编译目标平台
    InitializeAllTargetInfos();
    InitializeAllTargets();
    InitializeAllTargetMCs();
    InitializeAllAsmParsers();
    InitializeAllAsmPrinters();

    auto TargetTriple = sys::getDefaultTargetTriple();
    TheModule->setTargetTriple(TargetTriple);

    std::string Error;
    auto Target = TargetRegistry::lookupTarget(TargetTriple, Error);

    // Print an error and exit if we couldn't find the requested target.
    // This generally occurs if we've forgotten to initialise the
    // TargetRegistry or we have a bogus target triple.
    if (!Target) {
        errs() << Error;
        return 1;
    }

    auto CPU = "generic";
    auto Features = "";

    TargetOptions opt;
    auto RM = Optional<Reloc::Model>();
    auto TheTargetMachine =
            Target->createTargetMachine(TargetTriple, CPU, Features, opt, RM);

    TheModule->setDataLayout(TheTargetMachine->createDataLayout());

    ////生成IR
    Function *fun1 = codegen_fun1();
    Function *fun_ifstmt = codegen_ifstmt();
    Function *fun_localvar = codegen_localvar();
    codegen_main();

    auto Filename = "output.o";
    std::error_code EC;
    raw_fd_ostream dest(Filename, EC, sys::fs::OF_None);

    if (EC) {
        errs() << "Could not open file: " << EC.message();
        return 1;
    }

    legacy::PassManager pass;
    auto FileType = TargetMachine::CGFT_ObjectFile;

    if (TheTargetMachine->addPassesToEmitFile(pass, dest, nullptr, FileType)) {
        errs() << "TheTargetMachine can't emit a file of this type";
        return 1;
    }

    pass.run(*TheModule);
    dest.flush();

    outs() << "Wrote " << Filename << "\n";

    return 0;
}

/**
 * 即时编译并执行。
 * @return
 */
int JIT() {
    //为JIT做一些初始化
    InitializeNativeTarget();
    InitializeNativeTargetAsmPrinter();
    InitializeNativeTargetAsmParser();

    TheJIT = std::make_unique<DemoJIT>();

    // 创建模块
    TheModule = std::make_unique<Module>("llvmdemo", TheContext);
    TheModule->setDataLayout(TheJIT->getTargetMachine().createDataLayout());

    ////生成IR
    Function *fun1 = codegen_fun1();
    Function *fun_ifstmt = codegen_ifstmt();
    Function *fun_localvar = codegen_localvar();
    codegen_main();

    //打印输出
    TheModule->print(errs(), nullptr);

    ////即时编译并执行
    //把模块加入到即时编译的引擎中
    auto H = TheJIT->addModule(std::move(TheModule));

    // 查找函数
    auto main = TheJIT->findSymbol("__main");
    assert(main && "Function not found");

    //获得函数地址（指针）
    int32_t (*FP)() = (int32_t (*)())(intptr_t)cantFail(main.getAddress());

    //执行该函数
    int rtn = FP();

    //打印运行结果
    fprintf(stderr, "__main: %d\n", rtn);

    //从JIT引擎中删除模块
    TheJIT->removeModule(H);


    ////生成目标文件
    emit_object();

    return 0;
}

int main(){
    //即时编译和运行
    //return JIT();

    //编译成静态文件
    return emit_object();
}