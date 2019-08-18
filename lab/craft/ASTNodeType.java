/**
 * AST节点的类型。
 */
public enum ASTNodeType{
    Programm,           //程序入口，根节点

    IntDeclaration,     //整型变量声明
    ExpressionStmt,     //表达式语句，即表达式后面跟个分号
    AssignmentStmt,     //赋值语句

    Primary,            //基础表达式
    Multiplicative,     //乘法表达式
    Additive,           //加法表达式

    Identifier,         //标识符
    IntLiteral          //整型字面量
}