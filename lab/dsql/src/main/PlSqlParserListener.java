// Generated from PlSqlParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlSqlParser}.
 */
public interface PlSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(PlSqlParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(PlSqlParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void enterUnit_statement(PlSqlParser.Unit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unit_statement}.
	 * @param ctx the parse tree
	 */
	void exitUnit_statement(PlSqlParser.Unit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void enterResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 */
	void exitResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void enterRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 */
	void exitRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void enterStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 */
	void exitStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void enterDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 */
	void exitDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void enterAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 */
	void exitAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body(PlSqlParser.Create_package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body(PlSqlParser.Create_package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void enterFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 */
	void exitFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(PlSqlParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(PlSqlParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_body(PlSqlParser.Procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_body(PlSqlParser.Procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void enterFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 */
	void exitFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void enterTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 */
	void exitTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void enterNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 */
	void exitNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void enterReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 */
	void exitReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void enterDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 */
	void exitDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void enterDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 */
	void exitDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void enterObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 */
	void exitObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void enterType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 */
	void exitType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void enterType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 */
	void exitType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void enterFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 */
	void exitFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void enterModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 */
	void exitModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void enterObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 */
	void exitObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void enterSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 */
	void exitSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void enterElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 */
	void exitElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#overriding_subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void enterOverriding_subprogram_spec(PlSqlParser.Overriding_subprogram_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#overriding_subprogram_spec}.
	 * @param ctx the parse tree
	 */
	void exitOverriding_subprogram_spec(PlSqlParser.Overriding_subprogram_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#overriding_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterOverriding_function_spec(PlSqlParser.Overriding_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#overriding_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitOverriding_function_spec(PlSqlParser.Overriding_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void enterMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 */
	void exitMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void enterPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 */
	void exitPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void enterPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 */
	void exitPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void enterType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 */
	void exitType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_session}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session(PlSqlParser.Alter_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_session}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session(PlSqlParser.Alter_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_session_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session_set_clause(PlSqlParser.Alter_session_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_session_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session_set_clause(PlSqlParser.Alter_session_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void enterSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 */
	void exitSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void enterSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 */
	void exitSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(PlSqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(PlSqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterCluster_index_clause(PlSqlParser.Cluster_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitCluster_index_clause(PlSqlParser.Cluster_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cluster_name}.
	 * @param ctx the parse tree
	 */
	void enterCluster_name(PlSqlParser.Cluster_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cluster_name}.
	 * @param ctx the parse tree
	 */
	void exitCluster_name(PlSqlParser.Cluster_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterTable_index_clause(PlSqlParser.Table_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitTable_index_clause(PlSqlParser.Table_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterBitmap_join_index_clause(PlSqlParser.Bitmap_join_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitBitmap_join_index_clause(PlSqlParser.Bitmap_join_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex_expr(PlSqlParser.Index_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex_expr(PlSqlParser.Index_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_properties}.
	 * @param ctx the parse tree
	 */
	void enterIndex_properties(PlSqlParser.Index_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_properties}.
	 * @param ctx the parse tree
	 */
	void exitIndex_properties(PlSqlParser.Index_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterDomain_index_clause(PlSqlParser.Domain_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitDomain_index_clause(PlSqlParser.Domain_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterLocal_domain_index_clause(PlSqlParser.Local_domain_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitLocal_domain_index_clause(PlSqlParser.Local_domain_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlindex_clause}.
	 * @param ctx the parse tree
	 */
	void enterXmlindex_clause(PlSqlParser.Xmlindex_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlindex_clause}.
	 * @param ctx the parse tree
	 */
	void exitXmlindex_clause(PlSqlParser.Xmlindex_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#local_xmlindex_clause}.
	 * @param ctx the parse tree
	 */
	void enterLocal_xmlindex_clause(PlSqlParser.Local_xmlindex_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#local_xmlindex_clause}.
	 * @param ctx the parse tree
	 */
	void exitLocal_xmlindex_clause(PlSqlParser.Local_xmlindex_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_partitioned_index(PlSqlParser.Global_partitioned_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_partitioned_index(PlSqlParser.Global_partitioned_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_partitioning_clause(PlSqlParser.Index_partitioning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_partitioning_clause(PlSqlParser.Index_partitioning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void enterLocal_partitioned_index(PlSqlParser.Local_partitioned_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 */
	void exitLocal_partitioned_index(PlSqlParser.Local_partitioned_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_range_partitioned_table(PlSqlParser.On_range_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_range_partitioned_table(PlSqlParser.On_range_partitioned_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_list_partitioned_table(PlSqlParser.On_list_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_list_partitioned_table(PlSqlParser.On_list_partitioned_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_hash_partitioned_table(PlSqlParser.On_hash_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_hash_partitioned_table(PlSqlParser.On_hash_partitioned_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void enterOn_comp_partitioned_table(PlSqlParser.On_comp_partitioned_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 */
	void exitOn_comp_partitioned_table(PlSqlParser.On_comp_partitioned_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_subpartition_clause(PlSqlParser.Index_subpartition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_subpartition_clause(PlSqlParser.Index_subpartition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#odci_parameters}.
	 * @param ctx the parse tree
	 */
	void enterOdci_parameters(PlSqlParser.Odci_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#odci_parameters}.
	 * @param ctx the parse tree
	 */
	void exitOdci_parameters(PlSqlParser.Odci_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#indextype}.
	 * @param ctx the parse tree
	 */
	void enterIndextype(PlSqlParser.IndextypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#indextype}.
	 * @param ctx the parse tree
	 */
	void exitIndextype(PlSqlParser.IndextypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index(PlSqlParser.Alter_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index(PlSqlParser.Alter_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_index_ops_set1}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_ops_set1(PlSqlParser.Alter_index_ops_set1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_index_ops_set1}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_ops_set1(PlSqlParser.Alter_index_ops_set1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_index_ops_set2}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_ops_set2(PlSqlParser.Alter_index_ops_set2Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_index_ops_set2}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_ops_set2(PlSqlParser.Alter_index_ops_set2Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#visible_or_invisible}.
	 * @param ctx the parse tree
	 */
	void enterVisible_or_invisible(PlSqlParser.Visible_or_invisibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#visible_or_invisible}.
	 * @param ctx the parse tree
	 */
	void exitVisible_or_invisible(PlSqlParser.Visible_or_invisibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#monitoring_nomonitoring}.
	 * @param ctx the parse tree
	 */
	void enterMonitoring_nomonitoring(PlSqlParser.Monitoring_nomonitoringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#monitoring_nomonitoring}.
	 * @param ctx the parse tree
	 */
	void exitMonitoring_nomonitoring(PlSqlParser.Monitoring_nomonitoringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rebuild_clause}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_clause(PlSqlParser.Rebuild_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rebuild_clause}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_clause(PlSqlParser.Rebuild_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_index_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_partitioning(PlSqlParser.Alter_index_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_index_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_partitioning(PlSqlParser.Alter_index_partitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_index_default_attrs}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_default_attrs(PlSqlParser.Modify_index_default_attrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_index_default_attrs}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_default_attrs(PlSqlParser.Modify_index_default_attrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_hash_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterAdd_hash_index_partition(PlSqlParser.Add_hash_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_hash_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitAdd_hash_index_partition(PlSqlParser.Add_hash_index_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#coalesce_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterCoalesce_index_partition(PlSqlParser.Coalesce_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#coalesce_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitCoalesce_index_partition(PlSqlParser.Coalesce_index_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_partition(PlSqlParser.Modify_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_partition(PlSqlParser.Modify_index_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_index_partitions_ops}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_partitions_ops(PlSqlParser.Modify_index_partitions_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_index_partitions_ops}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_partitions_ops(PlSqlParser.Modify_index_partitions_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rename_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterRename_index_partition(PlSqlParser.Rename_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rename_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitRename_index_partition(PlSqlParser.Rename_index_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_partition(PlSqlParser.Drop_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_partition(PlSqlParser.Drop_index_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#split_index_partition}.
	 * @param ctx the parse tree
	 */
	void enterSplit_index_partition(PlSqlParser.Split_index_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#split_index_partition}.
	 * @param ctx the parse tree
	 */
	void exitSplit_index_partition(PlSqlParser.Split_index_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_partition_description}.
	 * @param ctx the parse tree
	 */
	void enterIndex_partition_description(PlSqlParser.Index_partition_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_partition_description}.
	 * @param ctx the parse tree
	 */
	void exitIndex_partition_description(PlSqlParser.Index_partition_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_index_subpartition}.
	 * @param ctx the parse tree
	 */
	void enterModify_index_subpartition(PlSqlParser.Modify_index_subpartitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_index_subpartition}.
	 * @param ctx the parse tree
	 */
	void exitModify_index_subpartition(PlSqlParser.Modify_index_subpartitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_name_old}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name_old(PlSqlParser.Partition_name_oldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_name_old}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name_old(PlSqlParser.Partition_name_oldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_partition_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_partition_name(PlSqlParser.New_partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_partition_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_partition_name(PlSqlParser.New_partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_index_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_index_name(PlSqlParser.New_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_index_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_index_name(PlSqlParser.New_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(PlSqlParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(PlSqlParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(PlSqlParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(PlSqlParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_identified_by}.
	 * @param ctx the parse tree
	 */
	void enterAlter_identified_by(PlSqlParser.Alter_identified_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_identified_by}.
	 * @param ctx the parse tree
	 */
	void exitAlter_identified_by(PlSqlParser.Alter_identified_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#identified_by}.
	 * @param ctx the parse tree
	 */
	void enterIdentified_by(PlSqlParser.Identified_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#identified_by}.
	 * @param ctx the parse tree
	 */
	void exitIdentified_by(PlSqlParser.Identified_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#identified_other_clause}.
	 * @param ctx the parse tree
	 */
	void enterIdentified_other_clause(PlSqlParser.Identified_other_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#identified_other_clause}.
	 * @param ctx the parse tree
	 */
	void exitIdentified_other_clause(PlSqlParser.Identified_other_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_tablespace_clause(PlSqlParser.User_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_tablespace_clause(PlSqlParser.User_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quota_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuota_clause(PlSqlParser.Quota_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quota_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuota_clause(PlSqlParser.Quota_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#profile_clause}.
	 * @param ctx the parse tree
	 */
	void enterProfile_clause(PlSqlParser.Profile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#profile_clause}.
	 * @param ctx the parse tree
	 */
	void exitProfile_clause(PlSqlParser.Profile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#role_clause}.
	 * @param ctx the parse tree
	 */
	void enterRole_clause(PlSqlParser.Role_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#role_clause}.
	 * @param ctx the parse tree
	 */
	void exitRole_clause(PlSqlParser.Role_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_default_role_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_default_role_clause(PlSqlParser.User_default_role_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_default_role_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_default_role_clause(PlSqlParser.User_default_role_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#password_expire_clause}.
	 * @param ctx the parse tree
	 */
	void enterPassword_expire_clause(PlSqlParser.Password_expire_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#password_expire_clause}.
	 * @param ctx the parse tree
	 */
	void exitPassword_expire_clause(PlSqlParser.Password_expire_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_lock_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_lock_clause(PlSqlParser.User_lock_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_lock_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_lock_clause(PlSqlParser.User_lock_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void enterUser_editions_clause(PlSqlParser.User_editions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void exitUser_editions_clause(PlSqlParser.User_editions_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_editions_clause(PlSqlParser.Alter_user_editions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_user_editions_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_editions_clause(PlSqlParser.Alter_user_editions_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#proxy_clause}.
	 * @param ctx the parse tree
	 */
	void enterProxy_clause(PlSqlParser.Proxy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#proxy_clause}.
	 * @param ctx the parse tree
	 */
	void exitProxy_clause(PlSqlParser.Proxy_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_names}.
	 * @param ctx the parse tree
	 */
	void enterContainer_names(PlSqlParser.Container_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_names}.
	 * @param ctx the parse tree
	 */
	void exitContainer_names(PlSqlParser.Container_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_container_data}.
	 * @param ctx the parse tree
	 */
	void enterSet_container_data(PlSqlParser.Set_container_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_container_data}.
	 * @param ctx the parse tree
	 */
	void exitSet_container_data(PlSqlParser.Set_container_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_rem_container_data}.
	 * @param ctx the parse tree
	 */
	void enterAdd_rem_container_data(PlSqlParser.Add_rem_container_dataContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_rem_container_data}.
	 * @param ctx the parse tree
	 */
	void exitAdd_rem_container_data(PlSqlParser.Add_rem_container_dataContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_data_clause}.
	 * @param ctx the parse tree
	 */
	void enterContainer_data_clause(PlSqlParser.Container_data_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_data_clause}.
	 * @param ctx the parse tree
	 */
	void exitContainer_data_clause(PlSqlParser.Container_data_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#analyze}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(PlSqlParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#analyze}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(PlSqlParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_extention_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extention_clause(PlSqlParser.Partition_extention_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_extention_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extention_clause(PlSqlParser.Partition_extention_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#validation_clauses}.
	 * @param ctx the parse tree
	 */
	void enterValidation_clauses(PlSqlParser.Validation_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#validation_clauses}.
	 * @param ctx the parse tree
	 */
	void exitValidation_clauses(PlSqlParser.Validation_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#online_or_offline}.
	 * @param ctx the parse tree
	 */
	void enterOnline_or_offline(PlSqlParser.Online_or_offlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#online_or_offline}.
	 * @param ctx the parse tree
	 */
	void exitOnline_or_offline(PlSqlParser.Online_or_offlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#into_clause1}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause1(PlSqlParser.Into_clause1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#into_clause1}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause1(PlSqlParser.Into_clause1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterPartition_key_value(PlSqlParser.Partition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitPartition_key_value(PlSqlParser.Partition_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_key_value(PlSqlParser.Subpartition_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_key_value(PlSqlParser.Subpartition_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#associate_statistics}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_statistics(PlSqlParser.Associate_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#associate_statistics}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_statistics(PlSqlParser.Associate_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_association}.
	 * @param ctx the parse tree
	 */
	void enterColumn_association(PlSqlParser.Column_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_association}.
	 * @param ctx the parse tree
	 */
	void exitColumn_association(PlSqlParser.Column_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_association}.
	 * @param ctx the parse tree
	 */
	void enterFunction_association(PlSqlParser.Function_associationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_association}.
	 * @param ctx the parse tree
	 */
	void exitFunction_association(PlSqlParser.Function_associationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#indextype_name}.
	 * @param ctx the parse tree
	 */
	void enterIndextype_name(PlSqlParser.Indextype_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#indextype_name}.
	 * @param ctx the parse tree
	 */
	void exitIndextype_name(PlSqlParser.Indextype_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_statistics_type}.
	 * @param ctx the parse tree
	 */
	void enterUsing_statistics_type(PlSqlParser.Using_statistics_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_statistics_type}.
	 * @param ctx the parse tree
	 */
	void exitUsing_statistics_type(PlSqlParser.Using_statistics_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#statistics_type_name}.
	 * @param ctx the parse tree
	 */
	void enterStatistics_type_name(PlSqlParser.Statistics_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#statistics_type_name}.
	 * @param ctx the parse tree
	 */
	void exitStatistics_type_name(PlSqlParser.Statistics_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_cost_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_cost_clause(PlSqlParser.Default_cost_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_cost_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_cost_clause(PlSqlParser.Default_cost_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cpu_cost}.
	 * @param ctx the parse tree
	 */
	void enterCpu_cost(PlSqlParser.Cpu_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cpu_cost}.
	 * @param ctx the parse tree
	 */
	void exitCpu_cost(PlSqlParser.Cpu_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#io_cost}.
	 * @param ctx the parse tree
	 */
	void enterIo_cost(PlSqlParser.Io_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#io_cost}.
	 * @param ctx the parse tree
	 */
	void exitIo_cost(PlSqlParser.Io_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#network_cost}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_cost(PlSqlParser.Network_costContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#network_cost}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_cost(PlSqlParser.Network_costContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_selectivity_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_selectivity_clause(PlSqlParser.Default_selectivity_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_selectivity_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_selectivity_clause(PlSqlParser.Default_selectivity_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_selectivity}.
	 * @param ctx the parse tree
	 */
	void enterDefault_selectivity(PlSqlParser.Default_selectivityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_selectivity}.
	 * @param ctx the parse tree
	 */
	void exitDefault_selectivity(PlSqlParser.Default_selectivityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#storage_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterStorage_table_clause(PlSqlParser.Storage_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#storage_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitStorage_table_clause(PlSqlParser.Storage_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unified_auditing}.
	 * @param ctx the parse tree
	 */
	void enterUnified_auditing(PlSqlParser.Unified_auditingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unified_auditing}.
	 * @param ctx the parse tree
	 */
	void exitUnified_auditing(PlSqlParser.Unified_auditingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#policy_name}.
	 * @param ctx the parse tree
	 */
	void enterPolicy_name(PlSqlParser.Policy_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#policy_name}.
	 * @param ctx the parse tree
	 */
	void exitPolicy_name(PlSqlParser.Policy_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#audit_traditional}.
	 * @param ctx the parse tree
	 */
	void enterAudit_traditional(PlSqlParser.Audit_traditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#audit_traditional}.
	 * @param ctx the parse tree
	 */
	void exitAudit_traditional(PlSqlParser.Audit_traditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#audit_direct_path}.
	 * @param ctx the parse tree
	 */
	void enterAudit_direct_path(PlSqlParser.Audit_direct_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#audit_direct_path}.
	 * @param ctx the parse tree
	 */
	void exitAudit_direct_path(PlSqlParser.Audit_direct_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#audit_container_clause}.
	 * @param ctx the parse tree
	 */
	void enterAudit_container_clause(PlSqlParser.Audit_container_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#audit_container_clause}.
	 * @param ctx the parse tree
	 */
	void exitAudit_container_clause(PlSqlParser.Audit_container_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#audit_operation_clause}.
	 * @param ctx the parse tree
	 */
	void enterAudit_operation_clause(PlSqlParser.Audit_operation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#audit_operation_clause}.
	 * @param ctx the parse tree
	 */
	void exitAudit_operation_clause(PlSqlParser.Audit_operation_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#auditing_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterAuditing_by_clause(PlSqlParser.Auditing_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#auditing_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitAuditing_by_clause(PlSqlParser.Auditing_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#audit_user}.
	 * @param ctx the parse tree
	 */
	void enterAudit_user(PlSqlParser.Audit_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#audit_user}.
	 * @param ctx the parse tree
	 */
	void exitAudit_user(PlSqlParser.Audit_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#audit_schema_object_clause}.
	 * @param ctx the parse tree
	 */
	void enterAudit_schema_object_clause(PlSqlParser.Audit_schema_object_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#audit_schema_object_clause}.
	 * @param ctx the parse tree
	 */
	void exitAudit_schema_object_clause(PlSqlParser.Audit_schema_object_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_operation}.
	 * @param ctx the parse tree
	 */
	void enterSql_operation(PlSqlParser.Sql_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_operation}.
	 * @param ctx the parse tree
	 */
	void exitSql_operation(PlSqlParser.Sql_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#auditing_on_clause}.
	 * @param ctx the parse tree
	 */
	void enterAuditing_on_clause(PlSqlParser.Auditing_on_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#auditing_on_clause}.
	 * @param ctx the parse tree
	 */
	void exitAuditing_on_clause(PlSqlParser.Auditing_on_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_name}.
	 * @param ctx the parse tree
	 */
	void enterModel_name(PlSqlParser.Model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_name}.
	 * @param ctx the parse tree
	 */
	void exitModel_name(PlSqlParser.Model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(PlSqlParser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(PlSqlParser.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#profile_name}.
	 * @param ctx the parse tree
	 */
	void enterProfile_name(PlSqlParser.Profile_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#profile_name}.
	 * @param ctx the parse tree
	 */
	void exitProfile_name(PlSqlParser.Profile_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_statement_shortcut}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement_shortcut(PlSqlParser.Sql_statement_shortcutContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_statement_shortcut}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement_shortcut(PlSqlParser.Sql_statement_shortcutContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(PlSqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(PlSqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grant_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_statement(PlSqlParser.Grant_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grant_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_statement(PlSqlParser.Grant_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_clause}.
	 * @param ctx the parse tree
	 */
	void enterContainer_clause(PlSqlParser.Container_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_clause}.
	 * @param ctx the parse tree
	 */
	void exitContainer_clause(PlSqlParser.Container_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_directory}.
	 * @param ctx the parse tree
	 */
	void enterCreate_directory(PlSqlParser.Create_directoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_directory}.
	 * @param ctx the parse tree
	 */
	void exitCreate_directory(PlSqlParser.Create_directoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_name(PlSqlParser.Directory_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#directory_name}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_name(PlSqlParser.Directory_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#directory_path}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_path(PlSqlParser.Directory_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#directory_path}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_path(PlSqlParser.Directory_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_library}.
	 * @param ctx the parse tree
	 */
	void enterAlter_library(PlSqlParser.Alter_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_library}.
	 * @param ctx the parse tree
	 */
	void exitAlter_library(PlSqlParser.Alter_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#library_editionable}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_editionable(PlSqlParser.Library_editionableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#library_editionable}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_editionable(PlSqlParser.Library_editionableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#library_debug}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_debug(PlSqlParser.Library_debugContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#library_debug}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_debug(PlSqlParser.Library_debugContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_value}.
	 * @param ctx the parse tree
	 */
	void enterParameter_value(PlSqlParser.Parameter_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_value}.
	 * @param ctx the parse tree
	 */
	void exitParameter_value(PlSqlParser.Parameter_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#library_name}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_name(PlSqlParser.Library_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#library_name}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_name(PlSqlParser.Library_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_view}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view(PlSqlParser.Alter_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_view}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view(PlSqlParser.Alter_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_view_editionable}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_editionable(PlSqlParser.Alter_view_editionableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_view_editionable}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_editionable(PlSqlParser.Alter_view_editionableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(PlSqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(PlSqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#view_options}.
	 * @param ctx the parse tree
	 */
	void enterView_options(PlSqlParser.View_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#view_options}.
	 * @param ctx the parse tree
	 */
	void exitView_options(PlSqlParser.View_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 */
	void enterView_alias_constraint(PlSqlParser.View_alias_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 */
	void exitView_alias_constraint(PlSqlParser.View_alias_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_view_clause}.
	 * @param ctx the parse tree
	 */
	void enterObject_view_clause(PlSqlParser.Object_view_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_view_clause}.
	 * @param ctx the parse tree
	 */
	void exitObject_view_clause(PlSqlParser.Object_view_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_constraint(PlSqlParser.Inline_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_constraint(PlSqlParser.Inline_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_ref_constraint(PlSqlParser.Inline_ref_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_ref_constraint(PlSqlParser.Inline_ref_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_ref_constraint(PlSqlParser.Out_of_line_ref_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_ref_constraint(PlSqlParser.Out_of_line_ref_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_constraint(PlSqlParser.Out_of_line_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_constraint(PlSqlParser.Out_of_line_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constraint_state}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_state(PlSqlParser.Constraint_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constraint_state}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_state(PlSqlParser.Constraint_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace(PlSqlParser.Alter_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace(PlSqlParser.Alter_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datafile_tempfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_tempfile_clauses(PlSqlParser.Datafile_tempfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datafile_tempfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_tempfile_clauses(PlSqlParser.Datafile_tempfile_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_logging_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_logging_clauses(PlSqlParser.Tablespace_logging_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_logging_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_logging_clauses(PlSqlParser.Tablespace_logging_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_group_clause(PlSqlParser.Tablespace_group_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_group_clause(PlSqlParser.Tablespace_group_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_group_name}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_group_name(PlSqlParser.Tablespace_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_group_name}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_group_name(PlSqlParser.Tablespace_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_state_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_state_clauses(PlSqlParser.Tablespace_state_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_state_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_state_clauses(PlSqlParser.Tablespace_state_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_mode_clause(PlSqlParser.Flashback_mode_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_mode_clause(PlSqlParser.Flashback_mode_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_tablespace_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_tablespace_name(PlSqlParser.New_tablespace_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_tablespace_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_tablespace_name(PlSqlParser.New_tablespace_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace(PlSqlParser.Create_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace(PlSqlParser.Create_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterPermanent_tablespace_clause(PlSqlParser.Permanent_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitPermanent_tablespace_clause(PlSqlParser.Permanent_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_encryption_spec}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_encryption_spec(PlSqlParser.Tablespace_encryption_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_encryption_spec}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_encryption_spec(PlSqlParser.Tablespace_encryption_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterLogging_clause(PlSqlParser.Logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitLogging_clause(PlSqlParser.Logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#extent_management_clause}.
	 * @param ctx the parse tree
	 */
	void enterExtent_management_clause(PlSqlParser.Extent_management_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#extent_management_clause}.
	 * @param ctx the parse tree
	 */
	void exitExtent_management_clause(PlSqlParser.Extent_management_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#segment_management_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegment_management_clause(PlSqlParser.Segment_management_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#segment_management_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegment_management_clause(PlSqlParser.Segment_management_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterTemporary_tablespace_clause(PlSqlParser.Temporary_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitTemporary_tablespace_clause(PlSqlParser.Temporary_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void enterUndo_tablespace_clause(PlSqlParser.Undo_tablespace_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 */
	void exitUndo_tablespace_clause(PlSqlParser.Undo_tablespace_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 */
	void enterTablespace_retention_clause(PlSqlParser.Tablespace_retention_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 */
	void exitTablespace_retention_clause(PlSqlParser.Tablespace_retention_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datafile_specification}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_specification(PlSqlParser.Datafile_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datafile_specification}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_specification(PlSqlParser.Datafile_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tempfile_specification}.
	 * @param ctx the parse tree
	 */
	void enterTempfile_specification(PlSqlParser.Tempfile_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tempfile_specification}.
	 * @param ctx the parse tree
	 */
	void exitTempfile_specification(PlSqlParser.Tempfile_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatafile_tempfile_spec(PlSqlParser.Datafile_tempfile_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatafile_tempfile_spec(PlSqlParser.Datafile_tempfile_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#redo_log_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterRedo_log_file_spec(PlSqlParser.Redo_log_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#redo_log_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitRedo_log_file_spec(PlSqlParser.Redo_log_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#autoextend_clause}.
	 * @param ctx the parse tree
	 */
	void enterAutoextend_clause(PlSqlParser.Autoextend_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#autoextend_clause}.
	 * @param ctx the parse tree
	 */
	void exitAutoextend_clause(PlSqlParser.Autoextend_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#maxsize_clause}.
	 * @param ctx the parse tree
	 */
	void enterMaxsize_clause(PlSqlParser.Maxsize_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#maxsize_clause}.
	 * @param ctx the parse tree
	 */
	void exitMaxsize_clause(PlSqlParser.Maxsize_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void enterBuild_clause(PlSqlParser.Build_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#build_clause}.
	 * @param ctx the parse tree
	 */
	void exitBuild_clause(PlSqlParser.Build_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parallel_clause}.
	 * @param ctx the parse tree
	 */
	void enterParallel_clause(PlSqlParser.Parallel_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parallel_clause}.
	 * @param ctx the parse tree
	 */
	void exitParallel_clause(PlSqlParser.Parallel_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterAlter_materialized_view(PlSqlParser.Alter_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitAlter_materialized_view(PlSqlParser.Alter_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_mv_option1}.
	 * @param ctx the parse tree
	 */
	void enterAlter_mv_option1(PlSqlParser.Alter_mv_option1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_mv_option1}.
	 * @param ctx the parse tree
	 */
	void exitAlter_mv_option1(PlSqlParser.Alter_mv_option1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void enterAlter_mv_refresh(PlSqlParser.Alter_mv_refreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void exitAlter_mv_refresh(PlSqlParser.Alter_mv_refreshContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollback_segment}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment(PlSqlParser.Rollback_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollback_segment}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment(PlSqlParser.Rollback_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_mv_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterModify_mv_column_clause(PlSqlParser.Modify_mv_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_mv_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitModify_mv_column_clause(PlSqlParser.Modify_mv_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_materialized_view_log}.
	 * @param ctx the parse tree
	 */
	void enterAlter_materialized_view_log(PlSqlParser.Alter_materialized_view_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_materialized_view_log}.
	 * @param ctx the parse tree
	 */
	void exitAlter_materialized_view_log(PlSqlParser.Alter_materialized_view_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_mv_log_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_mv_log_column_clause(PlSqlParser.Add_mv_log_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_mv_log_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_mv_log_column_clause(PlSqlParser.Add_mv_log_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#move_mv_log_clause}.
	 * @param ctx the parse tree
	 */
	void enterMove_mv_log_clause(PlSqlParser.Move_mv_log_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#move_mv_log_clause}.
	 * @param ctx the parse tree
	 */
	void exitMove_mv_log_clause(PlSqlParser.Move_mv_log_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#mv_log_augmentation}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_augmentation(PlSqlParser.Mv_log_augmentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#mv_log_augmentation}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_augmentation(PlSqlParser.Mv_log_augmentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datetime_expr}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expr(PlSqlParser.Datetime_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datetime_expr}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expr(PlSqlParser.Datetime_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expr(PlSqlParser.Interval_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#interval_expr}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expr(PlSqlParser.Interval_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#synchronous_or_asynchronous}.
	 * @param ctx the parse tree
	 */
	void enterSynchronous_or_asynchronous(PlSqlParser.Synchronous_or_asynchronousContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#synchronous_or_asynchronous}.
	 * @param ctx the parse tree
	 */
	void exitSynchronous_or_asynchronous(PlSqlParser.Synchronous_or_asynchronousContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#including_or_excluding}.
	 * @param ctx the parse tree
	 */
	void enterIncluding_or_excluding(PlSqlParser.Including_or_excludingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#including_or_excluding}.
	 * @param ctx the parse tree
	 */
	void exitIncluding_or_excluding(PlSqlParser.Including_or_excludingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_materialized_view_log}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view_log(PlSqlParser.Create_materialized_view_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_materialized_view_log}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view_log(PlSqlParser.Create_materialized_view_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterNew_values_clause(PlSqlParser.New_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitNew_values_clause(PlSqlParser.New_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void enterMv_log_purge_clause(PlSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 */
	void exitMv_log_purge_clause(PlSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view(PlSqlParser.Create_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view(PlSqlParser.Create_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void enterCreate_mv_refresh(PlSqlParser.Create_mv_refreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 */
	void exitCreate_mv_refresh(PlSqlParser.Create_mv_refreshContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_context}.
	 * @param ctx the parse tree
	 */
	void enterCreate_context(PlSqlParser.Create_contextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_context}.
	 * @param ctx the parse tree
	 */
	void exitCreate_context(PlSqlParser.Create_contextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#oracle_namespace}.
	 * @param ctx the parse tree
	 */
	void enterOracle_namespace(PlSqlParser.Oracle_namespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#oracle_namespace}.
	 * @param ctx the parse tree
	 */
	void exitOracle_namespace(PlSqlParser.Oracle_namespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_cluster}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cluster(PlSqlParser.Create_clusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_cluster}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cluster(PlSqlParser.Create_clusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(PlSqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(PlSqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmltype_table}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_table(PlSqlParser.Xmltype_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmltype_table}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_table(PlSqlParser.Xmltype_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_virtual_columns(PlSqlParser.Xmltype_virtual_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_virtual_columns(PlSqlParser.Xmltype_virtual_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmltype_column_properties}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_column_properties(PlSqlParser.Xmltype_column_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmltype_column_properties}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_column_properties(PlSqlParser.Xmltype_column_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmltype_storage}.
	 * @param ctx the parse tree
	 */
	void enterXmltype_storage(PlSqlParser.Xmltype_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmltype_storage}.
	 * @param ctx the parse tree
	 */
	void exitXmltype_storage(PlSqlParser.Xmltype_storageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlschema_spec}.
	 * @param ctx the parse tree
	 */
	void enterXmlschema_spec(PlSqlParser.Xmlschema_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlschema_spec}.
	 * @param ctx the parse tree
	 */
	void exitXmlschema_spec(PlSqlParser.Xmlschema_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_table}.
	 * @param ctx the parse tree
	 */
	void enterObject_table(PlSqlParser.Object_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_table}.
	 * @param ctx the parse tree
	 */
	void exitObject_table(PlSqlParser.Object_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_index_clause(PlSqlParser.Oid_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_index_clause(PlSqlParser.Oid_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#oid_clause}.
	 * @param ctx the parse tree
	 */
	void enterOid_clause(PlSqlParser.Oid_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#oid_clause}.
	 * @param ctx the parse tree
	 */
	void exitOid_clause(PlSqlParser.Oid_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_properties}.
	 * @param ctx the parse tree
	 */
	void enterObject_properties(PlSqlParser.Object_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_properties}.
	 * @param ctx the parse tree
	 */
	void exitObject_properties(PlSqlParser.Object_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 */
	void enterObject_table_substitution(PlSqlParser.Object_table_substitutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 */
	void exitObject_table_substitution(PlSqlParser.Object_table_substitutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_table}.
	 * @param ctx the parse tree
	 */
	void enterRelational_table(PlSqlParser.Relational_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_table}.
	 * @param ctx the parse tree
	 */
	void exitRelational_table(PlSqlParser.Relational_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_properties}.
	 * @param ctx the parse tree
	 */
	void enterRelational_properties(PlSqlParser.Relational_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_properties}.
	 * @param ctx the parse tree
	 */
	void exitRelational_properties(PlSqlParser.Relational_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 */
	void enterTable_partitioning_clauses(PlSqlParser.Table_partitioning_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 */
	void exitTable_partitioning_clauses(PlSqlParser.Table_partitioning_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#range_partitions}.
	 * @param ctx the parse tree
	 */
	void enterRange_partitions(PlSqlParser.Range_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#range_partitions}.
	 * @param ctx the parse tree
	 */
	void exitRange_partitions(PlSqlParser.Range_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#list_partitions}.
	 * @param ctx the parse tree
	 */
	void enterList_partitions(PlSqlParser.List_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#list_partitions}.
	 * @param ctx the parse tree
	 */
	void exitList_partitions(PlSqlParser.List_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hash_partitions}.
	 * @param ctx the parse tree
	 */
	void enterHash_partitions(PlSqlParser.Hash_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hash_partitions}.
	 * @param ctx the parse tree
	 */
	void exitHash_partitions(PlSqlParser.Hash_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void enterIndividual_hash_partitions(PlSqlParser.Individual_hash_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void exitIndividual_hash_partitions(PlSqlParser.Individual_hash_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_partitions_by_quantity(PlSqlParser.Hash_partitions_by_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_partitions_by_quantity(PlSqlParser.Hash_partitions_by_quantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_partition_quantity(PlSqlParser.Hash_partition_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_partition_quantity(PlSqlParser.Hash_partition_quantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 */
	void enterComposite_range_partitions(PlSqlParser.Composite_range_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 */
	void exitComposite_range_partitions(PlSqlParser.Composite_range_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 */
	void enterComposite_list_partitions(PlSqlParser.Composite_list_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 */
	void exitComposite_list_partitions(PlSqlParser.Composite_list_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void enterComposite_hash_partitions(PlSqlParser.Composite_hash_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 */
	void exitComposite_hash_partitions(PlSqlParser.Composite_hash_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterReference_partitioning(PlSqlParser.Reference_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitReference_partitioning(PlSqlParser.Reference_partitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 */
	void enterReference_partition_desc(PlSqlParser.Reference_partition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 */
	void exitReference_partition_desc(PlSqlParser.Reference_partition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#system_partitioning}.
	 * @param ctx the parse tree
	 */
	void enterSystem_partitioning(PlSqlParser.System_partitioningContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#system_partitioning}.
	 * @param ctx the parse tree
	 */
	void exitSystem_partitioning(PlSqlParser.System_partitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#range_partition_desc}.
	 * @param ctx the parse tree
	 */
	void enterRange_partition_desc(PlSqlParser.Range_partition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#range_partition_desc}.
	 * @param ctx the parse tree
	 */
	void exitRange_partition_desc(PlSqlParser.Range_partition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#list_partition_desc}.
	 * @param ctx the parse tree
	 */
	void enterList_partition_desc(PlSqlParser.List_partition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#list_partition_desc}.
	 * @param ctx the parse tree
	 */
	void exitList_partition_desc(PlSqlParser.List_partition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subpartition_template}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_template(PlSqlParser.Subpartition_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subpartition_template}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_template(PlSqlParser.Subpartition_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hash_subpartition_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_subpartition_quantity(PlSqlParser.Hash_subpartition_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hash_subpartition_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_subpartition_quantity(PlSqlParser.Hash_subpartition_quantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by_range(PlSqlParser.Subpartition_by_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by_range(PlSqlParser.Subpartition_by_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by_list(PlSqlParser.Subpartition_by_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by_list(PlSqlParser.Subpartition_by_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_by_hash(PlSqlParser.Subpartition_by_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_by_hash(PlSqlParser.Subpartition_by_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subpartition_name}.
	 * @param ctx the parse tree
	 */
	void enterSubpartition_name(PlSqlParser.Subpartition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subpartition_name}.
	 * @param ctx the parse tree
	 */
	void exitSubpartition_name(PlSqlParser.Subpartition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterRange_subpartition_desc(PlSqlParser.Range_subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitRange_subpartition_desc(PlSqlParser.Range_subpartition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void enterList_subpartition_desc(PlSqlParser.List_subpartition_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 */
	void exitList_subpartition_desc(PlSqlParser.List_subpartition_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 */
	void enterIndividual_hash_subparts(PlSqlParser.Individual_hash_subpartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 */
	void exitIndividual_hash_subparts(PlSqlParser.Individual_hash_subpartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 */
	void enterHash_subparts_by_quantity(PlSqlParser.Hash_subparts_by_quantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 */
	void exitHash_subparts_by_quantity(PlSqlParser.Hash_subparts_by_quantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#range_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterRange_values_clause(PlSqlParser.Range_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#range_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitRange_values_clause(PlSqlParser.Range_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#list_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterList_values_clause(PlSqlParser.List_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#list_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitList_values_clause(PlSqlParser.List_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_partition_description}.
	 * @param ctx the parse tree
	 */
	void enterTable_partition_description(PlSqlParser.Table_partition_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_partition_description}.
	 * @param ctx the parse tree
	 */
	void exitTable_partition_description(PlSqlParser.Table_partition_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartitioning_storage_clause(PlSqlParser.Partitioning_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartitioning_storage_clause(PlSqlParser.Partitioning_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 */
	void enterLob_partitioning_storage(PlSqlParser.Lob_partitioning_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 */
	void exitLob_partitioning_storage(PlSqlParser.Lob_partitioning_storageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datatype_null_enable}.
	 * @param ctx the parse tree
	 */
	void enterDatatype_null_enable(PlSqlParser.Datatype_null_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datatype_null_enable}.
	 * @param ctx the parse tree
	 */
	void exitDatatype_null_enable(PlSqlParser.Datatype_null_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#size_clause}.
	 * @param ctx the parse tree
	 */
	void enterSize_clause(PlSqlParser.Size_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#size_clause}.
	 * @param ctx the parse tree
	 */
	void exitSize_clause(PlSqlParser.Size_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_compression}.
	 * @param ctx the parse tree
	 */
	void enterTable_compression(PlSqlParser.Table_compressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_compression}.
	 * @param ctx the parse tree
	 */
	void exitTable_compression(PlSqlParser.Table_compressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_attributes_clause(PlSqlParser.Physical_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_attributes_clause(PlSqlParser.Physical_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterStorage_clause(PlSqlParser.Storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitStorage_clause(PlSqlParser.Storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 */
	void enterDeferred_segment_creation(PlSqlParser.Deferred_segment_creationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 */
	void exitDeferred_segment_creation(PlSqlParser.Deferred_segment_creationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegment_attributes_clause(PlSqlParser.Segment_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegment_attributes_clause(PlSqlParser.Segment_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#physical_properties}.
	 * @param ctx the parse tree
	 */
	void enterPhysical_properties(PlSqlParser.Physical_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#physical_properties}.
	 * @param ctx the parse tree
	 */
	void exitPhysical_properties(PlSqlParser.Physical_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_movement_clause(PlSqlParser.Row_movement_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#row_movement_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_movement_clause(PlSqlParser.Row_movement_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_archive_clause(PlSqlParser.Flashback_archive_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_archive_clause(PlSqlParser.Flashback_archive_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#log_grp}.
	 * @param ctx the parse tree
	 */
	void enterLog_grp(PlSqlParser.Log_grpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#log_grp}.
	 * @param ctx the parse tree
	 */
	void exitLog_grp(PlSqlParser.Log_grpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_table_logging(PlSqlParser.Supplemental_table_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_table_logging(PlSqlParser.Supplemental_table_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_log_grp_clause(PlSqlParser.Supplemental_log_grp_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_log_grp_clause(PlSqlParser.Supplemental_log_grp_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_id_key_clause(PlSqlParser.Supplemental_id_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_id_key_clause(PlSqlParser.Supplemental_id_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_extent_clause(PlSqlParser.Allocate_extent_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_extent_clause(PlSqlParser.Allocate_extent_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate_unused_clause(PlSqlParser.Deallocate_unused_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate_unused_clause(PlSqlParser.Deallocate_unused_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#shrink_clause}.
	 * @param ctx the parse tree
	 */
	void enterShrink_clause(PlSqlParser.Shrink_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#shrink_clause}.
	 * @param ctx the parse tree
	 */
	void exitShrink_clause(PlSqlParser.Shrink_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 */
	void enterRecords_per_block_clause(PlSqlParser.Records_per_block_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 */
	void exitRecords_per_block_clause(PlSqlParser.Records_per_block_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpgrade_table_clause(PlSqlParser.Upgrade_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpgrade_table_clause(PlSqlParser.Upgrade_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(PlSqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(PlSqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#comment_on_column}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_column(PlSqlParser.Comment_on_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#comment_on_column}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_column(PlSqlParser.Comment_on_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#enable_or_disable}.
	 * @param ctx the parse tree
	 */
	void enterEnable_or_disable(PlSqlParser.Enable_or_disableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#enable_or_disable}.
	 * @param ctx the parse tree
	 */
	void exitEnable_or_disable(PlSqlParser.Enable_or_disableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#allow_or_disallow}.
	 * @param ctx the parse tree
	 */
	void enterAllow_or_disallow(PlSqlParser.Allow_or_disallowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#allow_or_disallow}.
	 * @param ctx the parse tree
	 */
	void exitAllow_or_disallow(PlSqlParser.Allow_or_disallowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(PlSqlParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(PlSqlParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#comment_on_table}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_table(PlSqlParser.Comment_on_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#comment_on_table}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_table(PlSqlParser.Comment_on_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_cluster}.
	 * @param ctx the parse tree
	 */
	void enterAlter_cluster(PlSqlParser.Alter_clusterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_cluster}.
	 * @param ctx the parse tree
	 */
	void exitAlter_cluster(PlSqlParser.Alter_clusterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cache_or_nocache}.
	 * @param ctx the parse tree
	 */
	void enterCache_or_nocache(PlSqlParser.Cache_or_nocacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cache_or_nocache}.
	 * @param ctx the parse tree
	 */
	void exitCache_or_nocache(PlSqlParser.Cache_or_nocacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(PlSqlParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(PlSqlParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(PlSqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(PlSqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#startup_clauses}.
	 * @param ctx the parse tree
	 */
	void enterStartup_clauses(PlSqlParser.Startup_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#startup_clauses}.
	 * @param ctx the parse tree
	 */
	void exitStartup_clauses(PlSqlParser.Startup_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#resetlogs_or_noresetlogs}.
	 * @param ctx the parse tree
	 */
	void enterResetlogs_or_noresetlogs(PlSqlParser.Resetlogs_or_noresetlogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#resetlogs_or_noresetlogs}.
	 * @param ctx the parse tree
	 */
	void exitResetlogs_or_noresetlogs(PlSqlParser.Resetlogs_or_noresetlogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#upgrade_or_downgrade}.
	 * @param ctx the parse tree
	 */
	void enterUpgrade_or_downgrade(PlSqlParser.Upgrade_or_downgradeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#upgrade_or_downgrade}.
	 * @param ctx the parse tree
	 */
	void exitUpgrade_or_downgrade(PlSqlParser.Upgrade_or_downgradeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#recovery_clauses}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_clauses(PlSqlParser.Recovery_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#recovery_clauses}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_clauses(PlSqlParser.Recovery_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#begin_or_end}.
	 * @param ctx the parse tree
	 */
	void enterBegin_or_end(PlSqlParser.Begin_or_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#begin_or_end}.
	 * @param ctx the parse tree
	 */
	void exitBegin_or_end(PlSqlParser.Begin_or_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_recovery}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_recovery(PlSqlParser.General_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_recovery}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_recovery(PlSqlParser.General_recoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#full_database_recovery}.
	 * @param ctx the parse tree
	 */
	void enterFull_database_recovery(PlSqlParser.Full_database_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#full_database_recovery}.
	 * @param ctx the parse tree
	 */
	void exitFull_database_recovery(PlSqlParser.Full_database_recoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partial_database_recovery}.
	 * @param ctx the parse tree
	 */
	void enterPartial_database_recovery(PlSqlParser.Partial_database_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partial_database_recovery}.
	 * @param ctx the parse tree
	 */
	void exitPartial_database_recovery(PlSqlParser.Partial_database_recoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partial_database_recovery_10g}.
	 * @param ctx the parse tree
	 */
	void enterPartial_database_recovery_10g(PlSqlParser.Partial_database_recovery_10gContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partial_database_recovery_10g}.
	 * @param ctx the parse tree
	 */
	void exitPartial_database_recovery_10g(PlSqlParser.Partial_database_recovery_10gContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#managed_standby_recovery}.
	 * @param ctx the parse tree
	 */
	void enterManaged_standby_recovery(PlSqlParser.Managed_standby_recoveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#managed_standby_recovery}.
	 * @param ctx the parse tree
	 */
	void exitManaged_standby_recovery(PlSqlParser.Managed_standby_recoveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#db_name}.
	 * @param ctx the parse tree
	 */
	void enterDb_name(PlSqlParser.Db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#db_name}.
	 * @param ctx the parse tree
	 */
	void exitDb_name(PlSqlParser.Db_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#database_file_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_clauses(PlSqlParser.Database_file_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#database_file_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_clauses(PlSqlParser.Database_file_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#create_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void enterCreate_datafile_clause(PlSqlParser.Create_datafile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#create_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void exitCreate_datafile_clause(PlSqlParser.Create_datafile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_datafile_clause(PlSqlParser.Alter_datafile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_datafile_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_datafile_clause(PlSqlParser.Alter_datafile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_tempfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tempfile_clause(PlSqlParser.Alter_tempfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_tempfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tempfile_clause(PlSqlParser.Alter_tempfile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterLogfile_clauses(PlSqlParser.Logfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitLogfile_clauses(PlSqlParser.Logfile_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAdd_logfile_clauses(PlSqlParser.Add_logfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAdd_logfile_clauses(PlSqlParser.Add_logfile_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#log_file_group}.
	 * @param ctx the parse tree
	 */
	void enterLog_file_group(PlSqlParser.Log_file_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#log_file_group}.
	 * @param ctx the parse tree
	 */
	void exitLog_file_group(PlSqlParser.Log_file_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDrop_logfile_clauses(PlSqlParser.Drop_logfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_logfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDrop_logfile_clauses(PlSqlParser.Drop_logfile_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#switch_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_logfile_clause(PlSqlParser.Switch_logfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#switch_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_logfile_clause(PlSqlParser.Switch_logfile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#supplemental_db_logging}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_db_logging(PlSqlParser.Supplemental_db_loggingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#supplemental_db_logging}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_db_logging(PlSqlParser.Supplemental_db_loggingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_or_drop}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or_drop(PlSqlParser.Add_or_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_or_drop}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or_drop(PlSqlParser.Add_or_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#supplemental_plsql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_plsql_clause(PlSqlParser.Supplemental_plsql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#supplemental_plsql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_plsql_clause(PlSqlParser.Supplemental_plsql_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logfile_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterLogfile_descriptor(PlSqlParser.Logfile_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logfile_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitLogfile_descriptor(PlSqlParser.Logfile_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#controlfile_clauses}.
	 * @param ctx the parse tree
	 */
	void enterControlfile_clauses(PlSqlParser.Controlfile_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#controlfile_clauses}.
	 * @param ctx the parse tree
	 */
	void exitControlfile_clauses(PlSqlParser.Controlfile_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trace_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterTrace_file_clause(PlSqlParser.Trace_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trace_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitTrace_file_clause(PlSqlParser.Trace_file_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standby_database_clauses}.
	 * @param ctx the parse tree
	 */
	void enterStandby_database_clauses(PlSqlParser.Standby_database_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standby_database_clauses}.
	 * @param ctx the parse tree
	 */
	void exitStandby_database_clauses(PlSqlParser.Standby_database_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#activate_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void enterActivate_standby_db_clause(PlSqlParser.Activate_standby_db_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#activate_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void exitActivate_standby_db_clause(PlSqlParser.Activate_standby_db_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#maximize_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void enterMaximize_standby_db_clause(PlSqlParser.Maximize_standby_db_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#maximize_standby_db_clause}.
	 * @param ctx the parse tree
	 */
	void exitMaximize_standby_db_clause(PlSqlParser.Maximize_standby_db_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#register_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void enterRegister_logfile_clause(PlSqlParser.Register_logfile_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#register_logfile_clause}.
	 * @param ctx the parse tree
	 */
	void exitRegister_logfile_clause(PlSqlParser.Register_logfile_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#commit_switchover_clause}.
	 * @param ctx the parse tree
	 */
	void enterCommit_switchover_clause(PlSqlParser.Commit_switchover_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#commit_switchover_clause}.
	 * @param ctx the parse tree
	 */
	void exitCommit_switchover_clause(PlSqlParser.Commit_switchover_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#start_standby_clause}.
	 * @param ctx the parse tree
	 */
	void enterStart_standby_clause(PlSqlParser.Start_standby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#start_standby_clause}.
	 * @param ctx the parse tree
	 */
	void exitStart_standby_clause(PlSqlParser.Start_standby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#stop_standby_clause}.
	 * @param ctx the parse tree
	 */
	void enterStop_standby_clause(PlSqlParser.Stop_standby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#stop_standby_clause}.
	 * @param ctx the parse tree
	 */
	void exitStop_standby_clause(PlSqlParser.Stop_standby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#convert_database_clause}.
	 * @param ctx the parse tree
	 */
	void enterConvert_database_clause(PlSqlParser.Convert_database_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#convert_database_clause}.
	 * @param ctx the parse tree
	 */
	void exitConvert_database_clause(PlSqlParser.Convert_database_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_settings_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_settings_clause(PlSqlParser.Default_settings_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_settings_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_settings_clause(PlSqlParser.Default_settings_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_time_zone_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_time_zone_clause(PlSqlParser.Set_time_zone_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_time_zone_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_time_zone_clause(PlSqlParser.Set_time_zone_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#instance_clauses}.
	 * @param ctx the parse tree
	 */
	void enterInstance_clauses(PlSqlParser.Instance_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#instance_clauses}.
	 * @param ctx the parse tree
	 */
	void exitInstance_clauses(PlSqlParser.Instance_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#security_clause}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_clause(PlSqlParser.Security_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#security_clause}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_clause(PlSqlParser.Security_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(PlSqlParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(PlSqlParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(PlSqlParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(PlSqlParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#edition_name}.
	 * @param ctx the parse tree
	 */
	void enterEdition_name(PlSqlParser.Edition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#edition_name}.
	 * @param ctx the parse tree
	 */
	void exitEdition_name(PlSqlParser.Edition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#filenumber}.
	 * @param ctx the parse tree
	 */
	void enterFilenumber(PlSqlParser.FilenumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#filenumber}.
	 * @param ctx the parse tree
	 */
	void exitFilenumber(PlSqlParser.FilenumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#filename}.
	 * @param ctx the parse tree
	 */
	void enterFilename(PlSqlParser.FilenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#filename}.
	 * @param ctx the parse tree
	 */
	void exitFilename(PlSqlParser.FilenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(PlSqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(PlSqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_table_properties}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_properties(PlSqlParser.Alter_table_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_table_properties}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_properties(PlSqlParser.Alter_table_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_table_properties_1}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_properties_1(PlSqlParser.Alter_table_properties_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_table_properties_1}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_properties_1(PlSqlParser.Alter_table_properties_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAlter_iot_clauses(PlSqlParser.Alter_iot_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAlter_iot_clauses(PlSqlParser.Alter_iot_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_mapping_table_clause(PlSqlParser.Alter_mapping_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_mapping_table_clause(PlSqlParser.Alter_mapping_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_overflow_clause(PlSqlParser.Alter_overflow_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_overflow_clause(PlSqlParser.Alter_overflow_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_overflow_clause(PlSqlParser.Add_overflow_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_overflow_clause(PlSqlParser.Add_overflow_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 */
	void enterEnable_disable_clause(PlSqlParser.Enable_disable_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 */
	void exitEnable_disable_clause(PlSqlParser.Enable_disable_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_index_clause(PlSqlParser.Using_index_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_index_clause(PlSqlParser.Using_index_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_attributes}.
	 * @param ctx the parse tree
	 */
	void enterIndex_attributes(PlSqlParser.Index_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_attributes}.
	 * @param ctx the parse tree
	 */
	void exitIndex_attributes(PlSqlParser.Index_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sort_or_nosort}.
	 * @param ctx the parse tree
	 */
	void enterSort_or_nosort(PlSqlParser.Sort_or_nosortContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sort_or_nosort}.
	 * @param ctx the parse tree
	 */
	void exitSort_or_nosort(PlSqlParser.Sort_or_nosortContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exceptions_clause}.
	 * @param ctx the parse tree
	 */
	void enterExceptions_clause(PlSqlParser.Exceptions_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exceptions_clause}.
	 * @param ctx the parse tree
	 */
	void exitExceptions_clause(PlSqlParser.Exceptions_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#move_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterMove_table_clause(PlSqlParser.Move_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#move_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitMove_table_clause(PlSqlParser.Move_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_org_table_clause(PlSqlParser.Index_org_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_org_table_clause(PlSqlParser.Index_org_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterMapping_table_clause(PlSqlParser.Mapping_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitMapping_table_clause(PlSqlParser.Mapping_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#key_compression}.
	 * @param ctx the parse tree
	 */
	void enterKey_compression(PlSqlParser.Key_compressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#key_compression}.
	 * @param ctx the parse tree
	 */
	void exitKey_compression(PlSqlParser.Key_compressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_org_overflow_clause(PlSqlParser.Index_org_overflow_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_org_overflow_clause(PlSqlParser.Index_org_overflow_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterColumn_clauses(PlSqlParser.Column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitColumn_clauses(PlSqlParser.Column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 */
	void enterModify_collection_retrieval(PlSqlParser.Modify_collection_retrievalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 */
	void exitModify_collection_retrieval(PlSqlParser.Modify_collection_retrievalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collection_item}.
	 * @param ctx the parse tree
	 */
	void enterCollection_item(PlSqlParser.Collection_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collection_item}.
	 * @param ctx the parse tree
	 */
	void exitCollection_item(PlSqlParser.Collection_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rename_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterRename_column_clause(PlSqlParser.Rename_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rename_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitRename_column_clause(PlSqlParser.Rename_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#old_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOld_column_name(PlSqlParser.Old_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#old_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOld_column_name(PlSqlParser.Old_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_column_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_column_name(PlSqlParser.New_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_column_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_column_name(PlSqlParser.New_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_modify_drop_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterAdd_modify_drop_column_clauses(PlSqlParser.Add_modify_drop_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_modify_drop_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitAdd_modify_drop_column_clauses(PlSqlParser.Add_modify_drop_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_clause(PlSqlParser.Drop_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_clause(PlSqlParser.Drop_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModify_column_clauses(PlSqlParser.Modify_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModify_column_clauses(PlSqlParser.Modify_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterModify_col_properties(PlSqlParser.Modify_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitModify_col_properties(PlSqlParser.Modify_col_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 */
	void enterModify_col_substitutable(PlSqlParser.Modify_col_substitutableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 */
	void exitModify_col_substitutable(PlSqlParser.Modify_col_substitutableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column_clause(PlSqlParser.Add_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column_clause(PlSqlParser.Add_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#alter_varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterAlter_varray_col_properties(PlSqlParser.Alter_varray_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#alter_varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitAlter_varray_col_properties(PlSqlParser.Alter_varray_col_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterVarray_col_properties(PlSqlParser.Varray_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#varray_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitVarray_col_properties(PlSqlParser.Varray_col_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterVarray_storage_clause(PlSqlParser.Varray_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitVarray_storage_clause(PlSqlParser.Varray_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_segname}.
	 * @param ctx the parse tree
	 */
	void enterLob_segname(PlSqlParser.Lob_segnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_segname}.
	 * @param ctx the parse tree
	 */
	void exitLob_segname(PlSqlParser.Lob_segnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_item}.
	 * @param ctx the parse tree
	 */
	void enterLob_item(PlSqlParser.Lob_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_item}.
	 * @param ctx the parse tree
	 */
	void exitLob_item(PlSqlParser.Lob_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 */
	void enterLob_storage_parameters(PlSqlParser.Lob_storage_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 */
	void exitLob_storage_parameters(PlSqlParser.Lob_storage_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_storage_clause(PlSqlParser.Lob_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_storage_clause(PlSqlParser.Lob_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterModify_lob_storage_clause(PlSqlParser.Modify_lob_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitModify_lob_storage_clause(PlSqlParser.Modify_lob_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 */
	void enterModify_lob_parameters(PlSqlParser.Modify_lob_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 */
	void exitModify_lob_parameters(PlSqlParser.Modify_lob_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_parameters}.
	 * @param ctx the parse tree
	 */
	void enterLob_parameters(PlSqlParser.Lob_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_parameters}.
	 * @param ctx the parse tree
	 */
	void exitLob_parameters(PlSqlParser.Lob_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_deduplicate_clause(PlSqlParser.Lob_deduplicate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_deduplicate_clause(PlSqlParser.Lob_deduplicate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_compression_clause(PlSqlParser.Lob_compression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_compression_clause(PlSqlParser.Lob_compression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 */
	void enterLob_retention_clause(PlSqlParser.Lob_retention_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 */
	void exitLob_retention_clause(PlSqlParser.Lob_retention_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#encryption_spec}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_spec(PlSqlParser.Encryption_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#encryption_spec}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_spec(PlSqlParser.Encryption_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tablespace}.
	 * @param ctx the parse tree
	 */
	void enterTablespace(PlSqlParser.TablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tablespace}.
	 * @param ctx the parse tree
	 */
	void exitTablespace(PlSqlParser.TablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#varray_item}.
	 * @param ctx the parse tree
	 */
	void enterVarray_item(PlSqlParser.Varray_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#varray_item}.
	 * @param ctx the parse tree
	 */
	void exitVarray_item(PlSqlParser.Varray_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_properties}.
	 * @param ctx the parse tree
	 */
	void enterColumn_properties(PlSqlParser.Column_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_properties}.
	 * @param ctx the parse tree
	 */
	void exitColumn_properties(PlSqlParser.Column_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#period_definition}.
	 * @param ctx the parse tree
	 */
	void enterPeriod_definition(PlSqlParser.Period_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#period_definition}.
	 * @param ctx the parse tree
	 */
	void exitPeriod_definition(PlSqlParser.Period_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#start_time_column}.
	 * @param ctx the parse tree
	 */
	void enterStart_time_column(PlSqlParser.Start_time_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#start_time_column}.
	 * @param ctx the parse tree
	 */
	void exitStart_time_column(PlSqlParser.Start_time_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#end_time_column}.
	 * @param ctx the parse tree
	 */
	void enterEnd_time_column(PlSqlParser.End_time_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#end_time_column}.
	 * @param ctx the parse tree
	 */
	void exitEnd_time_column(PlSqlParser.End_time_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(PlSqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(PlSqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterVirtual_column_definition(PlSqlParser.Virtual_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitVirtual_column_definition(PlSqlParser.Virtual_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#out_of_line_part_storage}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_part_storage(PlSqlParser.Out_of_line_part_storageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#out_of_line_part_storage}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_part_storage(PlSqlParser.Out_of_line_part_storageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_col_properties(PlSqlParser.Nested_table_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_col_properties(PlSqlParser.Nested_table_col_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#nested_item}.
	 * @param ctx the parse tree
	 */
	void enterNested_item(PlSqlParser.Nested_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#nested_item}.
	 * @param ctx the parse tree
	 */
	void exitNested_item(PlSqlParser.Nested_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubstitutable_column_clause(PlSqlParser.Substitutable_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubstitutable_column_clause(PlSqlParser.Substitutable_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name(PlSqlParser.Partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name(PlSqlParser.Partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 */
	void enterSupplemental_logging_props(PlSqlParser.Supplemental_logging_propsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 */
	void exitSupplemental_logging_props(PlSqlParser.Supplemental_logging_propsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_or_attribute}.
	 * @param ctx the parse tree
	 */
	void enterColumn_or_attribute(PlSqlParser.Column_or_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_or_attribute}.
	 * @param ctx the parse tree
	 */
	void exitColumn_or_attribute(PlSqlParser.Column_or_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_col_properties(PlSqlParser.Object_type_col_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_col_properties(PlSqlParser.Object_type_col_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constraint_clauses}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_clauses(PlSqlParser.Constraint_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constraint_clauses}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_clauses(PlSqlParser.Constraint_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#old_constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterOld_constraint_name(PlSqlParser.Old_constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#old_constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitOld_constraint_name(PlSqlParser.Old_constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#new_constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_constraint_name(PlSqlParser.New_constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#new_constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_constraint_name(PlSqlParser.New_constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_constraint_clause(PlSqlParser.Drop_constraint_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_constraint_clause(PlSqlParser.Drop_constraint_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_primary_key_or_unique_or_generic_clause}.
	 * @param ctx the parse tree
	 */
	void enterDrop_primary_key_or_unique_or_generic_clause(PlSqlParser.Drop_primary_key_or_unique_or_generic_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_primary_key_or_unique_or_generic_clause}.
	 * @param ctx the parse tree
	 */
	void exitDrop_primary_key_or_unique_or_generic_clause(PlSqlParser.Drop_primary_key_or_unique_or_generic_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAdd_constraint(PlSqlParser.Add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAdd_constraint(PlSqlParser.Add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 */
	void enterCheck_constraint(PlSqlParser.Check_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 */
	void exitCheck_constraint(PlSqlParser.Check_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_constraint(PlSqlParser.Drop_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_constraint(PlSqlParser.Drop_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#enable_constraint}.
	 * @param ctx the parse tree
	 */
	void enterEnable_constraint(PlSqlParser.Enable_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#enable_constraint}.
	 * @param ctx the parse tree
	 */
	void exitEnable_constraint(PlSqlParser.Enable_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#disable_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDisable_constraint(PlSqlParser.Disable_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#disable_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDisable_constraint(PlSqlParser.Disable_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(PlSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(PlSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void enterReferences_clause(PlSqlParser.References_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#references_clause}.
	 * @param ctx the parse tree
	 */
	void exitReferences_clause(PlSqlParser.References_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#on_delete_clause}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete_clause(PlSqlParser.On_delete_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#on_delete_clause}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete_clause(PlSqlParser.On_delete_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unique_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnique_key_clause(PlSqlParser.Unique_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unique_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnique_key_clause(PlSqlParser.Unique_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#primary_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key_clause(PlSqlParser.Primary_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#primary_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key_clause(PlSqlParser.Primary_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_block(PlSqlParser.Anonymous_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_block(PlSqlParser.Anonymous_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void enterJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 */
	void exitJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void enterC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 */
	void exitC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void enterC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 */
	void exitC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seq_of_declare_specs}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_declare_specs(PlSqlParser.Seq_of_declare_specsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seq_of_declare_specs}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_declare_specs(PlSqlParser.Seq_of_declare_specsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void enterParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 */
	void exitParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_type_def}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_def(PlSqlParser.Record_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_type_def}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_def(PlSqlParser.Record_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void enterField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 */
	void exitField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type_def(PlSqlParser.Ref_cursor_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type_def(PlSqlParser.Ref_cursor_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(PlSqlParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(PlSqlParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_type_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_def(PlSqlParser.Table_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_type_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_def(PlSqlParser.Table_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void enterTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 */
	void exitTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void enterElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 */
	void exitElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void enterElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 */
	void exitElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void enterCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 */
	void exitCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void enterBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 */
	void exitBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void enterLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 */
	void exitLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void enterUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 */
	void exitUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(PlSqlParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(PlSqlParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void enterPipe_row_statement(PlSqlParser.Pipe_row_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 */
	void exitPipe_row_statement(PlSqlParser.Pipe_row_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PlSqlParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PlSqlParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void enterData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 */
	void exitData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void enterCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 */
	void exitCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void enterWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 */
	void exitWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void enterFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 */
	void exitFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void enterCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 */
	void exitCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void enterQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 */
	void exitQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void enterSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 */
	void exitSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_one(PlSqlParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_one(PlSqlParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_two(PlSqlParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_two(PlSqlParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void enterTable_ref_aux_internal_three(PlSqlParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 */
	void exitTable_ref_aux_internal_three(PlSqlParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void enterPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 */
	void exitPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void enterStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 */
	void exitStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void enterRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 */
	void exitRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void enterCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 */
	void exitCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void enterReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 */
	void exitReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void enterMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 */
	void exitMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void enterModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 */
	void exitModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void enterModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 */
	void exitModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void enterCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 */
	void exitCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void enterModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 */
	void exitModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void enterUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 */
	void exitUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void enterOffset_clause(PlSqlParser.Offset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void exitOffset_clause(PlSqlParser.Offset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#fetch_clause}.
	 * @param ctx the parse tree
	 */
	void enterFetch_clause(PlSqlParser.Fetch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#fetch_clause}.
	 * @param ctx the parse tree
	 */
	void exitFetch_clause(PlSqlParser.Fetch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void enterFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 */
	void exitFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void enterMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 */
	void exitMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void enterConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 */
	void exitConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void enterValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 */
	void exitValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void enterMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 */
	void exitMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void enterSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 */
	void exitSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void enterWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 */
	void exitWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void enterError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 */
	void exitError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void enterTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 */
	void exitTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void enterSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 */
	void exitSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void enterSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 */
	void exitSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(PlSqlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(PlSqlParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void enterCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 */
	void exitCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expression(PlSqlParser.Logical_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#logical_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expression(PlSqlParser.Logical_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void enterRelational_operator(PlSqlParser.Relational_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#relational_operator}.
	 * @param ctx the parse tree
	 */
	void exitRelational_operator(PlSqlParser.Relational_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void enterIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 */
	void exitIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void enterBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 */
	void exitBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void enterInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 */
	void exitInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void enterMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 */
	void exitMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void enterSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 */
	void exitSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void enterCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 */
	void exitCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#string_function}.
	 * @param ctx the parse tree
	 */
	void enterString_function(PlSqlParser.String_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#string_function}.
	 * @param ctx the parse tree
	 */
	void exitString_function(PlSqlParser.String_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void enterStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 */
	void exitStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PlSqlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PlSqlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_wrapper(PlSqlParser.Numeric_function_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_wrapper(PlSqlParser.Numeric_function_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function(PlSqlParser.Numeric_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_function}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function(PlSqlParser.Numeric_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#other_function}.
	 * @param ctx the parse tree
	 */
	void enterOther_function(PlSqlParser.Other_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#other_function}.
	 * @param ctx the parse tree
	 */
	void exitOther_function(PlSqlParser.Other_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void enterStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 */
	void exitStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void enterWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 */
	void exitWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void enterUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 */
	void exitUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void enterCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 */
	void exitCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void enterCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 */
	void exitCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void enterXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 */
	void exitXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void enterXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 */
	void exitXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void enterXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 */
	void exitXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void enterXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 */
	void exitXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void enterWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 */
	void exitWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void enterSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 */
	void exitSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void enterXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 */
	void exitXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void enterCost_class_name(PlSqlParser.Cost_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 */
	void exitCost_class_name(PlSqlParser.Cost_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(PlSqlParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(PlSqlParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(PlSqlParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(PlSqlParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void enterRollback_segment_name(PlSqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 */
	void exitRollback_segment_name(PlSqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_var_name(PlSqlParser.Table_var_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_var_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_var_name(PlSqlParser.Table_var_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(PlSqlParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(PlSqlParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void enterRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 */
	void exitRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(PlSqlParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(PlSqlParser.Package_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void enterImplementation_type_name(PlSqlParser.Implementation_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 */
	void exitImplementation_type_name(PlSqlParser.Implementation_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterParameter_name(PlSqlParser.Parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitParameter_name(PlSqlParser.Parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void enterReference_model_name(PlSqlParser.Reference_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 */
	void exitReference_model_name(PlSqlParser.Reference_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void enterMain_model_name(PlSqlParser.Main_model_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 */
	void exitMain_model_name(PlSqlParser.Main_model_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#container_tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterContainer_tableview_name(PlSqlParser.Container_tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#container_tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitContainer_tableview_name(PlSqlParser.Container_tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void enterQuery_name(PlSqlParser.Query_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#query_name}.
	 * @param ctx the parse tree
	 */
	void exitQuery_name(PlSqlParser.Query_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grantee_name}.
	 * @param ctx the parse tree
	 */
	void enterGrantee_name(PlSqlParser.Grantee_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grantee_name}.
	 * @param ctx the parse tree
	 */
	void exitGrantee_name(PlSqlParser.Grantee_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(PlSqlParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(PlSqlParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void enterSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 */
	void exitSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void enterException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 */
	void exitException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(PlSqlParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(PlSqlParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(PlSqlParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(PlSqlParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(PlSqlParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(PlSqlParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void enterVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 */
	void exitVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(PlSqlParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(PlSqlParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void enterRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 */
	void exitRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(PlSqlParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(PlSqlParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void enterLink_name(PlSqlParser.Link_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#link_name}.
	 * @param ctx the parse tree
	 */
	void exitLink_name(PlSqlParser.Link_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void enterTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 */
	void exitTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void enterChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 */
	void exitChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#synonym_name}.
	 * @param ctx the parse tree
	 */
	void enterSynonym_name(PlSqlParser.Synonym_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#synonym_name}.
	 * @param ctx the parse tree
	 */
	void exitSynonym_name(PlSqlParser.Synonym_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#schema_object_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_object_name(PlSqlParser.Schema_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#schema_object_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_object_name(PlSqlParser.Schema_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#dir_object_name}.
	 * @param ctx the parse tree
	 */
	void enterDir_object_name(PlSqlParser.Dir_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#dir_object_name}.
	 * @param ctx the parse tree
	 */
	void exitDir_object_name(PlSqlParser.Dir_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#user_object_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_object_name(PlSqlParser.User_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#user_object_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_object_name(PlSqlParser.User_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#grant_object_name}.
	 * @param ctx the parse tree
	 */
	void enterGrant_object_name(PlSqlParser.Grant_object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#grant_object_name}.
	 * @param ctx the parse tree
	 */
	void exitGrant_object_name(PlSqlParser.Grant_object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(PlSqlParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(PlSqlParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#paren_column_list}.
	 * @param ctx the parse tree
	 */
	void enterParen_column_list(PlSqlParser.Paren_column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#paren_column_list}.
	 * @param ctx the parse tree
	 */
	void exitParen_column_list(PlSqlParser.Paren_column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void enterKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 */
	void exitKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void enterFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 */
	void exitFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void enterRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 */
	void exitRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void enterNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 */
	void exitNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void enterBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 */
	void exitBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void enterTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 */
	void exitTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void enterObject_privilege(PlSqlParser.Object_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void exitObject_privilege(PlSqlParser.Object_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#system_privilege}.
	 * @param ctx the parse tree
	 */
	void enterSystem_privilege(PlSqlParser.System_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#system_privilege}.
	 * @param ctx the parse tree
	 */
	void exitSystem_privilege(PlSqlParser.System_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void enterNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 */
	void exitNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_negative(PlSqlParser.Numeric_negativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_negative(PlSqlParser.Numeric_negativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PlSqlParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PlSqlParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void enterId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 */
	void exitId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void enterRegular_id(PlSqlParser.Regular_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 */
	void exitRegular_id(PlSqlParser.Regular_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_reserved_keywords_in_12c}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_keywords_in_12c(PlSqlParser.Non_reserved_keywords_in_12cContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_reserved_keywords_in_12c}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_keywords_in_12c(PlSqlParser.Non_reserved_keywords_in_12cContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#non_reserved_keywords_pre12c}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_keywords_pre12c(PlSqlParser.Non_reserved_keywords_pre12cContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#non_reserved_keywords_pre12c}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_keywords_pre12c(PlSqlParser.Non_reserved_keywords_pre12cContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#string_function_name}.
	 * @param ctx the parse tree
	 */
	void enterString_function_name(PlSqlParser.String_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#string_function_name}.
	 * @param ctx the parse tree
	 */
	void exitString_function_name(PlSqlParser.String_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlSqlParser#numeric_function_name}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_function_name(PlSqlParser.Numeric_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlSqlParser#numeric_function_name}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_function_name(PlSqlParser.Numeric_function_nameContext ctx);
}