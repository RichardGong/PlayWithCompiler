package play;

import org.antlr.v4.runtime.ParserRuleContext;
import play.PlayScriptParser.*;

import java.util.Stack;

/**
 * 第一遍扫描：识别出所有类型（包括类和函数)，以及Scope。（但函数的参数信息要等到下一个阶段才会添加进去。）
 */
public class TypeAndScopeScanner extends PlayScriptBaseListener {

    private AnnotatedTree at = null;

    private Stack<Scope> scopeStack = new Stack<Scope>();

    public TypeAndScopeScanner(AnnotatedTree at) {
        this.at = at;
    }

    private Scope pushScope(Scope scope, ParserRuleContext ctx) {
        at.node2Scope.put(ctx, scope);
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
        NameSpace scope = new NameSpace("", currentScope(), ctx);
        at.nameSpace = scope; //scope的根
        pushScope(scope, ctx);
    }

    @Override
    public void exitProg(ProgContext ctx) {
        popScope();
    }

    @Override
    public void enterBlock(BlockContext ctx) {

        //对于函数，不需要再额外建一个scope
        if (!(ctx.parent instanceof FunctionBodyContext)){
            BlockScope scope = new BlockScope(currentScope(), ctx);
            currentScope().addSymbol(scope);
            pushScope(scope, ctx);
        }
    }

    @Override
    public void exitBlock(BlockContext ctx) {
        if (!(ctx.parent instanceof FunctionBodyContext)) {
            popScope();
        }
    }


    @Override
    public void enterStatement(StatementContext ctx) {
        //为for建立额外的Scope
        if (ctx.FOR() != null) {
            BlockScope scope = new BlockScope(currentScope(), ctx);
            currentScope().addSymbol(scope);
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
        String idName = ctx.IDENTIFIER().getText();

        //注意：目前funtion的信息并不完整，参数要等到TypeResolver.java中去确定。
        Function function = new Function(idName, currentScope(), ctx);

        at.types.add(function);

        currentScope().addSymbol(function);

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
        at.types.add(theClass);

        if (at.lookupClass(currentScope(), idName) != null) {
            at.log("duplicate class name:" + idName, ctx); // 只是报警，但仍然继续解析
        }

        currentScope().addSymbol(theClass);

        // 创建一个新的scope
        pushScope(theClass, ctx);

    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        popScope();
    }


}