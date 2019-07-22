
// Generated from PlayScript.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"


namespace play {


class  PlayScriptLexer : public antlr4::Lexer {
public:
  enum {
    ABSTRACT = 1, ASSERT = 2, BOOLEAN = 3, BREAK = 4, BYTE = 5, CASE = 6, 
    CATCH = 7, CHAR = 8, CLASS = 9, CONST = 10, CONTINUE = 11, DEFAULT = 12, 
    DO = 13, DOUBLE = 14, ELSE = 15, ENUM = 16, EXTENDS = 17, FINAL = 18, 
    FINALLY = 19, FLOAT = 20, FOR = 21, IF = 22, GOTO = 23, IMPLEMENTS = 24, 
    IMPORT = 25, INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29, NATIVE = 30, 
    NEW = 31, PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36, 
    SHORT = 37, STATIC = 38, STRICTFP = 39, SUPER = 40, SWITCH = 41, SYNCHRONIZED = 42, 
    THIS = 43, THROW = 44, THROWS = 45, TRANSIENT = 46, TRY = 47, VOID = 48, 
    VOLATILE = 49, WHILE = 50, FUNCTION = 51, DECIMAL_LITERAL = 52, HEX_LITERAL = 53, 
    OCT_LITERAL = 54, BINARY_LITERAL = 55, FLOAT_LITERAL = 56, HEX_FLOAT_LITERAL = 57, 
    BOOL_LITERAL = 58, CHAR_LITERAL = 59, STRING_LITERAL = 60, NULL_LITERAL = 61, 
    LPAREN = 62, RPAREN = 63, LBRACE = 64, RBRACE = 65, LBRACK = 66, RBRACK = 67, 
    SEMI = 68, COMMA = 69, DOT = 70, ASSIGN = 71, GT = 72, LT = 73, BANG = 74, 
    TILDE = 75, QUESTION = 76, COLON = 77, EQUAL = 78, LE = 79, GE = 80, 
    NOTEQUAL = 81, AND = 82, OR = 83, INC = 84, DEC = 85, ADD = 86, SUB = 87, 
    MUL = 88, DIV = 89, BITAND = 90, BITOR = 91, CARET = 92, MOD = 93, ADD_ASSIGN = 94, 
    SUB_ASSIGN = 95, MUL_ASSIGN = 96, DIV_ASSIGN = 97, AND_ASSIGN = 98, 
    OR_ASSIGN = 99, XOR_ASSIGN = 100, MOD_ASSIGN = 101, LSHIFT_ASSIGN = 102, 
    RSHIFT_ASSIGN = 103, URSHIFT_ASSIGN = 104, ARROW = 105, COLONCOLON = 106, 
    AT = 107, ELLIPSIS = 108, WS = 109, COMMENT = 110, LINE_COMMENT = 111, 
    IDENTIFIER = 112
  };

  PlayScriptLexer(antlr4::CharStream *input);
  ~PlayScriptLexer();

  virtual std::string getGrammarFileName() const override;
  virtual const std::vector<std::string>& getRuleNames() const override;

  virtual const std::vector<std::string>& getChannelNames() const override;
  virtual const std::vector<std::string>& getModeNames() const override;
  virtual const std::vector<std::string>& getTokenNames() const override; // deprecated, use vocabulary instead
  virtual antlr4::dfa::Vocabulary& getVocabulary() const override;

  virtual const std::vector<uint16_t> getSerializedATN() const override;
  virtual const antlr4::atn::ATN& getATN() const override;

private:
  static std::vector<antlr4::dfa::DFA> _decisionToDFA;
  static antlr4::atn::PredictionContextCache _sharedContextCache;
  static std::vector<std::string> _ruleNames;
  static std::vector<std::string> _tokenNames;
  static std::vector<std::string> _channelNames;
  static std::vector<std::string> _modeNames;

  static std::vector<std::string> _literalNames;
  static std::vector<std::string> _symbolicNames;
  static antlr4::dfa::Vocabulary _vocabulary;
  static antlr4::atn::ATN _atn;
  static std::vector<uint16_t> _serializedATN;


  // Individual action functions triggered by action() above.

  // Individual semantic predicate functions triggered by sempred() above.

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

}  // namespace play
