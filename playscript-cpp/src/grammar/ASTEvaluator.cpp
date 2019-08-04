//
// Created by Richard Gong on 2019-08-02.
//

#include "ASTEvaluator.h"

using namespace antlrcpp;
using namespace play;
using namespace antlr4;

antlrcpp::Any ASTEvaluator::visitExpression(PlayScriptParser::ExpressionContext *ctx) {


    //二元表达式
    if (ctx->bop && ctx->expression().size() >= 2) {


        int L = visitExpression(ctx->expression(0));
        int R = visitExpression(ctx->expression(1));

        int result = 0;
        if (ctx->bop->getType() == PlayScriptParser::ADD) {
            result = L + R;
        } else if (ctx->bop->getType() == PlayScriptParser::SUB) {
            result = L - R;
        } else if (ctx->bop->getType() == PlayScriptParser::MUL) {
            result = L * R;
        } else if (ctx->bop->getType() == PlayScriptParser::DIV) {
            result = L / R;
        }

        std::cout << "L:" << L << ", R:" << R << ", result:" << result << std::endl;


        return result;

    } else if (ctx->primary()) {
        return visitPrimary(ctx->primary());
    }
    return nullptr;
}

antlrcpp::Any ASTEvaluator::visitPrimary(PlayScriptParser::PrimaryContext *ctx) {
    if (ctx->literal()) {
        return visitLiteral(ctx->literal());
    }
    return nullptr;
}

antlrcpp::Any ASTEvaluator::visitLiteral(PlayScriptParser::LiteralContext *ctx) {
    if (ctx->integerLiteral()) {
        return visitIntegerLiteral(ctx->integerLiteral());
    }
    return nullptr;
}

antlrcpp::Any ASTEvaluator::visitIntegerLiteral(PlayScriptParser::IntegerLiteralContext *ctx) {
    return std::stoi(ctx->getText());
}

antlrcpp::Any ASTEvaluator::visitFloatLiteral(PlayScriptParser::FloatLiteralContext *ctx) {
    return std::stof(ctx->getText());
}
