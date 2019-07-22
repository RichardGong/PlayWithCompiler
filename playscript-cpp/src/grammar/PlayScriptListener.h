
// Generated from PlayScript.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "PlayScriptParser.h"


namespace play {

/**
 * This interface defines an abstract listener for a parse tree produced by PlayScriptParser.
 */
class  PlayScriptListener : public antlr4::tree::ParseTreeListener {
public:

  virtual void enterClassDeclaration(PlayScriptParser::ClassDeclarationContext *ctx) = 0;
  virtual void exitClassDeclaration(PlayScriptParser::ClassDeclarationContext *ctx) = 0;

  virtual void enterClassBody(PlayScriptParser::ClassBodyContext *ctx) = 0;
  virtual void exitClassBody(PlayScriptParser::ClassBodyContext *ctx) = 0;

  virtual void enterClassBodyDeclaration(PlayScriptParser::ClassBodyDeclarationContext *ctx) = 0;
  virtual void exitClassBodyDeclaration(PlayScriptParser::ClassBodyDeclarationContext *ctx) = 0;

  virtual void enterMemberDeclaration(PlayScriptParser::MemberDeclarationContext *ctx) = 0;
  virtual void exitMemberDeclaration(PlayScriptParser::MemberDeclarationContext *ctx) = 0;

