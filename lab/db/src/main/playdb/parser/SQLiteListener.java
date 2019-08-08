// Generated from SQLite.g4 by ANTLR 4.7.2
package playdb.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLiteParser}.
 */
public interface SQLiteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLiteParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLiteParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLiteParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLiteParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLiteParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLiteParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLiteParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(SQLiteParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(SQLiteParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(SQLiteParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(SQLiteParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(SQLiteParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(SQLiteParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(SQLiteParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(SQLiteParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(SQLiteParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(SQLiteParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(SQLiteParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(SQLiteParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(SQLiteParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(SQLiteParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(SQLiteParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(SQLiteParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLiteParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLiteParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(SQLiteParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(SQLiteParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(SQLiteParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(SQLiteParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(SQLiteParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(SQLiteParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(SQLiteParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(SQLiteParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(SQLiteParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(SQLiteParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLiteParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLiteParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(SQLiteParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(SQLiteParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(SQLiteParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(SQLiteParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(SQLiteParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(SQLiteParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(SQLiteParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(SQLiteParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(SQLiteParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(SQLiteParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLiteParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLiteParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLiteParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLiteParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLiteParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(SQLiteParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(SQLiteParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(SQLiteParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(SQLiteParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLiteParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLiteParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLiteParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLiteParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLiteParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(SQLiteParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(SQLiteParser.Conflict_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLiteParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLiteParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(SQLiteParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(SQLiteParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLiteParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLiteParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLiteParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLiteParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(SQLiteParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(SQLiteParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLiteParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLiteParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLiteParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLiteParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLiteParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLiteParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLiteParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLiteParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLiteParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLiteParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLiteParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(SQLiteParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(SQLiteParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLiteParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLiteParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLiteParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLiteParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLiteParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLiteParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLiteParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLiteParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLiteParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLiteParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLiteParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLiteParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLiteParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLiteParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLiteParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLiteParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLiteParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLiteParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLiteParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLiteParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLiteParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLiteParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLiteParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLiteParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLiteParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLiteParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLiteParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLiteParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLiteParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLiteParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLiteParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLiteParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLiteParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLiteParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLiteParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLiteParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLiteParser.Any_nameContext ctx);
}