
package script;


// Generated from PlayScript.g4 by ANTLR 4.7.2


#include "PlayScriptListener.h"

#include "PlayScriptParser.h"


using namespace antlrcpp;
using namespace antlr4;

PlayScriptParser::PlayScriptParser(TokenStream *input) : Parser(input) {
  _interpreter = new atn::ParserATNSimulator(this, _atn, _decisionToDFA, _sharedContextCache);
}

PlayScriptParser::~PlayScriptParser() {
  delete _interpreter;
}

std::string PlayScriptParser::getGrammarFileName() const {
  return "PlayScript.g4";
}

const std::vector<std::string>& PlayScriptParser::getRuleNames() const {
  return _ruleNames;
}

dfa::Vocabulary& PlayScriptParser::getVocabulary() const {
  return _vocabulary;
}


//----------------- LiteralContext ------------------------------------------------------------------

PlayScriptParser::LiteralContext::LiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::LiteralContext::IntegerLiteral() {
  return getToken(PlayScriptParser::IntegerLiteral, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::FloatingPointLiteral() {
  return getToken(PlayScriptParser::FloatingPointLiteral, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::BooleanLiteral() {
  return getToken(PlayScriptParser::BooleanLiteral, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::CharacterLiteral() {
  return getToken(PlayScriptParser::CharacterLiteral, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::StringLiteral() {
  return getToken(PlayScriptParser::StringLiteral, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::NullLiteral() {
  return getToken(PlayScriptParser::NullLiteral, 0);
}


size_t PlayScriptParser::LiteralContext::getRuleIndex() const {
  return PlayScriptParser::RuleLiteral;
}

void PlayScriptParser::LiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLiteral(this);
}

void PlayScriptParser::LiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLiteral(this);
}

PlayScriptParser::LiteralContext* PlayScriptParser::literal() {
  LiteralContext *_localctx = _tracker.createInstance<LiteralContext>(_ctx, getState());
  enterRule(_localctx, 0, PlayScriptParser::RuleLiteral);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(32);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::IntegerLiteral)
      | (1ULL << PlayScriptParser::FloatingPointLiteral)
      | (1ULL << PlayScriptParser::BooleanLiteral)
      | (1ULL << PlayScriptParser::CharacterLiteral)
      | (1ULL << PlayScriptParser::StringLiteral)
      | (1ULL << PlayScriptParser::NullLiteral))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- PrimitiveTypeContext ------------------------------------------------------------------

PlayScriptParser::PrimitiveTypeContext::PrimitiveTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}


size_t PlayScriptParser::PrimitiveTypeContext::getRuleIndex() const {
  return PlayScriptParser::RulePrimitiveType;
}

void PlayScriptParser::PrimitiveTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPrimitiveType(this);
}

void PlayScriptParser::PrimitiveTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPrimitiveType(this);
}

PlayScriptParser::PrimitiveTypeContext* PlayScriptParser::primitiveType() {
  PrimitiveTypeContext *_localctx = _tracker.createInstance<PrimitiveTypeContext>(_ctx, getState());
  enterRule(_localctx, 2, PlayScriptParser::RulePrimitiveType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(34);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::T__0)
      | (1ULL << PlayScriptParser::T__1)
      | (1ULL << PlayScriptParser::T__2))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- StatementContext ------------------------------------------------------------------

PlayScriptParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::ExpressionStatementContext* PlayScriptParser::StatementContext::expressionStatement() {
  return getRuleContext<PlayScriptParser::ExpressionStatementContext>(0);
}

PlayScriptParser::CompoundStatementContext* PlayScriptParser::StatementContext::compoundStatement() {
  return getRuleContext<PlayScriptParser::CompoundStatementContext>(0);
}


size_t PlayScriptParser::StatementContext::getRuleIndex() const {
  return PlayScriptParser::RuleStatement;
}

void PlayScriptParser::StatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterStatement(this);
}

void PlayScriptParser::StatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitStatement(this);
}

PlayScriptParser::StatementContext* PlayScriptParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 4, PlayScriptParser::RuleStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(38);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::IntegerLiteral:
      case PlayScriptParser::FloatingPointLiteral:
      case PlayScriptParser::BooleanLiteral:
      case PlayScriptParser::CharacterLiteral:
      case PlayScriptParser::StringLiteral:
      case PlayScriptParser::NullLiteral:
      case PlayScriptParser::LPAREN:
      case PlayScriptParser::SEMI:
      case PlayScriptParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(36);
        expressionStatement();
        break;
      }

      case PlayScriptParser::LBRACE: {
        enterOuterAlt(_localctx, 2);
        setState(37);
        compoundStatement();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionStatementContext ------------------------------------------------------------------

PlayScriptParser::ExpressionStatementContext::ExpressionStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ExpressionStatementContext::SEMI() {
  return getToken(PlayScriptParser::SEMI, 0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::ExpressionStatementContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}


size_t PlayScriptParser::ExpressionStatementContext::getRuleIndex() const {
  return PlayScriptParser::RuleExpressionStatement;
}

void PlayScriptParser::ExpressionStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpressionStatement(this);
}

void PlayScriptParser::ExpressionStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpressionStatement(this);
}

PlayScriptParser::ExpressionStatementContext* PlayScriptParser::expressionStatement() {
  ExpressionStatementContext *_localctx = _tracker.createInstance<ExpressionStatementContext>(_ctx, getState());
  enterRule(_localctx, 6, PlayScriptParser::RuleExpressionStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(41);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (((((_la - 43) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 43)) & ((1ULL << (PlayScriptParser::IntegerLiteral - 43))
      | (1ULL << (PlayScriptParser::FloatingPointLiteral - 43))
      | (1ULL << (PlayScriptParser::BooleanLiteral - 43))
      | (1ULL << (PlayScriptParser::CharacterLiteral - 43))
      | (1ULL << (PlayScriptParser::StringLiteral - 43))
      | (1ULL << (PlayScriptParser::NullLiteral - 43))
      | (1ULL << (PlayScriptParser::LPAREN - 43))
      | (1ULL << (PlayScriptParser::Identifier - 43)))) != 0)) {
      setState(40);
      expression(0);
    }
    setState(43);
    match(PlayScriptParser::SEMI);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- DeclarationContext ------------------------------------------------------------------

PlayScriptParser::DeclarationContext::DeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::PrimitiveTypeContext* PlayScriptParser::DeclarationContext::primitiveType() {
  return getRuleContext<PlayScriptParser::PrimitiveTypeContext>(0);
}

tree::TerminalNode* PlayScriptParser::DeclarationContext::Identifier() {
  return getToken(PlayScriptParser::Identifier, 0);
}

PlayScriptParser::InitializerContext* PlayScriptParser::DeclarationContext::initializer() {
  return getRuleContext<PlayScriptParser::InitializerContext>(0);
}


size_t PlayScriptParser::DeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleDeclaration;
}

void PlayScriptParser::DeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterDeclaration(this);
}

