
package lexico;

import java.io.IOException;
import java.util.List;


public class Main {
    
    public static void main(String[] args){
        AnalisadorLexico analisadorLexico = new AnalisadorLexico();
        
        try{
            List<Token> tokens = analisadorLexico.analisar("teste1.lpd");
            
            System.out.println("Número de Tokens: "+ tokens.size());
            
            tokens.forEach(System.out::println);
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
}
