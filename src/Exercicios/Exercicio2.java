package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exericio2 {

	public static void main(String[] args) {
		
		System.out.println("Digite o valor do Raio.");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		float raio = sc.nextFloat();
		double pi =3.14159;
		
		double resultado = pi*raio*raio;
		
		System.out.printf("%.4f%n", resultado);
		
		sc.close();
		
	}

}
