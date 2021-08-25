package EstruturaRepetitiva;

import java.util.Scanner;

public class ExercFor7 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
		//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		//exemplo
		
		Scanner sc = new Scanner (System.in);
		int repetição, quadrado, cubo,  n = sc.nextInt();
		
		for (repetição = 1; repetição <= n; repetição++) {
			
			quadrado = repetição*repetição;
			cubo = repetição*repetição*repetição;
			
			System.out.printf("%d %d %d %n",repetição, quadrado, cubo);
		}
		
		sc.close();

	}

}
