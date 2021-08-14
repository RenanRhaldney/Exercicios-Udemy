package EstruturaRepetitiva;

import java.util.Scanner;

public class ExercFor1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1-Leia um valor inteiro
		// 2-Em seguida mostre os impares de 1 ate X
		// 3-um valor por linha
		// 4-inclusive o x se for o caso
		int x = sc.nextInt();

		// ler um valor inteiro
		// pegar esse valor e informar quais os numeros impares que tem ate chegar nele
		// criar uma estrutura de for
		// com uma condicao de repetir e exibir os numeros impares informado ate ser
		// menor ou igual "numero informado"
		// se resto != 0 o numero e impa
		for (int y = 0; y <= x; y++) {
			if (y % 2 != 0) {
				System.out.println(y);
			}

		}

		//int x = sc.nextInt();

		//for (int i = 1; i <= x; i++) {
			//if (i % 2 != 0) {
			//	System.out.println(i);
			//}
		//}

		sc.close();

	}

}
