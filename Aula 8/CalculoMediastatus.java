package exercicios;

import java.util.Scanner;

public class CalculoMediastatus {

	public static void main(String[] args) {
		//variáveis
		String nome; 
		double nota1,nota2,media;
		//objetos
		Scanner teclado = new Scanner(System.in);
	        System.out.println("  === Cálculo da média ===");
	        System.out.println("        =======");
        System.out.print("     Digite o seu nome: ");
        //Entrada
        nome = teclado.nextLine();
        System.out.print("     Digite a nota1: ");
        nota1 = teclado.nextDouble();
        System.out.print("     Digite a nota2: ");
        nota2 = teclado.nextDouble();
        //processamento
        media = (nota1 + nota2) /2;
        //saida
       
        System.out.println("        =======");
        System.out.println("     Nome: " + nome);
        System.out.println("     Média: " + media);
        System.out.print("     SITUAÇÃO: "  );
        if (media < 2) {
			System.out.println("Reprovado");
		} else if (media >= 5){
			System.out.println("Aprovado");
		} else {
			System.out.println("Recuperação");
		}
        teclado.close();
	}

}


