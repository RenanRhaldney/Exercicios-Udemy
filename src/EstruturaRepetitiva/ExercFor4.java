package EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExercFor4 {

	public static void main(String[] args) {
		// Fazer um programa para ler um n�mero N. Depois leia N pares de n�meros e
		// mostre a divis�o do primeiro pelo
		// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao
		// impossivel".
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float numeroUm, numeroDois, repeti��es;
		float resultado;
		repeti��es = sc.nextFloat();

		for (int x = 0; x < repeti��es; x++) {

			numeroUm = sc.nextFloat();
			numeroDois = sc.nextFloat();

			if (numeroDois == 0) {
				System.out.println("N�o � possivel dividir por zero.");
			} else {
				resultado = numeroUm / numeroDois;
				System.out.printf("%.1f%n", resultado);
			}

		}

		sc.close();

	}

}
