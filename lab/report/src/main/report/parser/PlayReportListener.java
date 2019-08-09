// Generated from PlayReport.g4 by ANTLR 4.7.2
package report.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayReportParser}.
 */
public interface PlayReportListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#bracedExpression}.
	 * @param ctx the parse tree
	 */
	void enterBracedExpression(PlayReportParser.BracedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#bracedExpression}.
	 * @param ctx the parse tree
	 */
	void exitBracedExpression(PlayReportParser.BracedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlayReportParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlayReportParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(PlayReportParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(PlayReportParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(PlayReportParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(PlayReportParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PlayReportParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PlayReportParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PlayReportParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PlayReportParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(PlayReportParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(PlayReportParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayReportParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(PlayReportParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayReportParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(PlayReportParser.FloatLiteralContext ctx);
}