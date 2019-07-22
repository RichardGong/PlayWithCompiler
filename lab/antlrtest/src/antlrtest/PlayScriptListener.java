// Generated from PlayScript.g4 by ANTLR 4.7.2

package antlrtest;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayScriptParser}.
 */
public interface PlayScriptListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link PlayScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(PlayScriptParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(PlayScriptParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PlayScriptParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PlayScriptParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(PlayScriptParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(PlayScriptParser.InitializerContext ctx);
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
	 * Enter a parse tree produced by {@link PlayScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(PlayScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(PlayScriptParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(PlayScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(PlayScriptParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(PlayScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(PlayScriptParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(PlayScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(PlayScriptParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(PlayScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(PlayScriptParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(PlayScriptParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(PlayScriptParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PlayScriptParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PlayScriptParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(PlayScriptParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(PlayScriptParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayScriptParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(PlayScriptParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayScriptParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(PlayScriptParser.BlockItemContext ctx);
}