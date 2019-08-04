//
// Created by Richard Gong on 2019-08-02.
//

/**
 * 一个简短的测试程序，只支持对整数常量做加减乘数四则运算。
 */
#pragma once

#include "PlayScriptBaseVisitor.h"

namespace play {

    class ASTEvaluator : public PlayScriptBaseVisitor{
    public:

        virtual antlrcpp::Any visitExpression(PlayScriptParser::ExpressionContext *ctx) override;

        virtual antlrcpp::Any visitPrimary(PlayScriptParser::PrimaryContext *ctx) override;

        virtual antlrcpp::Any visitLiteral(PlayScriptParser::LiteralContext *ctx) override ;

        virtual antlrcpp::Any visitIntegerLiteral(PlayScriptParser::IntegerLiteralContext *ctx) override;

        virtual antlrcpp::Any visitFloatLiteral(PlayScriptParser::FloatLiteralContext *ctx) override ;

    };

}


