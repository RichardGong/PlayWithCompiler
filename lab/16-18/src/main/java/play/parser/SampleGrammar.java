package play.parser;

/**
 * 创建一些示例用的文法。
 * 包括：
 * 1.词法规则
 * 2.消除了左递归的表达式的语法规则
 * 3.带有左递归的表达式的语法规则
 * 4.语句相关的语法规则
 */
public class SampleGrammar {


    public static GrammarNode statementGrammar(){
        GrammarNode exp = expressionGrammar();

        GrammarNode blockStatements = new GrammarNode("blockStatements", GrammarNodeType.Or);
        GrammarNode blockStatement = blockStatements.createChild("blockStatement", GrammarNodeType.Or);
        blockStatements.addChild(blockStatements);
        blockStatements.createChild( GrammarNodeType.Epsilon);

        GrammarNode variableDeclarator = blockStatement.createChild("variableDeclarator",GrammarNodeType.And);
        variableDeclarator.createChild(new Token("INT","int"));
        variableDeclarator.createChild(new Token("ID"));
        GrammarNode variableInitiator = variableDeclarator.createChild(GrammarNodeType.Or);
        GrammarNode variableInitiator_1 = variableInitiator.createChild(GrammarNodeType.And);
        variableInitiator_1.createChild(new Token("ASSIGN","="));
        variableInitiator_1.addChild(exp);
        variableInitiator_1.createChild(new Token("SEMI",";"));
        variableInitiator.createChild( GrammarNodeType.Epsilon);

        GrammarNode stmt = blockStatement.createChild("statement", GrammarNodeType.Or);

        //expression statement
        GrammarNode expStmt = stmt.createChild("expressionStatement", GrammarNodeType.And);
        expStmt.addChild(exp);
        expStmt.createChild(new Token("SEMI",";"));

        //if
        GrammarNode ifStmt = stmt.createChild("ifStatement", GrammarNodeType.And);
        ifStmt.createChild(new Token("IF","if"));
        ifStmt.createChild(new Token("LPAREN","("));
        ifStmt.addChild(exp);
        ifStmt.createChild(new Token("RPAREN",")"));
        ifStmt.addChild(stmt);
        ifStmt.createChild(new Token("SEMI",";"));

        //block
        GrammarNode block = stmt.createChild("block", GrammarNodeType.And);
        block.createChild(new Token("LBRACE","{"));
        block.addChild(blockStatements);
        block.createChild(new Token("RBRACE","}"));

        return blockStatements;
    }

