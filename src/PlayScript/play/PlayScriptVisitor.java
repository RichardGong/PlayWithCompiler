// Generated from PlayScript.g4 by ANTLR 4.7.2

package play;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(PlayScriptParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(PlayScriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(PlayScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(PlayScriptParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(PlayScriptParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(PlayScriptParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(PlayScriptParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(PlayScriptParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(PlayScriptParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PlayScriptParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(PlayScriptParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(PlayScriptParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(PlayScriptParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(PlayScriptParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(PlayScriptParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(PlayScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(PlayScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(PlayScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(PlayScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(PlayScriptParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(PlayScriptParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(PlayScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(PlayScriptParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(PlayScriptParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(PlayScriptParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(PlayScriptParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PlayScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(PlayScriptParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(PlayScriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PlayScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(PlayScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(PlayScriptParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(PlayScriptParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(PlayScriptParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(PlayScriptParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(PlayScriptParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PlayScriptParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PlayScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PlayScriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(PlayScriptParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(PlayScriptParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(PlayScriptParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PlayScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(PlayScriptParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(PlayScriptParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PlayScriptParser.ArgumentsContext ctx);
}