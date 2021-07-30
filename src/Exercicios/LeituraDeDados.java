package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe seu nome:");
		String nome = sc.next();
		
		System.out.print("Informe sua idade:");
		int idade = sc.nextInt();
		
		
		System.out.print("Informe sua altura:");
		double altura = sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.println("Por favor, confirme se as informações abaixo estão corretas.");
		System.out.println(" ");
		System.out.printf("Seu nome é %s, você tem %d e sua altura é %.2f.", nome, idade, altura);
		
		sc.close();
		
		
		

	}

}
