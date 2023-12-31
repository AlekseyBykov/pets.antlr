// Generated from alekseybykov\pets\parsers\antlr4\Java.g4 by ANTLR 4.7.1
package alekseybykov.pets.parsers.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ASTERISK=18, DOT=19, COMMA=20, SEMICOLON=21, IDENTIFIER=22, SPACE=23, 
		COMMENT=24, ANY=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"ASTERISK", "DOT", "COMMA", "SEMICOLON", "IDENTIFIER", "SPACE", "COMMENT", 
		"ANY"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'public '", "'protected '", "'private '", "'static '", "'abstract '", 
		"'final '", "'native '", "'synchronized '", "'transient '", "'volatile '", 
		"'strictfp '", "'package '", "'import '", "'interface '", "'class '", 
		"' implements '", "' extends '", "'*'", "'.'", "','", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ASTERISK", "DOT", "COMMA", "SEMICOLON", 
		"IDENTIFIER", "SPACE", "COMMENT", "ANY"
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


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

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
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 23:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

						skip();
					
			break;
		case 1:

						skip();
					
			break;
		case 2:

						skip();
					
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0119\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\3\30\6\30\u00ea\n\30"+
		"\r\30\16\30\u00eb\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00f4\n\31\f\31\16"+
		"\31\u00f7\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0101\n\31"+
		"\f\31\16\31\u0104\13\31\3\31\3\31\3\31\5\31\u0109\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\7\31\u0110\n\31\f\31\16\31\u0113\13\31\3\31\5\31\u0116\n\31"+
		"\3\32\3\32\3\u00f5\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\3\2\6\4\2C\\c|\6\2\62;C\\aac|\4\2\13\f\17\17\4\2\f\f\17\17\2\u0120"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5=\3\2\2\2\7H\3\2\2\2\tQ\3\2"+
		"\2\2\13Y\3\2\2\2\rc\3\2\2\2\17j\3\2\2\2\21r\3\2\2\2\23\u0080\3\2\2\2\25"+
		"\u008b\3\2\2\2\27\u0095\3\2\2\2\31\u009f\3\2\2\2\33\u00a8\3\2\2\2\35\u00b0"+
		"\3\2\2\2\37\u00bb\3\2\2\2!\u00c2\3\2\2\2#\u00cf\3\2\2\2%\u00d9\3\2\2\2"+
		"\'\u00db\3\2\2\2)\u00dd\3\2\2\2+\u00df\3\2\2\2-\u00e1\3\2\2\2/\u00e9\3"+
		"\2\2\2\61\u0115\3\2\2\2\63\u0117\3\2\2\2\65\66\7r\2\2\66\67\7w\2\2\67"+
		"8\7d\2\289\7n\2\29:\7k\2\2:;\7e\2\2;<\7\"\2\2<\4\3\2\2\2=>\7r\2\2>?\7"+
		"t\2\2?@\7q\2\2@A\7v\2\2AB\7g\2\2BC\7e\2\2CD\7v\2\2DE\7g\2\2EF\7f\2\2F"+
		"G\7\"\2\2G\6\3\2\2\2HI\7r\2\2IJ\7t\2\2JK\7k\2\2KL\7x\2\2LM\7c\2\2MN\7"+
		"v\2\2NO\7g\2\2OP\7\"\2\2P\b\3\2\2\2QR\7u\2\2RS\7v\2\2ST\7c\2\2TU\7v\2"+
		"\2UV\7k\2\2VW\7e\2\2WX\7\"\2\2X\n\3\2\2\2YZ\7c\2\2Z[\7d\2\2[\\\7u\2\2"+
		"\\]\7v\2\2]^\7t\2\2^_\7c\2\2_`\7e\2\2`a\7v\2\2ab\7\"\2\2b\f\3\2\2\2cd"+
		"\7h\2\2de\7k\2\2ef\7p\2\2fg\7c\2\2gh\7n\2\2hi\7\"\2\2i\16\3\2\2\2jk\7"+
		"p\2\2kl\7c\2\2lm\7v\2\2mn\7k\2\2no\7x\2\2op\7g\2\2pq\7\"\2\2q\20\3\2\2"+
		"\2rs\7u\2\2st\7{\2\2tu\7p\2\2uv\7e\2\2vw\7j\2\2wx\7t\2\2xy\7q\2\2yz\7"+
		"p\2\2z{\7k\2\2{|\7|\2\2|}\7g\2\2}~\7f\2\2~\177\7\"\2\2\177\22\3\2\2\2"+
		"\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7p\2\2\u0084\u0085\7u\2\2\u0085\u0086\7k\2\2\u0086\u0087\7g\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\u008a\7\"\2\2\u008a\24\3\2\2\2"+
		"\u008b\u008c\7x\2\2\u008c\u008d\7q\2\2\u008d\u008e\7n\2\2\u008e\u008f"+
		"\7c\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7n\2\2\u0092"+
		"\u0093\7g\2\2\u0093\u0094\7\"\2\2\u0094\26\3\2\2\2\u0095\u0096\7u\2\2"+
		"\u0096\u0097\7v\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099\u009a"+
		"\7e\2\2\u009a\u009b\7v\2\2\u009b\u009c\7h\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7\"\2\2\u009e\30\3\2\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7c\2\2"+
		"\u00a1\u00a2\7e\2\2\u00a2\u00a3\7m\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7i\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7\"\2\2\u00a7\32\3\2\2\2\u00a8"+
		"\u00a9\7k\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab\7r\2\2\u00ab\u00ac\7q\2\2"+
		"\u00ac\u00ad\7t\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7\"\2\2\u00af\34\3"+
		"\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7c\2\2"+
		"\u00b7\u00b8\7e\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7\"\2\2\u00ba\36\3"+
		"\2\2\2\u00bb\u00bc\7e\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7c\2\2\u00be"+
		"\u00bf\7u\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7\"\2\2\u00c1 \3\2\2\2\u00c2"+
		"\u00c3\7\"\2\2\u00c3\u00c4\7k\2\2\u00c4\u00c5\7o\2\2\u00c5\u00c6\7r\2"+
		"\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7o\2\2\u00c9\u00ca"+
		"\7g\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7u\2\2\u00cd"+
		"\u00ce\7\"\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7\"\2\2\u00d0\u00d1\7g\2\2"+
		"\u00d1\u00d2\7z\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5"+
		"\7p\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7\"\2\2\u00d8"+
		"$\3\2\2\2\u00d9\u00da\7,\2\2\u00da&\3\2\2\2\u00db\u00dc\7\60\2\2\u00dc"+
		"(\3\2\2\2\u00dd\u00de\7.\2\2\u00de*\3\2\2\2\u00df\u00e0\7=\2\2\u00e0,"+
		"\3\2\2\2\u00e1\u00e5\t\2\2\2\u00e2\u00e4\t\3\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6.\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e8\u00ea\t\4\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b\30\2\2\u00ee\60\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7,\2"+
		"\2\u00f1\u00f5\3\2\2\2\u00f2\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7\61\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u0116\b\31\3\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\7"+
		"\61\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\n\5\2\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0108\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\17\2\2\u0106\u0109\7\f\2\2\u0107"+
		"\u0109\t\5\2\2\u0108\u0105\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u0116\b\31\4\2\u010b\u010c\7\61\2\2\u010c\u010d\7\61\2\2\u010d"+
		"\u0111\3\2\2\2\u010e\u0110\n\5\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0116\b\31\5\2\u0115\u00ef\3\2\2\2\u0115\u00fc\3"+
		"\2\2\2\u0115\u010b\3\2\2\2\u0116\62\3\2\2\2\u0117\u0118\13\2\2\2\u0118"+
		"\64\3\2\2\2\n\2\u00e5\u00eb\u00f5\u0102\u0108\u0111\u0115\6\2\3\2\3\31"+
		"\2\3\31\3\3\31\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}