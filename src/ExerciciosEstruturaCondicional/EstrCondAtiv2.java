package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class EstrCondAtiv2 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
		
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
