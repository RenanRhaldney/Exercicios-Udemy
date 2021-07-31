package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a formula: DIFERENCA = (A * B - C * D)
	
	Scanner sc = new Scanner (System.in);
	
	int A, B, C, D;
	System.out.println("informe 4 numeros inteiros:");
	A = sc.nextInt();
	B = sc.nextInt();
	C = sc.nextInt();
	D = sc.nextInt();
	
	int resultado = (A*B)-(C*D);
	System.out.println("Diferença = " + resultado);

	sc.close();
	}

}
