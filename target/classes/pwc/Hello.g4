lexer grammar Hello;

AssignmentOperator: '=' ;    
RelationalOperator: '=='|'>'|'>='|'<' |'<=' ;    
Star:               '*';
Plus:               '+';
Sharp:              '#';
SemiColon:          ';';
Dot:                '.';
Comm:               ',';
LeftBracket :       '[';
RightBracket:       ']';
LeftBrace:          '{';
RightBrace:         '}';
LeftParen:          '(';
RightParen:         ')';

TypeSpecifier:      'char'  |  'int';
If:                 'if' | '如果';
Else:               'else';

Identifier:         [a-zA-Z_] ([a-zA-Z_] | [0-9])*;

Constant
    :   IntegerConstant
    //|   FloatingConstant
    //|   EnumerationConstant
    |   CharacterConstant
    ;

fragment
IntegerConstant
    :   NonzeroDigit Digit*
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;


CharacterConstant:      '"' .*? '"' ;

Whitespace:         [ \t]+ -> skip;
Newline:            ( '\r' '\n'?|'\n')-> skip;

