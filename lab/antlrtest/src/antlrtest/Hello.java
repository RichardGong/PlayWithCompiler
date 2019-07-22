package antlrtest;

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
		If=1, Int=2, IntLiteral=3, StringLiteral=4, AssignmentOP=5, RelationalOP=6, 
		Star=7, Plus=8, Sharp=9, SemiColon=10, Dot=11, Comm=12, LeftBracket=13, 
		RightBracket=14, LeftBrace=15, RightBrace=16, LeftParen=17, RightParen=18, 
		Id=19, Whitespace=20, Newline=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"If", "Int", "IntLiteral", "StringLiteral", "AssignmentOP", "RelationalOP", 
			"Star", "Plus", "Sharp", "SemiColon", "Dot", "Comm", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "LeftParen", "RightParen", "Id", "Whitespace", 
			"Newline"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", null, null, "'='", null, "'*'", "'+'", "'#'", "';'", 
			"'.'", "','", "'['", "']'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "If", "Int", "IntLiteral", "StringLiteral", "AssignmentOP", "RelationalOP", 
			"Star", "Plus", "Sharp", "SemiColon", "Dot", "Comm", "LeftBracket", "RightBracket", 
			"LeftBrace", "RightBrace", "LeftParen", "RightParen", "Id", "Whitespace", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\5\2\62\n"+
		"\2\3\3\3\3\3\3\3\3\3\4\6\49\n\4\r\4\16\4:\3\5\3\5\7\5?\n\5\f\5\16\5B\13"+
		"\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\7\24l\n\24\f\24\16\24o\13\24"+
		"\3\25\6\25r\n\25\r\25\16\25s\3\25\3\25\3\26\3\26\5\26z\n\26\3\26\5\26"+
		"}\n\26\3\26\3\26\3@\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u008a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\78\3\2\2\2\t<\3\2"+
		"\2\2\13E\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25W\3"+
		"\2\2\2\27Y\3\2\2\2\31[\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!c\3"+
		"\2\2\2#e\3\2\2\2%g\3\2\2\2\'i\3\2\2\2)q\3\2\2\2+|\3\2\2\2-.\7k\2\2.\62"+
		"\7h\2\2/\60\7\u5984\2\2\60\62\7\u679e\2\2\61-\3\2\2\2\61/\3\2\2\2\62\4"+
		"\3\2\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7v\2\2\66\6\3\2\2\2\679\t\2\2"+
		"\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\b\3\2\2\2<@\7$\2\2=?\13"+
		"\2\2\2>=\3\2\2\2?B\3\2\2\2@A\3\2\2\2@>\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7"+
		"$\2\2D\n\3\2\2\2EF\7?\2\2F\f\3\2\2\2GH\7?\2\2HP\7?\2\2IP\7@\2\2JK\7@\2"+
		"\2KP\7?\2\2LP\7>\2\2MN\7>\2\2NP\7?\2\2OG\3\2\2\2OI\3\2\2\2OJ\3\2\2\2O"+
		"L\3\2\2\2OM\3\2\2\2P\16\3\2\2\2QR\7,\2\2R\20\3\2\2\2ST\7-\2\2T\22\3\2"+
		"\2\2UV\7%\2\2V\24\3\2\2\2WX\7=\2\2X\26\3\2\2\2YZ\7\60\2\2Z\30\3\2\2\2"+
		"[\\\7.\2\2\\\32\3\2\2\2]^\7]\2\2^\34\3\2\2\2_`\7_\2\2`\36\3\2\2\2ab\7"+
		"}\2\2b \3\2\2\2cd\7\177\2\2d\"\3\2\2\2ef\7*\2\2f$\3\2\2\2gh\7+\2\2h&\3"+
		"\2\2\2im\t\3\2\2jl\t\4\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n(\3"+
		"\2\2\2om\3\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu\3"+
		"\2\2\2uv\b\25\2\2v*\3\2\2\2wy\7\17\2\2xz\7\f\2\2yx\3\2\2\2yz\3\2\2\2z"+
		"}\3\2\2\2{}\7\f\2\2|w\3\2\2\2|{\3\2\2\2}~\3\2\2\2~\177\b\26\2\2\177,\3"+
		"\2\2\2\f\2\61:@Okmsy|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}