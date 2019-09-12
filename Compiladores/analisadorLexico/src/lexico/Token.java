package lexico;

/**
 *
 * @author eduar
 */
public class Token {
    
    private Tipo tipo;
    private String lexema;
    private Integer linha;
    private Integer coluna;
    
    //Função que define o Token
    public Token(Tipo tipo, String lexema, Integer linha, Integer coluna){
        this.tipo = tipo;
        this.lexema = lexema;
        this.linha = linha;
        this.coluna = coluna;
    }
    
    //Contrutor
    public Token(Tipo tipo, String lexema) {
        this.tipo = tipo;
        this.lexema = lexema;
    }

    
    //Getters
    public Tipo getTipo() {
        return tipo;
    }

    public String getLexema() {
        return lexema;
    }

    public Integer getLinha() {
        return linha;
    }

    public Integer getColuna() {
        return coluna;
    }

    //Setters
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }
    
    //Definição do formato de saida
    @Override
    public String toString(){
        return String.format("Tipo: %s, Lexema: %s, Linha: %s, Coluna: %s", tipo, lexema, linha, coluna);
    }
    
    
}
