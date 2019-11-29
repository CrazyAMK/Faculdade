// Generated from Gramatica.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramaticaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramaticaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(GramaticaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(GramaticaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GramaticaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando_escreva}.
	 * @param ctx the parse tree
	 */
	void enterComando_escreva(GramaticaParser.Comando_escrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando_escreva}.
	 * @param ctx the parse tree
	 */
	void exitComando_escreva(GramaticaParser.Comando_escrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#etSub_Rotina}.
	 * @param ctx the parse tree
	 */
	void enterEtSub_Rotina(GramaticaParser.EtSub_RotinaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#etSub_Rotina}.
	 * @param ctx the parse tree
	 */
	void exitEtSub_Rotina(GramaticaParser.EtSub_RotinaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#etDeclaracao_Variaveis}.
	 * @param ctx the parse tree
	 */
	void enterEtDeclaracao_Variaveis(GramaticaParser.EtDeclaracao_VariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#etDeclaracao_Variaveis}.
	 * @param ctx the parse tree
	 */
	void exitEtDeclaracao_Variaveis(GramaticaParser.EtDeclaracao_VariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_var(GramaticaParser.Declaracao_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao_var}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_var(GramaticaParser.Declaracao_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GramaticaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GramaticaParser.TipoContext ctx);
}