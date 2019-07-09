// Generated from PlayScript.g4 by ANTLR 4.7.2

package script2;

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
	 * Visit a parse tree produced by {@link PlayScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PlayScriptParser.BlockContext ctx);
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
	 * Visit a parse tree produced by {@link PlayScriptParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(PlayScriptParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PlayScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(PlayScriptParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(PlayScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PlayScriptParser.ArgumentsContext ctx);
}