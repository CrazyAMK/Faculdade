
package lexico;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author eduar
 */
public class AnalisadorLexico {
    
    private static final String ENCODING = "US-ASCII";
    
    private static final List<String> CHARS_SPECIAIS = Arrays.asList(".", ":", ";", "(", ")");
    private static final String DOIS_PONTOS = ":";
    
    int linha= 1;
    int coluna = 0;
    
    public List<Token> analisar(String codeFileName) throws IOException{
        PushbackReader pushbackReader = getPushbackReader(codeFileName);
        List<Token> tokens = new ArrayList<>();
        int intch;
        
        while((intch = pushbackReader.read()) != -1){
            char character = (char) intch;
            if(character != ' ' && character != '\n'){
                Token token = getToken(character, pushbackReader);
                if(token != null){
                    tokens.add(token);
                }
            }else if(character == ' '){
                coluna++;
            }else if(character == '\n'){
                linha++;
                coluna = 0;
                i= 0;
            }
        }
        
        return tokens;
    }
    
    
    private PushbackReader getPushbackReader(String codeFileName) throws FileNotFoundException, UnsupportedEncodingException{
       return new PushbackReader(new BufferedReader(new InputStreamReader(new FileInputStream(codeFileName), ENCODING)));
    }
    
    
    //Faz os testes com os tokens capturados
    private Token getToken(char character, PushbackReader pushbackReader) throws IOException {
        
        if(Character.isLetter(character)){
            return handleIdentifierAndReservedWord(character, pushbackReader);
   
        }
        if(Character.isDigit(character)){
            return handleDigit(character, pushbackReader);
        }
        if(CHARS_SPECIAIS.contains(String.valueOf(character))){
            return handleSpecialChars(character, pushbackReader);
        }
        
        return new Token(Tipo.SERRO, null);
        
    }
    int i = 0;
    private Token handleIdentifierAndReservedWord(char character, PushbackReader pushbackReader) throws IOException{
        String id = String.valueOf(character);
        char nextCharacter = (char) pushbackReader.read();
        
        coluna++;
        coluna += i;
        while(Character.isLetter(nextCharacter)){
            id = id.concat(String.valueOf(nextCharacter));
            nextCharacter = (char) pushbackReader.read();
            i++;
        }
        pushbackReader.unread((int) nextCharacter);
        Tipo tipo = Tipo.getTipoById(id);
     
        return new Token(tipo, id, linha, coluna);
    }
    
    private Token handleDigit(char character, PushbackReader pushbackReader) throws IOException{
        String num = String.valueOf(character);
        char nextCharacter = (char) pushbackReader.read();
        
        while(Character.isDigit(nextCharacter)){
            coluna++;
            num = num.concat(String.valueOf(nextCharacter));
            nextCharacter = (char) pushbackReader.read();
        }
        
        pushbackReader.unread((int) nextCharacter);
        return new Token(Tipo.SNUMERO, num, linha, coluna);
    }
    
    private Token handleSpecialChars(char character, PushbackReader pushbackReader) throws IOException{
        String specialCharacter = String.valueOf(character);
//        i++;
        if(DOIS_PONTOS.equals(specialCharacter)){
            char nextCharacter = (char) pushbackReader.read();
//            coluna++;
            specialCharacter = specialCharacter.concat(String.valueOf(nextCharacter));
            Tipo tipoById = Tipo.getTipoById(specialCharacter);
            
            if(!Tipo.SATRIBUICAO.equals(tipoById)){
                pushbackReader.unread(nextCharacter);
            }
        }
        coluna++;
        Tipo tipo = Tipo.getTipoById(specialCharacter);
        return new Token(tipo, specialCharacter, linha, coluna);
        
    }
    
    
}
