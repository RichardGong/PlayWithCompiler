grammar PlayScript;

import CommonLexer;

@header {
package script;
}

statements
    :   expressionStatement
    |    compoundStatement
    //|   selectionStatement
    //|   iterationStatement
    ;

expressionStatement
    :   expression? SemiColon
    ;

declaration          
    : TypeSpecifier Identifier 
    | TypeSpecifier Identifier initializer
    ;

initializer
    :   Assignment assignmentExpression
    //|   LeftBrace initializerList RightBrace
    //|   LeftBrace initializerList Comm RightBrace
    ;


expression
    :   assignmentExpression
    |   expression Comm assignmentExpression
    ;

assignmentExpression
    :   additiveExpression
    |   Identifier Assignment additiveExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression Add multiplicativeExpression
    ;

multiplicativeExpression
    :   primaryExpression
    |   multiplicativeExpression Mul primaryExpression
    ;

primaryExpression
    :   Identifier
    |   Constant
    |   Identifier LeftParen argumentExpressionList? RightParen
    //|   StringLiteral+
    |   LeftParen expression RightParen
    ;

argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList Comm assignmentExpression
    ;

compoundStatement
    :   LeftBrace blockItemList? RightBrace
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   statement
    |   declaration
    ;