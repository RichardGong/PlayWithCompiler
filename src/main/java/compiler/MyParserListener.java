// Generated from MyParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyParserParser}.
 */
public interface MyParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MyParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MyParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(MyParserParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(MyParserParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MyParserParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MyParserParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(MyParserParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(MyParserParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MyParserParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MyParserParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(MyParserParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(MyParserParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MyParserParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MyParserParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MyParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MyParserParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(MyParserParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(MyParserParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(MyParserParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(MyParserParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MyParserParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MyParserParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(MyParserParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(MyParserParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyParserParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(MyParserParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyParserParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(MyParserParser.BlockItemContext ctx);
}