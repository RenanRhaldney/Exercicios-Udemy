package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int peca1, peca2, quantidade1, quantidade2;
		double totalAPagar, valorUnitario1, valorUnitario2;
		
		System.out.println("Digite o codigo da peca.");
		peca1 = sc.nextInt();
		
		System.out.printf("Quantas peças voce quer do cod:(%d).%n", peca1);
		quantidade1 = sc.nextInt();
		
		System.out.println("Informe o valor unitario de cada peca.");
		valorUnitario1 = sc.nextDouble();
		
		//----------------------ITEM 2 ABAIXO ----------------------
		System.out.println("Digite qual peça voçê deseja.");
		peca2 = sc.nextInt();
		
		System.out.printf("Quantas peças voce quer do cod:(%d).%n", peca2);
		quantidade2 = sc.nextInt();
		
		System.out.println("Informe o valor unitario de cada peca.");
		valorUnitario2 = sc.nextDouble();
		
		totalAPagar = quantidade1 * valorUnitario1 + quantidade2 * valorUnitario2;
		System.out.printf("O valor total a pagar é:R$%.2f", totalAPagar);
		
		sc.close();
		
		
		
	}

}

