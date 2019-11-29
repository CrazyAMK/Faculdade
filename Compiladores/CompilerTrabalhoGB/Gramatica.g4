grammar Gramatica;

//Parser
prog		: T_PROGRAMA identificador T_PONTOEVIRGULA bloco T_FIM { System.out.println("PASSOU TPROGRAMA"); };

identificador	: T_LETRA (T_LETRA | T_UNDERLINE)* ;

bloco		: ( etDeclaracao_Variaveis )* comandos ;

comandos	: T_INICIOCOMANDO comando ( T_PONTOEVIRGULA comando )* (T_PONTOEVIRGULA)? ;

comando		:	comando_escreva ;


comando_escreva: T_ESCREVA T_ABREPARENTESES identificador T_FECHAPARENTESES;

etSub_Rotina	: ;


// Declaracoes

etDeclaracao_Variaveis	: T_VAR	declaracao_var T_PONTOEVIRGULA 
						  ( declaracao_var T_PONTOEVIRGULA )* (T_PONTOEVIRGULA)? ;

declaracao_var			: identificador (T_VIRGULA identificador)* T_DOISPONTOS tipo ;

tipo	: ( T_INTEIRO | T_BOOLEANO);

// Lexer

T_PROGRAMA		: 'programa' ;

T_INICIOCOMANDO	: 'inicio' ;

T_INTEIRO		: 'inteiro';

T_BOOLEANO		: 'booleano';

T_FIMCOMANDO	: 'fim' ;

T_PONTOEVIRGULA	: ';' ;

T_FIM			: 'fim.' ;
				
T_VAR			: 'var' ;
				
T_VIRGULA		: ',';
				
T_DOISPONTOS	: '.' ;

T_ABREPARENTESES : '(' ;

 T_FECHAPARENTESES : ')';

T_ESCREVA		: 'escreva'	;

T_UNDERLINE		: '_' ;

T_DIGITO		: ('0'..'9')+ ;

T_LETRA		: 	('a'..'z' | 'A'..'Z') ;	

WS 				: [ \t\r\n]+ -> skip ;

COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;