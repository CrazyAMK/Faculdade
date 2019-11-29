// Generated from Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_PROGRAMA=1, T_INICIOCOMANDO=2, T_INTEIRO=3, T_BOOLEANO=4, T_FIMCOMANDO=5, 
		T_PONTOEVIRGULA=6, T_FIM=7, T_VAR=8, T_VIRGULA=9, T_DOISPONTOS=10, T_ABREPARENTESES=11, 
		T_FECHAPARENTESES=12, T_ESCREVA=13, T_UNDERLINE=14, T_DIGITO=15, T_LETRA=16, 
		WS=17, COMMENT=18;
	public static final int
		RULE_prog = 0, RULE_identificador = 1, RULE_bloco = 2, RULE_comandos = 3, 
		RULE_comando = 4, RULE_comando_escreva = 5, RULE_etSub_Rotina = 6, RULE_etDeclaracao_Variaveis = 7, 
		RULE_declaracao_var = 8, RULE_tipo = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "identificador", "bloco", "comandos", "comando", "comando_escreva", 
			"etSub_Rotina", "etDeclaracao_Variaveis", "declaracao_var", "tipo"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode T_PROGRAMA() { return getToken(GramaticaParser.T_PROGRAMA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode T_PONTOEVIRGULA() { return getToken(GramaticaParser.T_PONTOEVIRGULA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode T_FIM() { return getToken(GramaticaParser.T_FIM, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T_PROGRAMA);
			setState(21);
			identificador();
			setState(22);
			match(T_PONTOEVIRGULA);
			setState(23);
			bloco();
			setState(24);
			match(T_FIM);
			 System.out.println("PASSOU TPROGRAMA"); 
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

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> T_LETRA() { return getTokens(GramaticaParser.T_LETRA); }
		public TerminalNode T_LETRA(int i) {
			return getToken(GramaticaParser.T_LETRA, i);
		}
		public List<TerminalNode> T_UNDERLINE() { return getTokens(GramaticaParser.T_UNDERLINE); }
		public TerminalNode T_UNDERLINE(int i) {
			return getToken(GramaticaParser.T_UNDERLINE, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(T_LETRA);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_UNDERLINE || _la==T_LETRA) {
				{
				{
				setState(28);
				_la = _input.LA(1);
				if ( !(_la==T_UNDERLINE || _la==T_LETRA) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(33);
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

	public static class BlocoContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public List<EtDeclaracao_VariaveisContext> etDeclaracao_Variaveis() {
			return getRuleContexts(EtDeclaracao_VariaveisContext.class);
		}
		public EtDeclaracao_VariaveisContext etDeclaracao_Variaveis(int i) {
			return getRuleContext(EtDeclaracao_VariaveisContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VAR) {
				{
				{
				setState(34);
				etDeclaracao_Variaveis();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public TerminalNode T_INICIOCOMANDO() { return getToken(GramaticaParser.T_INICIOCOMANDO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<TerminalNode> T_PONTOEVIRGULA() { return getTokens(GramaticaParser.T_PONTOEVIRGULA); }
		public TerminalNode T_PONTOEVIRGULA(int i) {
			return getToken(GramaticaParser.T_PONTOEVIRGULA, i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comandos);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T_INICIOCOMANDO);
			setState(43);
			comando();
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					match(T_PONTOEVIRGULA);
					setState(45);
					comando();
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PONTOEVIRGULA) {
				{
				setState(51);
				match(T_PONTOEVIRGULA);
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

	public static class ComandoContext extends ParserRuleContext {
		public Comando_escrevaContext comando_escreva() {
			return getRuleContext(Comando_escrevaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			comando_escreva();
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

	public static class Comando_escrevaContext extends ParserRuleContext {
		public TerminalNode T_ESCREVA() { return getToken(GramaticaParser.T_ESCREVA, 0); }
		public TerminalNode T_ABREPARENTESES() { return getToken(GramaticaParser.T_ABREPARENTESES, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode T_FECHAPARENTESES() { return getToken(GramaticaParser.T_FECHAPARENTESES, 0); }
		public Comando_escrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_escreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_escreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_escreva(this);
		}
	}

	public final Comando_escrevaContext comando_escreva() throws RecognitionException {
		Comando_escrevaContext _localctx = new Comando_escrevaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T_ESCREVA);
			setState(57);
			match(T_ABREPARENTESES);
			setState(58);
			identificador();
			setState(59);
			match(T_FECHAPARENTESES);
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

	public static class EtSub_RotinaContext extends ParserRuleContext {
		public EtSub_RotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etSub_Rotina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEtSub_Rotina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEtSub_Rotina(this);
		}
	}

	public final EtSub_RotinaContext etSub_Rotina() throws RecognitionException {
		EtSub_RotinaContext _localctx = new EtSub_RotinaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_etSub_Rotina);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class EtDeclaracao_VariaveisContext extends ParserRuleContext {
		public TerminalNode T_VAR() { return getToken(GramaticaParser.T_VAR, 0); }
		public List<Declaracao_varContext> declaracao_var() {
			return getRuleContexts(Declaracao_varContext.class);
		}
		public Declaracao_varContext declaracao_var(int i) {
			return getRuleContext(Declaracao_varContext.class,i);
		}
		public List<TerminalNode> T_PONTOEVIRGULA() { return getTokens(GramaticaParser.T_PONTOEVIRGULA); }
		public TerminalNode T_PONTOEVIRGULA(int i) {
			return getToken(GramaticaParser.T_PONTOEVIRGULA, i);
		}
		public EtDeclaracao_VariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etDeclaracao_Variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEtDeclaracao_Variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEtDeclaracao_Variaveis(this);
		}
	}

	public final EtDeclaracao_VariaveisContext etDeclaracao_Variaveis() throws RecognitionException {
		EtDeclaracao_VariaveisContext _localctx = new EtDeclaracao_VariaveisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_etDeclaracao_Variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T_VAR);
			setState(64);
			declaracao_var();
			setState(65);
			match(T_PONTOEVIRGULA);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_LETRA) {
				{
				{
				setState(66);
				declaracao_var();
				setState(67);
				match(T_PONTOEVIRGULA);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PONTOEVIRGULA) {
				{
				setState(74);
				match(T_PONTOEVIRGULA);
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

	public static class Declaracao_varContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TerminalNode T_DOISPONTOS() { return getToken(GramaticaParser.T_DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> T_VIRGULA() { return getTokens(GramaticaParser.T_VIRGULA); }
		public TerminalNode T_VIRGULA(int i) {
			return getToken(GramaticaParser.T_VIRGULA, i);
		}
		public Declaracao_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao_var(this);
		}
	}

	public final Declaracao_varContext declaracao_var() throws RecognitionException {
		Declaracao_varContext _localctx = new Declaracao_varContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracao_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			identificador();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VIRGULA) {
				{
				{
				setState(78);
				match(T_VIRGULA);
				setState(79);
				identificador();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T_DOISPONTOS);
			setState(86);
			tipo();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode T_INTEIRO() { return getToken(GramaticaParser.T_INTEIRO, 0); }
		public TerminalNode T_BOOLEANO() { return getToken(GramaticaParser.T_BOOLEANO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==T_INTEIRO || _la==T_BOOLEANO) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\7\4&\n"+
		"\4\f\4\16\4)\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\61\n\5\f\5\16\5\64\13\5"+
		"\3\5\5\5\67\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\tH\n\t\f\t\16\tK\13\t\3\t\5\tN\n\t\3\n\3\n\3\n\7\nS\n\n\f\n\16"+
		"\nV\13\n\3\n\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4"+
		"\4\2\20\20\22\22\3\2\5\6\2Y\2\26\3\2\2\2\4\35\3\2\2\2\6\'\3\2\2\2\b,\3"+
		"\2\2\2\n8\3\2\2\2\f:\3\2\2\2\16?\3\2\2\2\20A\3\2\2\2\22O\3\2\2\2\24Z\3"+
		"\2\2\2\26\27\7\3\2\2\27\30\5\4\3\2\30\31\7\b\2\2\31\32\5\6\4\2\32\33\7"+
		"\t\2\2\33\34\b\2\1\2\34\3\3\2\2\2\35!\7\22\2\2\36 \t\2\2\2\37\36\3\2\2"+
		"\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2$&\5\20\t\2%"+
		"$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\5\b\5"+
		"\2+\7\3\2\2\2,-\7\4\2\2-\62\5\n\6\2./\7\b\2\2/\61\5\n\6\2\60.\3\2\2\2"+
		"\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2"+
		"\65\67\7\b\2\2\66\65\3\2\2\2\66\67\3\2\2\2\67\t\3\2\2\289\5\f\7\29\13"+
		"\3\2\2\2:;\7\17\2\2;<\7\r\2\2<=\5\4\3\2=>\7\16\2\2>\r\3\2\2\2?@\3\2\2"+
		"\2@\17\3\2\2\2AB\7\n\2\2BC\5\22\n\2CI\7\b\2\2DE\5\22\n\2EF\7\b\2\2FH\3"+
		"\2\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LN\7"+
		"\b\2\2ML\3\2\2\2MN\3\2\2\2N\21\3\2\2\2OT\5\4\3\2PQ\7\13\2\2QS\5\4\3\2"+
		"RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\f\2\2"+
		"XY\5\24\13\2Y\23\3\2\2\2Z[\t\3\2\2[\25\3\2\2\2\t!\'\62\66IMT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}