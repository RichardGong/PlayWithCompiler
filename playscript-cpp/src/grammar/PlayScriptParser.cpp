
// Generated from PlayScript.g4 by ANTLR 4.7.2


#include "PlayScriptListener.h"
#include "PlayScriptVisitor.h"

#include "PlayScriptParser.h"


using namespace antlrcpp;
using namespace play;
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


//----------------- ClassDeclarationContext ------------------------------------------------------------------

PlayScriptParser::ClassDeclarationContext::ClassDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ClassDeclarationContext::CLASS() {
  return getToken(PlayScriptParser::CLASS, 0);
}

tree::TerminalNode* PlayScriptParser::ClassDeclarationContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

PlayScriptParser::ClassBodyContext* PlayScriptParser::ClassDeclarationContext::classBody() {
  return getRuleContext<PlayScriptParser::ClassBodyContext>(0);
}

tree::TerminalNode* PlayScriptParser::ClassDeclarationContext::EXTENDS() {
  return getToken(PlayScriptParser::EXTENDS, 0);
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::ClassDeclarationContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

tree::TerminalNode* PlayScriptParser::ClassDeclarationContext::IMPLEMENTS() {
  return getToken(PlayScriptParser::IMPLEMENTS, 0);
}

PlayScriptParser::TypeListContext* PlayScriptParser::ClassDeclarationContext::typeList() {
  return getRuleContext<PlayScriptParser::TypeListContext>(0);
}


size_t PlayScriptParser::ClassDeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleClassDeclaration;
}

void PlayScriptParser::ClassDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassDeclaration(this);
}

void PlayScriptParser::ClassDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassDeclaration(this);
}


antlrcpp::Any PlayScriptParser::ClassDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitClassDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ClassDeclarationContext* PlayScriptParser::classDeclaration() {
  ClassDeclarationContext *_localctx = _tracker.createInstance<ClassDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 0, PlayScriptParser::RuleClassDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(96);
    match(PlayScriptParser::CLASS);
    setState(97);
    match(PlayScriptParser::IDENTIFIER);
    setState(100);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PlayScriptParser::EXTENDS) {
      setState(98);
      match(PlayScriptParser::EXTENDS);
      setState(99);
      typeType();
    }
    setState(104);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PlayScriptParser::IMPLEMENTS) {
      setState(102);
      match(PlayScriptParser::IMPLEMENTS);
      setState(103);
      typeList();
    }
    setState(106);
    classBody();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassBodyContext ------------------------------------------------------------------

PlayScriptParser::ClassBodyContext::ClassBodyContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ClassBodyContext::LBRACE() {
  return getToken(PlayScriptParser::LBRACE, 0);
}

tree::TerminalNode* PlayScriptParser::ClassBodyContext::RBRACE() {
  return getToken(PlayScriptParser::RBRACE, 0);
}

std::vector<PlayScriptParser::ClassBodyDeclarationContext *> PlayScriptParser::ClassBodyContext::classBodyDeclaration() {
  return getRuleContexts<PlayScriptParser::ClassBodyDeclarationContext>();
}

PlayScriptParser::ClassBodyDeclarationContext* PlayScriptParser::ClassBodyContext::classBodyDeclaration(size_t i) {
  return getRuleContext<PlayScriptParser::ClassBodyDeclarationContext>(i);
}


size_t PlayScriptParser::ClassBodyContext::getRuleIndex() const {
  return PlayScriptParser::RuleClassBody;
}

void PlayScriptParser::ClassBodyContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassBody(this);
}

void PlayScriptParser::ClassBodyContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassBody(this);
}


antlrcpp::Any PlayScriptParser::ClassBodyContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitClassBody(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ClassBodyContext* PlayScriptParser::classBody() {
  ClassBodyContext *_localctx = _tracker.createInstance<ClassBodyContext>(_ctx, getState());
  enterRule(_localctx, 2, PlayScriptParser::RuleClassBody);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(108);
    match(PlayScriptParser::LBRACE);
    setState(112);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
      | (1ULL << PlayScriptParser::BYTE)
      | (1ULL << PlayScriptParser::CHAR)
      | (1ULL << PlayScriptParser::DOUBLE)
      | (1ULL << PlayScriptParser::FLOAT)
      | (1ULL << PlayScriptParser::INT)
      | (1ULL << PlayScriptParser::LONG)
      | (1ULL << PlayScriptParser::SHORT)
      | (1ULL << PlayScriptParser::VOID)
      | (1ULL << PlayScriptParser::FUNCTION))) != 0) || _la == PlayScriptParser::SEMI

    || _la == PlayScriptParser::IDENTIFIER) {
      setState(109);
      classBodyDeclaration();
      setState(114);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(115);
    match(PlayScriptParser::RBRACE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassBodyDeclarationContext ------------------------------------------------------------------

PlayScriptParser::ClassBodyDeclarationContext::ClassBodyDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ClassBodyDeclarationContext::SEMI() {
  return getToken(PlayScriptParser::SEMI, 0);
}

PlayScriptParser::MemberDeclarationContext* PlayScriptParser::ClassBodyDeclarationContext::memberDeclaration() {
  return getRuleContext<PlayScriptParser::MemberDeclarationContext>(0);
}


size_t PlayScriptParser::ClassBodyDeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleClassBodyDeclaration;
}

void PlayScriptParser::ClassBodyDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassBodyDeclaration(this);
}

void PlayScriptParser::ClassBodyDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassBodyDeclaration(this);
}


antlrcpp::Any PlayScriptParser::ClassBodyDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitClassBodyDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ClassBodyDeclarationContext* PlayScriptParser::classBodyDeclaration() {
  ClassBodyDeclarationContext *_localctx = _tracker.createInstance<ClassBodyDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 4, PlayScriptParser::RuleClassBodyDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(119);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::SEMI: {
        enterOuterAlt(_localctx, 1);
        setState(117);
        match(PlayScriptParser::SEMI);
        break;
      }

      case PlayScriptParser::BOOLEAN:
      case PlayScriptParser::BYTE:
      case PlayScriptParser::CHAR:
      case PlayScriptParser::DOUBLE:
      case PlayScriptParser::FLOAT:
      case PlayScriptParser::INT:
      case PlayScriptParser::LONG:
      case PlayScriptParser::SHORT:
      case PlayScriptParser::VOID:
      case PlayScriptParser::FUNCTION:
      case PlayScriptParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 2);
        setState(118);
        memberDeclaration();
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

//----------------- MemberDeclarationContext ------------------------------------------------------------------

PlayScriptParser::MemberDeclarationContext::MemberDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::FunctionDeclarationContext* PlayScriptParser::MemberDeclarationContext::functionDeclaration() {
  return getRuleContext<PlayScriptParser::FunctionDeclarationContext>(0);
}

PlayScriptParser::FieldDeclarationContext* PlayScriptParser::MemberDeclarationContext::fieldDeclaration() {
  return getRuleContext<PlayScriptParser::FieldDeclarationContext>(0);
}


size_t PlayScriptParser::MemberDeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleMemberDeclaration;
}

void PlayScriptParser::MemberDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterMemberDeclaration(this);
}

void PlayScriptParser::MemberDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitMemberDeclaration(this);
}


antlrcpp::Any PlayScriptParser::MemberDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitMemberDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::MemberDeclarationContext* PlayScriptParser::memberDeclaration() {
  MemberDeclarationContext *_localctx = _tracker.createInstance<MemberDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 6, PlayScriptParser::RuleMemberDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(123);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 4, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(121);
      functionDeclaration();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(122);
      fieldDeclaration();
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

//----------------- FunctionDeclarationContext ------------------------------------------------------------------

PlayScriptParser::FunctionDeclarationContext::FunctionDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::FunctionDeclarationContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

PlayScriptParser::FormalParametersContext* PlayScriptParser::FunctionDeclarationContext::formalParameters() {
  return getRuleContext<PlayScriptParser::FormalParametersContext>(0);
}

PlayScriptParser::FunctionBodyContext* PlayScriptParser::FunctionDeclarationContext::functionBody() {
  return getRuleContext<PlayScriptParser::FunctionBodyContext>(0);
}

PlayScriptParser::TypeTypeOrVoidContext* PlayScriptParser::FunctionDeclarationContext::typeTypeOrVoid() {
  return getRuleContext<PlayScriptParser::TypeTypeOrVoidContext>(0);
}

std::vector<tree::TerminalNode *> PlayScriptParser::FunctionDeclarationContext::LBRACK() {
  return getTokens(PlayScriptParser::LBRACK);
}

tree::TerminalNode* PlayScriptParser::FunctionDeclarationContext::LBRACK(size_t i) {
  return getToken(PlayScriptParser::LBRACK, i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::FunctionDeclarationContext::RBRACK() {
  return getTokens(PlayScriptParser::RBRACK);
}

tree::TerminalNode* PlayScriptParser::FunctionDeclarationContext::RBRACK(size_t i) {
  return getToken(PlayScriptParser::RBRACK, i);
}

tree::TerminalNode* PlayScriptParser::FunctionDeclarationContext::THROWS() {
  return getToken(PlayScriptParser::THROWS, 0);
}

PlayScriptParser::QualifiedNameListContext* PlayScriptParser::FunctionDeclarationContext::qualifiedNameList() {
  return getRuleContext<PlayScriptParser::QualifiedNameListContext>(0);
}


size_t PlayScriptParser::FunctionDeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleFunctionDeclaration;
}

void PlayScriptParser::FunctionDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionDeclaration(this);
}

void PlayScriptParser::FunctionDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionDeclaration(this);
}


antlrcpp::Any PlayScriptParser::FunctionDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFunctionDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FunctionDeclarationContext* PlayScriptParser::functionDeclaration() {
  FunctionDeclarationContext *_localctx = _tracker.createInstance<FunctionDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 8, PlayScriptParser::RuleFunctionDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(126);
    _errHandler->sync(this);

    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 5, _ctx)) {
    case 1: {
      setState(125);
      typeTypeOrVoid();
      break;
    }

    }
    setState(128);
    match(PlayScriptParser::IDENTIFIER);
    setState(129);
    formalParameters();
    setState(134);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::LBRACK) {
      setState(130);
      match(PlayScriptParser::LBRACK);
      setState(131);
      match(PlayScriptParser::RBRACK);
      setState(136);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(139);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PlayScriptParser::THROWS) {
      setState(137);
      match(PlayScriptParser::THROWS);
      setState(138);
      qualifiedNameList();
    }
    setState(141);
    functionBody();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionBodyContext ------------------------------------------------------------------

PlayScriptParser::FunctionBodyContext::FunctionBodyContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::BlockContext* PlayScriptParser::FunctionBodyContext::block() {
  return getRuleContext<PlayScriptParser::BlockContext>(0);
}

tree::TerminalNode* PlayScriptParser::FunctionBodyContext::SEMI() {
  return getToken(PlayScriptParser::SEMI, 0);
}


size_t PlayScriptParser::FunctionBodyContext::getRuleIndex() const {
  return PlayScriptParser::RuleFunctionBody;
}

void PlayScriptParser::FunctionBodyContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionBody(this);
}

void PlayScriptParser::FunctionBodyContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionBody(this);
}


antlrcpp::Any PlayScriptParser::FunctionBodyContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFunctionBody(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FunctionBodyContext* PlayScriptParser::functionBody() {
  FunctionBodyContext *_localctx = _tracker.createInstance<FunctionBodyContext>(_ctx, getState());
  enterRule(_localctx, 10, PlayScriptParser::RuleFunctionBody);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(145);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::LBRACE: {
        enterOuterAlt(_localctx, 1);
        setState(143);
        block();
        break;
      }

      case PlayScriptParser::SEMI: {
        enterOuterAlt(_localctx, 2);
        setState(144);
        match(PlayScriptParser::SEMI);
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

//----------------- TypeTypeOrVoidContext ------------------------------------------------------------------

PlayScriptParser::TypeTypeOrVoidContext::TypeTypeOrVoidContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::TypeTypeOrVoidContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

tree::TerminalNode* PlayScriptParser::TypeTypeOrVoidContext::VOID() {
  return getToken(PlayScriptParser::VOID, 0);
}


size_t PlayScriptParser::TypeTypeOrVoidContext::getRuleIndex() const {
  return PlayScriptParser::RuleTypeTypeOrVoid;
}

void PlayScriptParser::TypeTypeOrVoidContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTypeTypeOrVoid(this);
}

void PlayScriptParser::TypeTypeOrVoidContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTypeTypeOrVoid(this);
}


antlrcpp::Any PlayScriptParser::TypeTypeOrVoidContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitTypeTypeOrVoid(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::TypeTypeOrVoidContext* PlayScriptParser::typeTypeOrVoid() {
  TypeTypeOrVoidContext *_localctx = _tracker.createInstance<TypeTypeOrVoidContext>(_ctx, getState());
  enterRule(_localctx, 12, PlayScriptParser::RuleTypeTypeOrVoid);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(149);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::BOOLEAN:
      case PlayScriptParser::BYTE:
      case PlayScriptParser::CHAR:
      case PlayScriptParser::DOUBLE:
      case PlayScriptParser::FLOAT:
      case PlayScriptParser::INT:
      case PlayScriptParser::LONG:
      case PlayScriptParser::SHORT:
      case PlayScriptParser::FUNCTION:
      case PlayScriptParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 1);
        setState(147);
        typeType();
        break;
      }

      case PlayScriptParser::VOID: {
        enterOuterAlt(_localctx, 2);
        setState(148);
        match(PlayScriptParser::VOID);
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

//----------------- QualifiedNameListContext ------------------------------------------------------------------

PlayScriptParser::QualifiedNameListContext::QualifiedNameListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PlayScriptParser::QualifiedNameContext *> PlayScriptParser::QualifiedNameListContext::qualifiedName() {
  return getRuleContexts<PlayScriptParser::QualifiedNameContext>();
}

PlayScriptParser::QualifiedNameContext* PlayScriptParser::QualifiedNameListContext::qualifiedName(size_t i) {
  return getRuleContext<PlayScriptParser::QualifiedNameContext>(i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::QualifiedNameListContext::COMMA() {
  return getTokens(PlayScriptParser::COMMA);
}

tree::TerminalNode* PlayScriptParser::QualifiedNameListContext::COMMA(size_t i) {
  return getToken(PlayScriptParser::COMMA, i);
}


size_t PlayScriptParser::QualifiedNameListContext::getRuleIndex() const {
  return PlayScriptParser::RuleQualifiedNameList;
}

void PlayScriptParser::QualifiedNameListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterQualifiedNameList(this);
}

void PlayScriptParser::QualifiedNameListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitQualifiedNameList(this);
}


antlrcpp::Any PlayScriptParser::QualifiedNameListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitQualifiedNameList(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::QualifiedNameListContext* PlayScriptParser::qualifiedNameList() {
  QualifiedNameListContext *_localctx = _tracker.createInstance<QualifiedNameListContext>(_ctx, getState());
  enterRule(_localctx, 14, PlayScriptParser::RuleQualifiedNameList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(151);
    qualifiedName();
    setState(156);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::COMMA) {
      setState(152);
      match(PlayScriptParser::COMMA);
      setState(153);
      qualifiedName();
      setState(158);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FormalParametersContext ------------------------------------------------------------------

PlayScriptParser::FormalParametersContext::FormalParametersContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::FormalParametersContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::FormalParametersContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

PlayScriptParser::FormalParameterListContext* PlayScriptParser::FormalParametersContext::formalParameterList() {
  return getRuleContext<PlayScriptParser::FormalParameterListContext>(0);
}


size_t PlayScriptParser::FormalParametersContext::getRuleIndex() const {
  return PlayScriptParser::RuleFormalParameters;
}

void PlayScriptParser::FormalParametersContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFormalParameters(this);
}

void PlayScriptParser::FormalParametersContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFormalParameters(this);
}


antlrcpp::Any PlayScriptParser::FormalParametersContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFormalParameters(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FormalParametersContext* PlayScriptParser::formalParameters() {
  FormalParametersContext *_localctx = _tracker.createInstance<FormalParametersContext>(_ctx, getState());
  enterRule(_localctx, 16, PlayScriptParser::RuleFormalParameters);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(159);
    match(PlayScriptParser::LPAREN);
    setState(161);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
      | (1ULL << PlayScriptParser::BYTE)
      | (1ULL << PlayScriptParser::CHAR)
      | (1ULL << PlayScriptParser::DOUBLE)
      | (1ULL << PlayScriptParser::FINAL)
      | (1ULL << PlayScriptParser::FLOAT)
      | (1ULL << PlayScriptParser::INT)
      | (1ULL << PlayScriptParser::LONG)
      | (1ULL << PlayScriptParser::SHORT)
      | (1ULL << PlayScriptParser::FUNCTION))) != 0) || _la == PlayScriptParser::IDENTIFIER) {
      setState(160);
      formalParameterList();
    }
    setState(163);
    match(PlayScriptParser::RPAREN);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FormalParameterListContext ------------------------------------------------------------------

PlayScriptParser::FormalParameterListContext::FormalParameterListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PlayScriptParser::FormalParameterContext *> PlayScriptParser::FormalParameterListContext::formalParameter() {
  return getRuleContexts<PlayScriptParser::FormalParameterContext>();
}

PlayScriptParser::FormalParameterContext* PlayScriptParser::FormalParameterListContext::formalParameter(size_t i) {
  return getRuleContext<PlayScriptParser::FormalParameterContext>(i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::FormalParameterListContext::COMMA() {
  return getTokens(PlayScriptParser::COMMA);
}

tree::TerminalNode* PlayScriptParser::FormalParameterListContext::COMMA(size_t i) {
  return getToken(PlayScriptParser::COMMA, i);
}

PlayScriptParser::LastFormalParameterContext* PlayScriptParser::FormalParameterListContext::lastFormalParameter() {
  return getRuleContext<PlayScriptParser::LastFormalParameterContext>(0);
}


size_t PlayScriptParser::FormalParameterListContext::getRuleIndex() const {
  return PlayScriptParser::RuleFormalParameterList;
}

void PlayScriptParser::FormalParameterListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFormalParameterList(this);
}

void PlayScriptParser::FormalParameterListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFormalParameterList(this);
}


antlrcpp::Any PlayScriptParser::FormalParameterListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFormalParameterList(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FormalParameterListContext* PlayScriptParser::formalParameterList() {
  FormalParameterListContext *_localctx = _tracker.createInstance<FormalParameterListContext>(_ctx, getState());
  enterRule(_localctx, 18, PlayScriptParser::RuleFormalParameterList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    setState(178);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 14, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(165);
      formalParameter();
      setState(170);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(166);
          match(PlayScriptParser::COMMA);
          setState(167);
          formalParameter(); 
        }
        setState(172);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 12, _ctx);
      }
      setState(175);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PlayScriptParser::COMMA) {
        setState(173);
        match(PlayScriptParser::COMMA);
        setState(174);
        lastFormalParameter();
      }
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(177);
      lastFormalParameter();
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

//----------------- FormalParameterContext ------------------------------------------------------------------

PlayScriptParser::FormalParameterContext::FormalParameterContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::FormalParameterContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

PlayScriptParser::VariableDeclaratorIdContext* PlayScriptParser::FormalParameterContext::variableDeclaratorId() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorIdContext>(0);
}

std::vector<PlayScriptParser::VariableModifierContext *> PlayScriptParser::FormalParameterContext::variableModifier() {
  return getRuleContexts<PlayScriptParser::VariableModifierContext>();
}

PlayScriptParser::VariableModifierContext* PlayScriptParser::FormalParameterContext::variableModifier(size_t i) {
  return getRuleContext<PlayScriptParser::VariableModifierContext>(i);
}


size_t PlayScriptParser::FormalParameterContext::getRuleIndex() const {
  return PlayScriptParser::RuleFormalParameter;
}

void PlayScriptParser::FormalParameterContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFormalParameter(this);
}

void PlayScriptParser::FormalParameterContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFormalParameter(this);
}


antlrcpp::Any PlayScriptParser::FormalParameterContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFormalParameter(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FormalParameterContext* PlayScriptParser::formalParameter() {
  FormalParameterContext *_localctx = _tracker.createInstance<FormalParameterContext>(_ctx, getState());
  enterRule(_localctx, 20, PlayScriptParser::RuleFormalParameter);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(183);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::FINAL) {
      setState(180);
      variableModifier();
      setState(185);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(186);
    typeType();
    setState(187);
    variableDeclaratorId();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- LastFormalParameterContext ------------------------------------------------------------------

PlayScriptParser::LastFormalParameterContext::LastFormalParameterContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::LastFormalParameterContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

tree::TerminalNode* PlayScriptParser::LastFormalParameterContext::ELLIPSIS() {
  return getToken(PlayScriptParser::ELLIPSIS, 0);
}

PlayScriptParser::VariableDeclaratorIdContext* PlayScriptParser::LastFormalParameterContext::variableDeclaratorId() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorIdContext>(0);
}

std::vector<PlayScriptParser::VariableModifierContext *> PlayScriptParser::LastFormalParameterContext::variableModifier() {
  return getRuleContexts<PlayScriptParser::VariableModifierContext>();
}

PlayScriptParser::VariableModifierContext* PlayScriptParser::LastFormalParameterContext::variableModifier(size_t i) {
  return getRuleContext<PlayScriptParser::VariableModifierContext>(i);
}


size_t PlayScriptParser::LastFormalParameterContext::getRuleIndex() const {
  return PlayScriptParser::RuleLastFormalParameter;
}

void PlayScriptParser::LastFormalParameterContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterLastFormalParameter(this);
}

void PlayScriptParser::LastFormalParameterContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitLastFormalParameter(this);
}


antlrcpp::Any PlayScriptParser::LastFormalParameterContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitLastFormalParameter(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::LastFormalParameterContext* PlayScriptParser::lastFormalParameter() {
  LastFormalParameterContext *_localctx = _tracker.createInstance<LastFormalParameterContext>(_ctx, getState());
  enterRule(_localctx, 22, PlayScriptParser::RuleLastFormalParameter);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(192);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::FINAL) {
      setState(189);
      variableModifier();
      setState(194);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
    setState(195);
    typeType();
    setState(196);
    match(PlayScriptParser::ELLIPSIS);
    setState(197);
    variableDeclaratorId();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableModifierContext ------------------------------------------------------------------

PlayScriptParser::VariableModifierContext::VariableModifierContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::VariableModifierContext::FINAL() {
  return getToken(PlayScriptParser::FINAL, 0);
}


size_t PlayScriptParser::VariableModifierContext::getRuleIndex() const {
  return PlayScriptParser::RuleVariableModifier;
}

void PlayScriptParser::VariableModifierContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableModifier(this);
}

void PlayScriptParser::VariableModifierContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableModifier(this);
}


