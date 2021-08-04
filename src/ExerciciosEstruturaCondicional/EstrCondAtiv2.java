package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class EstrCondAtiv2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("digite um numero");
		double restoDaDivisao = sc.nextDouble();
		
		if (restoDaDivisao % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
