// Generated from Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_PROGRAMA=1, T_INICIOCOMANDO=2, T_INTEIRO=3, T_BOOLV=4, T_BOOLF=5, T_NEGACAO=6, 
		T_LEIA=7, T_ENQUANTO=8, T_FACA=9, T_DIFERENCA=10, T_IGUAL=11, T_MENOR=12, 
		T_MAIOR=13, T_MAIORIGUAL=14, T_MULT=15, T_DIV=16, T_OU=17, T_E=18, T_MAIS=19, 
		T_MENOS=20, T_PROCEDIMENTO=21, T_SE=22, T_ENTAO=23, T_SENAO=24, T_ATRIBUICAO=25, 
		T_FUNCAO=26, T_BOOLEANO=27, T_FIMCOMANDO=28, T_PONTOEVIRGULA=29, T_FIM=30, 
		T_VAR=31, T_VIRGULA=32, T_DOISPONTOS=33, T_ABREPARENTESES=34, T_FECHAPARENTESES=35, 
		T_ESCREVA=36, T_UNDERLINE=37, T_DIGITO=38, T_LETRA=39, WS=40, COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_PROGRAMA", "T_INICIOCOMANDO", "T_INTEIRO", "T_BOOLV", "T_BOOLF", "T_NEGACAO", 
			"T_LEIA", "T_ENQUANTO", "T_FACA", "T_DIFERENCA", "T_IGUAL", "T_MENOR", 
			"T_MAIOR", "T_MAIORIGUAL", "T_MULT", "T_DIV", "T_OU", "T_E", "T_MAIS", 
			"T_MENOS", "T_PROCEDIMENTO", "T_SE", "T_ENTAO", "T_SENAO", "T_ATRIBUICAO", 
			"T_FUNCAO", "T_BOOLEANO", "T_FIMCOMANDO", "T_PONTOEVIRGULA", "T_FIM", 
			"T_VAR", "T_VIRGULA", "T_DOISPONTOS", "T_ABREPARENTESES", "T_FECHAPARENTESES", 
			"T_ESCREVA", "T_UNDERLINE", "T_DIGITO", "T_LETRA", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'inteiro'", "'verdadeiro'", "'falso'", 
			"'nao'", "'leia'", "'enquanto'", "'faca'", "'<>'", "'='", "'<'", "'>'", 
			"'>='", "'*'", "'div'", "'ou'", "'e'", "'+'", "'-'", "'procedimento'", 
			"'se'", "'entao'", "'senao'", "':='", "'funcao'", "'booleano'", "'fim'", 
			"';'", "'fim.'", "'var'", "','", "'.'", "'('", "')'", "'escreva'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_PROGRAMA", "T_INICIOCOMANDO", "T_INTEIRO", "T_BOOLV", "T_BOOLF", 
			"T_NEGACAO", "T_LEIA", "T_ENQUANTO", "T_FACA", "T_DIFERENCA", "T_IGUAL", 
			"T_MENOR", "T_MAIOR", "T_MAIORIGUAL", "T_MULT", "T_DIV", "T_OU", "T_E", 
			"T_MAIS", "T_MENOS", "T_PROCEDIMENTO", "T_SE", "T_ENTAO", "T_SENAO", 
			"T_ATRIBUICAO", "T_FUNCAO", "T_BOOLEANO", "T_FIMCOMANDO", "T_PONTOEVIRGULA", 
			"T_FIM", "T_VAR", "T_VIRGULA", "T_DOISPONTOS", "T_ABREPARENTESES", "T_FECHAPARENTESES", 
			"T_ESCREVA", "T_UNDERLINE", "T_DIGITO", "T_LETRA", "WS", "COMMENT"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u011f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#"+
		"\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3\'\6\'\u0102\n\'\r\'\16\'\u0103"+
		"\3(\6(\u0107\n(\r(\16(\u0108\3)\6)\u010c\n)\r)\16)\u010d\3)\3)\3*\3*\7"+
		"*\u0114\n*\f*\16*\u0117\13*\3*\5*\u011a\n*\3*\3*\3*\3*\2\2+\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+\3\2\5\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0123"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3"+
		"U\3\2\2\2\5^\3\2\2\2\7e\3\2\2\2\tm\3\2\2\2\13x\3\2\2\2\r~\3\2\2\2\17\u0082"+
		"\3\2\2\2\21\u0087\3\2\2\2\23\u0090\3\2\2\2\25\u0095\3\2\2\2\27\u0098\3"+
		"\2\2\2\31\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37\u00a1\3\2"+
		"\2\2!\u00a3\3\2\2\2#\u00a7\3\2\2\2%\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b0\3\2\2\2-\u00bd\3\2\2\2/\u00c0\3\2\2\2\61\u00c6\3\2\2\2"+
		"\63\u00cc\3\2\2\2\65\u00cf\3\2\2\2\67\u00d6\3\2\2\29\u00df\3\2\2\2;\u00e3"+
		"\3\2\2\2=\u00e5\3\2\2\2?\u00ea\3\2\2\2A\u00ee\3\2\2\2C\u00f0\3\2\2\2E"+
		"\u00f2\3\2\2\2G\u00f4\3\2\2\2I\u00f6\3\2\2\2K\u00fe\3\2\2\2M\u0101\3\2"+
		"\2\2O\u0106\3\2\2\2Q\u010b\3\2\2\2S\u0111\3\2\2\2UV\7r\2\2VW\7t\2\2WX"+
		"\7q\2\2XY\7i\2\2YZ\7t\2\2Z[\7c\2\2[\\\7o\2\2\\]\7c\2\2]\4\3\2\2\2^_\7"+
		"k\2\2_`\7p\2\2`a\7k\2\2ab\7e\2\2bc\7k\2\2cd\7q\2\2d\6\3\2\2\2ef\7k\2\2"+
		"fg\7p\2\2gh\7v\2\2hi\7g\2\2ij\7k\2\2jk\7t\2\2kl\7q\2\2l\b\3\2\2\2mn\7"+
		"x\2\2no\7g\2\2op\7t\2\2pq\7f\2\2qr\7c\2\2rs\7f\2\2st\7g\2\2tu\7k\2\2u"+
		"v\7t\2\2vw\7q\2\2w\n\3\2\2\2xy\7h\2\2yz\7c\2\2z{\7n\2\2{|\7u\2\2|}\7q"+
		"\2\2}\f\3\2\2\2~\177\7p\2\2\177\u0080\7c\2\2\u0080\u0081\7q\2\2\u0081"+
		"\16\3\2\2\2\u0082\u0083\7n\2\2\u0083\u0084\7g\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7c\2\2\u0086\20\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7p\2\2\u0089"+
		"\u008a\7s\2\2\u008a\u008b\7w\2\2\u008b\u008c\7c\2\2\u008c\u008d\7p\2\2"+
		"\u008d\u008e\7v\2\2\u008e\u008f\7q\2\2\u008f\22\3\2\2\2\u0090\u0091\7"+
		"h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7e\2\2\u0093\u0094\7c\2\2\u0094\24"+
		"\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7@\2\2\u0097\26\3\2\2\2\u0098"+
		"\u0099\7?\2\2\u0099\30\3\2\2\2\u009a\u009b\7>\2\2\u009b\32\3\2\2\2\u009c"+
		"\u009d\7@\2\2\u009d\34\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0\7?\2\2\u00a0"+
		"\36\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2 \3\2\2\2\u00a3\u00a4\7f\2\2\u00a4"+
		"\u00a5\7k\2\2\u00a5\u00a6\7x\2\2\u00a6\"\3\2\2\2\u00a7\u00a8\7q\2\2\u00a8"+
		"\u00a9\7w\2\2\u00a9$\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab&\3\2\2\2\u00ac\u00ad"+
		"\7-\2\2\u00ad(\3\2\2\2\u00ae\u00af\7/\2\2\u00af*\3\2\2\2\u00b0\u00b1\7"+
		"r\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7f\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7o\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7q\2\2"+
		"\u00bc,\3\2\2\2\u00bd\u00be\7u\2\2\u00be\u00bf\7g\2\2\u00bf.\3\2\2\2\u00c0"+
		"\u00c1\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7c\2\2"+
		"\u00c4\u00c5\7q\2\2\u00c5\60\3\2\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7"+
		"g\2\2\u00c8\u00c9\7p\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7q\2\2\u00cb\62"+
		"\3\2\2\2\u00cc\u00cd\7<\2\2\u00cd\u00ce\7?\2\2\u00ce\64\3\2\2\2\u00cf"+
		"\u00d0\7h\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7e\2\2"+
		"\u00d3\u00d4\7c\2\2\u00d4\u00d5\7q\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7"+
		"d\2\2\u00d7\u00d8\7q\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7n\2\2\u00da\u00db"+
		"\7g\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7q\2\2\u00de"+
		"8\3\2\2\2\u00df\u00e0\7h\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7o\2\2\u00e2"+
		":\3\2\2\2\u00e3\u00e4\7=\2\2\u00e4<\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7"+
		"\7k\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9\7\60\2\2\u00e9>\3\2\2\2\u00ea\u00eb"+
		"\7x\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7t\2\2\u00ed@\3\2\2\2\u00ee\u00ef"+
		"\7.\2\2\u00efB\3\2\2\2\u00f0\u00f1\7\60\2\2\u00f1D\3\2\2\2\u00f2\u00f3"+
		"\7*\2\2\u00f3F\3\2\2\2\u00f4\u00f5\7+\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7"+
		"g\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7e\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb"+
		"\7g\2\2\u00fb\u00fc\7x\2\2\u00fc\u00fd\7c\2\2\u00fdJ\3\2\2\2\u00fe\u00ff"+
		"\7a\2\2\u00ffL\3\2\2\2\u0100\u0102\4\62;\2\u0101\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104N\3\2\2\2\u0105"+
		"\u0107\t\2\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109P\3\2\2\2\u010a\u010c\t\3\2\2\u010b\u010a"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\b)\2\2\u0110R\3\2\2\2\u0111\u0115\7%\2\2\u0112"+
		"\u0114\n\4\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011a\7\17\2\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011c\7\f\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b*\2\2\u011e"+
		"T\3\2\2\2\b\2\u0103\u0108\u010d\u0115\u0119\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}