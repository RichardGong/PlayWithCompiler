package compiler;

// Generated from MyParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, AssignmentOperator=3, RelationalOperator=4, Star=5, Plus=6, 
		Sharp=7, SemiColon=8, Dot=9, Comm=10, LeftBracket=11, RightBracket=12, 
		LeftBrace=13, RightBrace=14, LeftParen=15, RightParen=16, TypeSpecifier=17, 
		If=18, Else=19, Identifier=20, Constant=21, CharacterConstant=22, Whitespace=23, 
		Newline=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "AssignmentOperator", "RelationalOperator", "Star", "Plus", 
			"Sharp", "SemiColon", "Dot", "Comm", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "LeftParen", "RightParen", "TypeSpecifier", "If", "Else", 
			"Identifier", "Constant", "IntegerConstant", "Nondigit", "Digit", "NonzeroDigit", 
			"CharacterConstant", "Whitespace", "Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'/'", "'='", null, "'*'", "'+'", "'#'", "';'", "'.'", "','", 
			"'['", "']'", "'{'", "'}'", "'('", "')'", null, null, "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "AssignmentOperator", "RelationalOperator", "Star", 
			"Plus", "Sharp", "SemiColon", "Dot", "Comm", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "LeftParen", "RightParen", "TypeSpecifier", 
			"If", "Else", "Identifier", "Constant", "CharacterConstant", "Whitespace", 
			"Newline"
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


	public MyParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyParser.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22k\n\22\3\23\3\23\3\23"+
		"\3\23\5\23q\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25z\n\25\f\25\16"+
		"\25}\13\25\3\26\3\26\5\26\u0081\n\26\3\27\3\27\7\27\u0085\n\27\f\27\16"+
		"\27\u0088\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u0092\n\33"+
		"\f\33\16\33\u0095\13\33\3\33\3\33\3\34\6\34\u009a\n\34\r\34\16\34\u009b"+
		"\3\34\3\34\3\35\3\35\5\35\u00a2\n\35\3\35\5\35\u00a5\n\35\3\35\3\35\3"+
		"\u0093\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\2\65\30\67\319"+
		"\32\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2\63;\4\2\13\13\"\"\2\u00b0"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tI\3\2\2\2\13K\3\2"+
		"\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2\25U\3\2\2\2\27W\3"+
		"\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35]\3\2\2\2\37_\3\2\2\2!a\3\2\2\2#j\3\2"+
		"\2\2%p\3\2\2\2\'r\3\2\2\2)w\3\2\2\2+\u0080\3\2\2\2-\u0082\3\2\2\2/\u0089"+
		"\3\2\2\2\61\u008b\3\2\2\2\63\u008d\3\2\2\2\65\u008f\3\2\2\2\67\u0099\3"+
		"\2\2\29\u00a4\3\2\2\2;<\7/\2\2<\4\3\2\2\2=>\7\61\2\2>\6\3\2\2\2?@\7?\2"+
		"\2@\b\3\2\2\2AB\7?\2\2BJ\7?\2\2CJ\7@\2\2DE\7@\2\2EJ\7?\2\2FJ\7>\2\2GH"+
		"\7>\2\2HJ\7?\2\2IA\3\2\2\2IC\3\2\2\2ID\3\2\2\2IF\3\2\2\2IG\3\2\2\2J\n"+
		"\3\2\2\2KL\7,\2\2L\f\3\2\2\2MN\7-\2\2N\16\3\2\2\2OP\7%\2\2P\20\3\2\2\2"+
		"QR\7=\2\2R\22\3\2\2\2ST\7\60\2\2T\24\3\2\2\2UV\7.\2\2V\26\3\2\2\2WX\7"+
		"]\2\2X\30\3\2\2\2YZ\7_\2\2Z\32\3\2\2\2[\\\7}\2\2\\\34\3\2\2\2]^\7\177"+
		"\2\2^\36\3\2\2\2_`\7*\2\2` \3\2\2\2ab\7+\2\2b\"\3\2\2\2cd\7e\2\2de\7j"+
		"\2\2ef\7c\2\2fk\7t\2\2gh\7k\2\2hi\7p\2\2ik\7v\2\2jc\3\2\2\2jg\3\2\2\2"+
		"k$\3\2\2\2lm\7k\2\2mq\7h\2\2no\7\u5984\2\2oq\7\u679e\2\2pl\3\2\2\2pn\3"+
		"\2\2\2q&\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2\2v(\3\2\2\2w{\t\2\2"+
		"\2xz\t\3\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|*\3\2\2\2}{\3\2\2"+
		"\2~\u0081\5-\27\2\177\u0081\5\65\33\2\u0080~\3\2\2\2\u0080\177\3\2\2\2"+
		"\u0081,\3\2\2\2\u0082\u0086\5\63\32\2\u0083\u0085\5\61\31\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		".\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\t\2\2\2\u008a\60\3\2\2\2\u008b"+
		"\u008c\t\4\2\2\u008c\62\3\2\2\2\u008d\u008e\t\5\2\2\u008e\64\3\2\2\2\u008f"+
		"\u0093\7$\2\2\u0090\u0092\13\2\2\2\u0091\u0090\3\2\2\2\u0092\u0095\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0096\u0097\7$\2\2\u0097\66\3\2\2\2\u0098\u009a\t\6\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\34\2\2\u009e8\3\2\2\2\u009f"+
		"\u00a1\7\17\2\2\u00a0\u00a2\7\f\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a5\7\f\2\2\u00a4\u009f\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\35\2\2\u00a7:\3\2\2\2"+
		"\16\2Ijpy{\u0080\u0086\u0093\u009b\u00a1\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}