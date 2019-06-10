grammar MyParser;

import Hello;

statement
    :   expressionStatement
    |    compoundStatement
    //|   selectionStatement
    //|   iterationStatement
    ;

expressionStatement
    :   expression? ';'
    ;

declaration          
    : TypeSpecifier Identifier 
    | TypeSpecifier Identifier initializer
    ;

initializer
    :   assignmentExpression
    //|   '{' initializerList '}'
    //|   '{' initializerList ',' '}'
    ;


expression
    :   assignmentExpression
    |   expression ',' assignmentExpression
    ;

assignmentExpression
    :   additiveExpression
    |   Identifier AssignmentOperator additiveExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

multiplicativeExpression
    :   primaryExpression
    |   multiplicativeExpression '*' primaryExpression
    |   multiplicativeExpression '/' primaryExpression
    ;

primaryExpression
    :   Identifier
    |   Constant
    |   Identifier LeftParen argumentExpressionList? RightParen
    //|   StringLiteral+
    |   '(' expression ')'
    ;

argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList ',' assignmentExpression
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   statement
    |   declaration
    ;