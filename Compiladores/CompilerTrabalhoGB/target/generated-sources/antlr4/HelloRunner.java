import java.io.IOException;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
    
public class HelloRunner {

	public static void main(String[] args) throws IOException {
		
		CharStream input = CharStreams.fromString("programa teste ; inicio escreva( xablaus ); fim.");    
		GramaticaLexer lexer = new GramaticaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GramaticaParser parser = new GramaticaParser(tokens);
		ParseTree tree = parser.prog(); // inicio do parsing da regra 'prog'
		System.out.println(tree.toStringTree(parser)); // print arv LISP-style	
	}
}