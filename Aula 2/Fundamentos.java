package cursojava;

public class Fundamentos {

	public static void main(String[] args) {
		String nome;
		int idade = 27;
		char sexo = 'F';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		nome = "Paloma Kimberly Figueredo";	
		System.out.println("nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println(" Ar condicionado ligado? " + arCondicionado);
		System.out.println(" ");
        double i = 10;
    	System.out.println("Operadores Aritm�ticos e Atribui��es ");
    	System.out.println("Exemplos ");
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));		
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i += 5        | i = " + (i += 5));
		System.out.println("i -= 5        | i = " + (i -= 5));
		System.out.println("i *= 5        | i = " + (i *= 5));
		System.out.println("i /= 5        | i = " + (i /= 5));
		i++;
		System.out.println("i++           | i = " + i);
		i--;
		System.out.println("i--           | i = " + i);
		System.out.println("");
		System.out.println("ESTRUTURAS DE CONTROLE ");	
		System.out.println("");
		System.out.println("Estruturas de controle condicional");
		System.out.println("");
	
		System.out.println("Exemplo 1 - Uso do 'if'");
	    sexo = 'M';
		if (sexo == 'M') {
	 	System.out.println("Alistamento militar obrigat�rio");
		System.out.println("");
	 	System.out.println("Exemplo 2 - Uso do 'if - else'");
	
	 	if (idade < 18) {
		System.out.println("Menor de idade");
     }  else {System.out.println("Maior de idade");
     
     System.out.println("");
     System.out.println("Exemplo 3 - Uso do 'else - if'");
     idade = 10;
     if (idade < 16) {
    	 System.out.println("PROIBIDO VOTAR");
     } else if (idade >=18 && idade <=70) {
    	 System.out.println("VOTO OBRIGAT�RIO");
     } else if (idade == 16 || idade == 17 ||idade >70 ) {
    	 System.out.println("VOTO FACULTATIVO");
    	 
    	  
     }
     
     System.out.println("");
	  System.out.println("");
    	  System.out.println("Exemplo 4 - Uso do 'switch case'");
    	  System.out.println("1. Cadastro de clientes");
    	  System.out.println("2. Cadastro de usu�rios");
    	  System.out.println("3. Relat�rios");
    	int opcao = 3;
 switch (opcao) {
 case 1:
 	  System.out.println("CLIENTES");
 	  break;
 case 2:
	  System.out.println("USU�RIOS");
	  break;
 case 3:
	  System.out.println("RELAT�RIOS");
	  break;
 default:
	  System.out.println("Op��o inv�lida");
	  break;
 }
 System.out.println("");
	System.out.println("Estruturas de repeti��es");
	System.out.println("");
	System.out.println("Exemplo 5 - Uso do 'for'");
   for (int j = 10; j > 0; j--) {
		System.out.println(j);
		
	   
   }
   System.out.println("");
   System.out.println("Exemplo 6 - Tabuada");
   for (int tabuada = 0; tabuada <= 10; tabuada++) {
    for (int valor = 0; valor <= 10; valor++) {
    	System.out.println(tabuada);
    
     }

	}	}	} } }



	    	 
