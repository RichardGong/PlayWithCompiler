// Generated from PlayScript.g4 by ANTLR 4.7.2

package antlrtest;

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
	 * Visit a parse tree produced by {@link PlayScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PlayScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PlayScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PlayScriptParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(PlayScriptParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PlayScriptParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(PlayScriptParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlayScriptParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(PlayScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(PlayScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(PlayScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(PlayScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(PlayScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(PlayScriptParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(PlayScriptParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(PlayScriptParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScriptParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(PlayScriptParser.BlockItemContext ctx);
}