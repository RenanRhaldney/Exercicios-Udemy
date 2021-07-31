package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Digite dois numeros, para obter o resultado da soma. ");
		
		Scanner sc = new Scanner (System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int resultado = valor1 + valor2;
		
		System.out.println("Resultado:"+ resultado);
		
		sc.close(); 

	}

}
