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
		T_PROGRAMA=1, T_INICIOCOMANDO=2, T_INTEIRO=3, T_BOOLV=4, T_BOOLF=5, T_NEGACAO=6, 
		T_LEIA=7, T_ENQUANTO=8, T_FACA=9, T_DIFERENCA=10, T_IGUAL=11, T_MENOR=12, 
		T_MAIOR=13, T_MAIORIGUAL=14, T_MULT=15, T_DIV=16, T_OU=17, T_E=18, T_MAIS=19, 
		T_MENOS=20, T_PROCEDIMENTO=21, T_SE=22, T_ENTAO=23, T_SENAO=24, T_ATRIBUICAO=25, 
		T_FUNCAO=26, T_BOOLEANO=27, T_FIMCOMANDO=28, T_PONTOEVIRGULA=29, T_FIM=30, 
		T_VAR=31, T_VIRGULA=32, T_DOISPONTOS=33, T_ABREPARENTESES=34, T_FECHAPARENTESES=35, 
		T_ESCREVA=36, T_UNDERLINE=37, T_DIGITO=38, T_LETRA=39, WS=40, COMMENT=41;
	public static final int
		RULE_prog = 0, RULE_bloco = 1, RULE_etDeclaracao_Variaveis = 2, RULE_declara_procedimento = 3, 
		RULE_declara_funcao = 4, RULE_declaracao_var = 5, RULE_tipo = 6, RULE_etsub_rotina = 7, 
		RULE_comandos = 8, RULE_comando = 9, RULE_atribuicao_chprocedimento = 10, 
		RULE_comando_atribuicao = 11, RULE_chamada_procedimento = 12, RULE_comando_condicional = 13, 
		RULE_comando_enquanto = 14, RULE_comando_leia = 15, RULE_comando_escreva = 16, 
		RULE_expressao = 17, RULE_operador_relacional = 18, RULE_expressao_simples = 19, 
		RULE_termo = 20, RULE_fator = 21, RULE_variavel = 22, RULE_chamada_funcao = 23, 
		RULE_identificador = 24, RULE_numero = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "bloco", "etDeclaracao_Variaveis", "declara_procedimento", "declara_funcao", 
			"declaracao_var", "tipo", "etsub_rotina", "comandos", "comando", "atribuicao_chprocedimento", 
			"comando_atribuicao", "chamada_procedimento", "comando_condicional", 
			"comando_enquanto", "comando_leia", "comando_escreva", "expressao", "operador_relacional", 
			"expressao_simples", "termo", "fator", "variavel", "chamada_funcao", 
			"identificador", "numero"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'inicio'", "'inteiro'", "'verdadeiro'", "'falso'", 
			"'nao'", "'leia'", "'enquanto'", "'faca'", "'<>'", "'='", "'<'", "'>'", 
			"'>='", "'*'", "'div'", "'ou'", "'e'", "'+'", "'-'", "'procedimento'", 
			"'se'", "'entao'", "'senao'", "':='", "'funcao'", "'booleano'", "'fim'", 
			"';'", "'fim.'", "'var'", "','", "':'", "'('", "')'", "'escreva'", "'_'"
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
			setState(52);
			match(T_PROGRAMA);
			setState(53);
			identificador();
			setState(54);
			match(T_PONTOEVIRGULA);
			setState(55);
			bloco();
			setState(56);
			match(T_FIM);
			 System.out.println("PASSOU"); 
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
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VAR) {
				{
				{
				setState(59);
				etDeclaracao_Variaveis();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
		enterRule(_localctx, 4, RULE_etDeclaracao_Variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T_VAR);
			setState(68);
			declaracao_var();
			setState(69);
			match(T_PONTOEVIRGULA);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_LETRA) {
				{
				{
				setState(70);
				declaracao_var();
				setState(71);
				match(T_PONTOEVIRGULA);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PONTOEVIRGULA) {
				{
				setState(78);
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

	public static class Declara_procedimentoContext extends ParserRuleContext {
		public TerminalNode T_PROCEDIMENTO() { return getToken(GramaticaParser.T_PROCEDIMENTO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode T_PONTOEVIRGULA() { return getToken(GramaticaParser.T_PONTOEVIRGULA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Declara_procedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclara_procedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclara_procedimento(this);
		}
	}

	public final Declara_procedimentoContext declara_procedimento() throws RecognitionException {
		Declara_procedimentoContext _localctx = new Declara_procedimentoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declara_procedimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T_PROCEDIMENTO);
			setState(82);
			identificador();
			setState(83);
			match(T_PONTOEVIRGULA);
			setState(84);
			bloco();
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

	public static class Declara_funcaoContext extends ParserRuleContext {
		public TerminalNode T_FUNCAO() { return getToken(GramaticaParser.T_FUNCAO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode T_DOISPONTOS() { return getToken(GramaticaParser.T_DOISPONTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode T_PONTOEVIRGULA() { return getToken(GramaticaParser.T_PONTOEVIRGULA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public Declara_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declara_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclara_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclara_funcao(this);
		}
	}

	public final Declara_funcaoContext declara_funcao() throws RecognitionException {
		Declara_funcaoContext _localctx = new Declara_funcaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declara_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T_FUNCAO);
			setState(87);
			identificador();
			setState(88);
			match(T_DOISPONTOS);
			setState(89);
			tipo();
			setState(90);
			match(T_PONTOEVIRGULA);
			setState(91);
			bloco();
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
		enterRule(_localctx, 10, RULE_declaracao_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			identificador();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_VIRGULA) {
				{
				{
				setState(94);
				match(T_VIRGULA);
				setState(95);
				identificador();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T_DOISPONTOS);
			setState(102);
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
		enterRule(_localctx, 12, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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

	public static class Etsub_rotinaContext extends ParserRuleContext {
		public List<Declara_procedimentoContext> declara_procedimento() {
			return getRuleContexts(Declara_procedimentoContext.class);
		}
		public Declara_procedimentoContext declara_procedimento(int i) {
			return getRuleContext(Declara_procedimentoContext.class,i);
		}
		public List<TerminalNode> T_PONTOEVIRGULA() { return getTokens(GramaticaParser.T_PONTOEVIRGULA); }
		public TerminalNode T_PONTOEVIRGULA(int i) {
			return getToken(GramaticaParser.T_PONTOEVIRGULA, i);
		}
		public List<Declara_funcaoContext> declara_funcao() {
			return getRuleContexts(Declara_funcaoContext.class);
		}
		public Declara_funcaoContext declara_funcao(int i) {
			return getRuleContext(Declara_funcaoContext.class,i);
		}
		public Etsub_rotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etsub_rotina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterEtsub_rotina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitEtsub_rotina(this);
		}
	}

	public final Etsub_rotinaContext etsub_rotina() throws RecognitionException {
		Etsub_rotinaContext _localctx = new Etsub_rotinaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_etsub_rotina);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PROCEDIMENTO:
				{
				setState(106);
				declara_procedimento();
				setState(107);
				match(T_PONTOEVIRGULA);
				}
				break;
			case T_FUNCAO:
				{
				setState(109);
				declara_funcao();
				setState(110);
				match(T_PONTOEVIRGULA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_PROCEDIMENTO || _la==T_FUNCAO) {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_PROCEDIMENTO:
					{
					setState(114);
					declara_procedimento();
					setState(115);
					match(T_PONTOEVIRGULA);
					}
					break;
				case T_FUNCAO:
					{
					setState(117);
					declara_funcao();
					setState(118);
					match(T_PONTOEVIRGULA);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(124);
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
		enterRule(_localctx, 16, RULE_comandos);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T_INICIOCOMANDO);
			setState(126);
			comando();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					match(T_PONTOEVIRGULA);
					setState(128);
					comando();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(134);
				match(T_PONTOEVIRGULA);
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

	public static class ComandoContext extends ParserRuleContext {
		public Comando_escrevaContext comando_escreva() {
			return getRuleContext(Comando_escrevaContext.class,0);
		}
		public Comando_condicionalContext comando_condicional() {
			return getRuleContext(Comando_condicionalContext.class,0);
		}
		public Comando_enquantoContext comando_enquanto() {
			return getRuleContext(Comando_enquantoContext.class,0);
		}
		public Comando_leiaContext comando_leia() {
			return getRuleContext(Comando_leiaContext.class,0);
		}
		public Atribuicao_chprocedimentoContext atribuicao_chprocedimento() {
			return getRuleContext(Atribuicao_chprocedimentoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
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
		enterRule(_localctx, 18, RULE_comando);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ESCREVA:
				{
				setState(137);
				comando_escreva();
				}
				break;
			case T_SE:
				{
				setState(138);
				comando_condicional();
				}
				break;
			case T_ENQUANTO:
				{
				setState(139);
				comando_enquanto();
				}
				break;
			case T_LEIA:
				{
				setState(140);
				comando_leia();
				}
				break;
			case T_LETRA:
				{
				setState(141);
				atribuicao_chprocedimento();
				}
				break;
			case T_INICIOCOMANDO:
				{
				setState(142);
				comandos();
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

	public static class Atribuicao_chprocedimentoContext extends ParserRuleContext {
		public Comando_atribuicaoContext comando_atribuicao() {
			return getRuleContext(Comando_atribuicaoContext.class,0);
		}
		public Chamada_procedimentoContext chamada_procedimento() {
			return getRuleContext(Chamada_procedimentoContext.class,0);
		}
		public Atribuicao_chprocedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_chprocedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAtribuicao_chprocedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAtribuicao_chprocedimento(this);
		}
	}

	public final Atribuicao_chprocedimentoContext atribuicao_chprocedimento() throws RecognitionException {
		Atribuicao_chprocedimentoContext _localctx = new Atribuicao_chprocedimentoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao_chprocedimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(145);
				comando_atribuicao();
				}
				break;
			case 2:
				{
				setState(146);
				chamada_procedimento();
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

	public static class Comando_atribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode T_ATRIBUICAO() { return getToken(GramaticaParser.T_ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Comando_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_atribuicao(this);
		}
	}

	public final Comando_atribuicaoContext comando_atribuicao() throws RecognitionException {
		Comando_atribuicaoContext _localctx = new Comando_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comando_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			identificador();
			setState(150);
			match(T_ATRIBUICAO);
			setState(151);
			expressao();
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

	public static class Chamada_procedimentoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Chamada_procedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamada_procedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamada_procedimento(this);
		}
	}

	public final Chamada_procedimentoContext chamada_procedimento() throws RecognitionException {
		Chamada_procedimentoContext _localctx = new Chamada_procedimentoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_chamada_procedimento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			identificador();
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

	public static class Comando_condicionalContext extends ParserRuleContext {
		public TerminalNode T_SE() { return getToken(GramaticaParser.T_SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode T_ENTAO() { return getToken(GramaticaParser.T_ENTAO, 0); }
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public TerminalNode T_SENAO() { return getToken(GramaticaParser.T_SENAO, 0); }
		public Comando_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_condicional(this);
		}
	}

	public final Comando_condicionalContext comando_condicional() throws RecognitionException {
		Comando_condicionalContext _localctx = new Comando_condicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comando_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T_SE);
			setState(156);
			expressao();
			setState(157);
			match(T_ENTAO);
			setState(158);
			comando();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(159);
				match(T_SENAO);
				setState(160);
				comando();
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

	public static class Comando_enquantoContext extends ParserRuleContext {
		public TerminalNode T_ENQUANTO() { return getToken(GramaticaParser.T_ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode T_FACA() { return getToken(GramaticaParser.T_FACA, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public Comando_enquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_enquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_enquanto(this);
		}
	}

	public final Comando_enquantoContext comando_enquanto() throws RecognitionException {
		Comando_enquantoContext _localctx = new Comando_enquantoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comando_enquanto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T_ENQUANTO);
			setState(164);
			expressao();
			setState(165);
			match(T_FACA);
			setState(166);
			comando();
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

	public static class Comando_leiaContext extends ParserRuleContext {
		public TerminalNode T_LEIA() { return getToken(GramaticaParser.T_LEIA, 0); }
		public TerminalNode T_ABREPARENTESES() { return getToken(GramaticaParser.T_ABREPARENTESES, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode T_FECHAPARENTESES() { return getToken(GramaticaParser.T_FECHAPARENTESES, 0); }
		public Comando_leiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando_leia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando_leia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando_leia(this);
		}
	}

	public final Comando_leiaContext comando_leia() throws RecognitionException {
		Comando_leiaContext _localctx = new Comando_leiaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comando_leia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T_LEIA);
			setState(169);
			match(T_ABREPARENTESES);
			setState(170);
			identificador();
			setState(171);
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

	public static class Comando_escrevaContext extends ParserRuleContext {
		public TerminalNode T_ESCREVA() { return getToken(GramaticaParser.T_ESCREVA, 0); }
		public TerminalNode T_ABREPARENTESES() { return getToken(GramaticaParser.T_ABREPARENTESES, 0); }
		public TerminalNode T_FECHAPARENTESES() { return getToken(GramaticaParser.T_FECHAPARENTESES, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Expressao_simplesContext expressao_simples() {
			return getRuleContext(Expressao_simplesContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_comando_escreva);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T_ESCREVA);
			setState(174);
			match(T_ABREPARENTESES);
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(175);
				identificador();
				}
				break;
			case 2:
				{
				setState(176);
				numero();
				}
				break;
			case 3:
				{
				setState(177);
				expressao_simples();
				}
				break;
			}
			setState(180);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public List<Expressao_simplesContext> expressao_simples() {
			return getRuleContexts(Expressao_simplesContext.class);
		}
		public Expressao_simplesContext expressao_simples(int i) {
			return getRuleContext(Expressao_simplesContext.class,i);
		}
		public Operador_relacionalContext operador_relacional() {
			return getRuleContext(Operador_relacionalContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			expressao_simples();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_DIFERENCA) | (1L << T_IGUAL) | (1L << T_MENOR) | (1L << T_MAIOR) | (1L << T_MAIORIGUAL))) != 0)) {
				{
				setState(183);
				operador_relacional();
				setState(184);
				expressao_simples();
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

	public static class Operador_relacionalContext extends ParserRuleContext {
		public TerminalNode T_DIFERENCA() { return getToken(GramaticaParser.T_DIFERENCA, 0); }
		public TerminalNode T_IGUAL() { return getToken(GramaticaParser.T_IGUAL, 0); }
		public TerminalNode T_MENOR() { return getToken(GramaticaParser.T_MENOR, 0); }
		public TerminalNode T_MAIOR() { return getToken(GramaticaParser.T_MAIOR, 0); }
		public TerminalNode T_MAIORIGUAL() { return getToken(GramaticaParser.T_MAIORIGUAL, 0); }
		public Operador_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operador_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperador_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperador_relacional(this);
		}
	}

	public final Operador_relacionalContext operador_relacional() throws RecognitionException {
		Operador_relacionalContext _localctx = new Operador_relacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operador_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_DIFERENCA) | (1L << T_IGUAL) | (1L << T_MENOR) | (1L << T_MAIOR) | (1L << T_MAIORIGUAL))) != 0)) ) {
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

	public static class Expressao_simplesContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> T_MAIS() { return getTokens(GramaticaParser.T_MAIS); }
		public TerminalNode T_MAIS(int i) {
			return getToken(GramaticaParser.T_MAIS, i);
		}
		public List<TerminalNode> T_MENOS() { return getTokens(GramaticaParser.T_MENOS); }
		public TerminalNode T_MENOS(int i) {
			return getToken(GramaticaParser.T_MENOS, i);
		}
		public TerminalNode T_OU() { return getToken(GramaticaParser.T_OU, 0); }
		public Expressao_simplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_simples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressao_simples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressao_simples(this);
		}
	}

	public final Expressao_simplesContext expressao_simples() throws RecognitionException {
		Expressao_simplesContext _localctx = new Expressao_simplesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressao_simples);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_MAIS || _la==T_MENOS) {
				{
				setState(190);
				_la = _input.LA(1);
				if ( !(_la==T_MAIS || _la==T_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(193);
			termo();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_OU) | (1L << T_MAIS) | (1L << T_MENOS))) != 0)) {
				{
				setState(194);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_OU) | (1L << T_MAIS) | (1L << T_MENOS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(195);
				termo();
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

	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> T_MULT() { return getTokens(GramaticaParser.T_MULT); }
		public TerminalNode T_MULT(int i) {
			return getToken(GramaticaParser.T_MULT, i);
		}
		public List<TerminalNode> T_DIV() { return getTokens(GramaticaParser.T_DIV); }
		public TerminalNode T_DIV(int i) {
			return getToken(GramaticaParser.T_DIV, i);
		}
		public List<TerminalNode> T_E() { return getTokens(GramaticaParser.T_E); }
		public TerminalNode T_E(int i) {
			return getToken(GramaticaParser.T_E, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			fator();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_MULT) | (1L << T_DIV) | (1L << T_E))) != 0)) {
				{
				{
				setState(199);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_MULT) | (1L << T_DIV) | (1L << T_E))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(200);
				fator();
				}
				}
				setState(205);
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

	public static class FatorContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public Chamada_funcaoContext chamada_funcao() {
			return getRuleContext(Chamada_funcaoContext.class,0);
		}
		public TerminalNode T_ABREPARENTESES() { return getToken(GramaticaParser.T_ABREPARENTESES, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode T_FECHAPARENTESES() { return getToken(GramaticaParser.T_FECHAPARENTESES, 0); }
		public TerminalNode T_BOOLV() { return getToken(GramaticaParser.T_BOOLV, 0); }
		public TerminalNode T_BOOLF() { return getToken(GramaticaParser.T_BOOLF, 0); }
		public TerminalNode T_NEGACAO() { return getToken(GramaticaParser.T_NEGACAO, 0); }
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(206);
				variavel();
				}
				break;
			case 2:
				{
				setState(207);
				numero();
				}
				break;
			case 3:
				{
				setState(208);
				chamada_funcao();
				}
				break;
			case 4:
				{
				setState(209);
				match(T_ABREPARENTESES);
				setState(210);
				expressao();
				setState(211);
				match(T_FECHAPARENTESES);
				}
				break;
			case 5:
				{
				setState(213);
				match(T_BOOLV);
				}
				break;
			case 6:
				{
				setState(214);
				match(T_BOOLF);
				}
				break;
			case 7:
				{
				setState(215);
				match(T_NEGACAO);
				setState(216);
				fator();
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

	public static class VariavelContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			identificador();
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

	public static class Chamada_funcaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Chamada_funcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterChamada_funcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitChamada_funcao(this);
		}
	}

	public final Chamada_funcaoContext chamada_funcao() throws RecognitionException {
		Chamada_funcaoContext _localctx = new Chamada_funcaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_chamada_funcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			identificador();
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
		public List<TerminalNode> T_DIGITO() { return getTokens(GramaticaParser.T_DIGITO); }
		public TerminalNode T_DIGITO(int i) {
			return getToken(GramaticaParser.T_DIGITO, i);
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
		enterRule(_localctx, 48, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T_LETRA);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_UNDERLINE) | (1L << T_DIGITO) | (1L << T_LETRA))) != 0)) {
				{
				{
				setState(224);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_UNDERLINE) | (1L << T_DIGITO) | (1L << T_LETRA))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(229);
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

	public static class NumeroContext extends ParserRuleContext {
		public List<TerminalNode> T_DIGITO() { return getTokens(GramaticaParser.T_DIGITO); }
		public TerminalNode T_DIGITO(int i) {
			return getToken(GramaticaParser.T_DIGITO, i);
		}
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T_DIGITO);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DIGITO) {
				{
				setState(231);
				match(T_DIGITO);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3?\n\3\f\3\16\3"+
		"B\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\3\4\5\4"+
		"R\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7"+
		"c\n\7\f\7\16\7f\13\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ts"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n\3\n\3\n\7"+
		"\n\u0084\n\n\f\n\16\n\u0087\13\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0092\n\13\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00b5\n\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\24\3\24\3\25\5\25\u00c2"+
		"\n\25\3\25\3\25\3\25\5\25\u00c7\n\25\3\26\3\26\3\26\7\26\u00cc\n\26\f"+
		"\26\16\26\u00cf\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00dc\n\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u00e4\n\32\f"+
		"\32\16\32\u00e7\13\32\3\33\3\33\5\33\u00eb\n\33\3\33\2\2\34\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\b\4\2\5\5\35\35\3\2"+
		"\f\20\3\2\25\26\4\2\23\23\25\26\4\2\21\22\24\24\3\2\')\2\u00f0\2\66\3"+
		"\2\2\2\4@\3\2\2\2\6E\3\2\2\2\bS\3\2\2\2\nX\3\2\2\2\f_\3\2\2\2\16j\3\2"+
		"\2\2\20r\3\2\2\2\22\177\3\2\2\2\24\u0091\3\2\2\2\26\u0095\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2\2\2\36\u00a5\3\2\2\2 \u00aa\3\2"+
		"\2\2\"\u00af\3\2\2\2$\u00b8\3\2\2\2&\u00be\3\2\2\2(\u00c1\3\2\2\2*\u00c8"+
		"\3\2\2\2,\u00db\3\2\2\2.\u00dd\3\2\2\2\60\u00df\3\2\2\2\62\u00e1\3\2\2"+
		"\2\64\u00e8\3\2\2\2\66\67\7\3\2\2\678\5\62\32\289\7\37\2\29:\5\4\3\2:"+
		";\7 \2\2;<\b\2\1\2<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2"+
		"@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\5\22\n\2D\5\3\2\2\2EF\7!\2\2FG\5\f\7"+
		"\2GM\7\37\2\2HI\5\f\7\2IJ\7\37\2\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\7\37\2\2QP\3\2\2\2QR\3\2\2\2R\7\3"+
		"\2\2\2ST\7\27\2\2TU\5\62\32\2UV\7\37\2\2VW\5\4\3\2W\t\3\2\2\2XY\7\34\2"+
		"\2YZ\5\62\32\2Z[\7#\2\2[\\\5\16\b\2\\]\7\37\2\2]^\5\4\3\2^\13\3\2\2\2"+
		"_d\5\62\32\2`a\7\"\2\2ac\5\62\32\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2"+
		"\2\2eg\3\2\2\2fd\3\2\2\2gh\7#\2\2hi\5\16\b\2i\r\3\2\2\2jk\t\2\2\2k\17"+
		"\3\2\2\2lm\5\b\5\2mn\7\37\2\2ns\3\2\2\2op\5\n\6\2pq\7\37\2\2qs\3\2\2\2"+
		"rl\3\2\2\2ro\3\2\2\2s|\3\2\2\2tu\5\b\5\2uv\7\37\2\2v{\3\2\2\2wx\5\n\6"+
		"\2xy\7\37\2\2y{\3\2\2\2zt\3\2\2\2zw\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\21\3\2\2\2~|\3\2\2\2\177\u0080\7\4\2\2\u0080\u0085\5\24\13\2\u0081"+
		"\u0082\7\37\2\2\u0082\u0084\5\24\13\2\u0083\u0081\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\7\37\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3"+
		"\2\2\2\u008a\23\3\2\2\2\u008b\u0092\5\"\22\2\u008c\u0092\5\34\17\2\u008d"+
		"\u0092\5\36\20\2\u008e\u0092\5 \21\2\u008f\u0092\5\26\f\2\u0090\u0092"+
		"\5\22\n\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2"+
		"\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\25"+
		"\3\2\2\2\u0093\u0096\5\30\r\2\u0094\u0096\5\32\16\2\u0095\u0093\3\2\2"+
		"\2\u0095\u0094\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098\5\62\32\2\u0098\u0099"+
		"\7\33\2\2\u0099\u009a\5$\23\2\u009a\31\3\2\2\2\u009b\u009c\5\62\32\2\u009c"+
		"\33\3\2\2\2\u009d\u009e\7\30\2\2\u009e\u009f\5$\23\2\u009f\u00a0\7\31"+
		"\2\2\u00a0\u00a3\5\24\13\2\u00a1\u00a2\7\32\2\2\u00a2\u00a4\5\24\13\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\35\3\2\2\2\u00a5\u00a6"+
		"\7\n\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\5\24\13"+
		"\2\u00a9\37\3\2\2\2\u00aa\u00ab\7\t\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad"+
		"\5\62\32\2\u00ad\u00ae\7%\2\2\u00ae!\3\2\2\2\u00af\u00b0\7&\2\2\u00b0"+
		"\u00b4\7$\2\2\u00b1\u00b5\5\62\32\2\u00b2\u00b5\5\64\33\2\u00b3\u00b5"+
		"\5(\25\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7%\2\2\u00b7#\3\2\2\2\u00b8\u00bc\5(\25\2\u00b9"+
		"\u00ba\5&\24\2\u00ba\u00bb\5(\25\2\u00bb\u00bd\3\2\2\2\u00bc\u00b9\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd%\3\2\2\2\u00be\u00bf\t\3\2\2\u00bf\'\3"+
		"\2\2\2\u00c0\u00c2\t\4\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\5*\26\2\u00c4\u00c5\t\5\2\2\u00c5\u00c7\5*"+
		"\26\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7)\3\2\2\2\u00c8\u00cd"+
		"\5,\27\2\u00c9\u00ca\t\6\2\2\u00ca\u00cc\5,\27\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce+\3\2\2\2"+
		"\u00cf\u00cd\3\2\2\2\u00d0\u00dc\5.\30\2\u00d1\u00dc\5\64\33\2\u00d2\u00dc"+
		"\5\60\31\2\u00d3\u00d4\7$\2\2\u00d4\u00d5\5$\23\2\u00d5\u00d6\7%\2\2\u00d6"+
		"\u00dc\3\2\2\2\u00d7\u00dc\7\6\2\2\u00d8\u00dc\7\7\2\2\u00d9\u00da\7\b"+
		"\2\2\u00da\u00dc\5,\27\2\u00db\u00d0\3\2\2\2\u00db\u00d1\3\2\2\2\u00db"+
		"\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d7\3\2\2\2\u00db\u00d8\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc-\3\2\2\2\u00dd\u00de\5\62\32\2\u00de/\3"+
		"\2\2\2\u00df\u00e0\5\62\32\2\u00e0\61\3\2\2\2\u00e1\u00e5\7)\2\2\u00e2"+
		"\u00e4\t\7\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e6\3\2\2\2\u00e6\63\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea"+
		"\7(\2\2\u00e9\u00eb\7(\2\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\65\3\2\2\2\26@MQdrz|\u0085\u0089\u0091\u0095\u00a3\u00b4\u00bc\u00c1"+
		"\u00c6\u00cd\u00db\u00e5\u00ea";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}