antlrcpp::Any PlayScriptParser::VariableModifierContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitVariableModifier(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::VariableModifierContext* PlayScriptParser::variableModifier() {
  VariableModifierContext *_localctx = _tracker.createInstance<VariableModifierContext>(_ctx, getState());
  enterRule(_localctx, 24, PlayScriptParser::RuleVariableModifier);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(199);
    match(PlayScriptParser::FINAL);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- QualifiedNameContext ------------------------------------------------------------------

PlayScriptParser::QualifiedNameContext::QualifiedNameContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> PlayScriptParser::QualifiedNameContext::IDENTIFIER() {
  return getTokens(PlayScriptParser::IDENTIFIER);
}

tree::TerminalNode* PlayScriptParser::QualifiedNameContext::IDENTIFIER(size_t i) {
  return getToken(PlayScriptParser::IDENTIFIER, i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::QualifiedNameContext::DOT() {
  return getTokens(PlayScriptParser::DOT);
}

tree::TerminalNode* PlayScriptParser::QualifiedNameContext::DOT(size_t i) {
  return getToken(PlayScriptParser::DOT, i);
}


size_t PlayScriptParser::QualifiedNameContext::getRuleIndex() const {
  return PlayScriptParser::RuleQualifiedName;
}

void PlayScriptParser::QualifiedNameContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterQualifiedName(this);
}

void PlayScriptParser::QualifiedNameContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitQualifiedName(this);
}


antlrcpp::Any PlayScriptParser::QualifiedNameContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitQualifiedName(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::QualifiedNameContext* PlayScriptParser::qualifiedName() {
  QualifiedNameContext *_localctx = _tracker.createInstance<QualifiedNameContext>(_ctx, getState());
  enterRule(_localctx, 26, PlayScriptParser::RuleQualifiedName);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(201);
    match(PlayScriptParser::IDENTIFIER);
    setState(206);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::DOT) {
      setState(202);
      match(PlayScriptParser::DOT);
      setState(203);
      match(PlayScriptParser::IDENTIFIER);
      setState(208);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FieldDeclarationContext ------------------------------------------------------------------

PlayScriptParser::FieldDeclarationContext::FieldDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::VariableDeclaratorsContext* PlayScriptParser::FieldDeclarationContext::variableDeclarators() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorsContext>(0);
}

tree::TerminalNode* PlayScriptParser::FieldDeclarationContext::SEMI() {
  return getToken(PlayScriptParser::SEMI, 0);
}


size_t PlayScriptParser::FieldDeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleFieldDeclaration;
}

void PlayScriptParser::FieldDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFieldDeclaration(this);
}

void PlayScriptParser::FieldDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFieldDeclaration(this);
}


antlrcpp::Any PlayScriptParser::FieldDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFieldDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FieldDeclarationContext* PlayScriptParser::fieldDeclaration() {
  FieldDeclarationContext *_localctx = _tracker.createInstance<FieldDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 28, PlayScriptParser::RuleFieldDeclaration);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(209);
    variableDeclarators();
    setState(210);
    match(PlayScriptParser::SEMI);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ConstructorDeclarationContext ------------------------------------------------------------------

PlayScriptParser::ConstructorDeclarationContext::ConstructorDeclarationContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ConstructorDeclarationContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

PlayScriptParser::FormalParametersContext* PlayScriptParser::ConstructorDeclarationContext::formalParameters() {
  return getRuleContext<PlayScriptParser::FormalParametersContext>(0);
}

PlayScriptParser::BlockContext* PlayScriptParser::ConstructorDeclarationContext::block() {
  return getRuleContext<PlayScriptParser::BlockContext>(0);
}

tree::TerminalNode* PlayScriptParser::ConstructorDeclarationContext::THROWS() {
  return getToken(PlayScriptParser::THROWS, 0);
}

PlayScriptParser::QualifiedNameListContext* PlayScriptParser::ConstructorDeclarationContext::qualifiedNameList() {
  return getRuleContext<PlayScriptParser::QualifiedNameListContext>(0);
}


size_t PlayScriptParser::ConstructorDeclarationContext::getRuleIndex() const {
  return PlayScriptParser::RuleConstructorDeclaration;
}

void PlayScriptParser::ConstructorDeclarationContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterConstructorDeclaration(this);
}

void PlayScriptParser::ConstructorDeclarationContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitConstructorDeclaration(this);
}


antlrcpp::Any PlayScriptParser::ConstructorDeclarationContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitConstructorDeclaration(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ConstructorDeclarationContext* PlayScriptParser::constructorDeclaration() {
  ConstructorDeclarationContext *_localctx = _tracker.createInstance<ConstructorDeclarationContext>(_ctx, getState());
  enterRule(_localctx, 30, PlayScriptParser::RuleConstructorDeclaration);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(212);
    match(PlayScriptParser::IDENTIFIER);
    setState(213);
    formalParameters();
    setState(216);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PlayScriptParser::THROWS) {
      setState(214);
      match(PlayScriptParser::THROWS);
      setState(215);
      qualifiedNameList();
    }
    setState(218);
    dynamic_cast<ConstructorDeclarationContext *>(_localctx)->constructorBody = block();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDeclaratorsContext ------------------------------------------------------------------

PlayScriptParser::VariableDeclaratorsContext::VariableDeclaratorsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::VariableDeclaratorsContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

std::vector<PlayScriptParser::VariableDeclaratorContext *> PlayScriptParser::VariableDeclaratorsContext::variableDeclarator() {
  return getRuleContexts<PlayScriptParser::VariableDeclaratorContext>();
}

PlayScriptParser::VariableDeclaratorContext* PlayScriptParser::VariableDeclaratorsContext::variableDeclarator(size_t i) {
  return getRuleContext<PlayScriptParser::VariableDeclaratorContext>(i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::VariableDeclaratorsContext::COMMA() {
  return getTokens(PlayScriptParser::COMMA);
}

tree::TerminalNode* PlayScriptParser::VariableDeclaratorsContext::COMMA(size_t i) {
  return getToken(PlayScriptParser::COMMA, i);
}


size_t PlayScriptParser::VariableDeclaratorsContext::getRuleIndex() const {
  return PlayScriptParser::RuleVariableDeclarators;
}

void PlayScriptParser::VariableDeclaratorsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDeclarators(this);
}

void PlayScriptParser::VariableDeclaratorsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDeclarators(this);
}


antlrcpp::Any PlayScriptParser::VariableDeclaratorsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitVariableDeclarators(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::VariableDeclaratorsContext* PlayScriptParser::variableDeclarators() {
  VariableDeclaratorsContext *_localctx = _tracker.createInstance<VariableDeclaratorsContext>(_ctx, getState());
  enterRule(_localctx, 32, PlayScriptParser::RuleVariableDeclarators);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(220);
    typeType();
    setState(221);
    variableDeclarator();
    setState(226);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::COMMA) {
      setState(222);
      match(PlayScriptParser::COMMA);
      setState(223);
      variableDeclarator();
      setState(228);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDeclaratorContext ------------------------------------------------------------------

PlayScriptParser::VariableDeclaratorContext::VariableDeclaratorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::VariableDeclaratorIdContext* PlayScriptParser::VariableDeclaratorContext::variableDeclaratorId() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorIdContext>(0);
}

tree::TerminalNode* PlayScriptParser::VariableDeclaratorContext::ASSIGN() {
  return getToken(PlayScriptParser::ASSIGN, 0);
}

PlayScriptParser::VariableInitializerContext* PlayScriptParser::VariableDeclaratorContext::variableInitializer() {
  return getRuleContext<PlayScriptParser::VariableInitializerContext>(0);
}


size_t PlayScriptParser::VariableDeclaratorContext::getRuleIndex() const {
  return PlayScriptParser::RuleVariableDeclarator;
}

void PlayScriptParser::VariableDeclaratorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDeclarator(this);
}

void PlayScriptParser::VariableDeclaratorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDeclarator(this);
}


