// Generated from /Users/richard/projects/compiler/compiler/src/main/java/compiler/Hello.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AssignmentOperator=1, RelationalOperator=2, Star=3, Plus=4, Sharp=5, SemiColon=6, 
		Dot=7, Comm=8, LeftBracket=9, RightBracket=10, LeftBrace=11, RightBrace=12, 
		LeftParen=13, RightParen=14, TypeSpecifier=15, If=16, Else=17, Identifier=18, 
		Constant=19, CharacterConstant=20, Whitespace=21, Newline=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AssignmentOperator", "RelationalOperator", "Star", "Plus", "Sharp", "SemiColon", 
		"Dot", "Comm", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"LeftParen", "RightParen", "TypeSpecifier", "If", "Else", "Identifier", 
		"Constant", "IntegerConstant", "Nondigit", "Digit", "NonzeroDigit", "CharacterConstant", 
		"Whitespace", "Newline"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", null, "'*'", "'+'", "'#'", "';'", "'.'", "','", "'['", "']'", 
		"'{'", "'}'", "'('", "')'", null, null, "'else'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AssignmentOperator", "RelationalOperator", "Star", "Plus", "Sharp", 
		"SemiColon", "Dot", "Comm", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "LeftParen", "RightParen", "TypeSpecifier", "If", "Else", 
		"Identifier", "Constant", "CharacterConstant", "Whitespace", "Newline"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"B\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20c\n\20\3\21\3\21\3\21\3\21\5\21i\n\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\7\23r\n\23\f\23\16\23u\13\23\3\24\3\24\5\24y\n\24\3\25\3\25\7"+
		"\25}\n\25\f\25\16\25\u0080\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3"+
		"\31\7\31\u008a\n\31\f\31\16\31\u008d\13\31\3\31\3\31\3\32\6\32\u0092\n"+
		"\32\r\32\16\32\u0093\3\32\3\32\3\33\3\33\5\33\u009a\n\33\3\33\5\33\u009d"+
		"\n\33\3\33\3\33\3\u008b\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\26"+
		"\63\27\65\30\3\2\7\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\3\2\63;\4\2\13\13"+
		"\"\"\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\3\67\3\2\2\2\5A\3\2\2\2\7C\3\2\2\2\tE\3\2\2\2\13G\3\2\2\2\rI"+
		"\3\2\2\2\17K\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31"+
		"U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2\37b\3\2\2\2!h\3\2\2\2#j\3\2\2\2%o\3"+
		"\2\2\2\'x\3\2\2\2)z\3\2\2\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0085\3\2\2"+
		"\2\61\u0087\3\2\2\2\63\u0091\3\2\2\2\65\u009c\3\2\2\2\678\7?\2\28\4\3"+
		"\2\2\29:\7?\2\2:B\7?\2\2;B\7@\2\2<=\7@\2\2=B\7?\2\2>B\7>\2\2?@\7>\2\2"+
		"@B\7?\2\2A9\3\2\2\2A;\3\2\2\2A<\3\2\2\2A>\3\2\2\2A?\3\2\2\2B\6\3\2\2\2"+
		"CD\7,\2\2D\b\3\2\2\2EF\7-\2\2F\n\3\2\2\2GH\7%\2\2H\f\3\2\2\2IJ\7=\2\2"+
		"J\16\3\2\2\2KL\7\60\2\2L\20\3\2\2\2MN\7.\2\2N\22\3\2\2\2OP\7]\2\2P\24"+
		"\3\2\2\2QR\7_\2\2R\26\3\2\2\2ST\7}\2\2T\30\3\2\2\2UV\7\177\2\2V\32\3\2"+
		"\2\2WX\7*\2\2X\34\3\2\2\2YZ\7+\2\2Z\36\3\2\2\2[\\\7e\2\2\\]\7j\2\2]^\7"+
		"c\2\2^c\7t\2\2_`\7k\2\2`a\7p\2\2ac\7v\2\2b[\3\2\2\2b_\3\2\2\2c \3\2\2"+
		"\2de\7k\2\2ei\7h\2\2fg\7\u5984\2\2gi\7\u679e\2\2hd\3\2\2\2hf\3\2\2\2i"+
		"\"\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n$\3\2\2\2os\t\2\2\2pr\t"+
		"\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t&\3\2\2\2us\3\2\2\2vy\5"+
		")\25\2wy\5\61\31\2xv\3\2\2\2xw\3\2\2\2y(\3\2\2\2z~\5/\30\2{}\5-\27\2|"+
		"{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177*\3\2\2\2\u0080~\3"+
		"\2\2\2\u0081\u0082\t\2\2\2\u0082,\3\2\2\2\u0083\u0084\t\4\2\2\u0084.\3"+
		"\2\2\2\u0085\u0086\t\5\2\2\u0086\60\3\2\2\2\u0087\u008b\7$\2\2\u0088\u008a"+
		"\13\2\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u008c\3\2\2\2"+
		"\u008b\u0089\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f"+
		"\7$\2\2\u008f\62\3\2\2\2\u0090\u0092\t\6\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\b\32\2\2\u0096\64\3\2\2\2\u0097\u0099\7\17\2\2\u0098"+
		"\u009a\7\f\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u009d\7\f\2\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\b\33\2\2\u009f\66\3\2\2\2\16\2Abhqsx~\u008b"+
		"\u0093\u0099\u009c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}