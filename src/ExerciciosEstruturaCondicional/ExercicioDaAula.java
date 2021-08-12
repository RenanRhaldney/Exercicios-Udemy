package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDaAula {

	public static void main(String[] args) {
	
		//Programa vai comprimentar, Bom dia, Boa Tarde ou Boa noite, dependendo da hora que for informada.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o horario.");
		
		double hora = sc.nextDouble();
		
		if (hora > 0 && hora < 12) {
			System.out.println("Bom dia");
		}
		if (hora >= 12 && hora < 18) {
			System.out.println("Boa Tarde");
		}
		if ((hora >= 18 && hora < 24) || (hora >= 0 && hora < 4)) {
			System.out.println("Boa Noite");
		}
		if (hora > 24) {
			System.out.println("Esse horario não existe " + hora + "h.");
		}
	
		sc.close();
	
	}

}
