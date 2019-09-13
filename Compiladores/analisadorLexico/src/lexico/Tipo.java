
package lexico;

import java.util.stream.Stream;

public enum Tipo {
    
    //Declaração de Tipos
    SPROGRAMA ("programa"),
    SVAR("var"),
    SDOISPONTOS(":"),
    SINICIO("inicio"),
    SFIM("fim"),
    SATRIBUICAO(":="),
    SESCREVA("escreva"),
    SINTEIRO("inteiro"),
    SPONTO_E_VIRGULA(";"),
    SPONTO("."),
    SMAIS("+"),
    SMENOS("-"),
    SMULTIPLICACAO("*"),
    SNUMERO(null),
    SNUMERO_DECIMAL(null),
    SIDENTIFICADOR(null),
    SABRE_PARENTESIS("("),
    SFECHA_PARENTESIS(")"),
    SERRO(null);

   private String id;
   
   //Definição do id
   Tipo(String id){
       this.id = id;
   }

   //Traz o tipo baseado no ID
   public static Tipo getTipoById(String id){
       return Stream.of(Tipo.values())
               .filter(tipo -> id.equals(tipo.id))
               .findFirst()
               .orElse(Tipo.SIDENTIFICADOR);
   }
   
  
}
