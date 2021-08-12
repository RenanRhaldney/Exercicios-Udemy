package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class ExercicioDaAula2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int minutos = sc.nextInt();
		double valor = 50.0;
		
		if (minutos > 100) {
			valor = (((minutos - 100) * 2) + 50);
		}
		System.out.printf("Valor a pagar é R$%.2f%n", valor);
			
		
		sc.close();
	}
	

}
