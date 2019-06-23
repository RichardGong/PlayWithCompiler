
package script;


// Generated from PlayScript.g4 by ANTLR 4.7.2

#pragma once


#include "antlr4-runtime.h"




class  PlayScriptLexer : public antlr4::Lexer {
public:
  enum {
    T__0 = 1, T__1 = 2, T__2 = 3, BOOLEAN = 4, BREAK = 5, BYTE = 6, CASE = 7, 
    CATCH = 8, CHAR = 9, CLASS = 10, CONST = 11, CONTINUE = 12, DEFAULT = 13, 
    DO = 14, DOUBLE = 15, ELSE = 16, ENUM = 17, EXTENDS = 18, FINAL = 19, 
    FINALLY = 20, FLOAT = 21, FOR = 22, IF = 23, IMPLEMENTS = 24, IMPORT = 25, 
    INSTANCEOF = 26, INT = 27, INTERFACE = 28, LONG = 29, NATIVE = 30, NEW = 31, 
    PACKAGE = 32, PRIVATE = 33, PROTECTED = 34, PUBLIC = 35, RETURN = 36, 
    SHORT = 37, SUPER = 38, SWITCH = 39, THIS = 40, VOID = 41, WHILE = 42, 
    IntegerLiteral = 43, FloatingPointLiteral = 44, BooleanLiteral = 45, 
    CharacterLiteral = 46, StringLiteral = 47, NullLiteral = 48, LPAREN = 49, 
    RPAREN = 50, LBRACE = 51, RBRACE = 52, LBRACK = 53, RBRACK = 54, SEMI = 55, 
    COMMA = 56, DOT = 57, ELLIPSIS = 58, AT = 59, COLONCOLON = 60, ASSIGN = 61, 
    GT = 62, LT = 63, BANG = 64, TILDE = 65, QUESTION = 66, COLON = 67, 
    ARROW = 68, EQUAL = 69, LE = 70, GE = 71, NOTEQUAL = 72, AND = 73, OR = 74, 
    INC = 75, DEC = 76, ADD = 77, SUB = 78, MUL = 79, DIV = 80, BITAND = 81, 
    BITOR = 82, CARET = 83, MOD = 84, ADD_ASSIGN = 85, SUB_ASSIGN = 86, 
    MUL_ASSIGN = 87, DIV_ASSIGN = 88, AND_ASSIGN = 89, OR_ASSIGN = 90, XOR_ASSIGN = 91, 
    MOD_ASSIGN = 92, LSHIFT_ASSIGN = 93, RSHIFT_ASSIGN = 94, URSHIFT_ASSIGN = 95, 
    Identifier = 96, WS = 97, COMMENT = 98, LINE_COMMENT = 99
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

  virtual bool sempred(antlr4::RuleContext *_localctx, size_t ruleIndex, size_t predicateIndex) override;

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
  bool LetterSempred(antlr4::RuleContext *_localctx, size_t predicateIndex);
  bool LetterOrDigitSempred(antlr4::RuleContext *_localctx, size_t predicateIndex);

  struct Initializer {
    Initializer();
  };
  static Initializer _init;
};

