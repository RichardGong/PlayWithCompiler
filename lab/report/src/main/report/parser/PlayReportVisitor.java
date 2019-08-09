// Generated from PlayReport.g4 by ANTLR 4.7.2
package report.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayReportParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayReportVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#bracedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracedExpression(PlayReportParser.BracedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlayReportParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PlayReportParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PlayReportParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PlayReportParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PlayReportParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(PlayReportParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayReportParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(PlayReportParser.FloatLiteralContext ctx);
}