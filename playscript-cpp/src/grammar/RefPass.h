#pragma once

#include "antlr4-runtime.h"
#include "ParserRuleContext.h"
#include "PlayScriptBaseListener.h"
#include "Scope.h"

namespace play
{

class RefPass : public PlayScriptBaseListener
{
public:
    void enterClassDeclaration(PlayScriptParser::ClassDeclarationContext * /*ctx*/) override {}
    void exitClassDeclaration(PlayScriptParser::ClassDeclarationContext * /*ctx*/) override {}

    void enterClassBody(PlayScriptParser::ClassBodyContext * /*ctx*/) override {}
    void exitClassBody(PlayScriptParser::ClassBodyContext * /*ctx*/) override {}

    void enterClassBodyDeclaration(PlayScriptParser::ClassBodyDeclarationContext * /*ctx*/) override {}
    void exitClassBodyDeclaration(PlayScriptParser::ClassBodyDeclarationContext * /*ctx*/) override {}

    void enterMemberDeclaration(PlayScriptParser::MemberDeclarationContext * /*ctx*/) override {}
    void exitMemberDeclaration(PlayScriptParser::MemberDeclarationContext * /*ctx*/) override {}

    void enterFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext * /*ctx*/) override {}
    void exitFunctionDeclaration(PlayScriptParser::FunctionDeclarationContext * /*ctx*/) override {}

    void enterFunctionBody(PlayScriptParser::FunctionBodyContext * /*ctx*/) override {}
    void exitFunctionBody(PlayScriptParser::FunctionBodyContext * /*ctx*/) override {}

    void enterTypeTypeOrVoid(PlayScriptParser::TypeTypeOrVoidContext * /*ctx*/) override {}
    void exitTypeTypeOrVoid(PlayScriptParser::TypeTypeOrVoidContext * /*ctx*/) override {}

    void enterQualifiedNameList(PlayScriptParser::QualifiedNameListContext * /*ctx*/) override {}
    void exitQualifiedNameList(PlayScriptParser::QualifiedNameListContext * /*ctx*/) override {}

    void enterFormalParameters(PlayScriptParser::FormalParametersContext * /*ctx*/) override {}
    void exitFormalParameters(PlayScriptParser::FormalParametersContext * /*ctx*/) override {}

    void enterFormalParameterList(PlayScriptParser::FormalParameterListContext * /*ctx*/) override {}
    void exitFormalParameterList(PlayScriptParser::FormalParameterListContext * /*ctx*/) override {}

    void enterFormalParameter(PlayScriptParser::FormalParameterContext * /*ctx*/) override {}
    void exitFormalParameter(PlayScriptParser::FormalParameterContext * /*ctx*/) override {}

    void enterLastFormalParameter(PlayScriptParser::LastFormalParameterContext * /*ctx*/) override {}
    void exitLastFormalParameter(PlayScriptParser::LastFormalParameterContext * /*ctx*/) override {}

    void enterVariableModifier(PlayScriptParser::VariableModifierContext * /*ctx*/) override {}
    void exitVariableModifier(PlayScriptParser::VariableModifierContext * /*ctx*/) override {}

    void enterQualifiedName(PlayScriptParser::QualifiedNameContext * /*ctx*/) override {}
    void exitQualifiedName(PlayScriptParser::QualifiedNameContext * /*ctx*/) override {}

    void enterFieldDeclaration(PlayScriptParser::FieldDeclarationContext * /*ctx*/) override {}
    void exitFieldDeclaration(PlayScriptParser::FieldDeclarationContext * /*ctx*/) override {}

    void enterConstructorDeclaration(PlayScriptParser::ConstructorDeclarationContext * /*ctx*/) override {}
    void exitConstructorDeclaration(PlayScriptParser::ConstructorDeclarationContext * /*ctx*/) override {}

