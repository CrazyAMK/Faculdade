import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class TS {
	
	private Map<String, Token> ts;
  
	//Construtor
	 public TS() {
		this.ts = new HashMap<>();
	 }
	
	 //Metodo Set
	 public void setAtributo(String chave, String atributo, String valor) throws NoSuchFieldException, IllegalAccessException{

		Token token = ts.get(chave);
		Field field = token.getClass().getDeclaredField(atributo);
		field.set(token, valor);
	 
	 }
	 
	//Metodo get 
	 public String getAtributo(String chave, String atributo) throws NoSuchFieldException, IllegalAccessException{
	 	Token token = ts.get(chave);
	 	Field field = token.getClass().getDeclaredField(atributo);
	 	return (String) field.get(token);
		 	
	}
	 
	public Map<String, Token> getTabela(){
		return ts;
	}
		
}
 



