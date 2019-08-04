//
// Created by Richard Gong on 2019-08-02.
//

#include "IRGen.h"

#include "llvm/ADT/APFloat.h"
#include "llvm/ADT/APInt.h"
#include "llvm/ADT/APSInt.h"
#include "llvm/ADT/STLExtras.h"
#include "llvm/IR/BasicBlock.h"
#include "llvm/IR/Constants.h"
#include "llvm/IR/DerivedTypes.h"
#include "llvm/IR/Function.h"
#include "llvm/IR/IRBuilder.h"
#include "llvm/IR/LLVMContext.h"
#include "llvm/IR/Module.h"
#include "llvm/IR/Type.h"
#include "llvm/IR/Verifier.h"
#include "llvm/Support/TargetSelect.h"
#include "llvm/Target/TargetMachine.h"
#include "llvm/Transforms/InstCombine/InstCombine.h"
#include "llvm/Transforms/Scalar.h"
#include "llvm/Transforms/Scalar/GVN.h"

using namespace antlrcpp;
using namespace play;
using namespace antlr4;
using namespace llvm;
using namespace llvm::orc;

//static LLVMContext TheContext;
//static IRBuilder<> Builder(TheContext);
//static std::unique_ptr<Module> TheModule;
//static std::map<std::string, Value *> NamedValues;
//static std::unique_ptr<legacy::FunctionPassManager> TheFPM;
//static std::unique_ptr<PlayScriptJIT> TheJIT;
//static std::map<std::string, std::unique_ptr<PrototypeAST>> FunctionProtos;

void IRGen::InitializeModuleAndPassManager() {
    TheJIT = llvm::make_unique<PlayScriptJIT>();

    // Open a new module.
    TheModule = llvm::make_unique<Module>("playscript", TheContext);

    DataLayout dl = TheJIT->getTargetMachine().createDataLayout();
    TheModule->setDataLayout(dl);


//    TheModule->setDataLayout(TheJIT->getTargetMachine().createDataLayout());

    // Create a new pass manager attached to it.
    TheFPM = llvm::make_unique<legacy::FunctionPassManager>(TheModule.get());

    // Do simple "peephole" optimizations and bit-twiddling optzns.
    TheFPM->add(createInstructionCombiningPass());
    // Reassociate expressions.
    TheFPM->add(createReassociatePass());
    // Eliminate Common SubExpressions.
    TheFPM->add(createGVNPass());
    // Simplify the control flow graph (deleting unreachable blocks, etc).
    TheFPM->add(createCFGSimplificationPass());

    TheFPM->doInitialization();
}

void IRGen::ExecuteJIT(){
    TheJIT->addModule(std::move(TheModule));


    // Search the JIT for the __anon_expr symbol.
    auto ExprSymbol = TheJIT->findSymbol("__prog");
    assert(ExprSymbol && "__prog not found");

    // Get the symbol's address and cast it to the right type (takes no
    // arguments, returns a double) so we can call it as a native function.
    double (*FP)() = (double (*)())(intptr_t)cantFail(ExprSymbol.getAddress());
    fprintf(stdout, "Evaluated to %f\n", FP());
}

void IRGen::PrintIR() {
    TheModule->print(outs(), nullptr);
    std::cout << std::endl;
}

Value *IRGen::LogErrorV(const char *Str) {
    fprintf(stderr, "Error: %s\n", Str);
    return nullptr;
}

antlrcpp::Any IRGen::visitProg(PlayScriptParser::ProgContext *ctx) {
    //对于最外层的的程序，建立一个缺省的函数
    std::vector<Type *> Doubles(0, Type::getDoubleTy(TheContext));
    FunctionType *FT = FunctionType::get(Type::getDoubleTy(TheContext), Doubles, false);
    Function *TheFunction = Function::Create(FT, Function::ExternalLinkage, "__prog", TheModule.get());

    // Create a new basic block to start insertion into.
    BasicBlock *BB = BasicBlock::Create(TheContext, "entry", TheFunction);
    Builder.SetInsertPoint(BB);

    // Record the function arguments in the NamedValues map.
    NamedValues.clear();

    Value *RetVal = nullptr;

    try {
        RetVal = visitBlockStatements(ctx->blockStatements());
    } catch (std::bad_cast) {
        fprintf(stdout, "bad_cast in visitPorg.\n");
    }

    // Finish off the function.
    Builder.CreateRet(RetVal);

    // Validate the generated code, checking for consistency.
    verifyFunction(*TheFunction);

//    fprintf(stdout, "prog:\n");
//
//    TheFunction->print(outs());
//    fprintf(stdout, "\n");

    return TheFunction;
}

antlrcpp::Any IRGen::visitBlock(PlayScriptParser::BlockContext *ctx) {
    Value *result = visitBlockStatements(ctx->blockStatements());

    return result;
}

antlrcpp::Any IRGen::visitBlockStatements(PlayScriptParser::BlockStatementsContext *ctx) {
    Value *result = nullptr;
    if (ctx->blockStatement().size() > 0) {
        for (unsigned i = 0; i < ctx->blockStatement().size(); i++) {
            result = visitBlockStatement(ctx->blockStatement(i));
        }
    }

    return result;
}

