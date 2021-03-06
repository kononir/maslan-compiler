// Generated from D:/My Programs/maslan/src/main/resources\Maslan.g4 by ANTLR 4.7.2
package com.bsuir.maslan.lang.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaslanLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID_TYPE=1, INT_TYPE=2, VECTOR_TYPE=3, MATRIX_TYPE=4, RETURN=5, MAIN=6, 
		PRINT=7, LEN=8, NCOL=9, NROW=10, SET=11, GET=12, INSERT=13, REMOVE=14, 
		IF=15, ELSE=16, DO=17, WHILE=18, FOR=19, ID=20, INT=21, ASSIGMENT=22, 
		DOT=23, COMMA=24, SEMICOLON=25, LEFT_BRACKET=26, RIGHT_BRACKET=27, LEFT_FIGURE_BRACKET=28, 
		RIGHT_FIGURE_BRACKET=29, ADD=30, SUBTRACT=31, MULTIPLY=32, EQUAL=33, NON_EQUAL=34, 
		LESS=35, GREATER=36, WS=37, SINGLE_COMMENT=38, MULTI_COMMENT=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID_SYMBOL", "DIGIT", "VOID_TYPE", "INT_TYPE", "VECTOR_TYPE", "MATRIX_TYPE", 
			"RETURN", "MAIN", "PRINT", "LEN", "NCOL", "NROW", "SET", "GET", "INSERT", 
			"REMOVE", "IF", "ELSE", "DO", "WHILE", "FOR", "ID", "INT", "ASSIGMENT", 
			"DOT", "COMMA", "SEMICOLON", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_FIGURE_BRACKET", 
			"RIGHT_FIGURE_BRACKET", "ADD", "SUBTRACT", "MULTIPLY", "EQUAL", "NON_EQUAL", 
			"LESS", "GREATER", "WS", "SINGLE_COMMENT", "MULTI_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'int'", "'vector'", "'matrix'", "'return'", "'main'", 
			"'print'", "'len'", "'ncol'", "'nrow'", "'set'", "'get'", "'insert'", 
			"'remove'", "'if'", "'else'", "'do'", "'while'", "'for'", null, null, 
			"'='", "'.'", "','", "';'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", 
			"'*'", "'=='", "'!='", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID_TYPE", "INT_TYPE", "VECTOR_TYPE", "MATRIX_TYPE", "RETURN", 
			"MAIN", "PRINT", "LEN", "NCOL", "NROW", "SET", "GET", "INSERT", "REMOVE", 
			"IF", "ELSE", "DO", "WHILE", "FOR", "ID", "INT", "ASSIGMENT", "DOT", 
			"COMMA", "SEMICOLON", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_FIGURE_BRACKET", 
			"RIGHT_FIGURE_BRACKET", "ADD", "SUBTRACT", "MULTIPLY", "EQUAL", "NON_EQUAL", 
			"LESS", "GREATER", "WS", "SINGLE_COMMENT", "MULTI_COMMENT"
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


	public MaslanLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Maslan.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\7\27\u00bf\n\27\f\27\16\27"+
		"\u00c2\13\27\3\30\6\30\u00c5\n\30\r\30\16\30\u00c6\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\""+
		"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3(\6(\u00ea\n(\r(\16(\u00eb\3("+
		"\3(\3)\3)\3)\3)\7)\u00f4\n)\f)\16)\u00f7\13)\3)\5)\u00fa\n)\3)\3)\3)\3"+
		")\3*\3*\3*\3*\7*\u0104\n*\f*\16*\u0107\13*\3*\3*\3*\3*\3*\4\u00f5\u0105"+
		"\2+\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35"+
		"=\36?\37A C!E\"G#I$K%M&O\'Q(S)\3\2\5\6\2&&C\\aac|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u0111\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2"+
		"\2\5W\3\2\2\2\7Y\3\2\2\2\t^\3\2\2\2\13b\3\2\2\2\ri\3\2\2\2\17p\3\2\2\2"+
		"\21w\3\2\2\2\23|\3\2\2\2\25\u0082\3\2\2\2\27\u0086\3\2\2\2\31\u008b\3"+
		"\2\2\2\33\u0090\3\2\2\2\35\u0094\3\2\2\2\37\u0098\3\2\2\2!\u009f\3\2\2"+
		"\2#\u00a6\3\2\2\2%\u00a9\3\2\2\2\'\u00ae\3\2\2\2)\u00b1\3\2\2\2+\u00b7"+
		"\3\2\2\2-\u00bb\3\2\2\2/\u00c4\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00da\3\2\2\2E\u00dc\3\2\2\2G"+
		"\u00de\3\2\2\2I\u00e1\3\2\2\2K\u00e4\3\2\2\2M\u00e6\3\2\2\2O\u00e9\3\2"+
		"\2\2Q\u00ef\3\2\2\2S\u00ff\3\2\2\2UV\t\2\2\2V\4\3\2\2\2WX\t\3\2\2X\6\3"+
		"\2\2\2YZ\7x\2\2Z[\7q\2\2[\\\7k\2\2\\]\7f\2\2]\b\3\2\2\2^_\7k\2\2_`\7p"+
		"\2\2`a\7v\2\2a\n\3\2\2\2bc\7x\2\2cd\7g\2\2de\7e\2\2ef\7v\2\2fg\7q\2\2"+
		"gh\7t\2\2h\f\3\2\2\2ij\7o\2\2jk\7c\2\2kl\7v\2\2lm\7t\2\2mn\7k\2\2no\7"+
		"z\2\2o\16\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7v\2\2st\7w\2\2tu\7t\2\2uv\7p\2"+
		"\2v\20\3\2\2\2wx\7o\2\2xy\7c\2\2yz\7k\2\2z{\7p\2\2{\22\3\2\2\2|}\7r\2"+
		"\2}~\7t\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080\u0081\7v\2\2\u0081\24\3"+
		"\2\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085"+
		"\26\3\2\2\2\u0086\u0087\7p\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089"+
		"\u008a\7n\2\2\u008a\30\3\2\2\2\u008b\u008c\7p\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7q\2\2\u008e\u008f\7y\2\2\u008f\32\3\2\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7g\2\2\u0092\u0093\7v\2\2\u0093\34\3\2\2\2\u0094\u0095\7i\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\36\3\2\2\2\u0098\u0099\7k\2\2\u0099"+
		"\u009a\7p\2\2\u009a\u009b\7u\2\2\u009b\u009c\7g\2\2\u009c\u009d\7t\2\2"+
		"\u009d\u009e\7v\2\2\u009e \3\2\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7g\2"+
		"\2\u00a1\u00a2\7o\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7x\2\2\u00a4\u00a5"+
		"\7g\2\2\u00a5\"\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7h\2\2\u00a8$\3"+
		"\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad&\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"(\3\2\2\2\u00b1\u00b2\7y\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7n\2\2\u00b5\u00b6\7g\2\2\u00b6*\3\2\2\2\u00b7\u00b8\7h\2\2\u00b8"+
		"\u00b9\7q\2\2\u00b9\u00ba\7t\2\2\u00ba,\3\2\2\2\u00bb\u00c0\5\3\2\2\u00bc"+
		"\u00bf\5\3\2\2\u00bd\u00bf\5\5\3\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		".\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\5\5\3\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\60"+
		"\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\62\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb"+
		"\64\3\2\2\2\u00cc\u00cd\7.\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7=\2\2\u00cf"+
		"8\3\2\2\2\u00d0\u00d1\7*\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7+\2\2\u00d3<"+
		"\3\2\2\2\u00d4\u00d5\7}\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7\177\2\2\u00d7"+
		"@\3\2\2\2\u00d8\u00d9\7-\2\2\u00d9B\3\2\2\2\u00da\u00db\7/\2\2\u00dbD"+
		"\3\2\2\2\u00dc\u00dd\7,\2\2\u00ddF\3\2\2\2\u00de\u00df\7?\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0H\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e3\7?\2\2\u00e3J\3"+
		"\2\2\2\u00e4\u00e5\7>\2\2\u00e5L\3\2\2\2\u00e6\u00e7\7@\2\2\u00e7N\3\2"+
		"\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b("+
		"\2\2\u00eeP\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7\61\2\2\u00f1\u00f5"+
		"\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fa\7\17\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\b)\2\2\u00feR\3\2\2\2\u00ff\u0100\7\61\2\2\u0100\u0101\7,\2\2\u0101\u0105"+
		"\3\2\2\2\u0102\u0104\13\2\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0105"+
		"\3\2\2\2\u0108\u0109\7,\2\2\u0109\u010a\7\61\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\b*\2\2\u010cT\3\2\2\2\n\2\u00be\u00c0\u00c6\u00eb\u00f5\u00f9\u0105"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}