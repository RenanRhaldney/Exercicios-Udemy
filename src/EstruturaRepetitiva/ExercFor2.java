package EstruturaRepetitiva;

import java.util.Scanner;

public class ExercFor2 {

	public static void main(String[] args) {
		// 1 - Leia um valor inteiro N
		// 2 - Este valor será a quantidade de valores inteiros X que serão lidos em
		// seguida
		Scanner sc = new Scanner(System.in);
		
		int y, x, dentro, fora, n;
		dentro = 0;
		fora = 0;
		n = sc.nextInt();

		for (y = 0; y < n; y++) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				dentro++;
			} else {
				fora++;
			}

			// agora tenho que contar a quantidade de vezes se o numero tiver
			// entre 10 e 20, informar a quantidade de numeros digitado que está dentro esse
			// intervalo, tambem informando quantos estão fora

		}
		System.out.println(dentro + " in");
		System.out.print(fora + " out");

		sc.close();
	}

}
