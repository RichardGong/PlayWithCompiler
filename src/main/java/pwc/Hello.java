package pwc;

// Generated from Hello.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Hello extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AssignmentOP=1, RelationalOP=2, Star=3, Plus=4, Sharp=5, SemiColon=6, 
		Dot=7, Comm=8, LeftBracket=9, RightBracket=10, LeftBrace=11, RightBrace=12, 
		LeftParen=13, RightParen=14, TypeSpecifier=15, If=16, Else=17, ID=18, 
		IntLiteral=19, StringLiteral=20, Whitespace=21, Newline=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AssignmentOP", "RelationalOP", "Star", "Plus", "Sharp", "SemiColon", 
			"Dot", "Comm", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"LeftParen", "RightParen", "TypeSpecifier", "If", "Else", "ID", "IntLiteral", 
			"StringLiteral", "Whitespace", "Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", null, "'*'", "'+'", "'#'", "';'", "'.'", "','", "'['", "']'", 
			"'{'", "'}'", "'('", "')'", null, null, "'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AssignmentOP", "RelationalOP", "Star", "Plus", "Sharp", "SemiColon", 
			"Dot", "Comm", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"LeftParen", "RightParen", "TypeSpecifier", "If", "Else", "ID", "IntLiteral", 
			"StringLiteral", "Whitespace", "Newline"
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


	public Hello(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20[\n\20\3\21\3\21\3\21\3\21\5\21"+
		"a\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23j\n\23\f\23\16\23m\13\23"+
		"\3\24\6\24p\n\24\r\24\16\24q\3\25\3\25\7\25v\n\25\f\25\16\25y\13\25\3"+
		"\25\3\25\3\26\6\26~\n\26\r\26\16\26\177\3\26\3\26\3\27\3\27\5\27\u0086"+
		"\n\27\3\27\5\27\u0089\n\27\3\27\3\27\3w\2\30\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\4\2\13\13\"\"\2\u0097"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2"+
		"\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2"+
		"\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2"+
		"\2\35Q\3\2\2\2\37Z\3\2\2\2!`\3\2\2\2#b\3\2\2\2%g\3\2\2\2\'o\3\2\2\2)s"+
		"\3\2\2\2+}\3\2\2\2-\u0088\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7?\2\2"+
		"\62:\7?\2\2\63:\7@\2\2\64\65\7@\2\2\65:\7?\2\2\66:\7>\2\2\678\7>\2\28"+
		":\7?\2\29\61\3\2\2\29\63\3\2\2\29\64\3\2\2\29\66\3\2\2\29\67\3\2\2\2:"+
		"\6\3\2\2\2;<\7,\2\2<\b\3\2\2\2=>\7-\2\2>\n\3\2\2\2?@\7%\2\2@\f\3\2\2\2"+
		"AB\7=\2\2B\16\3\2\2\2CD\7\60\2\2D\20\3\2\2\2EF\7.\2\2F\22\3\2\2\2GH\7"+
		"]\2\2H\24\3\2\2\2IJ\7_\2\2J\26\3\2\2\2KL\7}\2\2L\30\3\2\2\2MN\7\177\2"+
		"\2N\32\3\2\2\2OP\7*\2\2P\34\3\2\2\2QR\7+\2\2R\36\3\2\2\2ST\7e\2\2TU\7"+
		"j\2\2UV\7c\2\2V[\7t\2\2WX\7k\2\2XY\7p\2\2Y[\7v\2\2ZS\3\2\2\2ZW\3\2\2\2"+
		"[ \3\2\2\2\\]\7k\2\2]a\7h\2\2^_\7\u5984\2\2_a\7\u679e\2\2`\\\3\2\2\2`"+
		"^\3\2\2\2a\"\3\2\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f$\3\2\2\2gk\t"+
		"\2\2\2hj\t\3\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l&\3\2\2\2mk\3"+
		"\2\2\2np\t\4\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r(\3\2\2\2sw\7"+
		"$\2\2tv\13\2\2\2ut\3\2\2\2vy\3\2\2\2wx\3\2\2\2wu\3\2\2\2xz\3\2\2\2yw\3"+
		"\2\2\2z{\7$\2\2{*\3\2\2\2|~\t\5\2\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\26\2\2\u0082,\3"+
		"\2\2\2\u0083\u0085\7\17\2\2\u0084\u0086\7\f\2\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0089\7\f\2\2\u0088\u0083\3\2"+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\27\2\2\u008b"+
		".\3\2\2\2\r\29Z`ikqw\177\u0085\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}