package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoDesconto{

	public static void main(String[] args) {
		double total, desconto, valorapagar, valorpago, troco;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.print("Digite o Total : ");
        total  = teclado.nextDouble();
        System.out.print("Digite o Desconto : ");
        desconto  = teclado.nextDouble();      
        valorapagar =  total - (total /100) * desconto;          
        System.out.println("Valor a Pagar: " + formatador.format(valorapagar));
        System.out.print("Digite o Valor pago : ");
        valorpago  = teclado.nextDouble();
        troco =  valorpago - valorapagar;   
        System.out.println("Troco: " + formatador.format(troco));
        teclado.close();
	}

}
