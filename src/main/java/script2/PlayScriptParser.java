// Generated from PlayScript.g4 by ANTLR 4.7.2

package script2;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSTRACT=1, ASSERT=2, BOOLEAN=3, BREAK=4, BYTE=5, CASE=6, CATCH=7, CHAR=8, 
		CLASS=9, CONST=10, CONTINUE=11, DEFAULT=12, DO=13, DOUBLE=14, ELSE=15, 
		ENUM=16, EXTENDS=17, FINAL=18, FINALLY=19, FLOAT=20, FOR=21, IF=22, GOTO=23, 
		IMPLEMENTS=24, IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, 
		NATIVE=30, NEW=31, PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, 
		SHORT=37, STATIC=38, STRICTFP=39, SUPER=40, SWITCH=41, SYNCHRONIZED=42, 
		THIS=43, THROW=44, THROWS=45, TRANSIENT=46, TRY=47, VOID=48, VOLATILE=49, 
		WHILE=50, DECIMAL_LITERAL=51, HEX_LITERAL=52, OCT_LITERAL=53, BINARY_LITERAL=54, 
		FLOAT_LITERAL=55, HEX_FLOAT_LITERAL=56, BOOL_LITERAL=57, CHAR_LITERAL=58, 
		STRING_LITERAL=59, NULL_LITERAL=60, LPAREN=61, RPAREN=62, LBRACE=63, RBRACE=64, 
		LBRACK=65, RBRACK=66, SEMI=67, COMMA=68, DOT=69, ASSIGN=70, GT=71, LT=72, 
		BANG=73, TILDE=74, QUESTION=75, COLON=76, EQUAL=77, LE=78, GE=79, NOTEQUAL=80, 
		AND=81, OR=82, INC=83, DEC=84, ADD=85, SUB=86, MUL=87, DIV=88, BITAND=89, 
		BITOR=90, CARET=91, MOD=92, ADD_ASSIGN=93, SUB_ASSIGN=94, MUL_ASSIGN=95, 
		DIV_ASSIGN=96, AND_ASSIGN=97, OR_ASSIGN=98, XOR_ASSIGN=99, MOD_ASSIGN=100, 
		LSHIFT_ASSIGN=101, RSHIFT_ASSIGN=102, URSHIFT_ASSIGN=103, ARROW=104, COLONCOLON=105, 
		AT=106, ELLIPSIS=107, WS=108, COMMENT=109, LINE_COMMENT=110, IDENTIFIER=111;
	public static final int
		RULE_variableDeclarators = 0, RULE_variableDeclarator = 1, RULE_variableDeclaratorId = 2, 
		RULE_variableInitializer = 3, RULE_arrayInitializer = 4, RULE_literal = 5, 
		RULE_integerLiteral = 6, RULE_floatLiteral = 7, RULE_block = 8, RULE_blockStatement = 9, 
		RULE_statement = 10, RULE_switchBlockStatementGroup = 11, RULE_switchLabel = 12, 
		RULE_forControl = 13, RULE_forInit = 14, RULE_enhancedForControl = 15, 
		RULE_parExpression = 16, RULE_expressionList = 17, RULE_expression = 18, 
		RULE_primary = 19, RULE_typeType = 20, RULE_primitiveType = 21, RULE_superSuffix = 22, 
		RULE_explicitGenericInvocationSuffix = 23, RULE_arguments = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"variableDeclarators", "variableDeclarator", "variableDeclaratorId", 
			"variableInitializer", "arrayInitializer", "literal", "integerLiteral", 
			"floatLiteral", "block", "blockStatement", "statement", "switchBlockStatementGroup", 
			"switchLabel", "forControl", "forInit", "enhancedForControl", "parExpression", 
			"expressionList", "expression", "primary", "typeType", "primitiveType", 
			"superSuffix", "explicitGenericInvocationSuffix", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'abstract'", "'assert'", "'boolean'", "'break'", "'byte'", "'case'", 
			"'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'static'", "'strictfp'", 
			"'super'", "'switch'", "'synchronized'", "'this'", "'throw'", "'throws'", 
			"'transient'", "'try'", "'void'", "'volatile'", "'while'", null, null, 
			null, null, null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
			"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", 
			"'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", 
			"'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", 
			"'>>='", "'>>>='", "'->'", "'::'", "'@'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
			"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
			"NEW", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", 
			"STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", 
			"THROWS", "TRANSIENT", "TRY", "VOID", "VOLATILE", "WHILE", "DECIMAL_LITERAL", 
			"HEX_LITERAL", "OCT_LITERAL", "BINARY_LITERAL", "FLOAT_LITERAL", "HEX_FLOAT_LITERAL", 
			"BOOL_LITERAL", "CHAR_LITERAL", "STRING_LITERAL", "NULL_LITERAL", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
			"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
			"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
			"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
			"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "ARROW", 
			"COLONCOLON", "AT", "ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PlayScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableDeclarators(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			variableDeclarator();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(51);
				match(COMMA);
				setState(52);
				variableDeclarator();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(PlayScriptParser.ASSIGN, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			variableDeclaratorId();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(59);
				match(ASSIGN);
				setState(60);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(PlayScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PlayScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PlayScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PlayScriptParser.RBRACK, i);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableDeclaratorId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IDENTIFIER);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(64);
				match(LBRACK);
				setState(65);
				match(RBRACK);
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitVariableInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variableInitializer);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				arrayInitializer();
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(LBRACE);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DECIMAL_LITERAL - 51)) | (1L << (HEX_LITERAL - 51)) | (1L << (OCT_LITERAL - 51)) | (1L << (BINARY_LITERAL - 51)) | (1L << (FLOAT_LITERAL - 51)) | (1L << (HEX_FLOAT_LITERAL - 51)) | (1L << (BOOL_LITERAL - 51)) | (1L << (CHAR_LITERAL - 51)) | (1L << (STRING_LITERAL - 51)) | (1L << (NULL_LITERAL - 51)) | (1L << (LPAREN - 51)) | (1L << (LBRACE - 51)) | (1L << (BANG - 51)) | (1L << (TILDE - 51)) | (1L << (INC - 51)) | (1L << (DEC - 51)) | (1L << (ADD - 51)) | (1L << (SUB - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
				{
				setState(76);
				variableInitializer();
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(77);
						match(COMMA);
						setState(78);
						variableInitializer();
						}
						} 
					}
					setState(83);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(84);
					match(COMMA);
					}
				}

				}
			}

			setState(89);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public TerminalNode CHAR_LITERAL() { return getToken(PlayScriptParser.CHAR_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(PlayScriptParser.STRING_LITERAL, 0); }
		public TerminalNode BOOL_LITERAL() { return getToken(PlayScriptParser.BOOL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(PlayScriptParser.NULL_LITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_literal);
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				integerLiteral();
				}
				break;
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				floatLiteral();
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(CHAR_LITERAL);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				match(STRING_LITERAL);
				}
				break;
			case BOOL_LITERAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				match(BOOL_LITERAL);
				}
				break;
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(NULL_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(PlayScriptParser.DECIMAL_LITERAL, 0); }
		public TerminalNode HEX_LITERAL() { return getToken(PlayScriptParser.HEX_LITERAL, 0); }
		public TerminalNode OCT_LITERAL() { return getToken(PlayScriptParser.OCT_LITERAL, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(PlayScriptParser.BINARY_LITERAL, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(PlayScriptParser.FLOAT_LITERAL, 0); }
		public TerminalNode HEX_FLOAT_LITERAL() { return getToken(PlayScriptParser.HEX_FLOAT_LITERAL, 0); }
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==FLOAT_LITERAL || _la==HEX_FLOAT_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LBRACE);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0)) {
				{
				{
				setState(104);
				blockStatement();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockStatement);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				variableDeclarators();
				setState(113);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext blockLabel;
		public ExpressionContext statementExpression;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode IF() { return getToken(PlayScriptParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PlayScriptParser.ELSE, 0); }
		public TerminalNode FOR() { return getToken(PlayScriptParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(PlayScriptParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(PlayScriptParser.DO, 0); }
		public TerminalNode SEMI() { return getToken(PlayScriptParser.SEMI, 0); }
		public TerminalNode SWITCH() { return getToken(PlayScriptParser.SWITCH, 0); }
		public TerminalNode LBRACE() { return getToken(PlayScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(PlayScriptParser.RBRACE, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(PlayScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(PlayScriptParser.BREAK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public TerminalNode CONTINUE() { return getToken(PlayScriptParser.CONTINUE, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((StatementContext)_localctx).blockLabel = block();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(IF);
				setState(120);
				parExpression();
				setState(121);
				statement();
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(122);
					match(ELSE);
					setState(123);
					statement();
					}
					break;
				}
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(FOR);
				setState(127);
				match(LPAREN);
				setState(128);
				forControl();
				setState(129);
				match(RPAREN);
				setState(130);
				statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(WHILE);
				setState(133);
				parExpression();
				setState(134);
				statement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				match(DO);
				setState(137);
				statement();
				setState(138);
				match(WHILE);
				setState(139);
				parExpression();
				setState(140);
				match(SEMI);
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(SWITCH);
				setState(143);
				parExpression();
				setState(144);
				match(LBRACE);
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(145);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(150);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(151);
					switchLabel();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157);
				match(RBRACE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 7);
				{
				setState(159);
				match(RETURN);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DECIMAL_LITERAL - 51)) | (1L << (HEX_LITERAL - 51)) | (1L << (OCT_LITERAL - 51)) | (1L << (BINARY_LITERAL - 51)) | (1L << (FLOAT_LITERAL - 51)) | (1L << (HEX_FLOAT_LITERAL - 51)) | (1L << (BOOL_LITERAL - 51)) | (1L << (CHAR_LITERAL - 51)) | (1L << (STRING_LITERAL - 51)) | (1L << (NULL_LITERAL - 51)) | (1L << (LPAREN - 51)) | (1L << (BANG - 51)) | (1L << (TILDE - 51)) | (1L << (INC - 51)) | (1L << (DEC - 51)) | (1L << (ADD - 51)) | (1L << (SUB - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
					{
					setState(160);
					expression(0);
					}
				}

				setState(163);
				match(SEMI);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 8);
				{
				setState(164);
				match(BREAK);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(165);
					match(IDENTIFIER);
					}
				}

				setState(168);
				match(SEMI);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				match(CONTINUE);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(170);
					match(IDENTIFIER);
					}
				}

				setState(173);
				match(SEMI);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				match(SEMI);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				((StatementContext)_localctx).statementExpression = expression(0);
				setState(176);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitSwitchBlockStatementGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(180);
				switchLabel();
				}
				}
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(185);
				blockStatement();
				}
				}
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BREAK) | (1L << CONTINUE) | (1L << DO) | (1L << FOR) | (1L << IF) | (1L << RETURN) | (1L << SWITCH) | (1L << WHILE) | (1L << DECIMAL_LITERAL) | (1L << HEX_LITERAL) | (1L << OCT_LITERAL) | (1L << BINARY_LITERAL) | (1L << FLOAT_LITERAL) | (1L << HEX_FLOAT_LITERAL) | (1L << BOOL_LITERAL) | (1L << CHAR_LITERAL) | (1L << STRING_LITERAL) | (1L << NULL_LITERAL) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (SEMI - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (IDENTIFIER - 67)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext constantExpression;
		public Token enumConstantName;
		public TerminalNode CASE() { return getToken(PlayScriptParser.CASE, 0); }
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public TerminalNode DEFAULT() { return getToken(PlayScriptParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitSwitchLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchLabel);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(CASE);
				setState(193);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(191);
					((SwitchLabelContext)_localctx).constantExpression = expression(0);
					}
					break;
				case 2:
					{
					setState(192);
					((SwitchLabelContext)_localctx).enumConstantName = match(IDENTIFIER);
					}
					break;
				}
				setState(195);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(DEFAULT);
				setState(197);
				match(COLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public ExpressionListContext forUpdate;
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(PlayScriptParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PlayScriptParser.SEMI, i);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forControl);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				enhancedForControl();
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case SEMI:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DECIMAL_LITERAL - 51)) | (1L << (HEX_LITERAL - 51)) | (1L << (OCT_LITERAL - 51)) | (1L << (BINARY_LITERAL - 51)) | (1L << (FLOAT_LITERAL - 51)) | (1L << (HEX_FLOAT_LITERAL - 51)) | (1L << (BOOL_LITERAL - 51)) | (1L << (CHAR_LITERAL - 51)) | (1L << (STRING_LITERAL - 51)) | (1L << (NULL_LITERAL - 51)) | (1L << (LPAREN - 51)) | (1L << (BANG - 51)) | (1L << (TILDE - 51)) | (1L << (INC - 51)) | (1L << (DEC - 51)) | (1L << (ADD - 51)) | (1L << (SUB - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
					{
					setState(201);
					forInit();
					}
				}

				setState(204);
				match(SEMI);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DECIMAL_LITERAL - 51)) | (1L << (HEX_LITERAL - 51)) | (1L << (OCT_LITERAL - 51)) | (1L << (BINARY_LITERAL - 51)) | (1L << (FLOAT_LITERAL - 51)) | (1L << (HEX_FLOAT_LITERAL - 51)) | (1L << (BOOL_LITERAL - 51)) | (1L << (CHAR_LITERAL - 51)) | (1L << (STRING_LITERAL - 51)) | (1L << (NULL_LITERAL - 51)) | (1L << (LPAREN - 51)) | (1L << (BANG - 51)) | (1L << (TILDE - 51)) | (1L << (INC - 51)) | (1L << (DEC - 51)) | (1L << (ADD - 51)) | (1L << (SUB - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
					{
					setState(205);
					expression(0);
					}
				}

				setState(208);
				match(SEMI);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DECIMAL_LITERAL - 51)) | (1L << (HEX_LITERAL - 51)) | (1L << (OCT_LITERAL - 51)) | (1L << (BINARY_LITERAL - 51)) | (1L << (FLOAT_LITERAL - 51)) | (1L << (HEX_FLOAT_LITERAL - 51)) | (1L << (BOOL_LITERAL - 51)) | (1L << (CHAR_LITERAL - 51)) | (1L << (STRING_LITERAL - 51)) | (1L << (NULL_LITERAL - 51)) | (1L << (LPAREN - 51)) | (1L << (BANG - 51)) | (1L << (TILDE - 51)) | (1L << (INC - 51)) | (1L << (DEC - 51)) | (1L << (ADD - 51)) | (1L << (SUB - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
					{
					setState(209);
					((ForControlContext)_localctx).forUpdate = expressionList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forInit);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				variableDeclarators();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitEnhancedForControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			typeType();
			setState(219);
			variableDeclaratorId();
			setState(220);
			match(COLON);
			setState(221);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitParExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LPAREN);
			setState(224);
			expression(0);
			setState(225);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PlayScriptParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlayScriptParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			expression(0);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(228);
				match(COMMA);
				setState(229);
				expression(0);
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Token prefix;
		public Token bop;
		public Token postfix;
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(PlayScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(PlayScriptParser.SUB, 0); }
		public TerminalNode INC() { return getToken(PlayScriptParser.INC, 0); }
		public TerminalNode DEC() { return getToken(PlayScriptParser.DEC, 0); }
		public TerminalNode TILDE() { return getToken(PlayScriptParser.TILDE, 0); }
		public TerminalNode BANG() { return getToken(PlayScriptParser.BANG, 0); }
		public TerminalNode MUL() { return getToken(PlayScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(PlayScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(PlayScriptParser.MOD, 0); }
		public List<TerminalNode> LT() { return getTokens(PlayScriptParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(PlayScriptParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(PlayScriptParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(PlayScriptParser.GT, i);
		}
		public TerminalNode LE() { return getToken(PlayScriptParser.LE, 0); }
		public TerminalNode GE() { return getToken(PlayScriptParser.GE, 0); }
		public TerminalNode EQUAL() { return getToken(PlayScriptParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(PlayScriptParser.NOTEQUAL, 0); }
		public TerminalNode BITAND() { return getToken(PlayScriptParser.BITAND, 0); }
		public TerminalNode CARET() { return getToken(PlayScriptParser.CARET, 0); }
		public TerminalNode BITOR() { return getToken(PlayScriptParser.BITOR, 0); }
		public TerminalNode AND() { return getToken(PlayScriptParser.AND, 0); }
		public TerminalNode OR() { return getToken(PlayScriptParser.OR, 0); }
		public TerminalNode COLON() { return getToken(PlayScriptParser.COLON, 0); }
		public TerminalNode QUESTION() { return getToken(PlayScriptParser.QUESTION, 0); }
		public TerminalNode ASSIGN() { return getToken(PlayScriptParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(PlayScriptParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(PlayScriptParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(PlayScriptParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(PlayScriptParser.DIV_ASSIGN, 0); }
		public TerminalNode AND_ASSIGN() { return getToken(PlayScriptParser.AND_ASSIGN, 0); }
		public TerminalNode OR_ASSIGN() { return getToken(PlayScriptParser.OR_ASSIGN, 0); }
		public TerminalNode XOR_ASSIGN() { return getToken(PlayScriptParser.XOR_ASSIGN, 0); }
		public TerminalNode RSHIFT_ASSIGN() { return getToken(PlayScriptParser.RSHIFT_ASSIGN, 0); }
		public TerminalNode URSHIFT_ASSIGN() { return getToken(PlayScriptParser.URSHIFT_ASSIGN, 0); }
		public TerminalNode LSHIFT_ASSIGN() { return getToken(PlayScriptParser.LSHIFT_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(PlayScriptParser.MOD_ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(PlayScriptParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(PlayScriptParser.RBRACK, 0); }
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode INSTANCEOF() { return getToken(PlayScriptParser.INSTANCEOF, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
			case LPAREN:
			case IDENTIFIER:
				{
				setState(236);
				primary();
				}
				break;
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				setState(237);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (INC - 83)) | (1L << (DEC - 83)) | (1L << (ADD - 83)) | (1L << (SUB - 83)))) != 0)) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				expression(15);
				}
				break;
			case BANG:
			case TILDE:
				{
				setState(239);
				((ExpressionContext)_localctx).prefix = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
					((ExpressionContext)_localctx).prefix = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(240);
				expression(14);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(300);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(244);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (MUL - 87)) | (1L << (DIV - 87)) | (1L << (MOD - 87)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(245);
						expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(247);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(248);
						expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(257);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
						case 1:
							{
							setState(250);
							match(LT);
							setState(251);
							match(LT);
							}
							break;
						case 2:
							{
							setState(252);
							match(GT);
							setState(253);
							match(GT);
							setState(254);
							match(GT);
							}
							break;
						case 3:
							{
							setState(255);
							match(GT);
							setState(256);
							match(GT);
							}
							break;
						}
						setState(259);
						expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(261);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (GT - 71)) | (1L << (LT - 71)) | (1L << (LE - 71)) | (1L << (GE - 71)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(264);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expression(9);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(267);
						((ExpressionContext)_localctx).bop = match(BITAND);
						setState(268);
						expression(8);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(270);
						((ExpressionContext)_localctx).bop = match(CARET);
						setState(271);
						expression(7);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(272);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(273);
						((ExpressionContext)_localctx).bop = match(BITOR);
						setState(274);
						expression(6);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(276);
						((ExpressionContext)_localctx).bop = match(AND);
						setState(277);
						expression(5);
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(279);
						((ExpressionContext)_localctx).bop = match(OR);
						setState(280);
						expression(4);
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(282);
						((ExpressionContext)_localctx).bop = match(QUESTION);
						setState(283);
						expression(0);
						setState(284);
						match(COLON);
						setState(285);
						expression(3);
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(288);
						((ExpressionContext)_localctx).bop = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (ASSIGN - 70)) | (1L << (ADD_ASSIGN - 70)) | (1L << (SUB_ASSIGN - 70)) | (1L << (MUL_ASSIGN - 70)) | (1L << (DIV_ASSIGN - 70)) | (1L << (AND_ASSIGN - 70)) | (1L << (OR_ASSIGN - 70)) | (1L << (XOR_ASSIGN - 70)) | (1L << (MOD_ASSIGN - 70)) | (1L << (LSHIFT_ASSIGN - 70)) | (1L << (RSHIFT_ASSIGN - 70)) | (1L << (URSHIFT_ASSIGN - 70)))) != 0)) ) {
							((ExpressionContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(289);
						expression(1);
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(291);
						match(LBRACK);
						setState(292);
						expression(0);
						setState(293);
						match(RBRACK);
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(295);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(296);
						((ExpressionContext)_localctx).postfix = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((ExpressionContext)_localctx).postfix = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(298);
						((ExpressionContext)_localctx).bop = match(INSTANCEOF);
						setState(299);
						typeType();
						}
						break;
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primary);
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				match(LPAREN);
				setState(306);
				expression(0);
				setState(307);
				match(RPAREN);
				}
				break;
			case DECIMAL_LITERAL:
			case HEX_LITERAL:
			case OCT_LITERAL:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case HEX_FLOAT_LITERAL:
			case BOOL_LITERAL:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case NULL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(PlayScriptParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(PlayScriptParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(PlayScriptParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(PlayScriptParser.RBRACK, i);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitTypeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_typeType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			primitiveType();
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					match(LBRACK);
					setState(315);
					match(RBRACK);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(PlayScriptParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(PlayScriptParser.CHAR, 0); }
		public TerminalNode BYTE() { return getToken(PlayScriptParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(PlayScriptParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(PlayScriptParser.INT, 0); }
		public TerminalNode LONG() { return getToken(PlayScriptParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(PlayScriptParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(PlayScriptParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlayScriptParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitSuperSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitSuperSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_superSuffix);
		int _la;
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				match(DOT);
				setState(325);
				match(IDENTIFIER);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(326);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(PlayScriptParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PlayScriptParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitExplicitGenericInvocationSuffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_explicitGenericInvocationSuffix);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(SUPER);
				setState(332);
				superSuffix();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(IDENTIFIER);
				setState(334);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(PlayScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlayScriptParser.RPAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayScriptListener ) ((PlayScriptListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayScriptVisitor ) return ((PlayScriptVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(LPAREN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & ((1L << (DECIMAL_LITERAL - 51)) | (1L << (HEX_LITERAL - 51)) | (1L << (OCT_LITERAL - 51)) | (1L << (BINARY_LITERAL - 51)) | (1L << (FLOAT_LITERAL - 51)) | (1L << (HEX_FLOAT_LITERAL - 51)) | (1L << (BOOL_LITERAL - 51)) | (1L << (CHAR_LITERAL - 51)) | (1L << (STRING_LITERAL - 51)) | (1L << (NULL_LITERAL - 51)) | (1L << (LPAREN - 51)) | (1L << (BANG - 51)) | (1L << (TILDE - 51)) | (1L << (INC - 51)) | (1L << (DEC - 51)) | (1L << (ADD - 51)) | (1L << (SUB - 51)) | (1L << (IDENTIFIER - 51)))) != 0)) {
				{
				setState(338);
				expressionList();
				}
			}

			setState(341);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		case 12:
			return precpred(_ctx, 17);
		case 13:
			return precpred(_ctx, 16);
		case 14:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u015a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\3\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\4\7\4E\n\4\f\4\16\4H\13\4\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\7"+
		"\6R\n\6\f\6\16\6U\13\6\3\6\5\6X\n\6\5\6Z\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7d\n\7\3\b\3\b\3\t\3\t\3\n\3\n\7\nl\n\n\f\n\16\no\13\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13w\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\177\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098\13\f\3\f\7\f\u009b\n\f\f\f\16"+
		"\f\u009e\13\f\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\3\f\5\f\u00a9\n\f"+
		"\3\f\3\f\3\f\5\f\u00ae\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b5\n\f\3\r\6\r\u00b8"+
		"\n\r\r\r\16\r\u00b9\3\r\6\r\u00bd\n\r\r\r\16\r\u00be\3\16\3\16\3\16\5"+
		"\16\u00c4\n\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\5\17\u00cd\n\17"+
		"\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\5\17\u00d5\n\17\5\17\u00d7\n\17\3"+
		"\20\3\20\5\20\u00db\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00f4\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0104\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u012f\n\24\f\24\16\24\u0132"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u013a\n\25\3\26\3\26\3\26\7"+
		"\26\u013f\n\26\f\26\16\26\u0142\13\26\3\27\3\27\3\30\3\30\3\30\3\30\5"+
		"\30\u014a\n\30\5\30\u014c\n\30\3\31\3\31\3\31\3\31\5\31\u0152\n\31\3\32"+
		"\3\32\5\32\u0156\n\32\3\32\3\32\3\32\2\3&\33\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\2\r\3\2\658\3\29:\3\2UX\3\2KL\4\2YZ^^\3\2"+
		"WX\4\2IJPQ\4\2OORR\4\2HH_i\3\2UV\n\2\5\5\7\7\n\n\20\20\26\26\35\35\37"+
		"\37\'\'\2\u0182\2\64\3\2\2\2\4<\3\2\2\2\6A\3\2\2\2\bK\3\2\2\2\nM\3\2\2"+
		"\2\fc\3\2\2\2\16e\3\2\2\2\20g\3\2\2\2\22i\3\2\2\2\24v\3\2\2\2\26\u00b4"+
		"\3\2\2\2\30\u00b7\3\2\2\2\32\u00c8\3\2\2\2\34\u00d6\3\2\2\2\36\u00da\3"+
		"\2\2\2 \u00dc\3\2\2\2\"\u00e1\3\2\2\2$\u00e5\3\2\2\2&\u00f3\3\2\2\2(\u0139"+
		"\3\2\2\2*\u013b\3\2\2\2,\u0143\3\2\2\2.\u014b\3\2\2\2\60\u0151\3\2\2\2"+
		"\62\u0153\3\2\2\2\649\5\4\3\2\65\66\7F\2\2\668\5\4\3\2\67\65\3\2\2\28"+
		";\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;9\3\2\2\2<?\5\6\4\2=>\7H\2"+
		"\2>@\5\b\5\2?=\3\2\2\2?@\3\2\2\2@\5\3\2\2\2AF\7q\2\2BC\7C\2\2CE\7D\2\2"+
		"DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\7\3\2\2\2HF\3\2\2\2IL\5\n\6"+
		"\2JL\5&\24\2KI\3\2\2\2KJ\3\2\2\2L\t\3\2\2\2MY\7A\2\2NS\5\b\5\2OP\7F\2"+
		"\2PR\5\b\5\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TW\3\2\2\2US\3\2\2"+
		"\2VX\7F\2\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YN\3\2\2\2YZ\3\2\2\2Z[\3\2\2"+
		"\2[\\\7B\2\2\\\13\3\2\2\2]d\5\16\b\2^d\5\20\t\2_d\7<\2\2`d\7=\2\2ad\7"+
		";\2\2bd\7>\2\2c]\3\2\2\2c^\3\2\2\2c_\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2"+
		"\2\2d\r\3\2\2\2ef\t\2\2\2f\17\3\2\2\2gh\t\3\2\2h\21\3\2\2\2im\7A\2\2j"+
		"l\5\24\13\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2"+
		"\2pq\7B\2\2q\23\3\2\2\2rs\5\2\2\2st\7E\2\2tw\3\2\2\2uw\5\26\f\2vr\3\2"+
		"\2\2vu\3\2\2\2w\25\3\2\2\2x\u00b5\5\22\n\2yz\7\30\2\2z{\5\"\22\2{~\5\26"+
		"\f\2|}\7\21\2\2}\177\5\26\f\2~|\3\2\2\2~\177\3\2\2\2\177\u00b5\3\2\2\2"+
		"\u0080\u0081\7\27\2\2\u0081\u0082\7?\2\2\u0082\u0083\5\34\17\2\u0083\u0084"+
		"\7@\2\2\u0084\u0085\5\26\f\2\u0085\u00b5\3\2\2\2\u0086\u0087\7\64\2\2"+
		"\u0087\u0088\5\"\22\2\u0088\u0089\5\26\f\2\u0089\u00b5\3\2\2\2\u008a\u008b"+
		"\7\17\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\64\2\2\u008d\u008e\5\"\22"+
		"\2\u008e\u008f\7E\2\2\u008f\u00b5\3\2\2\2\u0090\u0091\7+\2\2\u0091\u0092"+
		"\5\"\22\2\u0092\u0096\7A\2\2\u0093\u0095\5\30\r\2\u0094\u0093\3\2\2\2"+
		"\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009c"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2"+
		"\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f"+
		"\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7B\2\2\u00a0\u00b5\3\2\2\2\u00a1"+
		"\u00a3\7&\2\2\u00a2\u00a4\5&\24\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b5\7E\2\2\u00a6\u00a8\7\6\2\2\u00a7"+
		"\u00a9\7q\2\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2"+
		"\2\2\u00aa\u00b5\7E\2\2\u00ab\u00ad\7\r\2\2\u00ac\u00ae\7q\2\2\u00ad\u00ac"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b5\7E\2\2\u00b0"+
		"\u00b5\7E\2\2\u00b1\u00b2\5&\24\2\u00b2\u00b3\7E\2\2\u00b3\u00b5\3\2\2"+
		"\2\u00b4x\3\2\2\2\u00b4y\3\2\2\2\u00b4\u0080\3\2\2\2\u00b4\u0086\3\2\2"+
		"\2\u00b4\u008a\3\2\2\2\u00b4\u0090\3\2\2\2\u00b4\u00a1\3\2\2\2\u00b4\u00a6"+
		"\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b8\5\32\16\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00bd\5\24\13\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\31\3\2\2\2\u00c0\u00c3\7\b\2\2\u00c1"+
		"\u00c4\5&\24\2\u00c2\u00c4\7q\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c9\7N\2\2\u00c6\u00c7\7\16\2\2\u00c7"+
		"\u00c9\7N\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\33\3\2\2\2"+
		"\u00ca\u00d7\5 \21\2\u00cb\u00cd\5\36\20\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\7E\2\2\u00cf\u00d1\5&\24\2\u00d0"+
		"\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7E"+
		"\2\2\u00d3\u00d5\5$\23\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d7\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d7\35\3\2\2"+
		"\2\u00d8\u00db\5\2\2\2\u00d9\u00db\5$\23\2\u00da\u00d8\3\2\2\2\u00da\u00d9"+
		"\3\2\2\2\u00db\37\3\2\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de\5\6\4\2\u00de"+
		"\u00df\7N\2\2\u00df\u00e0\5&\24\2\u00e0!\3\2\2\2\u00e1\u00e2\7?\2\2\u00e2"+
		"\u00e3\5&\24\2\u00e3\u00e4\7@\2\2\u00e4#\3\2\2\2\u00e5\u00ea\5&\24\2\u00e6"+
		"\u00e7\7F\2\2\u00e7\u00e9\5&\24\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb%\3\2\2\2\u00ec\u00ea"+
		"\3\2\2\2\u00ed\u00ee\b\24\1\2\u00ee\u00f4\5(\25\2\u00ef\u00f0\t\4\2\2"+
		"\u00f0\u00f4\5&\24\21\u00f1\u00f2\t\5\2\2\u00f2\u00f4\5&\24\20\u00f3\u00ed"+
		"\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u0130\3\2\2\2\u00f5"+
		"\u00f6\f\17\2\2\u00f6\u00f7\t\6\2\2\u00f7\u012f\5&\24\20\u00f8\u00f9\f"+
		"\16\2\2\u00f9\u00fa\t\7\2\2\u00fa\u012f\5&\24\17\u00fb\u0103\f\r\2\2\u00fc"+
		"\u00fd\7J\2\2\u00fd\u0104\7J\2\2\u00fe\u00ff\7I\2\2\u00ff\u0100\7I\2\2"+
		"\u0100\u0104\7I\2\2\u0101\u0102\7I\2\2\u0102\u0104\7I\2\2\u0103\u00fc"+
		"\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u012f\5&\24\16\u0106\u0107\f\f\2\2\u0107\u0108\t\b\2\2\u0108\u012f\5"+
		"&\24\r\u0109\u010a\f\n\2\2\u010a\u010b\t\t\2\2\u010b\u012f\5&\24\13\u010c"+
		"\u010d\f\t\2\2\u010d\u010e\7[\2\2\u010e\u012f\5&\24\n\u010f\u0110\f\b"+
		"\2\2\u0110\u0111\7]\2\2\u0111\u012f\5&\24\t\u0112\u0113\f\7\2\2\u0113"+
		"\u0114\7\\\2\2\u0114\u012f\5&\24\b\u0115\u0116\f\6\2\2\u0116\u0117\7S"+
		"\2\2\u0117\u012f\5&\24\7\u0118\u0119\f\5\2\2\u0119\u011a\7T\2\2\u011a"+
		"\u012f\5&\24\6\u011b\u011c\f\4\2\2\u011c\u011d\7M\2\2\u011d\u011e\5&\24"+
		"\2\u011e\u011f\7N\2\2\u011f\u0120\5&\24\5\u0120\u012f\3\2\2\2\u0121\u0122"+
		"\f\3\2\2\u0122\u0123\t\n\2\2\u0123\u012f\5&\24\3\u0124\u0125\f\23\2\2"+
		"\u0125\u0126\7C\2\2\u0126\u0127\5&\24\2\u0127\u0128\7D\2\2\u0128\u012f"+
		"\3\2\2\2\u0129\u012a\f\22\2\2\u012a\u012f\t\13\2\2\u012b\u012c\f\13\2"+
		"\2\u012c\u012d\7\34\2\2\u012d\u012f\5*\26\2\u012e\u00f5\3\2\2\2\u012e"+
		"\u00f8\3\2\2\2\u012e\u00fb\3\2\2\2\u012e\u0106\3\2\2\2\u012e\u0109\3\2"+
		"\2\2\u012e\u010c\3\2\2\2\u012e\u010f\3\2\2\2\u012e\u0112\3\2\2\2\u012e"+
		"\u0115\3\2\2\2\u012e\u0118\3\2\2\2\u012e\u011b\3\2\2\2\u012e\u0121\3\2"+
		"\2\2\u012e\u0124\3\2\2\2\u012e\u0129\3\2\2\2\u012e\u012b\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\'\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0133\u0134\7?\2\2\u0134\u0135\5&\24\2\u0135\u0136"+
		"\7@\2\2\u0136\u013a\3\2\2\2\u0137\u013a\5\f\7\2\u0138\u013a\7q\2\2\u0139"+
		"\u0133\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a)\3\2\2\2"+
		"\u013b\u0140\5,\27\2\u013c\u013d\7C\2\2\u013d\u013f\7D\2\2\u013e\u013c"+
		"\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"+\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\t\f\2\2\u0144-\3\2\2\2\u0145"+
		"\u014c\5\62\32\2\u0146\u0147\7G\2\2\u0147\u0149\7q\2\2\u0148\u014a\5\62"+
		"\32\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0145\3\2\2\2\u014b\u0146\3\2\2\2\u014c/\3\2\2\2\u014d\u014e\7*\2\2\u014e"+
		"\u0152\5.\30\2\u014f\u0150\7q\2\2\u0150\u0152\5\62\32\2\u0151\u014d\3"+
		"\2\2\2\u0151\u014f\3\2\2\2\u0152\61\3\2\2\2\u0153\u0155\7?\2\2\u0154\u0156"+
		"\5$\23\2\u0155\u0154\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\7@\2\2\u0158\63\3\2\2\2\'9?FKSWYcmv~\u0096\u009c\u00a3\u00a8\u00ad"+
		"\u00b4\u00b9\u00be\u00c3\u00c8\u00cc\u00d0\u00d4\u00d6\u00da\u00ea\u00f3"+
		"\u0103\u012e\u0130\u0139\u0140\u0149\u014b\u0151\u0155";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}