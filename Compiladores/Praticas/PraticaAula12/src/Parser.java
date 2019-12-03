import java.io.IOException;

public abstract class Parser {
	
    public TabelaSimbolos tabelaSimbolos;
    public AnalisadorLexico analisadorLexico;
    public AnalisadorSemantico analisadorSemantico;
    public Token token;
    
    //Construtor
    public Parser(String codeFileName) throws IOException{
        this.tabelaSimbolos = new TabelaSimbolos();
        this.analisadorLexico = new AnalisadorLexico(codeFileName);
        this.analisadorSemantico = new AnalisadorSemantico();
    }
	
    //Metodo de busca do token
    public void fetchToken() {
        token = analisadorLexico.getToken();
    }
    
  //Metodo de geração de erro
    public Boolean error(String message) {
        System.out.println(message + " .Na linha " + token.getLinha() + " e coluna " + token.getColuna());
        return false;
    }
    
}
