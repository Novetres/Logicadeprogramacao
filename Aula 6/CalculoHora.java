package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoHora {

	public static void main(String[] args) {
		double remuneracao,coperacional, vhora,chmensal, imposto, invest;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println(" === Digite o valor Mensal ===");
        System.out.print("     Remuneração : ");
        remuneracao  = teclado.nextDouble();
        System.out.print("     Imposto (%) : ");
        imposto  = teclado.nextDouble(); 
        System.out.print("     Custo operacional : ");
        coperacional  = teclado.nextDouble();   
        System.out.print("     Investimento (%)  : ");
        invest  = teclado.nextDouble(); 
        invest = (remuneracao / 100) * invest;
        imposto = (remuneracao / 100) * imposto;
        System.out.print("     Carga horária: ");
        chmensal  = teclado.nextDouble();  
        vhora =  (remuneracao + imposto + coperacional + invest) / chmensal; 
        System.out.println("");
        System.out.println(" === Cálculo da Hora ===");
        System.out.println("");
        System.out.println("     Valor: R$ " +  formatador.format( + vhora));
       
        teclado.close();
	}

}

