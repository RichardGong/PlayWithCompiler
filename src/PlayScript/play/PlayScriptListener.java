// Generated from PlayScript.g4 by ANTLR 4.7.2

package play;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayScriptParser}.
 */
public interface PlayScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(PlayScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(PlayScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(PlayScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(PlayScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(PlayScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(PlayScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(PlayScriptParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(PlayScriptParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(PlayScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(PlayScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(PlayScriptParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(PlayScriptParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(PlayScriptParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(PlayScriptParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(PlayScriptParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(PlayScriptParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(PlayScriptParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(PlayScriptParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(PlayScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(PlayScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(PlayScriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(PlayScriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(PlayScriptParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(PlayScriptParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(PlayScriptParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(PlayScriptParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(PlayScriptParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(PlayScriptParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(PlayScriptParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(PlayScriptParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(PlayScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(PlayScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(PlayScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(PlayScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(PlayScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(PlayScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(PlayScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(PlayScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(PlayScriptParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(PlayScriptParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(PlayScriptParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(PlayScriptParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(PlayScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(PlayScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(PlayScriptParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(PlayScriptParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(PlayScriptParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(PlayScriptParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(PlayScriptParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(PlayScriptParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PlayScriptParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PlayScriptParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PlayScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PlayScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(PlayScriptParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(PlayScriptParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(PlayScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(PlayScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlayScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlayScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(PlayScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(PlayScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(PlayScriptParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(PlayScriptParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(PlayScriptParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(PlayScriptParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(PlayScriptParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(PlayScriptParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(PlayScriptParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(PlayScriptParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(PlayScriptParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(PlayScriptParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PlayScriptParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PlayScriptParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PlayScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PlayScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PlayScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PlayScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(PlayScriptParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(PlayScriptParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(PlayScriptParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(PlayScriptParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(PlayScriptParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(PlayScriptParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(PlayScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(PlayScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(PlayScriptParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(PlayScriptParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(PlayScriptParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(PlayScriptParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(PlayScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(PlayScriptParser.ArgumentsContext ctx);
}