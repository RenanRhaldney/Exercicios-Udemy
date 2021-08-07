package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;
public class EstrCondAtiv8 {

	public static void main(String[] args) {
		// Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
		//salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
		//de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
		//duas casas decimais.
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		double salario, imposto;
		System.out.println("Informe seu salario.");
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			System.out.println("Você é insento a imposto de renda.");
		}
		else if (salario >= 3000.00) {
			imposto = (salario - 3000)*0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		else if (salario >= 4500.00) {
			imposto = (salario - 4500)*0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();	

	}

}
