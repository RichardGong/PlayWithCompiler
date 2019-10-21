/**
 * 使用llvm的示例程序。
 * 能使用IRBuilder，生成一个简单程序的IR，并执行。
 * 示例代码相当于下面的C语言代码：
 * int fun1(int a, int b){
 *      int c = 10;
 *      return a + b + c;
 * }
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
#include "llvm/Target/TargetMachine.h"

#include <cctype>
#include <cstdio>
#include <map>
#include <string>
#include <vector>

using namespace llvm;
using namespace std;


static LLVMContext TheContext;
static IRBuilder<> Builder(TheContext);
static std::unique_ptr<Module> TheModule;
static std::map<std::string, Value *> NamedValues;
static std::unique_ptr<legacy::FunctionPassManager> TheFPM;


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


Function * codegen_fun2(){
    string argNames[2] = {"a", "b"};

    //函数类型
    vector<Type *> argTypes(2, Type::getInt32Ty(TheContext));
    FunctionType *fun1Type = FunctionType::get(Type::getInt32Ty(TheContext), argTypes, false);

    //函数对象
    Function *fun = Function::Create(fun1Type, Function::ExternalLinkage, "fun2", TheModule.get());

    //设置参数名称
    unsigned i = 0;
    for (auto &arg : fun->args()){
        arg.setName(argNames[i++]);
    }

    //创建一个基本块
    BasicBlock *BB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(BB);

    //在基本快里创建语句
    //把参数变量寸到NamedValues里面备用
    NamedValues.clear();
    for (auto &Arg : fun->args())
        NamedValues[Arg.getName()] = &Arg;

    //做加法
    Value *a = NamedValues["a"];
    Value *b = NamedValues["b"];

    Value * const1 = ConstantInt::get(TheContext, APInt(32, 2, true));
    Value * const2 = ConstantInt::get(TheContext, APInt(32, 3, true));
    Value * const3 = ConstantInt::get(TheContext, APInt(32, 2, true));
    Value * const4 = ConstantInt::get(TheContext, APInt(32, 3, true));

    Value *exp1 = Builder.CreateAdd(a, const1);
    Value *exp2 = Builder.CreateAdd(exp1, const2);
    Value *exp3 = Builder.CreateAdd(exp2, b);

    //返回值
    Builder.CreateRet(exp3);

    //验证函数的正确性
    verifyFunction(*fun);

    return fun;
}


Function * codegen_fun3(){
    //函数类型
    FunctionType *funType = FunctionType::get(Type::getInt32Ty(TheContext), false);

    //函数对象
    Function *fun = Function::Create(funType, Function::ExternalLinkage, "fun3", TheModule.get());

    //创建一个基本块
    BasicBlock *BB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(BB);

    Value * const1 = ConstantInt::get(TheContext, APInt(32, 2, true));
    Value * const2 = ConstantInt::get(TheContext, APInt(32, 3, true));
    Value * const3 = ConstantInt::get(TheContext, APInt(32, 2, true));
    Value * const4 = ConstantInt::get(TheContext, APInt(32, 3, true));

    Value *exp1 = Builder.CreateAdd(const1, const2);
    Value *exp2 = Builder.CreateAdd(exp1, const3);
    Value *exp3 = Builder.CreateAdd(exp2, const4);

    //返回值
    Builder.CreateRet(exp3);

    //验证函数的正确性
    verifyFunction(*fun);

    return fun;
}


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


Function * codegen_const_folding(){
    //创建main函数
    FunctionType *funType = FunctionType::get(Type::getInt32Ty(TheContext), false);
    Function *fun = Function::Create(funType, Function::ExternalLinkage, "const_folding", TheModule.get());

    //创建一个基本块
    BasicBlock *BB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(BB);

    Value * tmp1 = ConstantInt::get(TheContext, APInt(32, 2, true));

    Value * tmp2 = ConstantInt::get(TheContext, APInt(32, 3, true));

    Value * tmp3 =  Builder.CreateAdd(tmp1, tmp2);

    Builder.CreateRet(tmp3);

    return fun;
}


Function * codegen_algebra(){
    //创建函数
    vector<Type *> argTypes(1, Type::getInt32Ty(TheContext));
    FunctionType *funType = FunctionType::get(Type::getInt32Ty(TheContext), argTypes, false);
    Function *fun = Function::Create(funType, Function::ExternalLinkage, "algebra", TheModule.get());

    //设置参数名称
    string argNames[1] = {"a"};
    unsigned i = 0;
    for (auto &arg : fun->args()){
        arg.setName(argNames[i++]);
    }

    NamedValues.clear();
    for (auto &Arg : fun->args())
        NamedValues[Arg.getName()] = &Arg;

    //创建一个基本块
    BasicBlock *BB = BasicBlock::Create(TheContext, "", fun);
    Builder.SetInsertPoint(BB);

    Value * L = NamedValues["a"];
    Value * R = ConstantInt::get(TheContext, APInt(32, 0, true));

    Value * tmp =  Builder.CreateMul(L, R);

    Builder.CreateRet(tmp);

    return fun;
}


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


void InitializeModuleAndPassManager() {
    // 创建一个模块
    TheModule = std::make_unique<Module>("llvmdemo", TheContext);

    // 创建一个PassManager
    TheFPM = std::make_unique<legacy::FunctionPassManager>(TheModule.get());

    // 窥孔优化和一些位计算优化
    TheFPM->add(createInstructionCombiningPass());

    // 表达式重关联
    TheFPM->add(createReassociatePass());

    // 删除公共子表达式
    TheFPM->add(createGVNPass());

    // 简化CFG，比如删除不可达的块
    TheFPM->add(createCFGSimplificationPass());

    TheFPM->doInitialization();
}


int main() {
    InitializeModuleAndPassManager();

    Function *const_folding = codegen_const_folding();
    Function *algebra = codegen_algebra();

    TheFPM->run(*algebra);

    TheModule->print(errs(), nullptr);

    return 0;
}