    /**
     * 消除了左递归的表达式语法规则：
     * expression	: equal ;
     * equal: rel equal1 ;
     * equal1	: (== | !=) rel equal1 | ε ;
     * rel	: add rel1 ;
     * rel1	: (>= | > | <= | <) add rel1 | ε ;
     * add	: mul add1 ;
     * add1	: (+ | -) mul add1 | ε ;
     * mul	: pri mul1 ;
     * mul1	: (* | /) pri mul1 | ε ;
     * pri	: ID | INT_LITERAL | LPAREN add RPAREN ;
     * @return
     */
    public static GrammarNode expressionGrammar() {
        //expression
        GrammarNode exp = new GrammarNode("expression", GrammarNodeType.Or);

        //assign
        GrammarNode assign = exp.createChild("assign", GrammarNodeType.And);
        GrammarNode equal = assign.createChild("equal", GrammarNodeType.And);
        GrammarNode assign1 = assign.createChild("assgn1", GrammarNodeType.Or);

        //assign1
        GrammarNode assign1_1 = assign1.createChild( GrammarNodeType.And);
        assign1_1.createChild(new Token("ASSIGN", "="));
        assign1_1.addChild(equal);
        assign1_1.addChild(assign1);
        assign1.createChild( GrammarNodeType.Epsilon);

        //equal
        GrammarNode rel = equal.createChild("rel", GrammarNodeType.And);
        GrammarNode equal1 = equal.createChild("equal1", GrammarNodeType.Or);

        //equal1
        GrammarNode equal1_1 = equal1.createChild( GrammarNodeType.And);
        GrammarNode equalOp = equal1_1.createChild( GrammarNodeType.Or);
        equalOp.createChild(new Token("EQUAL","=="));
        equalOp.createChild(new Token("NOTEQUAL", "!="));
        equal1_1.addChild(rel);
        equal1_1.addChild(equal1);
        equal1.createChild( GrammarNodeType.Epsilon);

        //rel
        GrammarNode add = rel.createChild("add", GrammarNodeType.And);
        GrammarNode rel1 = rel.createChild("rel1", GrammarNodeType.Or);

        //rel1
        GrammarNode rel1_1 = rel1.createChild( GrammarNodeType.And);
        GrammarNode relOp = rel1_1.createChild( GrammarNodeType.Or);
        relOp.createChild(new Token("GE",">="));
        relOp.createChild(new Token("GT", ">"));
        relOp.createChild(new Token("LE", "<="));
        relOp.createChild(new Token("LT", "<"));
        rel1_1.addChild(add);
        rel1_1.addChild(rel1);
        rel1.createChild( GrammarNodeType.Epsilon);

        //add
        GrammarNode mul = add.createChild("mul", GrammarNodeType.And);
        GrammarNode add1 = add.createChild("add1", GrammarNodeType.Or);

        //add1
        GrammarNode add1_1 = add1.createChild( GrammarNodeType.And);
        GrammarNode addOp = add1_1.createChild( GrammarNodeType.Or);
        addOp.createChild(new Token("ADD","+"));
        addOp.createChild(new Token("SUB", "-"));
        add1_1.addChild(mul);
        add1_1.addChild(add1);
        add1.createChild( GrammarNodeType.Epsilon);

        //mul
        GrammarNode pri = mul.createChild("pri", GrammarNodeType.Or);
        GrammarNode mul1 = mul.createChild("mul1", GrammarNodeType.Or);

        //mul1
        GrammarNode mul1_1 = mul1.createChild( GrammarNodeType.And);
        GrammarNode mulOp = mul1_1.createChild(GrammarNodeType.Or);
        mulOp.createChild(new Token("MUL", "*"));
        mulOp.createChild(new Token("DIV", "/"));
        mul1_1.addChild(pri);
        mul1_1.addChild(mul1);
        mul1.createChild( GrammarNodeType.Epsilon);

        //pri
        pri.createChild(new Token("ID"));
        pri.createChild(new Token("INT_LITERAL"));
        GrammarNode pri_3 = pri.createChild(GrammarNodeType.And);
        pri_3.createChild(new Token("LPAREN"));
        pri_3.addChild(exp);
        pri_3.createChild(new Token("RPAREN"));

        return exp;
    }

    /**
     * 带有左递归的语法规则：
     * expression	: add ;
     * add	: mul | add (+ | -) mul ;
     * mul	: pri | mul (* | /) pri ;
     * pri	: ID | INT_LITERAL | LPAREN expression RPAREN ;
     *
     * @return
     */
    public static GrammarNode leftRecursiveExpressionGrammar() {
        //expression
        GrammarNode exp = new GrammarNode("expression", GrammarNodeType.And);

        //add
        GrammarNode add = exp.createChild("add", GrammarNodeType.Or);
        GrammarNode mul = add.createChild("mul", GrammarNodeType.Or);
        GrammarNode add_2 = add.createChild(GrammarNodeType.And);
        add_2.addChild(add);  //左递归
        GrammarNode addOp = add_2.createChild( GrammarNodeType.Or);
        addOp.createChild(new Token("ADD","+"));
        addOp.createChild(new Token("SUB", "-"));
        add_2.addChild(mul);

        //mul
        GrammarNode pri = mul.createChild("pri", GrammarNodeType.Or);
        GrammarNode mul_2 = mul.createChild(GrammarNodeType.And);
        mul_2.addChild(mul);
        GrammarNode mulOp = mul_2.createChild(GrammarNodeType.Or);
        mulOp.createChild(new Token("MUL", "*"));
        mulOp.createChild(new Token("DIV", "/"));
        mul_2.addChild(pri);

        //pri
        pri.createChild(new Token("ID"));
        pri.createChild(new Token("INT_LITERAL"));
        GrammarNode pri_3 = pri.createChild(GrammarNodeType.And);
        pri_3.createChild(new Token("LPAREN"));
        pri_3.addChild(exp);
        pri_3.createChild(new Token("RPAREN"));

        return exp;
    }

