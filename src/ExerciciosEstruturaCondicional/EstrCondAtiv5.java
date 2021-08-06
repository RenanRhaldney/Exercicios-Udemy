package ExerciciosEstruturaCondicional;

import java.util.Scanner;
import java.util.Locale;
public class EstrCondAtiv5 {

	public static void main(String[] args) {
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
		//A seguir, calcule e mostre o valor da conta a pagar
		Scanner sc = new Scanner (System.in);
		Locale.setDefault (Locale.US);
		System.out.println("digite o item desejado.");
		int item = sc.nextInt();
		
		System.out.println("informe a quantidade desejada.");
		double quantidade, valor;
		quantidade = sc.nextDouble();
		valor = 0;
		
		switch (item) {
		case 1:
			valor = 4.00 * quantidade;
			System.out.printf("total: %.2f%n", valor);
			break;
		case 2:
			valor = 4.5 * quantidade;
			System.out.printf("total: %.2f%n", valor);
			break;
		case 3:
			valor = 5.00 * quantidade;
			System.out.printf("total: %.2f%n", valor);
			break;
		case 4:
			valor = 2.00 * quantidade;
			System.out.printf("total: %.2f%n", valor);
		default:
			System.out.printf("Esse item não existe.");
		}		
		
		sc.close();
	}

}
