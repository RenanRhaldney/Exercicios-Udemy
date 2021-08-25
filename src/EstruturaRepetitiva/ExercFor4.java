package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercFor4 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número N. Depois leia N pares de números e
		// mostre a divisão do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
		// impossivel".
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float numeroUm, numeroDois, repetições;
		float resultado;
		repetições = sc.nextFloat();

		for (int x = 0; x < repetições; x++) {

			numeroUm = sc.nextFloat();
			numeroDois = sc.nextFloat();

			if (numeroDois == 0) {
				System.out.println("Não é possivel dividir por zero.");
			} else {
				resultado = numeroUm / numeroDois;
				System.out.printf("%.1f%n", resultado);
			}

		}

		sc.close();

	}

}
