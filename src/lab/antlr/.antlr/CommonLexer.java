// Generated from /Users/richard/projects/compiler/compiler/src/main/java/antlr/CommonLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CommonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOLEAN=1, BREAK=2, BYTE=3, CASE=4, CATCH=5, CHAR=6, CLASS=7, CONST=8, 
		CONTINUE=9, DEFAULT=10, DO=11, DOUBLE=12, ELSE=13, ENUM=14, EXTENDS=15, 
		FINAL=16, FINALLY=17, FLOAT=18, FOR=19, IF=20, IMPLEMENTS=21, IMPORT=22, 
		INSTANCEOF=23, INT=24, INTERFACE=25, LONG=26, NATIVE=27, NEW=28, PACKAGE=29, 
		PRIVATE=30, PROTECTED=31, PUBLIC=32, RETURN=33, SHORT=34, SUPER=35, SWITCH=36, 
		THIS=37, VOID=38, WHILE=39, IntegerLiteral=40, FloatingPointLiteral=41, 
		BooleanLiteral=42, CharacterLiteral=43, StringLiteral=44, NullLiteral=45, 
		LPAREN=46, RPAREN=47, LBRACE=48, RBRACE=49, LBRACK=50, RBRACK=51, SEMI=52, 
		COMMA=53, DOT=54, ELLIPSIS=55, AT=56, COLONCOLON=57, ASSIGN=58, GT=59, 
		LT=60, BANG=61, TILDE=62, QUESTION=63, COLON=64, ARROW=65, EQUAL=66, LE=67, 
		GE=68, NOTEQUAL=69, AND=70, OR=71, INC=72, DEC=73, ADD=74, SUB=75, MUL=76, 
		DIV=77, BITAND=78, BITOR=79, CARET=80, MOD=81, ADD_ASSIGN=82, SUB_ASSIGN=83, 
		MUL_ASSIGN=84, DIV_ASSIGN=85, AND_ASSIGN=86, OR_ASSIGN=87, XOR_ASSIGN=88, 
		MOD_ASSIGN=89, LSHIFT_ASSIGN=90, RSHIFT_ASSIGN=91, URSHIFT_ASSIGN=92, 
		Identifier=93, WS=94, COMMENT=95, LINE_COMMENT=96;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
		"INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURN", "SHORT", "SUPER", "SWITCH", "THIS", "VOID", "WHILE", 
		"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ELLIPSIS", "AT", "COLONCOLON", "ASSIGN", "GT", "LT", "BANG", "TILDE", 
		"QUESTION", "COLON", "ARROW", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", 
		"MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN", "Identifier", "Letter", "LetterOrDigit", "WS", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'boolean'", "'break'", "'byte'", "'case'", "'catch'", "'char'", 
		"'class'", "'const'", "'continue'", "'default'", "'do'", "'double'", "'else'", 
		"'enum'", "'extends'", "'final'", "'finally'", "'float'", "'for'", "'if'", 
		"'implements'", "'import'", "'instanceof'", "'int'", "'interface'", "'long'", 
		"'native'", "'new'", "'package'", "'private'", "'protected'", "'public'", 
		"'return'", "'short'", "'super'", "'switch'", "'this'", "'void'", "'while'", 
		null, null, null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'", "';'", "','", "'.'", "'...'", "'@'", "'::'", "'='", "'>'", "'<'", 
		"'!'", "'~'", "'?'", "':'", "'->'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", 
		"'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONST", 
		"CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FINAL", 
		"FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "IMPORT", "INSTANCEOF", 
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


	public CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CommonLexer.g4"; }

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
		case 137:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 138:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2b\u03e0\b\1\4\2\t"+
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
		"\t\u008e\4\u008f\t\u008f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\5)\u0221\n)\3*\3*\5*\u0225\n*\3+\3+\5+\u0229\n+\3,\3,\5,"+
		"\u022d\n,\3-\3-\5-\u0231\n-\3.\3.\3/\3/\3/\5/\u0238\n/\3/\3/\3/\5/\u023d"+
		"\n/\5/\u023f\n/\3\60\3\60\5\60\u0243\n\60\3\60\5\60\u0246\n\60\3\61\3"+
		"\61\5\61\u024a\n\61\3\62\3\62\3\63\6\63\u024f\n\63\r\63\16\63\u0250\3"+
		"\64\3\64\5\64\u0255\n\64\3\65\6\65\u0258\n\65\r\65\16\65\u0259\3\66\3"+
		"\66\3\66\3\66\3\67\3\67\5\67\u0262\n\67\3\67\5\67\u0265\n\67\38\38\39"+
		"\69\u026a\n9\r9\169\u026b\3:\3:\5:\u0270\n:\3;\3;\5;\u0274\n;\3;\3;\3"+
		"<\3<\5<\u027a\n<\3<\5<\u027d\n<\3=\3=\3>\6>\u0282\n>\r>\16>\u0283\3?\3"+
		"?\5?\u0288\n?\3@\3@\3@\3@\3A\3A\5A\u0290\nA\3A\5A\u0293\nA\3B\3B\3C\6"+
		"C\u0298\nC\rC\16C\u0299\3D\3D\5D\u029e\nD\3E\3E\5E\u02a2\nE\3F\3F\3F\5"+
		"F\u02a7\nF\3F\5F\u02aa\nF\3F\5F\u02ad\nF\3F\3F\3F\5F\u02b2\nF\3F\5F\u02b5"+
		"\nF\3F\3F\3F\5F\u02ba\nF\3F\3F\3F\5F\u02bf\nF\3G\3G\3G\3H\3H\3I\5I\u02c7"+
		"\nI\3I\3I\3J\3J\3K\3K\3L\3L\3L\5L\u02d2\nL\3M\3M\5M\u02d6\nM\3M\3M\3M"+
		"\5M\u02db\nM\3M\3M\5M\u02df\nM\3N\3N\3N\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\5P\u02ef\nP\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u02f9\nQ\3R\3R\3S\3S\5S\u02ff"+
		"\nS\3S\3S\3T\6T\u0304\nT\rT\16T\u0305\3U\3U\5U\u030a\nU\3V\3V\3V\3V\5"+
		"V\u0310\nV\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\3W\5W\u031d\nW\3X\3X\3Y\3Y\6"+
		"Y\u0323\nY\rY\16Y\u0324\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3[\3[\3\\\3\\\3"+
		"]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3d\3d\3e\3e\3f\3f\3f\3"+
		"g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3n\3o\3o\3o\3p\3p\3p\3"+
		"q\3q\3q\3r\3r\3r\3s\3s\3s\3t\3t\3t\3u\3u\3u\3v\3v\3v\3w\3w\3x\3x\3y\3"+
		"y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\3\u0086\3\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\7\u008a\u03ac\n\u008a"+
		"\f\u008a\16\u008a\u03af\13\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\5\u008b\u03b7\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\5\u008c\u03bf\n\u008c\3\u008d\6\u008d\u03c2\n\u008d\r\u008d\16"+
		"\u008d\u03c3\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e\u03cc"+
		"\n\u008e\f\u008e\16\u008e\u03cf\13\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u03da\n\u008f\f\u008f"+
		"\16\u008f\u03dd\13\u008f\3\u008f\3\u008f\3\u03cd\2\u0090\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S\2U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2"+
		"y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089+\u008b\2\u008d\2"+
		"\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f"+
		",\u00a1-\u00a3\2\u00a5.\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"\2\u00b3/\u00b5\60\u00b7\61\u00b9\62\u00bb\63\u00bd\64\u00bf\65\u00c1"+
		"\66\u00c3\67\u00c58\u00c79\u00c9:\u00cb;\u00cd<\u00cf=\u00d1>\u00d3?\u00d5"+
		"@\u00d7A\u00d9B\u00dbC\u00ddD\u00dfE\u00e1F\u00e3G\u00e5H\u00e7I\u00e9"+
		"J\u00ebK\u00edL\u00efM\u00f1N\u00f3O\u00f5P\u00f7Q\u00f9R\u00fbS\u00fd"+
		"T\u00ffU\u0101V\u0103W\u0105X\u0107Y\u0109Z\u010b[\u010d\\\u010f]\u0111"+
		"^\u0113_\u0115\2\u0117\2\u0119`\u011ba\u011db\3\2\30\4\2NNnn\3\2\63;\4"+
		"\2ZZzz\5\2\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHf"+
		"fhh\4\2RRrr\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3"+
		"\2\62\65\6\2&&C\\aac|\4\2\2\u0081\ud802\udc01\3\2\ud802\udc01\3\2\udc02"+
		"\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u03ef\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a5\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2"+
		"\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7"+
		"\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2"+
		"\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9"+
		"\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2\2\2\u00e1\3\2\2"+
		"\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb"+
		"\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2\2\2\u00f3\3\2\2"+
		"\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb\3\2\2\2\2\u00fd"+
		"\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2\2\2\u0105\3\2\2"+
		"\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2\2\2\u010d\3\2\2\2\2\u010f"+
		"\3\2\2\2\2\u0111\3\2\2\2\2\u0113\3\2\2\2\2\u0119\3\2\2\2\2\u011b\3\2\2"+
		"\2\2\u011d\3\2\2\2\3\u011f\3\2\2\2\5\u0127\3\2\2\2\7\u012d\3\2\2\2\t\u0132"+
		"\3\2\2\2\13\u0137\3\2\2\2\r\u013d\3\2\2\2\17\u0142\3\2\2\2\21\u0148\3"+
		"\2\2\2\23\u014e\3\2\2\2\25\u0157\3\2\2\2\27\u015f\3\2\2\2\31\u0162\3\2"+
		"\2\2\33\u0169\3\2\2\2\35\u016e\3\2\2\2\37\u0173\3\2\2\2!\u017b\3\2\2\2"+
		"#\u0181\3\2\2\2%\u0189\3\2\2\2\'\u018f\3\2\2\2)\u0193\3\2\2\2+\u0196\3"+
		"\2\2\2-\u01a1\3\2\2\2/\u01a8\3\2\2\2\61\u01b3\3\2\2\2\63\u01b7\3\2\2\2"+
		"\65\u01c1\3\2\2\2\67\u01c6\3\2\2\29\u01cd\3\2\2\2;\u01d1\3\2\2\2=\u01d9"+
		"\3\2\2\2?\u01e1\3\2\2\2A\u01eb\3\2\2\2C\u01f2\3\2\2\2E\u01f9\3\2\2\2G"+
		"\u01ff\3\2\2\2I\u0205\3\2\2\2K\u020c\3\2\2\2M\u0211\3\2\2\2O\u0216\3\2"+
		"\2\2Q\u0220\3\2\2\2S\u0222\3\2\2\2U\u0226\3\2\2\2W\u022a\3\2\2\2Y\u022e"+
		"\3\2\2\2[\u0232\3\2\2\2]\u023e\3\2\2\2_\u0240\3\2\2\2a\u0249\3\2\2\2c"+
		"\u024b\3\2\2\2e\u024e\3\2\2\2g\u0254\3\2\2\2i\u0257\3\2\2\2k\u025b\3\2"+
		"\2\2m\u025f\3\2\2\2o\u0266\3\2\2\2q\u0269\3\2\2\2s\u026f\3\2\2\2u\u0271"+
		"\3\2\2\2w\u0277\3\2\2\2y\u027e\3\2\2\2{\u0281\3\2\2\2}\u0287\3\2\2\2\177"+
		"\u0289\3\2\2\2\u0081\u028d\3\2\2\2\u0083\u0294\3\2\2\2\u0085\u0297\3\2"+
		"\2\2\u0087\u029d\3\2\2\2\u0089\u02a1\3\2\2\2\u008b\u02be\3\2\2\2\u008d"+
		"\u02c0\3\2\2\2\u008f\u02c3\3\2\2\2\u0091\u02c6\3\2\2\2\u0093\u02ca\3\2"+
		"\2\2\u0095\u02cc\3\2\2\2\u0097\u02ce\3\2\2\2\u0099\u02de\3\2\2\2\u009b"+
		"\u02e0\3\2\2\2\u009d\u02e3\3\2\2\2\u009f\u02ee\3\2\2\2\u00a1\u02f8\3\2"+
		"\2\2\u00a3\u02fa\3\2\2\2\u00a5\u02fc\3\2\2\2\u00a7\u0303\3\2\2\2\u00a9"+
		"\u0309\3\2\2\2\u00ab\u030f\3\2\2\2\u00ad\u031c\3\2\2\2\u00af\u031e\3\2"+
		"\2\2\u00b1\u0320\3\2\2\2\u00b3\u032b\3\2\2\2\u00b5\u0330\3\2\2\2\u00b7"+
		"\u0332\3\2\2\2\u00b9\u0334\3\2\2\2\u00bb\u0336\3\2\2\2\u00bd\u0338\3\2"+
		"\2\2\u00bf\u033a\3\2\2\2\u00c1\u033c\3\2\2\2\u00c3\u033e\3\2\2\2\u00c5"+
		"\u0340\3\2\2\2\u00c7\u0342\3\2\2\2\u00c9\u0346\3\2\2\2\u00cb\u0348\3\2"+
		"\2\2\u00cd\u034b\3\2\2\2\u00cf\u034d\3\2\2\2\u00d1\u034f\3\2\2\2\u00d3"+
		"\u0351\3\2\2\2\u00d5\u0353\3\2\2\2\u00d7\u0355\3\2\2\2\u00d9\u0357\3\2"+
		"\2\2\u00db\u0359\3\2\2\2\u00dd\u035c\3\2\2\2\u00df\u035f\3\2\2\2\u00e1"+
		"\u0362\3\2\2\2\u00e3\u0365\3\2\2\2\u00e5\u0368\3\2\2\2\u00e7\u036b\3\2"+
		"\2\2\u00e9\u036e\3\2\2\2\u00eb\u0371\3\2\2\2\u00ed\u0374\3\2\2\2\u00ef"+
		"\u0376\3\2\2\2\u00f1\u0378\3\2\2\2\u00f3\u037a\3\2\2\2\u00f5\u037c\3\2"+
		"\2\2\u00f7\u037e\3\2\2\2\u00f9\u0380\3\2\2\2\u00fb\u0382\3\2\2\2\u00fd"+
		"\u0384\3\2\2\2\u00ff\u0387\3\2\2\2\u0101\u038a\3\2\2\2\u0103\u038d\3\2"+
		"\2\2\u0105\u0390\3\2\2\2\u0107\u0393\3\2\2\2\u0109\u0396\3\2\2\2\u010b"+
		"\u0399\3\2\2\2\u010d\u039c\3\2\2\2\u010f\u03a0\3\2\2\2\u0111\u03a4\3\2"+
		"\2\2\u0113\u03a9\3\2\2\2\u0115\u03b6\3\2\2\2\u0117\u03be\3\2\2\2\u0119"+
		"\u03c1\3\2\2\2\u011b\u03c7\3\2\2\2\u011d\u03d5\3\2\2\2\u011f\u0120\7d"+
		"\2\2\u0120\u0121\7q\2\2\u0121\u0122\7q\2\2\u0122\u0123\7n\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7c\2\2\u0125\u0126\7p\2\2\u0126\4\3\2\2\2\u0127\u0128"+
		"\7d\2\2\u0128\u0129\7t\2\2\u0129\u012a\7g\2\2\u012a\u012b\7c\2\2\u012b"+
		"\u012c\7m\2\2\u012c\6\3\2\2\2\u012d\u012e\7d\2\2\u012e\u012f\7{\2\2\u012f"+
		"\u0130\7v\2\2\u0130\u0131\7g\2\2\u0131\b\3\2\2\2\u0132\u0133\7e\2\2\u0133"+
		"\u0134\7c\2\2\u0134\u0135\7u\2\2\u0135\u0136\7g\2\2\u0136\n\3\2\2\2\u0137"+
		"\u0138\7e\2\2\u0138\u0139\7c\2\2\u0139\u013a\7v\2\2\u013a\u013b\7e\2\2"+
		"\u013b\u013c\7j\2\2\u013c\f\3\2\2\2\u013d\u013e\7e\2\2\u013e\u013f\7j"+
		"\2\2\u013f\u0140\7c\2\2\u0140\u0141\7t\2\2\u0141\16\3\2\2\2\u0142\u0143"+
		"\7e\2\2\u0143\u0144\7n\2\2\u0144\u0145\7c\2\2\u0145\u0146\7u\2\2\u0146"+
		"\u0147\7u\2\2\u0147\20\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a\7q\2\2\u014a"+
		"\u014b\7p\2\2\u014b\u014c\7u\2\2\u014c\u014d\7v\2\2\u014d\22\3\2\2\2\u014e"+
		"\u014f\7e\2\2\u014f\u0150\7q\2\2\u0150\u0151\7p\2\2\u0151\u0152\7v\2\2"+
		"\u0152\u0153\7k\2\2\u0153\u0154\7p\2\2\u0154\u0155\7w\2\2\u0155\u0156"+
		"\7g\2\2\u0156\24\3\2\2\2\u0157\u0158\7f\2\2\u0158\u0159\7g\2\2\u0159\u015a"+
		"\7h\2\2\u015a\u015b\7c\2\2\u015b\u015c\7w\2\2\u015c\u015d\7n\2\2\u015d"+
		"\u015e\7v\2\2\u015e\26\3\2\2\2\u015f\u0160\7f\2\2\u0160\u0161\7q\2\2\u0161"+
		"\30\3\2\2\2\u0162\u0163\7f\2\2\u0163\u0164\7q\2\2\u0164\u0165\7w\2\2\u0165"+
		"\u0166\7d\2\2\u0166\u0167\7n\2\2\u0167\u0168\7g\2\2\u0168\32\3\2\2\2\u0169"+
		"\u016a\7g\2\2\u016a\u016b\7n\2\2\u016b\u016c\7u\2\2\u016c\u016d\7g\2\2"+
		"\u016d\34\3\2\2\2\u016e\u016f\7g\2\2\u016f\u0170\7p\2\2\u0170\u0171\7"+
		"w\2\2\u0171\u0172\7o\2\2\u0172\36\3\2\2\2\u0173\u0174\7g\2\2\u0174\u0175"+
		"\7z\2\2\u0175\u0176\7v\2\2\u0176\u0177\7g\2\2\u0177\u0178\7p\2\2\u0178"+
		"\u0179\7f\2\2\u0179\u017a\7u\2\2\u017a \3\2\2\2\u017b\u017c\7h\2\2\u017c"+
		"\u017d\7k\2\2\u017d\u017e\7p\2\2\u017e\u017f\7c\2\2\u017f\u0180\7n\2\2"+
		"\u0180\"\3\2\2\2\u0181\u0182\7h\2\2\u0182\u0183\7k\2\2\u0183\u0184\7p"+
		"\2\2\u0184\u0185\7c\2\2\u0185\u0186\7n\2\2\u0186\u0187\7n\2\2\u0187\u0188"+
		"\7{\2\2\u0188$\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7n\2\2\u018b\u018c"+
		"\7q\2\2\u018c\u018d\7c\2\2\u018d\u018e\7v\2\2\u018e&\3\2\2\2\u018f\u0190"+
		"\7h\2\2\u0190\u0191\7q\2\2\u0191\u0192\7t\2\2\u0192(\3\2\2\2\u0193\u0194"+
		"\7k\2\2\u0194\u0195\7h\2\2\u0195*\3\2\2\2\u0196\u0197\7k\2\2\u0197\u0198"+
		"\7o\2\2\u0198\u0199\7r\2\2\u0199\u019a\7n\2\2\u019a\u019b\7g\2\2\u019b"+
		"\u019c\7o\2\2\u019c\u019d\7g\2\2\u019d\u019e\7p\2\2\u019e\u019f\7v\2\2"+
		"\u019f\u01a0\7u\2\2\u01a0,\3\2\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7o\2"+
		"\2\u01a3\u01a4\7r\2\2\u01a4\u01a5\7q\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7"+
		"\7v\2\2\u01a7.\3\2\2\2\u01a8\u01a9\7k\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab"+
		"\7u\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7p\2\2\u01ae"+
		"\u01af\7e\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7q\2\2\u01b1\u01b2\7h\2\2"+
		"\u01b2\60\3\2\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7p\2\2\u01b5\u01b6\7"+
		"v\2\2\u01b6\62\3\2\2\2\u01b7\u01b8\7k\2\2\u01b8\u01b9\7p\2\2\u01b9\u01ba"+
		"\7v\2\2\u01ba\u01bb\7g\2\2\u01bb\u01bc\7t\2\2\u01bc\u01bd\7h\2\2\u01bd"+
		"\u01be\7c\2\2\u01be\u01bf\7e\2\2\u01bf\u01c0\7g\2\2\u01c0\64\3\2\2\2\u01c1"+
		"\u01c2\7n\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7p\2\2\u01c4\u01c5\7i\2\2"+
		"\u01c5\66\3\2\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7c\2\2\u01c8\u01c9\7"+
		"v\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7x\2\2\u01cb\u01cc\7g\2\2\u01cc8"+
		"\3\2\2\2\u01cd\u01ce\7p\2\2\u01ce\u01cf\7g\2\2\u01cf\u01d0\7y\2\2\u01d0"+
		":\3\2\2\2\u01d1\u01d2\7r\2\2\u01d2\u01d3\7c\2\2\u01d3\u01d4\7e\2\2\u01d4"+
		"\u01d5\7m\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7i\2\2\u01d7\u01d8\7g\2\2"+
		"\u01d8<\3\2\2\2\u01d9\u01da\7r\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7k\2"+
		"\2\u01dc\u01dd\7x\2\2\u01dd\u01de\7c\2\2\u01de\u01df\7v\2\2\u01df\u01e0"+
		"\7g\2\2\u01e0>\3\2\2\2\u01e1\u01e2\7r\2\2\u01e2\u01e3\7t\2\2\u01e3\u01e4"+
		"\7q\2\2\u01e4\u01e5\7v\2\2\u01e5\u01e6\7g\2\2\u01e6\u01e7\7e\2\2\u01e7"+
		"\u01e8\7v\2\2\u01e8\u01e9\7g\2\2\u01e9\u01ea\7f\2\2\u01ea@\3\2\2\2\u01eb"+
		"\u01ec\7r\2\2\u01ec\u01ed\7w\2\2\u01ed\u01ee\7d\2\2\u01ee\u01ef\7n\2\2"+
		"\u01ef\u01f0\7k\2\2\u01f0\u01f1\7e\2\2\u01f1B\3\2\2\2\u01f2\u01f3\7t\2"+
		"\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7v\2\2\u01f5\u01f6\7w\2\2\u01f6\u01f7"+
		"\7t\2\2\u01f7\u01f8\7p\2\2\u01f8D\3\2\2\2\u01f9\u01fa\7u\2\2\u01fa\u01fb"+
		"\7j\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7v\2\2\u01fe"+
		"F\3\2\2\2\u01ff\u0200\7u\2\2\u0200\u0201\7w\2\2\u0201\u0202\7r\2\2\u0202"+
		"\u0203\7g\2\2\u0203\u0204\7t\2\2\u0204H\3\2\2\2\u0205\u0206\7u\2\2\u0206"+
		"\u0207\7y\2\2\u0207\u0208\7k\2\2\u0208\u0209\7v\2\2\u0209\u020a\7e\2\2"+
		"\u020a\u020b\7j\2\2\u020bJ\3\2\2\2\u020c\u020d\7v\2\2\u020d\u020e\7j\2"+
		"\2\u020e\u020f\7k\2\2\u020f\u0210\7u\2\2\u0210L\3\2\2\2\u0211\u0212\7"+
		"x\2\2\u0212\u0213\7q\2\2\u0213\u0214\7k\2\2\u0214\u0215\7f\2\2\u0215N"+
		"\3\2\2\2\u0216\u0217\7y\2\2\u0217\u0218\7j\2\2\u0218\u0219\7k\2\2\u0219"+
		"\u021a\7n\2\2\u021a\u021b\7g\2\2\u021bP\3\2\2\2\u021c\u0221\5S*\2\u021d"+
		"\u0221\5U+\2\u021e\u0221\5W,\2\u021f\u0221\5Y-\2\u0220\u021c\3\2\2\2\u0220"+
		"\u021d\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u021f\3\2\2\2\u0221R\3\2\2\2"+
		"\u0222\u0224\5]/\2\u0223\u0225\5[.\2\u0224\u0223\3\2\2\2\u0224\u0225\3"+
		"\2\2\2\u0225T\3\2\2\2\u0226\u0228\5k\66\2\u0227\u0229\5[.\2\u0228\u0227"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229V\3\2\2\2\u022a\u022c\5u;\2\u022b\u022d"+
		"\5[.\2\u022c\u022b\3\2\2\2\u022c\u022d\3\2\2\2\u022dX\3\2\2\2\u022e\u0230"+
		"\5\177@\2\u022f\u0231\5[.\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"Z\3\2\2\2\u0232\u0233\t\2\2\2\u0233\\\3\2\2\2\u0234\u023f\7\62\2\2\u0235"+
		"\u023c\5c\62\2\u0236\u0238\5_\60\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u023d\3\2\2\2\u0239\u023a\5i\65\2\u023a\u023b\5_\60\2\u023b"+
		"\u023d\3\2\2\2\u023c\u0237\3\2\2\2\u023c\u0239\3\2\2\2\u023d\u023f\3\2"+
		"\2\2\u023e\u0234\3\2\2\2\u023e\u0235\3\2\2\2\u023f^\3\2\2\2\u0240\u0245"+
		"\5a\61\2\u0241\u0243\5e\63\2\u0242\u0241\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0246\5a\61\2\u0245\u0242\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246`\3\2\2\2\u0247\u024a\7\62\2\2\u0248\u024a\5c\62\2\u0249\u0247"+
		"\3\2\2\2\u0249\u0248\3\2\2\2\u024ab\3\2\2\2\u024b\u024c\t\3\2\2\u024c"+
		"d\3\2\2\2\u024d\u024f\5g\64\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2"+
		"\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251f\3\2\2\2\u0252\u0255\5"+
		"a\61\2\u0253\u0255\7a\2\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2\2\2\u0255"+
		"h\3\2\2\2\u0256\u0258\7a\2\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025aj\3\2\2\2\u025b\u025c\7\62\2\2"+
		"\u025c\u025d\t\4\2\2\u025d\u025e\5m\67\2\u025el\3\2\2\2\u025f\u0264\5"+
		"o8\2\u0260\u0262\5q9\2\u0261\u0260\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0263"+
		"\3\2\2\2\u0263\u0265\5o8\2\u0264\u0261\3\2\2\2\u0264\u0265\3\2\2\2\u0265"+
		"n\3\2\2\2\u0266\u0267\t\5\2\2\u0267p\3\2\2\2\u0268\u026a\5s:\2\u0269\u0268"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"r\3\2\2\2\u026d\u0270\5o8\2\u026e\u0270\7a\2\2\u026f\u026d\3\2\2\2\u026f"+
		"\u026e\3\2\2\2\u0270t\3\2\2\2\u0271\u0273\7\62\2\2\u0272\u0274\5i\65\2"+
		"\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0276"+
		"\5w<\2\u0276v\3\2\2\2\u0277\u027c\5y=\2\u0278\u027a\5{>\2\u0279\u0278"+
		"\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027d\5y=\2\u027c"+
		"\u0279\3\2\2\2\u027c\u027d\3\2\2\2\u027dx\3\2\2\2\u027e\u027f\t\6\2\2"+
		"\u027fz\3\2\2\2\u0280\u0282\5}?\2\u0281\u0280\3\2\2\2\u0282\u0283\3\2"+
		"\2\2\u0283\u0281\3\2\2\2\u0283\u0284\3\2\2\2\u0284|\3\2\2\2\u0285\u0288"+
		"\5y=\2\u0286\u0288\7a\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288"+
		"~\3\2\2\2\u0289\u028a\7\62\2\2\u028a\u028b\t\7\2\2\u028b\u028c\5\u0081"+
		"A\2\u028c\u0080\3\2\2\2\u028d\u0292\5\u0083B\2\u028e\u0290\5\u0085C\2"+
		"\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293"+
		"\5\u0083B\2\u0292\u028f\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0082\3\2\2"+
		"\2\u0294\u0295\t\b\2\2\u0295\u0084\3\2\2\2\u0296\u0298\5\u0087D\2\u0297"+
		"\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u0086\3\2\2\2\u029b\u029e\5\u0083B\2\u029c\u029e\7a\2\2\u029d"+
		"\u029b\3\2\2\2\u029d\u029c\3\2\2\2\u029e\u0088\3\2\2\2\u029f\u02a2\5\u008b"+
		"F\2\u02a0\u02a2\5\u0097L\2\u02a1\u029f\3\2\2\2\u02a1\u02a0\3\2\2\2\u02a2"+
		"\u008a\3\2\2\2\u02a3\u02a4\5_\60\2\u02a4\u02a6\7\60\2\2\u02a5\u02a7\5"+
		"_\60\2\u02a6\u02a5\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u02aa\5\u008dG\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac"+
		"\3\2\2\2\u02ab\u02ad\5\u0095K\2\u02ac\u02ab\3\2\2\2\u02ac\u02ad\3\2\2"+
		"\2\u02ad\u02bf\3\2\2\2\u02ae\u02af\7\60\2\2\u02af\u02b1\5_\60\2\u02b0"+
		"\u02b2\5\u008dG\2\u02b1\u02b0\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4"+
		"\3\2\2\2\u02b3\u02b5\5\u0095K\2\u02b4\u02b3\3\2\2\2\u02b4\u02b5\3\2\2"+
		"\2\u02b5\u02bf\3\2\2\2\u02b6\u02b7\5_\60\2\u02b7\u02b9\5\u008dG\2\u02b8"+
		"\u02ba\5\u0095K\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bf"+
		"\3\2\2\2\u02bb\u02bc\5_\60\2\u02bc\u02bd\5\u0095K\2\u02bd\u02bf\3\2\2"+
		"\2\u02be\u02a3\3\2\2\2\u02be\u02ae\3\2\2\2\u02be\u02b6\3\2\2\2\u02be\u02bb"+
		"\3\2\2\2\u02bf\u008c\3\2\2\2\u02c0\u02c1\5\u008fH\2\u02c1\u02c2\5\u0091"+
		"I\2\u02c2\u008e\3\2\2\2\u02c3\u02c4\t\t\2\2\u02c4\u0090\3\2\2\2\u02c5"+
		"\u02c7\5\u0093J\2\u02c6\u02c5\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8"+
		"\3\2\2\2\u02c8\u02c9\5_\60\2\u02c9\u0092\3\2\2\2\u02ca\u02cb\t\n\2\2\u02cb"+
		"\u0094\3\2\2\2\u02cc\u02cd\t\13\2\2\u02cd\u0096\3\2\2\2\u02ce\u02cf\5"+
		"\u0099M\2\u02cf\u02d1\5\u009bN\2\u02d0\u02d2\5\u0095K\2\u02d1\u02d0\3"+
		"\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u0098\3\2\2\2\u02d3\u02d5\5k\66\2\u02d4"+
		"\u02d6\7\60\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02df\3"+
		"\2\2\2\u02d7\u02d8\7\62\2\2\u02d8\u02da\t\4\2\2\u02d9\u02db\5m\67\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7\60"+
		"\2\2\u02dd\u02df\5m\67\2\u02de\u02d3\3\2\2\2\u02de\u02d7\3\2\2\2\u02df"+
		"\u009a\3\2\2\2\u02e0\u02e1\5\u009dO\2\u02e1\u02e2\5\u0091I\2\u02e2\u009c"+
		"\3\2\2\2\u02e3\u02e4\t\f\2\2\u02e4\u009e\3\2\2\2\u02e5\u02e6\7v\2\2\u02e6"+
		"\u02e7\7t\2\2\u02e7\u02e8\7w\2\2\u02e8\u02ef\7g\2\2\u02e9\u02ea\7h\2\2"+
		"\u02ea\u02eb\7c\2\2\u02eb\u02ec\7n\2\2\u02ec\u02ed\7u\2\2\u02ed\u02ef"+
		"\7g\2\2\u02ee\u02e5\3\2\2\2\u02ee\u02e9\3\2\2\2\u02ef\u00a0\3\2\2\2\u02f0"+
		"\u02f1\7)\2\2\u02f1\u02f2\5\u00a3R\2\u02f2\u02f3\7)\2\2\u02f3\u02f9\3"+
		"\2\2\2\u02f4\u02f5\7)\2\2\u02f5\u02f6\5\u00abV\2\u02f6\u02f7\7)\2\2\u02f7"+
		"\u02f9\3\2\2\2\u02f8\u02f0\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9\u00a2\3\2"+
		"\2\2\u02fa\u02fb\n\r\2\2\u02fb\u00a4\3\2\2\2\u02fc\u02fe\7$\2\2\u02fd"+
		"\u02ff\5\u00a7T\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0301\7$\2\2\u0301\u00a6\3\2\2\2\u0302\u0304\5\u00a9U\2"+
		"\u0303\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306"+
		"\3\2\2\2\u0306\u00a8\3\2\2\2\u0307\u030a\n\16\2\2\u0308\u030a\5\u00ab"+
		"V\2\u0309\u0307\3\2\2\2\u0309\u0308\3\2\2\2\u030a\u00aa\3\2\2\2\u030b"+
		"\u030c\7^\2\2\u030c\u0310\t\17\2\2\u030d\u0310\5\u00adW\2\u030e\u0310"+
		"\5\u00b1Y\2\u030f\u030b\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u030e\3\2\2"+
		"\2\u0310\u00ac\3\2\2\2\u0311\u0312\7^\2\2\u0312\u031d\5y=\2\u0313\u0314"+
		"\7^\2\2\u0314\u0315\5y=\2\u0315\u0316\5y=\2\u0316\u031d\3\2\2\2\u0317"+
		"\u0318\7^\2\2\u0318\u0319\5\u00afX\2\u0319\u031a\5y=\2\u031a\u031b\5y"+
		"=\2\u031b\u031d\3\2\2\2\u031c\u0311\3\2\2\2\u031c\u0313\3\2\2\2\u031c"+
		"\u0317\3\2\2\2\u031d\u00ae\3\2\2\2\u031e\u031f\t\20\2\2\u031f\u00b0\3"+
		"\2\2\2\u0320\u0322\7^\2\2\u0321\u0323\7w\2\2\u0322\u0321\3\2\2\2\u0323"+
		"\u0324\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2"+
		"\2\2\u0326\u0327\5o8\2\u0327\u0328\5o8\2\u0328\u0329\5o8\2\u0329\u032a"+
		"\5o8\2\u032a\u00b2\3\2\2\2\u032b\u032c\7p\2\2\u032c\u032d\7w\2\2\u032d"+
		"\u032e\7n\2\2\u032e\u032f\7n\2\2\u032f\u00b4\3\2\2\2\u0330\u0331\7*\2"+
		"\2\u0331\u00b6\3\2\2\2\u0332\u0333\7+\2\2\u0333\u00b8\3\2\2\2\u0334\u0335"+
		"\7}\2\2\u0335\u00ba\3\2\2\2\u0336\u0337\7\177\2\2\u0337\u00bc\3\2\2\2"+
		"\u0338\u0339\7]\2\2\u0339\u00be\3\2\2\2\u033a\u033b\7_\2\2\u033b\u00c0"+
		"\3\2\2\2\u033c\u033d\7=\2\2\u033d\u00c2\3\2\2\2\u033e\u033f\7.\2\2\u033f"+
		"\u00c4\3\2\2\2\u0340\u0341\7\60\2\2\u0341\u00c6\3\2\2\2\u0342\u0343\7"+
		"\60\2\2\u0343\u0344\7\60\2\2\u0344\u0345\7\60\2\2\u0345\u00c8\3\2\2\2"+
		"\u0346\u0347\7B\2\2\u0347\u00ca\3\2\2\2\u0348\u0349\7<\2\2\u0349\u034a"+
		"\7<\2\2\u034a\u00cc\3\2\2\2\u034b\u034c\7?\2\2\u034c\u00ce\3\2\2\2\u034d"+
		"\u034e\7@\2\2\u034e\u00d0\3\2\2\2\u034f\u0350\7>\2\2\u0350\u00d2\3\2\2"+
		"\2\u0351\u0352\7#\2\2\u0352\u00d4\3\2\2\2\u0353\u0354\7\u0080\2\2\u0354"+
		"\u00d6\3\2\2\2\u0355\u0356\7A\2\2\u0356\u00d8\3\2\2\2\u0357\u0358\7<\2"+
		"\2\u0358\u00da\3\2\2\2\u0359\u035a\7/\2\2\u035a\u035b\7@\2\2\u035b\u00dc"+
		"\3\2\2\2\u035c\u035d\7?\2\2\u035d\u035e\7?\2\2\u035e\u00de\3\2\2\2\u035f"+
		"\u0360\7>\2\2\u0360\u0361\7?\2\2\u0361\u00e0\3\2\2\2\u0362\u0363\7@\2"+
		"\2\u0363\u0364\7?\2\2\u0364\u00e2\3\2\2\2\u0365\u0366\7#\2\2\u0366\u0367"+
		"\7?\2\2\u0367\u00e4\3\2\2\2\u0368\u0369\7(\2\2\u0369\u036a\7(\2\2\u036a"+
		"\u00e6\3\2\2\2\u036b\u036c\7~\2\2\u036c\u036d\7~\2\2\u036d\u00e8\3\2\2"+
		"\2\u036e\u036f\7-\2\2\u036f\u0370\7-\2\2\u0370\u00ea\3\2\2\2\u0371\u0372"+
		"\7/\2\2\u0372\u0373\7/\2\2\u0373\u00ec\3\2\2\2\u0374\u0375\7-\2\2\u0375"+
		"\u00ee\3\2\2\2\u0376\u0377\7/\2\2\u0377\u00f0\3\2\2\2\u0378\u0379\7,\2"+
		"\2\u0379\u00f2\3\2\2\2\u037a\u037b\7\61\2\2\u037b\u00f4\3\2\2\2\u037c"+
		"\u037d\7(\2\2\u037d\u00f6\3\2\2\2\u037e\u037f\7~\2\2\u037f\u00f8\3\2\2"+
		"\2\u0380\u0381\7`\2\2\u0381\u00fa\3\2\2\2\u0382\u0383\7\'\2\2\u0383\u00fc"+
		"\3\2\2\2\u0384\u0385\7-\2\2\u0385\u0386\7?\2\2\u0386\u00fe\3\2\2\2\u0387"+
		"\u0388\7/\2\2\u0388\u0389\7?\2\2\u0389\u0100\3\2\2\2\u038a\u038b\7,\2"+
		"\2\u038b\u038c\7?\2\2\u038c\u0102\3\2\2\2\u038d\u038e\7\61\2\2\u038e\u038f"+
		"\7?\2\2\u038f\u0104\3\2\2\2\u0390\u0391\7(\2\2\u0391\u0392\7?\2\2\u0392"+
		"\u0106\3\2\2\2\u0393\u0394\7~\2\2\u0394\u0395\7?\2\2\u0395\u0108\3\2\2"+
		"\2\u0396\u0397\7`\2\2\u0397\u0398\7?\2\2\u0398\u010a\3\2\2\2\u0399\u039a"+
		"\7\'\2\2\u039a\u039b\7?\2\2\u039b\u010c\3\2\2\2\u039c\u039d\7>\2\2\u039d"+
		"\u039e\7>\2\2\u039e\u039f\7?\2\2\u039f\u010e\3\2\2\2\u03a0\u03a1\7@\2"+
		"\2\u03a1\u03a2\7@\2\2\u03a2\u03a3\7?\2\2\u03a3\u0110\3\2\2\2\u03a4\u03a5"+
		"\7@\2\2\u03a5\u03a6\7@\2\2\u03a6\u03a7\7@\2\2\u03a7\u03a8\7?\2\2\u03a8"+
		"\u0112\3\2\2\2\u03a9\u03ad\5\u0115\u008b\2\u03aa\u03ac\5\u0117\u008c\2"+
		"\u03ab\u03aa\3\2\2\2\u03ac\u03af\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae"+
		"\3\2\2\2\u03ae\u0114\3\2\2\2\u03af\u03ad\3\2\2\2\u03b0\u03b7\t\21\2\2"+
		"\u03b1\u03b2\n\22\2\2\u03b2\u03b7\6\u008b\2\2\u03b3\u03b4\t\23\2\2\u03b4"+
		"\u03b5\t\24\2\2\u03b5\u03b7\6\u008b\3\2\u03b6\u03b0\3\2\2\2\u03b6\u03b1"+
		"\3\2\2\2\u03b6\u03b3\3\2\2\2\u03b7\u0116\3\2\2\2\u03b8\u03bf\t\25\2\2"+
		"\u03b9\u03ba\n\22\2\2\u03ba\u03bf\6\u008c\4\2\u03bb\u03bc\t\23\2\2\u03bc"+
		"\u03bd\t\24\2\2\u03bd\u03bf\6\u008c\5\2\u03be\u03b8\3\2\2\2\u03be\u03b9"+
		"\3\2\2\2\u03be\u03bb\3\2\2\2\u03bf\u0118\3\2\2\2\u03c0\u03c2\t\26\2\2"+
		"\u03c1\u03c0\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3\u03c4"+
		"\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\b\u008d\2\2\u03c6\u011a\3\2\2"+
		"\2\u03c7\u03c8\7\61\2\2\u03c8\u03c9\7,\2\2\u03c9\u03cd\3\2\2\2\u03ca\u03cc"+
		"\13\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u03cf\3\2\2\2\u03cd\u03ce\3\2\2\2"+
		"\u03cd\u03cb\3\2\2\2\u03ce\u03d0\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0\u03d1"+
		"\7,\2\2\u03d1\u03d2\7\61\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d4\b\u008e\3"+
		"\2\u03d4\u011c\3\2\2\2\u03d5\u03d6\7\61\2\2\u03d6\u03d7\7\61\2\2\u03d7"+
		"\u03db\3\2\2\2\u03d8\u03da\n\27\2\2\u03d9\u03d8\3\2\2\2\u03da\u03dd\3"+
		"\2\2\2\u03db\u03d9\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03de\u03df\b\u008f\3\2\u03df\u011e\3\2\2\29\2\u0220\u0224"+
		"\u0228\u022c\u0230\u0237\u023c\u023e\u0242\u0245\u0249\u0250\u0254\u0259"+
		"\u0261\u0264\u026b\u026f\u0273\u0279\u027c\u0283\u0287\u028f\u0292\u0299"+
		"\u029d\u02a1\u02a6\u02a9\u02ac\u02b1\u02b4\u02b9\u02be\u02c6\u02d1\u02d5"+
		"\u02da\u02de\u02ee\u02f8\u02fe\u0305\u0309\u030f\u031c\u0324\u03ad\u03b6"+
		"\u03be\u03c3\u03cd\u03db\4\b\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}