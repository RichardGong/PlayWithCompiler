package craft;

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