antlrcpp::Any IRGen::visitBlockStatement(PlayScriptParser::BlockStatementContext *ctx) {
    Value *result = nullptr;
    if (ctx->statement()) {
        result = visitStatement(ctx->statement());
    } else if (ctx->functionDeclaration()) {
        result = visitFunctionDeclaration(ctx->functionDeclaration());
    } else if (ctx->variableDeclarators()){
        result = visitVariableDeclarators(ctx->variableDeclarators());
    }

    return result;
}

antlrcpp::Any IRGen::visitStatement(PlayScriptParser::StatementContext *ctx) {
    Value *result = nullptr;
    if (ctx->statementExpression) {
        result = visitExpression(ctx->statementExpression);
    } else if (ctx->RETURN()) {
        result = visitExpression(ctx->expression());
    }

    return result;
}

antlrcpp::Any IRGen::visitExpression(PlayScriptParser::ExpressionContext *ctx) {
    Value *result = nullptr;

    //二元表达式
    try {
        if (ctx->bop && ctx->expression().size() >= 2) {

            Value *L = visitExpression(ctx->expression(0));
            Value *R = visitExpression(ctx->expression(1));

            //std::cout<<"L:"<< L <<std::endl;
            //std::cout<<"R:"<< R <<std::endl;


//            if (ctx->bop->getType() == PlayScriptParser::ADD) {
//                result = Builder.CreateAdd(L, R, "addtmp");
//            } else if (ctx->bop->getType() == PlayScriptParser::SUB) {
//                result = Builder.CreateSub(L, R, "subtmp");
//            } else if (ctx->bop->getType() == PlayScriptParser::MUL) {
//                result = Builder.CreateMul(L, R, "multmp");
//            } else if (ctx->bop->getType() == PlayScriptParser::DIV) {
//                result = Builder.CreateFDiv(L, R, "divtmp");
//            }

            if (ctx->bop->getType() == PlayScriptParser::ADD) {
                result = Builder.CreateFAdd(L, R, "addtmp");
            } else if (ctx->bop->getType() == PlayScriptParser::SUB) {
                result = Builder.CreateFSub(L, R, "subtmp");
            } else if (ctx->bop->getType() == PlayScriptParser::MUL) {
                result = Builder.CreateFMul(L, R, "multmp");
            } else if (ctx->bop->getType() == PlayScriptParser::DIV) {
                result = Builder.CreateFDiv(L, R, "divtmp");
            }

            //std::cout<<"result:"<< result <<std::endl;
//            result->print(outs());
//            std::cout << std::endl;

        } else if (ctx->primary()) {
            result = visitPrimary(ctx->primary());

        } else if (ctx->functionCall()) {
            result = visitFunctionCall(ctx->functionCall());
        }

    }
    catch (std::bad_cast) {
        std::cout << "bad_cast in visitExpression" << std::endl;
    }
    return result;
}

antlrcpp::Any IRGen::visitPrimary(PlayScriptParser::PrimaryContext *ctx) {
    Value *result = nullptr;
    if (ctx->literal()) {
        result = visitLiteral(ctx->literal());
    } else if (ctx->IDENTIFIER()) {
        // Look this variable up in the function.
        std::string name = ctx->IDENTIFIER()->getText();
        result = NamedValues[name];
        if (!result)
            result = LogErrorV("Unknown variable name");
    }else if (ctx->expression()){
        result = visitExpression(ctx->expression());
    }
    return result;
}

antlrcpp::Any IRGen::visitLiteral(PlayScriptParser::LiteralContext *ctx) {
    if (ctx->integerLiteral()) {
        return visitIntegerLiteral(ctx->integerLiteral());
    } else if (ctx->floatLiteral()) {
        return visitFloatLiteral(ctx->floatLiteral());
    }

    return nullptr;
}

antlrcpp::Any IRGen::visitIntegerLiteral(PlayScriptParser::IntegerLiteralContext *ctx) {
    //int literal = std::stoi(ctx->getText());

    try {
        Value *result = ConstantInt::get(TheContext, APSInt(ctx->getText()));
        //std::cout<<"result in visitIntegerLiteral:"<< result <<std::endl;
        result->print(outs());
        std::cout << std::endl;
        return result;
    }
    catch (std::bad_cast) {
        std::cout << "bad_cast in visitIntegerLiteral" << std::endl;
    }
    return nullptr;
}

antlrcpp::Any IRGen::visitFloatLiteral(PlayScriptParser::FloatLiteralContext *ctx) {
    try {
        double literal = std::stod(ctx->getText());
        Value *result = ConstantFP::get(TheContext, APFloat(literal));
        return result;
    }
    catch (std::bad_cast) {
        std::cout << "bad_cast in visitFloatLiteral" << std::endl;
    }
    return nullptr;
}

