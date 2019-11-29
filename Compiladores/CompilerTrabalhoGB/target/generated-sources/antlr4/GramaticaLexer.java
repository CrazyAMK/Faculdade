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
		T_PROGRAMA=1, T_INICIOCOMANDO=2, T_INTEIRO=3, T_BOOLEANO=4, T_FIMCOMANDO=5, 
		T_PONTOEVIRGULA=6, T_FIM=7, T_VAR=8, T_VIRGULA=9, T_DOISPONTOS=10, T_ABREPARENTESES=11, 
		T_FECHAPARENTESES=12, T_ESCREVA=13, T_UNDERLINE=14, T_DIGITO=15, T_LETRA=16, 
		WS=17, COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T_PROGRAMA", "T_INICIOCOMANDO", "T_INTEIRO", "T_BOOLEANO", "T_FIMCOMANDO", 
			"T_PONTOEVIRGULA", "T_FIM", "T_VAR", "T_VIRGULA", "T_DOISPONTOS", "T_ABREPARENTESES", 
			"T_FECHAPARENTESES", "T_ESCREVA", "T_UNDERLINE", "T_DIGITO", "T_LETRA", 
			"WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'inteiro'", "'booleano'", "'fim'", "';'", 
			"'fim.'", "'var'", "','", "'.'", "'('", "')'", "'escreva'", "'_'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_PROGRAMA", "T_INICIOCOMANDO", "T_INTEIRO", "T_BOOLEANO", "T_FIMCOMANDO", 
			"T_PONTOEVIRGULA", "T_FIM", "T_VAR", "T_VIRGULA", "T_DOISPONTOS", "T_ABREPARENTESES", 
			"T_FECHAPARENTESES", "T_ESCREVA", "T_UNDERLINE", "T_DIGITO", "T_LETRA", 
			"WS", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0085\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\20\6\20k\n\20\r\20\16\20l\3\21\3\21\3\22\6\22r\n\22\r"+
		"\22\16\22s\3\22\3\22\3\23\3\23\7\23z\n\23\f\23\16\23}\13\23\3\23\5\23"+
		"\u0080\n\23\3\23\3\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\5\4\2C\\c|"+
		"\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2"+
		"\5\60\3\2\2\2\7\67\3\2\2\2\t?\3\2\2\2\13H\3\2\2\2\rL\3\2\2\2\17N\3\2\2"+
		"\2\21S\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27[\3\2\2\2\31]\3\2\2\2\33_\3\2"+
		"\2\2\35g\3\2\2\2\37j\3\2\2\2!n\3\2\2\2#q\3\2\2\2%w\3\2\2\2\'(\7r\2\2("+
		")\7t\2\2)*\7q\2\2*+\7i\2\2+,\7t\2\2,-\7c\2\2-.\7o\2\2./\7c\2\2/\4\3\2"+
		"\2\2\60\61\7k\2\2\61\62\7p\2\2\62\63\7k\2\2\63\64\7e\2\2\64\65\7k\2\2"+
		"\65\66\7q\2\2\66\6\3\2\2\2\678\7k\2\289\7p\2\29:\7v\2\2:;\7g\2\2;<\7k"+
		"\2\2<=\7t\2\2=>\7q\2\2>\b\3\2\2\2?@\7d\2\2@A\7q\2\2AB\7q\2\2BC\7n\2\2"+
		"CD\7g\2\2DE\7c\2\2EF\7p\2\2FG\7q\2\2G\n\3\2\2\2HI\7h\2\2IJ\7k\2\2JK\7"+
		"o\2\2K\f\3\2\2\2LM\7=\2\2M\16\3\2\2\2NO\7h\2\2OP\7k\2\2PQ\7o\2\2QR\7\60"+
		"\2\2R\20\3\2\2\2ST\7x\2\2TU\7c\2\2UV\7t\2\2V\22\3\2\2\2WX\7.\2\2X\24\3"+
		"\2\2\2YZ\7\60\2\2Z\26\3\2\2\2[\\\7*\2\2\\\30\3\2\2\2]^\7+\2\2^\32\3\2"+
		"\2\2_`\7g\2\2`a\7u\2\2ab\7e\2\2bc\7t\2\2cd\7g\2\2de\7x\2\2ef\7c\2\2f\34"+
		"\3\2\2\2gh\7a\2\2h\36\3\2\2\2ik\4\62;\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2"+
		"lm\3\2\2\2m \3\2\2\2no\t\2\2\2o\"\3\2\2\2pr\t\3\2\2qp\3\2\2\2rs\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2tu\3\2\2\2uv\b\22\2\2v$\3\2\2\2w{\7%\2\2xz\n\4\2"+
		"\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~\u0080"+
		"\7\17\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
		"\7\f\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\23\2\2\u0084&\3\2\2\2\7\2l"+
		"s{\177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}