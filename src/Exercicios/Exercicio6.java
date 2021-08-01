package Exercicios;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio6 {

	public static void main(String[] args) {
		//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
		//mostre:
		//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
		//b) a �rea do c�rculo de raio C. (pi = 3.14159)
		//c) a �rea do trap�zio que tem A e B por bases e C por altura.
		//d) a �rea do quadrado que tem lado B.
		//e) a �rea do ret�ngulo que tem lados A e B.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);		
		Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Digite tres valores.");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		triangulo = (A * C) / 2;
		circulo = C * C * 3.14159;
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		System.out.printf("TRIAGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		
		
	}

}
