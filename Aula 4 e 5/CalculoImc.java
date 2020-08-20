package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
			double altura,peso,imc;
			Scanner teclado = new Scanner(System.in);
			DecimalFormat formatador = new DecimalFormat("#0.0");
	        System.out.println("  == Cálculo da IMC ==");
	        System.out.println("       ========");
	        System.out.print("    Digite a Altura: ");
	        altura = teclado.nextDouble();
	        System.out.print("    Digite a Peso: ");
	        peso = teclado.nextDouble();
	        imc =  peso /(altura * altura) ;
	        System.out.println("       ========");
	        System.out.println("    IMC: " + formatador.format(imc));
	        System.out.println("       ========");
	        System.out.print("    CLASSIFICAÇÃO: "  );
	        if (imc <= 18.5) {
	    		System.out.println("Abaixo do Peso");
	         } else if (imc >18.5 && imc <=24.9) {
	        	 System.out.println("Peso Ideal");
	         } else if (imc >=25 && imc <=29.9) {
	        	 System.out.println("Acima do Peso");
	         } else if (imc >=30 && imc <=34.9) {
	        	 System.out.println("Obesidade Tipo I");
	         } else if (imc >=35 && imc <=39.9) {
	        	 System.out.println("Obesidade Tipo II");
	         } else if (imc >=40) {
	        	 System.out.println("Obesidade Tipo III");
	        teclado.close();

	}
	}}