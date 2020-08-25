package exercicios;

import java.util.Scanner;
import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("  === JOKENPÔ ==");
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("   1. Pedra");
	System.out.println("   2. Papel");
	System.out.println("   3. Tesoura");
	System.out.println(" ");
	System.out.print("  " + "Escolha um número: ");
	    	 
	int numero = input.nextInt();
	System.out.println(" ");
	    	  
	if (numero == 1) {		        				  		      		  
  	System.out.println("  " + "Jogador escolheu: PEDRA");
  	} else if (numero == 2) {
  	System.out.println("  " + "Jogador escolheu: PAPEL");
	} else if (numero  == 3) {
  	System.out.println("  " + "Jogador escolheu: TESOURA");
  	}else if (numero  == 0 || numero > 3 ) {	  				        
  	System.out.println("  " + "Opção Inválida");}
	System.out.println(" ");
	System.out.println("  === Versus ===");
		        	 
	System.out.println(" ");
	Random aleatorio = new Random (); 
	int valor = aleatorio.nextInt(3) + 1;  			  
	if (numero == 0 || numero > 3  )
	System.out.println("  " + "Opção Inválida");
	else if (valor  == 1) {
	System.out.println("  " + "Computador escolheu: PEDRA");	
	} else if (valor == 2) {
	System.out.println("  " + "Computador escolheu: PAPEL");}
	else if (valor == 3) {	  				        
	System.out.println ("  " + "Computador escolheu: TESOURA");}
	{{
	System.out.println(" ");
	System.out.println("  === Resultado ===");
	System.out.println(" ");
	if ((numero == 1 && valor == 3) || (numero == 2 && valor == 1 )  || (numero == 3 && valor == 2 )){
	System.out.println("  " + "JOGADOR VENCEU");}
	else if ((valor == 1 && numero == 3) || (valor == 2 && numero == 1 )  || (valor == 3 && numero == 2 )){
	System.out.println("  " + "COMPUTADOR VENCEU");
	} else if  ((numero == valor) ||  (valor == numero )){
    System.out.println("  " + "EMPATE"); 
	teclado.close();	}}}}}			         
	



		         