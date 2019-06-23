
package script;


// Generated from PlayScript.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "PlayScriptParser.h"


/**
 * This interface defines an abstract listener for a parse tree produced by PlayScriptParser.
 */
class  PlayScriptListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterLiteral(PlayScriptParser::LiteralContext *ctx) = 0;
  virtual void exitLiteral(PlayScriptParser::LiteralContext *ctx) = 0;

  virtual void enterPrimitiveType(PlayScriptParser::PrimitiveTypeContext *ctx) = 0;
  virtual void exitPrimitiveType(PlayScriptParser::PrimitiveTypeContext *ctx) = 0;

  virtual void enterStatement(PlayScriptParser::StatementContext *ctx) = 0;
  virtual void exitStatement(PlayScriptParser::StatementContext *ctx) = 0;

  virtual void enterExpressionStatement(PlayScriptParser::ExpressionStatementContext *ctx) = 0;
  virtual void exitExpressionStatement(PlayScriptParser::ExpressionStatementContext *ctx) = 0;

  virtual void enterDeclaration(PlayScriptParser::DeclarationContext *ctx) = 0;
  virtual void exitDeclaration(PlayScriptParser::DeclarationContext *ctx) = 0;

  virtual void enterInitializer(PlayScriptParser::InitializerContext *ctx) = 0;
  virtual void exitInitializer(PlayScriptParser::InitializerContext *ctx) = 0;

  virtual void enterExpression(PlayScriptParser::ExpressionContext *ctx) = 0;
  virtual void exitExpression(PlayScriptParser::ExpressionContext *ctx) = 0;

  virtual void enterAssignmentExpression(PlayScriptParser::AssignmentExpressionContext *ctx) = 0;
  virtual void exitAssignmentExpression(PlayScriptParser::AssignmentExpressionContext *ctx) = 0;

  virtual void enterAssignmentOperator(PlayScriptParser::AssignmentOperatorContext *ctx) = 0;
  virtual void exitAssignmentOperator(PlayScriptParser::AssignmentOperatorContext *ctx) = 0;

  virtual void enterAdditiveExpression(PlayScriptParser::AdditiveExpressionContext *ctx) = 0;
  virtual void exitAdditiveExpression(PlayScriptParser::AdditiveExpressionContext *ctx) = 0;

  virtual void enterMultiplicativeExpression(PlayScriptParser::MultiplicativeExpressionContext *ctx) = 0;
  virtual void exitMultiplicativeExpression(PlayScriptParser::MultiplicativeExpressionContext *ctx) = 0;

  virtual void enterPrimaryExpression(PlayScriptParser::PrimaryExpressionContext *ctx) = 0;
  virtual void exitPrimaryExpression(PlayScriptParser::PrimaryExpressionContext *ctx) = 0;

  virtual void enterArgumentExpressionList(PlayScriptParser::ArgumentExpressionListContext *ctx) = 0;
  virtual void exitArgumentExpressionList(PlayScriptParser::ArgumentExpressionListContext *ctx) = 0;

  virtual void enterCompoundStatement(PlayScriptParser::CompoundStatementContext *ctx) = 0;
  virtual void exitCompoundStatement(PlayScriptParser::CompoundStatementContext *ctx) = 0;

  virtual void enterBlockItemList(PlayScriptParser::BlockItemListContext *ctx) = 0;
  virtual void exitBlockItemList(PlayScriptParser::BlockItemListContext *ctx) = 0;

  virtual void enterBlockItem(PlayScriptParser::BlockItemContext *ctx) = 0;
  virtual void exitBlockItem(PlayScriptParser::BlockItemContext *ctx) = 0;


};

