// Generated from PlSqlParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(PlSqlParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit_statement(PlSqlParser.Unit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(PlSqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function(PlSqlParser.Alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_body(PlSqlParser.Create_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parallel_enable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_enable_clause(PlSqlParser.Parallel_enable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_clause(PlSqlParser.Partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#result_cache_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_cache_clause(PlSqlParser.Result_cache_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relies_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelies_on_part(PlSqlParser.Relies_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#streaming_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStreaming_clause(PlSqlParser.Streaming_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_package(PlSqlParser.Drop_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_package(PlSqlParser.Alter_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_package}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package(PlSqlParser.Create_packageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body(PlSqlParser.Create_package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_obj_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_spec(PlSqlParser.Package_obj_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_spec(PlSqlParser.Procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_spec(PlSqlParser.Function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_obj_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_obj_body(PlSqlParser.Package_obj_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(PlSqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_procedure(PlSqlParser.Alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(PlSqlParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_body(PlSqlParser.Procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_procedure_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_body(PlSqlParser.Create_procedure_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(PlSqlParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger(PlSqlParser.Alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger(PlSqlParser.Create_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_follows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_follows_clause(PlSqlParser.Trigger_follows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_when_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_when_clause(PlSqlParser.Trigger_when_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#simple_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_dml_trigger(PlSqlParser.Simple_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_each_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_each_row(PlSqlParser.For_each_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compound_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_dml_trigger(PlSqlParser.Compound_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#non_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_trigger(PlSqlParser.Non_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_body(PlSqlParser.Trigger_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#routine_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_clause(PlSqlParser.Routine_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compound_trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_trigger_block(PlSqlParser.Compound_trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#timing_point_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_point_section(PlSqlParser.Timing_point_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#non_dml_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_dml_event(PlSqlParser.Non_dml_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_event_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_clause(PlSqlParser.Dml_event_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_event_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_element(PlSqlParser.Dml_event_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_event_nested_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_event_nested_clause(PlSqlParser.Dml_event_nested_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#referencing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_clause(PlSqlParser.Referencing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#referencing_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferencing_element(PlSqlParser.Referencing_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(PlSqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type(PlSqlParser.Alter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compile_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompile_type_clause(PlSqlParser.Compile_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#replace_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace_type_clause(PlSqlParser.Replace_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_method_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_spec(PlSqlParser.Alter_method_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_method_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_method_element(PlSqlParser.Alter_method_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_attribute_definition(PlSqlParser.Alter_attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#attribute_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_definition(PlSqlParser.Attribute_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_collection_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collection_clauses(PlSqlParser.Alter_collection_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dependent_handling_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_handling_clause(PlSqlParser.Dependent_handling_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dependent_exceptions_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependent_exceptions_part(PlSqlParser.Dependent_exceptions_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(PlSqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_definition(PlSqlParser.Type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_def(PlSqlParser.Object_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_as_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_as_part(PlSqlParser.Object_as_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_under_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_under_part(PlSqlParser.Object_under_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#nested_table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_type_def(PlSqlParser.Nested_table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sqlj_object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type(PlSqlParser.Sqlj_object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body(PlSqlParser.Type_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_body_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_body_elements(PlSqlParser.Type_body_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#map_order_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_func_declaration(PlSqlParser.Map_order_func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subprog_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprog_decl_in_type(PlSqlParser.Subprog_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#proc_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_decl_in_type(PlSqlParser.Proc_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#func_decl_in_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_decl_in_type(PlSqlParser.Func_decl_in_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constructor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_declaration(PlSqlParser.Constructor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modifier_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_clause(PlSqlParser.Modifier_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_member_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_member_spec(PlSqlParser.Object_member_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sqlj_object_type_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlj_object_type_attr(PlSqlParser.Sqlj_object_type_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#element_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec(PlSqlParser.Element_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#element_spec_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement_spec_options(PlSqlParser.Element_spec_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subprogram_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogram_spec(PlSqlParser.Subprogram_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#overriding_subprogram_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverriding_subprogram_spec(PlSqlParser.Overriding_subprogram_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#overriding_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverriding_function_spec(PlSqlParser.Overriding_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_procedure_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_procedure_spec(PlSqlParser.Type_procedure_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_function_spec(PlSqlParser.Type_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constructor_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_spec(PlSqlParser.Constructor_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#map_order_function_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_order_function_spec(PlSqlParser.Map_order_function_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pragma_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_clause(PlSqlParser.Pragma_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pragma_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_elements(PlSqlParser.Pragma_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_elements_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_elements_parameter(PlSqlParser.Type_elements_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(PlSqlParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(PlSqlParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session(PlSqlParser.Alter_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_session_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session_set_clause(PlSqlParser.Alter_session_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(PlSqlParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sequence_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_spec(PlSqlParser.Sequence_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sequence_start_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_start_clause(PlSqlParser.Sequence_start_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(PlSqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cluster_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_index_clause(PlSqlParser.Cluster_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cluster_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_name(PlSqlParser.Cluster_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index_clause(PlSqlParser.Table_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#bitmap_join_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitmap_join_index_clause(PlSqlParser.Bitmap_join_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_expr(PlSqlParser.Index_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_properties(PlSqlParser.Index_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#domain_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_index_clause(PlSqlParser.Domain_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#local_domain_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_domain_index_clause(PlSqlParser.Local_domain_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlindex_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlindex_clause(PlSqlParser.Xmlindex_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#local_xmlindex_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_xmlindex_clause(PlSqlParser.Local_xmlindex_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#global_partitioned_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_partitioned_index(PlSqlParser.Global_partitioned_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_partitioning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_partitioning_clause(PlSqlParser.Index_partitioning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#local_partitioned_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_partitioned_index(PlSqlParser.Local_partitioned_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#on_range_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_range_partitioned_table(PlSqlParser.On_range_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#on_list_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_list_partitioned_table(PlSqlParser.On_list_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#on_hash_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_hash_partitioned_table(PlSqlParser.On_hash_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#on_comp_partitioned_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_comp_partitioned_table(PlSqlParser.On_comp_partitioned_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_subpartition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_subpartition_clause(PlSqlParser.Index_subpartition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#odci_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOdci_parameters(PlSqlParser.Odci_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#indextype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndextype(PlSqlParser.IndextypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index(PlSqlParser.Alter_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_index_ops_set1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_ops_set1(PlSqlParser.Alter_index_ops_set1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_index_ops_set2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_ops_set2(PlSqlParser.Alter_index_ops_set2Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#visible_or_invisible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisible_or_invisible(PlSqlParser.Visible_or_invisibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#monitoring_nomonitoring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonitoring_nomonitoring(PlSqlParser.Monitoring_nomonitoringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rebuild_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRebuild_clause(PlSqlParser.Rebuild_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_index_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_partitioning(PlSqlParser.Alter_index_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_index_default_attrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_index_default_attrs(PlSqlParser.Modify_index_default_attrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_hash_index_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_hash_index_partition(PlSqlParser.Add_hash_index_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#coalesce_index_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoalesce_index_partition(PlSqlParser.Coalesce_index_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_index_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_index_partition(PlSqlParser.Modify_index_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_index_partitions_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_index_partitions_ops(PlSqlParser.Modify_index_partitions_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rename_index_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_index_partition(PlSqlParser.Rename_index_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_index_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_partition(PlSqlParser.Drop_index_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#split_index_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplit_index_partition(PlSqlParser.Split_index_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_partition_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_partition_description(PlSqlParser.Index_partition_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_index_subpartition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_index_subpartition(PlSqlParser.Modify_index_subpartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_name_old}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name_old(PlSqlParser.Partition_name_oldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#new_partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_partition_name(PlSqlParser.New_partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#new_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_index_name(PlSqlParser.New_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(PlSqlParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user(PlSqlParser.Alter_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_identified_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_identified_by(PlSqlParser.Alter_identified_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#identified_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentified_by(PlSqlParser.Identified_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#identified_other_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentified_other_clause(PlSqlParser.Identified_other_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#user_tablespace_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_tablespace_clause(PlSqlParser.User_tablespace_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#quota_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuota_clause(PlSqlParser.Quota_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#profile_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfile_clause(PlSqlParser.Profile_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#role_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_clause(PlSqlParser.Role_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#user_default_role_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_default_role_clause(PlSqlParser.User_default_role_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#password_expire_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword_expire_clause(PlSqlParser.Password_expire_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#user_lock_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_lock_clause(PlSqlParser.User_lock_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#user_editions_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_editions_clause(PlSqlParser.User_editions_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_user_editions_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_editions_clause(PlSqlParser.Alter_user_editions_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#proxy_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProxy_clause(PlSqlParser.Proxy_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#container_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_names(PlSqlParser.Container_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_container_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_container_data(PlSqlParser.Set_container_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_rem_container_data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_rem_container_data(PlSqlParser.Add_rem_container_dataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#container_data_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_data_clause(PlSqlParser.Container_data_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#analyze}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(PlSqlParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_extention_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extention_clause(PlSqlParser.Partition_extention_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#validation_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidation_clauses(PlSqlParser.Validation_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#online_or_offline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnline_or_offline(PlSqlParser.Online_or_offlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#into_clause1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause1(PlSqlParser.Into_clause1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_key_value(PlSqlParser.Partition_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subpartition_key_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_key_value(PlSqlParser.Subpartition_key_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#associate_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_statistics(PlSqlParser.Associate_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_association(PlSqlParser.Column_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_association}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_association(PlSqlParser.Function_associationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#indextype_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndextype_name(PlSqlParser.Indextype_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#using_statistics_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_statistics_type(PlSqlParser.Using_statistics_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#statistics_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatistics_type_name(PlSqlParser.Statistics_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#default_cost_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_cost_clause(PlSqlParser.Default_cost_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cpu_cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCpu_cost(PlSqlParser.Cpu_costContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#io_cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIo_cost(PlSqlParser.Io_costContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#network_cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_cost(PlSqlParser.Network_costContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#default_selectivity_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_selectivity_clause(PlSqlParser.Default_selectivity_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#default_selectivity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_selectivity(PlSqlParser.Default_selectivityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#storage_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_table_clause(PlSqlParser.Storage_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unified_auditing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnified_auditing(PlSqlParser.Unified_auditingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#policy_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolicy_name(PlSqlParser.Policy_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#audit_traditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_traditional(PlSqlParser.Audit_traditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#audit_direct_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_direct_path(PlSqlParser.Audit_direct_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#audit_container_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_container_clause(PlSqlParser.Audit_container_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#audit_operation_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_operation_clause(PlSqlParser.Audit_operation_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#auditing_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditing_by_clause(PlSqlParser.Auditing_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#audit_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_user(PlSqlParser.Audit_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#audit_schema_object_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAudit_schema_object_clause(PlSqlParser.Audit_schema_object_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_operation(PlSqlParser.Sql_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#auditing_on_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuditing_on_clause(PlSqlParser.Auditing_on_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_name(PlSqlParser.Model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name(PlSqlParser.Object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#profile_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfile_name(PlSqlParser.Profile_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_statement_shortcut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement_shortcut(PlSqlParser.Sql_statement_shortcutContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(PlSqlParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grant_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_statement(PlSqlParser.Grant_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#container_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_clause(PlSqlParser.Container_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_directory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_directory(PlSqlParser.Create_directoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#directory_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_name(PlSqlParser.Directory_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#directory_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_path(PlSqlParser.Directory_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_library(PlSqlParser.Alter_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#library_editionable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_editionable(PlSqlParser.Library_editionableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#library_debug}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_debug(PlSqlParser.Library_debugContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compiler_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompiler_parameters_clause(PlSqlParser.Compiler_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_value(PlSqlParser.Parameter_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#library_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_name(PlSqlParser.Library_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view(PlSqlParser.Alter_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_view_editionable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_editionable(PlSqlParser.Alter_view_editionableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(PlSqlParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#view_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_options(PlSqlParser.View_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#view_alias_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_alias_constraint(PlSqlParser.View_alias_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_view_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_view_clause(PlSqlParser.Object_view_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#inline_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_constraint(PlSqlParser.Inline_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#inline_ref_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_ref_constraint(PlSqlParser.Inline_ref_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#out_of_line_ref_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_ref_constraint(PlSqlParser.Out_of_line_ref_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_constraint(PlSqlParser.Out_of_line_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constraint_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_state(PlSqlParser.Constraint_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace(PlSqlParser.Alter_tablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datafile_tempfile_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatafile_tempfile_clauses(PlSqlParser.Datafile_tempfile_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace_logging_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_logging_clauses(PlSqlParser.Tablespace_logging_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace_group_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_group_clause(PlSqlParser.Tablespace_group_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace_group_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_group_name(PlSqlParser.Tablespace_group_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace_state_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_state_clauses(PlSqlParser.Tablespace_state_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#flashback_mode_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_mode_clause(PlSqlParser.Flashback_mode_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#new_tablespace_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_tablespace_name(PlSqlParser.New_tablespace_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tablespace(PlSqlParser.Create_tablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#permanent_tablespace_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermanent_tablespace_clause(PlSqlParser.Permanent_tablespace_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace_encryption_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_encryption_spec(PlSqlParser.Tablespace_encryption_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogging_clause(PlSqlParser.Logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#extent_management_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtent_management_clause(PlSqlParser.Extent_management_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#segment_management_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_management_clause(PlSqlParser.Segment_management_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#temporary_tablespace_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporary_tablespace_clause(PlSqlParser.Temporary_tablespace_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#undo_tablespace_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndo_tablespace_clause(PlSqlParser.Undo_tablespace_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace_retention_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace_retention_clause(PlSqlParser.Tablespace_retention_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datafile_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatafile_specification(PlSqlParser.Datafile_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tempfile_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTempfile_specification(PlSqlParser.Tempfile_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datafile_tempfile_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatafile_tempfile_spec(PlSqlParser.Datafile_tempfile_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#redo_log_file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedo_log_file_spec(PlSqlParser.Redo_log_file_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#autoextend_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoextend_clause(PlSqlParser.Autoextend_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#maxsize_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxsize_clause(PlSqlParser.Maxsize_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#build_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_clause(PlSqlParser.Build_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parallel_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_clause(PlSqlParser.Parallel_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_materialized_view(PlSqlParser.Alter_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_mv_option1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_mv_option1(PlSqlParser.Alter_mv_option1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_mv_refresh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_mv_refresh(PlSqlParser.Alter_mv_refreshContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollback_segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_segment(PlSqlParser.Rollback_segmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_mv_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_mv_column_clause(PlSqlParser.Modify_mv_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_materialized_view_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_materialized_view_log(PlSqlParser.Alter_materialized_view_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_mv_log_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_mv_log_column_clause(PlSqlParser.Add_mv_log_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#move_mv_log_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_mv_log_clause(PlSqlParser.Move_mv_log_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#mv_log_augmentation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_augmentation(PlSqlParser.Mv_log_augmentationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datetime_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_expr(PlSqlParser.Datetime_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#interval_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expr(PlSqlParser.Interval_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#synchronous_or_asynchronous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynchronous_or_asynchronous(PlSqlParser.Synchronous_or_asynchronousContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#including_or_excluding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluding_or_excluding(PlSqlParser.Including_or_excludingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_materialized_view_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view_log(PlSqlParser.Create_materialized_view_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#new_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_values_clause(PlSqlParser.New_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#mv_log_purge_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMv_log_purge_clause(PlSqlParser.Mv_log_purge_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view(PlSqlParser.Create_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_mv_refresh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_mv_refresh(PlSqlParser.Create_mv_refreshContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_context}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_context(PlSqlParser.Create_contextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#oracle_namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOracle_namespace(PlSqlParser.Oracle_namespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_cluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cluster(PlSqlParser.Create_clusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(PlSqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmltype_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_table(PlSqlParser.Xmltype_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmltype_virtual_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_virtual_columns(PlSqlParser.Xmltype_virtual_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmltype_column_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_column_properties(PlSqlParser.Xmltype_column_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmltype_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmltype_storage(PlSqlParser.Xmltype_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlschema_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlschema_spec(PlSqlParser.Xmlschema_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table(PlSqlParser.Object_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#oid_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_index_clause(PlSqlParser.Oid_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#oid_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOid_clause(PlSqlParser.Oid_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_properties(PlSqlParser.Object_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_table_substitution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_table_substitution(PlSqlParser.Object_table_substitutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relational_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_table(PlSqlParser.Relational_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relational_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_properties(PlSqlParser.Relational_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_partitioning_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partitioning_clauses(PlSqlParser.Table_partitioning_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partitions(PlSqlParser.Range_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partitions(PlSqlParser.List_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions(PlSqlParser.Hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#individual_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_partitions(PlSqlParser.Individual_hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hash_partitions_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partitions_by_quantity(PlSqlParser.Hash_partitions_by_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hash_partition_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_partition_quantity(PlSqlParser.Hash_partition_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#composite_range_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_range_partitions(PlSqlParser.Composite_range_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#composite_list_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_list_partitions(PlSqlParser.Composite_list_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#composite_hash_partitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComposite_hash_partitions(PlSqlParser.Composite_hash_partitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#reference_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_partitioning(PlSqlParser.Reference_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#reference_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_partition_desc(PlSqlParser.Reference_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#system_partitioning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_partitioning(PlSqlParser.System_partitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#range_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_partition_desc(PlSqlParser.Range_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#list_partition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_partition_desc(PlSqlParser.List_partition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subpartition_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_template(PlSqlParser.Subpartition_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hash_subpartition_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subpartition_quantity(PlSqlParser.Hash_subpartition_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subpartition_by_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_range(PlSqlParser.Subpartition_by_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subpartition_by_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_list(PlSqlParser.Subpartition_by_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subpartition_by_hash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_by_hash(PlSqlParser.Subpartition_by_hashContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subpartition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartition_name(PlSqlParser.Subpartition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#range_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_subpartition_desc(PlSqlParser.Range_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#list_subpartition_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_subpartition_desc(PlSqlParser.List_subpartition_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#individual_hash_subparts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndividual_hash_subparts(PlSqlParser.Individual_hash_subpartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hash_subparts_by_quantity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHash_subparts_by_quantity(PlSqlParser.Hash_subparts_by_quantityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#range_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_values_clause(PlSqlParser.Range_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#list_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_values_clause(PlSqlParser.List_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_partition_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_partition_description(PlSqlParser.Table_partition_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partitioning_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitioning_storage_clause(PlSqlParser.Partitioning_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_partitioning_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_partitioning_storage(PlSqlParser.Lob_partitioning_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datatype_null_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_null_enable(PlSqlParser.Datatype_null_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#size_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize_clause(PlSqlParser.Size_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_compression(PlSqlParser.Table_compressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#physical_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_attributes_clause(PlSqlParser.Physical_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_clause(PlSqlParser.Storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#deferred_segment_creation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferred_segment_creation(PlSqlParser.Deferred_segment_creationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#segment_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegment_attributes_clause(PlSqlParser.Segment_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#physical_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhysical_properties(PlSqlParser.Physical_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#row_movement_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_movement_clause(PlSqlParser.Row_movement_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#flashback_archive_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_archive_clause(PlSqlParser.Flashback_archive_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#log_grp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_grp(PlSqlParser.Log_grpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#supplemental_table_logging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_table_logging(PlSqlParser.Supplemental_table_loggingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#supplemental_log_grp_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_log_grp_clause(PlSqlParser.Supplemental_log_grp_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#supplemental_id_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_id_key_clause(PlSqlParser.Supplemental_id_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#allocate_extent_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_extent_clause(PlSqlParser.Allocate_extent_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#deallocate_unused_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_unused_clause(PlSqlParser.Deallocate_unused_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#shrink_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShrink_clause(PlSqlParser.Shrink_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#records_per_block_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecords_per_block_clause(PlSqlParser.Records_per_block_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#upgrade_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpgrade_table_clause(PlSqlParser.Upgrade_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(PlSqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#comment_on_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_column(PlSqlParser.Comment_on_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#enable_or_disable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_or_disable(PlSqlParser.Enable_or_disableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#allow_or_disallow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllow_or_disallow(PlSqlParser.Allow_or_disallowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym(PlSqlParser.Create_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#comment_on_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_table(PlSqlParser.Comment_on_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_cluster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_cluster(PlSqlParser.Alter_clusterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cache_or_nocache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCache_or_nocache(PlSqlParser.Cache_or_nocacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(PlSqlParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(PlSqlParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#startup_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartup_clauses(PlSqlParser.Startup_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#resetlogs_or_noresetlogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetlogs_or_noresetlogs(PlSqlParser.Resetlogs_or_noresetlogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#upgrade_or_downgrade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpgrade_or_downgrade(PlSqlParser.Upgrade_or_downgradeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#recovery_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_clauses(PlSqlParser.Recovery_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#begin_or_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_or_end(PlSqlParser.Begin_or_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_recovery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_recovery(PlSqlParser.General_recoveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#full_database_recovery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_database_recovery(PlSqlParser.Full_database_recoveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partial_database_recovery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial_database_recovery(PlSqlParser.Partial_database_recoveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partial_database_recovery_10g}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartial_database_recovery_10g(PlSqlParser.Partial_database_recovery_10gContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#managed_standby_recovery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManaged_standby_recovery(PlSqlParser.Managed_standby_recoveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#db_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_name(PlSqlParser.Db_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#database_file_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_file_clauses(PlSqlParser.Database_file_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#create_datafile_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_datafile_clause(PlSqlParser.Create_datafile_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_datafile_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_datafile_clause(PlSqlParser.Alter_datafile_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_tempfile_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tempfile_clause(PlSqlParser.Alter_tempfile_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#logfile_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogfile_clauses(PlSqlParser.Logfile_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_logfile_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_logfile_clauses(PlSqlParser.Add_logfile_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#log_file_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_file_group(PlSqlParser.Log_file_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_logfile_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_logfile_clauses(PlSqlParser.Drop_logfile_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#switch_logfile_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_logfile_clause(PlSqlParser.Switch_logfile_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#supplemental_db_logging}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_db_logging(PlSqlParser.Supplemental_db_loggingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_or_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_or_drop(PlSqlParser.Add_or_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#supplemental_plsql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_plsql_clause(PlSqlParser.Supplemental_plsql_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#logfile_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogfile_descriptor(PlSqlParser.Logfile_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#controlfile_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControlfile_clauses(PlSqlParser.Controlfile_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trace_file_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrace_file_clause(PlSqlParser.Trace_file_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#standby_database_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandby_database_clauses(PlSqlParser.Standby_database_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#activate_standby_db_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivate_standby_db_clause(PlSqlParser.Activate_standby_db_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#maximize_standby_db_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaximize_standby_db_clause(PlSqlParser.Maximize_standby_db_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#register_logfile_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister_logfile_clause(PlSqlParser.Register_logfile_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#commit_switchover_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_switchover_clause(PlSqlParser.Commit_switchover_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#start_standby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_standby_clause(PlSqlParser.Start_standby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#stop_standby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStop_standby_clause(PlSqlParser.Stop_standby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#convert_database_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvert_database_clause(PlSqlParser.Convert_database_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#default_settings_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_settings_clause(PlSqlParser.Default_settings_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_time_zone_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_time_zone_clause(PlSqlParser.Set_time_zone_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#instance_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstance_clauses(PlSqlParser.Instance_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#security_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_clause(PlSqlParser.Security_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain(PlSqlParser.DomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(PlSqlParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#edition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdition_name(PlSqlParser.Edition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#filenumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilenumber(PlSqlParser.FilenumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(PlSqlParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(PlSqlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_table_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_properties(PlSqlParser.Alter_table_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_table_properties_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_properties_1(PlSqlParser.Alter_table_properties_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_iot_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_iot_clauses(PlSqlParser.Alter_iot_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_mapping_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_mapping_table_clause(PlSqlParser.Alter_mapping_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_overflow_clause(PlSqlParser.Alter_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_overflow_clause(PlSqlParser.Add_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#enable_disable_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_disable_clause(PlSqlParser.Enable_disable_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#using_index_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_index_clause(PlSqlParser.Using_index_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_attributes(PlSqlParser.Index_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sort_or_nosort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_or_nosort(PlSqlParser.Sort_or_nosortContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exceptions_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExceptions_clause(PlSqlParser.Exceptions_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#move_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_table_clause(PlSqlParser.Move_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_org_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_org_table_clause(PlSqlParser.Index_org_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#mapping_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapping_table_clause(PlSqlParser.Mapping_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#key_compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_compression(PlSqlParser.Key_compressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_org_overflow_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_org_overflow_clause(PlSqlParser.Index_org_overflow_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_clauses(PlSqlParser.Column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_collection_retrieval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_collection_retrieval(PlSqlParser.Modify_collection_retrievalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collection_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_item(PlSqlParser.Collection_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rename_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_column_clause(PlSqlParser.Rename_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#old_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_column_name(PlSqlParser.Old_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#new_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_column_name(PlSqlParser.New_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_modify_drop_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_modify_drop_column_clauses(PlSqlParser.Add_modify_drop_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_clause(PlSqlParser.Drop_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_column_clauses(PlSqlParser.Modify_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_col_properties(PlSqlParser.Modify_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_col_substitutable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_col_substitutable(PlSqlParser.Modify_col_substitutableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_column_clause(PlSqlParser.Add_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#alter_varray_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_varray_col_properties(PlSqlParser.Alter_varray_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#varray_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_col_properties(PlSqlParser.Varray_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#varray_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_storage_clause(PlSqlParser.Varray_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_segname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_segname(PlSqlParser.Lob_segnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_item(PlSqlParser.Lob_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_storage_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_storage_parameters(PlSqlParser.Lob_storage_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_storage_clause(PlSqlParser.Lob_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_lob_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_lob_storage_clause(PlSqlParser.Modify_lob_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#modify_lob_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_lob_parameters(PlSqlParser.Modify_lob_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_parameters(PlSqlParser.Lob_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_deduplicate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_deduplicate_clause(PlSqlParser.Lob_deduplicate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_compression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_compression_clause(PlSqlParser.Lob_compression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lob_retention_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLob_retention_clause(PlSqlParser.Lob_retention_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#encryption_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_spec(PlSqlParser.Encryption_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespace(PlSqlParser.TablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#varray_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_item(PlSqlParser.Varray_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_properties(PlSqlParser.Column_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#period_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPeriod_definition(PlSqlParser.Period_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#start_time_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_time_column(PlSqlParser.Start_time_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#end_time_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_time_column(PlSqlParser.End_time_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(PlSqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#virtual_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVirtual_column_definition(PlSqlParser.Virtual_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#out_of_line_part_storage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_part_storage(PlSqlParser.Out_of_line_part_storageContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#nested_table_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table_col_properties(PlSqlParser.Nested_table_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#nested_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_item(PlSqlParser.Nested_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#substitutable_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstitutable_column_clause(PlSqlParser.Substitutable_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(PlSqlParser.Partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#supplemental_logging_props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupplemental_logging_props(PlSqlParser.Supplemental_logging_propsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_or_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_or_attribute(PlSqlParser.Column_or_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_type_col_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_col_properties(PlSqlParser.Object_type_col_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constraint_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_clauses(PlSqlParser.Constraint_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#old_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOld_constraint_name(PlSqlParser.Old_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#new_constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_constraint_name(PlSqlParser.New_constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_constraint_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_constraint_clause(PlSqlParser.Drop_constraint_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_primary_key_or_unique_or_generic_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_primary_key_or_unique_or_generic_clause(PlSqlParser.Drop_primary_key_or_unique_or_generic_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_constraint(PlSqlParser.Add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_constraint(PlSqlParser.Check_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#drop_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_constraint(PlSqlParser.Drop_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#enable_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_constraint(PlSqlParser.Enable_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#disable_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_constraint(PlSqlParser.Disable_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(PlSqlParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#references_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences_clause(PlSqlParser.References_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#on_delete_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete_clause(PlSqlParser.On_delete_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unique_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnique_key_clause(PlSqlParser.Unique_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#primary_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_key_clause(PlSqlParser.Primary_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#anonymous_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_block(PlSqlParser.Anonymous_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInvoker_rights_clause(PlSqlParser.Invoker_rights_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#call_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_spec(PlSqlParser.Call_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#java_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava_spec(PlSqlParser.Java_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#c_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_spec(PlSqlParser.C_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#c_agent_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_agent_in_clause(PlSqlParser.C_agent_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#c_parameters_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_parameters_clause(PlSqlParser.C_parameters_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PlSqlParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#default_value_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value_part(PlSqlParser.Default_value_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#seq_of_declare_specs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_declare_specs(PlSqlParser.Seq_of_declare_specsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#declare_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_spec(PlSqlParser.Declare_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(PlSqlParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subtype_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtype_declaration(PlSqlParser.Subtype_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_declaration(PlSqlParser.Cursor_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_spec(PlSqlParser.Parameter_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_declaration(PlSqlParser.Exception_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pragma_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_declaration(PlSqlParser.Pragma_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#record_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_type_def(PlSqlParser.Record_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#field_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_spec(PlSqlParser.Field_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#ref_cursor_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRef_cursor_type_def(PlSqlParser.Ref_cursor_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(PlSqlParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_def(PlSqlParser.Table_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_indexed_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_indexed_by_part(PlSqlParser.Table_indexed_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#varray_type_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarray_type_def(PlSqlParser.Varray_type_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#seq_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_of_statements(PlSqlParser.Seq_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#label_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_declaration(PlSqlParser.Label_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PlSqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_semi(PlSqlParser.Swallow_to_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(PlSqlParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(PlSqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(PlSqlParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(PlSqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PlSqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#elsif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsif_part(PlSqlParser.Elsif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_part(PlSqlParser.Else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(PlSqlParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_loop_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_loop_param(PlSqlParser.Cursor_loop_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#forall_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForall_statement(PlSqlParser.Forall_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#bounds_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBounds_clause(PlSqlParser.Bounds_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#between_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_bound(PlSqlParser.Between_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lower_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLower_bound(PlSqlParser.Lower_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#upper_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpper_bound(PlSqlParser.Upper_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#null_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_statement(PlSqlParser.Null_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#raise_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_statement(PlSqlParser.Raise_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(PlSqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PlSqlParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#procedure_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_call(PlSqlParser.Procedure_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pipe_row_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipe_row_statement(PlSqlParser.Pipe_row_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PlSqlParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_handler(PlSqlParser.Exception_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_block(PlSqlParser.Trigger_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PlSqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_statement(PlSqlParser.Sql_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#execute_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate(PlSqlParser.Execute_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamic_returning_clause(PlSqlParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#data_manipulation_language_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_manipulation_language_statements(PlSqlParser.Data_manipulation_language_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_manipulation_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_manipulation_statements(PlSqlParser.Cursor_manipulation_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#close_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_statement(PlSqlParser.Close_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#open_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_statement(PlSqlParser.Open_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#fetch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_statement(PlSqlParser.Fetch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#open_for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_for_statement(PlSqlParser.Open_for_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#transaction_control_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_control_statements(PlSqlParser.Transaction_control_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_transaction_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_command(PlSqlParser.Set_transaction_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_constraint_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraint_command(PlSqlParser.Set_constraint_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(PlSqlParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#write_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_clause(PlSqlParser.Write_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(PlSqlParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_statement(PlSqlParser.Savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(PlSqlParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(PlSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_factoring_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_factoring_clause(PlSqlParser.Subquery_factoring_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#factoring_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactoring_element(PlSqlParser.Factoring_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(PlSqlParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cycle_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle_clause(PlSqlParser.Cycle_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(PlSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_basic_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_basic_elements(PlSqlParser.Subquery_basic_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_operation_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_operation_part(PlSqlParser.Subquery_operation_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#query_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_block(PlSqlParser.Query_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selected_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_element(PlSqlParser.Selected_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PlSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#select_list_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elements(PlSqlParser.Select_list_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_ref_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_list(PlSqlParser.Table_ref_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref(PlSqlParser.Table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_ref_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux(PlSqlParser.Table_ref_auxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table_ref_aux_internal_one}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux_internal_one(PlSqlParser.Table_ref_aux_internal_oneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table_ref_aux_internal_two}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux_internal_two(PlSqlParser.Table_ref_aux_internal_twoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table_ref_aux_internal_three}
	 * labeled alternative in {@link PlSqlParser#table_ref_aux_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_ref_aux_internal_three(PlSqlParser.Table_ref_aux_internal_threeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(PlSqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#join_on_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_on_part(PlSqlParser.Join_on_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#join_using_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_using_part(PlSqlParser.Join_using_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#outer_join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_type(PlSqlParser.Outer_join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#query_partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_partition_clause(PlSqlParser.Query_partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#flashback_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashback_query_clause(PlSqlParser.Flashback_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(PlSqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_element(PlSqlParser.Pivot_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_for_clause(PlSqlParser.Pivot_for_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause(PlSqlParser.Pivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_in_clause_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_element(PlSqlParser.Pivot_in_clause_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#pivot_in_clause_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_in_clause_elements(PlSqlParser.Pivot_in_clause_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(PlSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unpivot_in_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_clause(PlSqlParser.Unpivot_in_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unpivot_in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_in_elements(PlSqlParser.Unpivot_in_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#hierarchical_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_query_clause(PlSqlParser.Hierarchical_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#start_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_part(PlSqlParser.Start_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(PlSqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#group_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_elements(PlSqlParser.Group_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollup_cube_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollup_cube_clause(PlSqlParser.Rollup_cube_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grouping_sets_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_clause(PlSqlParser.Grouping_sets_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grouping_sets_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_sets_elements(PlSqlParser.Grouping_sets_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PlSqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_clause(PlSqlParser.Model_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cell_reference_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_reference_options(PlSqlParser.Cell_reference_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#return_rows_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rows_clause(PlSqlParser.Return_rows_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#reference_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model(PlSqlParser.Reference_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#main_model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model(PlSqlParser.Main_modelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_clauses(PlSqlParser.Model_column_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column_partition_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_partition_part(PlSqlParser.Model_column_partition_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column_list(PlSqlParser.Model_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_column(PlSqlParser.Model_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_rules_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_clause(PlSqlParser.Model_rules_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_rules_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_part(PlSqlParser.Model_rules_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_rules_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_rules_element(PlSqlParser.Model_rules_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cell_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_assignment(PlSqlParser.Cell_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_iterate_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_iterate_clause(PlSqlParser.Model_iterate_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#until_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUntil_part(PlSqlParser.Until_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PlSqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#order_by_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_elements(PlSqlParser.Order_by_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(PlSqlParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#fetch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_clause(PlSqlParser.Fetch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_clause(PlSqlParser.For_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_update_of_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_of_part(PlSqlParser.For_update_of_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#for_update_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_update_options(PlSqlParser.For_update_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(PlSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set_clause(PlSqlParser.Update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_based_update_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_based_update_set_clause(PlSqlParser.Column_based_update_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(PlSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(PlSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#single_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_table_insert(PlSqlParser.Single_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multi_table_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_insert(PlSqlParser.Multi_table_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multi_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_table_element(PlSqlParser.Multi_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#conditional_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_clause(PlSqlParser.Conditional_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#conditional_insert_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_when_part(PlSqlParser.Conditional_insert_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#conditional_insert_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_insert_else_part(PlSqlParser.Conditional_insert_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#insert_into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into_clause(PlSqlParser.Insert_into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_clause(PlSqlParser.Values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(PlSqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_update_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_clause(PlSqlParser.Merge_update_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_element(PlSqlParser.Merge_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_update_delete_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_delete_part(PlSqlParser.Merge_update_delete_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#merge_insert_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert_clause(PlSqlParser.Merge_insert_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#selected_tableview}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelected_tableview(PlSqlParser.Selected_tableviewContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lock_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_statement(PlSqlParser.Lock_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#wait_nowait_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_nowait_part(PlSqlParser.Wait_nowait_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lock_table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table_element(PlSqlParser.Lock_table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(PlSqlParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_table_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_table_ref(PlSqlParser.General_table_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#static_returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatic_returning_clause(PlSqlParser.Static_returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#error_logging_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_clause(PlSqlParser.Error_logging_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#error_logging_into_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_into_part(PlSqlParser.Error_logging_into_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#error_logging_reject_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_logging_reject_part(PlSqlParser.Error_logging_reject_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dml_table_expression_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_table_expression_clause(PlSqlParser.Dml_table_expression_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_collection_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_collection_expression(PlSqlParser.Table_collection_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#subquery_restriction_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery_restriction_clause(PlSqlParser.Subquery_restriction_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sample_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_clause(PlSqlParser.Sample_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#seed_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeed_part(PlSqlParser.Seed_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(PlSqlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(PlSqlParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_expression(PlSqlParser.Cursor_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#logical_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expression(PlSqlParser.Logical_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multiset_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiset_expression(PlSqlParser.Multiset_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_expression(PlSqlParser.Relational_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#compound_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_expression(PlSqlParser.Compound_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#relational_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_operator(PlSqlParser.Relational_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#in_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_elements(PlSqlParser.In_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#between_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween_elements(PlSqlParser.Between_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(PlSqlParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#interval_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_expression(PlSqlParser.Interval_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression(PlSqlParser.Model_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#model_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel_expression_element(PlSqlParser.Model_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#single_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_column_for_loop(PlSqlParser.Single_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#multi_column_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulti_column_for_loop(PlSqlParser.Multi_column_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(PlSqlParser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(PlSqlParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#simple_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_statement(PlSqlParser.Simple_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#simple_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_case_when_part(PlSqlParser.Simple_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#searched_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_statement(PlSqlParser.Searched_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#searched_case_when_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearched_case_when_part(PlSqlParser.Searched_case_when_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#case_else_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_else_part(PlSqlParser.Case_else_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(PlSqlParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#quantified_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantified_expression(PlSqlParser.Quantified_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#string_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_function(PlSqlParser.String_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#standard_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_function(PlSqlParser.Standard_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PlSqlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#numeric_function_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function_wrapper(PlSqlParser.Numeric_function_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#numeric_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function(PlSqlParser.Numeric_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#other_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_function(PlSqlParser.Other_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause_keyword(PlSqlParser.Over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#within_or_over_clause_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_clause_keyword(PlSqlParser.Within_or_over_clause_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#standard_prediction_function_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_prediction_function_keyword(PlSqlParser.Standard_prediction_function_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(PlSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#windowing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_clause(PlSqlParser.Windowing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#windowing_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_type(PlSqlParser.Windowing_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#windowing_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowing_elements(PlSqlParser.Windowing_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(PlSqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#using_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_element(PlSqlParser.Using_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collect_order_by_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_order_by_part(PlSqlParser.Collect_order_by_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#within_or_over_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_or_over_part(PlSqlParser.Within_or_over_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cost_matrix_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_matrix_clause(PlSqlParser.Cost_matrix_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_passing_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_passing_clause(PlSqlParser.Xml_passing_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_attributes_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_attributes_clause(PlSqlParser.Xml_attributes_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_namespaces_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_namespaces_clause(PlSqlParser.Xml_namespaces_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(PlSqlParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_general_default_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_general_default_part(PlSqlParser.Xml_general_default_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_multiuse_expression_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_multiuse_expression_element(PlSqlParser.Xml_multiuse_expression_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlroot_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_version_part(PlSqlParser.Xmlroot_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlroot_param_standalone_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlroot_param_standalone_part(PlSqlParser.Xmlroot_param_standalone_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlserialize_param_enconding_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_enconding_part(PlSqlParser.Xmlserialize_param_enconding_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlserialize_param_version_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_version_part(PlSqlParser.Xmlserialize_param_version_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xmlserialize_param_ident_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXmlserialize_param_ident_part(PlSqlParser.Xmlserialize_param_ident_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sql_plus_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_plus_command(PlSqlParser.Sql_plus_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#whenever_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenever_command(PlSqlParser.Whenever_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#set_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_command(PlSqlParser.Set_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#partition_extension_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_extension_clause(PlSqlParser.Partition_extension_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(PlSqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(PlSqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PlSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PlSqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#xml_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_column_name(PlSqlParser.Xml_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cost_class_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost_class_name(PlSqlParser.Cost_class_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(PlSqlParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(PlSqlParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#rollback_segment_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_segment_name(PlSqlParser.Rollback_segment_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_var_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_var_name(PlSqlParser.Table_var_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(PlSqlParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#routine_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutine_name(PlSqlParser.Routine_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#package_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_name(PlSqlParser.Package_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#implementation_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplementation_type_name(PlSqlParser.Implementation_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_name(PlSqlParser.Parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#reference_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference_model_name(PlSqlParser.Reference_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#main_model_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_model_name(PlSqlParser.Main_model_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#container_tableview_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer_tableview_name(PlSqlParser.Container_tableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#aggregate_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function_name(PlSqlParser.Aggregate_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#query_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_name(PlSqlParser.Query_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grantee_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee_name(PlSqlParser.Grantee_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(PlSqlParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constraint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_name(PlSqlParser.Constraint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#label_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_name(PlSqlParser.Label_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(PlSqlParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#sequence_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_name(PlSqlParser.Sequence_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#exception_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_name(PlSqlParser.Exception_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(PlSqlParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#procedure_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_name(PlSqlParser.Procedure_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(PlSqlParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#variable_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_name(PlSqlParser.Variable_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(PlSqlParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(PlSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#record_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_name(PlSqlParser.Record_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#collection_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection_name(PlSqlParser.Collection_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#link_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink_name(PlSqlParser.Link_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PlSqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#tableview_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableview_name(PlSqlParser.Tableview_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#char_set_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_set_name(PlSqlParser.Char_set_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#synonym_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynonym_name(PlSqlParser.Synonym_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#schema_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_object_name(PlSqlParser.Schema_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#dir_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir_object_name(PlSqlParser.Dir_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#user_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_object_name(PlSqlParser.User_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#grant_object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_object_name(PlSqlParser.Grant_object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(PlSqlParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#paren_column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_column_list(PlSqlParser.Paren_column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#keep_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeep_clause(PlSqlParser.Keep_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument(PlSqlParser.Function_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_argument_analytic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_analytic(PlSqlParser.Function_argument_analyticContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#function_argument_modeling}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_argument_modeling(PlSqlParser.Function_argument_modelingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#respect_or_ignore_nulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRespect_or_ignore_nulls(PlSqlParser.Respect_or_ignore_nullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PlSqlParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#type_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_spec(PlSqlParser.Type_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#datatype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype(PlSqlParser.DatatypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#precision_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_part(PlSqlParser.Precision_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#native_datatype_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNative_datatype_element(PlSqlParser.Native_datatype_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#bind_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind_variable(PlSqlParser.Bind_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element(PlSqlParser.General_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#general_element_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_element_part(PlSqlParser.General_element_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#table_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_element(PlSqlParser.Table_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#object_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_privilege(PlSqlParser.Object_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#system_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_privilege(PlSqlParser.System_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(PlSqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#numeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric(PlSqlParser.NumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#numeric_negative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_negative(PlSqlParser.Numeric_negativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#quoted_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuoted_string(PlSqlParser.Quoted_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PlSqlParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#id_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_expression(PlSqlParser.Id_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#outer_join_sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join_sign(PlSqlParser.Outer_join_signContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#regular_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegular_id(PlSqlParser.Regular_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#non_reserved_keywords_in_12c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_keywords_in_12c(PlSqlParser.Non_reserved_keywords_in_12cContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#non_reserved_keywords_pre12c}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_keywords_pre12c(PlSqlParser.Non_reserved_keywords_pre12cContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#string_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_function_name(PlSqlParser.String_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlSqlParser#numeric_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_function_name(PlSqlParser.Numeric_function_nameContext ctx);
}