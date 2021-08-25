package EstruturaRepetitiva;

import java.util.Scanner;

public class ExercFor6 {

	public static void main(String[] args) {
		// Ler um número inteiro N e calcular todos os seus divisores
		Scanner sc = new Scanner(System.in);
		float numero = sc.nextInt();

		for (int x = 0; x <= numero; x++) {
			
			if (numero % x == 0) {
				
				System.out.println(x);
			}
			

		}
		sc.close();

	}

}
