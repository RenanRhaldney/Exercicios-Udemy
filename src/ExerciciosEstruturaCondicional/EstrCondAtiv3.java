package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class EstrCondAtiv3 {

	public static void main(String[] args) {
		//Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		//Multiplos", indicando se os valores lidos s�o m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em
		//ordem crescente ou decrescente.
		
		Scanner sc = new Scanner (System.in);
		double A, B;
		
		System.out.println("Digite dois numero, para saber se eles s�o multiplos entre si ou n�o multiplos");
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o S�o Multiplos");
		}
		
		sc.close();

	}

}