antlrcpp::Any PlayScriptParser::VariableDeclaratorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitVariableDeclarator(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::VariableDeclaratorContext* PlayScriptParser::variableDeclarator() {
  VariableDeclaratorContext *_localctx = _tracker.createInstance<VariableDeclaratorContext>(_ctx, getState());
  enterRule(_localctx, 34, PlayScriptParser::RuleVariableDeclarator);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(229);
    variableDeclaratorId();
    setState(232);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if (_la == PlayScriptParser::ASSIGN) {
      setState(230);
      match(PlayScriptParser::ASSIGN);
      setState(231);
      variableInitializer();
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableDeclaratorIdContext ------------------------------------------------------------------

PlayScriptParser::VariableDeclaratorIdContext::VariableDeclaratorIdContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::VariableDeclaratorIdContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

std::vector<tree::TerminalNode *> PlayScriptParser::VariableDeclaratorIdContext::LBRACK() {
  return getTokens(PlayScriptParser::LBRACK);
}

tree::TerminalNode* PlayScriptParser::VariableDeclaratorIdContext::LBRACK(size_t i) {
  return getToken(PlayScriptParser::LBRACK, i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::VariableDeclaratorIdContext::RBRACK() {
  return getTokens(PlayScriptParser::RBRACK);
}

tree::TerminalNode* PlayScriptParser::VariableDeclaratorIdContext::RBRACK(size_t i) {
  return getToken(PlayScriptParser::RBRACK, i);
}


size_t PlayScriptParser::VariableDeclaratorIdContext::getRuleIndex() const {
  return PlayScriptParser::RuleVariableDeclaratorId;
}

void PlayScriptParser::VariableDeclaratorIdContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableDeclaratorId(this);
}

void PlayScriptParser::VariableDeclaratorIdContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableDeclaratorId(this);
}


antlrcpp::Any PlayScriptParser::VariableDeclaratorIdContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitVariableDeclaratorId(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::VariableDeclaratorIdContext* PlayScriptParser::variableDeclaratorId() {
  VariableDeclaratorIdContext *_localctx = _tracker.createInstance<VariableDeclaratorIdContext>(_ctx, getState());
  enterRule(_localctx, 36, PlayScriptParser::RuleVariableDeclaratorId);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(234);
    match(PlayScriptParser::IDENTIFIER);
    setState(239);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::LBRACK) {
      setState(235);
      match(PlayScriptParser::LBRACK);
      setState(236);
      match(PlayScriptParser::RBRACK);
      setState(241);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- VariableInitializerContext ------------------------------------------------------------------

PlayScriptParser::VariableInitializerContext::VariableInitializerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::ArrayInitializerContext* PlayScriptParser::VariableInitializerContext::arrayInitializer() {
  return getRuleContext<PlayScriptParser::ArrayInitializerContext>(0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::VariableInitializerContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}


size_t PlayScriptParser::VariableInitializerContext::getRuleIndex() const {
  return PlayScriptParser::RuleVariableInitializer;
}

void PlayScriptParser::VariableInitializerContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterVariableInitializer(this);
}

void PlayScriptParser::VariableInitializerContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitVariableInitializer(this);
}


antlrcpp::Any PlayScriptParser::VariableInitializerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitVariableInitializer(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::VariableInitializerContext* PlayScriptParser::variableInitializer() {
  VariableInitializerContext *_localctx = _tracker.createInstance<VariableInitializerContext>(_ctx, getState());
  enterRule(_localctx, 38, PlayScriptParser::RuleVariableInitializer);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(244);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::LBRACE: {
        enterOuterAlt(_localctx, 1);
        setState(242);
        arrayInitializer();
        break;
      }

      case PlayScriptParser::SUPER:
      case PlayScriptParser::THIS:
      case PlayScriptParser::DECIMAL_LITERAL:
      case PlayScriptParser::HEX_LITERAL:
      case PlayScriptParser::OCT_LITERAL:
      case PlayScriptParser::BINARY_LITERAL:
      case PlayScriptParser::FLOAT_LITERAL:
      case PlayScriptParser::HEX_FLOAT_LITERAL:
      case PlayScriptParser::BOOL_LITERAL:
      case PlayScriptParser::CHAR_LITERAL:
      case PlayScriptParser::STRING_LITERAL:
      case PlayScriptParser::NULL_LITERAL:
      case PlayScriptParser::LPAREN:
      case PlayScriptParser::BANG:
      case PlayScriptParser::TILDE:
      case PlayScriptParser::INC:
      case PlayScriptParser::DEC:
      case PlayScriptParser::ADD:
      case PlayScriptParser::SUB:
      case PlayScriptParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 2);
        setState(243);
        expression(0);
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

//----------------- ArrayInitializerContext ------------------------------------------------------------------

PlayScriptParser::ArrayInitializerContext::ArrayInitializerContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ArrayInitializerContext::LBRACE() {
  return getToken(PlayScriptParser::LBRACE, 0);
}

tree::TerminalNode* PlayScriptParser::ArrayInitializerContext::RBRACE() {
  return getToken(PlayScriptParser::RBRACE, 0);
}

std::vector<PlayScriptParser::VariableInitializerContext *> PlayScriptParser::ArrayInitializerContext::variableInitializer() {
  return getRuleContexts<PlayScriptParser::VariableInitializerContext>();
}

PlayScriptParser::VariableInitializerContext* PlayScriptParser::ArrayInitializerContext::variableInitializer(size_t i) {
  return getRuleContext<PlayScriptParser::VariableInitializerContext>(i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::ArrayInitializerContext::COMMA() {
  return getTokens(PlayScriptParser::COMMA);
}

tree::TerminalNode* PlayScriptParser::ArrayInitializerContext::COMMA(size_t i) {
  return getToken(PlayScriptParser::COMMA, i);
}


size_t PlayScriptParser::ArrayInitializerContext::getRuleIndex() const {
  return PlayScriptParser::RuleArrayInitializer;
}

void PlayScriptParser::ArrayInitializerContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArrayInitializer(this);
}

void PlayScriptParser::ArrayInitializerContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArrayInitializer(this);
}


antlrcpp::Any PlayScriptParser::ArrayInitializerContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitArrayInitializer(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ArrayInitializerContext* PlayScriptParser::arrayInitializer() {
  ArrayInitializerContext *_localctx = _tracker.createInstance<ArrayInitializerContext>(_ctx, getState());
  enterRule(_localctx, 40, PlayScriptParser::RuleArrayInitializer);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(246);
    match(PlayScriptParser::LBRACE);
    setState(258);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
      | (1ULL << PlayScriptParser::THIS)
      | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
      | (1ULL << PlayScriptParser::HEX_LITERAL)
      | (1ULL << PlayScriptParser::OCT_LITERAL)
      | (1ULL << PlayScriptParser::BINARY_LITERAL)
      | (1ULL << PlayScriptParser::FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::BOOL_LITERAL)
      | (1ULL << PlayScriptParser::CHAR_LITERAL)
      | (1ULL << PlayScriptParser::STRING_LITERAL)
      | (1ULL << PlayScriptParser::NULL_LITERAL)
      | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 64) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 64)) & ((1ULL << (PlayScriptParser::LBRACE - 64))
      | (1ULL << (PlayScriptParser::BANG - 64))
      | (1ULL << (PlayScriptParser::TILDE - 64))
      | (1ULL << (PlayScriptParser::INC - 64))
      | (1ULL << (PlayScriptParser::DEC - 64))
      | (1ULL << (PlayScriptParser::ADD - 64))
      | (1ULL << (PlayScriptParser::SUB - 64))
      | (1ULL << (PlayScriptParser::IDENTIFIER - 64)))) != 0)) {
      setState(247);
      variableInitializer();
      setState(252);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(248);
          match(PlayScriptParser::COMMA);
          setState(249);
          variableInitializer(); 
        }
        setState(254);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 23, _ctx);
      }
      setState(256);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PlayScriptParser::COMMA) {
        setState(255);
        match(PlayScriptParser::COMMA);
      }
    }
    setState(260);
    match(PlayScriptParser::RBRACE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ClassOrInterfaceTypeContext ------------------------------------------------------------------

PlayScriptParser::ClassOrInterfaceTypeContext::ClassOrInterfaceTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<tree::TerminalNode *> PlayScriptParser::ClassOrInterfaceTypeContext::IDENTIFIER() {
  return getTokens(PlayScriptParser::IDENTIFIER);
}

tree::TerminalNode* PlayScriptParser::ClassOrInterfaceTypeContext::IDENTIFIER(size_t i) {
  return getToken(PlayScriptParser::IDENTIFIER, i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::ClassOrInterfaceTypeContext::DOT() {
  return getTokens(PlayScriptParser::DOT);
}

tree::TerminalNode* PlayScriptParser::ClassOrInterfaceTypeContext::DOT(size_t i) {
  return getToken(PlayScriptParser::DOT, i);
}


size_t PlayScriptParser::ClassOrInterfaceTypeContext::getRuleIndex() const {
  return PlayScriptParser::RuleClassOrInterfaceType;
}

void PlayScriptParser::ClassOrInterfaceTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterClassOrInterfaceType(this);
}

void PlayScriptParser::ClassOrInterfaceTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitClassOrInterfaceType(this);
}


antlrcpp::Any PlayScriptParser::ClassOrInterfaceTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitClassOrInterfaceType(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ClassOrInterfaceTypeContext* PlayScriptParser::classOrInterfaceType() {
  ClassOrInterfaceTypeContext *_localctx = _tracker.createInstance<ClassOrInterfaceTypeContext>(_ctx, getState());
  enterRule(_localctx, 42, PlayScriptParser::RuleClassOrInterfaceType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(262);
    match(PlayScriptParser::IDENTIFIER);
    setState(267);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(263);
        match(PlayScriptParser::DOT);
        setState(264);
        match(PlayScriptParser::IDENTIFIER); 
      }
      setState(269);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 26, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeArgumentContext ------------------------------------------------------------------

PlayScriptParser::TypeArgumentContext::TypeArgumentContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::TypeArgumentContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

tree::TerminalNode* PlayScriptParser::TypeArgumentContext::QUESTION() {
  return getToken(PlayScriptParser::QUESTION, 0);
}

tree::TerminalNode* PlayScriptParser::TypeArgumentContext::EXTENDS() {
  return getToken(PlayScriptParser::EXTENDS, 0);
}

tree::TerminalNode* PlayScriptParser::TypeArgumentContext::SUPER() {
  return getToken(PlayScriptParser::SUPER, 0);
}


size_t PlayScriptParser::TypeArgumentContext::getRuleIndex() const {
  return PlayScriptParser::RuleTypeArgument;
}

void PlayScriptParser::TypeArgumentContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTypeArgument(this);
}

void PlayScriptParser::TypeArgumentContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTypeArgument(this);
}


antlrcpp::Any PlayScriptParser::TypeArgumentContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitTypeArgument(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::TypeArgumentContext* PlayScriptParser::typeArgument() {
  TypeArgumentContext *_localctx = _tracker.createInstance<TypeArgumentContext>(_ctx, getState());
  enterRule(_localctx, 44, PlayScriptParser::RuleTypeArgument);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(276);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::BOOLEAN:
      case PlayScriptParser::BYTE:
      case PlayScriptParser::CHAR:
      case PlayScriptParser::DOUBLE:
      case PlayScriptParser::FLOAT:
      case PlayScriptParser::INT:
      case PlayScriptParser::LONG:
      case PlayScriptParser::SHORT:
      case PlayScriptParser::FUNCTION:
      case PlayScriptParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 1);
        setState(270);
        typeType();
        break;
      }

      case PlayScriptParser::QUESTION: {
        enterOuterAlt(_localctx, 2);
        setState(271);
        match(PlayScriptParser::QUESTION);
        setState(274);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == PlayScriptParser::EXTENDS

        || _la == PlayScriptParser::SUPER) {
          setState(272);
          _la = _input->LA(1);
          if (!(_la == PlayScriptParser::EXTENDS

          || _la == PlayScriptParser::SUPER)) {
          _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(273);
          typeType();
        }
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

//----------------- LiteralContext ------------------------------------------------------------------

PlayScriptParser::LiteralContext::LiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::IntegerLiteralContext* PlayScriptParser::LiteralContext::integerLiteral() {
  return getRuleContext<PlayScriptParser::IntegerLiteralContext>(0);
}

PlayScriptParser::FloatLiteralContext* PlayScriptParser::LiteralContext::floatLiteral() {
  return getRuleContext<PlayScriptParser::FloatLiteralContext>(0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::CHAR_LITERAL() {
  return getToken(PlayScriptParser::CHAR_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::STRING_LITERAL() {
  return getToken(PlayScriptParser::STRING_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::BOOL_LITERAL() {
  return getToken(PlayScriptParser::BOOL_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::LiteralContext::NULL_LITERAL() {
  return getToken(PlayScriptParser::NULL_LITERAL, 0);
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


antlrcpp::Any PlayScriptParser::LiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitLiteral(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::LiteralContext* PlayScriptParser::literal() {
  LiteralContext *_localctx = _tracker.createInstance<LiteralContext>(_ctx, getState());
  enterRule(_localctx, 46, PlayScriptParser::RuleLiteral);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(284);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::DECIMAL_LITERAL:
      case PlayScriptParser::HEX_LITERAL:
      case PlayScriptParser::OCT_LITERAL:
      case PlayScriptParser::BINARY_LITERAL: {
        enterOuterAlt(_localctx, 1);
        setState(278);
        integerLiteral();
        break;
      }

      case PlayScriptParser::FLOAT_LITERAL:
      case PlayScriptParser::HEX_FLOAT_LITERAL: {
        enterOuterAlt(_localctx, 2);
        setState(279);
        floatLiteral();
        break;
      }

      case PlayScriptParser::CHAR_LITERAL: {
        enterOuterAlt(_localctx, 3);
        setState(280);
        match(PlayScriptParser::CHAR_LITERAL);
        break;
      }

      case PlayScriptParser::STRING_LITERAL: {
        enterOuterAlt(_localctx, 4);
        setState(281);
        match(PlayScriptParser::STRING_LITERAL);
        break;
      }

      case PlayScriptParser::BOOL_LITERAL: {
        enterOuterAlt(_localctx, 5);
        setState(282);
        match(PlayScriptParser::BOOL_LITERAL);
        break;
      }

      case PlayScriptParser::NULL_LITERAL: {
        enterOuterAlt(_localctx, 6);
        setState(283);
        match(PlayScriptParser::NULL_LITERAL);
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

//----------------- IntegerLiteralContext ------------------------------------------------------------------

PlayScriptParser::IntegerLiteralContext::IntegerLiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::IntegerLiteralContext::DECIMAL_LITERAL() {
  return getToken(PlayScriptParser::DECIMAL_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::IntegerLiteralContext::HEX_LITERAL() {
  return getToken(PlayScriptParser::HEX_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::IntegerLiteralContext::OCT_LITERAL() {
  return getToken(PlayScriptParser::OCT_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::IntegerLiteralContext::BINARY_LITERAL() {
  return getToken(PlayScriptParser::BINARY_LITERAL, 0);
}


size_t PlayScriptParser::IntegerLiteralContext::getRuleIndex() const {
  return PlayScriptParser::RuleIntegerLiteral;
}

void PlayScriptParser::IntegerLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterIntegerLiteral(this);
}

void PlayScriptParser::IntegerLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitIntegerLiteral(this);
}


antlrcpp::Any PlayScriptParser::IntegerLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitIntegerLiteral(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::IntegerLiteralContext* PlayScriptParser::integerLiteral() {
  IntegerLiteralContext *_localctx = _tracker.createInstance<IntegerLiteralContext>(_ctx, getState());
  enterRule(_localctx, 48, PlayScriptParser::RuleIntegerLiteral);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(286);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::DECIMAL_LITERAL)
      | (1ULL << PlayScriptParser::HEX_LITERAL)
      | (1ULL << PlayScriptParser::OCT_LITERAL)
      | (1ULL << PlayScriptParser::BINARY_LITERAL))) != 0))) {
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

//----------------- FloatLiteralContext ------------------------------------------------------------------

PlayScriptParser::FloatLiteralContext::FloatLiteralContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::FloatLiteralContext::FLOAT_LITERAL() {
  return getToken(PlayScriptParser::FLOAT_LITERAL, 0);
}

tree::TerminalNode* PlayScriptParser::FloatLiteralContext::HEX_FLOAT_LITERAL() {
  return getToken(PlayScriptParser::HEX_FLOAT_LITERAL, 0);
}


size_t PlayScriptParser::FloatLiteralContext::getRuleIndex() const {
  return PlayScriptParser::RuleFloatLiteral;
}

void PlayScriptParser::FloatLiteralContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFloatLiteral(this);
}

void PlayScriptParser::FloatLiteralContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFloatLiteral(this);
}


antlrcpp::Any PlayScriptParser::FloatLiteralContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFloatLiteral(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FloatLiteralContext* PlayScriptParser::floatLiteral() {
  FloatLiteralContext *_localctx = _tracker.createInstance<FloatLiteralContext>(_ctx, getState());
  enterRule(_localctx, 50, PlayScriptParser::RuleFloatLiteral);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(288);
    _la = _input->LA(1);
    if (!(_la == PlayScriptParser::FLOAT_LITERAL

    || _la == PlayScriptParser::HEX_FLOAT_LITERAL)) {
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

//----------------- ProgContext ------------------------------------------------------------------

PlayScriptParser::ProgContext::ProgContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::BlockStatementsContext* PlayScriptParser::ProgContext::blockStatements() {
  return getRuleContext<PlayScriptParser::BlockStatementsContext>(0);
}


size_t PlayScriptParser::ProgContext::getRuleIndex() const {
  return PlayScriptParser::RuleProg;
}

void PlayScriptParser::ProgContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterProg(this);
}

void PlayScriptParser::ProgContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitProg(this);
}


antlrcpp::Any PlayScriptParser::ProgContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitProg(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ProgContext* PlayScriptParser::prog() {
  ProgContext *_localctx = _tracker.createInstance<ProgContext>(_ctx, getState());
  enterRule(_localctx, 52, PlayScriptParser::RuleProg);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(290);
    blockStatements();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockContext ------------------------------------------------------------------

PlayScriptParser::BlockContext::BlockContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::BlockContext::LBRACE() {
  return getToken(PlayScriptParser::LBRACE, 0);
}

PlayScriptParser::BlockStatementsContext* PlayScriptParser::BlockContext::blockStatements() {
  return getRuleContext<PlayScriptParser::BlockStatementsContext>(0);
}

tree::TerminalNode* PlayScriptParser::BlockContext::RBRACE() {
  return getToken(PlayScriptParser::RBRACE, 0);
}


size_t PlayScriptParser::BlockContext::getRuleIndex() const {
  return PlayScriptParser::RuleBlock;
}

void PlayScriptParser::BlockContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlock(this);
}

void PlayScriptParser::BlockContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlock(this);
}


antlrcpp::Any PlayScriptParser::BlockContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitBlock(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::BlockContext* PlayScriptParser::block() {
  BlockContext *_localctx = _tracker.createInstance<BlockContext>(_ctx, getState());
  enterRule(_localctx, 54, PlayScriptParser::RuleBlock);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(292);
    match(PlayScriptParser::LBRACE);
    setState(293);
    blockStatements();
    setState(294);
    match(PlayScriptParser::RBRACE);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockStatementsContext ------------------------------------------------------------------

PlayScriptParser::BlockStatementsContext::BlockStatementsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PlayScriptParser::BlockStatementContext *> PlayScriptParser::BlockStatementsContext::blockStatement() {
  return getRuleContexts<PlayScriptParser::BlockStatementContext>();
}

PlayScriptParser::BlockStatementContext* PlayScriptParser::BlockStatementsContext::blockStatement(size_t i) {
  return getRuleContext<PlayScriptParser::BlockStatementContext>(i);
}


size_t PlayScriptParser::BlockStatementsContext::getRuleIndex() const {
  return PlayScriptParser::RuleBlockStatements;
}

void PlayScriptParser::BlockStatementsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockStatements(this);
}

void PlayScriptParser::BlockStatementsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockStatements(this);
}


antlrcpp::Any PlayScriptParser::BlockStatementsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitBlockStatements(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::BlockStatementsContext* PlayScriptParser::blockStatements() {
  BlockStatementsContext *_localctx = _tracker.createInstance<BlockStatementsContext>(_ctx, getState());
  enterRule(_localctx, 56, PlayScriptParser::RuleBlockStatements);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(299);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
      | (1ULL << PlayScriptParser::BREAK)
      | (1ULL << PlayScriptParser::BYTE)
      | (1ULL << PlayScriptParser::CHAR)
      | (1ULL << PlayScriptParser::CLASS)
      | (1ULL << PlayScriptParser::CONTINUE)
      | (1ULL << PlayScriptParser::DO)
      | (1ULL << PlayScriptParser::DOUBLE)
      | (1ULL << PlayScriptParser::FLOAT)
      | (1ULL << PlayScriptParser::FOR)
      | (1ULL << PlayScriptParser::IF)
      | (1ULL << PlayScriptParser::INT)
      | (1ULL << PlayScriptParser::LONG)
      | (1ULL << PlayScriptParser::RETURN)
      | (1ULL << PlayScriptParser::SHORT)
      | (1ULL << PlayScriptParser::SUPER)
      | (1ULL << PlayScriptParser::SWITCH)
      | (1ULL << PlayScriptParser::THIS)
      | (1ULL << PlayScriptParser::VOID)
      | (1ULL << PlayScriptParser::WHILE)
      | (1ULL << PlayScriptParser::FUNCTION)
      | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
      | (1ULL << PlayScriptParser::HEX_LITERAL)
      | (1ULL << PlayScriptParser::OCT_LITERAL)
      | (1ULL << PlayScriptParser::BINARY_LITERAL)
      | (1ULL << PlayScriptParser::FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::BOOL_LITERAL)
      | (1ULL << PlayScriptParser::CHAR_LITERAL)
      | (1ULL << PlayScriptParser::STRING_LITERAL)
      | (1ULL << PlayScriptParser::NULL_LITERAL)
      | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 64) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 64)) & ((1ULL << (PlayScriptParser::LBRACE - 64))
      | (1ULL << (PlayScriptParser::SEMI - 64))
      | (1ULL << (PlayScriptParser::BANG - 64))
      | (1ULL << (PlayScriptParser::TILDE - 64))
      | (1ULL << (PlayScriptParser::INC - 64))
      | (1ULL << (PlayScriptParser::DEC - 64))
      | (1ULL << (PlayScriptParser::ADD - 64))
      | (1ULL << (PlayScriptParser::SUB - 64))
      | (1ULL << (PlayScriptParser::IDENTIFIER - 64)))) != 0)) {
      setState(296);
      blockStatement();
      setState(301);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- BlockStatementContext ------------------------------------------------------------------

PlayScriptParser::BlockStatementContext::BlockStatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::VariableDeclaratorsContext* PlayScriptParser::BlockStatementContext::variableDeclarators() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorsContext>(0);
}

tree::TerminalNode* PlayScriptParser::BlockStatementContext::SEMI() {
  return getToken(PlayScriptParser::SEMI, 0);
}

PlayScriptParser::StatementContext* PlayScriptParser::BlockStatementContext::statement() {
  return getRuleContext<PlayScriptParser::StatementContext>(0);
}

PlayScriptParser::FunctionDeclarationContext* PlayScriptParser::BlockStatementContext::functionDeclaration() {
  return getRuleContext<PlayScriptParser::FunctionDeclarationContext>(0);
}

PlayScriptParser::ClassDeclarationContext* PlayScriptParser::BlockStatementContext::classDeclaration() {
  return getRuleContext<PlayScriptParser::ClassDeclarationContext>(0);
}


size_t PlayScriptParser::BlockStatementContext::getRuleIndex() const {
  return PlayScriptParser::RuleBlockStatement;
}

void PlayScriptParser::BlockStatementContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterBlockStatement(this);
}

void PlayScriptParser::BlockStatementContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitBlockStatement(this);
}


antlrcpp::Any PlayScriptParser::BlockStatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitBlockStatement(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::BlockStatementContext* PlayScriptParser::blockStatement() {
  BlockStatementContext *_localctx = _tracker.createInstance<BlockStatementContext>(_ctx, getState());
  enterRule(_localctx, 58, PlayScriptParser::RuleBlockStatement);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(308);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 31, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(302);
      variableDeclarators();
      setState(303);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(305);
      statement();
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(306);
      functionDeclaration();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(307);
      classDeclaration();
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

//----------------- StatementContext ------------------------------------------------------------------

PlayScriptParser::StatementContext::StatementContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::BlockContext* PlayScriptParser::StatementContext::block() {
  return getRuleContext<PlayScriptParser::BlockContext>(0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::IF() {
  return getToken(PlayScriptParser::IF, 0);
}

PlayScriptParser::ParExpressionContext* PlayScriptParser::StatementContext::parExpression() {
  return getRuleContext<PlayScriptParser::ParExpressionContext>(0);
}

std::vector<PlayScriptParser::StatementContext *> PlayScriptParser::StatementContext::statement() {
  return getRuleContexts<PlayScriptParser::StatementContext>();
}

PlayScriptParser::StatementContext* PlayScriptParser::StatementContext::statement(size_t i) {
  return getRuleContext<PlayScriptParser::StatementContext>(i);
}

tree::TerminalNode* PlayScriptParser::StatementContext::ELSE() {
  return getToken(PlayScriptParser::ELSE, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::FOR() {
  return getToken(PlayScriptParser::FOR, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

PlayScriptParser::ForControlContext* PlayScriptParser::StatementContext::forControl() {
  return getRuleContext<PlayScriptParser::ForControlContext>(0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::WHILE() {
  return getToken(PlayScriptParser::WHILE, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::DO() {
  return getToken(PlayScriptParser::DO, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::SEMI() {
  return getToken(PlayScriptParser::SEMI, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::SWITCH() {
  return getToken(PlayScriptParser::SWITCH, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::LBRACE() {
  return getToken(PlayScriptParser::LBRACE, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::RBRACE() {
  return getToken(PlayScriptParser::RBRACE, 0);
}

std::vector<PlayScriptParser::SwitchBlockStatementGroupContext *> PlayScriptParser::StatementContext::switchBlockStatementGroup() {
  return getRuleContexts<PlayScriptParser::SwitchBlockStatementGroupContext>();
}

PlayScriptParser::SwitchBlockStatementGroupContext* PlayScriptParser::StatementContext::switchBlockStatementGroup(size_t i) {
  return getRuleContext<PlayScriptParser::SwitchBlockStatementGroupContext>(i);
}

std::vector<PlayScriptParser::SwitchLabelContext *> PlayScriptParser::StatementContext::switchLabel() {
  return getRuleContexts<PlayScriptParser::SwitchLabelContext>();
}

PlayScriptParser::SwitchLabelContext* PlayScriptParser::StatementContext::switchLabel(size_t i) {
  return getRuleContext<PlayScriptParser::SwitchLabelContext>(i);
}

tree::TerminalNode* PlayScriptParser::StatementContext::RETURN() {
  return getToken(PlayScriptParser::RETURN, 0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::StatementContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::BREAK() {
  return getToken(PlayScriptParser::BREAK, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::CONTINUE() {
  return getToken(PlayScriptParser::CONTINUE, 0);
}

tree::TerminalNode* PlayScriptParser::StatementContext::COLON() {
  return getToken(PlayScriptParser::COLON, 0);
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


antlrcpp::Any PlayScriptParser::StatementContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitStatement(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::StatementContext* PlayScriptParser::statement() {
  StatementContext *_localctx = _tracker.createInstance<StatementContext>(_ctx, getState());
  enterRule(_localctx, 60, PlayScriptParser::RuleStatement);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    setState(373);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 38, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(310);
      dynamic_cast<StatementContext *>(_localctx)->blockLabel = block();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(311);
      match(PlayScriptParser::IF);
      setState(312);
      parExpression();
      setState(313);
      statement();
      setState(316);
      _errHandler->sync(this);

      switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 32, _ctx)) {
      case 1: {
        setState(314);
        match(PlayScriptParser::ELSE);
        setState(315);
        statement();
        break;
      }

      }
      break;
    }

    case 3: {
      enterOuterAlt(_localctx, 3);
      setState(318);
      match(PlayScriptParser::FOR);
      setState(319);
      match(PlayScriptParser::LPAREN);
      setState(320);
      forControl();
      setState(321);
      match(PlayScriptParser::RPAREN);
      setState(322);
      statement();
      break;
    }

    case 4: {
      enterOuterAlt(_localctx, 4);
      setState(324);
      match(PlayScriptParser::WHILE);
      setState(325);
      parExpression();
      setState(326);
      statement();
      break;
    }

    case 5: {
      enterOuterAlt(_localctx, 5);
      setState(328);
      match(PlayScriptParser::DO);
      setState(329);
      statement();
      setState(330);
      match(PlayScriptParser::WHILE);
      setState(331);
      parExpression();
      setState(332);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 6: {
      enterOuterAlt(_localctx, 6);
      setState(334);
      match(PlayScriptParser::SWITCH);
      setState(335);
      parExpression();
      setState(336);
      match(PlayScriptParser::LBRACE);
      setState(340);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 33, _ctx);
      while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
        if (alt == 1) {
          setState(337);
          switchBlockStatementGroup(); 
        }
        setState(342);
        _errHandler->sync(this);
        alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 33, _ctx);
      }
      setState(346);
      _errHandler->sync(this);
      _la = _input->LA(1);
      while (_la == PlayScriptParser::CASE

      || _la == PlayScriptParser::DEFAULT) {
        setState(343);
        switchLabel();
        setState(348);
        _errHandler->sync(this);
        _la = _input->LA(1);
      }
      setState(349);
      match(PlayScriptParser::RBRACE);
      break;
    }

    case 7: {
      enterOuterAlt(_localctx, 7);
      setState(351);
      match(PlayScriptParser::RETURN);
      setState(353);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
        | (1ULL << PlayScriptParser::THIS)
        | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
        | (1ULL << PlayScriptParser::HEX_LITERAL)
        | (1ULL << PlayScriptParser::OCT_LITERAL)
        | (1ULL << PlayScriptParser::BINARY_LITERAL)
        | (1ULL << PlayScriptParser::FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::BOOL_LITERAL)
        | (1ULL << PlayScriptParser::CHAR_LITERAL)
        | (1ULL << PlayScriptParser::STRING_LITERAL)
        | (1ULL << PlayScriptParser::NULL_LITERAL)
        | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
        | (1ULL << (PlayScriptParser::TILDE - 74))
        | (1ULL << (PlayScriptParser::INC - 74))
        | (1ULL << (PlayScriptParser::DEC - 74))
        | (1ULL << (PlayScriptParser::ADD - 74))
        | (1ULL << (PlayScriptParser::SUB - 74))
        | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
        setState(352);
        expression(0);
      }
      setState(355);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 8: {
      enterOuterAlt(_localctx, 8);
      setState(356);
      match(PlayScriptParser::BREAK);
      setState(358);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PlayScriptParser::IDENTIFIER) {
        setState(357);
        match(PlayScriptParser::IDENTIFIER);
      }
      setState(360);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 9: {
      enterOuterAlt(_localctx, 9);
      setState(361);
      match(PlayScriptParser::CONTINUE);
      setState(363);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if (_la == PlayScriptParser::IDENTIFIER) {
        setState(362);
        match(PlayScriptParser::IDENTIFIER);
      }
      setState(365);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 10: {
      enterOuterAlt(_localctx, 10);
      setState(366);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 11: {
      enterOuterAlt(_localctx, 11);
      setState(367);
      dynamic_cast<StatementContext *>(_localctx)->statementExpression = expression(0);
      setState(368);
      match(PlayScriptParser::SEMI);
      break;
    }

    case 12: {
      enterOuterAlt(_localctx, 12);
      setState(370);
      dynamic_cast<StatementContext *>(_localctx)->identifierLabel = match(PlayScriptParser::IDENTIFIER);
      setState(371);
      match(PlayScriptParser::COLON);
      setState(372);
      statement();
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

//----------------- SwitchBlockStatementGroupContext ------------------------------------------------------------------

PlayScriptParser::SwitchBlockStatementGroupContext::SwitchBlockStatementGroupContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PlayScriptParser::SwitchLabelContext *> PlayScriptParser::SwitchBlockStatementGroupContext::switchLabel() {
  return getRuleContexts<PlayScriptParser::SwitchLabelContext>();
}

PlayScriptParser::SwitchLabelContext* PlayScriptParser::SwitchBlockStatementGroupContext::switchLabel(size_t i) {
  return getRuleContext<PlayScriptParser::SwitchLabelContext>(i);
}

std::vector<PlayScriptParser::BlockStatementContext *> PlayScriptParser::SwitchBlockStatementGroupContext::blockStatement() {
  return getRuleContexts<PlayScriptParser::BlockStatementContext>();
}

PlayScriptParser::BlockStatementContext* PlayScriptParser::SwitchBlockStatementGroupContext::blockStatement(size_t i) {
  return getRuleContext<PlayScriptParser::BlockStatementContext>(i);
}


size_t PlayScriptParser::SwitchBlockStatementGroupContext::getRuleIndex() const {
  return PlayScriptParser::RuleSwitchBlockStatementGroup;
}

void PlayScriptParser::SwitchBlockStatementGroupContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSwitchBlockStatementGroup(this);
}

void PlayScriptParser::SwitchBlockStatementGroupContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSwitchBlockStatementGroup(this);
}


antlrcpp::Any PlayScriptParser::SwitchBlockStatementGroupContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitSwitchBlockStatementGroup(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::SwitchBlockStatementGroupContext* PlayScriptParser::switchBlockStatementGroup() {
  SwitchBlockStatementGroupContext *_localctx = _tracker.createInstance<SwitchBlockStatementGroupContext>(_ctx, getState());
  enterRule(_localctx, 62, PlayScriptParser::RuleSwitchBlockStatementGroup);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(376); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(375);
      switchLabel();
      setState(378); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while (_la == PlayScriptParser::CASE

    || _la == PlayScriptParser::DEFAULT);
    setState(381); 
    _errHandler->sync(this);
    _la = _input->LA(1);
    do {
      setState(380);
      blockStatement();
      setState(383); 
      _errHandler->sync(this);
      _la = _input->LA(1);
    } while ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
      | (1ULL << PlayScriptParser::BREAK)
      | (1ULL << PlayScriptParser::BYTE)
      | (1ULL << PlayScriptParser::CHAR)
      | (1ULL << PlayScriptParser::CLASS)
      | (1ULL << PlayScriptParser::CONTINUE)
      | (1ULL << PlayScriptParser::DO)
      | (1ULL << PlayScriptParser::DOUBLE)
      | (1ULL << PlayScriptParser::FLOAT)
      | (1ULL << PlayScriptParser::FOR)
      | (1ULL << PlayScriptParser::IF)
      | (1ULL << PlayScriptParser::INT)
      | (1ULL << PlayScriptParser::LONG)
      | (1ULL << PlayScriptParser::RETURN)
      | (1ULL << PlayScriptParser::SHORT)
      | (1ULL << PlayScriptParser::SUPER)
      | (1ULL << PlayScriptParser::SWITCH)
      | (1ULL << PlayScriptParser::THIS)
      | (1ULL << PlayScriptParser::VOID)
      | (1ULL << PlayScriptParser::WHILE)
      | (1ULL << PlayScriptParser::FUNCTION)
      | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
      | (1ULL << PlayScriptParser::HEX_LITERAL)
      | (1ULL << PlayScriptParser::OCT_LITERAL)
      | (1ULL << PlayScriptParser::BINARY_LITERAL)
      | (1ULL << PlayScriptParser::FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::BOOL_LITERAL)
      | (1ULL << PlayScriptParser::CHAR_LITERAL)
      | (1ULL << PlayScriptParser::STRING_LITERAL)
      | (1ULL << PlayScriptParser::NULL_LITERAL)
      | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 64) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 64)) & ((1ULL << (PlayScriptParser::LBRACE - 64))
      | (1ULL << (PlayScriptParser::SEMI - 64))
      | (1ULL << (PlayScriptParser::BANG - 64))
      | (1ULL << (PlayScriptParser::TILDE - 64))
      | (1ULL << (PlayScriptParser::INC - 64))
      | (1ULL << (PlayScriptParser::DEC - 64))
      | (1ULL << (PlayScriptParser::ADD - 64))
      | (1ULL << (PlayScriptParser::SUB - 64))
      | (1ULL << (PlayScriptParser::IDENTIFIER - 64)))) != 0));
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SwitchLabelContext ------------------------------------------------------------------

PlayScriptParser::SwitchLabelContext::SwitchLabelContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::SwitchLabelContext::CASE() {
  return getToken(PlayScriptParser::CASE, 0);
}

tree::TerminalNode* PlayScriptParser::SwitchLabelContext::COLON() {
  return getToken(PlayScriptParser::COLON, 0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::SwitchLabelContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::SwitchLabelContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

tree::TerminalNode* PlayScriptParser::SwitchLabelContext::DEFAULT() {
  return getToken(PlayScriptParser::DEFAULT, 0);
}


size_t PlayScriptParser::SwitchLabelContext::getRuleIndex() const {
  return PlayScriptParser::RuleSwitchLabel;
}

void PlayScriptParser::SwitchLabelContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSwitchLabel(this);
}

void PlayScriptParser::SwitchLabelContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSwitchLabel(this);
}


antlrcpp::Any PlayScriptParser::SwitchLabelContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitSwitchLabel(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::SwitchLabelContext* PlayScriptParser::switchLabel() {
  SwitchLabelContext *_localctx = _tracker.createInstance<SwitchLabelContext>(_ctx, getState());
  enterRule(_localctx, 64, PlayScriptParser::RuleSwitchLabel);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(393);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::CASE: {
        enterOuterAlt(_localctx, 1);
        setState(385);
        match(PlayScriptParser::CASE);
        setState(388);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 41, _ctx)) {
        case 1: {
          setState(386);
          dynamic_cast<SwitchLabelContext *>(_localctx)->constantExpression = expression(0);
          break;
        }

        case 2: {
          setState(387);
          dynamic_cast<SwitchLabelContext *>(_localctx)->enumConstantName = match(PlayScriptParser::IDENTIFIER);
          break;
        }

        }
        setState(390);
        match(PlayScriptParser::COLON);
        break;
      }

      case PlayScriptParser::DEFAULT: {
        enterOuterAlt(_localctx, 2);
        setState(391);
        match(PlayScriptParser::DEFAULT);
        setState(392);
        match(PlayScriptParser::COLON);
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

//----------------- ForControlContext ------------------------------------------------------------------

PlayScriptParser::ForControlContext::ForControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::EnhancedForControlContext* PlayScriptParser::ForControlContext::enhancedForControl() {
  return getRuleContext<PlayScriptParser::EnhancedForControlContext>(0);
}

std::vector<tree::TerminalNode *> PlayScriptParser::ForControlContext::SEMI() {
  return getTokens(PlayScriptParser::SEMI);
}

tree::TerminalNode* PlayScriptParser::ForControlContext::SEMI(size_t i) {
  return getToken(PlayScriptParser::SEMI, i);
}

PlayScriptParser::ForInitContext* PlayScriptParser::ForControlContext::forInit() {
  return getRuleContext<PlayScriptParser::ForInitContext>(0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::ForControlContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}

PlayScriptParser::ExpressionListContext* PlayScriptParser::ForControlContext::expressionList() {
  return getRuleContext<PlayScriptParser::ExpressionListContext>(0);
}


size_t PlayScriptParser::ForControlContext::getRuleIndex() const {
  return PlayScriptParser::RuleForControl;
}

void PlayScriptParser::ForControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterForControl(this);
}

void PlayScriptParser::ForControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitForControl(this);
}


antlrcpp::Any PlayScriptParser::ForControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitForControl(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ForControlContext* PlayScriptParser::forControl() {
  ForControlContext *_localctx = _tracker.createInstance<ForControlContext>(_ctx, getState());
  enterRule(_localctx, 66, PlayScriptParser::RuleForControl);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(407);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 46, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(395);
      enhancedForControl();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(397);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
        | (1ULL << PlayScriptParser::BYTE)
        | (1ULL << PlayScriptParser::CHAR)
        | (1ULL << PlayScriptParser::DOUBLE)
        | (1ULL << PlayScriptParser::FLOAT)
        | (1ULL << PlayScriptParser::INT)
        | (1ULL << PlayScriptParser::LONG)
        | (1ULL << PlayScriptParser::SHORT)
        | (1ULL << PlayScriptParser::SUPER)
        | (1ULL << PlayScriptParser::THIS)
        | (1ULL << PlayScriptParser::FUNCTION)
        | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
        | (1ULL << PlayScriptParser::HEX_LITERAL)
        | (1ULL << PlayScriptParser::OCT_LITERAL)
        | (1ULL << PlayScriptParser::BINARY_LITERAL)
        | (1ULL << PlayScriptParser::FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::BOOL_LITERAL)
        | (1ULL << PlayScriptParser::CHAR_LITERAL)
        | (1ULL << PlayScriptParser::STRING_LITERAL)
        | (1ULL << PlayScriptParser::NULL_LITERAL)
        | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
        | (1ULL << (PlayScriptParser::TILDE - 74))
        | (1ULL << (PlayScriptParser::INC - 74))
        | (1ULL << (PlayScriptParser::DEC - 74))
        | (1ULL << (PlayScriptParser::ADD - 74))
        | (1ULL << (PlayScriptParser::SUB - 74))
        | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
        setState(396);
        forInit();
      }
      setState(399);
      match(PlayScriptParser::SEMI);
      setState(401);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
        | (1ULL << PlayScriptParser::THIS)
        | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
        | (1ULL << PlayScriptParser::HEX_LITERAL)
        | (1ULL << PlayScriptParser::OCT_LITERAL)
        | (1ULL << PlayScriptParser::BINARY_LITERAL)
        | (1ULL << PlayScriptParser::FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::BOOL_LITERAL)
        | (1ULL << PlayScriptParser::CHAR_LITERAL)
        | (1ULL << PlayScriptParser::STRING_LITERAL)
        | (1ULL << PlayScriptParser::NULL_LITERAL)
        | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
        | (1ULL << (PlayScriptParser::TILDE - 74))
        | (1ULL << (PlayScriptParser::INC - 74))
        | (1ULL << (PlayScriptParser::DEC - 74))
        | (1ULL << (PlayScriptParser::ADD - 74))
        | (1ULL << (PlayScriptParser::SUB - 74))
        | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
        setState(400);
        expression(0);
      }
      setState(403);
      match(PlayScriptParser::SEMI);
      setState(405);
      _errHandler->sync(this);

      _la = _input->LA(1);
      if ((((_la & ~ 0x3fULL) == 0) &&
        ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
        | (1ULL << PlayScriptParser::THIS)
        | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
        | (1ULL << PlayScriptParser::HEX_LITERAL)
        | (1ULL << PlayScriptParser::OCT_LITERAL)
        | (1ULL << PlayScriptParser::BINARY_LITERAL)
        | (1ULL << PlayScriptParser::FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
        | (1ULL << PlayScriptParser::BOOL_LITERAL)
        | (1ULL << PlayScriptParser::CHAR_LITERAL)
        | (1ULL << PlayScriptParser::STRING_LITERAL)
        | (1ULL << PlayScriptParser::NULL_LITERAL)
        | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
        | (1ULL << (PlayScriptParser::TILDE - 74))
        | (1ULL << (PlayScriptParser::INC - 74))
        | (1ULL << (PlayScriptParser::DEC - 74))
        | (1ULL << (PlayScriptParser::ADD - 74))
        | (1ULL << (PlayScriptParser::SUB - 74))
        | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
        setState(404);
        dynamic_cast<ForControlContext *>(_localctx)->forUpdate = expressionList();
      }
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

//----------------- ForInitContext ------------------------------------------------------------------

PlayScriptParser::ForInitContext::ForInitContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::VariableDeclaratorsContext* PlayScriptParser::ForInitContext::variableDeclarators() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorsContext>(0);
}

PlayScriptParser::ExpressionListContext* PlayScriptParser::ForInitContext::expressionList() {
  return getRuleContext<PlayScriptParser::ExpressionListContext>(0);
}


size_t PlayScriptParser::ForInitContext::getRuleIndex() const {
  return PlayScriptParser::RuleForInit;
}

void PlayScriptParser::ForInitContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterForInit(this);
}

void PlayScriptParser::ForInitContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitForInit(this);
}


antlrcpp::Any PlayScriptParser::ForInitContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitForInit(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ForInitContext* PlayScriptParser::forInit() {
  ForInitContext *_localctx = _tracker.createInstance<ForInitContext>(_ctx, getState());
  enterRule(_localctx, 68, PlayScriptParser::RuleForInit);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(411);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 47, _ctx)) {
    case 1: {
      enterOuterAlt(_localctx, 1);
      setState(409);
      variableDeclarators();
      break;
    }

    case 2: {
      enterOuterAlt(_localctx, 2);
      setState(410);
      expressionList();
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

//----------------- EnhancedForControlContext ------------------------------------------------------------------

PlayScriptParser::EnhancedForControlContext::EnhancedForControlContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::EnhancedForControlContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

PlayScriptParser::VariableDeclaratorIdContext* PlayScriptParser::EnhancedForControlContext::variableDeclaratorId() {
  return getRuleContext<PlayScriptParser::VariableDeclaratorIdContext>(0);
}

tree::TerminalNode* PlayScriptParser::EnhancedForControlContext::COLON() {
  return getToken(PlayScriptParser::COLON, 0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::EnhancedForControlContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}


size_t PlayScriptParser::EnhancedForControlContext::getRuleIndex() const {
  return PlayScriptParser::RuleEnhancedForControl;
}

void PlayScriptParser::EnhancedForControlContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterEnhancedForControl(this);
}

void PlayScriptParser::EnhancedForControlContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitEnhancedForControl(this);
}


antlrcpp::Any PlayScriptParser::EnhancedForControlContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitEnhancedForControl(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::EnhancedForControlContext* PlayScriptParser::enhancedForControl() {
  EnhancedForControlContext *_localctx = _tracker.createInstance<EnhancedForControlContext>(_ctx, getState());
  enterRule(_localctx, 70, PlayScriptParser::RuleEnhancedForControl);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(413);
    typeType();
    setState(414);
    variableDeclaratorId();
    setState(415);
    match(PlayScriptParser::COLON);
    setState(416);
    expression(0);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ParExpressionContext ------------------------------------------------------------------

PlayScriptParser::ParExpressionContext::ParExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ParExpressionContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::ParExpressionContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::ParExpressionContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}


size_t PlayScriptParser::ParExpressionContext::getRuleIndex() const {
  return PlayScriptParser::RuleParExpression;
}

void PlayScriptParser::ParExpressionContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterParExpression(this);
}

void PlayScriptParser::ParExpressionContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitParExpression(this);
}


antlrcpp::Any PlayScriptParser::ParExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitParExpression(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ParExpressionContext* PlayScriptParser::parExpression() {
  ParExpressionContext *_localctx = _tracker.createInstance<ParExpressionContext>(_ctx, getState());
  enterRule(_localctx, 72, PlayScriptParser::RuleParExpression);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(418);
    match(PlayScriptParser::LPAREN);
    setState(419);
    expression(0);
    setState(420);
    match(PlayScriptParser::RPAREN);
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- ExpressionListContext ------------------------------------------------------------------

PlayScriptParser::ExpressionListContext::ExpressionListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PlayScriptParser::ExpressionContext *> PlayScriptParser::ExpressionListContext::expression() {
  return getRuleContexts<PlayScriptParser::ExpressionContext>();
}

PlayScriptParser::ExpressionContext* PlayScriptParser::ExpressionListContext::expression(size_t i) {
  return getRuleContext<PlayScriptParser::ExpressionContext>(i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::ExpressionListContext::COMMA() {
  return getTokens(PlayScriptParser::COMMA);
}

tree::TerminalNode* PlayScriptParser::ExpressionListContext::COMMA(size_t i) {
  return getToken(PlayScriptParser::COMMA, i);
}


size_t PlayScriptParser::ExpressionListContext::getRuleIndex() const {
  return PlayScriptParser::RuleExpressionList;
}

void PlayScriptParser::ExpressionListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterExpressionList(this);
}

void PlayScriptParser::ExpressionListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitExpressionList(this);
}


antlrcpp::Any PlayScriptParser::ExpressionListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitExpressionList(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ExpressionListContext* PlayScriptParser::expressionList() {
  ExpressionListContext *_localctx = _tracker.createInstance<ExpressionListContext>(_ctx, getState());
  enterRule(_localctx, 74, PlayScriptParser::RuleExpressionList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(422);
    expression(0);
    setState(427);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::COMMA) {
      setState(423);
      match(PlayScriptParser::COMMA);
      setState(424);
      expression(0);
      setState(429);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionCallContext ------------------------------------------------------------------

PlayScriptParser::FunctionCallContext::FunctionCallContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::FunctionCallContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

tree::TerminalNode* PlayScriptParser::FunctionCallContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::FunctionCallContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

PlayScriptParser::ExpressionListContext* PlayScriptParser::FunctionCallContext::expressionList() {
  return getRuleContext<PlayScriptParser::ExpressionListContext>(0);
}

tree::TerminalNode* PlayScriptParser::FunctionCallContext::THIS() {
  return getToken(PlayScriptParser::THIS, 0);
}

tree::TerminalNode* PlayScriptParser::FunctionCallContext::SUPER() {
  return getToken(PlayScriptParser::SUPER, 0);
}


size_t PlayScriptParser::FunctionCallContext::getRuleIndex() const {
  return PlayScriptParser::RuleFunctionCall;
}

void PlayScriptParser::FunctionCallContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionCall(this);
}

void PlayScriptParser::FunctionCallContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionCall(this);
}


antlrcpp::Any PlayScriptParser::FunctionCallContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFunctionCall(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FunctionCallContext* PlayScriptParser::functionCall() {
  FunctionCallContext *_localctx = _tracker.createInstance<FunctionCallContext>(_ctx, getState());
  enterRule(_localctx, 76, PlayScriptParser::RuleFunctionCall);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(448);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 1);
        setState(430);
        match(PlayScriptParser::IDENTIFIER);
        setState(431);
        match(PlayScriptParser::LPAREN);
        setState(433);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
          | (1ULL << PlayScriptParser::THIS)
          | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
          | (1ULL << PlayScriptParser::HEX_LITERAL)
          | (1ULL << PlayScriptParser::OCT_LITERAL)
          | (1ULL << PlayScriptParser::BINARY_LITERAL)
          | (1ULL << PlayScriptParser::FLOAT_LITERAL)
          | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
          | (1ULL << PlayScriptParser::BOOL_LITERAL)
          | (1ULL << PlayScriptParser::CHAR_LITERAL)
          | (1ULL << PlayScriptParser::STRING_LITERAL)
          | (1ULL << PlayScriptParser::NULL_LITERAL)
          | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
          ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
          | (1ULL << (PlayScriptParser::TILDE - 74))
          | (1ULL << (PlayScriptParser::INC - 74))
          | (1ULL << (PlayScriptParser::DEC - 74))
          | (1ULL << (PlayScriptParser::ADD - 74))
          | (1ULL << (PlayScriptParser::SUB - 74))
          | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
          setState(432);
          expressionList();
        }
        setState(435);
        match(PlayScriptParser::RPAREN);
        break;
      }

      case PlayScriptParser::THIS: {
        enterOuterAlt(_localctx, 2);
        setState(436);
        match(PlayScriptParser::THIS);
        setState(437);
        match(PlayScriptParser::LPAREN);
        setState(439);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
          | (1ULL << PlayScriptParser::THIS)
          | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
          | (1ULL << PlayScriptParser::HEX_LITERAL)
          | (1ULL << PlayScriptParser::OCT_LITERAL)
          | (1ULL << PlayScriptParser::BINARY_LITERAL)
          | (1ULL << PlayScriptParser::FLOAT_LITERAL)
          | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
          | (1ULL << PlayScriptParser::BOOL_LITERAL)
          | (1ULL << PlayScriptParser::CHAR_LITERAL)
          | (1ULL << PlayScriptParser::STRING_LITERAL)
          | (1ULL << PlayScriptParser::NULL_LITERAL)
          | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
          ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
          | (1ULL << (PlayScriptParser::TILDE - 74))
          | (1ULL << (PlayScriptParser::INC - 74))
          | (1ULL << (PlayScriptParser::DEC - 74))
          | (1ULL << (PlayScriptParser::ADD - 74))
          | (1ULL << (PlayScriptParser::SUB - 74))
          | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
          setState(438);
          expressionList();
        }
        setState(441);
        match(PlayScriptParser::RPAREN);
        break;
      }

      case PlayScriptParser::SUPER: {
        enterOuterAlt(_localctx, 3);
        setState(442);
        match(PlayScriptParser::SUPER);
        setState(443);
        match(PlayScriptParser::LPAREN);
        setState(445);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if ((((_la & ~ 0x3fULL) == 0) &&
          ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
          | (1ULL << PlayScriptParser::THIS)
          | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
          | (1ULL << PlayScriptParser::HEX_LITERAL)
          | (1ULL << PlayScriptParser::OCT_LITERAL)
          | (1ULL << PlayScriptParser::BINARY_LITERAL)
          | (1ULL << PlayScriptParser::FLOAT_LITERAL)
          | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
          | (1ULL << PlayScriptParser::BOOL_LITERAL)
          | (1ULL << PlayScriptParser::CHAR_LITERAL)
          | (1ULL << PlayScriptParser::STRING_LITERAL)
          | (1ULL << PlayScriptParser::NULL_LITERAL)
          | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
          ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
          | (1ULL << (PlayScriptParser::TILDE - 74))
          | (1ULL << (PlayScriptParser::INC - 74))
          | (1ULL << (PlayScriptParser::DEC - 74))
          | (1ULL << (PlayScriptParser::ADD - 74))
          | (1ULL << (PlayScriptParser::SUB - 74))
          | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
          setState(444);
          expressionList();
        }
        setState(447);
        match(PlayScriptParser::RPAREN);
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

//----------------- ExpressionContext ------------------------------------------------------------------

PlayScriptParser::ExpressionContext::ExpressionContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::PrimaryContext* PlayScriptParser::ExpressionContext::primary() {
  return getRuleContext<PlayScriptParser::PrimaryContext>(0);
}

PlayScriptParser::FunctionCallContext* PlayScriptParser::ExpressionContext::functionCall() {
  return getRuleContext<PlayScriptParser::FunctionCallContext>(0);
}

std::vector<PlayScriptParser::ExpressionContext *> PlayScriptParser::ExpressionContext::expression() {
  return getRuleContexts<PlayScriptParser::ExpressionContext>();
}

PlayScriptParser::ExpressionContext* PlayScriptParser::ExpressionContext::expression(size_t i) {
  return getRuleContext<PlayScriptParser::ExpressionContext>(i);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::ADD() {
  return getToken(PlayScriptParser::ADD, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::SUB() {
  return getToken(PlayScriptParser::SUB, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::INC() {
  return getToken(PlayScriptParser::INC, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::DEC() {
  return getToken(PlayScriptParser::DEC, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::TILDE() {
  return getToken(PlayScriptParser::TILDE, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::BANG() {
  return getToken(PlayScriptParser::BANG, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::MUL() {
  return getToken(PlayScriptParser::MUL, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::DIV() {
  return getToken(PlayScriptParser::DIV, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::MOD() {
  return getToken(PlayScriptParser::MOD, 0);
}

std::vector<tree::TerminalNode *> PlayScriptParser::ExpressionContext::LT() {
  return getTokens(PlayScriptParser::LT);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::LT(size_t i) {
  return getToken(PlayScriptParser::LT, i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::ExpressionContext::GT() {
  return getTokens(PlayScriptParser::GT);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::GT(size_t i) {
  return getToken(PlayScriptParser::GT, i);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::LE() {
  return getToken(PlayScriptParser::LE, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::GE() {
  return getToken(PlayScriptParser::GE, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::EQUAL() {
  return getToken(PlayScriptParser::EQUAL, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::NOTEQUAL() {
  return getToken(PlayScriptParser::NOTEQUAL, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::BITAND() {
  return getToken(PlayScriptParser::BITAND, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::CARET() {
  return getToken(PlayScriptParser::CARET, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::BITOR() {
  return getToken(PlayScriptParser::BITOR, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::AND() {
  return getToken(PlayScriptParser::AND, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::OR() {
  return getToken(PlayScriptParser::OR, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::COLON() {
  return getToken(PlayScriptParser::COLON, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::QUESTION() {
  return getToken(PlayScriptParser::QUESTION, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::ASSIGN() {
  return getToken(PlayScriptParser::ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::ADD_ASSIGN() {
  return getToken(PlayScriptParser::ADD_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::SUB_ASSIGN() {
  return getToken(PlayScriptParser::SUB_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::MUL_ASSIGN() {
  return getToken(PlayScriptParser::MUL_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::DIV_ASSIGN() {
  return getToken(PlayScriptParser::DIV_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::AND_ASSIGN() {
  return getToken(PlayScriptParser::AND_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::OR_ASSIGN() {
  return getToken(PlayScriptParser::OR_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::XOR_ASSIGN() {
  return getToken(PlayScriptParser::XOR_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::RSHIFT_ASSIGN() {
  return getToken(PlayScriptParser::RSHIFT_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::URSHIFT_ASSIGN() {
  return getToken(PlayScriptParser::URSHIFT_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::LSHIFT_ASSIGN() {
  return getToken(PlayScriptParser::LSHIFT_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::MOD_ASSIGN() {
  return getToken(PlayScriptParser::MOD_ASSIGN, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::DOT() {
  return getToken(PlayScriptParser::DOT, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::LBRACK() {
  return getToken(PlayScriptParser::LBRACK, 0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::RBRACK() {
  return getToken(PlayScriptParser::RBRACK, 0);
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::ExpressionContext::typeType() {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(0);
}

tree::TerminalNode* PlayScriptParser::ExpressionContext::INSTANCEOF() {
  return getToken(PlayScriptParser::INSTANCEOF, 0);
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


antlrcpp::Any PlayScriptParser::ExpressionContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitExpression(this);
  else
    return visitor->visitChildren(this);
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
  size_t startState = 78;
  enterRecursionRule(_localctx, 78, PlayScriptParser::RuleExpression, precedence);

    size_t _la = 0;

  auto onExit = finally([=] {
    unrollRecursionContexts(parentContext);
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(457);
    _errHandler->sync(this);
    switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 53, _ctx)) {
    case 1: {
      setState(451);
      primary();
      break;
    }

    case 2: {
      setState(452);
      functionCall();
      break;
    }

    case 3: {
      setState(453);
      dynamic_cast<ExpressionContext *>(_localctx)->prefix = _input->LT(1);
      _la = _input->LA(1);
      if (!(((((_la - 84) & ~ 0x3fULL) == 0) &&
        ((1ULL << (_la - 84)) & ((1ULL << (PlayScriptParser::INC - 84))
        | (1ULL << (PlayScriptParser::DEC - 84))
        | (1ULL << (PlayScriptParser::ADD - 84))
        | (1ULL << (PlayScriptParser::SUB - 84)))) != 0))) {
        dynamic_cast<ExpressionContext *>(_localctx)->prefix = _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(454);
      expression(15);
      break;
    }

    case 4: {
      setState(455);
      dynamic_cast<ExpressionContext *>(_localctx)->prefix = _input->LT(1);
      _la = _input->LA(1);
      if (!(_la == PlayScriptParser::BANG

      || _la == PlayScriptParser::TILDE)) {
        dynamic_cast<ExpressionContext *>(_localctx)->prefix = _errHandler->recoverInline(this);
      }
      else {
        _errHandler->reportMatch(this);
        consume();
      }
      setState(456);
      expression(14);
      break;
    }

    }
    _ctx->stop = _input->LT(-1);
    setState(524);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        if (!_parseListeners.empty())
          triggerExitRuleEvent();
        previousContext = _localctx;
        setState(522);
        _errHandler->sync(this);
        switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 56, _ctx)) {
        case 1: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(459);

          if (!(precpred(_ctx, 13))) throw FailedPredicateException(this, "precpred(_ctx, 13)");
          setState(460);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = _input->LT(1);
          _la = _input->LA(1);
          if (!(((((_la - 88) & ~ 0x3fULL) == 0) &&
            ((1ULL << (_la - 88)) & ((1ULL << (PlayScriptParser::MUL - 88))
            | (1ULL << (PlayScriptParser::DIV - 88))
            | (1ULL << (PlayScriptParser::MOD - 88)))) != 0))) {
            dynamic_cast<ExpressionContext *>(_localctx)->bop = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(461);
          expression(14);
          break;
        }

        case 2: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(462);

          if (!(precpred(_ctx, 12))) throw FailedPredicateException(this, "precpred(_ctx, 12)");
          setState(463);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == PlayScriptParser::ADD

          || _la == PlayScriptParser::SUB)) {
            dynamic_cast<ExpressionContext *>(_localctx)->bop = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(464);
          expression(13);
          break;
        }

        case 3: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(465);

          if (!(precpred(_ctx, 11))) throw FailedPredicateException(this, "precpred(_ctx, 11)");
          setState(473);
          _errHandler->sync(this);
          switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 54, _ctx)) {
          case 1: {
            setState(466);
            match(PlayScriptParser::LT);
            setState(467);
            match(PlayScriptParser::LT);
            break;
          }

          case 2: {
            setState(468);
            match(PlayScriptParser::GT);
            setState(469);
            match(PlayScriptParser::GT);
            setState(470);
            match(PlayScriptParser::GT);
            break;
          }

          case 3: {
            setState(471);
            match(PlayScriptParser::GT);
            setState(472);
            match(PlayScriptParser::GT);
            break;
          }

          }
          setState(475);
          expression(12);
          break;
        }

        case 4: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(476);

          if (!(precpred(_ctx, 10))) throw FailedPredicateException(this, "precpred(_ctx, 10)");
          setState(477);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = _input->LT(1);
          _la = _input->LA(1);
          if (!(((((_la - 72) & ~ 0x3fULL) == 0) &&
            ((1ULL << (_la - 72)) & ((1ULL << (PlayScriptParser::GT - 72))
            | (1ULL << (PlayScriptParser::LT - 72))
            | (1ULL << (PlayScriptParser::LE - 72))
            | (1ULL << (PlayScriptParser::GE - 72)))) != 0))) {
            dynamic_cast<ExpressionContext *>(_localctx)->bop = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(478);
          expression(11);
          break;
        }

        case 5: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(479);

          if (!(precpred(_ctx, 8))) throw FailedPredicateException(this, "precpred(_ctx, 8)");
          setState(480);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == PlayScriptParser::EQUAL

          || _la == PlayScriptParser::NOTEQUAL)) {
            dynamic_cast<ExpressionContext *>(_localctx)->bop = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(481);
          expression(9);
          break;
        }

        case 6: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(482);

          if (!(precpred(_ctx, 7))) throw FailedPredicateException(this, "precpred(_ctx, 7)");
          setState(483);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::BITAND);
          setState(484);
          expression(8);
          break;
        }

        case 7: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(485);

          if (!(precpred(_ctx, 6))) throw FailedPredicateException(this, "precpred(_ctx, 6)");
          setState(486);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::CARET);
          setState(487);
          expression(7);
          break;
        }

        case 8: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(488);

          if (!(precpred(_ctx, 5))) throw FailedPredicateException(this, "precpred(_ctx, 5)");
          setState(489);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::BITOR);
          setState(490);
          expression(6);
          break;
        }

        case 9: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(491);

          if (!(precpred(_ctx, 4))) throw FailedPredicateException(this, "precpred(_ctx, 4)");
          setState(492);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::AND);
          setState(493);
          expression(5);
          break;
        }

        case 10: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(494);

          if (!(precpred(_ctx, 3))) throw FailedPredicateException(this, "precpred(_ctx, 3)");
          setState(495);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::OR);
          setState(496);
          expression(4);
          break;
        }

        case 11: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(497);

          if (!(precpred(_ctx, 2))) throw FailedPredicateException(this, "precpred(_ctx, 2)");
          setState(498);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::QUESTION);
          setState(499);
          expression(0);
          setState(500);
          match(PlayScriptParser::COLON);
          setState(501);
          expression(3);
          break;
        }

        case 12: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(503);

          if (!(precpred(_ctx, 1))) throw FailedPredicateException(this, "precpred(_ctx, 1)");
          setState(504);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = _input->LT(1);
          _la = _input->LA(1);
          if (!(((((_la - 71) & ~ 0x3fULL) == 0) &&
            ((1ULL << (_la - 71)) & ((1ULL << (PlayScriptParser::ASSIGN - 71))
            | (1ULL << (PlayScriptParser::ADD_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::SUB_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::MUL_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::DIV_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::AND_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::OR_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::XOR_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::MOD_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::LSHIFT_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::RSHIFT_ASSIGN - 71))
            | (1ULL << (PlayScriptParser::URSHIFT_ASSIGN - 71)))) != 0))) {
            dynamic_cast<ExpressionContext *>(_localctx)->bop = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          setState(505);
          expression(1);
          break;
        }

        case 13: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(506);

          if (!(precpred(_ctx, 19))) throw FailedPredicateException(this, "precpred(_ctx, 19)");
          setState(507);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::DOT);
          setState(510);
          _errHandler->sync(this);
          switch (getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 55, _ctx)) {
          case 1: {
            setState(508);
            match(PlayScriptParser::IDENTIFIER);
            break;
          }

          case 2: {
            setState(509);
            functionCall();
            break;
          }

          }
          break;
        }

        case 14: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(512);

          if (!(precpred(_ctx, 18))) throw FailedPredicateException(this, "precpred(_ctx, 18)");
          setState(513);
          match(PlayScriptParser::LBRACK);
          setState(514);
          expression(0);
          setState(515);
          match(PlayScriptParser::RBRACK);
          break;
        }

        case 15: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(517);

          if (!(precpred(_ctx, 16))) throw FailedPredicateException(this, "precpred(_ctx, 16)");
          setState(518);
          dynamic_cast<ExpressionContext *>(_localctx)->postfix = _input->LT(1);
          _la = _input->LA(1);
          if (!(_la == PlayScriptParser::INC

          || _la == PlayScriptParser::DEC)) {
            dynamic_cast<ExpressionContext *>(_localctx)->postfix = _errHandler->recoverInline(this);
          }
          else {
            _errHandler->reportMatch(this);
            consume();
          }
          break;
        }

        case 16: {
          _localctx = _tracker.createInstance<ExpressionContext>(parentContext, parentState);
          pushNewRecursionContext(_localctx, startState, RuleExpression);
          setState(519);

          if (!(precpred(_ctx, 9))) throw FailedPredicateException(this, "precpred(_ctx, 9)");
          setState(520);
          dynamic_cast<ExpressionContext *>(_localctx)->bop = match(PlayScriptParser::INSTANCEOF);
          setState(521);
          typeType();
          break;
        }

        } 
      }
      setState(526);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 57, _ctx);
    }
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }
  return _localctx;
}

//----------------- PrimaryContext ------------------------------------------------------------------

PlayScriptParser::PrimaryContext::PrimaryContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::PrimaryContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

PlayScriptParser::ExpressionContext* PlayScriptParser::PrimaryContext::expression() {
  return getRuleContext<PlayScriptParser::ExpressionContext>(0);
}

tree::TerminalNode* PlayScriptParser::PrimaryContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::PrimaryContext::THIS() {
  return getToken(PlayScriptParser::THIS, 0);
}

PlayScriptParser::LiteralContext* PlayScriptParser::PrimaryContext::literal() {
  return getRuleContext<PlayScriptParser::LiteralContext>(0);
}

tree::TerminalNode* PlayScriptParser::PrimaryContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}


size_t PlayScriptParser::PrimaryContext::getRuleIndex() const {
  return PlayScriptParser::RulePrimary;
}

void PlayScriptParser::PrimaryContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterPrimary(this);
}

void PlayScriptParser::PrimaryContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitPrimary(this);
}


antlrcpp::Any PlayScriptParser::PrimaryContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitPrimary(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::PrimaryContext* PlayScriptParser::primary() {
  PrimaryContext *_localctx = _tracker.createInstance<PrimaryContext>(_ctx, getState());
  enterRule(_localctx, 80, PlayScriptParser::RulePrimary);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(534);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::LPAREN: {
        enterOuterAlt(_localctx, 1);
        setState(527);
        match(PlayScriptParser::LPAREN);
        setState(528);
        expression(0);
        setState(529);
        match(PlayScriptParser::RPAREN);
        break;
      }

      case PlayScriptParser::THIS: {
        enterOuterAlt(_localctx, 2);
        setState(531);
        match(PlayScriptParser::THIS);
        break;
      }

      case PlayScriptParser::DECIMAL_LITERAL:
      case PlayScriptParser::HEX_LITERAL:
      case PlayScriptParser::OCT_LITERAL:
      case PlayScriptParser::BINARY_LITERAL:
      case PlayScriptParser::FLOAT_LITERAL:
      case PlayScriptParser::HEX_FLOAT_LITERAL:
      case PlayScriptParser::BOOL_LITERAL:
      case PlayScriptParser::CHAR_LITERAL:
      case PlayScriptParser::STRING_LITERAL:
      case PlayScriptParser::NULL_LITERAL: {
        enterOuterAlt(_localctx, 3);
        setState(532);
        literal();
        break;
      }

      case PlayScriptParser::IDENTIFIER: {
        enterOuterAlt(_localctx, 4);
        setState(533);
        match(PlayScriptParser::IDENTIFIER);
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

//----------------- TypeListContext ------------------------------------------------------------------

PlayScriptParser::TypeListContext::TypeListContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

std::vector<PlayScriptParser::TypeTypeContext *> PlayScriptParser::TypeListContext::typeType() {
  return getRuleContexts<PlayScriptParser::TypeTypeContext>();
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::TypeListContext::typeType(size_t i) {
  return getRuleContext<PlayScriptParser::TypeTypeContext>(i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::TypeListContext::COMMA() {
  return getTokens(PlayScriptParser::COMMA);
}

tree::TerminalNode* PlayScriptParser::TypeListContext::COMMA(size_t i) {
  return getToken(PlayScriptParser::COMMA, i);
}


size_t PlayScriptParser::TypeListContext::getRuleIndex() const {
  return PlayScriptParser::RuleTypeList;
}

void PlayScriptParser::TypeListContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTypeList(this);
}

void PlayScriptParser::TypeListContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTypeList(this);
}


antlrcpp::Any PlayScriptParser::TypeListContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitTypeList(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::TypeListContext* PlayScriptParser::typeList() {
  TypeListContext *_localctx = _tracker.createInstance<TypeListContext>(_ctx, getState());
  enterRule(_localctx, 82, PlayScriptParser::RuleTypeList);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(536);
    typeType();
    setState(541);
    _errHandler->sync(this);
    _la = _input->LA(1);
    while (_la == PlayScriptParser::COMMA) {
      setState(537);
      match(PlayScriptParser::COMMA);
      setState(538);
      typeType();
      setState(543);
      _errHandler->sync(this);
      _la = _input->LA(1);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- TypeTypeContext ------------------------------------------------------------------

PlayScriptParser::TypeTypeContext::TypeTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::ClassOrInterfaceTypeContext* PlayScriptParser::TypeTypeContext::classOrInterfaceType() {
  return getRuleContext<PlayScriptParser::ClassOrInterfaceTypeContext>(0);
}

PlayScriptParser::FunctionTypeContext* PlayScriptParser::TypeTypeContext::functionType() {
  return getRuleContext<PlayScriptParser::FunctionTypeContext>(0);
}

PlayScriptParser::PrimitiveTypeContext* PlayScriptParser::TypeTypeContext::primitiveType() {
  return getRuleContext<PlayScriptParser::PrimitiveTypeContext>(0);
}

std::vector<tree::TerminalNode *> PlayScriptParser::TypeTypeContext::LBRACK() {
  return getTokens(PlayScriptParser::LBRACK);
}

tree::TerminalNode* PlayScriptParser::TypeTypeContext::LBRACK(size_t i) {
  return getToken(PlayScriptParser::LBRACK, i);
}

std::vector<tree::TerminalNode *> PlayScriptParser::TypeTypeContext::RBRACK() {
  return getTokens(PlayScriptParser::RBRACK);
}

tree::TerminalNode* PlayScriptParser::TypeTypeContext::RBRACK(size_t i) {
  return getToken(PlayScriptParser::RBRACK, i);
}


size_t PlayScriptParser::TypeTypeContext::getRuleIndex() const {
  return PlayScriptParser::RuleTypeType;
}

void PlayScriptParser::TypeTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterTypeType(this);
}

void PlayScriptParser::TypeTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitTypeType(this);
}


antlrcpp::Any PlayScriptParser::TypeTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitTypeType(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::TypeTypeContext* PlayScriptParser::typeType() {
  TypeTypeContext *_localctx = _tracker.createInstance<TypeTypeContext>(_ctx, getState());
  enterRule(_localctx, 84, PlayScriptParser::RuleTypeType);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    size_t alt;
    enterOuterAlt(_localctx, 1);
    setState(547);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::IDENTIFIER: {
        setState(544);
        classOrInterfaceType();
        break;
      }

      case PlayScriptParser::FUNCTION: {
        setState(545);
        functionType();
        break;
      }

      case PlayScriptParser::BOOLEAN:
      case PlayScriptParser::BYTE:
      case PlayScriptParser::CHAR:
      case PlayScriptParser::DOUBLE:
      case PlayScriptParser::FLOAT:
      case PlayScriptParser::INT:
      case PlayScriptParser::LONG:
      case PlayScriptParser::SHORT: {
        setState(546);
        primitiveType();
        break;
      }

    default:
      throw NoViableAltException(this);
    }
    setState(553);
    _errHandler->sync(this);
    alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 61, _ctx);
    while (alt != 2 && alt != atn::ATN::INVALID_ALT_NUMBER) {
      if (alt == 1) {
        setState(549);
        match(PlayScriptParser::LBRACK);
        setState(550);
        match(PlayScriptParser::RBRACK); 
      }
      setState(555);
      _errHandler->sync(this);
      alt = getInterpreter<atn::ParserATNSimulator>()->adaptivePredict(_input, 61, _ctx);
    }
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- FunctionTypeContext ------------------------------------------------------------------

PlayScriptParser::FunctionTypeContext::FunctionTypeContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::FunctionTypeContext::FUNCTION() {
  return getToken(PlayScriptParser::FUNCTION, 0);
}

PlayScriptParser::TypeTypeOrVoidContext* PlayScriptParser::FunctionTypeContext::typeTypeOrVoid() {
  return getRuleContext<PlayScriptParser::TypeTypeOrVoidContext>(0);
}

tree::TerminalNode* PlayScriptParser::FunctionTypeContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::FunctionTypeContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

PlayScriptParser::TypeListContext* PlayScriptParser::FunctionTypeContext::typeList() {
  return getRuleContext<PlayScriptParser::TypeListContext>(0);
}


size_t PlayScriptParser::FunctionTypeContext::getRuleIndex() const {
  return PlayScriptParser::RuleFunctionType;
}

void PlayScriptParser::FunctionTypeContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterFunctionType(this);
}

void PlayScriptParser::FunctionTypeContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitFunctionType(this);
}


antlrcpp::Any PlayScriptParser::FunctionTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitFunctionType(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::FunctionTypeContext* PlayScriptParser::functionType() {
  FunctionTypeContext *_localctx = _tracker.createInstance<FunctionTypeContext>(_ctx, getState());
  enterRule(_localctx, 86, PlayScriptParser::RuleFunctionType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(556);
    match(PlayScriptParser::FUNCTION);
    setState(557);
    typeTypeOrVoid();
    setState(558);
    match(PlayScriptParser::LPAREN);
    setState(560);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
      | (1ULL << PlayScriptParser::BYTE)
      | (1ULL << PlayScriptParser::CHAR)
      | (1ULL << PlayScriptParser::DOUBLE)
      | (1ULL << PlayScriptParser::FLOAT)
      | (1ULL << PlayScriptParser::INT)
      | (1ULL << PlayScriptParser::LONG)
      | (1ULL << PlayScriptParser::SHORT)
      | (1ULL << PlayScriptParser::FUNCTION))) != 0) || _la == PlayScriptParser::IDENTIFIER) {
      setState(559);
      typeList();
    }
    setState(562);
    match(PlayScriptParser::RPAREN);
   
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

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::BOOLEAN() {
  return getToken(PlayScriptParser::BOOLEAN, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::CHAR() {
  return getToken(PlayScriptParser::CHAR, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::BYTE() {
  return getToken(PlayScriptParser::BYTE, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::SHORT() {
  return getToken(PlayScriptParser::SHORT, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::INT() {
  return getToken(PlayScriptParser::INT, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::LONG() {
  return getToken(PlayScriptParser::LONG, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::FLOAT() {
  return getToken(PlayScriptParser::FLOAT, 0);
}

tree::TerminalNode* PlayScriptParser::PrimitiveTypeContext::DOUBLE() {
  return getToken(PlayScriptParser::DOUBLE, 0);
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


antlrcpp::Any PlayScriptParser::PrimitiveTypeContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitPrimitiveType(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::PrimitiveTypeContext* PlayScriptParser::primitiveType() {
  PrimitiveTypeContext *_localctx = _tracker.createInstance<PrimitiveTypeContext>(_ctx, getState());
  enterRule(_localctx, 88, PlayScriptParser::RulePrimitiveType);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(564);
    _la = _input->LA(1);
    if (!((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::BOOLEAN)
      | (1ULL << PlayScriptParser::BYTE)
      | (1ULL << PlayScriptParser::CHAR)
      | (1ULL << PlayScriptParser::DOUBLE)
      | (1ULL << PlayScriptParser::FLOAT)
      | (1ULL << PlayScriptParser::INT)
      | (1ULL << PlayScriptParser::LONG)
      | (1ULL << PlayScriptParser::SHORT))) != 0))) {
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

//----------------- CreatorContext ------------------------------------------------------------------

PlayScriptParser::CreatorContext::CreatorContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::CreatorContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}

PlayScriptParser::ArgumentsContext* PlayScriptParser::CreatorContext::arguments() {
  return getRuleContext<PlayScriptParser::ArgumentsContext>(0);
}


size_t PlayScriptParser::CreatorContext::getRuleIndex() const {
  return PlayScriptParser::RuleCreator;
}

void PlayScriptParser::CreatorContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterCreator(this);
}

void PlayScriptParser::CreatorContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitCreator(this);
}


antlrcpp::Any PlayScriptParser::CreatorContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitCreator(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::CreatorContext* PlayScriptParser::creator() {
  CreatorContext *_localctx = _tracker.createInstance<CreatorContext>(_ctx, getState());
  enterRule(_localctx, 90, PlayScriptParser::RuleCreator);

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(566);
    match(PlayScriptParser::IDENTIFIER);
    setState(567);
    arguments();
   
  }
  catch (RecognitionException &e) {
    _errHandler->reportError(this, e);
    _localctx->exception = std::current_exception();
    _errHandler->recover(this, _localctx->exception);
  }

  return _localctx;
}

//----------------- SuperSuffixContext ------------------------------------------------------------------

PlayScriptParser::SuperSuffixContext::SuperSuffixContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

PlayScriptParser::ArgumentsContext* PlayScriptParser::SuperSuffixContext::arguments() {
  return getRuleContext<PlayScriptParser::ArgumentsContext>(0);
}

tree::TerminalNode* PlayScriptParser::SuperSuffixContext::DOT() {
  return getToken(PlayScriptParser::DOT, 0);
}

tree::TerminalNode* PlayScriptParser::SuperSuffixContext::IDENTIFIER() {
  return getToken(PlayScriptParser::IDENTIFIER, 0);
}


size_t PlayScriptParser::SuperSuffixContext::getRuleIndex() const {
  return PlayScriptParser::RuleSuperSuffix;
}

void PlayScriptParser::SuperSuffixContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterSuperSuffix(this);
}

void PlayScriptParser::SuperSuffixContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitSuperSuffix(this);
}


antlrcpp::Any PlayScriptParser::SuperSuffixContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitSuperSuffix(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::SuperSuffixContext* PlayScriptParser::superSuffix() {
  SuperSuffixContext *_localctx = _tracker.createInstance<SuperSuffixContext>(_ctx, getState());
  enterRule(_localctx, 92, PlayScriptParser::RuleSuperSuffix);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    setState(575);
    _errHandler->sync(this);
    switch (_input->LA(1)) {
      case PlayScriptParser::LPAREN: {
        enterOuterAlt(_localctx, 1);
        setState(569);
        arguments();
        break;
      }

      case PlayScriptParser::DOT: {
        enterOuterAlt(_localctx, 2);
        setState(570);
        match(PlayScriptParser::DOT);
        setState(571);
        match(PlayScriptParser::IDENTIFIER);
        setState(573);
        _errHandler->sync(this);

        _la = _input->LA(1);
        if (_la == PlayScriptParser::LPAREN) {
          setState(572);
          arguments();
        }
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

//----------------- ArgumentsContext ------------------------------------------------------------------

PlayScriptParser::ArgumentsContext::ArgumentsContext(ParserRuleContext *parent, size_t invokingState)
  : ParserRuleContext(parent, invokingState) {
}

tree::TerminalNode* PlayScriptParser::ArgumentsContext::LPAREN() {
  return getToken(PlayScriptParser::LPAREN, 0);
}

tree::TerminalNode* PlayScriptParser::ArgumentsContext::RPAREN() {
  return getToken(PlayScriptParser::RPAREN, 0);
}

PlayScriptParser::ExpressionListContext* PlayScriptParser::ArgumentsContext::expressionList() {
  return getRuleContext<PlayScriptParser::ExpressionListContext>(0);
}


size_t PlayScriptParser::ArgumentsContext::getRuleIndex() const {
  return PlayScriptParser::RuleArguments;
}

void PlayScriptParser::ArgumentsContext::enterRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->enterArguments(this);
}

void PlayScriptParser::ArgumentsContext::exitRule(tree::ParseTreeListener *listener) {
  auto parserListener = dynamic_cast<PlayScriptListener *>(listener);
  if (parserListener != nullptr)
    parserListener->exitArguments(this);
}


antlrcpp::Any PlayScriptParser::ArgumentsContext::accept(tree::ParseTreeVisitor *visitor) {
  if (auto parserVisitor = dynamic_cast<PlayScriptVisitor*>(visitor))
    return parserVisitor->visitArguments(this);
  else
    return visitor->visitChildren(this);
}

PlayScriptParser::ArgumentsContext* PlayScriptParser::arguments() {
  ArgumentsContext *_localctx = _tracker.createInstance<ArgumentsContext>(_ctx, getState());
  enterRule(_localctx, 94, PlayScriptParser::RuleArguments);
  size_t _la = 0;

  auto onExit = finally([=] {
    exitRule();
  });
  try {
    enterOuterAlt(_localctx, 1);
    setState(577);
    match(PlayScriptParser::LPAREN);
    setState(579);
    _errHandler->sync(this);

    _la = _input->LA(1);
    if ((((_la & ~ 0x3fULL) == 0) &&
      ((1ULL << _la) & ((1ULL << PlayScriptParser::SUPER)
      | (1ULL << PlayScriptParser::THIS)
      | (1ULL << PlayScriptParser::DECIMAL_LITERAL)
      | (1ULL << PlayScriptParser::HEX_LITERAL)
      | (1ULL << PlayScriptParser::OCT_LITERAL)
      | (1ULL << PlayScriptParser::BINARY_LITERAL)
      | (1ULL << PlayScriptParser::FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::HEX_FLOAT_LITERAL)
      | (1ULL << PlayScriptParser::BOOL_LITERAL)
      | (1ULL << PlayScriptParser::CHAR_LITERAL)
      | (1ULL << PlayScriptParser::STRING_LITERAL)
      | (1ULL << PlayScriptParser::NULL_LITERAL)
      | (1ULL << PlayScriptParser::LPAREN))) != 0) || ((((_la - 74) & ~ 0x3fULL) == 0) &&
      ((1ULL << (_la - 74)) & ((1ULL << (PlayScriptParser::BANG - 74))
      | (1ULL << (PlayScriptParser::TILDE - 74))
      | (1ULL << (PlayScriptParser::INC - 74))
      | (1ULL << (PlayScriptParser::DEC - 74))
      | (1ULL << (PlayScriptParser::ADD - 74))
      | (1ULL << (PlayScriptParser::SUB - 74))
      | (1ULL << (PlayScriptParser::IDENTIFIER - 74)))) != 0)) {
      setState(578);
      expressionList();
    }
    setState(581);
    match(PlayScriptParser::RPAREN);
   
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
    case 39: return expressionSempred(dynamic_cast<ExpressionContext *>(context), predicateIndex);

  default:
    break;
  }
  return true;
}

bool PlayScriptParser::expressionSempred(ExpressionContext *_localctx, size_t predicateIndex) {
  switch (predicateIndex) {
    case 0: return precpred(_ctx, 13);
    case 1: return precpred(_ctx, 12);
    case 2: return precpred(_ctx, 11);
    case 3: return precpred(_ctx, 10);
    case 4: return precpred(_ctx, 8);
    case 5: return precpred(_ctx, 7);
    case 6: return precpred(_ctx, 6);
    case 7: return precpred(_ctx, 5);
    case 8: return precpred(_ctx, 4);
    case 9: return precpred(_ctx, 3);
    case 10: return precpred(_ctx, 2);
    case 11: return precpred(_ctx, 1);
    case 12: return precpred(_ctx, 19);
    case 13: return precpred(_ctx, 18);
    case 14: return precpred(_ctx, 16);
    case 15: return precpred(_ctx, 9);

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
  "classDeclaration", "classBody", "classBodyDeclaration", "memberDeclaration", 
  "functionDeclaration", "functionBody", "typeTypeOrVoid", "qualifiedNameList", 
  "formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
  "variableModifier", "qualifiedName", "fieldDeclaration", "constructorDeclaration", 
  "variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer", 
  "arrayInitializer", "classOrInterfaceType", "typeArgument", "literal", 
  "integerLiteral", "floatLiteral", "prog", "block", "blockStatements", 
  "blockStatement", "statement", "switchBlockStatementGroup", "switchLabel", 
  "forControl", "forInit", "enhancedForControl", "parExpression", "expressionList", 
  "functionCall", "expression", "primary", "typeList", "typeType", "functionType", 
  "primitiveType", "creator", "superSuffix", "arguments"
};

std::vector<std::string> PlayScriptParser::_literalNames = {
  "", "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
  "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
  "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
  "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
  "'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
  "'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
  "'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
  "'transient'", "'try'", "'void'", "'volatile'", "'while'", "'function'", 
  "", "", "", "", "", "", "", "", "", "'null'", "'('", "')'", "'{'", "'}'", 
  "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
  "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
  "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
  "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
  "'>>>='", "'->'", "'::'", "'@'", "'...'"
};

std::vector<std::string> PlayScriptParser::_symbolicNames = {
  "", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
  "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
  "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
  "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
  "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", 
  "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", 
  "TRY", "VOID", "VOLATILE", "WHILE", "FUNCTION", "DECIMAL_LITERAL", "HEX_LITERAL", 
  "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
  "BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
  "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
  "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
  "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
  "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", 
  "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
  "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", "COLONCOLON", "AT", "ELLIPSIS", 
  "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
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
    0x3, 0x72, 0x24a, 0x4, 0x2, 0x9, 0x2, 0x4, 0x3, 0x9, 0x3, 0x4, 0x4, 
    0x9, 0x4, 0x4, 0x5, 0x9, 0x5, 0x4, 0x6, 0x9, 0x6, 0x4, 0x7, 0x9, 0x7, 
    0x4, 0x8, 0x9, 0x8, 0x4, 0x9, 0x9, 0x9, 0x4, 0xa, 0x9, 0xa, 0x4, 0xb, 
    0x9, 0xb, 0x4, 0xc, 0x9, 0xc, 0x4, 0xd, 0x9, 0xd, 0x4, 0xe, 0x9, 0xe, 
    0x4, 0xf, 0x9, 0xf, 0x4, 0x10, 0x9, 0x10, 0x4, 0x11, 0x9, 0x11, 0x4, 
    0x12, 0x9, 0x12, 0x4, 0x13, 0x9, 0x13, 0x4, 0x14, 0x9, 0x14, 0x4, 0x15, 
    0x9, 0x15, 0x4, 0x16, 0x9, 0x16, 0x4, 0x17, 0x9, 0x17, 0x4, 0x18, 0x9, 
    0x18, 0x4, 0x19, 0x9, 0x19, 0x4, 0x1a, 0x9, 0x1a, 0x4, 0x1b, 0x9, 0x1b, 
    0x4, 0x1c, 0x9, 0x1c, 0x4, 0x1d, 0x9, 0x1d, 0x4, 0x1e, 0x9, 0x1e, 0x4, 
    0x1f, 0x9, 0x1f, 0x4, 0x20, 0x9, 0x20, 0x4, 0x21, 0x9, 0x21, 0x4, 0x22, 
    0x9, 0x22, 0x4, 0x23, 0x9, 0x23, 0x4, 0x24, 0x9, 0x24, 0x4, 0x25, 0x9, 
    0x25, 0x4, 0x26, 0x9, 0x26, 0x4, 0x27, 0x9, 0x27, 0x4, 0x28, 0x9, 0x28, 
    0x4, 0x29, 0x9, 0x29, 0x4, 0x2a, 0x9, 0x2a, 0x4, 0x2b, 0x9, 0x2b, 0x4, 
    0x2c, 0x9, 0x2c, 0x4, 0x2d, 0x9, 0x2d, 0x4, 0x2e, 0x9, 0x2e, 0x4, 0x2f, 
    0x9, 0x2f, 0x4, 0x30, 0x9, 0x30, 0x4, 0x31, 0x9, 0x31, 0x3, 0x2, 0x3, 
    0x2, 0x3, 0x2, 0x3, 0x2, 0x5, 0x2, 0x67, 0xa, 0x2, 0x3, 0x2, 0x3, 0x2, 
    0x5, 0x2, 0x6b, 0xa, 0x2, 0x3, 0x2, 0x3, 0x2, 0x3, 0x3, 0x3, 0x3, 0x7, 
    0x3, 0x71, 0xa, 0x3, 0xc, 0x3, 0xe, 0x3, 0x74, 0xb, 0x3, 0x3, 0x3, 0x3, 
    0x3, 0x3, 0x4, 0x3, 0x4, 0x5, 0x4, 0x7a, 0xa, 0x4, 0x3, 0x5, 0x3, 0x5, 
    0x5, 0x5, 0x7e, 0xa, 0x5, 0x3, 0x6, 0x5, 0x6, 0x81, 0xa, 0x6, 0x3, 0x6, 
    0x3, 0x6, 0x3, 0x6, 0x3, 0x6, 0x7, 0x6, 0x87, 0xa, 0x6, 0xc, 0x6, 0xe, 
    0x6, 0x8a, 0xb, 0x6, 0x3, 0x6, 0x3, 0x6, 0x5, 0x6, 0x8e, 0xa, 0x6, 0x3, 
    0x6, 0x3, 0x6, 0x3, 0x7, 0x3, 0x7, 0x5, 0x7, 0x94, 0xa, 0x7, 0x3, 0x8, 
    0x3, 0x8, 0x5, 0x8, 0x98, 0xa, 0x8, 0x3, 0x9, 0x3, 0x9, 0x3, 0x9, 0x7, 
    0x9, 0x9d, 0xa, 0x9, 0xc, 0x9, 0xe, 0x9, 0xa0, 0xb, 0x9, 0x3, 0xa, 0x3, 
    0xa, 0x5, 0xa, 0xa4, 0xa, 0xa, 0x3, 0xa, 0x3, 0xa, 0x3, 0xb, 0x3, 0xb, 
    0x3, 0xb, 0x7, 0xb, 0xab, 0xa, 0xb, 0xc, 0xb, 0xe, 0xb, 0xae, 0xb, 0xb, 
    0x3, 0xb, 0x3, 0xb, 0x5, 0xb, 0xb2, 0xa, 0xb, 0x3, 0xb, 0x5, 0xb, 0xb5, 
    0xa, 0xb, 0x3, 0xc, 0x7, 0xc, 0xb8, 0xa, 0xc, 0xc, 0xc, 0xe, 0xc, 0xbb, 
    0xb, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xc, 0x3, 0xd, 0x7, 0xd, 0xc1, 0xa, 
    0xd, 0xc, 0xd, 0xe, 0xd, 0xc4, 0xb, 0xd, 0x3, 0xd, 0x3, 0xd, 0x3, 0xd, 
    0x3, 0xd, 0x3, 0xe, 0x3, 0xe, 0x3, 0xf, 0x3, 0xf, 0x3, 0xf, 0x7, 0xf, 
    0xcf, 0xa, 0xf, 0xc, 0xf, 0xe, 0xf, 0xd2, 0xb, 0xf, 0x3, 0x10, 0x3, 
    0x10, 0x3, 0x10, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x11, 0x5, 0x11, 
    0xdb, 0xa, 0x11, 0x3, 0x11, 0x3, 0x11, 0x3, 0x12, 0x3, 0x12, 0x3, 0x12, 
    0x3, 0x12, 0x7, 0x12, 0xe3, 0xa, 0x12, 0xc, 0x12, 0xe, 0x12, 0xe6, 0xb, 
    0x12, 0x3, 0x13, 0x3, 0x13, 0x3, 0x13, 0x5, 0x13, 0xeb, 0xa, 0x13, 0x3, 
    0x14, 0x3, 0x14, 0x3, 0x14, 0x7, 0x14, 0xf0, 0xa, 0x14, 0xc, 0x14, 0xe, 
    0x14, 0xf3, 0xb, 0x14, 0x3, 0x15, 0x3, 0x15, 0x5, 0x15, 0xf7, 0xa, 0x15, 
    0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x16, 0x7, 0x16, 0xfd, 0xa, 0x16, 
    0xc, 0x16, 0xe, 0x16, 0x100, 0xb, 0x16, 0x3, 0x16, 0x5, 0x16, 0x103, 
    0xa, 0x16, 0x5, 0x16, 0x105, 0xa, 0x16, 0x3, 0x16, 0x3, 0x16, 0x3, 0x17, 
    0x3, 0x17, 0x3, 0x17, 0x7, 0x17, 0x10c, 0xa, 0x17, 0xc, 0x17, 0xe, 0x17, 
    0x10f, 0xb, 0x17, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x3, 0x18, 0x5, 0x18, 
    0x115, 0xa, 0x18, 0x5, 0x18, 0x117, 0xa, 0x18, 0x3, 0x19, 0x3, 0x19, 
    0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x3, 0x19, 0x5, 0x19, 0x11f, 0xa, 0x19, 
    0x3, 0x1a, 0x3, 0x1a, 0x3, 0x1b, 0x3, 0x1b, 0x3, 0x1c, 0x3, 0x1c, 0x3, 
    0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1d, 0x3, 0x1e, 0x7, 0x1e, 0x12c, 
    0xa, 0x1e, 0xc, 0x1e, 0xe, 0x1e, 0x12f, 0xb, 0x1e, 0x3, 0x1f, 0x3, 0x1f, 
    0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x3, 0x1f, 0x5, 0x1f, 0x137, 0xa, 0x1f, 
    0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x5, 
    0x20, 0x13f, 0xa, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
    0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 
    0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
    0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x7, 0x20, 0x155, 0xa, 0x20, 0xc, 0x20, 
    0xe, 0x20, 0x158, 0xb, 0x20, 0x3, 0x20, 0x7, 0x20, 0x15b, 0xa, 0x20, 
    0xc, 0x20, 0xe, 0x20, 0x15e, 0xb, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
    0x3, 0x20, 0x5, 0x20, 0x164, 0xa, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
    0x5, 0x20, 0x169, 0xa, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x5, 0x20, 
    0x16e, 0xa, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 
    0x3, 0x20, 0x3, 0x20, 0x3, 0x20, 0x5, 0x20, 0x178, 0xa, 0x20, 0x3, 0x21, 
    0x6, 0x21, 0x17b, 0xa, 0x21, 0xd, 0x21, 0xe, 0x21, 0x17c, 0x3, 0x21, 
    0x6, 0x21, 0x180, 0xa, 0x21, 0xd, 0x21, 0xe, 0x21, 0x181, 0x3, 0x22, 
    0x3, 0x22, 0x3, 0x22, 0x5, 0x22, 0x187, 0xa, 0x22, 0x3, 0x22, 0x3, 0x22, 
    0x3, 0x22, 0x5, 0x22, 0x18c, 0xa, 0x22, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 
    0x190, 0xa, 0x23, 0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 0x194, 0xa, 0x23, 
    0x3, 0x23, 0x3, 0x23, 0x5, 0x23, 0x198, 0xa, 0x23, 0x5, 0x23, 0x19a, 
    0xa, 0x23, 0x3, 0x24, 0x3, 0x24, 0x5, 0x24, 0x19e, 0xa, 0x24, 0x3, 0x25, 
    0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x25, 0x3, 0x26, 0x3, 0x26, 0x3, 
    0x26, 0x3, 0x26, 0x3, 0x27, 0x3, 0x27, 0x3, 0x27, 0x7, 0x27, 0x1ac, 
    0xa, 0x27, 0xc, 0x27, 0xe, 0x27, 0x1af, 0xb, 0x27, 0x3, 0x28, 0x3, 0x28, 
    0x3, 0x28, 0x5, 0x28, 0x1b4, 0xa, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 
    0x3, 0x28, 0x5, 0x28, 0x1ba, 0xa, 0x28, 0x3, 0x28, 0x3, 0x28, 0x3, 0x28, 
    0x3, 0x28, 0x5, 0x28, 0x1c0, 0xa, 0x28, 0x3, 0x28, 0x5, 0x28, 0x1c3, 
    0xa, 0x28, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
    0x29, 0x3, 0x29, 0x5, 0x29, 0x1cc, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 
    0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
    0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 
    0x1dc, 0xa, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
    0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
    0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
    0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
    0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 
    0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x5, 0x29, 0x201, 0xa, 0x29, 
    0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 
    0x29, 0x3, 0x29, 0x3, 0x29, 0x3, 0x29, 0x7, 0x29, 0x20d, 0xa, 0x29, 
    0xc, 0x29, 0xe, 0x29, 0x210, 0xb, 0x29, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 
    0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x3, 0x2a, 0x5, 0x2a, 0x219, 0xa, 0x2a, 
    0x3, 0x2b, 0x3, 0x2b, 0x3, 0x2b, 0x7, 0x2b, 0x21e, 0xa, 0x2b, 0xc, 0x2b, 
    0xe, 0x2b, 0x221, 0xb, 0x2b, 0x3, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x5, 0x2c, 
    0x226, 0xa, 0x2c, 0x3, 0x2c, 0x3, 0x2c, 0x7, 0x2c, 0x22a, 0xa, 0x2c, 
    0xc, 0x2c, 0xe, 0x2c, 0x22d, 0xb, 0x2c, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 
    0x3, 0x2d, 0x5, 0x2d, 0x233, 0xa, 0x2d, 0x3, 0x2d, 0x3, 0x2d, 0x3, 0x2e, 
    0x3, 0x2e, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x2f, 0x3, 0x30, 0x3, 0x30, 0x3, 
    0x30, 0x3, 0x30, 0x5, 0x30, 0x240, 0xa, 0x30, 0x5, 0x30, 0x242, 0xa, 
    0x30, 0x3, 0x31, 0x3, 0x31, 0x5, 0x31, 0x246, 0xa, 0x31, 0x3, 0x31, 
    0x3, 0x31, 0x3, 0x31, 0x2, 0x3, 0x50, 0x32, 0x2, 0x4, 0x6, 0x8, 0xa, 
    0xc, 0xe, 0x10, 0x12, 0x14, 0x16, 0x18, 0x1a, 0x1c, 0x1e, 0x20, 0x22, 
    0x24, 0x26, 0x28, 0x2a, 0x2c, 0x2e, 0x30, 0x32, 0x34, 0x36, 0x38, 0x3a, 
    0x3c, 0x3e, 0x40, 0x42, 0x44, 0x46, 0x48, 0x4a, 0x4c, 0x4e, 0x50, 0x52, 
    0x54, 0x56, 0x58, 0x5a, 0x5c, 0x5e, 0x60, 0x2, 0xe, 0x4, 0x2, 0x13, 
    0x13, 0x2a, 0x2a, 0x3, 0x2, 0x36, 0x39, 0x3, 0x2, 0x3a, 0x3b, 0x3, 0x2, 
    0x56, 0x59, 0x3, 0x2, 0x4c, 0x4d, 0x4, 0x2, 0x5a, 0x5b, 0x5f, 0x5f, 
    0x3, 0x2, 0x58, 0x59, 0x4, 0x2, 0x4a, 0x4b, 0x51, 0x52, 0x4, 0x2, 0x50, 
    0x50, 0x53, 0x53, 0x4, 0x2, 0x49, 0x49, 0x60, 0x6a, 0x3, 0x2, 0x56, 
    0x57, 0xa, 0x2, 0x5, 0x5, 0x7, 0x7, 0xa, 0xa, 0x10, 0x10, 0x16, 0x16, 
    0x1d, 0x1d, 0x1f, 0x1f, 0x27, 0x27, 0x2, 0x280, 0x2, 0x62, 0x3, 0x2, 
    0x2, 0x2, 0x4, 0x6e, 0x3, 0x2, 0x2, 0x2, 0x6, 0x79, 0x3, 0x2, 0x2, 0x2, 
    0x8, 0x7d, 0x3, 0x2, 0x2, 0x2, 0xa, 0x80, 0x3, 0x2, 0x2, 0x2, 0xc, 0x93, 
    0x3, 0x2, 0x2, 0x2, 0xe, 0x97, 0x3, 0x2, 0x2, 0x2, 0x10, 0x99, 0x3, 
    0x2, 0x2, 0x2, 0x12, 0xa1, 0x3, 0x2, 0x2, 0x2, 0x14, 0xb4, 0x3, 0x2, 
    0x2, 0x2, 0x16, 0xb9, 0x3, 0x2, 0x2, 0x2, 0x18, 0xc2, 0x3, 0x2, 0x2, 
    0x2, 0x1a, 0xc9, 0x3, 0x2, 0x2, 0x2, 0x1c, 0xcb, 0x3, 0x2, 0x2, 0x2, 
    0x1e, 0xd3, 0x3, 0x2, 0x2, 0x2, 0x20, 0xd6, 0x3, 0x2, 0x2, 0x2, 0x22, 
    0xde, 0x3, 0x2, 0x2, 0x2, 0x24, 0xe7, 0x3, 0x2, 0x2, 0x2, 0x26, 0xec, 
    0x3, 0x2, 0x2, 0x2, 0x28, 0xf6, 0x3, 0x2, 0x2, 0x2, 0x2a, 0xf8, 0x3, 
    0x2, 0x2, 0x2, 0x2c, 0x108, 0x3, 0x2, 0x2, 0x2, 0x2e, 0x116, 0x3, 0x2, 
    0x2, 0x2, 0x30, 0x11e, 0x3, 0x2, 0x2, 0x2, 0x32, 0x120, 0x3, 0x2, 0x2, 
    0x2, 0x34, 0x122, 0x3, 0x2, 0x2, 0x2, 0x36, 0x124, 0x3, 0x2, 0x2, 0x2, 
    0x38, 0x126, 0x3, 0x2, 0x2, 0x2, 0x3a, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x3c, 
    0x136, 0x3, 0x2, 0x2, 0x2, 0x3e, 0x177, 0x3, 0x2, 0x2, 0x2, 0x40, 0x17a, 
    0x3, 0x2, 0x2, 0x2, 0x42, 0x18b, 0x3, 0x2, 0x2, 0x2, 0x44, 0x199, 0x3, 
    0x2, 0x2, 0x2, 0x46, 0x19d, 0x3, 0x2, 0x2, 0x2, 0x48, 0x19f, 0x3, 0x2, 
    0x2, 0x2, 0x4a, 0x1a4, 0x3, 0x2, 0x2, 0x2, 0x4c, 0x1a8, 0x3, 0x2, 0x2, 
    0x2, 0x4e, 0x1c2, 0x3, 0x2, 0x2, 0x2, 0x50, 0x1cb, 0x3, 0x2, 0x2, 0x2, 
    0x52, 0x218, 0x3, 0x2, 0x2, 0x2, 0x54, 0x21a, 0x3, 0x2, 0x2, 0x2, 0x56, 
    0x225, 0x3, 0x2, 0x2, 0x2, 0x58, 0x22e, 0x3, 0x2, 0x2, 0x2, 0x5a, 0x236, 
    0x3, 0x2, 0x2, 0x2, 0x5c, 0x238, 0x3, 0x2, 0x2, 0x2, 0x5e, 0x241, 0x3, 
    0x2, 0x2, 0x2, 0x60, 0x243, 0x3, 0x2, 0x2, 0x2, 0x62, 0x63, 0x7, 0xb, 
    0x2, 0x2, 0x63, 0x66, 0x7, 0x72, 0x2, 0x2, 0x64, 0x65, 0x7, 0x13, 0x2, 
    0x2, 0x65, 0x67, 0x5, 0x56, 0x2c, 0x2, 0x66, 0x64, 0x3, 0x2, 0x2, 0x2, 
    0x66, 0x67, 0x3, 0x2, 0x2, 0x2, 0x67, 0x6a, 0x3, 0x2, 0x2, 0x2, 0x68, 
    0x69, 0x7, 0x1a, 0x2, 0x2, 0x69, 0x6b, 0x5, 0x54, 0x2b, 0x2, 0x6a, 0x68, 
    0x3, 0x2, 0x2, 0x2, 0x6a, 0x6b, 0x3, 0x2, 0x2, 0x2, 0x6b, 0x6c, 0x3, 
    0x2, 0x2, 0x2, 0x6c, 0x6d, 0x5, 0x4, 0x3, 0x2, 0x6d, 0x3, 0x3, 0x2, 
    0x2, 0x2, 0x6e, 0x72, 0x7, 0x42, 0x2, 0x2, 0x6f, 0x71, 0x5, 0x6, 0x4, 
    0x2, 0x70, 0x6f, 0x3, 0x2, 0x2, 0x2, 0x71, 0x74, 0x3, 0x2, 0x2, 0x2, 
    0x72, 0x70, 0x3, 0x2, 0x2, 0x2, 0x72, 0x73, 0x3, 0x2, 0x2, 0x2, 0x73, 
    0x75, 0x3, 0x2, 0x2, 0x2, 0x74, 0x72, 0x3, 0x2, 0x2, 0x2, 0x75, 0x76, 
    0x7, 0x43, 0x2, 0x2, 0x76, 0x5, 0x3, 0x2, 0x2, 0x2, 0x77, 0x7a, 0x7, 
    0x46, 0x2, 0x2, 0x78, 0x7a, 0x5, 0x8, 0x5, 0x2, 0x79, 0x77, 0x3, 0x2, 
    0x2, 0x2, 0x79, 0x78, 0x3, 0x2, 0x2, 0x2, 0x7a, 0x7, 0x3, 0x2, 0x2, 
    0x2, 0x7b, 0x7e, 0x5, 0xa, 0x6, 0x2, 0x7c, 0x7e, 0x5, 0x1e, 0x10, 0x2, 
    0x7d, 0x7b, 0x3, 0x2, 0x2, 0x2, 0x7d, 0x7c, 0x3, 0x2, 0x2, 0x2, 0x7e, 
    0x9, 0x3, 0x2, 0x2, 0x2, 0x7f, 0x81, 0x5, 0xe, 0x8, 0x2, 0x80, 0x7f, 
    0x3, 0x2, 0x2, 0x2, 0x80, 0x81, 0x3, 0x2, 0x2, 0x2, 0x81, 0x82, 0x3, 
    0x2, 0x2, 0x2, 0x82, 0x83, 0x7, 0x72, 0x2, 0x2, 0x83, 0x88, 0x5, 0x12, 
    0xa, 0x2, 0x84, 0x85, 0x7, 0x44, 0x2, 0x2, 0x85, 0x87, 0x7, 0x45, 0x2, 
    0x2, 0x86, 0x84, 0x3, 0x2, 0x2, 0x2, 0x87, 0x8a, 0x3, 0x2, 0x2, 0x2, 
    0x88, 0x86, 0x3, 0x2, 0x2, 0x2, 0x88, 0x89, 0x3, 0x2, 0x2, 0x2, 0x89, 
    0x8d, 0x3, 0x2, 0x2, 0x2, 0x8a, 0x88, 0x3, 0x2, 0x2, 0x2, 0x8b, 0x8c, 
    0x7, 0x2f, 0x2, 0x2, 0x8c, 0x8e, 0x5, 0x10, 0x9, 0x2, 0x8d, 0x8b, 0x3, 
    0x2, 0x2, 0x2, 0x8d, 0x8e, 0x3, 0x2, 0x2, 0x2, 0x8e, 0x8f, 0x3, 0x2, 
    0x2, 0x2, 0x8f, 0x90, 0x5, 0xc, 0x7, 0x2, 0x90, 0xb, 0x3, 0x2, 0x2, 
    0x2, 0x91, 0x94, 0x5, 0x38, 0x1d, 0x2, 0x92, 0x94, 0x7, 0x46, 0x2, 0x2, 
    0x93, 0x91, 0x3, 0x2, 0x2, 0x2, 0x93, 0x92, 0x3, 0x2, 0x2, 0x2, 0x94, 
    0xd, 0x3, 0x2, 0x2, 0x2, 0x95, 0x98, 0x5, 0x56, 0x2c, 0x2, 0x96, 0x98, 
    0x7, 0x32, 0x2, 0x2, 0x97, 0x95, 0x3, 0x2, 0x2, 0x2, 0x97, 0x96, 0x3, 
    0x2, 0x2, 0x2, 0x98, 0xf, 0x3, 0x2, 0x2, 0x2, 0x99, 0x9e, 0x5, 0x1c, 
    0xf, 0x2, 0x9a, 0x9b, 0x7, 0x47, 0x2, 0x2, 0x9b, 0x9d, 0x5, 0x1c, 0xf, 
    0x2, 0x9c, 0x9a, 0x3, 0x2, 0x2, 0x2, 0x9d, 0xa0, 0x3, 0x2, 0x2, 0x2, 
    0x9e, 0x9c, 0x3, 0x2, 0x2, 0x2, 0x9e, 0x9f, 0x3, 0x2, 0x2, 0x2, 0x9f, 
    0x11, 0x3, 0x2, 0x2, 0x2, 0xa0, 0x9e, 0x3, 0x2, 0x2, 0x2, 0xa1, 0xa3, 
    0x7, 0x40, 0x2, 0x2, 0xa2, 0xa4, 0x5, 0x14, 0xb, 0x2, 0xa3, 0xa2, 0x3, 
    0x2, 0x2, 0x2, 0xa3, 0xa4, 0x3, 0x2, 0x2, 0x2, 0xa4, 0xa5, 0x3, 0x2, 
    0x2, 0x2, 0xa5, 0xa6, 0x7, 0x41, 0x2, 0x2, 0xa6, 0x13, 0x3, 0x2, 0x2, 
    0x2, 0xa7, 0xac, 0x5, 0x16, 0xc, 0x2, 0xa8, 0xa9, 0x7, 0x47, 0x2, 0x2, 
    0xa9, 0xab, 0x5, 0x16, 0xc, 0x2, 0xaa, 0xa8, 0x3, 0x2, 0x2, 0x2, 0xab, 
    0xae, 0x3, 0x2, 0x2, 0x2, 0xac, 0xaa, 0x3, 0x2, 0x2, 0x2, 0xac, 0xad, 
    0x3, 0x2, 0x2, 0x2, 0xad, 0xb1, 0x3, 0x2, 0x2, 0x2, 0xae, 0xac, 0x3, 
    0x2, 0x2, 0x2, 0xaf, 0xb0, 0x7, 0x47, 0x2, 0x2, 0xb0, 0xb2, 0x5, 0x18, 
    0xd, 0x2, 0xb1, 0xaf, 0x3, 0x2, 0x2, 0x2, 0xb1, 0xb2, 0x3, 0x2, 0x2, 
    0x2, 0xb2, 0xb5, 0x3, 0x2, 0x2, 0x2, 0xb3, 0xb5, 0x5, 0x18, 0xd, 0x2, 
    0xb4, 0xa7, 0x3, 0x2, 0x2, 0x2, 0xb4, 0xb3, 0x3, 0x2, 0x2, 0x2, 0xb5, 
    0x15, 0x3, 0x2, 0x2, 0x2, 0xb6, 0xb8, 0x5, 0x1a, 0xe, 0x2, 0xb7, 0xb6, 
    0x3, 0x2, 0x2, 0x2, 0xb8, 0xbb, 0x3, 0x2, 0x2, 0x2, 0xb9, 0xb7, 0x3, 
    0x2, 0x2, 0x2, 0xb9, 0xba, 0x3, 0x2, 0x2, 0x2, 0xba, 0xbc, 0x3, 0x2, 
    0x2, 0x2, 0xbb, 0xb9, 0x3, 0x2, 0x2, 0x2, 0xbc, 0xbd, 0x5, 0x56, 0x2c, 
    0x2, 0xbd, 0xbe, 0x5, 0x26, 0x14, 0x2, 0xbe, 0x17, 0x3, 0x2, 0x2, 0x2, 
    0xbf, 0xc1, 0x5, 0x1a, 0xe, 0x2, 0xc0, 0xbf, 0x3, 0x2, 0x2, 0x2, 0xc1, 
    0xc4, 0x3, 0x2, 0x2, 0x2, 0xc2, 0xc0, 0x3, 0x2, 0x2, 0x2, 0xc2, 0xc3, 
    0x3, 0x2, 0x2, 0x2, 0xc3, 0xc5, 0x3, 0x2, 0x2, 0x2, 0xc4, 0xc2, 0x3, 
    0x2, 0x2, 0x2, 0xc5, 0xc6, 0x5, 0x56, 0x2c, 0x2, 0xc6, 0xc7, 0x7, 0x6e, 
    0x2, 0x2, 0xc7, 0xc8, 0x5, 0x26, 0x14, 0x2, 0xc8, 0x19, 0x3, 0x2, 0x2, 
    0x2, 0xc9, 0xca, 0x7, 0x14, 0x2, 0x2, 0xca, 0x1b, 0x3, 0x2, 0x2, 0x2, 
    0xcb, 0xd0, 0x7, 0x72, 0x2, 0x2, 0xcc, 0xcd, 0x7, 0x48, 0x2, 0x2, 0xcd, 
    0xcf, 0x7, 0x72, 0x2, 0x2, 0xce, 0xcc, 0x3, 0x2, 0x2, 0x2, 0xcf, 0xd2, 
    0x3, 0x2, 0x2, 0x2, 0xd0, 0xce, 0x3, 0x2, 0x2, 0x2, 0xd0, 0xd1, 0x3, 
    0x2, 0x2, 0x2, 0xd1, 0x1d, 0x3, 0x2, 0x2, 0x2, 0xd2, 0xd0, 0x3, 0x2, 
    0x2, 0x2, 0xd3, 0xd4, 0x5, 0x22, 0x12, 0x2, 0xd4, 0xd5, 0x7, 0x46, 0x2, 
    0x2, 0xd5, 0x1f, 0x3, 0x2, 0x2, 0x2, 0xd6, 0xd7, 0x7, 0x72, 0x2, 0x2, 
    0xd7, 0xda, 0x5, 0x12, 0xa, 0x2, 0xd8, 0xd9, 0x7, 0x2f, 0x2, 0x2, 0xd9, 
    0xdb, 0x5, 0x10, 0x9, 0x2, 0xda, 0xd8, 0x3, 0x2, 0x2, 0x2, 0xda, 0xdb, 
    0x3, 0x2, 0x2, 0x2, 0xdb, 0xdc, 0x3, 0x2, 0x2, 0x2, 0xdc, 0xdd, 0x5, 
    0x38, 0x1d, 0x2, 0xdd, 0x21, 0x3, 0x2, 0x2, 0x2, 0xde, 0xdf, 0x5, 0x56, 
    0x2c, 0x2, 0xdf, 0xe4, 0x5, 0x24, 0x13, 0x2, 0xe0, 0xe1, 0x7, 0x47, 
    0x2, 0x2, 0xe1, 0xe3, 0x5, 0x24, 0x13, 0x2, 0xe2, 0xe0, 0x3, 0x2, 0x2, 
    0x2, 0xe3, 0xe6, 0x3, 0x2, 0x2, 0x2, 0xe4, 0xe2, 0x3, 0x2, 0x2, 0x2, 
    0xe4, 0xe5, 0x3, 0x2, 0x2, 0x2, 0xe5, 0x23, 0x3, 0x2, 0x2, 0x2, 0xe6, 
    0xe4, 0x3, 0x2, 0x2, 0x2, 0xe7, 0xea, 0x5, 0x26, 0x14, 0x2, 0xe8, 0xe9, 
    0x7, 0x49, 0x2, 0x2, 0xe9, 0xeb, 0x5, 0x28, 0x15, 0x2, 0xea, 0xe8, 0x3, 
    0x2, 0x2, 0x2, 0xea, 0xeb, 0x3, 0x2, 0x2, 0x2, 0xeb, 0x25, 0x3, 0x2, 
    0x2, 0x2, 0xec, 0xf1, 0x7, 0x72, 0x2, 0x2, 0xed, 0xee, 0x7, 0x44, 0x2, 
    0x2, 0xee, 0xf0, 0x7, 0x45, 0x2, 0x2, 0xef, 0xed, 0x3, 0x2, 0x2, 0x2, 
    0xf0, 0xf3, 0x3, 0x2, 0x2, 0x2, 0xf1, 0xef, 0x3, 0x2, 0x2, 0x2, 0xf1, 
    0xf2, 0x3, 0x2, 0x2, 0x2, 0xf2, 0x27, 0x3, 0x2, 0x2, 0x2, 0xf3, 0xf1, 
    0x3, 0x2, 0x2, 0x2, 0xf4, 0xf7, 0x5, 0x2a, 0x16, 0x2, 0xf5, 0xf7, 0x5, 
    0x50, 0x29, 0x2, 0xf6, 0xf4, 0x3, 0x2, 0x2, 0x2, 0xf6, 0xf5, 0x3, 0x2, 
    0x2, 0x2, 0xf7, 0x29, 0x3, 0x2, 0x2, 0x2, 0xf8, 0x104, 0x7, 0x42, 0x2, 
    0x2, 0xf9, 0xfe, 0x5, 0x28, 0x15, 0x2, 0xfa, 0xfb, 0x7, 0x47, 0x2, 0x2, 
    0xfb, 0xfd, 0x5, 0x28, 0x15, 0x2, 0xfc, 0xfa, 0x3, 0x2, 0x2, 0x2, 0xfd, 
    0x100, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xfc, 0x3, 0x2, 0x2, 0x2, 0xfe, 0xff, 
    0x3, 0x2, 0x2, 0x2, 0xff, 0x102, 0x3, 0x2, 0x2, 0x2, 0x100, 0xfe, 0x3, 
    0x2, 0x2, 0x2, 0x101, 0x103, 0x7, 0x47, 0x2, 0x2, 0x102, 0x101, 0x3, 
    0x2, 0x2, 0x2, 0x102, 0x103, 0x3, 0x2, 0x2, 0x2, 0x103, 0x105, 0x3, 
    0x2, 0x2, 0x2, 0x104, 0xf9, 0x3, 0x2, 0x2, 0x2, 0x104, 0x105, 0x3, 0x2, 
    0x2, 0x2, 0x105, 0x106, 0x3, 0x2, 0x2, 0x2, 0x106, 0x107, 0x7, 0x43, 
    0x2, 0x2, 0x107, 0x2b, 0x3, 0x2, 0x2, 0x2, 0x108, 0x10d, 0x7, 0x72, 
    0x2, 0x2, 0x109, 0x10a, 0x7, 0x48, 0x2, 0x2, 0x10a, 0x10c, 0x7, 0x72, 
    0x2, 0x2, 0x10b, 0x109, 0x3, 0x2, 0x2, 0x2, 0x10c, 0x10f, 0x3, 0x2, 
    0x2, 0x2, 0x10d, 0x10b, 0x3, 0x2, 0x2, 0x2, 0x10d, 0x10e, 0x3, 0x2, 
    0x2, 0x2, 0x10e, 0x2d, 0x3, 0x2, 0x2, 0x2, 0x10f, 0x10d, 0x3, 0x2, 0x2, 
    0x2, 0x110, 0x117, 0x5, 0x56, 0x2c, 0x2, 0x111, 0x114, 0x7, 0x4e, 0x2, 
    0x2, 0x112, 0x113, 0x9, 0x2, 0x2, 0x2, 0x113, 0x115, 0x5, 0x56, 0x2c, 
    0x2, 0x114, 0x112, 0x3, 0x2, 0x2, 0x2, 0x114, 0x115, 0x3, 0x2, 0x2, 
    0x2, 0x115, 0x117, 0x3, 0x2, 0x2, 0x2, 0x116, 0x110, 0x3, 0x2, 0x2, 
    0x2, 0x116, 0x111, 0x3, 0x2, 0x2, 0x2, 0x117, 0x2f, 0x3, 0x2, 0x2, 0x2, 
    0x118, 0x11f, 0x5, 0x32, 0x1a, 0x2, 0x119, 0x11f, 0x5, 0x34, 0x1b, 0x2, 
    0x11a, 0x11f, 0x7, 0x3d, 0x2, 0x2, 0x11b, 0x11f, 0x7, 0x3e, 0x2, 0x2, 
    0x11c, 0x11f, 0x7, 0x3c, 0x2, 0x2, 0x11d, 0x11f, 0x7, 0x3f, 0x2, 0x2, 
    0x11e, 0x118, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x119, 0x3, 0x2, 0x2, 0x2, 
    0x11e, 0x11a, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11b, 0x3, 0x2, 0x2, 0x2, 
    0x11e, 0x11c, 0x3, 0x2, 0x2, 0x2, 0x11e, 0x11d, 0x3, 0x2, 0x2, 0x2, 
    0x11f, 0x31, 0x3, 0x2, 0x2, 0x2, 0x120, 0x121, 0x9, 0x3, 0x2, 0x2, 0x121, 
    0x33, 0x3, 0x2, 0x2, 0x2, 0x122, 0x123, 0x9, 0x4, 0x2, 0x2, 0x123, 0x35, 
    0x3, 0x2, 0x2, 0x2, 0x124, 0x125, 0x5, 0x3a, 0x1e, 0x2, 0x125, 0x37, 
    0x3, 0x2, 0x2, 0x2, 0x126, 0x127, 0x7, 0x42, 0x2, 0x2, 0x127, 0x128, 
    0x5, 0x3a, 0x1e, 0x2, 0x128, 0x129, 0x7, 0x43, 0x2, 0x2, 0x129, 0x39, 
    0x3, 0x2, 0x2, 0x2, 0x12a, 0x12c, 0x5, 0x3c, 0x1f, 0x2, 0x12b, 0x12a, 
    0x3, 0x2, 0x2, 0x2, 0x12c, 0x12f, 0x3, 0x2, 0x2, 0x2, 0x12d, 0x12b, 
    0x3, 0x2, 0x2, 0x2, 0x12d, 0x12e, 0x3, 0x2, 0x2, 0x2, 0x12e, 0x3b, 0x3, 
    0x2, 0x2, 0x2, 0x12f, 0x12d, 0x3, 0x2, 0x2, 0x2, 0x130, 0x131, 0x5, 
    0x22, 0x12, 0x2, 0x131, 0x132, 0x7, 0x46, 0x2, 0x2, 0x132, 0x137, 0x3, 
    0x2, 0x2, 0x2, 0x133, 0x137, 0x5, 0x3e, 0x20, 0x2, 0x134, 0x137, 0x5, 
    0xa, 0x6, 0x2, 0x135, 0x137, 0x5, 0x2, 0x2, 0x2, 0x136, 0x130, 0x3, 
    0x2, 0x2, 0x2, 0x136, 0x133, 0x3, 0x2, 0x2, 0x2, 0x136, 0x134, 0x3, 
    0x2, 0x2, 0x2, 0x136, 0x135, 0x3, 0x2, 0x2, 0x2, 0x137, 0x3d, 0x3, 0x2, 
    0x2, 0x2, 0x138, 0x178, 0x5, 0x38, 0x1d, 0x2, 0x139, 0x13a, 0x7, 0x18, 
    0x2, 0x2, 0x13a, 0x13b, 0x5, 0x4a, 0x26, 0x2, 0x13b, 0x13e, 0x5, 0x3e, 
    0x20, 0x2, 0x13c, 0x13d, 0x7, 0x11, 0x2, 0x2, 0x13d, 0x13f, 0x5, 0x3e, 
    0x20, 0x2, 0x13e, 0x13c, 0x3, 0x2, 0x2, 0x2, 0x13e, 0x13f, 0x3, 0x2, 
    0x2, 0x2, 0x13f, 0x178, 0x3, 0x2, 0x2, 0x2, 0x140, 0x141, 0x7, 0x17, 
    0x2, 0x2, 0x141, 0x142, 0x7, 0x40, 0x2, 0x2, 0x142, 0x143, 0x5, 0x44, 
    0x23, 0x2, 0x143, 0x144, 0x7, 0x41, 0x2, 0x2, 0x144, 0x145, 0x5, 0x3e, 
    0x20, 0x2, 0x145, 0x178, 0x3, 0x2, 0x2, 0x2, 0x146, 0x147, 0x7, 0x34, 
    0x2, 0x2, 0x147, 0x148, 0x5, 0x4a, 0x26, 0x2, 0x148, 0x149, 0x5, 0x3e, 
    0x20, 0x2, 0x149, 0x178, 0x3, 0x2, 0x2, 0x2, 0x14a, 0x14b, 0x7, 0xf, 
    0x2, 0x2, 0x14b, 0x14c, 0x5, 0x3e, 0x20, 0x2, 0x14c, 0x14d, 0x7, 0x34, 
    0x2, 0x2, 0x14d, 0x14e, 0x5, 0x4a, 0x26, 0x2, 0x14e, 0x14f, 0x7, 0x46, 
    0x2, 0x2, 0x14f, 0x178, 0x3, 0x2, 0x2, 0x2, 0x150, 0x151, 0x7, 0x2b, 
    0x2, 0x2, 0x151, 0x152, 0x5, 0x4a, 0x26, 0x2, 0x152, 0x156, 0x7, 0x42, 
    0x2, 0x2, 0x153, 0x155, 0x5, 0x40, 0x21, 0x2, 0x154, 0x153, 0x3, 0x2, 
    0x2, 0x2, 0x155, 0x158, 0x3, 0x2, 0x2, 0x2, 0x156, 0x154, 0x3, 0x2, 
    0x2, 0x2, 0x156, 0x157, 0x3, 0x2, 0x2, 0x2, 0x157, 0x15c, 0x3, 0x2, 
    0x2, 0x2, 0x158, 0x156, 0x3, 0x2, 0x2, 0x2, 0x159, 0x15b, 0x5, 0x42, 
    0x22, 0x2, 0x15a, 0x159, 0x3, 0x2, 0x2, 0x2, 0x15b, 0x15e, 0x3, 0x2, 
    0x2, 0x2, 0x15c, 0x15a, 0x3, 0x2, 0x2, 0x2, 0x15c, 0x15d, 0x3, 0x2, 
    0x2, 0x2, 0x15d, 0x15f, 0x3, 0x2, 0x2, 0x2, 0x15e, 0x15c, 0x3, 0x2, 
    0x2, 0x2, 0x15f, 0x160, 0x7, 0x43, 0x2, 0x2, 0x160, 0x178, 0x3, 0x2, 
    0x2, 0x2, 0x161, 0x163, 0x7, 0x26, 0x2, 0x2, 0x162, 0x164, 0x5, 0x50, 
    0x29, 0x2, 0x163, 0x162, 0x3, 0x2, 0x2, 0x2, 0x163, 0x164, 0x3, 0x2, 
    0x2, 0x2, 0x164, 0x165, 0x3, 0x2, 0x2, 0x2, 0x165, 0x178, 0x7, 0x46, 
    0x2, 0x2, 0x166, 0x168, 0x7, 0x6, 0x2, 0x2, 0x167, 0x169, 0x7, 0x72, 
    0x2, 0x2, 0x168, 0x167, 0x3, 0x2, 0x2, 0x2, 0x168, 0x169, 0x3, 0x2, 
    0x2, 0x2, 0x169, 0x16a, 0x3, 0x2, 0x2, 0x2, 0x16a, 0x178, 0x7, 0x46, 
    0x2, 0x2, 0x16b, 0x16d, 0x7, 0xd, 0x2, 0x2, 0x16c, 0x16e, 0x7, 0x72, 
    0x2, 0x2, 0x16d, 0x16c, 0x3, 0x2, 0x2, 0x2, 0x16d, 0x16e, 0x3, 0x2, 
    0x2, 0x2, 0x16e, 0x16f, 0x3, 0x2, 0x2, 0x2, 0x16f, 0x178, 0x7, 0x46, 
    0x2, 0x2, 0x170, 0x178, 0x7, 0x46, 0x2, 0x2, 0x171, 0x172, 0x5, 0x50, 
    0x29, 0x2, 0x172, 0x173, 0x7, 0x46, 0x2, 0x2, 0x173, 0x178, 0x3, 0x2, 
    0x2, 0x2, 0x174, 0x175, 0x7, 0x72, 0x2, 0x2, 0x175, 0x176, 0x7, 0x4f, 
    0x2, 0x2, 0x176, 0x178, 0x5, 0x3e, 0x20, 0x2, 0x177, 0x138, 0x3, 0x2, 
    0x2, 0x2, 0x177, 0x139, 0x3, 0x2, 0x2, 0x2, 0x177, 0x140, 0x3, 0x2, 
    0x2, 0x2, 0x177, 0x146, 0x3, 0x2, 0x2, 0x2, 0x177, 0x14a, 0x3, 0x2, 
    0x2, 0x2, 0x177, 0x150, 0x3, 0x2, 0x2, 0x2, 0x177, 0x161, 0x3, 0x2, 
    0x2, 0x2, 0x177, 0x166, 0x3, 0x2, 0x2, 0x2, 0x177, 0x16b, 0x3, 0x2, 
    0x2, 0x2, 0x177, 0x170, 0x3, 0x2, 0x2, 0x2, 0x177, 0x171, 0x3, 0x2, 
    0x2, 0x2, 0x177, 0x174, 0x3, 0x2, 0x2, 0x2, 0x178, 0x3f, 0x3, 0x2, 0x2, 
    0x2, 0x179, 0x17b, 0x5, 0x42, 0x22, 0x2, 0x17a, 0x179, 0x3, 0x2, 0x2, 
    0x2, 0x17b, 0x17c, 0x3, 0x2, 0x2, 0x2, 0x17c, 0x17a, 0x3, 0x2, 0x2, 
    0x2, 0x17c, 0x17d, 0x3, 0x2, 0x2, 0x2, 0x17d, 0x17f, 0x3, 0x2, 0x2, 
    0x2, 0x17e, 0x180, 0x5, 0x3c, 0x1f, 0x2, 0x17f, 0x17e, 0x3, 0x2, 0x2, 
    0x2, 0x180, 0x181, 0x3, 0x2, 0x2, 0x2, 0x181, 0x17f, 0x3, 0x2, 0x2, 
    0x2, 0x181, 0x182, 0x3, 0x2, 0x2, 0x2, 0x182, 0x41, 0x3, 0x2, 0x2, 0x2, 
    0x183, 0x186, 0x7, 0x8, 0x2, 0x2, 0x184, 0x187, 0x5, 0x50, 0x29, 0x2, 
    0x185, 0x187, 0x7, 0x72, 0x2, 0x2, 0x186, 0x184, 0x3, 0x2, 0x2, 0x2, 
    0x186, 0x185, 0x3, 0x2, 0x2, 0x2, 0x187, 0x188, 0x3, 0x2, 0x2, 0x2, 
    0x188, 0x18c, 0x7, 0x4f, 0x2, 0x2, 0x189, 0x18a, 0x7, 0xe, 0x2, 0x2, 
    0x18a, 0x18c, 0x7, 0x4f, 0x2, 0x2, 0x18b, 0x183, 0x3, 0x2, 0x2, 0x2, 
    0x18b, 0x189, 0x3, 0x2, 0x2, 0x2, 0x18c, 0x43, 0x3, 0x2, 0x2, 0x2, 0x18d, 
    0x19a, 0x5, 0x48, 0x25, 0x2, 0x18e, 0x190, 0x5, 0x46, 0x24, 0x2, 0x18f, 
    0x18e, 0x3, 0x2, 0x2, 0x2, 0x18f, 0x190, 0x3, 0x2, 0x2, 0x2, 0x190, 
    0x191, 0x3, 0x2, 0x2, 0x2, 0x191, 0x193, 0x7, 0x46, 0x2, 0x2, 0x192, 
    0x194, 0x5, 0x50, 0x29, 0x2, 0x193, 0x192, 0x3, 0x2, 0x2, 0x2, 0x193, 
    0x194, 0x3, 0x2, 0x2, 0x2, 0x194, 0x195, 0x3, 0x2, 0x2, 0x2, 0x195, 
    0x197, 0x7, 0x46, 0x2, 0x2, 0x196, 0x198, 0x5, 0x4c, 0x27, 0x2, 0x197, 
    0x196, 0x3, 0x2, 0x2, 0x2, 0x197, 0x198, 0x3, 0x2, 0x2, 0x2, 0x198, 
    0x19a, 0x3, 0x2, 0x2, 0x2, 0x199, 0x18d, 0x3, 0x2, 0x2, 0x2, 0x199, 
    0x18f, 0x3, 0x2, 0x2, 0x2, 0x19a, 0x45, 0x3, 0x2, 0x2, 0x2, 0x19b, 0x19e, 
    0x5, 0x22, 0x12, 0x2, 0x19c, 0x19e, 0x5, 0x4c, 0x27, 0x2, 0x19d, 0x19b, 
    0x3, 0x2, 0x2, 0x2, 0x19d, 0x19c, 0x3, 0x2, 0x2, 0x2, 0x19e, 0x47, 0x3, 
    0x2, 0x2, 0x2, 0x19f, 0x1a0, 0x5, 0x56, 0x2c, 0x2, 0x1a0, 0x1a1, 0x5, 
    0x26, 0x14, 0x2, 0x1a1, 0x1a2, 0x7, 0x4f, 0x2, 0x2, 0x1a2, 0x1a3, 0x5, 
    0x50, 0x29, 0x2, 0x1a3, 0x49, 0x3, 0x2, 0x2, 0x2, 0x1a4, 0x1a5, 0x7, 
    0x40, 0x2, 0x2, 0x1a5, 0x1a6, 0x5, 0x50, 0x29, 0x2, 0x1a6, 0x1a7, 0x7, 
    0x41, 0x2, 0x2, 0x1a7, 0x4b, 0x3, 0x2, 0x2, 0x2, 0x1a8, 0x1ad, 0x5, 
    0x50, 0x29, 0x2, 0x1a9, 0x1aa, 0x7, 0x47, 0x2, 0x2, 0x1aa, 0x1ac, 0x5, 
    0x50, 0x29, 0x2, 0x1ab, 0x1a9, 0x3, 0x2, 0x2, 0x2, 0x1ac, 0x1af, 0x3, 
    0x2, 0x2, 0x2, 0x1ad, 0x1ab, 0x3, 0x2, 0x2, 0x2, 0x1ad, 0x1ae, 0x3, 
    0x2, 0x2, 0x2, 0x1ae, 0x4d, 0x3, 0x2, 0x2, 0x2, 0x1af, 0x1ad, 0x3, 0x2, 
    0x2, 0x2, 0x1b0, 0x1b1, 0x7, 0x72, 0x2, 0x2, 0x1b1, 0x1b3, 0x7, 0x40, 
    0x2, 0x2, 0x1b2, 0x1b4, 0x5, 0x4c, 0x27, 0x2, 0x1b3, 0x1b2, 0x3, 0x2, 
    0x2, 0x2, 0x1b3, 0x1b4, 0x3, 0x2, 0x2, 0x2, 0x1b4, 0x1b5, 0x3, 0x2, 
    0x2, 0x2, 0x1b5, 0x1c3, 0x7, 0x41, 0x2, 0x2, 0x1b6, 0x1b7, 0x7, 0x2d, 
    0x2, 0x2, 0x1b7, 0x1b9, 0x7, 0x40, 0x2, 0x2, 0x1b8, 0x1ba, 0x5, 0x4c, 
    0x27, 0x2, 0x1b9, 0x1b8, 0x3, 0x2, 0x2, 0x2, 0x1b9, 0x1ba, 0x3, 0x2, 
    0x2, 0x2, 0x1ba, 0x1bb, 0x3, 0x2, 0x2, 0x2, 0x1bb, 0x1c3, 0x7, 0x41, 
    0x2, 0x2, 0x1bc, 0x1bd, 0x7, 0x2a, 0x2, 0x2, 0x1bd, 0x1bf, 0x7, 0x40, 
    0x2, 0x2, 0x1be, 0x1c0, 0x5, 0x4c, 0x27, 0x2, 0x1bf, 0x1be, 0x3, 0x2, 
    0x2, 0x2, 0x1bf, 0x1c0, 0x3, 0x2, 0x2, 0x2, 0x1c0, 0x1c1, 0x3, 0x2, 
    0x2, 0x2, 0x1c1, 0x1c3, 0x7, 0x41, 0x2, 0x2, 0x1c2, 0x1b0, 0x3, 0x2, 
    0x2, 0x2, 0x1c2, 0x1b6, 0x3, 0x2, 0x2, 0x2, 0x1c2, 0x1bc, 0x3, 0x2, 
    0x2, 0x2, 0x1c3, 0x4f, 0x3, 0x2, 0x2, 0x2, 0x1c4, 0x1c5, 0x8, 0x29, 
    0x1, 0x2, 0x1c5, 0x1cc, 0x5, 0x52, 0x2a, 0x2, 0x1c6, 0x1cc, 0x5, 0x4e, 
    0x28, 0x2, 0x1c7, 0x1c8, 0x9, 0x5, 0x2, 0x2, 0x1c8, 0x1cc, 0x5, 0x50, 
    0x29, 0x11, 0x1c9, 0x1ca, 0x9, 0x6, 0x2, 0x2, 0x1ca, 0x1cc, 0x5, 0x50, 
    0x29, 0x10, 0x1cb, 0x1c4, 0x3, 0x2, 0x2, 0x2, 0x1cb, 0x1c6, 0x3, 0x2, 
    0x2, 0x2, 0x1cb, 0x1c7, 0x3, 0x2, 0x2, 0x2, 0x1cb, 0x1c9, 0x3, 0x2, 
    0x2, 0x2, 0x1cc, 0x20e, 0x3, 0x2, 0x2, 0x2, 0x1cd, 0x1ce, 0xc, 0xf, 
    0x2, 0x2, 0x1ce, 0x1cf, 0x9, 0x7, 0x2, 0x2, 0x1cf, 0x20d, 0x5, 0x50, 
    0x29, 0x10, 0x1d0, 0x1d1, 0xc, 0xe, 0x2, 0x2, 0x1d1, 0x1d2, 0x9, 0x8, 
    0x2, 0x2, 0x1d2, 0x20d, 0x5, 0x50, 0x29, 0xf, 0x1d3, 0x1db, 0xc, 0xd, 
    0x2, 0x2, 0x1d4, 0x1d5, 0x7, 0x4b, 0x2, 0x2, 0x1d5, 0x1dc, 0x7, 0x4b, 
    0x2, 0x2, 0x1d6, 0x1d7, 0x7, 0x4a, 0x2, 0x2, 0x1d7, 0x1d8, 0x7, 0x4a, 
    0x2, 0x2, 0x1d8, 0x1dc, 0x7, 0x4a, 0x2, 0x2, 0x1d9, 0x1da, 0x7, 0x4a, 
    0x2, 0x2, 0x1da, 0x1dc, 0x7, 0x4a, 0x2, 0x2, 0x1db, 0x1d4, 0x3, 0x2, 
    0x2, 0x2, 0x1db, 0x1d6, 0x3, 0x2, 0x2, 0x2, 0x1db, 0x1d9, 0x3, 0x2, 
    0x2, 0x2, 0x1dc, 0x1dd, 0x3, 0x2, 0x2, 0x2, 0x1dd, 0x20d, 0x5, 0x50, 
    0x29, 0xe, 0x1de, 0x1df, 0xc, 0xc, 0x2, 0x2, 0x1df, 0x1e0, 0x9, 0x9, 
    0x2, 0x2, 0x1e0, 0x20d, 0x5, 0x50, 0x29, 0xd, 0x1e1, 0x1e2, 0xc, 0xa, 
    0x2, 0x2, 0x1e2, 0x1e3, 0x9, 0xa, 0x2, 0x2, 0x1e3, 0x20d, 0x5, 0x50, 
    0x29, 0xb, 0x1e4, 0x1e5, 0xc, 0x9, 0x2, 0x2, 0x1e5, 0x1e6, 0x7, 0x5c, 
    0x2, 0x2, 0x1e6, 0x20d, 0x5, 0x50, 0x29, 0xa, 0x1e7, 0x1e8, 0xc, 0x8, 
    0x2, 0x2, 0x1e8, 0x1e9, 0x7, 0x5e, 0x2, 0x2, 0x1e9, 0x20d, 0x5, 0x50, 
    0x29, 0x9, 0x1ea, 0x1eb, 0xc, 0x7, 0x2, 0x2, 0x1eb, 0x1ec, 0x7, 0x5d, 
    0x2, 0x2, 0x1ec, 0x20d, 0x5, 0x50, 0x29, 0x8, 0x1ed, 0x1ee, 0xc, 0x6, 
    0x2, 0x2, 0x1ee, 0x1ef, 0x7, 0x54, 0x2, 0x2, 0x1ef, 0x20d, 0x5, 0x50, 
    0x29, 0x7, 0x1f0, 0x1f1, 0xc, 0x5, 0x2, 0x2, 0x1f1, 0x1f2, 0x7, 0x55, 
    0x2, 0x2, 0x1f2, 0x20d, 0x5, 0x50, 0x29, 0x6, 0x1f3, 0x1f4, 0xc, 0x4, 
    0x2, 0x2, 0x1f4, 0x1f5, 0x7, 0x4e, 0x2, 0x2, 0x1f5, 0x1f6, 0x5, 0x50, 
    0x29, 0x2, 0x1f6, 0x1f7, 0x7, 0x4f, 0x2, 0x2, 0x1f7, 0x1f8, 0x5, 0x50, 
    0x29, 0x5, 0x1f8, 0x20d, 0x3, 0x2, 0x2, 0x2, 0x1f9, 0x1fa, 0xc, 0x3, 
    0x2, 0x2, 0x1fa, 0x1fb, 0x9, 0xb, 0x2, 0x2, 0x1fb, 0x20d, 0x5, 0x50, 
    0x29, 0x3, 0x1fc, 0x1fd, 0xc, 0x15, 0x2, 0x2, 0x1fd, 0x200, 0x7, 0x48, 
    0x2, 0x2, 0x1fe, 0x201, 0x7, 0x72, 0x2, 0x2, 0x1ff, 0x201, 0x5, 0x4e, 
    0x28, 0x2, 0x200, 0x1fe, 0x3, 0x2, 0x2, 0x2, 0x200, 0x1ff, 0x3, 0x2, 
    0x2, 0x2, 0x201, 0x20d, 0x3, 0x2, 0x2, 0x2, 0x202, 0x203, 0xc, 0x14, 
    0x2, 0x2, 0x203, 0x204, 0x7, 0x44, 0x2, 0x2, 0x204, 0x205, 0x5, 0x50, 
    0x29, 0x2, 0x205, 0x206, 0x7, 0x45, 0x2, 0x2, 0x206, 0x20d, 0x3, 0x2, 
    0x2, 0x2, 0x207, 0x208, 0xc, 0x12, 0x2, 0x2, 0x208, 0x20d, 0x9, 0xc, 
    0x2, 0x2, 0x209, 0x20a, 0xc, 0xb, 0x2, 0x2, 0x20a, 0x20b, 0x7, 0x1c, 
    0x2, 0x2, 0x20b, 0x20d, 0x5, 0x56, 0x2c, 0x2, 0x20c, 0x1cd, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x1d0, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x1d3, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x1de, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x1e1, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x1e4, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x1e7, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x1ea, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x1ed, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x1f0, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x1f3, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x1f9, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x1fc, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x202, 0x3, 0x2, 0x2, 0x2, 0x20c, 0x207, 0x3, 0x2, 
    0x2, 0x2, 0x20c, 0x209, 0x3, 0x2, 0x2, 0x2, 0x20d, 0x210, 0x3, 0x2, 
    0x2, 0x2, 0x20e, 0x20c, 0x3, 0x2, 0x2, 0x2, 0x20e, 0x20f, 0x3, 0x2, 
    0x2, 0x2, 0x20f, 0x51, 0x3, 0x2, 0x2, 0x2, 0x210, 0x20e, 0x3, 0x2, 0x2, 
    0x2, 0x211, 0x212, 0x7, 0x40, 0x2, 0x2, 0x212, 0x213, 0x5, 0x50, 0x29, 
    0x2, 0x213, 0x214, 0x7, 0x41, 0x2, 0x2, 0x214, 0x219, 0x3, 0x2, 0x2, 
    0x2, 0x215, 0x219, 0x7, 0x2d, 0x2, 0x2, 0x216, 0x219, 0x5, 0x30, 0x19, 
    0x2, 0x217, 0x219, 0x7, 0x72, 0x2, 0x2, 0x218, 0x211, 0x3, 0x2, 0x2, 
    0x2, 0x218, 0x215, 0x3, 0x2, 0x2, 0x2, 0x218, 0x216, 0x3, 0x2, 0x2, 
    0x2, 0x218, 0x217, 0x3, 0x2, 0x2, 0x2, 0x219, 0x53, 0x3, 0x2, 0x2, 0x2, 
    0x21a, 0x21f, 0x5, 0x56, 0x2c, 0x2, 0x21b, 0x21c, 0x7, 0x47, 0x2, 0x2, 
    0x21c, 0x21e, 0x5, 0x56, 0x2c, 0x2, 0x21d, 0x21b, 0x3, 0x2, 0x2, 0x2, 
    0x21e, 0x221, 0x3, 0x2, 0x2, 0x2, 0x21f, 0x21d, 0x3, 0x2, 0x2, 0x2, 
    0x21f, 0x220, 0x3, 0x2, 0x2, 0x2, 0x220, 0x55, 0x3, 0x2, 0x2, 0x2, 0x221, 
    0x21f, 0x3, 0x2, 0x2, 0x2, 0x222, 0x226, 0x5, 0x2c, 0x17, 0x2, 0x223, 
    0x226, 0x5, 0x58, 0x2d, 0x2, 0x224, 0x226, 0x5, 0x5a, 0x2e, 0x2, 0x225, 
    0x222, 0x3, 0x2, 0x2, 0x2, 0x225, 0x223, 0x3, 0x2, 0x2, 0x2, 0x225, 
    0x224, 0x3, 0x2, 0x2, 0x2, 0x226, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x227, 
    0x228, 0x7, 0x44, 0x2, 0x2, 0x228, 0x22a, 0x7, 0x45, 0x2, 0x2, 0x229, 
    0x227, 0x3, 0x2, 0x2, 0x2, 0x22a, 0x22d, 0x3, 0x2, 0x2, 0x2, 0x22b, 
    0x229, 0x3, 0x2, 0x2, 0x2, 0x22b, 0x22c, 0x3, 0x2, 0x2, 0x2, 0x22c, 
    0x57, 0x3, 0x2, 0x2, 0x2, 0x22d, 0x22b, 0x3, 0x2, 0x2, 0x2, 0x22e, 0x22f, 
    0x7, 0x35, 0x2, 0x2, 0x22f, 0x230, 0x5, 0xe, 0x8, 0x2, 0x230, 0x232, 
    0x7, 0x40, 0x2, 0x2, 0x231, 0x233, 0x5, 0x54, 0x2b, 0x2, 0x232, 0x231, 
    0x3, 0x2, 0x2, 0x2, 0x232, 0x233, 0x3, 0x2, 0x2, 0x2, 0x233, 0x234, 
    0x3, 0x2, 0x2, 0x2, 0x234, 0x235, 0x7, 0x41, 0x2, 0x2, 0x235, 0x59, 
    0x3, 0x2, 0x2, 0x2, 0x236, 0x237, 0x9, 0xd, 0x2, 0x2, 0x237, 0x5b, 0x3, 
    0x2, 0x2, 0x2, 0x238, 0x239, 0x7, 0x72, 0x2, 0x2, 0x239, 0x23a, 0x5, 
    0x60, 0x31, 0x2, 0x23a, 0x5d, 0x3, 0x2, 0x2, 0x2, 0x23b, 0x242, 0x5, 
    0x60, 0x31, 0x2, 0x23c, 0x23d, 0x7, 0x48, 0x2, 0x2, 0x23d, 0x23f, 0x7, 
    0x72, 0x2, 0x2, 0x23e, 0x240, 0x5, 0x60, 0x31, 0x2, 0x23f, 0x23e, 0x3, 
    0x2, 0x2, 0x2, 0x23f, 0x240, 0x3, 0x2, 0x2, 0x2, 0x240, 0x242, 0x3, 
    0x2, 0x2, 0x2, 0x241, 0x23b, 0x3, 0x2, 0x2, 0x2, 0x241, 0x23c, 0x3, 
    0x2, 0x2, 0x2, 0x242, 0x5f, 0x3, 0x2, 0x2, 0x2, 0x243, 0x245, 0x7, 0x40, 
    0x2, 0x2, 0x244, 0x246, 0x5, 0x4c, 0x27, 0x2, 0x245, 0x244, 0x3, 0x2, 
    0x2, 0x2, 0x245, 0x246, 0x3, 0x2, 0x2, 0x2, 0x246, 0x247, 0x3, 0x2, 
    0x2, 0x2, 0x247, 0x248, 0x7, 0x41, 0x2, 0x2, 0x248, 0x61, 0x3, 0x2, 
    0x2, 0x2, 0x44, 0x66, 0x6a, 0x72, 0x79, 0x7d, 0x80, 0x88, 0x8d, 0x93, 
    0x97, 0x9e, 0xa3, 0xac, 0xb1, 0xb4, 0xb9, 0xc2, 0xd0, 0xda, 0xe4, 0xea, 
    0xf1, 0xf6, 0xfe, 0x102, 0x104, 0x10d, 0x114, 0x116, 0x11e, 0x12d, 0x136, 
    0x13e, 0x156, 0x15c, 0x163, 0x168, 0x16d, 0x177, 0x17c, 0x181, 0x186, 
    0x18b, 0x18f, 0x193, 0x197, 0x199, 0x19d, 0x1ad, 0x1b3, 0x1b9, 0x1bf, 
    0x1c2, 0x1cb, 0x1db, 0x200, 0x20c, 0x20e, 0x218, 0x21f, 0x225, 0x22b, 
    0x232, 0x23f, 0x241, 0x245, 
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
