// Generated from PlayScript.g4 by ANTLR 4.7.2

package script2;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayScript}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayScript#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(PlayScript.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(PlayScript.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(PlayScript.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(PlayScript.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(PlayScript.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(PlayScript.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(PlayScript.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(PlayScript.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(PlayScript.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(PlayScript.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(PlayScript.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(PlayScript.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(PlayScript.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(PlayScript.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(PlayScript.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(PlayScript.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(PlayScript.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(PlayScript.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(PlayScript.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(PlayScript.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(PlayScript.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(PlayScript.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(PlayScript.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(PlayScript.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(PlayScript.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(PlayScript.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(PlayScript.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(PlayScript.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(PlayScript.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(PlayScript.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(PlayScript.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(PlayScript.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(PlayScript.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(PlayScript.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(PlayScript.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(PlayScript.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(PlayScript.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(PlayScript.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(PlayScript.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(PlayScript.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(PlayScript.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(PlayScript.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(PlayScript.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(PlayScript.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(PlayScript.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(PlayScript.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(PlayScript.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(PlayScript.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(PlayScript.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(PlayScript.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(PlayScript.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(PlayScript.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(PlayScript.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(PlayScript.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(PlayScript.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(PlayScript.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(PlayScript.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(PlayScript.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(PlayScript.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(PlayScript.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(PlayScript.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(PlayScript.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(PlayScript.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PlayScript.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(PlayScript.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(PlayScript.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(PlayScript.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PlayScript.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(PlayScript.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(PlayScript.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(PlayScript.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(PlayScript.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(PlayScript.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(PlayScript.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(PlayScript.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(PlayScript.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(PlayScript.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(PlayScript.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(PlayScript.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(PlayScript.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(PlayScript.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(PlayScript.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PlayScript.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(PlayScript.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(PlayScript.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(PlayScript.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(PlayScript.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(PlayScript.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(PlayScript.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(PlayScript.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(PlayScript.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(PlayScript.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(PlayScript.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(PlayScript.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(PlayScript.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(PlayScript.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(PlayScript.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(PlayScript.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(PlayScript.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(PlayScript.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(PlayScript.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(PlayScript.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(PlayScript.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayScript#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(PlayScript.ArgumentsContext ctx);
}