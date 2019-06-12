package pwc;

import sun.tools.java.Identifier;

public enum ASTNodeType{
    Programm,

    IntDeclaration,
    ExpressionStmt,
    AssignmentStmt,

    PrimaryExp,
    MulticativeExp,
    AdditiveExp,

    AssignmentExp,

    Identifier,
    IntConstant
}