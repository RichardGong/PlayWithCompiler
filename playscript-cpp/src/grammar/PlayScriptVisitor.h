
// Generated from PlayScript.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"
#include "PlayScriptParser.h"


namespace play {

/**
 * This class defines an abstract visitor for a parse tree
 * produced by PlayScriptParser.
 */
class  PlayScriptVisitor : public antlr4::tree::AbstractParseTreeVisitor {
public:

  /**
   * Visit parse trees produced by PlayScriptParser.
   */
    virtual antlrcpp::Any visitClassDeclaration(PlayScriptParser::ClassDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitClassBody(PlayScriptParser::ClassBodyContext *context) = 0;

    virtual antlrcpp::Any visitClassBodyDeclaration(PlayScriptParser::ClassBodyDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitMemberDeclaration(PlayScriptParser::MemberDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitFunctionBody(PlayScriptParser::FunctionBodyContext *context) = 0;

    virtual antlrcpp::Any visitTypeTypeOrVoid(PlayScriptParser::TypeTypeOrVoidContext *context) = 0;

    virtual antlrcpp::Any visitQualifiedNameList(PlayScriptParser::QualifiedNameListContext *context) = 0;

    virtual antlrcpp::Any visitFormalParameters(PlayScriptParser::FormalParametersContext *context) = 0;

    virtual antlrcpp::Any visitFormalParameterList(PlayScriptParser::FormalParameterListContext *context) = 0;

    virtual antlrcpp::Any visitFormalParameter(PlayScriptParser::FormalParameterContext *context) = 0;

    virtual antlrcpp::Any visitLastFormalParameter(PlayScriptParser::LastFormalParameterContext *context) = 0;

    virtual antlrcpp::Any visitVariableModifier(PlayScriptParser::VariableModifierContext *context) = 0;

    virtual antlrcpp::Any visitQualifiedName(PlayScriptParser::QualifiedNameContext *context) = 0;

    virtual antlrcpp::Any visitFieldDeclaration(PlayScriptParser::FieldDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitConstructorDeclaration(PlayScriptParser::ConstructorDeclarationContext *context) = 0;

    virtual antlrcpp::Any visitVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext *context) = 0;

    virtual antlrcpp::Any visitVariableDeclarator(PlayScriptParser::VariableDeclaratorContext *context) = 0;

    virtual antlrcpp::Any visitVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext *context) = 0;

    virtual antlrcpp::Any visitVariableInitializer(PlayScriptParser::VariableInitializerContext *context) = 0;

    virtual antlrcpp::Any visitArrayInitializer(PlayScriptParser::ArrayInitializerContext *context) = 0;

    virtual antlrcpp::Any visitClassOrInterfaceType(PlayScriptParser::ClassOrInterfaceTypeContext *context) = 0;

    virtual antlrcpp::Any visitTypeArgument(PlayScriptParser::TypeArgumentContext *context) = 0;

    virtual antlrcpp::Any visitLiteral(PlayScriptParser::LiteralContext *context) = 0;

    virtual antlrcpp::Any visitIntegerLiteral(PlayScriptParser::IntegerLiteralContext *context) = 0;

    virtual antlrcpp::Any visitFloatLiteral(PlayScriptParser::FloatLiteralContext *context) = 0;

    virtual antlrcpp::Any visitProg(PlayScriptParser::ProgContext *context) = 0;

    virtual antlrcpp::Any visitBlock(PlayScriptParser::BlockContext *context) = 0;

    virtual antlrcpp::Any visitBlockStatements(PlayScriptParser::BlockStatementsContext *context) = 0;

    virtual antlrcpp::Any visitBlockStatement(PlayScriptParser::BlockStatementContext *context) = 0;

    virtual antlrcpp::Any visitStatement(PlayScriptParser::StatementContext *context) = 0;

    virtual antlrcpp::Any visitSwitchBlockStatementGroup(PlayScriptParser::SwitchBlockStatementGroupContext *context) = 0;

    virtual antlrcpp::Any visitSwitchLabel(PlayScriptParser::SwitchLabelContext *context) = 0;

    virtual antlrcpp::Any visitForControl(PlayScriptParser::ForControlContext *context) = 0;

    virtual antlrcpp::Any visitForInit(PlayScriptParser::ForInitContext *context) = 0;

    virtual antlrcpp::Any visitEnhancedForControl(PlayScriptParser::EnhancedForControlContext *context) = 0;

    virtual antlrcpp::Any visitParExpression(PlayScriptParser::ParExpressionContext *context) = 0;

    virtual antlrcpp::Any visitExpressionList(PlayScriptParser::ExpressionListContext *context) = 0;

    virtual antlrcpp::Any visitFunctionCall(PlayScriptParser::FunctionCallContext *context) = 0;

    virtual antlrcpp::Any visitExpression(PlayScriptParser::ExpressionContext *context) = 0;

    virtual antlrcpp::Any visitPrimary(PlayScriptParser::PrimaryContext *context) = 0;

    virtual antlrcpp::Any visitTypeList(PlayScriptParser::TypeListContext *context) = 0;

    virtual antlrcpp::Any visitTypeType(PlayScriptParser::TypeTypeContext *context) = 0;

    virtual antlrcpp::Any visitFunctionType(PlayScriptParser::FunctionTypeContext *context) = 0;

    virtual antlrcpp::Any visitPrimitiveType(PlayScriptParser::PrimitiveTypeContext *context) = 0;

    virtual antlrcpp::Any visitCreator(PlayScriptParser::CreatorContext *context) = 0;

    virtual antlrcpp::Any visitSuperSuffix(PlayScriptParser::SuperSuffixContext *context) = 0;

    virtual antlrcpp::Any visitArguments(PlayScriptParser::ArgumentsContext *context) = 0;


};

}  // namespace play
