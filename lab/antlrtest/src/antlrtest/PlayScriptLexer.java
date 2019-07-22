// Generated from PlayScript.g4 by ANTLR 4.7.2

package antlrtest;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, CHAR=9, 
		CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, ELSE=16, 
		ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, IF=23, IMPLEMENTS=24, 
		IMPORT=25, INSTANCEOF=26, INT=27, INTERFACE=28, LONG=29, NATIVE=30, NEW=31, 
		PACKAGE=32, PRIVATE=33, PROTECTED=34, PUBLIC=35, RETURN=36, SHORT=37, 
		SUPER=38, SWITCH=39, THIS=40, VOID=41, WHILE=42, IntegerLiteral=43, FloatingPointLiteral=44, 
		BooleanLiteral=45, CharacterLiteral=46, StringLiteral=47, NullLiteral=48, 
		LPAREN=49, RPAREN=50, LBRACE=51, RBRACE=52, LBRACK=53, RBRACK=54, SEMI=55, 
		COMMA=56, DOT=57, ELLIPSIS=58, AT=59, COLONCOLON=60, ASSIGN=61, GT=62, 
		LT=63, BANG=64, TILDE=65, QUESTION=66, COLON=67, ARROW=68, EQUAL=69, LE=70, 
		GE=71, NOTEQUAL=72, AND=73, OR=74, INC=75, DEC=76, ADD=77, SUB=78, MUL=79, 
		DIV=80, BITAND=81, BITOR=82, CARET=83, MOD=84, ADD_ASSIGN=85, SUB_ASSIGN=86, 
		MUL_ASSIGN=87, DIV_ASSIGN=88, AND_ASSIGN=89, OR_ASSIGN=90, XOR_ASSIGN=91, 
		MOD_ASSIGN=92, LSHIFT_ASSIGN=93, RSHIFT_ASSIGN=94, URSHIFT_ASSIGN=95, 
		Identifier=96, WS=97, COMMENT=98, LINE_COMMENT=99;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", 
			"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "SUPER", 
			"SWITCH", "THIS", "VOID", "WHILE", "IntegerLiteral", "DecimalIntegerLiteral", 
			"HexIntegerLiteral", "OctalIntegerLiteral", "BinaryIntegerLiteral", "IntegerTypeSuffix", 
			"DecimalNumeral", "Digits", "Digit", "NonZeroDigit", "DigitsAndUnderscores", 
			"DigitOrUnderscore", "Underscores", "HexNumeral", "HexDigits", "HexDigit", 
			"HexDigitsAndUnderscores", "HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", 
			"OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", 
			"BinaryNumeral", "BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", 
			"BinaryDigitOrUnderscore", "FloatingPointLiteral", "DecimalFloatingPointLiteral", 
			"ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", 
			"HexadecimalFloatingPointLiteral", "HexSignificand", "BinaryExponent", 
			"BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
			"OctalEscape", "ZeroToThree", "UnicodeEscape", "NullLiteral", "LPAREN", 
			"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
			"ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
			"QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
			"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
			"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
			"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
			"URSHIFT_ASSIGN", "Identifier", "Letter", "LetterOrDigit", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Number'", "'String'", "'var'", "'boolean'", "'break'", "'byte'", 
			"'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", "'default'", 
			"'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", "'finally'", 
			"'float'", "'for'", "'if'", "'implements'", "'import'", "'instanceof'", 
			"'int'", "'interface'", "'long'", "'native'", "'new'", "'package'", "'private'", 
			"'protected'", "'public'", "'return'", "'short'", "'super'", "'switch'", 
			"'this'", "'void'", "'while'", null, null, null, null, null, "'null'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'...'", 
			"'@'", "'::'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'->'", 
			"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
			"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
			"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", 
			"CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", 
			"ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", 
			"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", 
			"PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "SUPER", 
			"SWITCH", "THIS", "VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
			"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
			"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
			"DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", "LT", "BANG", 
			"TILDE", "QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", "NOTEQUAL", 
			"AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", 
			"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
			"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
			"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
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


	public PlayScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 140:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 141:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2e\u03f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&"+
		"\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\5,\u0239\n,\3-\3-\5-\u023d\n-"+
		"\3.\3.\5.\u0241\n.\3/\3/\5/\u0245\n/\3\60\3\60\5\60\u0249\n\60\3\61\3"+
		"\61\3\62\3\62\3\62\5\62\u0250\n\62\3\62\3\62\3\62\5\62\u0255\n\62\5\62"+
		"\u0257\n\62\3\63\3\63\5\63\u025b\n\63\3\63\5\63\u025e\n\63\3\64\3\64\5"+
		"\64\u0262\n\64\3\65\3\65\3\66\6\66\u0267\n\66\r\66\16\66\u0268\3\67\3"+
		"\67\5\67\u026d\n\67\38\68\u0270\n8\r8\168\u0271\39\39\39\39\3:\3:\5:\u027a"+
		"\n:\3:\5:\u027d\n:\3;\3;\3<\6<\u0282\n<\r<\16<\u0283\3=\3=\5=\u0288\n"+
		"=\3>\3>\5>\u028c\n>\3>\3>\3?\3?\5?\u0292\n?\3?\5?\u0295\n?\3@\3@\3A\6"+
		"A\u029a\nA\rA\16A\u029b\3B\3B\5B\u02a0\nB\3C\3C\3C\3C\3D\3D\5D\u02a8\n"+
		"D\3D\5D\u02ab\nD\3E\3E\3F\6F\u02b0\nF\rF\16F\u02b1\3G\3G\5G\u02b6\nG\3"+
		"H\3H\5H\u02ba\nH\3I\3I\3I\5I\u02bf\nI\3I\5I\u02c2\nI\3I\5I\u02c5\nI\3"+
		"I\3I\3I\5I\u02ca\nI\3I\5I\u02cd\nI\3I\3I\3I\5I\u02d2\nI\3I\3I\3I\5I\u02d7"+
		"\nI\3J\3J\3J\3K\3K\3L\5L\u02df\nL\3L\3L\3M\3M\3N\3N\3O\3O\3O\5O\u02ea"+
		"\nO\3P\3P\5P\u02ee\nP\3P\3P\3P\5P\u02f3\nP\3P\3P\5P\u02f7\nP\3Q\3Q\3Q"+
		"\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u0307\nS\3T\3T\3T\3T\3T\3T\3T\3T"+
		"\5T\u0311\nT\3U\3U\3V\3V\5V\u0317\nV\3V\3V\3W\6W\u031c\nW\rW\16W\u031d"+
		"\3X\3X\5X\u0322\nX\3Y\3Y\3Y\3Y\5Y\u0328\nY\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z"+
		"\3Z\3Z\5Z\u0335\nZ\3[\3[\3\\\3\\\6\\\u033b\n\\\r\\\16\\\u033c\3\\\3\\"+
		"\3\\\3\\\3\\\3]\3]\3]\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d"+
		"\3e\3e\3f\3f\3g\3g\3g\3g\3h\3h\3i\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n"+
		"\3o\3o\3p\3p\3q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w"+
		"\3w\3w\3x\3x\3x\3y\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\7\u008d\u03c4\n\u008d"+
		"\f\u008d\16\u008d\u03c7\13\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\5\u008e\u03cf\n\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\5\u008f\u03d7\n\u008f\3\u0090\6\u0090\u03da\n\u0090\r\u0090\16"+
		"\u0090\u03db\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u03e4"+
		"\n\u0091\f\u0091\16\u0091\u03e7\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\7\u0092\u03f2\n\u0092\f\u0092"+
		"\16\u0092\u03f5\13\u0092\3\u0092\3\u0092\3\u03e5\2\u0093\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2"+
		"{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		".\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1"+
		"\2\u00a3\2\u00a5/\u00a7\60\u00a9\2\u00ab\61\u00ad\2\u00af\2\u00b1\2\u00b3"+
		"\2\u00b5\2\u00b7\2\u00b9\62\u00bb\63\u00bd\64\u00bf\65\u00c1\66\u00c3"+
		"\67\u00c58\u00c79\u00c9:\u00cb;\u00cd<\u00cf=\u00d1>\u00d3?\u00d5@\u00d7"+
		"A\u00d9B\u00dbC\u00ddD\u00dfE\u00e1F\u00e3G\u00e5H\u00e7I\u00e9J\u00eb"+
		"K\u00edL\u00efM\u00f1N\u00f3O\u00f5P\u00f7Q\u00f9R\u00fbS\u00fdT\u00ff"+
		"U\u0101V\u0103W\u0105X\u0107Y\u0109Z\u010b[\u010d\\\u010f]\u0111^\u0113"+
		"_\u0115`\u0117a\u0119b\u011b\2\u011d\2\u011fc\u0121d\u0123e\3\2\30\4\2"+
		"NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2"+
		"--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^"+
		"^ddhhppttvv\3\2\62\65\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01"+
		"\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u0407"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2\u008f\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2"+
		"\u00ab\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3"+
		"\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2"+
		"\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5"+
		"\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2"+
		"\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2\2\2\u0107"+
		"\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f\3\2\2"+
		"\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0115\3\2\2\2\2\u0117\3\2\2\2\2\u0119"+
		"\3\2\2\2\2\u011f\3\2\2\2\2\u0121\3\2\2\2\2\u0123\3\2\2\2\3\u0125\3\2\2"+
		"\2\5\u012c\3\2\2\2\7\u0133\3\2\2\2\t\u0137\3\2\2\2\13\u013f\3\2\2\2\r"+
		"\u0145\3\2\2\2\17\u014a\3\2\2\2\21\u014f\3\2\2\2\23\u0155\3\2\2\2\25\u015a"+
		"\3\2\2\2\27\u0160\3\2\2\2\31\u0166\3\2\2\2\33\u016f\3\2\2\2\35\u0177\3"+
		"\2\2\2\37\u017a\3\2\2\2!\u0181\3\2\2\2#\u0186\3\2\2\2%\u018b\3\2\2\2\'"+
		"\u0193\3\2\2\2)\u0199\3\2\2\2+\u01a1\3\2\2\2-\u01a7\3\2\2\2/\u01ab\3\2"+
		"\2\2\61\u01ae\3\2\2\2\63\u01b9\3\2\2\2\65\u01c0\3\2\2\2\67\u01cb\3\2\2"+
		"\29\u01cf\3\2\2\2;\u01d9\3\2\2\2=\u01de\3\2\2\2?\u01e5\3\2\2\2A\u01e9"+
		"\3\2\2\2C\u01f1\3\2\2\2E\u01f9\3\2\2\2G\u0203\3\2\2\2I\u020a\3\2\2\2K"+
		"\u0211\3\2\2\2M\u0217\3\2\2\2O\u021d\3\2\2\2Q\u0224\3\2\2\2S\u0229\3\2"+
		"\2\2U\u022e\3\2\2\2W\u0238\3\2\2\2Y\u023a\3\2\2\2[\u023e\3\2\2\2]\u0242"+
		"\3\2\2\2_\u0246\3\2\2\2a\u024a\3\2\2\2c\u0256\3\2\2\2e\u0258\3\2\2\2g"+
		"\u0261\3\2\2\2i\u0263\3\2\2\2k\u0266\3\2\2\2m\u026c\3\2\2\2o\u026f\3\2"+
		"\2\2q\u0273\3\2\2\2s\u0277\3\2\2\2u\u027e\3\2\2\2w\u0281\3\2\2\2y\u0287"+
		"\3\2\2\2{\u0289\3\2\2\2}\u028f\3\2\2\2\177\u0296\3\2\2\2\u0081\u0299\3"+
		"\2\2\2\u0083\u029f\3\2\2\2\u0085\u02a1\3\2\2\2\u0087\u02a5\3\2\2\2\u0089"+
		"\u02ac\3\2\2\2\u008b\u02af\3\2\2\2\u008d\u02b5\3\2\2\2\u008f\u02b9\3\2"+
		"\2\2\u0091\u02d6\3\2\2\2\u0093\u02d8\3\2\2\2\u0095\u02db\3\2\2\2\u0097"+
		"\u02de\3\2\2\2\u0099\u02e2\3\2\2\2\u009b\u02e4\3\2\2\2\u009d\u02e6\3\2"+
		"\2\2\u009f\u02f6\3\2\2\2\u00a1\u02f8\3\2\2\2\u00a3\u02fb\3\2\2\2\u00a5"+
		"\u0306\3\2\2\2\u00a7\u0310\3\2\2\2\u00a9\u0312\3\2\2\2\u00ab\u0314\3\2"+
		"\2\2\u00ad\u031b\3\2\2\2\u00af\u0321\3\2\2\2\u00b1\u0327\3\2\2\2\u00b3"+
		"\u0334\3\2\2\2\u00b5\u0336\3\2\2\2\u00b7\u0338\3\2\2\2\u00b9\u0343\3\2"+
		"\2\2\u00bb\u0348\3\2\2\2\u00bd\u034a\3\2\2\2\u00bf\u034c\3\2\2\2\u00c1"+
		"\u034e\3\2\2\2\u00c3\u0350\3\2\2\2\u00c5\u0352\3\2\2\2\u00c7\u0354\3\2"+
		"\2\2\u00c9\u0356\3\2\2\2\u00cb\u0358\3\2\2\2\u00cd\u035a\3\2\2\2\u00cf"+
		"\u035e\3\2\2\2\u00d1\u0360\3\2\2\2\u00d3\u0363\3\2\2\2\u00d5\u0365\3\2"+
		"\2\2\u00d7\u0367\3\2\2\2\u00d9\u0369\3\2\2\2\u00db\u036b\3\2\2\2\u00dd"+
		"\u036d\3\2\2\2\u00df\u036f\3\2\2\2\u00e1\u0371\3\2\2\2\u00e3\u0374\3\2"+
		"\2\2\u00e5\u0377\3\2\2\2\u00e7\u037a\3\2\2\2\u00e9\u037d\3\2\2\2\u00eb"+
		"\u0380\3\2\2\2\u00ed\u0383\3\2\2\2\u00ef\u0386\3\2\2\2\u00f1\u0389\3\2"+
		"\2\2\u00f3\u038c\3\2\2\2\u00f5\u038e\3\2\2\2\u00f7\u0390\3\2\2\2\u00f9"+
		"\u0392\3\2\2\2\u00fb\u0394\3\2\2\2\u00fd\u0396\3\2\2\2\u00ff\u0398\3\2"+
		"\2\2\u0101\u039a\3\2\2\2\u0103\u039c\3\2\2\2\u0105\u039f\3\2\2\2\u0107"+
		"\u03a2\3\2\2\2\u0109\u03a5\3\2\2\2\u010b\u03a8\3\2\2\2\u010d\u03ab\3\2"+
		"\2\2\u010f\u03ae\3\2\2\2\u0111\u03b1\3\2\2\2\u0113\u03b4\3\2\2\2\u0115"+
		"\u03b8\3\2\2\2\u0117\u03bc\3\2\2\2\u0119\u03c1\3\2\2\2\u011b\u03ce\3\2"+
		"\2\2\u011d\u03d6\3\2\2\2\u011f\u03d9\3\2\2\2\u0121\u03df\3\2\2\2\u0123"+
		"\u03ed\3\2\2\2\u0125\u0126\7P\2\2\u0126\u0127\7w\2\2\u0127\u0128\7o\2"+
		"\2\u0128\u0129\7d\2\2\u0129\u012a\7g\2\2\u012a\u012b\7t\2\2\u012b\4\3"+
		"\2\2\2\u012c\u012d\7U\2\2\u012d\u012e\7v\2\2\u012e\u012f\7t\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7p\2\2\u0131\u0132\7i\2\2\u0132\6\3\2\2\2\u0133"+
		"\u0134\7x\2\2\u0134\u0135\7c\2\2\u0135\u0136\7t\2\2\u0136\b\3\2\2\2\u0137"+
		"\u0138\7d\2\2\u0138\u0139\7q\2\2\u0139\u013a\7q\2\2\u013a\u013b\7n\2\2"+
		"\u013b\u013c\7g\2\2\u013c\u013d\7c\2\2\u013d\u013e\7p\2\2\u013e\n\3\2"+
		"\2\2\u013f\u0140\7d\2\2\u0140\u0141\7t\2\2\u0141\u0142\7g\2\2\u0142\u0143"+
		"\7c\2\2\u0143\u0144\7m\2\2\u0144\f\3\2\2\2\u0145\u0146\7d\2\2\u0146\u0147"+
		"\7{\2\2\u0147\u0148\7v\2\2\u0148\u0149\7g\2\2\u0149\16\3\2\2\2\u014a\u014b"+
		"\7e\2\2\u014b\u014c\7c\2\2\u014c\u014d\7u\2\2\u014d\u014e\7g\2\2\u014e"+
		"\20\3\2\2\2\u014f\u0150\7e\2\2\u0150\u0151\7c\2\2\u0151\u0152\7v\2\2\u0152"+
		"\u0153\7e\2\2\u0153\u0154\7j\2\2\u0154\22\3\2\2\2\u0155\u0156\7e\2\2\u0156"+
		"\u0157\7j\2\2\u0157\u0158\7c\2\2\u0158\u0159\7t\2\2\u0159\24\3\2\2\2\u015a"+
		"\u015b\7e\2\2\u015b\u015c\7n\2\2\u015c\u015d\7c\2\2\u015d\u015e\7u\2\2"+
		"\u015e\u015f\7u\2\2\u015f\26\3\2\2\2\u0160\u0161\7e\2\2\u0161\u0162\7"+
		"q\2\2\u0162\u0163\7p\2\2\u0163\u0164\7u\2\2\u0164\u0165\7v\2\2\u0165\30"+
		"\3\2\2\2\u0166\u0167\7e\2\2\u0167\u0168\7q\2\2\u0168\u0169\7p\2\2\u0169"+
		"\u016a\7v\2\2\u016a\u016b\7k\2\2\u016b\u016c\7p\2\2\u016c\u016d\7w\2\2"+
		"\u016d\u016e\7g\2\2\u016e\32\3\2\2\2\u016f\u0170\7f\2\2\u0170\u0171\7"+
		"g\2\2\u0171\u0172\7h\2\2\u0172\u0173\7c\2\2\u0173\u0174\7w\2\2\u0174\u0175"+
		"\7n\2\2\u0175\u0176\7v\2\2\u0176\34\3\2\2\2\u0177\u0178\7f\2\2\u0178\u0179"+
		"\7q\2\2\u0179\36\3\2\2\2\u017a\u017b\7f\2\2\u017b\u017c\7q\2\2\u017c\u017d"+
		"\7w\2\2\u017d\u017e\7d\2\2\u017e\u017f\7n\2\2\u017f\u0180\7g\2\2\u0180"+
		" \3\2\2\2\u0181\u0182\7g\2\2\u0182\u0183\7n\2\2\u0183\u0184\7u\2\2\u0184"+
		"\u0185\7g\2\2\u0185\"\3\2\2\2\u0186\u0187\7g\2\2\u0187\u0188\7p\2\2\u0188"+
		"\u0189\7w\2\2\u0189\u018a\7o\2\2\u018a$\3\2\2\2\u018b\u018c\7g\2\2\u018c"+
		"\u018d\7z\2\2\u018d\u018e\7v\2\2\u018e\u018f\7g\2\2\u018f\u0190\7p\2\2"+
		"\u0190\u0191\7f\2\2\u0191\u0192\7u\2\2\u0192&\3\2\2\2\u0193\u0194\7h\2"+
		"\2\u0194\u0195\7k\2\2\u0195\u0196\7p\2\2\u0196\u0197\7c\2\2\u0197\u0198"+
		"\7n\2\2\u0198(\3\2\2\2\u0199\u019a\7h\2\2\u019a\u019b\7k\2\2\u019b\u019c"+
		"\7p\2\2\u019c\u019d\7c\2\2\u019d\u019e\7n\2\2\u019e\u019f\7n\2\2\u019f"+
		"\u01a0\7{\2\2\u01a0*\3\2\2\2\u01a1\u01a2\7h\2\2\u01a2\u01a3\7n\2\2\u01a3"+
		"\u01a4\7q\2\2\u01a4\u01a5\7c\2\2\u01a5\u01a6\7v\2\2\u01a6,\3\2\2\2\u01a7"+
		"\u01a8\7h\2\2\u01a8\u01a9\7q\2\2\u01a9\u01aa\7t\2\2\u01aa.\3\2\2\2\u01ab"+
		"\u01ac\7k\2\2\u01ac\u01ad\7h\2\2\u01ad\60\3\2\2\2\u01ae\u01af\7k\2\2\u01af"+
		"\u01b0\7o\2\2\u01b0\u01b1\7r\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7g\2\2"+
		"\u01b3\u01b4\7o\2\2\u01b4\u01b5\7g\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7"+
		"\7v\2\2\u01b7\u01b8\7u\2\2\u01b8\62\3\2\2\2\u01b9\u01ba\7k\2\2\u01ba\u01bb"+
		"\7o\2\2\u01bb\u01bc\7r\2\2\u01bc\u01bd\7q\2\2\u01bd\u01be\7t\2\2\u01be"+
		"\u01bf\7v\2\2\u01bf\64\3\2\2\2\u01c0\u01c1\7k\2\2\u01c1\u01c2\7p\2\2\u01c2"+
		"\u01c3\7u\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7c\2\2\u01c5\u01c6\7p\2\2"+
		"\u01c6\u01c7\7e\2\2\u01c7\u01c8\7g\2\2\u01c8\u01c9\7q\2\2\u01c9\u01ca"+
		"\7h\2\2\u01ca\66\3\2\2\2\u01cb\u01cc\7k\2\2\u01cc\u01cd\7p\2\2\u01cd\u01ce"+
		"\7v\2\2\u01ce8\3\2\2\2\u01cf\u01d0\7k\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2"+
		"\7v\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7t\2\2\u01d4\u01d5\7h\2\2\u01d5"+
		"\u01d6\7c\2\2\u01d6\u01d7\7e\2\2\u01d7\u01d8\7g\2\2\u01d8:\3\2\2\2\u01d9"+
		"\u01da\7n\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7i\2\2"+
		"\u01dd<\3\2\2\2\u01de\u01df\7p\2\2\u01df\u01e0\7c\2\2\u01e0\u01e1\7v\2"+
		"\2\u01e1\u01e2\7k\2\2\u01e2\u01e3\7x\2\2\u01e3\u01e4\7g\2\2\u01e4>\3\2"+
		"\2\2\u01e5\u01e6\7p\2\2\u01e6\u01e7\7g\2\2\u01e7\u01e8\7y\2\2\u01e8@\3"+
		"\2\2\2\u01e9\u01ea\7r\2\2\u01ea\u01eb\7c\2\2\u01eb\u01ec\7e\2\2\u01ec"+
		"\u01ed\7m\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7i\2\2\u01ef\u01f0\7g\2\2"+
		"\u01f0B\3\2\2\2\u01f1\u01f2\7r\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7k\2"+
		"\2\u01f4\u01f5\7x\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7v\2\2\u01f7\u01f8"+
		"\7g\2\2\u01f8D\3\2\2\2\u01f9\u01fa\7r\2\2\u01fa\u01fb\7t\2\2\u01fb\u01fc"+
		"\7q\2\2\u01fc\u01fd\7v\2\2\u01fd\u01fe\7g\2\2\u01fe\u01ff\7e\2\2\u01ff"+
		"\u0200\7v\2\2\u0200\u0201\7g\2\2\u0201\u0202\7f\2\2\u0202F\3\2\2\2\u0203"+
		"\u0204\7r\2\2\u0204\u0205\7w\2\2\u0205\u0206\7d\2\2\u0206\u0207\7n\2\2"+
		"\u0207\u0208\7k\2\2\u0208\u0209\7e\2\2\u0209H\3\2\2\2\u020a\u020b\7t\2"+
		"\2\u020b\u020c\7g\2\2\u020c\u020d\7v\2\2\u020d\u020e\7w\2\2\u020e\u020f"+
		"\7t\2\2\u020f\u0210\7p\2\2\u0210J\3\2\2\2\u0211\u0212\7u\2\2\u0212\u0213"+
		"\7j\2\2\u0213\u0214\7q\2\2\u0214\u0215\7t\2\2\u0215\u0216\7v\2\2\u0216"+
		"L\3\2\2\2\u0217\u0218\7u\2\2\u0218\u0219\7w\2\2\u0219\u021a\7r\2\2\u021a"+
		"\u021b\7g\2\2\u021b\u021c\7t\2\2\u021cN\3\2\2\2\u021d\u021e\7u\2\2\u021e"+
		"\u021f\7y\2\2\u021f\u0220\7k\2\2\u0220\u0221\7v\2\2\u0221\u0222\7e\2\2"+
		"\u0222\u0223\7j\2\2\u0223P\3\2\2\2\u0224\u0225\7v\2\2\u0225\u0226\7j\2"+
		"\2\u0226\u0227\7k\2\2\u0227\u0228\7u\2\2\u0228R\3\2\2\2\u0229\u022a\7"+
		"x\2\2\u022a\u022b\7q\2\2\u022b\u022c\7k\2\2\u022c\u022d\7f\2\2\u022dT"+
		"\3\2\2\2\u022e\u022f\7y\2\2\u022f\u0230\7j\2\2\u0230\u0231\7k\2\2\u0231"+
		"\u0232\7n\2\2\u0232\u0233\7g\2\2\u0233V\3\2\2\2\u0234\u0239\5Y-\2\u0235"+
		"\u0239\5[.\2\u0236\u0239\5]/\2\u0237\u0239\5_\60\2\u0238\u0234\3\2\2\2"+
		"\u0238\u0235\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239X\3"+
		"\2\2\2\u023a\u023c\5c\62\2\u023b\u023d\5a\61\2\u023c\u023b\3\2\2\2\u023c"+
		"\u023d\3\2\2\2\u023dZ\3\2\2\2\u023e\u0240\5q9\2\u023f\u0241\5a\61\2\u0240"+
		"\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\\\3\2\2\2\u0242\u0244\5{>\2\u0243"+
		"\u0245\5a\61\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245^\3\2\2\2"+
		"\u0246\u0248\5\u0085C\2\u0247\u0249\5a\61\2\u0248\u0247\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249`\3\2\2\2\u024a\u024b\t\2\2\2\u024bb\3\2\2\2\u024c"+
		"\u0257\7\62\2\2\u024d\u0254\5i\65\2\u024e\u0250\5e\63\2\u024f\u024e\3"+
		"\2\2\2\u024f\u0250\3\2\2\2\u0250\u0255\3\2\2\2\u0251\u0252\5o8\2\u0252"+
		"\u0253\5e\63\2\u0253\u0255\3\2\2\2\u0254\u024f\3\2\2\2\u0254\u0251\3\2"+
		"\2\2\u0255\u0257\3\2\2\2\u0256\u024c\3\2\2\2\u0256\u024d\3\2\2\2\u0257"+
		"d\3\2\2\2\u0258\u025d\5g\64\2\u0259\u025b\5k\66\2\u025a\u0259\3\2\2\2"+
		"\u025a\u025b\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025e\5g\64\2\u025d\u025a"+
		"\3\2\2\2\u025d\u025e\3\2\2\2\u025ef\3\2\2\2\u025f\u0262\7\62\2\2\u0260"+
		"\u0262\5i\65\2\u0261\u025f\3\2\2\2\u0261\u0260\3\2\2\2\u0262h\3\2\2\2"+
		"\u0263\u0264\t\3\2\2\u0264j\3\2\2\2\u0265\u0267\5m\67\2\u0266\u0265\3"+
		"\2\2\2\u0267\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"l\3\2\2\2\u026a\u026d\5g\64\2\u026b\u026d\7a\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026b\3\2\2\2\u026dn\3\2\2\2\u026e\u0270\7a\2\2\u026f\u026e\3\2\2\2\u0270"+
		"\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272p\3\2\2\2"+
		"\u0273\u0274\7\62\2\2\u0274\u0275\t\4\2\2\u0275\u0276\5s:\2\u0276r\3\2"+
		"\2\2\u0277\u027c\5u;\2\u0278\u027a\5w<\2\u0279\u0278\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\5u;\2\u027c\u0279\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027dt\3\2\2\2\u027e\u027f\t\5\2\2\u027fv\3\2\2\2\u0280"+
		"\u0282\5y=\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0281\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284x\3\2\2\2\u0285\u0288\5u;\2\u0286\u0288\7"+
		"a\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288z\3\2\2\2\u0289\u028b"+
		"\7\62\2\2\u028a\u028c\5o8\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028e\5}?\2\u028e|\3\2\2\2\u028f\u0294\5\177@\2\u0290"+
		"\u0292\5\u0081A\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293\u0295\5\177@\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2"+
		"\u0295~\3\2\2\2\u0296\u0297\t\6\2\2\u0297\u0080\3\2\2\2\u0298\u029a\5"+
		"\u0083B\2\u0299\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u0299\3\2\2\2"+
		"\u029b\u029c\3\2\2\2\u029c\u0082\3\2\2\2\u029d\u02a0\5\177@\2\u029e\u02a0"+
		"\7a\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0\u0084\3\2\2\2\u02a1"+
		"\u02a2\7\62\2\2\u02a2\u02a3\t\7\2\2\u02a3\u02a4\5\u0087D\2\u02a4\u0086"+
		"\3\2\2\2\u02a5\u02aa\5\u0089E\2\u02a6\u02a8\5\u008bF\2\u02a7\u02a6\3\2"+
		"\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\5\u0089E\2\u02aa"+
		"\u02a7\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u0088\3\2\2\2\u02ac\u02ad\t\b"+
		"\2\2\u02ad\u008a\3\2\2\2\u02ae\u02b0\5\u008dG\2\u02af\u02ae\3\2\2\2\u02b0"+
		"\u02b1\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u008c\3\2"+
		"\2\2\u02b3\u02b6\5\u0089E\2\u02b4\u02b6\7a\2\2\u02b5\u02b3\3\2\2\2\u02b5"+
		"\u02b4\3\2\2\2\u02b6\u008e\3\2\2\2\u02b7\u02ba\5\u0091I\2\u02b8\u02ba"+
		"\5\u009dO\2\u02b9\u02b7\3\2\2\2\u02b9\u02b8\3\2\2\2\u02ba\u0090\3\2\2"+
		"\2\u02bb\u02bc\5e\63\2\u02bc\u02be\7\60\2\2\u02bd\u02bf\5e\63\2\u02be"+
		"\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02c2\5\u0093"+
		"J\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\3\2\2\2\u02c3"+
		"\u02c5\5\u009bN\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02d7"+
		"\3\2\2\2\u02c6\u02c7\7\60\2\2\u02c7\u02c9\5e\63\2\u02c8\u02ca\5\u0093"+
		"J\2\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cc\3\2\2\2\u02cb"+
		"\u02cd\5\u009bN\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02d7"+
		"\3\2\2\2\u02ce\u02cf\5e\63\2\u02cf\u02d1\5\u0093J\2\u02d0\u02d2\5\u009b"+
		"N\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d7\3\2\2\2\u02d3"+
		"\u02d4\5e\63\2\u02d4\u02d5\5\u009bN\2\u02d5\u02d7\3\2\2\2\u02d6\u02bb"+
		"\3\2\2\2\u02d6\u02c6\3\2\2\2\u02d6\u02ce\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d7"+
		"\u0092\3\2\2\2\u02d8\u02d9\5\u0095K\2\u02d9\u02da\5\u0097L\2\u02da\u0094"+
		"\3\2\2\2\u02db\u02dc\t\t\2\2\u02dc\u0096\3\2\2\2\u02dd\u02df\5\u0099M"+
		"\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e1"+
		"\5e\63\2\u02e1\u0098\3\2\2\2\u02e2\u02e3\t\n\2\2\u02e3\u009a\3\2\2\2\u02e4"+
		"\u02e5\t\13\2\2\u02e5\u009c\3\2\2\2\u02e6\u02e7\5\u009fP\2\u02e7\u02e9"+
		"\5\u00a1Q\2\u02e8\u02ea\5\u009bN\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea\3\2"+
		"\2\2\u02ea\u009e\3\2\2\2\u02eb\u02ed\5q9\2\u02ec\u02ee\7\60\2\2\u02ed"+
		"\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f7\3\2\2\2\u02ef\u02f0\7\62"+
		"\2\2\u02f0\u02f2\t\4\2\2\u02f1\u02f3\5s:\2\u02f2\u02f1\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f5\7\60\2\2\u02f5\u02f7\5s:\2\u02f6"+
		"\u02eb\3\2\2\2\u02f6\u02ef\3\2\2\2\u02f7\u00a0\3\2\2\2\u02f8\u02f9\5\u00a3"+
		"R\2\u02f9\u02fa\5\u0097L\2\u02fa\u00a2\3\2\2\2\u02fb\u02fc\t\f\2\2\u02fc"+
		"\u00a4\3\2\2\2\u02fd\u02fe\7v\2\2\u02fe\u02ff\7t\2\2\u02ff\u0300\7w\2"+
		"\2\u0300\u0307\7g\2\2\u0301\u0302\7h\2\2\u0302\u0303\7c\2\2\u0303\u0304"+
		"\7n\2\2\u0304\u0305\7u\2\2\u0305\u0307\7g\2\2\u0306\u02fd\3\2\2\2\u0306"+
		"\u0301\3\2\2\2\u0307\u00a6\3\2\2\2\u0308\u0309\7)\2\2\u0309\u030a\5\u00a9"+
		"U\2\u030a\u030b\7)\2\2\u030b\u0311\3\2\2\2\u030c\u030d\7)\2\2\u030d\u030e"+
		"\5\u00b1Y\2\u030e\u030f\7)\2\2\u030f\u0311\3\2\2\2\u0310\u0308\3\2\2\2"+
		"\u0310\u030c\3\2\2\2\u0311\u00a8\3\2\2\2\u0312\u0313\n\r\2\2\u0313\u00aa"+
		"\3\2\2\2\u0314\u0316\7$\2\2\u0315\u0317\5\u00adW\2\u0316\u0315\3\2\2\2"+
		"\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0319\7$\2\2\u0319\u00ac"+
		"\3\2\2\2\u031a\u031c\5\u00afX\2\u031b\u031a\3\2\2\2\u031c\u031d\3\2\2"+
		"\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u00ae\3\2\2\2\u031f\u0322"+
		"\n\16\2\2\u0320\u0322\5\u00b1Y\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2"+
		"\2\u0322\u00b0\3\2\2\2\u0323\u0324\7^\2\2\u0324\u0328\t\17\2\2\u0325\u0328"+
		"\5\u00b3Z\2\u0326\u0328\5\u00b7\\\2\u0327\u0323\3\2\2\2\u0327\u0325\3"+
		"\2\2\2\u0327\u0326\3\2\2\2\u0328\u00b2\3\2\2\2\u0329\u032a\7^\2\2\u032a"+
		"\u0335\5\177@\2\u032b\u032c\7^\2\2\u032c\u032d\5\177@\2\u032d\u032e\5"+
		"\177@\2\u032e\u0335\3\2\2\2\u032f\u0330\7^\2\2\u0330\u0331\5\u00b5[\2"+
		"\u0331\u0332\5\177@\2\u0332\u0333\5\177@\2\u0333\u0335\3\2\2\2\u0334\u0329"+
		"\3\2\2\2\u0334\u032b\3\2\2\2\u0334\u032f\3\2\2\2\u0335\u00b4\3\2\2\2\u0336"+
		"\u0337\t\20\2\2\u0337\u00b6\3\2\2\2\u0338\u033a\7^\2\2\u0339\u033b\7w"+
		"\2\2\u033a\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033a\3\2\2\2\u033c"+
		"\u033d\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f\5u;\2\u033f\u0340\5u;\2"+
		"\u0340\u0341\5u;\2\u0341\u0342\5u;\2\u0342\u00b8\3\2\2\2\u0343\u0344\7"+
		"p\2\2\u0344\u0345\7w\2\2\u0345\u0346\7n\2\2\u0346\u0347\7n\2\2\u0347\u00ba"+
		"\3\2\2\2\u0348\u0349\7*\2\2\u0349\u00bc\3\2\2\2\u034a\u034b\7+\2\2\u034b"+
		"\u00be\3\2\2\2\u034c\u034d\7}\2\2\u034d\u00c0\3\2\2\2\u034e\u034f\7\177"+
		"\2\2\u034f\u00c2\3\2\2\2\u0350\u0351\7]\2\2\u0351\u00c4\3\2\2\2\u0352"+
		"\u0353\7_\2\2\u0353\u00c6\3\2\2\2\u0354\u0355\7=\2\2\u0355\u00c8\3\2\2"+
		"\2\u0356\u0357\7.\2\2\u0357\u00ca\3\2\2\2\u0358\u0359\7\60\2\2\u0359\u00cc"+
		"\3\2\2\2\u035a\u035b\7\60\2\2\u035b\u035c\7\60\2\2\u035c\u035d\7\60\2"+
		"\2\u035d\u00ce\3\2\2\2\u035e\u035f\7B\2\2\u035f\u00d0\3\2\2\2\u0360\u0361"+
		"\7<\2\2\u0361\u0362\7<\2\2\u0362\u00d2\3\2\2\2\u0363\u0364\7?\2\2\u0364"+
		"\u00d4\3\2\2\2\u0365\u0366\7@\2\2\u0366\u00d6\3\2\2\2\u0367\u0368\7>\2"+
		"\2\u0368\u00d8\3\2\2\2\u0369\u036a\7#\2\2\u036a\u00da\3\2\2\2\u036b\u036c"+
		"\7\u0080\2\2\u036c\u00dc\3\2\2\2\u036d\u036e\7A\2\2\u036e\u00de\3\2\2"+
		"\2\u036f\u0370\7<\2\2\u0370\u00e0\3\2\2\2\u0371\u0372\7/\2\2\u0372\u0373"+
		"\7@\2\2\u0373\u00e2\3\2\2\2\u0374\u0375\7?\2\2\u0375\u0376\7?\2\2\u0376"+
		"\u00e4\3\2\2\2\u0377\u0378\7>\2\2\u0378\u0379\7?\2\2\u0379\u00e6\3\2\2"+
		"\2\u037a\u037b\7@\2\2\u037b\u037c\7?\2\2\u037c\u00e8\3\2\2\2\u037d\u037e"+
		"\7#\2\2\u037e\u037f\7?\2\2\u037f\u00ea\3\2\2\2\u0380\u0381\7(\2\2\u0381"+
		"\u0382\7(\2\2\u0382\u00ec\3\2\2\2\u0383\u0384\7~\2\2\u0384\u0385\7~\2"+
		"\2\u0385\u00ee\3\2\2\2\u0386\u0387\7-\2\2\u0387\u0388\7-\2\2\u0388\u00f0"+
		"\3\2\2\2\u0389\u038a\7/\2\2\u038a\u038b\7/\2\2\u038b\u00f2\3\2\2\2\u038c"+
		"\u038d\7-\2\2\u038d\u00f4\3\2\2\2\u038e\u038f\7/\2\2\u038f\u00f6\3\2\2"+
		"\2\u0390\u0391\7,\2\2\u0391\u00f8\3\2\2\2\u0392\u0393\7\61\2\2\u0393\u00fa"+
		"\3\2\2\2\u0394\u0395\7(\2\2\u0395\u00fc\3\2\2\2\u0396\u0397\7~\2\2\u0397"+
		"\u00fe\3\2\2\2\u0398\u0399\7`\2\2\u0399\u0100\3\2\2\2\u039a\u039b\7\'"+
		"\2\2\u039b\u0102\3\2\2\2\u039c\u039d\7-\2\2\u039d\u039e\7?\2\2\u039e\u0104"+
		"\3\2\2\2\u039f\u03a0\7/\2\2\u03a0\u03a1\7?\2\2\u03a1\u0106\3\2\2\2\u03a2"+
		"\u03a3\7,\2\2\u03a3\u03a4\7?\2\2\u03a4\u0108\3\2\2\2\u03a5\u03a6\7\61"+
		"\2\2\u03a6\u03a7\7?\2\2\u03a7\u010a\3\2\2\2\u03a8\u03a9\7(\2\2\u03a9\u03aa"+
		"\7?\2\2\u03aa\u010c\3\2\2\2\u03ab\u03ac\7~\2\2\u03ac\u03ad\7?\2\2\u03ad"+
		"\u010e\3\2\2\2\u03ae\u03af\7`\2\2\u03af\u03b0\7?\2\2\u03b0\u0110\3\2\2"+
		"\2\u03b1\u03b2\7\'\2\2\u03b2\u03b3\7?\2\2\u03b3\u0112\3\2\2\2\u03b4\u03b5"+
		"\7>\2\2\u03b5\u03b6\7>\2\2\u03b6\u03b7\7?\2\2\u03b7\u0114\3\2\2\2\u03b8"+
		"\u03b9\7@\2\2\u03b9\u03ba\7@\2\2\u03ba\u03bb\7?\2\2\u03bb\u0116\3\2\2"+
		"\2\u03bc\u03bd\7@\2\2\u03bd\u03be\7@\2\2\u03be\u03bf\7@\2\2\u03bf\u03c0"+
		"\7?\2\2\u03c0\u0118\3\2\2\2\u03c1\u03c5\5\u011b\u008e\2\u03c2\u03c4\5"+
		"\u011d\u008f\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2"+
		"\2\2\u03c5\u03c6\3\2\2\2\u03c6\u011a\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8"+
		"\u03cf\t\21\2\2\u03c9\u03ca\n\22\2\2\u03ca\u03cf\6\u008e\2\2\u03cb\u03cc"+
		"\t\23\2\2\u03cc\u03cd\t\24\2\2\u03cd\u03cf\6\u008e\3\2\u03ce\u03c8\3\2"+
		"\2\2\u03ce\u03c9\3\2\2\2\u03ce\u03cb\3\2\2\2\u03cf\u011c\3\2\2\2\u03d0"+
		"\u03d7\t\25\2\2\u03d1\u03d2\n\22\2\2\u03d2\u03d7\6\u008f\4\2\u03d3\u03d4"+
		"\t\23\2\2\u03d4\u03d5\t\24\2\2\u03d5\u03d7\6\u008f\5\2\u03d6\u03d0\3\2"+
		"\2\2\u03d6\u03d1\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d7\u011e\3\2\2\2\u03d8"+
		"\u03da\t\26\2\2\u03d9\u03d8\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03d9\3"+
		"\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\b\u0090\2\2"+
		"\u03de\u0120\3\2\2\2\u03df\u03e0\7\61\2\2\u03e0\u03e1\7,\2\2\u03e1\u03e5"+
		"\3\2\2\2\u03e2\u03e4\13\2\2\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7\3\2\2\2"+
		"\u03e5\u03e6\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03e8\3\2\2\2\u03e7\u03e5"+
		"\3\2\2\2\u03e8\u03e9\7,\2\2\u03e9\u03ea\7\61\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\b\u0091\3\2\u03ec\u0122\3\2\2\2\u03ed\u03ee\7\61\2\2\u03ee\u03ef"+
		"\7\61\2\2\u03ef\u03f3\3\2\2\2\u03f0\u03f2\n\27\2\2\u03f1\u03f0\3\2\2\2"+
		"\u03f2\u03f5\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f6"+
		"\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\b\u0092\3\2\u03f7\u0124\3\2\2"+
		"\29\2\u0238\u023c\u0240\u0244\u0248\u024f\u0254\u0256\u025a\u025d\u0261"+
		"\u0268\u026c\u0271\u0279\u027c\u0283\u0287\u028b\u0291\u0294\u029b\u029f"+
		"\u02a7\u02aa\u02b1\u02b5\u02b9\u02be\u02c1\u02c4\u02c9\u02cc\u02d1\u02d6"+
		"\u02de\u02e9\u02ed\u02f2\u02f6\u0306\u0310\u0316\u031d\u0321\u0327\u0334"+
		"\u033c\u03c5\u03ce\u03d6\u03db\u03e5\u03f3\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}