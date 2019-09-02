/*
 [The "BSD licence"]
 版权说明
 本文件的大部分内容来自：https://github.com/antlr/grammars-v4/blob/master/java/JavaParser.g4
 在此基础上进行了一些修改。
 修改者：宫文学  2019年

 原文件采用BSD licence，本文件仍然采用BSD licence.
 原文件的版权声明如下：
*/

/*
 [The "BSD licence"]
 Copyright (c) 2013 Terence Parr, Sam Harwell
 Copyright (c) 2017 Ivan Kochurkin (upgrade to Java 8)
 All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar PlayScript;

//options { tokenVocab=CommonLexer; }
import CommonLexer;

@header {
package play;
}

classDeclaration
    : CLASS IDENTIFIER
      (EXTENDS typeType)?
      (IMPLEMENTS typeList)?
      classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

// interfaceBody
//     : '{' interfaceBodyDeclaration* '}'
//     ;

classBodyDeclaration
    : ';'
    //| STATIC? block
    | memberDeclaration
    ;

memberDeclaration
    : functionDeclaration
//    | genericFunctionDeclaration
    | fieldDeclaration
    // | constructorDeclaration
    // | genericConstructorDeclaration
//     | interfaceDeclaration
    // | annotationTypeDeclaration
     | classDeclaration
    // | enumDeclaration
    ;

functionDeclaration
    : typeTypeOrVoid? IDENTIFIER formalParameters ('[' ']')*
      (THROWS qualifiedNameList)?
      functionBody
    ;


functionBody
    : block
    | ';'
    ;

typeTypeOrVoid
    : typeType
    | VOID
    ;

qualifiedNameList
    : qualifiedName (',' qualifiedName)*
    ;

formalParameters
    : '(' formalParameterList? ')'
    ;

formalParameterList
    : formalParameter (',' formalParameter)* (',' lastFormalParameter)?
    | lastFormalParameter
    ;

formalParameter
    : variableModifier* typeType variableDeclaratorId
    ;

lastFormalParameter
    : variableModifier* typeType '...' variableDeclaratorId
    ;

variableModifier
    : FINAL
    //| annotation
    ;

qualifiedName
    : IDENTIFIER ('.' IDENTIFIER)*
    ;

fieldDeclaration
    //: typeType variableDeclarators ';'
    : variableDeclarators ';'
    ;

constructorDeclaration
    : IDENTIFIER formalParameters (THROWS qualifiedNameList)? constructorBody=block
    ;

variableDeclarators
    : typeType variableDeclarator (',' variableDeclarator)*
    ;

variableDeclarator
    : variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    : IDENTIFIER ('[' ']')*
    ;

variableInitializer
    : arrayInitializer
    | expression
    ;

arrayInitializer
    : '{' (variableInitializer (',' variableInitializer)* (',')? )? '}'
    ;

classOrInterfaceType
    : IDENTIFIER ('.' IDENTIFIER)*
    //: IDENTIFIER
    ;

typeArgument
    : typeType
    | '?' ((EXTENDS | SUPER) typeType)?
    ;

literal
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    | HEX_FLOAT_LITERAL
    ;

// STATEMENTS / BLOCKS
prog
    : blockStatements
    ;

block
    : '{' blockStatements '}'
    ;

blockStatements
    : blockStatement*
    ;

blockStatement
    : variableDeclarators ';'
    | statement
   // | localTypeDeclaration
    | functionDeclaration
    | classDeclaration
    ;

statement
    : blockLabel=block
    // | ASSERT expression (':' expression)? ';'
    | IF parExpression statement (ELSE statement)?
    | FOR '(' forControl ')' statement
    | WHILE parExpression statement
    | DO statement WHILE parExpression ';'
    //| TRY block (catchClause+ finallyBlock? | finallyBlock)
    //| TRY resourceSpecification block catchClause* finallyBlock?
    | SWITCH parExpression '{' switchBlockStatementGroup* switchLabel* '}'
    //| SYNCHRONIZED parExpression block
    | RETURN expression? ';'
    //| THROW expression ';'
    | BREAK IDENTIFIER? ';'
    | CONTINUE IDENTIFIER? ';'
    | SEMI
    | statementExpression=expression ';'
    | identifierLabel=IDENTIFIER ':' statement
    ;

/** Matches cases then statements, both of which are mandatory.
 *  To handle empty cases at the end, we add switchLabel* to statement.
 */
switchBlockStatementGroup
    : switchLabel+ blockStatement+
    ;

switchLabel
    : CASE (constantExpression=expression | enumConstantName=IDENTIFIER) ':'
    | DEFAULT ':'
    ;

forControl
    : enhancedForControl
    | forInit? ';' expression? ';' forUpdate=expressionList?
    ;

forInit
    : variableDeclarators
    | expressionList
    ;

enhancedForControl
    : typeType variableDeclaratorId ':' expression
    ;

// EXPRESSIONS

parExpression
    : '(' expression ')'
    ;

expressionList
    : expression (',' expression)*
    ;

functionCall
    : IDENTIFIER '(' expressionList? ')'
    | THIS '(' expressionList? ')'
    | SUPER '(' expressionList? ')'
    ;

expression
    : primary
    | expression bop='.'
      ( IDENTIFIER
      | functionCall
      | THIS
    //   | NEW nonWildcardTypeArguments? innerCreator
    //   | SUPER superSuffix
    //   | explicitGenericInvocation
      )
    | expression '[' expression ']'
    | functionCall
    // | NEW creator   //不用new关键字，而是用类名相同的函数直接生成对象。
    // | '(' typeType ')' expression
    | expression postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expression
    | prefix=('~'|'!') expression
    | expression bop=('*'|'/'|'%') expression  
    | expression bop=('+'|'-') expression 
    | expression ('<' '<' | '>' '>' '>' | '>' '>') expression
    | expression bop=('<=' | '>=' | '>' | '<') expression
    | expression bop=INSTANCEOF typeType
    | expression bop=('==' | '!=') expression
    | expression bop='&' expression
    | expression bop='^' expression
    | expression bop='|' expression
    | expression bop='&&' expression
    | expression bop='||' expression
    | expression bop='?' expression ':' expression
    | <assoc=right> expression
      bop=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=')
      expression
    // | lambdaExpression // Java8

    // Java 8 functionReference
    // | expression '::' typeArguments? IDENTIFIER
    // | typeType '::' (typeArguments? IDENTIFIER | NEW)
    // | classType '::' typeArguments? NEW
    ;


primary
    : '(' expression ')'
    | THIS
    | SUPER
    | literal
    | IDENTIFIER
    // | typeTypeOrVoid '.' CLASS
    ;

typeList
    : typeType (',' typeType)*
    ;

typeType
    : (classOrInterfaceType| functionType | primitiveType) ('[' ']')*
    ;

functionType
    : FUNCTION typeTypeOrVoid '(' typeList? ')'
    ;

primitiveType
    : BOOLEAN
    | CHAR
    | BYTE
    | SHORT
    | INT
    | LONG
    | FLOAT
    | DOUBLE
    | STRING    //added on 2019-08-29 by Richard Gong
    ;

creator
    : IDENTIFIER arguments
    ;

superSuffix
    : arguments
    | '.' IDENTIFIER arguments?
    ;

arguments
    : '(' expressionList? ')'
    ;
