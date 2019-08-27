package play;

import org.antlr.v4.runtime.ParserRuleContext;
import play.PlayScriptParser.*;

import java.util.Stack;

/**
 * 第一遍扫描：识别出所有类型（包括类和函数)，以及Scope
 */
public class TypeAndScopeScanner extends PlayScriptBaseListener {

    private AnnotatedTree cr = null;

    private Stack<Scope> scopeStack = new Stack<Scope>();

    public TypeAndScopeScanner(AnnotatedTree cr) {
        this.cr = cr;
    }

    private Scope pushScope(Scope scope, ParserRuleContext ctx) {
        cr.node2Scope.put(ctx, scope);
        scope.ctx = ctx;

        scopeStack.push(scope);
        return scope;
    }

    //从栈中弹出scope
    private void popScope() {
        scopeStack.pop();
    }

    //在遍历树的过程中，当前的Scope
    private Scope currentScope() {
        if (scopeStack.size() > 0) {
            return scopeStack.peek();
        } else {
            return null;
        }
    }

    @Override
    public void enterProg(ProgContext ctx) {
        BlockScope scope = new BlockScope(currentScope(), ctx);
        cr.scopeTree = scope; //scope的根
        pushScope(scope, ctx);
    }

    @Override
    public void exitProg(ProgContext ctx) {
        popScope();
    }

    @Override
    public void enterBlock(BlockContext ctx) {
        BlockScope scope = new BlockScope(currentScope(), ctx);
        pushScope(scope, ctx);
    }

    @Override
    public void exitBlock(BlockContext ctx) {
        popScope();
    }


    @Override
    public void enterStatement(StatementContext ctx) {
        //为for建立额外的Scope
        if (ctx.FOR() != null) {
            BlockScope scope = new BlockScope(currentScope(), ctx);
            pushScope(scope, ctx);
        }
    }

    @Override
    public void exitStatement(StatementContext ctx) {
        //释放for语句的外层scope
        if (ctx.FOR() != null) {
            popScope();
        }
    }

    @Override
    public void enterFunctionDeclaration(FunctionDeclarationContext ctx) {
        // 把方法的签名存到符号表中,目前不支持方法的重载，每个方法名称必须唯一，并且也不能跟变量名称冲突
        String idName = ctx.IDENTIFIER().getText();
        Function function = new Function(idName, currentScope(), ctx);

        cr.types.add(function);

        // TODO 需要查重
        currentScope().symbols.add(function);

        // 创建一个新的scope
        pushScope(function, ctx);
    }

    @Override
    public void exitFunctionDeclaration(FunctionDeclarationContext ctx) {
        popScope();
    }


    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        // 把类的签名存到符号表中，不能跟已有符号名称冲突
        String idName = ctx.IDENTIFIER().getText();

        Class theClass = new Class(idName, ctx);
        cr.types.add(theClass);

        if (cr.lookupClass(currentScope(), idName) != null) {
            cr.log("duplicate class name:" + idName, ctx); // 只是报警，但仍然继续解析
        }

        currentScope().symbols.add(theClass);

        // 创建一个新的scope
        pushScope(theClass, ctx);

    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        popScope();
    }



    @Override
    public void enterClassOrInterfaceType(ClassOrInterfaceTypeContext ctx) {
        if (ctx.IDENTIFIER() != null) {
            String idName = ctx.getText();
            Class theClass = cr.lookupClass(currentScope(), idName);
            cr.typeOfNode.put(ctx, theClass);
        }
    }

}