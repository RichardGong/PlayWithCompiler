package play.parser;

/**
 * 语法节点的类型。
 */
public enum GrammarNodeType {
    And,             //并运算
    Or,              //或运算
    Char,            //字符，用于表达词法规则
    Token,           //一个Token，用于表达语法规则
    Epsilon          //空集
}