    /**
     * 带有左递归的简化版的语法规则：
     * add	: mul | add '+' mul ;
     * mul	: pri | mul '*' pri ;
     * pri	: INT_LITERAL | LPAREN add RPAREN ;
     * @return
     */
    public static GrammarNode simpleLeftRecursiveExpressionGrammar() {
        //add
        GrammarNode add = new GrammarNode("add", GrammarNodeType.Or);
        GrammarNode mul = add.createChild("mul", GrammarNodeType.Or);
        GrammarNode add_2 = add.createChild(GrammarNodeType.And);
        add_2.addChild(add);  //左递归
        add_2.createChild(new Token("ADD","+"));
        add_2.addChild(mul);

        //mul
        GrammarNode pri = mul.createChild("pri", GrammarNodeType.Or);
        GrammarNode mul_2 = mul.createChild(GrammarNodeType.And);
        mul_2.addChild(mul);
        mul_2.createChild(new Token("MUL", "*"));
        mul_2.addChild(pri);

        //pri
        pri.createChild(new Token("INT_LITERAL"));
        GrammarNode pri_3 = pri.createChild(GrammarNodeType.And);
        pri_3.createChild(new Token("LPAREN"));
        pri_3.addChild(add);
        pri_3.createChild(new Token("RPAREN"));

        return add;
    }


    /**
     * 创建一个示例用词法规则，支持：
     * 关键字：int, if
     * 操作符：+ - * / = == >= <= > <
     * 标识符
     * @return
     */
    public static GrammarNode commonLexerGrammar() {
        GrammarNode rootNode = new GrammarNode(GrammarNodeType.Or);

        //int关键字
        GrammarNode intNode = rootNode.createChild("INT",GrammarNodeType.And);
        intNode.createChild(new CharSet('i'));
        intNode.createChild(new CharSet('n'));
        intNode.createChild(new CharSet('t'));

        //if关键字
        GrammarNode ifNode = rootNode.createChild("IF",GrammarNodeType.And);
        ifNode.createChild(new CharSet('i'));
        ifNode.createChild(new CharSet('f'));

        //else关键字
        GrammarNode elseNode = rootNode.createChild("ELSE",GrammarNodeType.And);
        elseNode.createChild(new CharSet('e'));
        elseNode.createChild(new CharSet('l'));
        elseNode.createChild(new CharSet('s'));
        elseNode.createChild(new CharSet('e'));

        //+
        GrammarNode add = rootNode.createChild("ADD", new CharSet('+'));

        //-
        GrammarNode minus = rootNode.createChild("SUB",new CharSet('-'));

        //*
        GrammarNode star = rootNode.createChild("MUL",new CharSet('*'));

        // /
        GrammarNode slash = rootNode.createChild("DIV", new CharSet('/'));

        // (
        GrammarNode leftParen = rootNode.createChild("LPAREN", new CharSet('('));

        // )
        GrammarNode rightParen = rootNode.createChild("RPAREN", new CharSet(')'));

        // (
        GrammarNode leftBrace = rootNode.createChild("LBRACE", new CharSet('{'));

        // )
        GrammarNode rightBrace = rootNode.createChild("RBRACE", new CharSet('}'));

        // ;
        GrammarNode semi = rootNode.createChild("SEMI", new CharSet(';'));

        // =
        GrammarNode assign = rootNode.createChild("ASSIGN", new CharSet('='));

        // ==
        GrammarNode equal = rootNode.createChild("EQUAL", GrammarNodeType.And);
        equal.createChild(new CharSet('='));
        equal.createChild(new CharSet('='));

        // ==
        GrammarNode notEqual = rootNode.createChild("NOTEQUAL", GrammarNodeType.And);
        notEqual.createChild(new CharSet('!'));
        notEqual.createChild(new CharSet('='));

        // >
        GrammarNode gt = rootNode.createChild("GT", new CharSet('>'));

        // >=
        GrammarNode ge = rootNode.createChild("GE",  GrammarNodeType.And);
        ge.createChild(new CharSet('>'));
        ge.createChild(new CharSet('='));

        // <
        GrammarNode lt = rootNode.createChild("LT", new CharSet('<'));

        // <=
        GrammarNode le = rootNode.createChild("LE", GrammarNodeType.And);
        le.createChild(new CharSet('<'));
        le.createChild(new CharSet('='));

        //标识符
        GrammarNode id = rootNode.createChild("ID", GrammarNodeType.And);
        GrammarNode firstLetter = id.createChild(CharSet.letter);
        GrammarNode letterOrDigit = id.createChild(CharSet.letterOrDigit);
        letterOrDigit.setRepeatTimes(0, -1);

        //数字字面量
        GrammarNode intLiteral = rootNode.createChild("INT_LITERAL",CharSet.digit);
        intLiteral.setRepeatTimes(1, -1);

        //空白字符
        //不设置tokenType，不会生成Token，会忽略掉
        GrammarNode whiteSpace = rootNode.createChild("WHITE_SPACE",CharSet.whiteSpace);
        whiteSpace.setRepeatTimes(0, -1);
        whiteSpace.setNeglect(true);

        return rootNode;
    }

}
