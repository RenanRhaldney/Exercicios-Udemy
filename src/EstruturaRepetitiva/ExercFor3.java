package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercFor3 {

	public static void main(String[] args) {
//		Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste 
//		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes 
//		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem 
//		peso 5.
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int y, repetição = sc.nextInt();
		float nUm, nDois, nTres, resultado;
		for (y=0;y<repetição;y++) {
			//preciso criar um comando que leia 3 valores e depois de a media deles
			System.out.println("Informe as notas.");
			nUm = sc.nextFloat();
			nDois = sc.nextFloat();
			nTres = sc.nextFloat();
			resultado = (nUm *2 + nDois * 3 + nTres * 5) / 10;
			System.out.printf("Media = %.1f%n", resultado);
		}
		sc.close();

	}

}
