package script2;

import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;

import script2.PlayScriptParser.ArgumentsContext;
import script2.PlayScriptParser.ArrayInitializerContext;
import script2.PlayScriptParser.BlockContext;
import script2.PlayScriptParser.BlockStatementContext;
import script2.PlayScriptParser.BlockStatementsContext;
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
import script2.PlayScriptParser.ProgContext;
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
    private Map<ParserRuleContext, Symbol> id2Symbol = null;
    private Scope scopeTree = null;

    private Stack<ActivationRecord> activationRecordStack = new Stack<ActivationRecord>();

    private void setIdValue(String idName, ParserRuleContext ctx, Object value) {
        Symbol symbol = id2Symbol.get(ctx);
        boolean found = false;
        for (ActivationRecord record : activationRecordStack) {
            if (record.scope == symbol.scope) {
                found = true;
                record.variables.put(idName, value);
                break;
            }
        }

        if (!found) {
            System.out.println("Unable to set variable value: " + idName);
        }
    }

    private Object getIdValue(String idName, ParserRuleContext ctx) {
        Object rtn = null;
        Symbol symbol = id2Symbol.get(ctx);
        boolean found = false;
        for (ActivationRecord record : activationRecordStack) {
            if (record.scope == symbol.scope) {
                found = true;
                rtn = record.variables.get(idName);
                break;
            }
        }

        if (!found) {
            System.out.println("Unable to get variable value: " + idName);
        }
        return rtn;
    }

    public ObjectVisitor(Map<ParserRuleContext, Symbol> id2Symbol, Scope scopeTree) {
        this.id2Symbol = id2Symbol;
        this.scopeTree = scopeTree;
    }

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
        //添加ActivationRecord
        Scope scope = scopeTree.findDescendantByContext(ctx);
        if (scope !=null){
            ActivationRecord record = new ActivationRecord(scope);
            activationRecordStack.push(record);
        }
        
        Object rtn = visitBlockStatements(ctx.blockStatements());


        //去掉ActivationRecord
        activationRecordStack.pop();
        return rtn;
    }

    @Override
    public Object visitBlockStatement(BlockStatementContext ctx) {
        Object rtn = null;
        if (ctx.variableDeclarators() != null) {
            rtn = visitVariableDeclarators(ctx.variableDeclarators());
        } else if (ctx.statement() != null) {
            rtn = visitStatement(ctx.statement());
        }
        return rtn;
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
        Object rtn = null;
        if (ctx.bop != null) {
            Object left = visitExpression(ctx.expression(0));
            Object right = visitExpression(ctx.expression(1));
            switch (ctx.bop.getType()) {
            case PlayScriptParser.ADD:
                rtn = (Integer) left + (Integer) right;
                break;
            case PlayScriptParser.SUB:
                rtn = (Integer) left - (Integer) right;
                break;
            case PlayScriptParser.MUL:
                rtn = (Integer) left * (Integer) right;
                break;
            case PlayScriptParser.DIV:
                rtn = (Integer) left / (Integer) right;
                break;
            case PlayScriptParser.EQUAL:
                rtn = (Integer) left == (Integer) right;
                break;
            case PlayScriptParser.LE:
                rtn = (Integer) left <= (Integer) right;
                break;
            case PlayScriptParser.LT:
                rtn = (Integer) left < (Integer) right;
                break;
            case PlayScriptParser.GE:
                rtn = (Integer) left >= (Integer) right;
                break;
            case PlayScriptParser.GT:
                rtn = (Integer) left > (Integer) right;
                break;
            case PlayScriptParser.ASSIGN:
                setIdValue(ctx.expression(0).getText(),ctx, right);
                break;
            default:
                break;
            }
        } else if (ctx.primary() != null) {
            rtn = visitPrimary(ctx.primary());
        }
        return rtn;
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
        Object rtn = null;
        if (ctx.DECIMAL_LITERAL() != null) {
            rtn = Integer.valueOf(ctx.DECIMAL_LITERAL().getText());
        }
        return rtn;
    }

    @Override
    public Object visitLiteral(LiteralContext ctx) {
        Object rtn = null;
        if (ctx.integerLiteral() != null) {
            rtn = visitIntegerLiteral(ctx.integerLiteral());
        }
        return rtn;
    }

    @Override
    public Object visitParExpression(ParExpressionContext ctx) {
        return visitExpression(ctx.expression());
    }

    @Override
    public Object visitPrimary(PrimaryContext ctx) {
        Object rtn = null;
        if (ctx.literal() != null) {
            rtn = visitLiteral(ctx.literal());
        } else if (ctx.IDENTIFIER() != null) {
            rtn = getIdValue(ctx.IDENTIFIER().getText(),ctx);
        }
        return rtn;
    }

    @Override
    public Object visitPrimitiveType(PrimitiveTypeContext ctx) {
        Object rtn = null;
        if (ctx.INT() != null) {
            rtn = PlayScriptParser.INT;
        } else if (ctx.LONG() != null) {
            rtn = PlayScriptParser.LONG;
        } else if (ctx.FLOAT() != null) {
            rtn = PlayScriptParser.FLOAT;
        } else if (ctx.DOUBLE() != null) {
            rtn = PlayScriptParser.DOUBLE;
        } else if (ctx.BOOLEAN() != null) {
            rtn = PlayScriptParser.BOOLEAN;
        } else if (ctx.CHAR() != null) {
            rtn = PlayScriptParser.CHAR;
        } else if (ctx.SHORT() != null) {
            rtn = PlayScriptParser.SHORT;
        } else if (ctx.BYTE() != null) {
            rtn = PlayScriptParser.BYTE;
        }
        return rtn;
    }

    @Override
    public Object visitStatement(StatementContext ctx) {
        Object rtn = null;
        if (ctx.statementExpression != null) {
            rtn = visitExpression(ctx.statementExpression);
        } else if (ctx.IF() != null) {
            Boolean condition = (Boolean) visitParExpression(ctx.parExpression());
            if (Boolean.TRUE == condition) {
                rtn = visitStatement(ctx.statement(0));
            } else if (ctx.ELSE() != null) {
                rtn = visitStatement(ctx.statement(1));
            }
        } else if (ctx.FOR() != null) {
            //添加ActivationRecord
            Scope scope = scopeTree.findDescendantByContext(ctx);
            ActivationRecord record = new ActivationRecord(scope);
            activationRecordStack.push(record);

            while (true) {
                if ((Boolean) visitForControl(ctx.forControl())) {
                    rtn=visitStatement(ctx.statement(0));
                } else {
                    break;
                }
            }

            //去掉ActivationRecord
            activationRecordStack.pop();
        } else if (ctx.blockLabel != null){
            rtn = visitBlock(ctx.blockLabel);
        }
        return rtn;
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
        return visitPrimitiveType(ctx.primitiveType());
    }

    @Override
    public Object visitVariableDeclarator(VariableDeclaratorContext ctx) {
        Object rtn = null;
        String id = (String) visitVariableDeclaratorId(ctx.variableDeclaratorId());
        if (ctx.variableInitializer() != null) {
            rtn = visitVariableInitializer(ctx.variableInitializer());
            setIdValue(id,ctx.variableDeclaratorId(), rtn);
        }
        return rtn;
    }

    @Override
    public Object visitVariableDeclaratorId(VariableDeclaratorIdContext ctx) {
        return ctx.IDENTIFIER().getText();
    }

    @Override
    public Object visitVariableDeclarators(VariableDeclaratorsContext ctx) {
        Object rtn = null;
        // Integer typeType = (Integer)visitTypeType(ctx.typeType()); //后面要利用这个类型信息
        for (VariableDeclaratorContext child : ctx.variableDeclarator()) {
            rtn = visitVariableDeclarator(child);
        }
        return rtn;
    }

    @Override
    public Object visitVariableInitializer(VariableInitializerContext ctx) {
        Object rtn = null;
        if (ctx.expression() != null) {
            rtn = visitExpression(ctx.expression());
        }
        return rtn;
    }

    @Override
    public Object visitBlockStatements(BlockStatementsContext ctx) {
        Object rtn = null;
        for (BlockStatementContext child : ctx.blockStatement()) {
            rtn = visitBlockStatement(child);
        }
        return rtn;
    }

    @Override
    public Object visitProg(ProgContext ctx) {
        Object rtn = null;
        activationRecordStack.push(new ActivationRecord(scopeTree));

        rtn = visitBlockStatements(ctx.blockStatements());

        activationRecordStack.pop();

        return rtn;
    }

}