    void enterVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext * /*ctx*/) override {}
    void exitVariableDeclarators(PlayScriptParser::VariableDeclaratorsContext * /*ctx*/) override {}

    void enterVariableDeclarator(PlayScriptParser::VariableDeclaratorContext * /*ctx*/) override {}
    void exitVariableDeclarator(PlayScriptParser::VariableDeclaratorContext * /*ctx*/) override {}

    void enterVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext * /*ctx*/) override {}
    void exitVariableDeclaratorId(PlayScriptParser::VariableDeclaratorIdContext * /*ctx*/) override {}

    void enterVariableInitializer(PlayScriptParser::VariableInitializerContext * /*ctx*/) override {}
    void exitVariableInitializer(PlayScriptParser::VariableInitializerContext * /*ctx*/) override {}

    void enterArrayInitializer(PlayScriptParser::ArrayInitializerContext * /*ctx*/) override {}
    void exitArrayInitializer(PlayScriptParser::ArrayInitializerContext * /*ctx*/) override {}

    void enterClassOrInterfaceType(PlayScriptParser::ClassOrInterfaceTypeContext * /*ctx*/) override {}
    void exitClassOrInterfaceType(PlayScriptParser::ClassOrInterfaceTypeContext * /*ctx*/) override {}

    void enterTypeArgument(PlayScriptParser::TypeArgumentContext * /*ctx*/) override {}
    void exitTypeArgument(PlayScriptParser::TypeArgumentContext * /*ctx*/) override {}

    void enterLiteral(PlayScriptParser::LiteralContext * /*ctx*/) override {}
    void exitLiteral(PlayScriptParser::LiteralContext * /*ctx*/) override {}

    void enterIntegerLiteral(PlayScriptParser::IntegerLiteralContext * /*ctx*/) override {}
    void exitIntegerLiteral(PlayScriptParser::IntegerLiteralContext * /*ctx*/) override {}

    void enterFloatLiteral(PlayScriptParser::FloatLiteralContext * /*ctx*/) override {}
    void exitFloatLiteral(PlayScriptParser::FloatLiteralContext * /*ctx*/) override {}

    void enterProg(PlayScriptParser::ProgContext * /*ctx*/) override {}
    void exitProg(PlayScriptParser::ProgContext * /*ctx*/) override {}

    void enterBlock(PlayScriptParser::BlockContext * /*ctx*/) override {}
    void exitBlock(PlayScriptParser::BlockContext * /*ctx*/) override {}

    void enterBlockStatements(PlayScriptParser::BlockStatementsContext * /*ctx*/) override {}
    void exitBlockStatements(PlayScriptParser::BlockStatementsContext * /*ctx*/) override {}

    void enterBlockStatement(PlayScriptParser::BlockStatementContext * /*ctx*/) override {}
    void exitBlockStatement(PlayScriptParser::BlockStatementContext * /*ctx*/) override {}

    void enterStatement(PlayScriptParser::StatementContext * /*ctx*/) override {}
    void exitStatement(PlayScriptParser::StatementContext * /*ctx*/) override {}

    void enterSwitchBlockStatementGroup(PlayScriptParser::SwitchBlockStatementGroupContext * /*ctx*/) override {}
    void exitSwitchBlockStatementGroup(PlayScriptParser::SwitchBlockStatementGroupContext * /*ctx*/) override {}

    void enterSwitchLabel(PlayScriptParser::SwitchLabelContext * /*ctx*/) override {}
    void exitSwitchLabel(PlayScriptParser::SwitchLabelContext * /*ctx*/) override {}

    void enterForControl(PlayScriptParser::ForControlContext * /*ctx*/) override {}
    void exitForControl(PlayScriptParser::ForControlContext * /*ctx*/) override {}

    void enterForInit(PlayScriptParser::ForInitContext * /*ctx*/) override {}
    void exitForInit(PlayScriptParser::ForInitContext * /*ctx*/) override {}

    void enterEnhancedForControl(PlayScriptParser::EnhancedForControlContext * /*ctx*/) override {}
    void exitEnhancedForControl(PlayScriptParser::EnhancedForControlContext * /*ctx*/) override {}

    void enterParExpression(PlayScriptParser::ParExpressionContext * /*ctx*/) override {}
    void exitParExpression(PlayScriptParser::ParExpressionContext * /*ctx*/) override {}

    void enterExpressionList(PlayScriptParser::ExpressionListContext * /*ctx*/) override {}
    void exitExpressionList(PlayScriptParser::ExpressionListContext * /*ctx*/) override {}

    void enterFunctionCall(PlayScriptParser::FunctionCallContext * /*ctx*/) override {}
    void exitFunctionCall(PlayScriptParser::FunctionCallContext * /*ctx*/) override {}

    void enterExpression(PlayScriptParser::ExpressionContext * /*ctx*/) override {}
    void exitExpression(PlayScriptParser::ExpressionContext * /*ctx*/) override {}

    void enterPrimary(PlayScriptParser::PrimaryContext * /*ctx*/) override {}
    void exitPrimary(PlayScriptParser::PrimaryContext * /*ctx*/) override {}

    void enterTypeList(PlayScriptParser::TypeListContext * /*ctx*/) override {}
    void exitTypeList(PlayScriptParser::TypeListContext * /*ctx*/) override {}

    void enterTypeType(PlayScriptParser::TypeTypeContext * /*ctx*/) override {}
    void exitTypeType(PlayScriptParser::TypeTypeContext * /*ctx*/) override {}

    void enterFunctionType(PlayScriptParser::FunctionTypeContext * /*ctx*/) override {}
    void exitFunctionType(PlayScriptParser::FunctionTypeContext * /*ctx*/) override {}

    void enterPrimitiveType(PlayScriptParser::PrimitiveTypeContext * /*ctx*/) override {}
    void exitPrimitiveType(PlayScriptParser::PrimitiveTypeContext * /*ctx*/) override {}

    void enterCreator(PlayScriptParser::CreatorContext * /*ctx*/) override {}
    void exitCreator(PlayScriptParser::CreatorContext * /*ctx*/) override {}

    void enterSuperSuffix(PlayScriptParser::SuperSuffixContext * /*ctx*/) override {}
    void exitSuperSuffix(PlayScriptParser::SuperSuffixContext * /*ctx*/) override {}

    void enterArguments(PlayScriptParser::ArgumentsContext * /*ctx*/) override {}
    void exitArguments(PlayScriptParser::ArgumentsContext * /*ctx*/) override {}

private:
    Scope& pushScope(Scope& scope, antlr4::ParserRuleContext& ctx);
};

} // namespace play