antlrcpp::Any IRGen::visitFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext *ctx) {
    Value *result = nullptr;
    int numParams = 0;
    PlayScriptParser::FormalParameterListContext *list = ctx->formalParameters()->formalParameterList();
    if (list) {
        numParams = list->formalParameter().size();
    }
    std::vector<Type *> Doubles(numParams, Type::getDoubleTy(TheContext));
    FunctionType *FT = FunctionType::get(Type::getDoubleTy(TheContext), Doubles, false);

    std::string name = ctx->IDENTIFIER()->getText();
    Function *F = Function::Create(FT, Function::ExternalLinkage, name, TheModule.get());

    // Set names for all arguments.
    unsigned Idx = 0;

    for (auto &Arg : F->args())
        Arg.setName(list->formalParameter(Idx++)->variableDeclaratorId()->IDENTIFIER()->getText());

    // Create a new basic block to start insertion into.
    BasicBlock *BB = BasicBlock::Create(TheContext, "entry", F);

    BasicBlock *oldBB = Builder.GetInsertBlock();

    Builder.SetInsertPoint(BB);

    // Record the function arguments in the NamedValues map.
    std::map<std::string, Value*> oldNamedValues(NamedValues);
    NamedValues.clear();
    for (auto &Arg : F->args())
        NamedValues[Arg.getName()] = &Arg;

//    for (auto iter = NamedValues.begin(); iter != NamedValues.end(); iter++) {
//        std::cout << iter->first << " : " << iter->second << std::endl;
//    }

    if (Value *RetVal = visitFunctionBody(ctx->functionBody())) {
        // Finish off the function.
        Builder.CreateRet(RetVal);

        // Validate the generated code, checking for consistency.
        verifyFunction(*F);

        // Run the optimizer on the function.
        TheFPM->run(*F);

        result = F;
    } else {

        // Error reading body, remove function.
        F->eraseFromParent();
    }

//    fprintf(stdout, "Function definition:");
//    F->print(outs());
//    fprintf(stdout, "\n");

    //恢复原来的代码插入点
    Builder.SetInsertPoint(oldBB);
    NamedValues = oldNamedValues;

    return result;

}

antlrcpp::Any IRGen::visitFunctionBody(PlayScriptParser::FunctionBodyContext *ctx) {
    Value *result = nullptr;

    if (ctx->block()) {
        result = visitBlock(ctx->block());
    }
    return result;
}


antlrcpp::Any IRGen::visitFormalParameters(PlayScriptParser::FormalParametersContext *ctx) {
    Value *result = nullptr;

    return result;
}

antlrcpp::Any IRGen::visitFormalParameterList(PlayScriptParser::FormalParameterListContext *ctx) {
    Value *result = nullptr;

    return result;
}

antlrcpp::Any IRGen::visitFormalParameter(PlayScriptParser::FormalParameterContext *ctx) {
    Value *result = nullptr;

    return result;
}

antlrcpp::Any IRGen::visitFunctionCall(PlayScriptParser::FunctionCallContext *ctx) {
    Value *result = nullptr;

    // Look up the name in the global module table.
    Function *CalleeF = TheModule->getFunction(ctx->IDENTIFIER()->getText());
    if (!CalleeF)
        return LogErrorV("Unknown function referenced");

    // If argument mismatch error.
    int numArgs = 0;
    if (ctx->expressionList()) {
        numArgs = ctx->expressionList()->expression().size();
    }

    //TODO 检查参数类型
    if (CalleeF->arg_size() != numArgs)
        return LogErrorV("Incorrect # arguments passed");

    std::vector<Value *> ArgsV;
    for (unsigned i = 0; i < numArgs; i++) {
        Value *argValue = visitExpression(ctx->expressionList()->expression(i));
        if (!argValue) {
            return nullptr;
        }
        ArgsV.push_back(argValue);
    }

    result = Builder.CreateCall(CalleeF, ArgsV, "calltmp");

    return result;
}

antlrcpp::Any IRGen::visitVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext *ctx) {
    Value *result = nullptr;

    for (unsigned i = 0; i < ctx->variableDeclarator().size(); i++){
        result = visitVariableDeclarator(ctx->variableDeclarator(i));
    }

    return result;
}


antlrcpp::Any IRGen::visitVariableDeclarator(PlayScriptParser::VariableDeclaratorContext *ctx) {
    Value *result = nullptr;

    std::string name = ctx->variableDeclaratorId()->getText();

    if (ctx->variableInitializer()){
        result = visitVariableInitializer(ctx->variableInitializer());
    }

    //缺省初始化成0.0
    if (!result){
        result = ConstantFP::get(TheContext, APFloat(0.0));
    }

    //缓存变量的SSA
    NamedValues[name]=result;

    return result;
}

antlrcpp::Any IRGen::visitVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext *ctx) {
    Value *result = nullptr;

    return result;
}

antlrcpp::Any IRGen::visitVariableInitializer(PlayScriptParser::VariableInitializerContext *ctx) {
    Value *result = nullptr;

    if (ctx->expression()){
        result = visitExpression(ctx->expression());
    }

    return result;
}