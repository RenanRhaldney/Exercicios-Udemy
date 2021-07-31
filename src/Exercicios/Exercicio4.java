package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o numero do funcionario: ");
		int numero = sc.nextInt();
		
		System.out.printf("Informe a quantidade de horas trabalhadas do funcionario %d: ", numero);
		double horasTrabalhadas = sc.nextDouble();
		
	    System.out.printf("Informe o valor da hora do funcionario %d:  ", numero);
		double valorHora = sc.nextDouble();
		
		double salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$%.2f", salario);
		
		sc.close();
		
		
		

	}

}
