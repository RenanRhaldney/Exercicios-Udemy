package EstruturaRepetitiva;

import java.util.Scanner;

public class ExercFor7 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro positivo N. O programa deve ent�o mostrar na tela N linhas,
		//come�ando de 1 at� N. Para cada linha, mostrar o n�mero da linha, depois o quadrado e o cubo do valor, conforme
		//exemplo
		
		Scanner sc = new Scanner (System.in);
		int repeti��o, quadrado, cubo,  n = sc.nextInt();
		
		for (repeti��o = 1; repeti��o <= n; repeti��o++) {
			
			quadrado = repeti��o*repeti��o;
			cubo = repeti��o*repeti��o*repeti��o;
			
			System.out.printf("%d %d %d %n",repeti��o, quadrado, cubo);
		}
		
		sc.close();

	}

}
