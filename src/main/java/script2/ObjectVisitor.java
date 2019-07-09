package script2;

import script2.PlayScriptParser.ArgumentsContext;
import script2.PlayScriptParser.ArrayInitializerContext;
import script2.PlayScriptParser.BlockContext;
import script2.PlayScriptParser.BlockStatementContext;
import script2.PlayScriptParser.EnhancedForControlContext;
import script2.PlayScriptParser.ExplicitGenericInvocationSuffixContext;
import script2.PlayScriptParser.ExpressionContext;
import script2.PlayScriptParser.ExpressionListContext;
import script2.PlayScriptParser.FloatLiteralContext;
import script2.PlayScriptParser.ForControlContext;
import script2.PlayScriptParser.ForInitContext;
import script2.PlayScriptParser.IntegerLiteralContext;
import script2.PlayScriptParser.LiteralContext;
import script2.PlayScriptParser.ParExpressionContext;
import script2.PlayScriptParser.PrimaryContext;
import script2.PlayScriptParser.PrimitiveTypeContext;
import script2.PlayScriptParser.StatementContext;
import script2.PlayScriptParser.SuperSuffixContext;
import script2.PlayScriptParser.SwitchBlockStatementGroupContext;
import script2.PlayScriptParser.SwitchLabelContext;
import script2.PlayScriptParser.TypeTypeContext;
import script2.PlayScriptParser.VariableDeclaratorContext;
import script2.PlayScriptParser.VariableDeclaratorIdContext;
import script2.PlayScriptParser.VariableDeclaratorsContext;
import script2.PlayScriptParser.VariableInitializerContext;

public class ObjectVisitor extends PlayScriptBaseVisitor<Object> {

    @Override
    public Object visitArguments(ArgumentsContext ctx) {
        return super.visitArguments(ctx);
    }

    @Override
    public Object visitArrayInitializer(ArrayInitializerContext ctx) {
        return super.visitArrayInitializer(ctx);
    }

    @Override
    public Object visitBlock(BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) {
        return super.visitBlockStatement(ctx);
    }

    @Override
    public Object visitEnhancedForControl(EnhancedForControlContext ctx) {
        return super.visitEnhancedForControl(ctx);
    }

    @Override
    public Object visitExplicitGenericInvocationSuffix(ExplicitGenericInvocationSuffixContext ctx) {
        return super.visitExplicitGenericInvocationSuffix(ctx);
    }

    @Override
    public Object visitExpression(ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    public Object visitExpressionList(ExpressionListContext ctx) {
        return super.visitExpressionList(ctx);
    }

    @Override
    public Object visitFloatLiteral(FloatLiteralContext ctx) {
        return super.visitFloatLiteral(ctx);
    }

    @Override
    public Object visitForControl(ForControlContext ctx) {
        return super.visitForControl(ctx);
    }

    @Override
    public Object visitForInit(ForInitContext ctx) {
        return super.visitForInit(ctx);
    }

    @Override
    public Object visitIntegerLiteral(IntegerLiteralContext ctx) {
        return super.visitIntegerLiteral(ctx);
    }

    @Override
    public Object visitLiteral(LiteralContext ctx) {
        return super.visitLiteral(ctx);
    }

    @Override
    public Object visitParExpression(ParExpressionContext ctx) {
        return super.visitParExpression(ctx);
    }

    @Override
    public Object visitPrimary(PrimaryContext ctx) {
        return super.visitPrimary(ctx);
    }

    @Override
    public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
        return super.visitPrimitiveType(ctx);
    }

    @Override
    public Object visitStatement(StatementContext ctx) {
        return super.visitStatement(ctx);
    }

    @Override
    public Object visitSuperSuffix(SuperSuffixContext ctx) {
        return super.visitSuperSuffix(ctx);
    }

    @Override
    public Object visitSwitchBlockStatementGroup(SwitchBlockStatementGroupContext ctx) {
        return super.visitSwitchBlockStatementGroup(ctx);
    }

    @Override
    public Object visitSwitchLabel(SwitchLabelContext ctx) {
        return super.visitSwitchLabel(ctx);
    }

    @Override
    public Object visitTypeType(TypeTypeContext ctx) {
        return super.visitTypeType(ctx);
    }

    @Override
    public Object visitVariableDeclarator(VariableDeclaratorContext ctx) {
        return super.visitVariableDeclarator(ctx);
    }

    @Override
    public Object visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        return super.visitVariableDeclaratorId(ctx);
    }

    @Override
    public Object visitVariableDeclarators(VariableDeclaratorsContext ctx) {
        return super.visitVariableDeclarators(ctx);
    }

    @Override
    public Object visitVariableInitializer(VariableInitializerContext ctx) {
        return super.visitVariableInitializer(ctx);
    }

}