void PlayScriptParser::DeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitDeclaration(this);
}

PlayScriptParser::DeclarationContext* PlayScriptParser::declaration() {
  DeclarationContext *_localctx = _tracker.createInstance<DeclarationContext>(_ctx, getState());
  enterRule(_localctx, 8, PlayScriptParser::RuleDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(52);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 2, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(45);
      primitiveType();
      setState(46);
      match(PlayScriptParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(48);
      primitiveType();
      setState(49);
      match(PlayScriptParser::Identifier);
      setState(50);
      initializer();
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- InitializerContext ------------------------------------------------------------------

PlayScriptParser::InitializerContext::InitializerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::AssignmentOperatorContext* PlayScriptParser::InitializerContext::assignmentOperator() {
  return getRuleContext<PlayScriptParser::AssignmentOperatorContext>(0);
}

PlayScriptParser::AssignmentExpressionContext* PlayScriptParser::InitializerContext::assignmentExpression() {
  return getRuleContext<PlayScriptParser::AssignmentExpressionContext>(0);
}


size_t PlayScriptParser::InitializerContext::getRuleIndex() const {
  return PlayScriptParser::RuleInitializer;
}

void PlayScriptParser::InitializerContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterInitializer(this);
}

void PlayScriptParser::InitializerContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitInitializer(this);
}

PlayScriptParser::InitializerContext* PlayScriptParser::initializer() {
  InitializerContext *_localctx = _tracker.createInstance<InitializerContext>(_ctx, getState());
  enterRule(_localctx, 10, PlayScriptParser::RuleInitializer);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(54);
    assignmentOperator();
    setState(55);
    assignmentExpression();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionContext ------------------------------------------------------------------

PlayScriptParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::AssignmentExpressionContext* PlayScriptParser::ExpressionContext::assignmentExpression() {
  return getRuleContext<PlayScriptParser::AssignmentExpressionContext>(0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::ExpressionContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::COMMA() {
  return getToken(PlayScriptParser::COMMA, 0);
}


size_t PlayScriptParser::ExpressionContext::getRuleIndex() const {
  return PlayScriptParser::RuleExpression;
}

void PlayScriptParser::ExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpression(this);
}

void PlayScriptParser::ExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpression(this);
}


PlayScriptParser::ExpressionContext* PlayScriptParser::expression() {
   return expression(0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::expression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PlayScriptParser::ExpressionContext *_localctx = _tracker.createInstance<ExpressionContext>(_ctx, parentState);
  PlayScriptParser::ExpressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 12;
  enterRecursionRule(_localctx, 12, PlayScriptParser::RuleExpression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(58);
    assignmentExpression();
    _ctx->stop = _input->LT(-1);
    setState(65);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleExpression);
        setState(60);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(61);
        match(PlayScriptParser::COMMA);
        setState(62);
        assignmentExpression(); 
      }
      setState(67);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 3, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- AssignmentExpressionContext ------------------------------------------------------------------

PlayScriptParser::AssignmentExpressionContext::AssignmentExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::AdditiveExpressionContext* PlayScriptParser::AssignmentExpressionContext::additiveExpression() {
  return getRuleContext<PlayScriptParser::AdditiveExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::AssignmentExpressionContext::Identifier() {
  return getToken(PlayScriptParser::Identifier, 0);
}

PlayScriptParser::AssignmentOperatorContext* PlayScriptParser::AssignmentExpressionContext::assignmentOperator() {
  return getRuleContext<PlayScriptParser::AssignmentOperatorContext>(0);
}


size_t PlayScriptParser::AssignmentExpressionContext::getRuleIndex() const {
  return PlayScriptParser::RuleAssignmentExpression;
}

void PlayScriptParser::AssignmentExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssignmentExpression(this);
}

void PlayScriptParser::AssignmentExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssignmentExpression(this);
}

PlayScriptParser::AssignmentExpressionContext* PlayScriptParser::assignmentExpression() {
  AssignmentExpressionContext *_localctx = _tracker.createInstance<AssignmentExpressionContext>(_ctx, getState());
  enterRule(_localctx, 14, PlayScriptParser::RuleAssignmentExpression);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(73);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(68);
      additiveExpression(0);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(69);
      match(PlayScriptParser::Identifier);
      setState(70);
      assignmentOperator();
      setState(71);
      additiveExpression(0);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AssignmentOperatorContext ------------------------------------------------------------------

PlayScriptParser::AssignmentOperatorContext::AssignmentOperatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::ASSIGN() {
  return getToken(PlayScriptParser::ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::MUL_ASSIGN() {
  return getToken(PlayScriptParser::MUL_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::DIV_ASSIGN() {
  return getToken(PlayScriptParser::DIV_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::MOD_ASSIGN() {
  return getToken(PlayScriptParser::MOD_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::ADD_ASSIGN() {
  return getToken(PlayScriptParser::ADD_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::SUB_ASSIGN() {
  return getToken(PlayScriptParser::SUB_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::LSHIFT_ASSIGN() {
  return getToken(PlayScriptParser::LSHIFT_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::RSHIFT_ASSIGN() {
  return getToken(PlayScriptParser::RSHIFT_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::URSHIFT_ASSIGN() {
  return getToken(PlayScriptParser::URSHIFT_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::AND_ASSIGN() {
  return getToken(PlayScriptParser::AND_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::XOR_ASSIGN() {
  return getToken(PlayScriptParser::XOR_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::AssignmentOperatorContext::OR_ASSIGN() {
  return getToken(PlayScriptParser::OR_ASSIGN, 0);
}


size_t PlayScriptParser::AssignmentOperatorContext::getRuleIndex() const {
  return PlayScriptParser::RuleAssignmentOperator;
}

void PlayScriptParser::AssignmentOperatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAssignmentOperator(this);
}

void PlayScriptParser::AssignmentOperatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAssignmentOperator(this);
}

PlayScriptParser::AssignmentOperatorContext* PlayScriptParser::assignmentOperator() {
  AssignmentOperatorContext *_localctx = _tracker.createInstance<AssignmentOperatorContext>(_ctx, getState());
  enterRule(_localctx, 16, PlayScriptParser::RuleAssignmentOperator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(75);
    _la = _input->LA(1);
    if (!(((((_la - 61) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 61)) & ((1ULL << (PlayScriptParser::ASSIGN - 61))
      | (1ULL << (PlayScriptParser::ADD_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::SUB_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::MUL_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::DIV_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::AND_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::OR_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::XOR_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::MOD_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::LSHIFT_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::RSHIFT_ASSIGN - 61))
      | (1ULL << (PlayScriptParser::URSHIFT_ASSIGN - 61)))) != 0))) {
    _errHandler->recoverInline(this);
    }
    else {
      _errHandler->reportMatch(this);
      consume();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- AdditiveExpressionContext ------------------------------------------------------------------

PlayScriptParser::AdditiveExpressionContext::AdditiveExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::MultiplicativeExpressionContext* PlayScriptParser::AdditiveExpressionContext::multiplicativeExpression() {
  return getRuleContext<PlayScriptParser::MultiplicativeExpressionContext>(0);
}

PlayScriptParser::AdditiveExpressionContext* PlayScriptParser::AdditiveExpressionContext::additiveExpression() {
  return getRuleContext<PlayScriptParser::AdditiveExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::AdditiveExpressionContext::ADD() {
  return getToken(PlayScriptParser::ADD, 0);
}

tree::TerminalNode* PlayScriptParser::AdditiveExpressionContext::SUB() {
  return getToken(PlayScriptParser::SUB, 0);
}


size_t PlayScriptParser::AdditiveExpressionContext::getRuleIndex() const {
  return PlayScriptParser::RuleAdditiveExpression;
}

void PlayScriptParser::AdditiveExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterAdditiveExpression(this);
}

void PlayScriptParser::AdditiveExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitAdditiveExpression(this);
}


PlayScriptParser::AdditiveExpressionContext* PlayScriptParser::additiveExpression() {
   return additiveExpression(0);
}

PlayScriptParser::AdditiveExpressionContext* PlayScriptParser::additiveExpression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PlayScriptParser::AdditiveExpressionContext *_localctx = _tracker.createInstance<AdditiveExpressionContext>(_ctx, parentState);
  PlayScriptParser::AdditiveExpressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 18;
  enterRecursionRule(_localctx, 18, PlayScriptParser::RuleAdditiveExpression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(78);
    multiplicativeExpression(0);
    _ctx->stop = _input->LT(-1);
    setState(88);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(86);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<AdditiveExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleAdditiveExpression);
          setState(80);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(81);
          match(PlayScriptParser::ADD);
          setState(82);
          multiplicativeExpression(0);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<AdditiveExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleAdditiveExpression);
          setState(83);

          if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
          setState(84);
          match(PlayScriptParser::SUB);
          setState(85);
          multiplicativeExpression(0);
          break;
        }

        } 
      }
      setState(90);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 6, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- MultiplicativeExpressionContext ------------------------------------------------------------------

PlayScriptParser::MultiplicativeExpressionContext::MultiplicativeExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::PrimaryExpressionContext* PlayScriptParser::MultiplicativeExpressionContext::primaryExpression() {
  return getRuleContext<PlayScriptParser::PrimaryExpressionContext>(0);
}

PlayScriptParser::MultiplicativeExpressionContext* PlayScriptParser::MultiplicativeExpressionContext::multiplicativeExpression() {
  return getRuleContext<PlayScriptParser::MultiplicativeExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::MultiplicativeExpressionContext::MUL() {
  return getToken(PlayScriptParser::MUL, 0);
}

tree::TerminalNode* PlayScriptParser::MultiplicativeExpressionContext::DIV() {
  return getToken(PlayScriptParser::DIV, 0);
}

tree::TerminalNode* PlayScriptParser::MultiplicativeExpressionContext::MOD() {
  return getToken(PlayScriptParser::MOD, 0);
}


size_t PlayScriptParser::MultiplicativeExpressionContext::getRuleIndex() const {
  return PlayScriptParser::RuleMultiplicativeExpression;
}

void PlayScriptParser::MultiplicativeExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMultiplicativeExpression(this);
}

void PlayScriptParser::MultiplicativeExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMultiplicativeExpression(this);
}


PlayScriptParser::MultiplicativeExpressionContext* PlayScriptParser::multiplicativeExpression() {
   return multiplicativeExpression(0);
}

PlayScriptParser::MultiplicativeExpressionContext* PlayScriptParser::multiplicativeExpression(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PlayScriptParser::MultiplicativeExpressionContext *_localctx = _tracker.createInstance<MultiplicativeExpressionContext>(_ctx, parentState);
  PlayScriptParser::MultiplicativeExpressionContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 20;
  enterRecursionRule(_localctx, 20, PlayScriptParser::RuleMultiplicativeExpression, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(92);
    primaryExpression();
    _ctx->stop = _input->LT(-1);
    setState(105);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(103);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 7, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<MultiplicativeExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleMultiplicativeExpression);
          setState(94);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(95);
          match(PlayScriptParser::MUL);
          setState(96);
          primaryExpression();
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<MultiplicativeExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleMultiplicativeExpression);
          setState(97);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(98);
          match(PlayScriptParser::DIV);
          setState(99);
          primaryExpression();
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<MultiplicativeExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleMultiplicativeExpression);
          setState(100);

          if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
          setState(101);
          match(PlayScriptParser::MOD);
          setState(102);
          primaryExpression();
          break;
        }

        } 
      }
      setState(107);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 8, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- PrimaryExpressionContext ------------------------------------------------------------------

PlayScriptParser::PrimaryExpressionContext::PrimaryExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::PrimaryExpressionContext::Identifier() {
  return getToken(PlayScriptParser::Identifier, 0);
}

PlayScriptParser::LiteralContext* PlayScriptParser::PrimaryExpressionContext::literal() {
  return getRuleContext<PlayScriptParser::LiteralContext>(0);
}

tree::TerminalNode* PlayScriptParser::PrimaryExpressionContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::PrimaryExpressionContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

PlayScriptParser::ArgumentExpressionListContext* PlayScriptParser::PrimaryExpressionContext::argumentExpressionList() {
  return getRuleContext<PlayScriptParser::ArgumentExpressionListContext>(0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::PrimaryExpressionContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}


size_t PlayScriptParser::PrimaryExpressionContext::getRuleIndex() const {
  return PlayScriptParser::RulePrimaryExpression;
}

void PlayScriptParser::PrimaryExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPrimaryExpression(this);
}

void PlayScriptParser::PrimaryExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPrimaryExpression(this);
}

PlayScriptParser::PrimaryExpressionContext* PlayScriptParser::primaryExpression() {
  PrimaryExpressionContext *_localctx = _tracker.createInstance<PrimaryExpressionContext>(_ctx, getState());
  enterRule(_localctx, 22, PlayScriptParser::RulePrimaryExpression);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(120);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 10, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(108);
      match(PlayScriptParser::Identifier);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(109);
      literal();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(110);
      match(PlayScriptParser::Identifier);
      setState(111);
      match(PlayScriptParser::LPAREN);
      setState(113);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (((((_la - 43) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 43)) & ((1ULL << (PlayScriptParser::IntegerLiteral - 43))
        | (1ULL << (PlayScriptParser::FloatingPointLiteral - 43))
        | (1ULL << (PlayScriptParser::BooleanLiteral - 43))
        | (1ULL << (PlayScriptParser::CharacterLiteral - 43))
        | (1ULL << (PlayScriptParser::StringLiteral - 43))
        | (1ULL << (PlayScriptParser::NullLiteral - 43))
        | (1ULL << (PlayScriptParser::LPAREN - 43))
        | (1ULL << (PlayScriptParser::Identifier - 43)))) != 0)) {
        setState(112);
        argumentExpressionList(0);
      }
      setState(115);
      match(PlayScriptParser::RPAREN);
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(116);
      match(PlayScriptParser::LPAREN);
      setState(117);
      expression(0);
      setState(118);
      match(PlayScriptParser::RPAREN);
      break;
    }

    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ArgumentExpressionListContext ------------------------------------------------------------------

PlayScriptParser::ArgumentExpressionListContext::ArgumentExpressionListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::AssignmentExpressionContext* PlayScriptParser::ArgumentExpressionListContext::assignmentExpression() {
  return getRuleContext<PlayScriptParser::AssignmentExpressionContext>(0);
}

PlayScriptParser::ArgumentExpressionListContext* PlayScriptParser::ArgumentExpressionListContext::argumentExpressionList() {
  return getRuleContext<PlayScriptParser::ArgumentExpressionListContext>(0);
}

tree::TerminalNode* PlayScriptParser::ArgumentExpressionListContext::COMMA() {
  return getToken(PlayScriptParser::COMMA, 0);
}


size_t PlayScriptParser::ArgumentExpressionListContext::getRuleIndex() const {
  return PlayScriptParser::RuleArgumentExpressionList;
}

void PlayScriptParser::ArgumentExpressionListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArgumentExpressionList(this);
}

void PlayScriptParser::ArgumentExpressionListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArgumentExpressionList(this);
}


PlayScriptParser::ArgumentExpressionListContext* PlayScriptParser::argumentExpressionList() {
   return argumentExpressionList(0);
}

PlayScriptParser::ArgumentExpressionListContext* PlayScriptParser::argumentExpressionList(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PlayScriptParser::ArgumentExpressionListContext *_localctx = _tracker.createInstance<ArgumentExpressionListContext>(_ctx, parentState);
  PlayScriptParser::ArgumentExpressionListContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 24;
  enterRecursionRule(_localctx, 24, PlayScriptParser::RuleArgumentExpressionList, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(123);
    assignmentExpression();
    _ctx->stop = _input->LT(-1);
    setState(130);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<ArgumentExpressionListContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleArgumentExpressionList);
        setState(125);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(126);
        match(PlayScriptParser::COMMA);
        setState(127);
        assignmentExpression(); 
      }
      setState(132);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 11, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- CompoundStatementContext ------------------------------------------------------------------

PlayScriptParser::CompoundStatementContext::CompoundStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::CompoundStatementContext::LBRACE() {
  return getToken(PlayScriptParser::LBRACE, 0);
}

tree::TerminalNode* PlayScriptParser::CompoundStatementContext::RBRACE() {
  return getToken(PlayScriptParser::RBRACE, 0);
}

PlayScriptParser::BlockItemListContext* PlayScriptParser::CompoundStatementContext::blockItemList() {
  return getRuleContext<PlayScriptParser::BlockItemListContext>(0);
}


size_t PlayScriptParser::CompoundStatementContext::getRuleIndex() const {
  return PlayScriptParser::RuleCompoundStatement;
}

void PlayScriptParser::CompoundStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCompoundStatement(this);
}

void PlayScriptParser::CompoundStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCompoundStatement(this);
}

PlayScriptParser::CompoundStatementContext* PlayScriptParser::compoundStatement() {
  CompoundStatementContext *_localctx = _tracker.createInstance<CompoundStatementContext>(_ctx, getState());
  enterRule(_localctx, 26, PlayScriptParser::RuleCompoundStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(133);
    match(PlayScriptParser::LBRACE);
    setState(135);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::T__0)
      | (1ULL << PlayScriptParser::T__1)
      | (1ULL << PlayScriptParser::T__2)
      | (1ULL << PlayScriptParser::IntegerLiteral)
      | (1ULL << PlayScriptParser::FloatingPointLiteral)
      | (1ULL << PlayScriptParser::BooleanLiteral)
      | (1ULL << PlayScriptParser::CharacterLiteral)
      | (1ULL << PlayScriptParser::StringLiteral)
      | (1ULL << PlayScriptParser::NullLiteral)
      | (1ULL << PlayScriptParser::LPAREN)
      | (1ULL << PlayScriptParser::LBRACE)
      | (1ULL << PlayScriptParser::SEMI))) != 0) || _la == PlayScriptParser::Identifier) {
      setState(134);
      blockItemList(0);
    }
    setState(137);
    match(PlayScriptParser::RBRACE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockItemListContext ------------------------------------------------------------------

PlayScriptParser::BlockItemListContext::BlockItemListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::BlockItemContext* PlayScriptParser::BlockItemListContext::blockItem() {
  return getRuleContext<PlayScriptParser::BlockItemContext>(0);
}

PlayScriptParser::BlockItemListContext* PlayScriptParser::BlockItemListContext::blockItemList() {
  return getRuleContext<PlayScriptParser::BlockItemListContext>(0);
}


size_t PlayScriptParser::BlockItemListContext::getRuleIndex() const {
  return PlayScriptParser::RuleBlockItemList;
}

void PlayScriptParser::BlockItemListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockItemList(this);
}

void PlayScriptParser::BlockItemListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockItemList(this);
}


PlayScriptParser::BlockItemListContext* PlayScriptParser::blockItemList() {
   return blockItemList(0);
}

PlayScriptParser::BlockItemListContext* PlayScriptParser::blockItemList(int precedence) {
  ParserRuleContext *parentContext = _ctx;
  size_t parentState = getState();
  PlayScriptParser::BlockItemListContext *_localctx = _tracker.createInstance<BlockItemListContext>(_ctx, parentState);
  PlayScriptParser::BlockItemListContext *previousContext = _localctx;
  (void)previousContext; // Silence compiler, in case the context is not used by generated code.
  size_t startState = 28;
  enterRecursionRule(_localctx, 28, PlayScriptParser::RuleBlockItemList, precedence);

    

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(140);
    blockItem();
    _ctx->stop = _input->LT(-1);
    setState(146);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        _localctx = _tracker.createInstance<BlockItemListContext>(parentContext, parentState);
        pushNewRecursionContext(_localctx, startState, RuleBlockItemList);
        setState(142);

        if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
        setState(143);
        blockItem(); 
      }
      setState(148);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 13, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- BlockItemContext ------------------------------------------------------------------

PlayScriptParser::BlockItemContext::BlockItemContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::StatementContext* PlayScriptParser::BlockItemContext::statement() {
  return getRuleContext<PlayScriptParser::StatementContext>(0);
}

PlayScriptParser::DeclarationContext* PlayScriptParser::BlockItemContext::declaration() {
  return getRuleContext<PlayScriptParser::DeclarationContext>(0);
}


size_t PlayScriptParser::BlockItemContext::getRuleIndex() const {
  return PlayScriptParser::RuleBlockItem;
}

void PlayScriptParser::BlockItemContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockItem(this);
}

void PlayScriptParser::BlockItemContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockItem(this);
}

PlayScriptParser::BlockItemContext* PlayScriptParser::blockItem() {
  BlockItemContext *_localctx = _tracker.createInstance<BlockItemContext>(_ctx, getState());
  enterRule(_localctx, 30, PlayScriptParser::RuleBlockItem);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(151);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::IntegerLiteral:
      case PlayScriptParser::FloatingPointLiteral:
      case PlayScriptParser::BooleanLiteral:
      case PlayScriptParser::CharacterLiteral:
      case PlayScriptParser::StringLiteral:
      case PlayScriptParser::NullLiteral:
      case PlayScriptParser::LPAREN:
      case PlayScriptParser::LBRACE:
      case PlayScriptParser::SEMI:
      case PlayScriptParser::Identifier: {
        enterOuterAlt(_localctx, 1);
        setState(149);
        statement();
        break;
      }

      case PlayScriptParser::T__0:
      case PlayScriptParser::T__1:
      case PlayScriptParser::T__2: {
        enterOuterAlt(_localctx, 2);
        setState(150);
        declaration();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

bool PlayScriptParser::sempred(RuleContext *context, size_t ruleIndex, size_t predicateIndex) {
  switch (ruleIndex) {
    case 6: return expressionSempred(dynamic_cast<ExpressionContext *>(context), predicateIndex);
    case 9: return additiveExpressionSempred(dynamic_cast<AdditiveExpressionContext *>(context), predicateIndex);
    case 10: return multiplicativeExpressionSempred(dynamic_cast<MultiplicativeExpressionContext *>(context), predicateIndex);
    case 12: return argumentExpressionListSempred(dynamic_cast<ArgumentExpressionListContext *>(context), predicateIndex);
    case 14: return blockItemListSempred(dynamic_cast<BlockItemListContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool PlayScriptParser::expressionSempred(ExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

bool PlayScriptParser::additiveExpressionSempred(AdditiveExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 1: return precpred(_ctx, 2);
    case 2: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

bool PlayScriptParser::multiplicativeExpressionSempred(MultiplicativeExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 3: return precpred(_ctx, 3);
    case 4: return precpred(_ctx, 2);
    case 5: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

bool PlayScriptParser::argumentExpressionListSempred(ArgumentExpressionListContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 6: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

bool PlayScriptParser::blockItemListSempred(BlockItemListContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 7: return precpred(_ctx, 1);

  default:
    break;
  }
  return true;
}

// Static vars and initialization.
std::vector<dfa::DFA> PlayScriptParser::_decisionToDFA;
atn::PredictionContextCache PlayScriptParser::_sharedContextCache;

// We own the ATN which in turn owns the ATN states.
atn::ATN PlayScriptParser::_atn;
std::vector<uint16_t> PlayScriptParser::_serializedATN;

std::vector<std::string> PlayScriptParser::_ruleNames = {
  "literal", "primitiveType", "statement", "expressionStatement", "declaration", 
  "initializer", "expression", "assignmentExpression", "assignmentOperator", 
  "additiveExpression", "multiplicativeExpression", "primaryExpression", 
  "argumentExpressionList", "compoundStatement", "blockItemList", "blockItem"
};

std::vector<std::string> PlayScriptParser::_literalNames = {
  "", "'Number'", "'String'", "'var'", "'boolean'", "'break'", "'byte'", 
  "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
  "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
  "'float'", "'for'", "'if'", "'implements'", "'import'", "'instanceof'", 
  "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
  "'protected'", "'public'", "'return'", "'short'", "'super'", "'switch'", 
  "'this'", "'void'", "'while'", "", "", "", "", "", "'null'", "'('", "')'", 
  "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'...'", "'@'", "'::'", 
  "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'->'", "'=='", "'<='", 
  "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
  "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
  "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
};

std::vector<std::string> PlayScriptParser::_symbolicNames = {
  "", "", "", "", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
  "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", 
  "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
  "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
  "PUBLIC", "RETURN", "SHORT", "SUPER", "SWITCH", "THIS", "VOID", "WHILE", 
  "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
  "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
  "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ELLIPSIS", "AT", "COLONCOLON", 
  "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "ARROW", "EQUAL", 
  "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
  "DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
  "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
  "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS", 
  "COMMENT", "LINE_COMMENT"
};

dfa::Vocabulary PlayScriptParser::_vocabulary(_literalNames, _symbolicNames);

std::vector<std::string> PlayScriptParser::_tokenNames;

PlayScriptParser::Initializer::Initializer() {
	for (size_t i = 0; i < _symbolicNames.size(); ++i) {
		std::string name = _vocabulary.getLiteralName(i);
		if (name.empty()) {
			name = _vocabulary.getSymbolicName(i);
		}

		if (name.empty()) {
			_tokenNames.push_back("<INVALID>");
		} else {
      _tokenNames.push_back(name);
    }
	}

  _serializedATN = {
    0x3, 0x608b, 0xa72a, 0x8133, 0xb9ed, 0x417c, 0x3be7, 0x7786, 0x5964, 
    0x3, 0x65, 0x9c, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 0x9, 
    0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 0x4, 
    0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 0x9, 
    0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 0x4, 
    0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x3, 0x2, 
    0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x29, 0xa, 
    0x4, 0x3, 0x5, 0x5, 0x5, 0x2c, 0xa, 0x5, 0x3, 0x5, 0x3, 0x5, 0x3, 0x6, 
    0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 
    0x37, 0xa, 0x6, 0x3, 0x7, 0x3, 0x7, 0x3, 0x7, 0x3, 0x8, 0x3, 0x8, 0x3, 
    0x8, 0x3, 0x8, 0x3, 0x8, 0x3, 0x8, 0x7, 0x8, 0x42, 0xa, 0x8, 0xc, 0x8, 
    0xe, 0x8, 0x45, 0xb, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x3, 
    0x9, 0x5, 0x9, 0x4c, 0xa, 0x9, 0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 
    0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 0x3, 0xb, 
    0x7, 0xb, 0x59, 0xa, 0xb, 0xc, 0xb, 0xe, 0xb, 0x5c, 0xb, 0xb, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 
    0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x7, 0xc, 0x6a, 0xa, 0xc, 0xc, 
    0xc, 0xe, 0xc, 0x6d, 0xb, 0xc, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x5, 0xd, 0x74, 0xa, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 
    0xd, 0x3, 0xd, 0x5, 0xd, 0x7b, 0xa, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 
    0x3, 0xe, 0x3, 0xe, 0x3, 0xe, 0x7, 0xe, 0x83, 0xa, 0xe, 0xc, 0xe, 0xe, 
    0xe, 0x86, 0xb, 0xe, 0x3, 0xf, 0x3, 0xf, 0x5, 0xf, 0x8a, 0xa, 0xf, 0x3, 
    0xf, 0x3, 0xf, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 0x3, 0x10, 
    0x7, 0x10, 0x93, 0xa, 0x10, 0xc, 0x10, 0xe, 0x10, 0x96, 0xb, 0x10, 0x3, 
    0x11, 0x3, 0x11, 0x5, 0x11, 0x9a, 0xa, 0x11, 0x3, 0x11, 0x2, 0x7, 0xe, 
    0x14, 0x16, 0x1a, 0x1e, 0x12, 0x2, 0x4, 0x6, 0x8, 0xa, 0xc, 0xe, 0x10, 
    0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x2, 0x5, 0x3, 0x2, 
    0x2d, 0x32, 0x3, 0x2, 0x3, 0x5, 0x4, 0x2, 0x3f, 0x3f, 0x57, 0x61, 0x2, 
    0x9d, 0x2, 0x22, 0x3, 0x2, 0x2, 0x2, 0x4, 0x24, 0x3, 0x2, 0x2, 0x2, 
    0x6, 0x28, 0x3, 0x2, 0x2, 0x2, 0x8, 0x2b, 0x3, 0x2, 0x2, 0x2, 0xa, 0x36, 
    0x3, 0x2, 0x2, 0x2, 0xc, 0x38, 0x3, 0x2, 0x2, 0x2, 0xe, 0x3b, 0x3, 0x2, 
    0x2, 0x2, 0x10, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x12, 0x4d, 0x3, 0x2, 0x2, 
    0x2, 0x14, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x16, 0x5d, 0x3, 0x2, 0x2, 0x2, 
    0x18, 0x7a, 0x3, 0x2, 0x2, 0x2, 0x1a, 0x7c, 0x3, 0x2, 0x2, 0x2, 0x1c, 
    0x87, 0x3, 0x2, 0x2, 0x2, 0x1e, 0x8d, 0x3, 0x2, 0x2, 0x2, 0x20, 0x99, 
    0x3, 0x2, 0x2, 0x2, 0x22, 0x23, 0x9, 0x2, 0x2, 0x2, 0x23, 0x3, 0x3, 
    0x2, 0x2, 0x2, 0x24, 0x25, 0x9, 0x3, 0x2, 0x2, 0x25, 0x5, 0x3, 0x2, 
    0x2, 0x2, 0x26, 0x29, 0x5, 0x8, 0x5, 0x2, 0x27, 0x29, 0x5, 0x1c, 0xf, 
    0x2, 0x28, 0x26, 0x3, 0x2, 0x2, 0x2, 0x28, 0x27, 0x3, 0x2, 0x2, 0x2, 
    0x29, 0x7, 0x3, 0x2, 0x2, 0x2, 0x2a, 0x2c, 0x5, 0xe, 0x8, 0x2, 0x2b, 
    0x2a, 0x3, 0x2, 0x2, 0x2, 0x2b, 0x2c, 0x3, 0x2, 0x2, 0x2, 0x2c, 0x2d, 
    0x3, 0x2, 0x2, 0x2, 0x2d, 0x2e, 0x7, 0x39, 0x2, 0x2, 0x2e, 0x9, 0x3, 
    0x2, 0x2, 0x2, 0x2f, 0x30, 0x5, 0x4, 0x3, 0x2, 0x30, 0x31, 0x7, 0x62, 
    0x2, 0x2, 0x31, 0x37, 0x3, 0x2, 0x2, 0x2, 0x32, 0x33, 0x5, 0x4, 0x3, 
    0x2, 0x33, 0x34, 0x7, 0x62, 0x2, 0x2, 0x34, 0x35, 0x5, 0xc, 0x7, 0x2, 
    0x35, 0x37, 0x3, 0x2, 0x2, 0x2, 0x36, 0x2f, 0x3, 0x2, 0x2, 0x2, 0x36, 
    0x32, 0x3, 0x2, 0x2, 0x2, 0x37, 0xb, 0x3, 0x2, 0x2, 0x2, 0x38, 0x39, 
    0x5, 0x12, 0xa, 0x2, 0x39, 0x3a, 0x5, 0x10, 0x9, 0x2, 0x3a, 0xd, 0x3, 
    0x2, 0x2, 0x2, 0x3b, 0x3c, 0x8, 0x8, 0x1, 0x2, 0x3c, 0x3d, 0x5, 0x10, 
    0x9, 0x2, 0x3d, 0x43, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x3f, 0xc, 0x3, 0x2, 
    0x2, 0x3f, 0x40, 0x7, 0x3a, 0x2, 0x2, 0x40, 0x42, 0x5, 0x10, 0x9, 0x2, 
    0x41, 0x3e, 0x3, 0x2, 0x2, 0x2, 0x42, 0x45, 0x3, 0x2, 0x2, 0x2, 0x43, 
    0x41, 0x3, 0x2, 0x2, 0x2, 0x43, 0x44, 0x3, 0x2, 0x2, 0x2, 0x44, 0xf, 
    0x3, 0x2, 0x2, 0x2, 0x45, 0x43, 0x3, 0x2, 0x2, 0x2, 0x46, 0x4c, 0x5, 
    0x14, 0xb, 0x2, 0x47, 0x48, 0x7, 0x62, 0x2, 0x2, 0x48, 0x49, 0x5, 0x12, 
    0xa, 0x2, 0x49, 0x4a, 0x5, 0x14, 0xb, 0x2, 0x4a, 0x4c, 0x3, 0x2, 0x2, 
    0x2, 0x4b, 0x46, 0x3, 0x2, 0x2, 0x2, 0x4b, 0x47, 0x3, 0x2, 0x2, 0x2, 
    0x4c, 0x11, 0x3, 0x2, 0x2, 0x2, 0x4d, 0x4e, 0x9, 0x4, 0x2, 0x2, 0x4e, 
    0x13, 0x3, 0x2, 0x2, 0x2, 0x4f, 0x50, 0x8, 0xb, 0x1, 0x2, 0x50, 0x51, 
    0x5, 0x16, 0xc, 0x2, 0x51, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x52, 0x53, 0xc, 
    0x4, 0x2, 0x2, 0x53, 0x54, 0x7, 0x4f, 0x2, 0x2, 0x54, 0x59, 0x5, 0x16, 
    0xc, 0x2, 0x55, 0x56, 0xc, 0x3, 0x2, 0x2, 0x56, 0x57, 0x7, 0x50, 0x2, 
    0x2, 0x57, 0x59, 0x5, 0x16, 0xc, 0x2, 0x58, 0x52, 0x3, 0x2, 0x2, 0x2, 
    0x58, 0x55, 0x3, 0x2, 0x2, 0x2, 0x59, 0x5c, 0x3, 0x2, 0x2, 0x2, 0x5a, 
    0x58, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x5b, 0x3, 0x2, 0x2, 0x2, 0x5b, 0x15, 
    0x3, 0x2, 0x2, 0x2, 0x5c, 0x5a, 0x3, 0x2, 0x2, 0x2, 0x5d, 0x5e, 0x8, 
    0xc, 0x1, 0x2, 0x5e, 0x5f, 0x5, 0x18, 0xd, 0x2, 0x5f, 0x6b, 0x3, 0x2, 
    0x2, 0x2, 0x60, 0x61, 0xc, 0x5, 0x2, 0x2, 0x61, 0x62, 0x7, 0x51, 0x2, 
    0x2, 0x62, 0x6a, 0x5, 0x18, 0xd, 0x2, 0x63, 0x64, 0xc, 0x4, 0x2, 0x2, 
    0x64, 0x65, 0x7, 0x52, 0x2, 0x2, 0x65, 0x6a, 0x5, 0x18, 0xd, 0x2, 0x66, 
    0x67, 0xc, 0x3, 0x2, 0x2, 0x67, 0x68, 0x7, 0x56, 0x2, 0x2, 0x68, 0x6a, 
    0x5, 0x18, 0xd, 0x2, 0x69, 0x60, 0x3, 0x2, 0x2, 0x2, 0x69, 0x63, 0x3, 
    0x2, 0x2, 0x2, 0x69, 0x66, 0x3, 0x2, 0x2, 0x2, 0x6a, 0x6d, 0x3, 0x2, 
    0x2, 0x2, 0x6b, 0x69, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x6c, 0x3, 0x2, 0x2, 
    0x2, 0x6c, 0x17, 0x3, 0x2, 0x2, 0x2, 0x6d, 0x6b, 0x3, 0x2, 0x2, 0x2, 
    0x6e, 0x7b, 0x7, 0x62, 0x2, 0x2, 0x6f, 0x7b, 0x5, 0x2, 0x2, 0x2, 0x70, 
    0x71, 0x7, 0x62, 0x2, 0x2, 0x71, 0x73, 0x7, 0x33, 0x2, 0x2, 0x72, 0x74, 
    0x5, 0x1a, 0xe, 0x2, 0x73, 0x72, 0x3, 0x2, 0x2, 0x2, 0x73, 0x74, 0x3, 
    0x2, 0x2, 0x2, 0x74, 0x75, 0x3, 0x2, 0x2, 0x2, 0x75, 0x7b, 0x7, 0x34, 
    0x2, 0x2, 0x76, 0x77, 0x7, 0x33, 0x2, 0x2, 0x77, 0x78, 0x5, 0xe, 0x8, 
    0x2, 0x78, 0x79, 0x7, 0x34, 0x2, 0x2, 0x79, 0x7b, 0x3, 0x2, 0x2, 0x2, 
    0x7a, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x7a, 
    0x70, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x76, 0x3, 0x2, 0x2, 0x2, 0x7b, 0x19, 
    0x3, 0x2, 0x2, 0x2, 0x7c, 0x7d, 0x8, 0xe, 0x1, 0x2, 0x7d, 0x7e, 0x5, 
    0x10, 0x9, 0x2, 0x7e, 0x84, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x80, 0xc, 0x3, 
    0x2, 0x2, 0x80, 0x81, 0x7, 0x3a, 0x2, 0x2, 0x81, 0x83, 0x5, 0x10, 0x9, 
    0x2, 0x82, 0x7f, 0x3, 0x2, 0x2, 0x2, 0x83, 0x86, 0x3, 0x2, 0x2, 0x2, 
    0x84, 0x82, 0x3, 0x2, 0x2, 0x2, 0x84, 0x85, 0x3, 0x2, 0x2, 0x2, 0x85, 
    0x1b, 0x3, 0x2, 0x2, 0x2, 0x86, 0x84, 0x3, 0x2, 0x2, 0x2, 0x87, 0x89, 
    0x7, 0x35, 0x2, 0x2, 0x88, 0x8a, 0x5, 0x1e, 0x10, 0x2, 0x89, 0x88, 0x3, 
    0x2, 0x2, 0x2, 0x89, 0x8a, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x8b, 0x3, 0x2, 
    0x2, 0x2, 0x8b, 0x8c, 0x7, 0x36, 0x2, 0x2, 0x8c, 0x1d, 0x3, 0x2, 0x2, 
    0x2, 0x8d, 0x8e, 0x8, 0x10, 0x1, 0x2, 0x8e, 0x8f, 0x5, 0x20, 0x11, 0x2, 
    0x8f, 0x94, 0x3, 0x2, 0x2, 0x2, 0x90, 0x91, 0xc, 0x3, 0x2, 0x2, 0x91, 
    0x93, 0x5, 0x20, 0x11, 0x2, 0x92, 0x90, 0x3, 0x2, 0x2, 0x2, 0x93, 0x96, 
    0x3, 0x2, 0x2, 0x2, 0x94, 0x92, 0x3, 0x2, 0x2, 0x2, 0x94, 0x95, 0x3, 
    0x2, 0x2, 0x2, 0x95, 0x1f, 0x3, 0x2, 0x2, 0x2, 0x96, 0x94, 0x3, 0x2, 
    0x2, 0x2, 0x97, 0x9a, 0x5, 0x6, 0x4, 0x2, 0x98, 0x9a, 0x5, 0xa, 0x6, 
    0x2, 0x99, 0x97, 0x3, 0x2, 0x2, 0x2, 0x99, 0x98, 0x3, 0x2, 0x2, 0x2, 
    0x9a, 0x21, 0x3, 0x2, 0x2, 0x2, 0x11, 0x28, 0x2b, 0x36, 0x43, 0x4b, 
    0x58, 0x5a, 0x69, 0x6b, 0x73, 0x7a, 0x84, 0x89, 0x94, 0x99, 
  };

  atn::ATNDeserializer deserializer;
  _atn = deserializer.deserialize(_serializedATN);

  size_t count = _atn.getNumberOfDecisions();
  _decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    _decisionToDFA.emplace_back(_atn.getDecisionState(i), i);
  }
}

PlayScriptParser::Initializer PlayScriptParser::_init;
