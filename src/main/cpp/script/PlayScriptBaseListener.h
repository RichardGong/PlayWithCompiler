
package script;


// Generated from PlayScript.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "PlayScriptListener.h"


/**
 * This class provides an empty implementation of PlayScriptListener,
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
class  PlayScriptBaseListener : public PlayScriptListener {
public:

  virtual void enterLiteral(PlayScriptParser::LiteralContext * /*ctx*/) override { }
  virtual void exitLiteral(PlayScriptParser::LiteralContext * /*ctx*/) override { }

  virtual void enterPrimitiveType(PlayScriptParser::PrimitiveTypeContext * /*ctx*/) override { }
  virtual void exitPrimitiveType(PlayScriptParser::PrimitiveTypeContext * /*ctx*/) override { }

  virtual void enterStatement(PlayScriptParser::StatementContext * /*ctx*/) override { }
  virtual void exitStatement(PlayScriptParser::StatementContext * /*ctx*/) override { }

  virtual void enterExpressionStatement(PlayScriptParser::ExpressionStatementContext * /*ctx*/) override { }
  virtual void exitExpressionStatement(PlayScriptParser::ExpressionStatementContext * /*ctx*/) override { }

  virtual void enterDeclaration(PlayScriptParser::DeclarationContext * /*ctx*/) override { }
  virtual void exitDeclaration(PlayScriptParser::DeclarationContext * /*ctx*/) override { }

  virtual void enterInitializer(PlayScriptParser::InitializerContext * /*ctx*/) override { }
  virtual void exitInitializer(PlayScriptParser::InitializerContext * /*ctx*/) override { }

  virtual void enterExpression(PlayScriptParser::ExpressionContext * /*ctx*/) override { }
  virtual void exitExpression(PlayScriptParser::ExpressionContext * /*ctx*/) override { }

  virtual void enterAssignmentExpression(PlayScriptParser::AssignmentExpressionContext * /*ctx*/) override { }
  virtual void exitAssignmentExpression(PlayScriptParser::AssignmentExpressionContext * /*ctx*/) override { }

  virtual void enterAssignmentOperator(PlayScriptParser::AssignmentOperatorContext * /*ctx*/) override { }
  virtual void exitAssignmentOperator(PlayScriptParser::AssignmentOperatorContext * /*ctx*/) override { }

  virtual void enterAdditiveExpression(PlayScriptParser::AdditiveExpressionContext * /*ctx*/) override { }
  virtual void exitAdditiveExpression(PlayScriptParser::AdditiveExpressionContext * /*ctx*/) override { }

  virtual void enterMultiplicativeExpression(PlayScriptParser::MultiplicativeExpressionContext * /*ctx*/) override { }
  virtual void exitMultiplicativeExpression(PlayScriptParser::MultiplicativeExpressionContext * /*ctx*/) override { }

  virtual void enterPrimaryExpression(PlayScriptParser::PrimaryExpressionContext * /*ctx*/) override { }
  virtual void exitPrimaryExpression(PlayScriptParser::PrimaryExpressionContext * /*ctx*/) override { }

  virtual void enterArgumentExpressionList(PlayScriptParser::ArgumentExpressionListContext * /*ctx*/) override { }
  virtual void exitArgumentExpressionList(PlayScriptParser::ArgumentExpressionListContext * /*ctx*/) override { }

  virtual void enterCompoundStatement(PlayScriptParser::CompoundStatementContext * /*ctx*/) override { }
  virtual void exitCompoundStatement(PlayScriptParser::CompoundStatementContext * /*ctx*/) override { }

  virtual void enterBlockItemList(PlayScriptParser::BlockItemListContext * /*ctx*/) override { }
  virtual void exitBlockItemList(PlayScriptParser::BlockItemListContext * /*ctx*/) override { }

  virtual void enterBlockItem(PlayScriptParser::BlockItemContext * /*ctx*/) override { }
  virtual void exitBlockItem(PlayScriptParser::BlockItemContext * /*ctx*/) override { }


  virtual void enterEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void exitEveryRule(antlr4::ParserRuleContext * /*ctx*/) override { }
  virtual void visitTerminal(antlr4::tree::TerminalNode * /*node*/) override { }
  virtual void visitErrorNode(antlr4::tree::ErrorNode * /*node*/) override { }

};

