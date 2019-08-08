// Generated from SQLite.g4 by ANTLR 4.7.2
package playdb.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, NUMERIC_LITERAL=150, 
		BIND_PARAMETER=151, STRING_LITERAL=152, BLOB_LITERAL=153, SINGLE_LINE_COMMENT=154, 
		MULTILINE_COMMENT=155, SPACES=156, UNEXPECTED_CHAR=157;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, 
		RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, 
		RULE_delete_stmt_limited = 16, RULE_detach_stmt = 17, RULE_drop_index_stmt = 18, 
		RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20, RULE_drop_view_stmt = 21, 
		RULE_factored_select_stmt = 22, RULE_insert_stmt = 23, RULE_pragma_stmt = 24, 
		RULE_reindex_stmt = 25, RULE_release_stmt = 26, RULE_rollback_stmt = 27, 
		RULE_savepoint_stmt = 28, RULE_simple_select_stmt = 29, RULE_select_stmt = 30, 
		RULE_select_or_values = 31, RULE_update_stmt = 32, RULE_update_stmt_limited = 33, 
		RULE_vacuum_stmt = 34, RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_foreign_key_clause = 40, 
		RULE_raise_function = 41, RULE_indexed_column = 42, RULE_table_constraint = 43, 
		RULE_with_clause = 44, RULE_qualified_table_name = 45, RULE_ordering_term = 46, 
		RULE_pragma_value = 47, RULE_common_table_expression = 48, RULE_result_column = 49, 
		RULE_table_or_subquery = 50, RULE_join_clause = 51, RULE_join_operator = 52, 
		RULE_join_constraint = 53, RULE_select_core = 54, RULE_compound_operator = 55, 
		RULE_cte_table_name = 56, RULE_signed_number = 57, RULE_literal_value = 58, 
		RULE_unary_operator = 59, RULE_error_message = 60, RULE_module_argument = 61, 
		RULE_column_alias = 62, RULE_keyword = 63, RULE_name = 64, RULE_function_name = 65, 
		RULE_database_name = 66, RULE_table_name = 67, RULE_table_or_index_name = 68, 
		RULE_new_table_name = 69, RULE_column_name = 70, RULE_collation_name = 71, 
		RULE_foreign_table = 72, RULE_index_name = 73, RULE_trigger_name = 74, 
		RULE_view_name = 75, RULE_module_name = 76, RULE_pragma_name = 77, RULE_savepoint_name = 78, 
		RULE_table_alias = 79, RULE_transaction_name = 80, RULE_any_name = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
			"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
			"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
			"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
			"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
			"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
			"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
			"raise_function", "indexed_column", "table_constraint", "with_clause", 
			"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
			"result_column", "table_or_subquery", "join_clause", "join_operator", 
			"join_constraint", "select_core", "compound_operator", "cte_table_name", 
			"signed_number", "literal_value", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "name", "function_name", 
			"database_name", "table_name", "table_or_index_name", "new_table_name", 
			"column_name", "collation_name", "foreign_table", "index_name", "trigger_name", 
			"view_name", "module_name", "pragma_name", "savepoint_name", "table_alias", 
			"transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
			"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
			"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
			"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
			"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
			"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
			"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
			"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
			"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
			"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
			"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", 
			"K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", 
			"K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH) | (1L << K_DROP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)) | (1L << (K_ROLLBACK - 66)) | (1L << (K_SAVEPOINT - 66)) | (1L << (K_SELECT - 66)))) != 0) || ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (K_UPDATE - 139)) | (1L << (K_VACUUM - 139)) | (1L << (K_VALUES - 139)) | (1L << (K_WITH - 139)) | (1L << (UNEXPECTED_CHAR - 139)))) != 0)) {
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(164);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(165);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(176);
				match(SCOL);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			sql_stmt();
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(183);
						match(SCOL);
						}
						}
						setState(186); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(188);
					sql_stmt();
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194);
					match(SCOL);
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(200);
				match(K_EXPLAIN);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(201);
					match(K_QUERY);
					setState(202);
					match(K_PLAN);
					}
				}

				}
			}

			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(207);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(208);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(209);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(210);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(211);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(212);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(213);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(214);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(215);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(216);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(217);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(218);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(219);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(220);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(221);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(222);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(223);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(224);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(225);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(226);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(227);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(228);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(229);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(230);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(231);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(232);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(233);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(234);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(235);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(236);
				vacuum_stmt();
				}
				break;
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(K_ALTER);
			setState(240);
			match(K_TABLE);
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(241);
				database_name();
				setState(242);
				match(DOT);
				}
				break;
			}
			setState(246);
			table_name();
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(247);
				match(K_RENAME);
				setState(248);
				match(K_TO);
				setState(249);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(250);
				match(K_ADD);
				setState(252);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(251);
					match(K_COLUMN);
					}
					break;
				}
				setState(254);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(K_ANALYZE);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(258);
				database_name();
				}
				break;
			case 2:
				{
				setState(259);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(260);
				database_name();
				setState(261);
				match(DOT);
				setState(262);
				table_or_index_name();
				}
				break;
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(K_ATTACH);
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(267);
				match(K_DATABASE);
				}
				break;
			}
			setState(270);
			expr(0);
			setState(271);
			match(K_AS);
			setState(272);
			database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(K_BEGIN);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(278);
				match(K_TRANSACTION);
				setState(280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(279);
					transaction_name();
					}
					break;
				}
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(285);
				match(K_TRANSACTION);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(286);
					transaction_name();
					}
					break;
				}
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(291);
				match(K_WITH);
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(292);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(295);
				common_table_expression();
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(296);
					match(COMMA);
					setState(297);
					common_table_expression();
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(305);
			select_core();
			setState(315); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(306);
					match(K_UNION);
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(307);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(310);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(311);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(314);
				select_core();
				}
				}
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(319);
				match(K_ORDER);
				setState(320);
				match(K_BY);
				setState(321);
				ordering_term();
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(322);
					match(COMMA);
					setState(323);
					ordering_term();
					}
					}
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(331);
				match(K_LIMIT);
				setState(332);
				expr(0);
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(333);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(334);
					expr(0);
					}
				}

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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(K_CREATE);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(340);
				match(K_UNIQUE);
				}
			}

			setState(343);
			match(K_INDEX);
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(344);
				match(K_IF);
				setState(345);
				match(K_NOT);
				setState(346);
				match(K_EXISTS);
				}
				break;
			}
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(349);
				database_name();
				setState(350);
				match(DOT);
				}
				break;
			}
			setState(354);
			index_name();
			setState(355);
			match(K_ON);
			setState(356);
			table_name();
			setState(357);
			match(OPEN_PAR);
			setState(358);
			indexed_column();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(359);
				match(COMMA);
				setState(360);
				indexed_column();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(CLOSE_PAR);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(367);
				match(K_WHERE);
				setState(368);
				expr(0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(K_CREATE);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(372);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(375);
			match(K_TABLE);
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(376);
				match(K_IF);
				setState(377);
				match(K_NOT);
				setState(378);
				match(K_EXISTS);
				}
				break;
			}
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(381);
				database_name();
				setState(382);
				match(DOT);
				}
				break;
			}
			setState(386);
			table_name();
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(387);
				match(OPEN_PAR);
				setState(388);
				column_def();
				setState(393);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(389);
						match(COMMA);
						setState(390);
						column_def();
						}
						} 
					}
					setState(395);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(396);
					match(COMMA);
					setState(397);
					table_constraint();
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(403);
				match(CLOSE_PAR);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(404);
					match(K_WITHOUT);
					setState(405);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(408);
				match(K_AS);
				setState(409);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(K_CREATE);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(413);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(416);
			match(K_TRIGGER);
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(417);
				match(K_IF);
				setState(418);
				match(K_NOT);
				setState(419);
				match(K_EXISTS);
				}
				break;
			}
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(422);
				database_name();
				setState(423);
				match(DOT);
				}
				break;
			}
			setState(427);
			trigger_name();
			setState(432);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(428);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(429);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(430);
				match(K_INSTEAD);
				setState(431);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(448);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(434);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(435);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(436);
				match(K_UPDATE);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(437);
					match(K_OF);
					setState(438);
					column_name();
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(439);
						match(COMMA);
						setState(440);
						column_name();
						}
						}
						setState(445);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(450);
			match(K_ON);
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(451);
				database_name();
				setState(452);
				match(DOT);
				}
				break;
			}
			setState(456);
			table_name();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(457);
				match(K_FOR);
				setState(458);
				match(K_EACH);
				setState(459);
				match(K_ROW);
				}
			}

			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(462);
				match(K_WHEN);
				setState(463);
				expr(0);
				}
			}

			setState(466);
			match(K_BEGIN);
			setState(475); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(471);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(467);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(468);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(469);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(470);
					select_stmt();
					}
					break;
				}
				setState(473);
				match(SCOL);
				}
				}
				setState(477); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(479);
			match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(K_CREATE);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(482);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(485);
			match(K_VIEW);
			setState(489);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(486);
				match(K_IF);
				setState(487);
				match(K_NOT);
				setState(488);
				match(K_EXISTS);
				}
				break;
			}
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(491);
				database_name();
				setState(492);
				match(DOT);
				}
				break;
			}
			setState(496);
			view_name();
			setState(497);
			match(K_AS);
			setState(498);
			select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(K_CREATE);
			setState(501);
			match(K_VIRTUAL);
			setState(502);
			match(K_TABLE);
			setState(506);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(503);
				match(K_IF);
				setState(504);
				match(K_NOT);
				setState(505);
				match(K_EXISTS);
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(508);
				database_name();
				setState(509);
				match(DOT);
				}
				break;
			}
			setState(513);
			table_name();
			setState(514);
			match(K_USING);
			setState(515);
			module_name();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(516);
				match(OPEN_PAR);
				setState(517);
				module_argument();
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(518);
					match(COMMA);
					setState(519);
					module_argument();
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(529);
				with_clause();
				}
			}

			setState(532);
			match(K_DELETE);
			setState(533);
			match(K_FROM);
			setState(534);
			qualified_table_name();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(535);
				match(K_WHERE);
				setState(536);
				expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(539);
				with_clause();
				}
			}

			setState(542);
			match(K_DELETE);
			setState(543);
			match(K_FROM);
			setState(544);
			qualified_table_name();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(545);
				match(K_WHERE);
				setState(546);
				expr(0);
				}
			}

			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(549);
					match(K_ORDER);
					setState(550);
					match(K_BY);
					setState(551);
					ordering_term();
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(552);
						match(COMMA);
						setState(553);
						ordering_term();
						}
						}
						setState(558);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(561);
				match(K_LIMIT);
				setState(562);
				expr(0);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(563);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(564);
					expr(0);
					}
				}

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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(K_DETACH);
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(570);
				match(K_DATABASE);
				}
				break;
			}
			setState(573);
			database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(K_DROP);
			setState(576);
			match(K_INDEX);
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(577);
				match(K_IF);
				setState(578);
				match(K_EXISTS);
				}
				break;
			}
			setState(584);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(581);
				database_name();
				setState(582);
				match(DOT);
				}
				break;
			}
			setState(586);
			index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(K_DROP);
			setState(589);
			match(K_TABLE);
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(590);
				match(K_IF);
				setState(591);
				match(K_EXISTS);
				}
				break;
			}
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(594);
				database_name();
				setState(595);
				match(DOT);
				}
				break;
			}
			setState(599);
			table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(K_DROP);
			setState(602);
			match(K_TRIGGER);
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(603);
				match(K_IF);
				setState(604);
				match(K_EXISTS);
				}
				break;
			}
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(607);
				database_name();
				setState(608);
				match(DOT);
				}
				break;
			}
			setState(612);
			trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(K_DROP);
			setState(615);
			match(K_VIEW);
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(616);
				match(K_IF);
				setState(617);
				match(K_EXISTS);
				}
				break;
			}
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(620);
				database_name();
				setState(621);
				match(DOT);
				}
				break;
			}
			setState(625);
			view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(627);
				match(K_WITH);
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(628);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(631);
				common_table_expression();
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(632);
					match(COMMA);
					setState(633);
					common_table_expression();
					}
					}
					setState(638);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(641);
			select_core();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(642);
				compound_operator();
				setState(643);
				select_core();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(650);
				match(K_ORDER);
				setState(651);
				match(K_BY);
				setState(652);
				ordering_term();
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(653);
					match(COMMA);
					setState(654);
					ordering_term();
					}
					}
					setState(659);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(662);
				match(K_LIMIT);
				setState(663);
				expr(0);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(664);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(665);
					expr(0);
					}
				}

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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(670);
				with_clause();
				}
			}

			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(673);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(674);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(675);
				match(K_INSERT);
				setState(676);
				match(K_OR);
				setState(677);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(678);
				match(K_INSERT);
				setState(679);
				match(K_OR);
				setState(680);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(681);
				match(K_INSERT);
				setState(682);
				match(K_OR);
				setState(683);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(684);
				match(K_INSERT);
				setState(685);
				match(K_OR);
				setState(686);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(687);
				match(K_INSERT);
				setState(688);
				match(K_OR);
				setState(689);
				match(K_IGNORE);
				}
				break;
			}
			setState(692);
			match(K_INTO);
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(693);
				database_name();
				setState(694);
				match(DOT);
				}
				break;
			}
			setState(698);
			table_name();
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(699);
				match(OPEN_PAR);
				setState(700);
				column_name();
				setState(705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(701);
					match(COMMA);
					setState(702);
					column_name();
					}
					}
					setState(707);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(708);
				match(CLOSE_PAR);
				}
			}

			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(712);
				match(K_VALUES);
				setState(713);
				match(OPEN_PAR);
				setState(714);
				expr(0);
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(715);
					match(COMMA);
					setState(716);
					expr(0);
					}
					}
					setState(721);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(722);
				match(CLOSE_PAR);
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(723);
					match(COMMA);
					setState(724);
					match(OPEN_PAR);
					setState(725);
					expr(0);
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(726);
						match(COMMA);
						setState(727);
						expr(0);
						}
						}
						setState(732);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(733);
					match(CLOSE_PAR);
					}
					}
					setState(739);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(740);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(741);
				match(K_DEFAULT);
				setState(742);
				match(K_VALUES);
				}
				break;
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			match(K_PRAGMA);
			setState(749);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(746);
				database_name();
				setState(747);
				match(DOT);
				}
				break;
			}
			setState(751);
			pragma_name();
			setState(758);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(752);
				match(ASSIGN);
				setState(753);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(754);
				match(OPEN_PAR);
				setState(755);
				pragma_value();
				setState(756);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			match(K_REINDEX);
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(761);
				collation_name();
				}
				break;
			case 2:
				{
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(762);
					database_name();
					setState(763);
					match(DOT);
					}
					break;
				}
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(767);
					table_name();
					}
					break;
				case 2:
					{
					setState(768);
					index_name();
					}
					break;
				}
				}
				break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			match(K_RELEASE);
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(774);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(777);
			savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(K_ROLLBACK);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(780);
				match(K_TRANSACTION);
				setState(782);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(781);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(786);
				match(K_TO);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(787);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(790);
				savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(K_SAVEPOINT);
			setState(794);
			savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(796);
				match(K_WITH);
				setState(798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(797);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(800);
				common_table_expression();
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(801);
					match(COMMA);
					setState(802);
					common_table_expression();
					}
					}
					setState(807);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(810);
			select_core();
			setState(821);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(811);
				match(K_ORDER);
				setState(812);
				match(K_BY);
				setState(813);
				ordering_term();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(814);
					match(COMMA);
					setState(815);
					ordering_term();
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(823);
				match(K_LIMIT);
				setState(824);
				expr(0);
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(825);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(826);
					expr(0);
					}
				}

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

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(831);
				match(K_WITH);
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(832);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(835);
				common_table_expression();
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(836);
					match(COMMA);
					setState(837);
					common_table_expression();
					}
					}
					setState(842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(845);
			select_or_values();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(846);
				compound_operator();
				setState(847);
				select_or_values();
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(854);
				match(K_ORDER);
				setState(855);
				match(K_BY);
				setState(856);
				ordering_term();
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(857);
					match(COMMA);
					setState(858);
					ordering_term();
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(866);
				match(K_LIMIT);
				setState(867);
				expr(0);
				setState(870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(868);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(869);
					expr(0);
					}
				}

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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				match(K_SELECT);
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(875);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(878);
				result_column();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(879);
					match(COMMA);
					setState(880);
					result_column();
					}
					}
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(898);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(886);
					match(K_FROM);
					setState(896);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(887);
						table_or_subquery();
						setState(892);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(888);
							match(COMMA);
							setState(889);
							table_or_subquery();
							}
							}
							setState(894);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(895);
						join_clause();
						}
						break;
					}
					}
				}

				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(900);
					match(K_WHERE);
					setState(901);
					expr(0);
					}
				}

				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(904);
					match(K_GROUP);
					setState(905);
					match(K_BY);
					setState(906);
					expr(0);
					setState(911);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(907);
						match(COMMA);
						setState(908);
						expr(0);
						}
						}
						setState(913);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(916);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(914);
						match(K_HAVING);
						setState(915);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(920);
				match(K_VALUES);
				setState(921);
				match(OPEN_PAR);
				setState(922);
				expr(0);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(923);
					match(COMMA);
					setState(924);
					expr(0);
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(930);
				match(CLOSE_PAR);
				setState(945);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(931);
					match(COMMA);
					setState(932);
					match(OPEN_PAR);
					setState(933);
					expr(0);
					setState(938);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(934);
						match(COMMA);
						setState(935);
						expr(0);
						}
						}
						setState(940);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(941);
					match(CLOSE_PAR);
					}
					}
					setState(947);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(950);
				with_clause();
				}
			}

			setState(953);
			match(K_UPDATE);
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(954);
				match(K_OR);
				setState(955);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(956);
				match(K_OR);
				setState(957);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(958);
				match(K_OR);
				setState(959);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(960);
				match(K_OR);
				setState(961);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(962);
				match(K_OR);
				setState(963);
				match(K_IGNORE);
				}
				break;
			}
			setState(966);
			qualified_table_name();
			setState(967);
			match(K_SET);
			setState(968);
			column_name();
			setState(969);
			match(ASSIGN);
			setState(970);
			expr(0);
			setState(978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(971);
				match(COMMA);
				setState(972);
				column_name();
				setState(973);
				match(ASSIGN);
				setState(974);
				expr(0);
				}
				}
				setState(980);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(981);
				match(K_WHERE);
				setState(982);
				expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(985);
				with_clause();
				}
			}

			setState(988);
			match(K_UPDATE);
			setState(999);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(989);
				match(K_OR);
				setState(990);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(991);
				match(K_OR);
				setState(992);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(993);
				match(K_OR);
				setState(994);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(995);
				match(K_OR);
				setState(996);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(997);
				match(K_OR);
				setState(998);
				match(K_IGNORE);
				}
				break;
			}
			setState(1001);
			qualified_table_name();
			setState(1002);
			match(K_SET);
			setState(1003);
			column_name();
			setState(1004);
			match(ASSIGN);
			setState(1005);
			expr(0);
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1006);
				match(COMMA);
				setState(1007);
				column_name();
				setState(1008);
				match(ASSIGN);
				setState(1009);
				expr(0);
				}
				}
				setState(1015);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1016);
				match(K_WHERE);
				setState(1017);
				expr(0);
				}
			}

			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1020);
					match(K_ORDER);
					setState(1021);
					match(K_BY);
					setState(1022);
					ordering_term();
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1023);
						match(COMMA);
						setState(1024);
						ordering_term();
						}
						}
						setState(1029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1032);
				match(K_LIMIT);
				setState(1033);
				expr(0);
				setState(1036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1034);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1035);
					expr(0);
					}
				}

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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1042);
			column_name();
			setState(1044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1043);
				type_name();
				}
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(1046);
				column_constraint();
				}
				}
				setState(1051);
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

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1053); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1052);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1055); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1057);
				match(OPEN_PAR);
				setState(1058);
				signed_number();
				setState(1059);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1061);
				match(OPEN_PAR);
				setState(1062);
				signed_number();
				setState(1063);
				match(COMMA);
				setState(1064);
				signed_number();
				setState(1065);
				match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1069);
				match(K_CONSTRAINT);
				setState(1070);
				name();
				}
			}

			setState(1106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1073);
				match(K_PRIMARY);
				setState(1074);
				match(K_KEY);
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1075);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1078);
				conflict_clause();
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1079);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1083);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1082);
					match(K_NOT);
					}
				}

				setState(1085);
				match(K_NULL);
				setState(1086);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1087);
				match(K_UNIQUE);
				setState(1088);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1089);
				match(K_CHECK);
				setState(1090);
				match(OPEN_PAR);
				setState(1091);
				expr(0);
				setState(1092);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1094);
				match(K_DEFAULT);
				setState(1101);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1095);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1096);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1097);
					match(OPEN_PAR);
					setState(1098);
					expr(0);
					setState(1099);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1103);
				match(K_COLLATE);
				setState(1104);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1105);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1108);
				match(K_ON);
				setState(1109);
				match(K_CONFLICT);
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FAIL - 72)) | (1L << (K_IGNORE - 72)) | (1L << (K_REPLACE - 72)) | (1L << (K_ROLLBACK - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1114);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1115);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1119);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1116);
						database_name();
						setState(1117);
						match(DOT);
						}
						break;
					}
					setState(1121);
					table_name();
					setState(1122);
					match(DOT);
					}
					break;
				}
				setState(1126);
				column_name();
				}
				break;
			case 4:
				{
				setState(1127);
				unary_operator();
				setState(1128);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1130);
				function_name();
				setState(1131);
				match(OPEN_PAR);
				setState(1144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1132);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1135);
					expr(0);
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1136);
						match(COMMA);
						setState(1137);
						expr(0);
						}
						}
						setState(1142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1143);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1146);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1148);
				match(OPEN_PAR);
				setState(1149);
				expr(0);
				setState(1150);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1152);
				match(K_CAST);
				setState(1153);
				match(OPEN_PAR);
				setState(1154);
				expr(0);
				setState(1155);
				match(K_AS);
				setState(1156);
				type_name();
				setState(1157);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1159);
						match(K_NOT);
						}
					}

					setState(1162);
					match(K_EXISTS);
					}
				}

				setState(1165);
				match(OPEN_PAR);
				setState(1166);
				select_stmt();
				setState(1167);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1169);
				match(K_CASE);
				setState(1171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1170);
					expr(0);
					}
					break;
				}
				setState(1178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1173);
					match(K_WHEN);
					setState(1174);
					expr(0);
					setState(1175);
					match(K_THEN);
					setState(1176);
					expr(0);
					}
					}
					setState(1180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1182);
					match(K_ELSE);
					setState(1183);
					expr(0);
					}
				}

				setState(1186);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1188);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1289);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1191);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1192);
						match(PIPE2);
						setState(1193);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1194);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1195);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1196);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1197);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1198);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1199);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1200);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1201);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1202);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1203);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1204);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1205);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1206);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1219);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1207);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1208);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1209);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1210);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1211);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1212);
							match(K_IS);
							setState(1213);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1214);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1215);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1216);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1217);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1218);
							match(K_REGEXP);
							}
							break;
						}
						setState(1221);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1222);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1223);
						match(K_AND);
						setState(1224);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1225);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1226);
						match(K_OR);
						setState(1227);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1228);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1229);
						match(K_IS);
						setState(1231);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1230);
							match(K_NOT);
							}
							break;
						}
						setState(1233);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1234);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1236);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1235);
							match(K_NOT);
							}
						}

						setState(1238);
						match(K_BETWEEN);
						setState(1239);
						expr(0);
						setState(1240);
						match(K_AND);
						setState(1241);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1243);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1244);
						match(K_COLLATE);
						setState(1245);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1246);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1247);
							match(K_NOT);
							}
						}

						setState(1250);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1251);
						expr(0);
						setState(1254);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1252);
							match(K_ESCAPE);
							setState(1253);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1256);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1261);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1257);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1258);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1259);
							match(K_NOT);
							setState(1260);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1263);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1265);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1264);
							match(K_NOT);
							}
						}

						setState(1267);
						match(K_IN);
						setState(1287);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1268);
							match(OPEN_PAR);
							setState(1278);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
							case 1:
								{
								setState(1269);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1270);
								expr(0);
								setState(1275);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1271);
									match(COMMA);
									setState(1272);
									expr(0);
									}
									}
									setState(1277);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1280);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1284);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
							case 1:
								{
								setState(1281);
								database_name();
								setState(1282);
								match(DOT);
								}
								break;
							}
							setState(1286);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(K_REFERENCES);
			setState(1295);
			foreign_table();
			setState(1307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1296);
				match(OPEN_PAR);
				setState(1297);
				column_name();
				setState(1302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1298);
					match(COMMA);
					setState(1299);
					column_name();
					}
					}
					setState(1304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1305);
				match(CLOSE_PAR);
				}
			}

			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1323);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1309);
					match(K_ON);
					setState(1310);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1319);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1311);
						match(K_SET);
						setState(1312);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1313);
						match(K_SET);
						setState(1314);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1315);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1316);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1317);
						match(K_NO);
						setState(1318);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1321);
					match(K_MATCH);
					setState(1322);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1330);
					match(K_NOT);
					}
				}

				setState(1333);
				match(K_DEFERRABLE);
				setState(1338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1334);
					match(K_INITIALLY);
					setState(1335);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1336);
					match(K_INITIALLY);
					setState(1337);
					match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1342);
			match(K_RAISE);
			setState(1343);
			match(OPEN_PAR);
			setState(1348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1344);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1345);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1346);
				match(COMMA);
				setState(1347);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1350);
			match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1352);
			column_name();
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1353);
				match(K_COLLATE);
				setState(1354);
				collation_name();
				}
			}

			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1357);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1360);
				match(K_CONSTRAINT);
				setState(1361);
				name();
				}
			}

			setState(1400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1367);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1364);
					match(K_PRIMARY);
					setState(1365);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1366);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1369);
				match(OPEN_PAR);
				setState(1370);
				indexed_column();
				setState(1375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1371);
					match(COMMA);
					setState(1372);
					indexed_column();
					}
					}
					setState(1377);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1378);
				match(CLOSE_PAR);
				setState(1379);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1381);
				match(K_CHECK);
				setState(1382);
				match(OPEN_PAR);
				setState(1383);
				expr(0);
				setState(1384);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1386);
				match(K_FOREIGN);
				setState(1387);
				match(K_KEY);
				setState(1388);
				match(OPEN_PAR);
				setState(1389);
				column_name();
				setState(1394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1390);
					match(COMMA);
					setState(1391);
					column_name();
					}
					}
					setState(1396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1397);
				match(CLOSE_PAR);
				setState(1398);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			match(K_WITH);
			setState(1404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1403);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1406);
			cte_table_name();
			setState(1407);
			match(K_AS);
			setState(1408);
			match(OPEN_PAR);
			setState(1409);
			select_stmt();
			setState(1410);
			match(CLOSE_PAR);
			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1411);
				match(COMMA);
				setState(1412);
				cte_table_name();
				setState(1413);
				match(K_AS);
				setState(1414);
				match(OPEN_PAR);
				setState(1415);
				select_stmt();
				setState(1416);
				match(CLOSE_PAR);
				}
				}
				setState(1422);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1423);
				database_name();
				setState(1424);
				match(DOT);
				}
				break;
			}
			setState(1428);
			table_name();
			setState(1434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1429);
				match(K_INDEXED);
				setState(1430);
				match(K_BY);
				setState(1431);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1432);
				match(K_NOT);
				setState(1433);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			expr(0);
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1437);
				match(K_COLLATE);
				setState(1438);
				collation_name();
				}
			}

			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1441);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1444);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1445);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1446);
				match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			table_name();
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1450);
				match(OPEN_PAR);
				setState(1451);
				column_name();
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1452);
					match(COMMA);
					setState(1453);
					column_name();
					}
					}
					setState(1458);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1459);
				match(CLOSE_PAR);
				}
			}

			setState(1463);
			match(K_AS);
			setState(1464);
			match(OPEN_PAR);
			setState(1465);
			select_stmt();
			setState(1466);
			match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1468);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1469);
				table_name();
				setState(1470);
				match(DOT);
				setState(1471);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1473);
				expr(0);
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1475);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1474);
						match(K_AS);
						}
					}

					setState(1477);
					column_alias();
					}
				}

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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_table_or_subquery);
		int _la;
		try {
			setState(1529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1485);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1482);
					database_name();
					setState(1483);
					match(DOT);
					}
					break;
				}
				setState(1487);
				table_name();
				setState(1492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1489);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1488);
						match(K_AS);
						}
						break;
					}
					setState(1491);
					table_alias();
					}
					break;
				}
				setState(1499);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1494);
					match(K_INDEXED);
					setState(1495);
					match(K_BY);
					setState(1496);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1497);
					match(K_NOT);
					setState(1498);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1501);
				match(OPEN_PAR);
				setState(1511);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1502);
					table_or_subquery();
					setState(1507);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1503);
						match(COMMA);
						setState(1504);
						table_or_subquery();
						}
						}
						setState(1509);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1510);
					join_clause();
					}
					break;
				}
				setState(1513);
				match(CLOSE_PAR);
				setState(1518);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1515);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1514);
						match(K_AS);
						}
						break;
					}
					setState(1517);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1520);
				match(OPEN_PAR);
				setState(1521);
				select_stmt();
				setState(1522);
				match(CLOSE_PAR);
				setState(1527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1523);
						match(K_AS);
						}
						break;
					}
					setState(1526);
					table_alias();
					}
					break;
				}
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			table_or_subquery();
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1532);
				join_operator();
				setState(1533);
				table_or_subquery();
				setState(1534);
				join_constraint();
				}
				}
				setState(1540);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_join_operator);
		int _la;
		try {
			setState(1554);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1541);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1542);
					match(K_NATURAL);
					}
				}

				setState(1551);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1545);
					match(K_LEFT);
					setState(1547);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1546);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1549);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1550);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1553);
				match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1556);
				match(K_ON);
				setState(1557);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1558);
				match(K_USING);
				setState(1559);
				match(OPEN_PAR);
				setState(1560);
				column_name();
				setState(1565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1561);
					match(COMMA);
					setState(1562);
					column_name();
					}
					}
					setState(1567);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1568);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_select_core);
		int _la;
		try {
			setState(1646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				match(K_SELECT);
				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1573);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1576);
				result_column();
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1577);
					match(COMMA);
					setState(1578);
					result_column();
					}
					}
					setState(1583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1584);
					match(K_FROM);
					setState(1594);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1585);
						table_or_subquery();
						setState(1590);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1586);
							match(COMMA);
							setState(1587);
							table_or_subquery();
							}
							}
							setState(1592);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1593);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1598);
					match(K_WHERE);
					setState(1599);
					expr(0);
					}
				}

				setState(1616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1602);
					match(K_GROUP);
					setState(1603);
					match(K_BY);
					setState(1604);
					expr(0);
					setState(1609);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1605);
						match(COMMA);
						setState(1606);
						expr(0);
						}
						}
						setState(1611);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1612);
						match(K_HAVING);
						setState(1613);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				match(K_VALUES);
				setState(1619);
				match(OPEN_PAR);
				setState(1620);
				expr(0);
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1621);
					match(COMMA);
					setState(1622);
					expr(0);
					}
					}
					setState(1627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1628);
				match(CLOSE_PAR);
				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1629);
					match(COMMA);
					setState(1630);
					match(OPEN_PAR);
					setState(1631);
					expr(0);
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1632);
						match(COMMA);
						setState(1633);
						expr(0);
						}
						}
						setState(1638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1639);
					match(CLOSE_PAR);
					}
					}
					setState(1645);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_compound_operator);
		try {
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1648);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1649);
				match(K_UNION);
				setState(1650);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1651);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1652);
				match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			table_name();
			setState(1667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1656);
				match(OPEN_PAR);
				setState(1657);
				column_name();
				setState(1662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1658);
					match(COMMA);
					setState(1659);
					column_name();
					}
					}
					setState(1664);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1665);
				match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1669);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1672);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NULL - 104)) | (1L << (NUMERIC_LITERAL - 104)) | (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_module_argument);
		try {
			setState(1682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1680);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1681);
				column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1688);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1692);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1702);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1716);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_any_name);
		try {
			setState(1729);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1722);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1723);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1724);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1725);
				match(OPEN_PAR);
				setState(1726);
				any_name();
				setState(1727);
				match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009f\u06c6\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00b4"+
		"\n\4\f\4\16\4\u00b7\13\4\3\4\3\4\6\4\u00bb\n\4\r\4\16\4\u00bc\3\4\7\4"+
		"\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3"+
		"\5\3\5\3\5\5\5\u00ce\n\5\5\5\u00d0\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5\u00f0\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00f7\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00ff\n\6\3\6\5\6\u0102\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u010b\n\7\3\b\3\b\5\b\u010f\n\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\5\t\u0117\n\t\3\t\3\t\5\t\u011b\n\t\5\t\u011d\n\t\3\n\3\n\3\n\5\n\u0122"+
		"\n\n\5\n\u0124\n\n\3\13\3\13\5\13\u0128\n\13\3\13\3\13\3\13\7\13\u012d"+
		"\n\13\f\13\16\13\u0130\13\13\5\13\u0132\n\13\3\13\3\13\3\13\5\13\u0137"+
		"\n\13\3\13\3\13\5\13\u013b\n\13\3\13\6\13\u013e\n\13\r\13\16\13\u013f"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u0147\n\13\f\13\16\13\u014a\13\13\5\13"+
		"\u014c\n\13\3\13\3\13\3\13\3\13\5\13\u0152\n\13\5\13\u0154\n\13\3\f\3"+
		"\f\5\f\u0158\n\f\3\f\3\f\3\f\3\f\5\f\u015e\n\f\3\f\3\f\3\f\5\f\u0163\n"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u016c\n\f\f\f\16\f\u016f\13\f\3\f\3"+
		"\f\3\f\5\f\u0174\n\f\3\r\3\r\5\r\u0178\n\r\3\r\3\r\3\r\3\r\5\r\u017e\n"+
		"\r\3\r\3\r\3\r\5\r\u0183\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u018a\n\r\f\r\16"+
		"\r\u018d\13\r\3\r\3\r\7\r\u0191\n\r\f\r\16\r\u0194\13\r\3\r\3\r\3\r\5"+
		"\r\u0199\n\r\3\r\3\r\5\r\u019d\n\r\3\16\3\16\5\16\u01a1\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u01a7\n\16\3\16\3\16\3\16\5\16\u01ac\n\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u01b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u01bc\n\16\f\16\16\16\u01bf\13\16\5\16\u01c1\n\16\5\16\u01c3\n\16\3\16"+
		"\3\16\3\16\3\16\5\16\u01c9\n\16\3\16\3\16\3\16\3\16\5\16\u01cf\n\16\3"+
		"\16\3\16\5\16\u01d3\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01da\n\16\3\16"+
		"\3\16\6\16\u01de\n\16\r\16\16\16\u01df\3\16\3\16\3\17\3\17\5\17\u01e6"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u01ec\n\17\3\17\3\17\3\17\5\17\u01f1\n"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01fd\n\20"+
		"\3\20\3\20\3\20\5\20\u0202\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u020b\n\20\f\20\16\20\u020e\13\20\3\20\3\20\5\20\u0212\n\20\3\21\5\21"+
		"\u0215\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u021c\n\21\3\22\5\22\u021f\n"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u0226\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u022d\n\22\f\22\16\22\u0230\13\22\5\22\u0232\n\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0238\n\22\5\22\u023a\n\22\3\23\3\23\5\23\u023e\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\5\24\u0246\n\24\3\24\3\24\3\24\5\24\u024b\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0253\n\25\3\25\3\25\3\25\5\25\u0258"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0260\n\26\3\26\3\26\3\26\5\26"+
		"\u0265\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u026d\n\27\3\27\3\27\3"+
		"\27\5\27\u0272\n\27\3\27\3\27\3\30\3\30\5\30\u0278\n\30\3\30\3\30\3\30"+
		"\7\30\u027d\n\30\f\30\16\30\u0280\13\30\5\30\u0282\n\30\3\30\3\30\3\30"+
		"\3\30\7\30\u0288\n\30\f\30\16\30\u028b\13\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0292\n\30\f\30\16\30\u0295\13\30\5\30\u0297\n\30\3\30\3\30\3\30"+
		"\3\30\5\30\u029d\n\30\5\30\u029f\n\30\3\31\5\31\u02a2\n\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u02b5\n\31\3\31\3\31\3\31\3\31\5\31\u02bb\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u02c2\n\31\f\31\16\31\u02c5\13\31\3\31\3\31\5\31\u02c9"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u02d0\n\31\f\31\16\31\u02d3\13\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02db\n\31\f\31\16\31\u02de\13\31"+
		"\3\31\3\31\7\31\u02e2\n\31\f\31\16\31\u02e5\13\31\3\31\3\31\3\31\5\31"+
		"\u02ea\n\31\3\32\3\32\3\32\3\32\5\32\u02f0\n\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\5\32\u02f9\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0300\n\33"+
		"\3\33\3\33\5\33\u0304\n\33\5\33\u0306\n\33\3\34\3\34\5\34\u030a\n\34\3"+
		"\34\3\34\3\35\3\35\3\35\5\35\u0311\n\35\5\35\u0313\n\35\3\35\3\35\5\35"+
		"\u0317\n\35\3\35\5\35\u031a\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u0321\n"+
		"\37\3\37\3\37\3\37\7\37\u0326\n\37\f\37\16\37\u0329\13\37\5\37\u032b\n"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0333\n\37\f\37\16\37\u0336\13"+
		"\37\5\37\u0338\n\37\3\37\3\37\3\37\3\37\5\37\u033e\n\37\5\37\u0340\n\37"+
		"\3 \3 \5 \u0344\n \3 \3 \3 \7 \u0349\n \f \16 \u034c\13 \5 \u034e\n \3"+
		" \3 \3 \3 \7 \u0354\n \f \16 \u0357\13 \3 \3 \3 \3 \3 \7 \u035e\n \f "+
		"\16 \u0361\13 \5 \u0363\n \3 \3 \3 \3 \5 \u0369\n \5 \u036b\n \3!\3!\5"+
		"!\u036f\n!\3!\3!\3!\7!\u0374\n!\f!\16!\u0377\13!\3!\3!\3!\3!\7!\u037d"+
		"\n!\f!\16!\u0380\13!\3!\5!\u0383\n!\5!\u0385\n!\3!\3!\5!\u0389\n!\3!\3"+
		"!\3!\3!\3!\7!\u0390\n!\f!\16!\u0393\13!\3!\3!\5!\u0397\n!\5!\u0399\n!"+
		"\3!\3!\3!\3!\3!\7!\u03a0\n!\f!\16!\u03a3\13!\3!\3!\3!\3!\3!\3!\7!\u03ab"+
		"\n!\f!\16!\u03ae\13!\3!\3!\7!\u03b2\n!\f!\16!\u03b5\13!\5!\u03b7\n!\3"+
		"\"\5\"\u03ba\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03c7"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u03d3\n\"\f\"\16\"\u03d6"+
		"\13\"\3\"\3\"\5\"\u03da\n\"\3#\5#\u03dd\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\3#\5#\u03ea\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u03f6\n#\f#\16#\u03f9"+
		"\13#\3#\3#\5#\u03fd\n#\3#\3#\3#\3#\3#\7#\u0404\n#\f#\16#\u0407\13#\5#"+
		"\u0409\n#\3#\3#\3#\3#\5#\u040f\n#\5#\u0411\n#\3$\3$\3%\3%\5%\u0417\n%"+
		"\3%\7%\u041a\n%\f%\16%\u041d\13%\3&\6&\u0420\n&\r&\16&\u0421\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\5&\u042e\n&\3\'\3\'\5\'\u0432\n\'\3\'\3\'\3\'\5"+
		"\'\u0437\n\'\3\'\3\'\5\'\u043b\n\'\3\'\5\'\u043e\n\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0450\n\'\3\'\3\'\3"+
		"\'\5\'\u0455\n\'\3(\3(\3(\5(\u045a\n(\3)\3)\3)\3)\3)\3)\5)\u0462\n)\3"+
		")\3)\3)\5)\u0467\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0470\n)\3)\3)\3)\7)\u0475"+
		"\n)\f)\16)\u0478\13)\3)\5)\u047b\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\5)\u048b\n)\3)\5)\u048e\n)\3)\3)\3)\3)\3)\3)\5)\u0496\n)\3)\3"+
		")\3)\3)\3)\6)\u049d\n)\r)\16)\u049e\3)\3)\5)\u04a3\n)\3)\3)\3)\5)\u04a8"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\5)\u04c6\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u04d2"+
		"\n)\3)\3)\3)\5)\u04d7\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u04e3\n)\3)"+
		"\3)\3)\3)\5)\u04e9\n)\3)\3)\3)\3)\3)\5)\u04f0\n)\3)\3)\5)\u04f4\n)\3)"+
		"\3)\3)\3)\3)\3)\7)\u04fc\n)\f)\16)\u04ff\13)\5)\u0501\n)\3)\3)\3)\3)\5"+
		")\u0507\n)\3)\5)\u050a\n)\7)\u050c\n)\f)\16)\u050f\13)\3*\3*\3*\3*\3*"+
		"\3*\7*\u0517\n*\f*\16*\u051a\13*\3*\3*\5*\u051e\n*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u052a\n*\3*\3*\5*\u052e\n*\7*\u0530\n*\f*\16*\u0533\13*"+
		"\3*\5*\u0536\n*\3*\3*\3*\3*\3*\5*\u053d\n*\5*\u053f\n*\3+\3+\3+\3+\3+"+
		"\3+\5+\u0547\n+\3+\3+\3,\3,\3,\5,\u054e\n,\3,\5,\u0551\n,\3-\3-\5-\u0555"+
		"\n-\3-\3-\3-\5-\u055a\n-\3-\3-\3-\3-\7-\u0560\n-\f-\16-\u0563\13-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0573\n-\f-\16-\u0576\13-\3-"+
		"\3-\3-\5-\u057b\n-\3.\3.\5.\u057f\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\7.\u058d\n.\f.\16.\u0590\13.\3/\3/\3/\5/\u0595\n/\3/\3/\3/\3/\3/\3"+
		"/\5/\u059d\n/\3\60\3\60\3\60\5\60\u05a2\n\60\3\60\5\60\u05a5\n\60\3\61"+
		"\3\61\3\61\5\61\u05aa\n\61\3\62\3\62\3\62\3\62\3\62\7\62\u05b1\n\62\f"+
		"\62\16\62\u05b4\13\62\3\62\3\62\5\62\u05b8\n\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u05c6\n\63\3\63\5\63\u05c9"+
		"\n\63\5\63\u05cb\n\63\3\64\3\64\3\64\5\64\u05d0\n\64\3\64\3\64\5\64\u05d4"+
		"\n\64\3\64\5\64\u05d7\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u05de\n\64\3"+
		"\64\3\64\3\64\3\64\7\64\u05e4\n\64\f\64\16\64\u05e7\13\64\3\64\5\64\u05ea"+
		"\n\64\3\64\3\64\5\64\u05ee\n\64\3\64\5\64\u05f1\n\64\3\64\3\64\3\64\3"+
		"\64\5\64\u05f7\n\64\3\64\5\64\u05fa\n\64\5\64\u05fc\n\64\3\65\3\65\3\65"+
		"\3\65\3\65\7\65\u0603\n\65\f\65\16\65\u0606\13\65\3\66\3\66\5\66\u060a"+
		"\n\66\3\66\3\66\5\66\u060e\n\66\3\66\3\66\5\66\u0612\n\66\3\66\5\66\u0615"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\7\67\u061e\n\67\f\67\16\67\u0621"+
		"\13\67\3\67\3\67\5\67\u0625\n\67\38\38\58\u0629\n8\38\38\38\78\u062e\n"+
		"8\f8\168\u0631\138\38\38\38\38\78\u0637\n8\f8\168\u063a\138\38\58\u063d"+
		"\n8\58\u063f\n8\38\38\58\u0643\n8\38\38\38\38\38\78\u064a\n8\f8\168\u064d"+
		"\138\38\38\58\u0651\n8\58\u0653\n8\38\38\38\38\38\78\u065a\n8\f8\168\u065d"+
		"\138\38\38\38\38\38\38\78\u0665\n8\f8\168\u0668\138\38\38\78\u066c\n8"+
		"\f8\168\u066f\138\58\u0671\n8\39\39\39\39\39\59\u0678\n9\3:\3:\3:\3:\3"+
		":\7:\u067f\n:\f:\16:\u0682\13:\3:\3:\5:\u0686\n:\3;\5;\u0689\n;\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\3?\5?\u0695\n?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E"+
		"\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P"+
		"\3Q\3Q\3R\3R\3S\3S\3S\3S\3S\3S\3S\5S\u06c4\nS\3S\2\3PT\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\2\24\5\2<<GGTT"+
		"\4\2\61\61DD\4\2\7\7ll\3\2\u0085\u0086\4\2\37\37@@\4\2$$>>\7\2\33\33J"+
		"JSS||\177\177\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2OOcceexx\4"+
		"\2==\u008d\u008d\5\2\33\33JJ\177\177\6\2\668jj\u0098\u0098\u009a\u009b"+
		"\4\2\n\fhh\4\2\u0097\u0097\u009a\u009a\3\2\33\u0096\2\u07d3\2\u00aa\3"+
		"\2\2\2\4\u00af\3\2\2\2\6\u00b5\3\2\2\2\b\u00cf\3\2\2\2\n\u00f1\3\2\2\2"+
		"\f\u0103\3\2\2\2\16\u010c\3\2\2\2\20\u0114\3\2\2\2\22\u011e\3\2\2\2\24"+
		"\u0131\3\2\2\2\26\u0155\3\2\2\2\30\u0175\3\2\2\2\32\u019e\3\2\2\2\34\u01e3"+
		"\3\2\2\2\36\u01f6\3\2\2\2 \u0214\3\2\2\2\"\u021e\3\2\2\2$\u023b\3\2\2"+
		"\2&\u0241\3\2\2\2(\u024e\3\2\2\2*\u025b\3\2\2\2,\u0268\3\2\2\2.\u0281"+
		"\3\2\2\2\60\u02a1\3\2\2\2\62\u02eb\3\2\2\2\64\u02fa\3\2\2\2\66\u0307\3"+
		"\2\2\28\u030d\3\2\2\2:\u031b\3\2\2\2<\u032a\3\2\2\2>\u034d\3\2\2\2@\u03b6"+
		"\3\2\2\2B\u03b9\3\2\2\2D\u03dc\3\2\2\2F\u0412\3\2\2\2H\u0414\3\2\2\2J"+
		"\u041f\3\2\2\2L\u0431\3\2\2\2N\u0459\3\2\2\2P\u04a7\3\2\2\2R\u0510\3\2"+
		"\2\2T\u0540\3\2\2\2V\u054a\3\2\2\2X\u0554\3\2\2\2Z\u057c\3\2\2\2\\\u0594"+
		"\3\2\2\2^\u059e\3\2\2\2`\u05a9\3\2\2\2b\u05ab\3\2\2\2d\u05ca\3\2\2\2f"+
		"\u05fb\3\2\2\2h\u05fd\3\2\2\2j\u0614\3\2\2\2l\u0624\3\2\2\2n\u0670\3\2"+
		"\2\2p\u0677\3\2\2\2r\u0679\3\2\2\2t\u0688\3\2\2\2v\u068c\3\2\2\2x\u068e"+
		"\3\2\2\2z\u0690\3\2\2\2|\u0694\3\2\2\2~\u0696\3\2\2\2\u0080\u0698\3\2"+
		"\2\2\u0082\u069a\3\2\2\2\u0084\u069c\3\2\2\2\u0086\u069e\3\2\2\2\u0088"+
		"\u06a0\3\2\2\2\u008a\u06a2\3\2\2\2\u008c\u06a4\3\2\2\2\u008e\u06a6\3\2"+
		"\2\2\u0090\u06a8\3\2\2\2\u0092\u06aa\3\2\2\2\u0094\u06ac\3\2\2\2\u0096"+
		"\u06ae\3\2\2\2\u0098\u06b0\3\2\2\2\u009a\u06b2\3\2\2\2\u009c\u06b4\3\2"+
		"\2\2\u009e\u06b6\3\2\2\2\u00a0\u06b8\3\2\2\2\u00a2\u06ba\3\2\2\2\u00a4"+
		"\u06c3\3\2\2\2\u00a6\u00a9\5\6\4\2\u00a7\u00a9\5\4\3\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\2"+
		"\2\3\u00ae\3\3\2\2\2\u00af\u00b0\7\u009f\2\2\u00b0\u00b1\b\3\1\2\u00b1"+
		"\5\3\2\2\2\u00b2\u00b4\7\3\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5"+
		"\3\2\2\2\u00b8\u00c1\5\b\5\2\u00b9\u00bb\7\3\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00c0\5\b\5\2\u00bf\u00ba\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00c6\7\3\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\7\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00ca\u00cd\7I\2\2\u00cb\u00cc\7t\2\2\u00cc\u00ce\7q\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00ef\3\2\2\2\u00d1\u00f0\5\n\6\2\u00d2\u00f0\5\f"+
		"\7\2\u00d3\u00f0\5\16\b\2\u00d4\u00f0\5\20\t\2\u00d5\u00f0\5\22\n\2\u00d6"+
		"\u00f0\5\24\13\2\u00d7\u00f0\5\26\f\2\u00d8\u00f0\5\30\r\2\u00d9\u00f0"+
		"\5\32\16\2\u00da\u00f0\5\34\17\2\u00db\u00f0\5\36\20\2\u00dc\u00f0\5 "+
		"\21\2\u00dd\u00f0\5\"\22\2\u00de\u00f0\5$\23\2\u00df\u00f0\5&\24\2\u00e0"+
		"\u00f0\5(\25\2\u00e1\u00f0\5*\26\2\u00e2\u00f0\5,\27\2\u00e3\u00f0\5."+
		"\30\2\u00e4\u00f0\5\60\31\2\u00e5\u00f0\5\62\32\2\u00e6\u00f0\5\64\33"+
		"\2\u00e7\u00f0\5\66\34\2\u00e8\u00f0\58\35\2\u00e9\u00f0\5:\36\2\u00ea"+
		"\u00f0\5<\37\2\u00eb\u00f0\5> \2\u00ec\u00f0\5B\"\2\u00ed\u00f0\5D#\2"+
		"\u00ee\u00f0\5F$\2\u00ef\u00d1\3\2\2\2\u00ef\u00d2\3\2\2\2\u00ef\u00d3"+
		"\3\2\2\2\u00ef\u00d4\3\2\2\2\u00ef\u00d5\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef"+
		"\u00d7\3\2\2\2\u00ef\u00d8\3\2\2\2\u00ef\u00d9\3\2\2\2\u00ef\u00da\3\2"+
		"\2\2\u00ef\u00db\3\2\2\2\u00ef\u00dc\3\2\2\2\u00ef\u00dd\3\2\2\2\u00ef"+
		"\u00de\3\2\2\2\u00ef\u00df\3\2\2\2\u00ef\u00e0\3\2\2\2\u00ef\u00e1\3\2"+
		"\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e4\3\2\2\2\u00ef"+
		"\u00e5\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00e8\3\2"+
		"\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2\2\2\u00ef\u00eb\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\t\3\2\2\2"+
		"\u00f1\u00f2\7 \2\2\u00f2\u00f6\7\u0084\2\2\u00f3\u00f4\5\u0086D\2\u00f4"+
		"\u00f5\7\4\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0101\5\u0088E\2\u00f9\u00fa\7{\2\2\u00fa"+
		"\u00fb\7\u0088\2\2\u00fb\u0102\5\u008cG\2\u00fc\u00fe\7\35\2\2\u00fd\u00ff"+
		"\7\60\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0102\5H%\2\u0101\u00f9\3\2\2\2\u0101\u00fc\3\2\2\2\u0102\13\3"+
		"\2\2\2\u0103\u010a\7!\2\2\u0104\u010b\5\u0086D\2\u0105\u010b\5\u008aF"+
		"\2\u0106\u0107\5\u0086D\2\u0107\u0108\7\4\2\2\u0108\u0109\5\u008aF\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\r\3\2\2\2\u010c\u010e\7%\2\2\u010d\u010f"+
		"\79\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\5P)\2\u0111\u0112\7#\2\2\u0112\u0113\5\u0086D\2\u0113\17\3\2\2"+
		"\2\u0114\u0116\7(\2\2\u0115\u0117\t\2\2\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u011c\3\2\2\2\u0118\u011a\7\u0089\2\2\u0119\u011b\5\u00a2"+
		"R\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c"+
		"\u0118\3\2\2\2\u011c\u011d\3\2\2\2\u011d\21\3\2\2\2\u011e\u0123\t\3\2"+
		"\2\u011f\u0121\7\u0089\2\2\u0120\u0122\5\u00a2R\2\u0121\u0120\3\2\2\2"+
		"\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123\u011f\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\23\3\2\2\2\u0125\u0127\7\u0095\2\2\u0126\u0128\7v\2\2\u0127"+
		"\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012e\5b"+
		"\62\2\u012a\u012b\7\7\2\2\u012b\u012d\5b\62\2\u012c\u012a\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2"+
		"\2\2\u0130\u012e\3\2\2\2\u0131\u0125\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u013d\5n8\2\u0134\u0136\7\u008b\2\2\u0135\u0137\7"+
		"\37\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013b\3\2\2\2\u0138"+
		"\u013b\7\\\2\2\u0139\u013b\7F\2\2\u013a\u0134\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\5n8\2\u013d\u013a"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u014b\3\2\2\2\u0141\u0142\7o\2\2\u0142\u0143\7*\2\2\u0143\u0148\5^\60"+
		"\2\u0144\u0145\7\7\2\2\u0145\u0147\5^\60\2\u0146\u0144\3\2\2\2\u0147\u014a"+
		"\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014c\3\2\2\2\u014a"+
		"\u0148\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u0153\3\2"+
		"\2\2\u014d\u014e\7d\2\2\u014e\u0151\5P)\2\u014f\u0150\t\4\2\2\u0150\u0152"+
		"\5P)\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153"+
		"\u014d\3\2\2\2\u0153\u0154\3\2\2\2\u0154\25\3\2\2\2\u0155\u0157\7\64\2"+
		"\2\u0156\u0158\7\u008c\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015d\7V\2\2\u015a\u015b\7R\2\2\u015b\u015c\7h\2"+
		"\2\u015c\u015e\7H\2\2\u015d\u015a\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u0162"+
		"\3\2\2\2\u015f\u0160\5\u0086D\2\u0160\u0161\7\4\2\2\u0161\u0163\3\2\2"+
		"\2\u0162\u015f\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165"+
		"\5\u0094K\2\u0165\u0166\7m\2\2\u0166\u0167\5\u0088E\2\u0167\u0168\7\5"+
		"\2\2\u0168\u016d\5V,\2\u0169\u016a\7\7\2\2\u016a\u016c\5V,\2\u016b\u0169"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0173\7\6\2\2\u0171\u0172\7\u0094"+
		"\2\2\u0172\u0174\5P)\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\27"+
		"\3\2\2\2\u0175\u0177\7\64\2\2\u0176\u0178\t\5\2\2\u0177\u0176\3\2\2\2"+
		"\u0177\u0178\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017d\7\u0084\2\2\u017a"+
		"\u017b\7R\2\2\u017b\u017c\7h\2\2\u017c\u017e\7H\2\2\u017d\u017a\3\2\2"+
		"\2\u017d\u017e\3\2\2\2\u017e\u0182\3\2\2\2\u017f\u0180\5\u0086D\2\u0180"+
		"\u0181\7\4\2\2\u0181\u0183\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u019c\5\u0088E\2\u0185\u0186\7\5\2\2\u0186"+
		"\u018b\5H%\2\u0187\u0188\7\7\2\2\u0188\u018a\5H%\2\u0189\u0187\3\2\2\2"+
		"\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0192"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u018f\7\7\2\2\u018f\u0191\5X-\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2"+
		"\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0198\7\6\2\2\u0196"+
		"\u0197\7\u0096\2\2\u0197\u0199\7\u0097\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199\u019d\3\2\2\2\u019a\u019b\7#\2\2\u019b\u019d\5> \2\u019c"+
		"\u0185\3\2\2\2\u019c\u019a\3\2\2\2\u019d\31\3\2\2\2\u019e\u01a0\7\64\2"+
		"\2\u019f\u01a1\t\5\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a6\7\u008a\2\2\u01a3\u01a4\7R\2\2\u01a4\u01a5\7h\2\2"+
		"\u01a5\u01a7\7H\2\2\u01a6\u01a3\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ab"+
		"\3\2\2\2\u01a8\u01a9\5\u0086D\2\u01a9\u01aa\7\4\2\2\u01aa\u01ac\3\2\2"+
		"\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b2"+
		"\5\u0096L\2\u01ae\u01b3\7\'\2\2\u01af\u01b3\7\36\2\2\u01b0\u01b1\7[\2"+
		"\2\u01b1\u01b3\7k\2\2\u01b2\u01ae\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01c2\3\2\2\2\u01b4\u01c3\7=\2\2\u01b5"+
		"\u01c3\7Z\2\2\u01b6\u01c0\7\u008d\2\2\u01b7\u01b8\7k\2\2\u01b8\u01bd\5"+
		"\u008eH\2\u01b9\u01ba\7\7\2\2\u01ba\u01bc\5\u008eH\2\u01bb\u01b9\3\2\2"+
		"\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1"+
		"\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01b7\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01b5\3\2\2\2\u01c2\u01b6\3\2"+
		"\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\7m\2\2\u01c5\u01c6\5\u0086D\2\u01c6"+
		"\u01c7\7\4\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c9\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01ce\5\u0088E\2\u01cb\u01cc\7K\2\2\u01cc"+
		"\u01cd\7B\2\2\u01cd\u01cf\7\u0080\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\7\u0093\2\2\u01d1\u01d3\5P)\2"+
		"\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01dd"+
		"\7(\2\2\u01d5\u01da\5B\"\2\u01d6\u01da\5\60\31\2\u01d7\u01da\5 \21\2\u01d8"+
		"\u01da\5> \2\u01d9\u01d5\3\2\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2"+
		"\2\u01d9\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\7\3\2\2\u01dc\u01de"+
		"\3\2\2\2\u01dd\u01d9\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\7D\2\2\u01e2\33\3\2\2\2"+
		"\u01e3\u01e5\7\64\2\2\u01e4\u01e6\t\5\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\7\u0091\2\2\u01e8\u01e9\7R\2"+
		"\2\u01e9\u01ea\7h\2\2\u01ea\u01ec\7H\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01f0\3\2\2\2\u01ed\u01ee\5\u0086D\2\u01ee\u01ef\7\4\2"+
		"\2\u01ef\u01f1\3\2\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2"+
		"\3\2\2\2\u01f2\u01f3\5\u0098M\2\u01f3\u01f4\7#\2\2\u01f4\u01f5\5> \2\u01f5"+
		"\35\3\2\2\2\u01f6\u01f7\7\64\2\2\u01f7\u01f8\7\u0092\2\2\u01f8\u01fc\7"+
		"\u0084\2\2\u01f9\u01fa\7R\2\2\u01fa\u01fb\7h\2\2\u01fb\u01fd\7H\2\2\u01fc"+
		"\u01f9\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe\u01ff\5\u0086"+
		"D\2\u01ff\u0200\7\4\2\2\u0200\u0202\3\2\2\2\u0201\u01fe\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0088E\2\u0204\u0205"+
		"\7\u008e\2\2\u0205\u0211\5\u009aN\2\u0206\u0207\7\5\2\2\u0207\u020c\5"+
		"|?\2\u0208\u0209\7\7\2\2\u0209\u020b\5|?\2\u020a\u0208\3\2\2\2\u020b\u020e"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020f\u0210\7\6\2\2\u0210\u0212\3\2\2\2\u0211\u0206\3\2"+
		"\2\2\u0211\u0212\3\2\2\2\u0212\37\3\2\2\2\u0213\u0215\5Z.\2\u0214\u0213"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7=\2\2\u0217"+
		"\u0218\7M\2\2\u0218\u021b\5\\/\2\u0219\u021a\7\u0094\2\2\u021a\u021c\5"+
		"P)\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c!\3\2\2\2\u021d\u021f"+
		"\5Z.\2\u021e\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0221\7=\2\2\u0221\u0222\7M\2\2\u0222\u0225\5\\/\2\u0223\u0224\7\u0094"+
		"\2\2\u0224\u0226\5P)\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0239"+
		"\3\2\2\2\u0227\u0228\7o\2\2\u0228\u0229\7*\2\2\u0229\u022e\5^\60\2\u022a"+
		"\u022b\7\7\2\2\u022b\u022d\5^\60\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2"+
		"\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0231\u0227\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0234\7d\2\2\u0234\u0237\5P)\2\u0235\u0236\t\4\2\2\u0236\u0238"+
		"\5P)\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239"+
		"\u0231\3\2\2\2\u0239\u023a\3\2\2\2\u023a#\3\2\2\2\u023b\u023d\7?\2\2\u023c"+
		"\u023e\79\2\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2"+
		"\2\2\u023f\u0240\5\u0086D\2\u0240%\3\2\2\2\u0241\u0242\7A\2\2\u0242\u0245"+
		"\7V\2\2\u0243\u0244\7R\2\2\u0244\u0246\7H\2\2\u0245\u0243\3\2\2\2\u0245"+
		"\u0246\3\2\2\2\u0246\u024a\3\2\2\2\u0247\u0248\5\u0086D\2\u0248\u0249"+
		"\7\4\2\2\u0249\u024b\3\2\2\2\u024a\u0247\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024d\5\u0094K\2\u024d\'\3\2\2\2\u024e\u024f\7A\2"+
		"\2\u024f\u0252\7\u0084\2\2\u0250\u0251\7R\2\2\u0251\u0253\7H\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0257\3\2\2\2\u0254\u0255\5\u0086"+
		"D\2\u0255\u0256\7\4\2\2\u0256\u0258\3\2\2\2\u0257\u0254\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\5\u0088E\2\u025a)\3\2\2"+
		"\2\u025b\u025c\7A\2\2\u025c\u025f\7\u008a\2\2\u025d\u025e\7R\2\2\u025e"+
		"\u0260\7H\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0264\3\2"+
		"\2\2\u0261\u0262\5\u0086D\2\u0262\u0263\7\4\2\2\u0263\u0265\3\2\2\2\u0264"+
		"\u0261\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\5\u0096"+
		"L\2\u0267+\3\2\2\2\u0268\u0269\7A\2\2\u0269\u026c\7\u0091\2\2\u026a\u026b"+
		"\7R\2\2\u026b\u026d\7H\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u0271\3\2\2\2\u026e\u026f\5\u0086D\2\u026f\u0270\7\4\2\2\u0270\u0272"+
		"\3\2\2\2\u0271\u026e\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\5\u0098M\2\u0274-\3\2\2\2\u0275\u0277\7\u0095\2\2\u0276\u0278\7"+
		"v\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u027e\5b\62\2\u027a\u027b\7\7\2\2\u027b\u027d\5b\62\2\u027c\u027a\3\2"+
		"\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0275\3\2\2\2\u0281\u0282\3\2"+
		"\2\2\u0282\u0283\3\2\2\2\u0283\u0289\5n8\2\u0284\u0285\5p9\2\u0285\u0286"+
		"\5n8\2\u0286\u0288\3\2\2\2\u0287\u0284\3\2\2\2\u0288\u028b\3\2\2\2\u0289"+
		"\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0296\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028c\u028d\7o\2\2\u028d\u028e\7*\2\2\u028e\u0293\5^\60\2\u028f\u0290"+
		"\7\7\2\2\u0290\u0292\5^\60\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293"+
		"\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2"+
		"\2\2\u0296\u028c\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029e\3\2\2\2\u0298"+
		"\u0299\7d\2\2\u0299\u029c\5P)\2\u029a\u029b\t\4\2\2\u029b\u029d\5P)\2"+
		"\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u0298"+
		"\3\2\2\2\u029e\u029f\3\2\2\2\u029f/\3\2\2\2\u02a0\u02a2\5Z.\2\u02a1\u02a0"+
		"\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02b4\3\2\2\2\u02a3\u02b5\7Z\2\2\u02a4"+
		"\u02b5\7|\2\2\u02a5\u02a6\7Z\2\2\u02a6\u02a7\7n\2\2\u02a7\u02b5\7|\2\2"+
		"\u02a8\u02a9\7Z\2\2\u02a9\u02aa\7n\2\2\u02aa\u02b5\7\177\2\2\u02ab\u02ac"+
		"\7Z\2\2\u02ac\u02ad\7n\2\2\u02ad\u02b5\7\33\2\2\u02ae\u02af\7Z\2\2\u02af"+
		"\u02b0\7n\2\2\u02b0\u02b5\7J\2\2\u02b1\u02b2\7Z\2\2\u02b2\u02b3\7n\2\2"+
		"\u02b3\u02b5\7S\2\2\u02b4\u02a3\3\2\2\2\u02b4\u02a4\3\2\2\2\u02b4\u02a5"+
		"\3\2\2\2\u02b4\u02a8\3\2\2\2\u02b4\u02ab\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4"+
		"\u02b1\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02ba\7]\2\2\u02b7\u02b8\5\u0086"+
		"D\2\u02b8\u02b9\7\4\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b7\3\2\2\2\u02ba"+
		"\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c8\5\u0088E\2\u02bd\u02be"+
		"\7\5\2\2\u02be\u02c3\5\u008eH\2\u02bf\u02c0\7\7\2\2\u02c0\u02c2\5\u008e"+
		"H\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\7\6"+
		"\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02bd\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02e9\3\2\2\2\u02ca\u02cb\7\u0090\2\2\u02cb\u02cc\7\5\2\2\u02cc\u02d1"+
		"\5P)\2\u02cd\u02ce\7\7\2\2\u02ce\u02d0\5P)\2\u02cf\u02cd\3\2\2\2\u02d0"+
		"\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2"+
		"\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02e3\7\6\2\2\u02d5\u02d6\7\7\2\2\u02d6"+
		"\u02d7\7\5\2\2\u02d7\u02dc\5P)\2\u02d8\u02d9\7\7\2\2\u02d9\u02db\5P)\2"+
		"\u02da\u02d8\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7\6\2\2\u02e0"+
		"\u02e2\3\2\2\2\u02e1\u02d5\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2"+
		"\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02ea\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6"+
		"\u02ea\5> \2\u02e7\u02e8\7:\2\2\u02e8\u02ea\7\u0090\2\2\u02e9\u02ca\3"+
		"\2\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\61\3\2\2\2\u02eb"+
		"\u02ef\7r\2\2\u02ec\u02ed\5\u0086D\2\u02ed\u02ee\7\4\2\2\u02ee\u02f0\3"+
		"\2\2\2\u02ef\u02ec\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"+
		"\u02f8\5\u009cO\2\u02f2\u02f3\7\b\2\2\u02f3\u02f9\5`\61\2\u02f4\u02f5"+
		"\7\5\2\2\u02f5\u02f6\5`\61\2\u02f6\u02f7\7\6\2\2\u02f7\u02f9\3\2\2\2\u02f8"+
		"\u02f2\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\63\3\2\2"+
		"\2\u02fa\u0305\7y\2\2\u02fb\u0306\5\u0090I\2\u02fc\u02fd\5\u0086D\2\u02fd"+
		"\u02fe\7\4\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff\u0300\3\2"+
		"\2\2\u0300\u0303\3\2\2\2\u0301\u0304\5\u0088E\2\u0302\u0304\5\u0094K\2"+
		"\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u02fb"+
		"\3\2\2\2\u0305\u02ff\3\2\2\2\u0305\u0306\3\2\2\2\u0306\65\3\2\2\2\u0307"+
		"\u0309\7z\2\2\u0308\u030a\7\u0081\2\2\u0309\u0308\3\2\2\2\u0309\u030a"+
		"\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5\u009eP\2\u030c\67\3\2\2\2\u030d"+
		"\u0312\7\177\2\2\u030e\u0310\7\u0089\2\2\u030f\u0311\5\u00a2R\2\u0310"+
		"\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u030e\3\2"+
		"\2\2\u0312\u0313\3\2\2\2\u0313\u0319\3\2\2\2\u0314\u0316\7\u0088\2\2\u0315"+
		"\u0317\7\u0081\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u031a\5\u009eP\2\u0319\u0314\3\2\2\2\u0319\u031a\3\2\2"+
		"\2\u031a9\3\2\2\2\u031b\u031c\7\u0081\2\2\u031c\u031d\5\u009eP\2\u031d"+
		";\3\2\2\2\u031e\u0320\7\u0095\2\2\u031f\u0321\7v\2\2\u0320\u031f\3\2\2"+
		"\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0327\5b\62\2\u0323\u0324"+
		"\7\7\2\2\u0324\u0326\5b\62\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2"+
		"\2\2\u032a\u031e\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"+
		"\u0337\5n8\2\u032d\u032e\7o\2\2\u032e\u032f\7*\2\2\u032f\u0334\5^\60\2"+
		"\u0330\u0331\7\7\2\2\u0331\u0333\5^\60\2\u0332\u0330\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0337\u032d\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033f\3\2"+
		"\2\2\u0339\u033a\7d\2\2\u033a\u033d\5P)\2\u033b\u033c\t\4\2\2\u033c\u033e"+
		"\5P)\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f"+
		"\u0339\3\2\2\2\u033f\u0340\3\2\2\2\u0340=\3\2\2\2\u0341\u0343\7\u0095"+
		"\2\2\u0342\u0344\7v\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0345\3\2\2\2\u0345\u034a\5b\62\2\u0346\u0347\7\7\2\2\u0347\u0349\5b"+
		"\62\2\u0348\u0346\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a"+
		"\u034b\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u0341\3\2"+
		"\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0355\5@!\2\u0350\u0351"+
		"\5p9\2\u0351\u0352\5@!\2\u0352\u0354\3\2\2\2\u0353\u0350\3\2\2\2\u0354"+
		"\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0362\3\2"+
		"\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7o\2\2\u0359\u035a\7*\2\2\u035a\u035f"+
		"\5^\60\2\u035b\u035c\7\7\2\2\u035c\u035e\5^\60\2\u035d\u035b\3\2\2\2\u035e"+
		"\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0363\3\2"+
		"\2\2\u0361\u035f\3\2\2\2\u0362\u0358\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u036a\3\2\2\2\u0364\u0365\7d\2\2\u0365\u0368\5P)\2\u0366\u0367\t\4\2"+
		"\2\u0367\u0369\5P)\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b"+
		"\3\2\2\2\u036a\u0364\3\2\2\2\u036a\u036b\3\2\2\2\u036b?\3\2\2\2\u036c"+
		"\u036e\7\u0082\2\2\u036d\u036f\t\6\2\2\u036e\u036d\3\2\2\2\u036e\u036f"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0375\5d\63\2\u0371\u0372\7\7\2\2\u0372"+
		"\u0374\5d\63\2\u0373\u0371\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2"+
		"\2\2\u0375\u0376\3\2\2\2\u0376\u0384\3\2\2\2\u0377\u0375\3\2\2\2\u0378"+
		"\u0382\7M\2\2\u0379\u037e\5f\64\2\u037a\u037b\7\7\2\2\u037b\u037d\5f\64"+
		"\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f"+
		"\3\2\2\2\u037f\u0383\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0383\5h\65\2\u0382"+
		"\u0379\3\2\2\2\u0382\u0381\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0378\3\2"+
		"\2\2\u0384\u0385\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0387\7\u0094\2\2\u0387"+
		"\u0389\5P)\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0398\3\2\2"+
		"\2\u038a\u038b\7P\2\2\u038b\u038c\7*\2\2\u038c\u0391\5P)\2\u038d\u038e"+
		"\7\7\2\2\u038e\u0390\5P)\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391"+
		"\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0396\3\2\2\2\u0393\u0391\3\2"+
		"\2\2\u0394\u0395\7Q\2\2\u0395\u0397\5P)\2\u0396\u0394\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u038a\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u03b7\3\2\2\2\u039a\u039b\7\u0090\2\2\u039b\u039c\7\5\2\2\u039c\u03a1"+
		"\5P)\2\u039d\u039e\7\7\2\2\u039e\u03a0\5P)\2\u039f\u039d\3\2\2\2\u03a0"+
		"\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2"+
		"\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03b3\7\6\2\2\u03a5\u03a6\7\7\2\2\u03a6"+
		"\u03a7\7\5\2\2\u03a7\u03ac\5P)\2\u03a8\u03a9\7\7\2\2\u03a9\u03ab\5P)\2"+
		"\u03aa\u03a8\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad"+
		"\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\7\6\2\2\u03b0"+
		"\u03b2\3\2\2\2\u03b1\u03a5\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2"+
		"\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6"+
		"\u036c\3\2\2\2\u03b6\u039a\3\2\2\2\u03b7A\3\2\2\2\u03b8\u03ba\5Z.\2\u03b9"+
		"\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c6\7\u008d"+
		"\2\2\u03bc\u03bd\7n\2\2\u03bd\u03c7\7\177\2\2\u03be\u03bf\7n\2\2\u03bf"+
		"\u03c7\7\33\2\2\u03c0\u03c1\7n\2\2\u03c1\u03c7\7|\2\2\u03c2\u03c3\7n\2"+
		"\2\u03c3\u03c7\7J\2\2\u03c4\u03c5\7n\2\2\u03c5\u03c7\7S\2\2\u03c6\u03bc"+
		"\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03c0\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\5\\"+
		"/\2\u03c9\u03ca\7\u0083\2\2\u03ca\u03cb\5\u008eH\2\u03cb\u03cc\7\b\2\2"+
		"\u03cc\u03d4\5P)\2\u03cd\u03ce\7\7\2\2\u03ce\u03cf\5\u008eH\2\u03cf\u03d0"+
		"\7\b\2\2\u03d0\u03d1\5P)\2\u03d1\u03d3\3\2\2\2\u03d2\u03cd\3\2\2\2\u03d3"+
		"\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d9\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8\7\u0094\2\2\u03d8\u03da\5P)\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03daC\3\2\2\2\u03db\u03dd\5Z.\2\u03dc"+
		"\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e9\7\u008d"+
		"\2\2\u03df\u03e0\7n\2\2\u03e0\u03ea\7\177\2\2\u03e1\u03e2\7n\2\2\u03e2"+
		"\u03ea\7\33\2\2\u03e3\u03e4\7n\2\2\u03e4\u03ea\7|\2\2\u03e5\u03e6\7n\2"+
		"\2\u03e6\u03ea\7J\2\2\u03e7\u03e8\7n\2\2\u03e8\u03ea\7S\2\2\u03e9\u03df"+
		"\3\2\2\2\u03e9\u03e1\3\2\2\2\u03e9\u03e3\3\2\2\2\u03e9\u03e5\3\2\2\2\u03e9"+
		"\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\5\\"+
		"/\2\u03ec\u03ed\7\u0083\2\2\u03ed\u03ee\5\u008eH\2\u03ee\u03ef\7\b\2\2"+
		"\u03ef\u03f7\5P)\2\u03f0\u03f1\7\7\2\2\u03f1\u03f2\5\u008eH\2\u03f2\u03f3"+
		"\7\b\2\2\u03f3\u03f4\5P)\2\u03f4\u03f6\3\2\2\2\u03f5\u03f0\3\2\2\2\u03f6"+
		"\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fc\3\2"+
		"\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\u0094\2\2\u03fb\u03fd\5P)\2\u03fc"+
		"\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0410\3\2\2\2\u03fe\u03ff\7o"+
		"\2\2\u03ff\u0400\7*\2\2\u0400\u0405\5^\60\2\u0401\u0402\7\7\2\2\u0402"+
		"\u0404\5^\60\2\u0403\u0401\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2"+
		"\2\2\u0405\u0406\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0408"+
		"\u03fe\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\7d"+
		"\2\2\u040b\u040e\5P)\2\u040c\u040d\t\4\2\2\u040d\u040f\5P)\2\u040e\u040c"+
		"\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u0408\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411E\3\2\2\2\u0412\u0413\7\u008f\2\2\u0413G\3\2\2\2\u0414"+
		"\u0416\5\u008eH\2\u0415\u0417\5J&\2\u0416\u0415\3\2\2\2\u0416\u0417\3"+
		"\2\2\2\u0417\u041b\3\2\2\2\u0418\u041a\5L\'\2\u0419\u0418\3\2\2\2\u041a"+
		"\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041cI\3\2\2\2"+
		"\u041d\u041b\3\2\2\2\u041e\u0420\5\u0082B\2\u041f\u041e\3\2\2\2\u0420"+
		"\u0421\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u042d\3\2"+
		"\2\2\u0423\u0424\7\5\2\2\u0424\u0425\5t;\2\u0425\u0426\7\6\2\2\u0426\u042e"+
		"\3\2\2\2\u0427\u0428\7\5\2\2\u0428\u0429\5t;\2\u0429\u042a\7\7\2\2\u042a"+
		"\u042b\5t;\2\u042b\u042c\7\6\2\2\u042c\u042e\3\2\2\2\u042d\u0423\3\2\2"+
		"\2\u042d\u0427\3\2\2\2\u042d\u042e\3\2\2\2\u042eK\3\2\2\2\u042f\u0430"+
		"\7\63\2\2\u0430\u0432\5\u0082B\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2"+
		"\2\u0432\u0454\3\2\2\2\u0433\u0434\7s\2\2\u0434\u0436\7a\2\2\u0435\u0437"+
		"\t\7\2\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438"+
		"\u043a\5N(\2\u0439\u043b\7&\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2"+
		"\2\u043b\u0455\3\2\2\2\u043c\u043e\7h\2\2\u043d\u043c\3\2\2\2\u043d\u043e"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7j\2\2\u0440\u0455\5N(\2\u0441"+
		"\u0442\7\u008c\2\2\u0442\u0455\5N(\2\u0443\u0444\7.\2\2\u0444\u0445\7"+
		"\5\2\2\u0445\u0446\5P)\2\u0446\u0447\7\6\2\2\u0447\u0455\3\2\2\2\u0448"+
		"\u044f\7:\2\2\u0449\u0450\5t;\2\u044a\u0450\5v<\2\u044b\u044c\7\5\2\2"+
		"\u044c\u044d\5P)\2\u044d\u044e\7\6\2\2\u044e\u0450\3\2\2\2\u044f\u0449"+
		"\3\2\2\2\u044f\u044a\3\2\2\2\u044f\u044b\3\2\2\2\u0450\u0455\3\2\2\2\u0451"+
		"\u0452\7/\2\2\u0452\u0455\5\u0090I\2\u0453\u0455\5R*\2\u0454\u0433\3\2"+
		"\2\2\u0454\u043d\3\2\2\2\u0454\u0441\3\2\2\2\u0454\u0443\3\2\2\2\u0454"+
		"\u0448\3\2\2\2\u0454\u0451\3\2\2\2\u0454\u0453\3\2\2\2\u0455M\3\2\2\2"+
		"\u0456\u0457\7m\2\2\u0457\u0458\7\62\2\2\u0458\u045a\t\b\2\2\u0459\u0456"+
		"\3\2\2\2\u0459\u045a\3\2\2\2\u045aO\3\2\2\2\u045b\u045c\b)\1\2\u045c\u04a8"+
		"\5v<\2\u045d\u04a8\7\u0099\2\2\u045e\u045f\5\u0086D\2\u045f\u0460\7\4"+
		"\2\2\u0460\u0462\3\2\2\2\u0461\u045e\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0464\5\u0088E\2\u0464\u0465\7\4\2\2\u0465\u0467"+
		"\3\2\2\2\u0466\u0461\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u0468\3\2\2\2\u0468"+
		"\u04a8\5\u008eH\2\u0469\u046a\5x=\2\u046a\u046b\5P)\27\u046b\u04a8\3\2"+
		"\2\2\u046c\u046d\5\u0084C\2\u046d\u047a\7\5\2\2\u046e\u0470\7@\2\2\u046f"+
		"\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0476\5P"+
		")\2\u0472\u0473\7\7\2\2\u0473\u0475\5P)\2\u0474\u0472\3\2\2\2\u0475\u0478"+
		"\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u047b\3\2\2\2\u0478"+
		"\u0476\3\2\2\2\u0479\u047b\7\t\2\2\u047a\u046f\3\2\2\2\u047a\u0479\3\2"+
		"\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\7\6\2\2\u047d"+
		"\u04a8\3\2\2\2\u047e\u047f\7\5\2\2\u047f\u0480\5P)\2\u0480\u0481\7\6\2"+
		"\2\u0481\u04a8\3\2\2\2\u0482\u0483\7-\2\2\u0483\u0484\7\5\2\2\u0484\u0485"+
		"\5P)\2\u0485\u0486\7#\2\2\u0486\u0487\5J&\2\u0487\u0488\7\6\2\2\u0488"+
		"\u04a8\3\2\2\2\u0489\u048b\7h\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048c\3\2\2\2\u048c\u048e\7H\2\2\u048d\u048a\3\2\2\2\u048d"+
		"\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\5\2\2\u0490\u0491\5>"+
		" \2\u0491\u0492\7\6\2\2\u0492\u04a8\3\2\2\2\u0493\u0495\7,\2\2\u0494\u0496"+
		"\5P)\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u049c\3\2\2\2\u0497"+
		"\u0498\7\u0093\2\2\u0498\u0499\5P)\2\u0499\u049a\7\u0087\2\2\u049a\u049b"+
		"\5P)\2\u049b\u049d\3\2\2\2\u049c\u0497\3\2\2\2\u049d\u049e\3\2\2\2\u049e"+
		"\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u04a1\7C"+
		"\2\2\u04a1\u04a3\5P)\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4"+
		"\3\2\2\2\u04a4\u04a5\7D\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a8\5T+\2\u04a7"+
		"\u045b\3\2\2\2\u04a7\u045d\3\2\2\2\u04a7\u0466\3\2\2\2\u04a7\u0469\3\2"+
		"\2\2\u04a7\u046c\3\2\2\2\u04a7\u047e\3\2\2\2\u04a7\u0482\3\2\2\2\u04a7"+
		"\u048d\3\2\2\2\u04a7\u0493\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u050d\3\2"+
		"\2\2\u04a9\u04aa\f\26\2\2\u04aa\u04ab\7\r\2\2\u04ab\u050c\5P)\27\u04ac"+
		"\u04ad\f\25\2\2\u04ad\u04ae\t\t\2\2\u04ae\u050c\5P)\26\u04af\u04b0\f\24"+
		"\2\2\u04b0\u04b1\t\n\2\2\u04b1\u050c\5P)\25\u04b2\u04b3\f\23\2\2\u04b3"+
		"\u04b4\t\13\2\2\u04b4\u050c\5P)\24\u04b5\u04b6\f\22\2\2\u04b6\u04b7\t"+
		"\f\2\2\u04b7\u050c\5P)\23\u04b8\u04c5\f\21\2\2\u04b9\u04c6\7\b\2\2\u04ba"+
		"\u04c6\7\30\2\2\u04bb\u04c6\7\31\2\2\u04bc\u04c6\7\32\2\2\u04bd\u04c6"+
		"\7^\2\2\u04be\u04bf\7^\2\2\u04bf\u04c6\7h\2\2\u04c0\u04c6\7U\2\2\u04c1"+
		"\u04c6\7c\2\2\u04c2\u04c6\7O\2\2\u04c3\u04c6\7e\2\2\u04c4\u04c6\7x\2\2"+
		"\u04c5\u04b9\3\2\2\2\u04c5\u04ba\3\2\2\2\u04c5\u04bb\3\2\2\2\u04c5\u04bc"+
		"\3\2\2\2\u04c5\u04bd\3\2\2\2\u04c5\u04be\3\2\2\2\u04c5\u04c0\3\2\2\2\u04c5"+
		"\u04c1\3\2\2\2\u04c5\u04c2\3\2\2\2\u04c5\u04c3\3\2\2\2\u04c5\u04c4\3\2"+
		"\2\2\u04c6\u04c7\3\2\2\2\u04c7\u050c\5P)\22\u04c8\u04c9\f\20\2\2\u04c9"+
		"\u04ca\7\"\2\2\u04ca\u050c\5P)\21\u04cb\u04cc\f\17\2\2\u04cc\u04cd\7n"+
		"\2\2\u04cd\u050c\5P)\20\u04ce\u04cf\f\b\2\2\u04cf\u04d1\7^\2\2\u04d0\u04d2"+
		"\7h\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u050c\5P)\t\u04d4\u04d6\f\7\2\2\u04d5\u04d7\7h\2\2\u04d6\u04d5\3\2\2"+
		"\2\u04d6\u04d7\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\7)\2\2\u04d9\u04da"+
		"\5P)\2\u04da\u04db\7\"\2\2\u04db\u04dc\5P)\b\u04dc\u050c\3\2\2\2\u04dd"+
		"\u04de\f\13\2\2\u04de\u04df\7/\2\2\u04df\u050c\5\u0090I\2\u04e0\u04e2"+
		"\f\n\2\2\u04e1\u04e3\7h\2\2\u04e2\u04e1\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3"+
		"\u04e4\3\2\2\2\u04e4\u04e5\t\r\2\2\u04e5\u04e8\5P)\2\u04e6\u04e7\7E\2"+
		"\2\u04e7\u04e9\5P)\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u050c"+
		"\3\2\2\2\u04ea\u04ef\f\t\2\2\u04eb\u04f0\7_\2\2\u04ec\u04f0\7i\2\2\u04ed"+
		"\u04ee\7h\2\2\u04ee\u04f0\7j\2\2\u04ef\u04eb\3\2\2\2\u04ef\u04ec\3\2\2"+
		"\2\u04ef\u04ed\3\2\2\2\u04f0\u050c\3\2\2\2\u04f1\u04f3\f\6\2\2\u04f2\u04f4"+
		"\7h\2\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5"+
		"\u0509\7U\2\2\u04f6\u0500\7\5\2\2\u04f7\u0501\5> \2\u04f8\u04fd\5P)\2"+
		"\u04f9\u04fa\7\7\2\2\u04fa\u04fc\5P)\2\u04fb\u04f9\3\2\2\2\u04fc\u04ff"+
		"\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0501\3\2\2\2\u04ff"+
		"\u04fd\3\2\2\2\u0500\u04f7\3\2\2\2\u0500\u04f8\3\2\2\2\u0500\u0501\3\2"+
		"\2\2\u0501\u0502\3\2\2\2\u0502\u050a\7\6\2\2\u0503\u0504\5\u0086D\2\u0504"+
		"\u0505\7\4\2\2\u0505\u0507\3\2\2\2\u0506\u0503\3\2\2\2\u0506\u0507\3\2"+
		"\2\2\u0507\u0508\3\2\2\2\u0508\u050a\5\u0088E\2\u0509\u04f6\3\2\2\2\u0509"+
		"\u0506\3\2\2\2\u050a\u050c\3\2\2\2\u050b\u04a9\3\2\2\2\u050b\u04ac\3\2"+
		"\2\2\u050b\u04af\3\2\2\2\u050b\u04b2\3\2\2\2\u050b\u04b5\3\2\2\2\u050b"+
		"\u04b8\3\2\2\2\u050b\u04c8\3\2\2\2\u050b\u04cb\3\2\2\2\u050b\u04ce\3\2"+
		"\2\2\u050b\u04d4\3\2\2\2\u050b\u04dd\3\2\2\2\u050b\u04e0\3\2\2\2\u050b"+
		"\u04ea\3\2\2\2\u050b\u04f1\3\2\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2"+
		"\2\2\u050d\u050e\3\2\2\2\u050eQ\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0511"+
		"\7w\2\2\u0511\u051d\5\u0092J\2\u0512\u0513\7\5\2\2\u0513\u0518\5\u008e"+
		"H\2\u0514\u0515\7\7\2\2\u0515\u0517\5\u008eH\2\u0516\u0514\3\2\2\2\u0517"+
		"\u051a\3\2\2\2\u0518\u0516\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051b\3\2"+
		"\2\2\u051a\u0518\3\2\2\2\u051b\u051c\7\6\2\2\u051c\u051e\3\2\2\2\u051d"+
		"\u0512\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0531\3\2\2\2\u051f\u0520\7m"+
		"\2\2\u0520\u0529\t\16\2\2\u0521\u0522\7\u0083\2\2\u0522\u052a\7j\2\2\u0523"+
		"\u0524\7\u0083\2\2\u0524\u052a\7:\2\2\u0525\u052a\7+\2\2\u0526\u052a\7"+
		"}\2\2\u0527\u0528\7g\2\2\u0528\u052a\7\34\2\2\u0529\u0521\3\2\2\2\u0529"+
		"\u0523\3\2\2\2\u0529\u0525\3\2\2\2\u0529\u0526\3\2\2\2\u0529\u0527\3\2"+
		"\2\2\u052a\u052e\3\2\2\2\u052b\u052c\7e\2\2\u052c\u052e\5\u0082B\2\u052d"+
		"\u051f\3\2\2\2\u052d\u052b\3\2\2\2\u052e\u0530\3\2\2\2\u052f\u052d\3\2"+
		"\2\2\u0530\u0533\3\2\2\2\u0531\u052f\3\2\2\2\u0531\u0532\3\2\2\2\u0532"+
		"\u053e\3\2\2\2\u0533\u0531\3\2\2\2\u0534\u0536\7h\2\2\u0535\u0534\3\2"+
		"\2\2\u0535\u0536\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053c\7;\2\2\u0538"+
		"\u0539\7X\2\2\u0539\u053d\7<\2\2\u053a\u053b\7X\2\2\u053b\u053d\7T\2\2"+
		"\u053c\u0538\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f"+
		"\3\2\2\2\u053e\u0535\3\2\2\2\u053e\u053f\3\2\2\2\u053fS\3\2\2\2\u0540"+
		"\u0541\7u\2\2\u0541\u0546\7\5\2\2\u0542\u0547\7S\2\2\u0543\u0544\t\17"+
		"\2\2\u0544\u0545\7\7\2\2\u0545\u0547\5z>\2\u0546\u0542\3\2\2\2\u0546\u0543"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\7\6\2\2\u0549U\3\2\2\2\u054a"+
		"\u054d\5\u008eH\2\u054b\u054c\7/\2\2\u054c\u054e\5\u0090I\2\u054d\u054b"+
		"\3\2\2\2\u054d\u054e\3\2\2\2\u054e\u0550\3\2\2\2\u054f\u0551\t\7\2\2\u0550"+
		"\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551W\3\2\2\2\u0552\u0553\7\63\2\2"+
		"\u0553\u0555\5\u0082B\2\u0554\u0552\3\2\2\2\u0554\u0555\3\2\2\2\u0555"+
		"\u057a\3\2\2\2\u0556\u0557\7s\2\2\u0557\u055a\7a\2\2\u0558\u055a\7\u008c"+
		"\2\2\u0559\u0556\3\2\2\2\u0559\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055c\7\5\2\2\u055c\u0561\5V,\2\u055d\u055e\7\7\2\2\u055e\u0560\5V,\2"+
		"\u055f\u055d\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f\3\2\2\2\u0561\u0562"+
		"\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564\u0565\7\6\2\2\u0565"+
		"\u0566\5N(\2\u0566\u057b\3\2\2\2\u0567\u0568\7.\2\2\u0568\u0569\7\5\2"+
		"\2\u0569\u056a\5P)\2\u056a\u056b\7\6\2\2\u056b\u057b\3\2\2\2\u056c\u056d"+
		"\7L\2\2\u056d\u056e\7a\2\2\u056e\u056f\7\5\2\2\u056f\u0574\5\u008eH\2"+
		"\u0570\u0571\7\7\2\2\u0571\u0573\5\u008eH\2\u0572\u0570\3\2\2\2\u0573"+
		"\u0576\3\2\2\2\u0574\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0577\3\2"+
		"\2\2\u0576\u0574\3\2\2\2\u0577\u0578\7\6\2\2\u0578\u0579\5R*\2\u0579\u057b"+
		"\3\2\2\2\u057a\u0559\3\2\2\2\u057a\u0567\3\2\2\2\u057a\u056c\3\2\2\2\u057b"+
		"Y\3\2\2\2\u057c\u057e\7\u0095\2\2\u057d\u057f\7v\2\2\u057e\u057d\3\2\2"+
		"\2\u057e\u057f\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0581\5r:\2\u0581\u0582"+
		"\7#\2\2\u0582\u0583\7\5\2\2\u0583\u0584\5> \2\u0584\u058e\7\6\2\2\u0585"+
		"\u0586\7\7\2\2\u0586\u0587\5r:\2\u0587\u0588\7#\2\2\u0588\u0589\7\5\2"+
		"\2\u0589\u058a\5> \2\u058a\u058b\7\6\2\2\u058b\u058d\3\2\2\2\u058c\u0585"+
		"\3\2\2\2\u058d\u0590\3\2\2\2\u058e\u058c\3\2\2\2\u058e\u058f\3\2\2\2\u058f"+
		"[\3\2\2\2\u0590\u058e\3\2\2\2\u0591\u0592\5\u0086D\2\u0592\u0593\7\4\2"+
		"\2\u0593\u0595\3\2\2\2\u0594\u0591\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596"+
		"\3\2\2\2\u0596\u059c\5\u0088E\2\u0597\u0598\7W\2\2\u0598\u0599\7*\2\2"+
		"\u0599\u059d\5\u0094K\2\u059a\u059b\7h\2\2\u059b\u059d\7W\2\2\u059c\u0597"+
		"\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d\3\2\2\2\u059d]\3\2\2\2\u059e"+
		"\u05a1\5P)\2\u059f\u05a0\7/\2\2\u05a0\u05a2\5\u0090I\2\u05a1\u059f\3\2"+
		"\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a5\t\7\2\2\u05a4"+
		"\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5_\3\2\2\2\u05a6\u05aa\5t;\2\u05a7"+
		"\u05aa\5\u0082B\2\u05a8\u05aa\7\u009a\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05a7"+
		"\3\2\2\2\u05a9\u05a8\3\2\2\2\u05aaa\3\2\2\2\u05ab\u05b7\5\u0088E\2\u05ac"+
		"\u05ad\7\5\2\2\u05ad\u05b2\5\u008eH\2\u05ae\u05af\7\7\2\2\u05af\u05b1"+
		"\5\u008eH\2\u05b0\u05ae\3\2\2\2\u05b1\u05b4\3\2\2\2\u05b2\u05b0\3\2\2"+
		"\2\u05b2\u05b3\3\2\2\2\u05b3\u05b5\3\2\2\2\u05b4\u05b2\3\2\2\2\u05b5\u05b6"+
		"\7\6\2\2\u05b6\u05b8\3\2\2\2\u05b7\u05ac\3\2\2\2\u05b7\u05b8\3\2\2\2\u05b8"+
		"\u05b9\3\2\2\2\u05b9\u05ba\7#\2\2\u05ba\u05bb\7\5\2\2\u05bb\u05bc\5> "+
		"\2\u05bc\u05bd\7\6\2\2\u05bdc\3\2\2\2\u05be\u05cb\7\t\2\2\u05bf\u05c0"+
		"\5\u0088E\2\u05c0\u05c1\7\4\2\2\u05c1\u05c2\7\t\2\2\u05c2\u05cb\3\2\2"+
		"\2\u05c3\u05c8\5P)\2\u05c4\u05c6\7#\2\2\u05c5\u05c4\3\2\2\2\u05c5\u05c6"+
		"\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\5~@\2\u05c8\u05c5\3\2\2\2\u05c8"+
		"\u05c9\3\2\2\2\u05c9\u05cb\3\2\2\2\u05ca\u05be\3\2\2\2\u05ca\u05bf\3\2"+
		"\2\2\u05ca\u05c3\3\2\2\2\u05cbe\3\2\2\2\u05cc\u05cd\5\u0086D\2\u05cd\u05ce"+
		"\7\4\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05cc\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0"+
		"\u05d1\3\2\2\2\u05d1\u05d6\5\u0088E\2\u05d2\u05d4\7#\2\2\u05d3\u05d2\3"+
		"\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\5\u00a0Q\2"+
		"\u05d6\u05d3\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05dd\3\2\2\2\u05d8\u05d9"+
		"\7W\2\2\u05d9\u05da\7*\2\2\u05da\u05de\5\u0094K\2\u05db\u05dc\7h\2\2\u05dc"+
		"\u05de\7W\2\2\u05dd\u05d8\3\2\2\2\u05dd\u05db\3\2\2\2\u05dd\u05de\3\2"+
		"\2\2\u05de\u05fc\3\2\2\2\u05df\u05e9\7\5\2\2\u05e0\u05e5\5f\64\2\u05e1"+
		"\u05e2\7\7\2\2\u05e2\u05e4\5f\64\2\u05e3\u05e1\3\2\2\2\u05e4\u05e7\3\2"+
		"\2\2\u05e5\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05ea\3\2\2\2\u05e7"+
		"\u05e5\3\2\2\2\u05e8\u05ea\5h\65\2\u05e9\u05e0\3\2\2\2\u05e9\u05e8\3\2"+
		"\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05f0\7\6\2\2\u05ec\u05ee\7#\2\2\u05ed"+
		"\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05ef\3\2\2\2\u05ef\u05f1\5\u00a0"+
		"Q\2\u05f0\u05ed\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1\u05fc\3\2\2\2\u05f2"+
		"\u05f3\7\5\2\2\u05f3\u05f4\5> \2\u05f4\u05f9\7\6\2\2\u05f5\u05f7\7#\2"+
		"\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa"+
		"\5\u00a0Q\2\u05f9\u05f6\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\3\2\2"+
		"\2\u05fb\u05cf\3\2\2\2\u05fb\u05df\3\2\2\2\u05fb\u05f2\3\2\2\2\u05fcg"+
		"\3\2\2\2\u05fd\u0604\5f\64\2\u05fe\u05ff\5j\66\2\u05ff\u0600\5f\64\2\u0600"+
		"\u0601\5l\67\2\u0601\u0603\3\2\2\2\u0602\u05fe\3\2\2\2\u0603\u0606\3\2"+
		"\2\2\u0604\u0602\3\2\2\2\u0604\u0605\3\2\2\2\u0605i\3\2\2\2\u0606\u0604"+
		"\3\2\2\2\u0607\u0615\7\7\2\2\u0608\u060a\7f\2\2\u0609\u0608\3\2\2\2\u0609"+
		"\u060a\3\2\2\2\u060a\u0611\3\2\2\2\u060b\u060d\7b\2\2\u060c\u060e\7p\2"+
		"\2\u060d\u060c\3\2\2\2\u060d\u060e\3\2\2\2\u060e\u0612\3\2\2\2\u060f\u0612"+
		"\7Y\2\2\u0610\u0612\7\65\2\2\u0611\u060b\3\2\2\2\u0611\u060f\3\2\2\2\u0611"+
		"\u0610\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\7`"+
		"\2\2\u0614\u0607\3\2\2\2\u0614\u0609\3\2\2\2\u0615k\3\2\2\2\u0616\u0617"+
		"\7m\2\2\u0617\u0625\5P)\2\u0618\u0619\7\u008e\2\2\u0619\u061a\7\5\2\2"+
		"\u061a\u061f\5\u008eH\2\u061b\u061c\7\7\2\2\u061c\u061e\5\u008eH\2\u061d"+
		"\u061b\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u061d\3\2\2\2\u061f\u0620\3\2"+
		"\2\2\u0620\u0622\3\2\2\2\u0621\u061f\3\2\2\2\u0622\u0623\7\6\2\2\u0623"+
		"\u0625\3\2\2\2\u0624\u0616\3\2\2\2\u0624\u0618\3\2\2\2\u0624\u0625\3\2"+
		"\2\2\u0625m\3\2\2\2\u0626\u0628\7\u0082\2\2\u0627\u0629\t\6\2\2\u0628"+
		"\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062f\5d"+
		"\63\2\u062b\u062c\7\7\2\2\u062c\u062e\5d\63\2\u062d\u062b\3\2\2\2\u062e"+
		"\u0631\3\2\2\2\u062f\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u063e\3\2"+
		"\2\2\u0631\u062f\3\2\2\2\u0632\u063c\7M\2\2\u0633\u0638\5f\64\2\u0634"+
		"\u0635\7\7\2\2\u0635\u0637\5f\64\2\u0636\u0634\3\2\2\2\u0637\u063a\3\2"+
		"\2\2\u0638\u0636\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063d\3\2\2\2\u063a"+
		"\u0638\3\2\2\2\u063b\u063d\5h\65\2\u063c\u0633\3\2\2\2\u063c\u063b\3\2"+
		"\2\2\u063d\u063f\3\2\2\2\u063e\u0632\3\2\2\2\u063e\u063f\3\2\2\2\u063f"+
		"\u0642\3\2\2\2\u0640\u0641\7\u0094\2\2\u0641\u0643\5P)\2\u0642\u0640\3"+
		"\2\2\2\u0642\u0643\3\2\2\2\u0643\u0652\3\2\2\2\u0644\u0645\7P\2\2\u0645"+
		"\u0646\7*\2\2\u0646\u064b\5P)\2\u0647\u0648\7\7\2\2\u0648\u064a\5P)\2"+
		"\u0649\u0647\3\2\2\2\u064a\u064d\3\2\2\2\u064b\u0649\3\2\2\2\u064b\u064c"+
		"\3\2\2\2\u064c\u0650\3\2\2\2\u064d\u064b\3\2\2\2\u064e\u064f\7Q\2\2\u064f"+
		"\u0651\5P)\2\u0650\u064e\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0653\3\2\2"+
		"\2\u0652\u0644\3\2\2\2\u0652\u0653\3\2\2\2\u0653\u0671\3\2\2\2\u0654\u0655"+
		"\7\u0090\2\2\u0655\u0656\7\5\2\2\u0656\u065b\5P)\2\u0657\u0658\7\7\2\2"+
		"\u0658\u065a\5P)\2\u0659\u0657\3\2\2\2\u065a\u065d\3\2\2\2\u065b\u0659"+
		"\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065e\3\2\2\2\u065d\u065b\3\2\2\2\u065e"+
		"\u066d\7\6\2\2\u065f\u0660\7\7\2\2\u0660\u0661\7\5\2\2\u0661\u0666\5P"+
		")\2\u0662\u0663\7\7\2\2\u0663\u0665\5P)\2\u0664\u0662\3\2\2\2\u0665\u0668"+
		"\3\2\2\2\u0666\u0664\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0669\3\2\2\2\u0668"+
		"\u0666\3\2\2\2\u0669\u066a\7\6\2\2\u066a\u066c\3\2\2\2\u066b\u065f\3\2"+
		"\2\2\u066c\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e"+
		"\u0671\3\2\2\2\u066f\u066d\3\2\2\2\u0670\u0626\3\2\2\2\u0670\u0654\3\2"+
		"\2\2\u0671o\3\2\2\2\u0672\u0678\7\u008b\2\2\u0673\u0674\7\u008b\2\2\u0674"+
		"\u0678\7\37\2\2\u0675\u0678\7\\\2\2\u0676\u0678\7F\2\2\u0677\u0672\3\2"+
		"\2\2\u0677\u0673\3\2\2\2\u0677\u0675\3\2\2\2\u0677\u0676\3\2\2\2\u0678"+
		"q\3\2\2\2\u0679\u0685\5\u0088E\2\u067a\u067b\7\5\2\2\u067b\u0680\5\u008e"+
		"H\2\u067c\u067d\7\7\2\2\u067d\u067f\5\u008eH\2\u067e\u067c\3\2\2\2\u067f"+
		"\u0682\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0683\3\2"+
		"\2\2\u0682\u0680\3\2\2\2\u0683\u0684\7\6\2\2\u0684\u0686\3\2\2\2\u0685"+
		"\u067a\3\2\2\2\u0685\u0686\3\2\2\2\u0686s\3\2\2\2\u0687\u0689\t\n\2\2"+
		"\u0688\u0687\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068b"+
		"\7\u0098\2\2\u068bu\3\2\2\2\u068c\u068d\t\20\2\2\u068dw\3\2\2\2\u068e"+
		"\u068f\t\21\2\2\u068fy\3\2\2\2\u0690\u0691\7\u009a\2\2\u0691{\3\2\2\2"+
		"\u0692\u0695\5P)\2\u0693\u0695\5H%\2\u0694\u0692\3\2\2\2\u0694\u0693\3"+
		"\2\2\2\u0695}\3\2\2\2\u0696\u0697\t\22\2\2\u0697\177\3\2\2\2\u0698\u0699"+
		"\t\23\2\2\u0699\u0081\3\2\2\2\u069a\u069b\5\u00a4S\2\u069b\u0083\3\2\2"+
		"\2\u069c\u069d\5\u00a4S\2\u069d\u0085\3\2\2\2\u069e\u069f\5\u00a4S\2\u069f"+
		"\u0087\3\2\2\2\u06a0\u06a1\5\u00a4S\2\u06a1\u0089\3\2\2\2\u06a2\u06a3"+
		"\5\u00a4S\2\u06a3\u008b\3\2\2\2\u06a4\u06a5\5\u00a4S\2\u06a5\u008d\3\2"+
		"\2\2\u06a6\u06a7\5\u00a4S\2\u06a7\u008f\3\2\2\2\u06a8\u06a9\5\u00a4S\2"+
		"\u06a9\u0091\3\2\2\2\u06aa\u06ab\5\u00a4S\2\u06ab\u0093\3\2\2\2\u06ac"+
		"\u06ad\5\u00a4S\2\u06ad\u0095\3\2\2\2\u06ae\u06af\5\u00a4S\2\u06af\u0097"+
		"\3\2\2\2\u06b0\u06b1\5\u00a4S\2\u06b1\u0099\3\2\2\2\u06b2\u06b3\5\u00a4"+
		"S\2\u06b3\u009b\3\2\2\2\u06b4\u06b5\5\u00a4S\2\u06b5\u009d\3\2\2\2\u06b6"+
		"\u06b7\5\u00a4S\2\u06b7\u009f\3\2\2\2\u06b8\u06b9\5\u00a4S\2\u06b9\u00a1"+
		"\3\2\2\2\u06ba\u06bb\5\u00a4S\2\u06bb\u00a3\3\2\2\2\u06bc\u06c4\7\u0097"+
		"\2\2\u06bd\u06c4\5\u0080A\2\u06be\u06c4\7\u009a\2\2\u06bf\u06c0\7\5\2"+
		"\2\u06c0\u06c1\5\u00a4S\2\u06c1\u06c2\7\6\2\2\u06c2\u06c4\3\2\2\2\u06c3"+
		"\u06bc\3\2\2\2\u06c3\u06bd\3\2\2\2\u06c3\u06be\3\2\2\2\u06c3\u06bf\3\2"+
		"\2\2\u06c4\u00a5\3\2\2\2\u00f6\u00a8\u00aa\u00b5\u00bc\u00c1\u00c7\u00cd"+
		"\u00cf\u00ef\u00f6\u00fe\u0101\u010a\u010e\u0116\u011a\u011c\u0121\u0123"+
		"\u0127\u012e\u0131\u0136\u013a\u013f\u0148\u014b\u0151\u0153\u0157\u015d"+
		"\u0162\u016d\u0173\u0177\u017d\u0182\u018b\u0192\u0198\u019c\u01a0\u01a6"+
		"\u01ab\u01b2\u01bd\u01c0\u01c2\u01c8\u01ce\u01d2\u01d9\u01df\u01e5\u01eb"+
		"\u01f0\u01fc\u0201\u020c\u0211\u0214\u021b\u021e\u0225\u022e\u0231\u0237"+
		"\u0239\u023d\u0245\u024a\u0252\u0257\u025f\u0264\u026c\u0271\u0277\u027e"+
		"\u0281\u0289\u0293\u0296\u029c\u029e\u02a1\u02b4\u02ba\u02c3\u02c8\u02d1"+
		"\u02dc\u02e3\u02e9\u02ef\u02f8\u02ff\u0303\u0305\u0309\u0310\u0312\u0316"+
		"\u0319\u0320\u0327\u032a\u0334\u0337\u033d\u033f\u0343\u034a\u034d\u0355"+
		"\u035f\u0362\u0368\u036a\u036e\u0375\u037e\u0382\u0384\u0388\u0391\u0396"+
		"\u0398\u03a1\u03ac\u03b3\u03b6\u03b9\u03c6\u03d4\u03d9\u03dc\u03e9\u03f7"+
		"\u03fc\u0405\u0408\u040e\u0410\u0416\u041b\u0421\u042d\u0431\u0436\u043a"+
		"\u043d\u044f\u0454\u0459\u0461\u0466\u046f\u0476\u047a\u048a\u048d\u0495"+
		"\u049e\u04a2\u04a7\u04c5\u04d1\u04d6\u04e2\u04e8\u04ef\u04f3\u04fd\u0500"+
		"\u0506\u0509\u050b\u050d\u0518\u051d\u0529\u052d\u0531\u0535\u053c\u053e"+
		"\u0546\u054d\u0550\u0554\u0559\u0561\u0574\u057a\u057e\u058e\u0594\u059c"+
		"\u05a1\u05a4\u05a9\u05b2\u05b7\u05c5\u05c8\u05ca\u05cf\u05d3\u05d6\u05dd"+
		"\u05e5\u05e9\u05ed\u05f0\u05f6\u05f9\u05fb\u0604\u0609\u060d\u0611\u0614"+
		"\u061f\u0624\u0628\u062f\u0638\u063c\u063e\u0642\u064b\u0650\u0652\u065b"+
		"\u0666\u066d\u0670\u0677\u0680\u0685\u0688\u0694\u06c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}