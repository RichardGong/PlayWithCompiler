//
// Created by Richard Gong on 2019-08-02.
//

#pragma once

#include "PlayScriptBaseVisitor.h"
#include "llvm/IR/Value.h"

namespace play {

    class IRGen : public PlayScriptBaseVisitor{
    public:
        static void InitializeModuleAndPassManager();

        static void PrintIR();

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