  virtual void enterFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext *ctx) = 0;
  virtual void exitFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext *ctx) = 0;

  virtual void enterFunctionBody(PlayScriptParser::FunctionBodyContext *ctx) = 0;
  virtual void exitFunctionBody(PlayScriptParser::FunctionBodyContext *ctx) = 0;

  virtual void enterTypeTypeOrVoid(PlayScriptParser::TypeTypeOrVoidContext *ctx) = 0;
  virtual void exitTypeTypeOrVoid(PlayScriptParser::TypeTypeOrVoidContext *ctx) = 0;

  virtual void enterQualifiedNameList(PlayScriptParser::QualifiedNameListContext *ctx) = 0;
  virtual void exitQualifiedNameList(PlayScriptParser::QualifiedNameListContext *ctx) = 0;

  virtual void enterFormalParameters(PlayScriptParser::FormalParametersContext *ctx) = 0;
  virtual void exitFormalParameters(PlayScriptParser::FormalParametersContext *ctx) = 0;

  virtual void enterFormalParameterList(PlayScriptParser::FormalParameterListContext *ctx) = 0;
  virtual void exitFormalParameterList(PlayScriptParser::FormalParameterListContext *ctx) = 0;

  virtual void enterFormalParameter(PlayScriptParser::FormalParameterContext *ctx) = 0;
  virtual void exitFormalParameter(PlayScriptParser::FormalParameterContext *ctx) = 0;

  virtual void enterLastFormalParameter(PlayScriptParser::LastFormalParameterContext *ctx) = 0;
  virtual void exitLastFormalParameter(PlayScriptParser::LastFormalParameterContext *ctx) = 0;

  virtual void enterVariableModifier(PlayScriptParser::VariableModifierContext *ctx) = 0;
  virtual void exitVariableModifier(PlayScriptParser::VariableModifierContext *ctx) = 0;

  virtual void enterQualifiedName(PlayScriptParser::QualifiedNameContext *ctx) = 0;
  virtual void exitQualifiedName(PlayScriptParser::QualifiedNameContext *ctx) = 0;

  virtual void enterFieldDeclaration(PlayScriptParser::FieldDeclarationContext *ctx) = 0;
  virtual void exitFieldDeclaration(PlayScriptParser::FieldDeclarationContext *ctx) = 0;

  virtual void enterConstructorDeclaration(PlayScriptParser::ConstructorDeclarationContext *ctx) = 0;
  virtual void exitConstructorDeclaration(PlayScriptParser::ConstructorDeclarationContext *ctx) = 0;

  virtual void enterVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext *ctx) = 0;
  virtual void exitVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext *ctx) = 0;

  virtual void enterVariableDeclarator(PlayScriptParser::VariableDeclaratorContext *ctx) = 0;
  virtual void exitVariableDeclarator(PlayScriptParser::VariableDeclaratorContext *ctx) = 0;

  virtual void enterVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext *ctx) = 0;
  virtual void exitVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext *ctx) = 0;

  virtual void enterVariableInitializer(PlayScriptParser::VariableInitializerContext *ctx) = 0;
  virtual void exitVariableInitializer(PlayScriptParser::VariableInitializerContext *ctx) = 0;

  virtual void enterArrayInitializer(PlayScriptParser::ArrayInitializerContext *ctx) = 0;
  virtual void exitArrayInitializer(PlayScriptParser::ArrayInitializerContext *ctx) = 0;

  virtual void enterClassOrInterfaceType(PlayScriptParser::ClassOrInterfaceTypeContext *ctx) = 0;
  virtual void exitClassOrInterfaceType(PlayScriptParser::ClassOrInterfaceTypeContext *ctx) = 0;

  virtual void enterTypeArgument(PlayScriptParser::TypeArgumentContext *ctx) = 0;
  virtual void exitTypeArgument(PlayScriptParser::TypeArgumentContext *ctx) = 0;

  virtual void enterLiteral(PlayScriptParser::LiteralContext *ctx) = 0;
  virtual void exitLiteral(PlayScriptParser::LiteralContext *ctx) = 0;

  virtual void enterIntegerLiteral(PlayScriptParser::IntegerLiteralContext *ctx) = 0;
  virtual void exitIntegerLiteral(PlayScriptParser::IntegerLiteralContext *ctx) = 0;

  virtual void enterFloatLiteral(PlayScriptParser::FloatLiteralContext *ctx) = 0;
  virtual void exitFloatLiteral(PlayScriptParser::FloatLiteralContext *ctx) = 0;

  virtual void enterProg(PlayScriptParser::ProgContext *ctx) = 0;
  virtual void exitProg(PlayScriptParser::ProgContext *ctx) = 0;

  virtual void enterBlock(PlayScriptParser::BlockContext *ctx) = 0;
  virtual void exitBlock(PlayScriptParser::BlockContext *ctx) = 0;

  virtual void enterBlockStatements(PlayScriptParser::BlockStatementsContext *ctx) = 0;
  virtual void exitBlockStatements(PlayScriptParser::BlockStatementsContext *ctx) = 0;

  virtual void enterBlockStatement(PlayScriptParser::BlockStatementContext *ctx) = 0;
  virtual void exitBlockStatement(PlayScriptParser::BlockStatementContext *ctx) = 0;

  virtual void enterStatement(PlayScriptParser::StatementContext *ctx) = 0;
  virtual void exitStatement(PlayScriptParser::StatementContext *ctx) = 0;

  virtual void enterSwitchBlockStatementGroup(PlayScriptParser::SwitchBlockStatementGroupContext *ctx) = 0;
  virtual void exitSwitchBlockStatementGroup(PlayScriptParser::SwitchBlockStatementGroupContext *ctx) = 0;

  virtual void enterSwitchLabel(PlayScriptParser::SwitchLabelContext *ctx) = 0;
  virtual void exitSwitchLabel(PlayScriptParser::SwitchLabelContext *ctx) = 0;

  virtual void enterForControl(PlayScriptParser::ForControlContext *ctx) = 0;
  virtual void exitForControl(PlayScriptParser::ForControlContext *ctx) = 0;

  virtual void enterForInit(PlayScriptParser::ForInitContext *ctx) = 0;
  virtual void exitForInit(PlayScriptParser::ForInitContext *ctx) = 0;

  virtual void enterEnhancedForControl(PlayScriptParser::EnhancedForControlContext *ctx) = 0;
  virtual void exitEnhancedForControl(PlayScriptParser::EnhancedForControlContext *ctx) = 0;

  virtual void enterParExpression(PlayScriptParser::ParExpressionContext *ctx) = 0;
  virtual void exitParExpression(PlayScriptParser::ParExpressionContext *ctx) = 0;

  virtual void enterExpressionList(PlayScriptParser::ExpressionListContext *ctx) = 0;
  virtual void exitExpressionList(PlayScriptParser::ExpressionListContext *ctx) = 0;

  virtual void enterFunctionCall(PlayScriptParser::FunctionCallContext *ctx) = 0;
  virtual void exitFunctionCall(PlayScriptParser::FunctionCallContext *ctx) = 0;

  virtual void enterExpression(PlayScriptParser::ExpressionContext *ctx) = 0;
  virtual void exitExpression(PlayScriptParser::ExpressionContext *ctx) = 0;

  virtual void enterPrimary(PlayScriptParser::PrimaryContext *ctx) = 0;
  virtual void exitPrimary(PlayScriptParser::PrimaryContext *ctx) = 0;

  virtual void enterTypeList(PlayScriptParser::TypeListContext *ctx) = 0;
  virtual void exitTypeList(PlayScriptParser::TypeListContext *ctx) = 0;

  virtual void enterTypeType(PlayScriptParser::TypeTypeContext *ctx) = 0;
  virtual void exitTypeType(PlayScriptParser::TypeTypeContext *ctx) = 0;

  virtual void enterFunctionType(PlayScriptParser::FunctionTypeContext *ctx) = 0;
  virtual void exitFunctionType(PlayScriptParser::FunctionTypeContext *ctx) = 0;

  virtual void enterPrimitiveType(PlayScriptParser::PrimitiveTypeContext *ctx) = 0;
  virtual void exitPrimitiveType(PlayScriptParser::PrimitiveTypeContext *ctx) = 0;

  virtual void enterCreator(PlayScriptParser::CreatorContext *ctx) = 0;
  virtual void exitCreator(PlayScriptParser::CreatorContext *ctx) = 0;

  virtual void enterSuperSuffix(PlayScriptParser::SuperSuffixContext *ctx) = 0;
  virtual void exitSuperSuffix(PlayScriptParser::SuperSuffixContext *ctx) = 0;

  virtual void enterArguments(PlayScriptParser::ArgumentsContext *ctx) = 0;
  virtual void exitArguments(PlayScriptParser::ArgumentsContext *ctx) = 0;


};

}  // namespace play
