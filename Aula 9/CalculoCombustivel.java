package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;


public class CalculoCombustivel {
	public static void main(String[] args) {
	
		double km,alcool,gasolina, valoral,valorga;
	
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		  System.out.println("   == Alcool X Gasolina ==");
		  System.out.println("      == Informe == ");
		 System.out.print("    Quantos KM irá rodar: ");
	        km = teclado.nextDouble();
	        System.out.print("    Valor do Acool: ");
	        alcool = teclado.nextDouble();
	        System.out.print("    Valor da Gasolina: ");
	        gasolina = teclado.nextDouble();
	        System.out.println(" ");
	        System.out.println("    Valor gasto no Abastecimento");
	        valoral = ( km/7)* alcool;
	        System.out.println("    Com Alcool: R$ "  + formatador.format( + valoral));
	        valorga = (km/10) * gasolina;
	        System.out.println("    Com Gasolina: R$ " + formatador.format( + valorga));
	        System.out.println(" ");
	        System.out.println("    É vantagem abastecer com: ");
	    	 if (valoral <= valorga * 0.7) {
	    		 System.out.println("      ==  ALCOOL ==");
	} else if (valoral > valorga * 0.7) {
   	 System.out.println("      ==  GASOLINA ==");
   	 
   
   
	        
     teclado.close();
	}

}
}
