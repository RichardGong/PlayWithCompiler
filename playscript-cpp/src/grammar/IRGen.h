//
// Created by Richard Gong on 2019-08-02.
//

#pragma once

#include "PlayScriptBaseVisitor.h"
#include "llvm/IR/Value.h"

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
#include "PlayScriptJIT.h"

using namespace llvm;
using namespace llvm::orc;

namespace play {

    static LLVMContext TheContext;
    static IRBuilder<> Builder(TheContext);
    static std::unique_ptr<Module> TheModule;
    static std::map<std::string, Value *> NamedValues;
    static std::unique_ptr<legacy::FunctionPassManager> TheFPM;
    static std::unique_ptr<PlayScriptJIT> TheJIT;

    class IRGen : public PlayScriptBaseVisitor{
    public:

        static void InitializeModuleAndPassManager();

        static void PrintIR();

        static void ExecuteJIT();

        virtual antlrcpp::Any visitProg(PlayScriptParser::ProgContext *ctx) override;

        virtual antlrcpp::Any visitBlock(PlayScriptParser::BlockContext *ctx) override;

        virtual antlrcpp::Any visitBlockStatements(PlayScriptParser::BlockStatementsContext *ctx) override;

        virtual antlrcpp::Any visitBlockStatement(PlayScriptParser::BlockStatementContext *ctx) override;

        virtual antlrcpp::Any visitStatement(PlayScriptParser::StatementContext *ctx) override;

        virtual antlrcpp::Any visitExpression(PlayScriptParser::ExpressionContext *ctx) override;

        virtual antlrcpp::Any visitPrimary(PlayScriptParser::PrimaryContext *ctx) override;

        virtual antlrcpp::Any visitLiteral(PlayScriptParser::LiteralContext *ctx) override ;

        virtual antlrcpp::Any visitIntegerLiteral(PlayScriptParser::IntegerLiteralContext *ctx) override;

        virtual antlrcpp::Any visitFloatLiteral(PlayScriptParser::FloatLiteralContext *ctx) override ;

        virtual antlrcpp::Any visitFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext *ctx) override;

        virtual antlrcpp::Any visitFunctionBody(PlayScriptParser::FunctionBodyContext *ctx) override;

//        virtual antlrcpp::Any visitTypeTypeOrVoid(PlayScriptParser::TypeTypeOrVoidContext *ctx) ;


        virtual antlrcpp::Any visitFormalParameters(PlayScriptParser::FormalParametersContext *ctx) override;

        virtual antlrcpp::Any visitFormalParameterList(PlayScriptParser::FormalParameterListContext *ctx) override;

        virtual antlrcpp::Any visitFormalParameter(PlayScriptParser::FormalParameterContext *ctx) override;

        virtual antlrcpp::Any visitFunctionCall(PlayScriptParser::FunctionCallContext *ctx) override;

        virtual antlrcpp::Any visitVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext *ctx) override ;

        virtual antlrcpp::Any visitVariableDeclarator(PlayScriptParser::VariableDeclaratorContext *ctx) override;

        virtual antlrcpp::Any visitVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext *ctx) override ;

        virtual antlrcpp::Any visitVariableInitializer(PlayScriptParser::VariableInitializerContext *ctx) override ;



    private:
        llvm::Value* LogErrorV(const char *Str);

    };

}


