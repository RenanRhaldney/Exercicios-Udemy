package ExerciciosEstruturaCondicional;

import java.util.Scanner;
public class EstrCondAtiv4 {

	public static void main(String[] args) {
		
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo, sabendo que o mesmo pode
		//come�ar em um dia e terminar em outro, tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.

		Scanner sc = new Scanner (System.in);
		int horaInicial, horaFinal, duracao;
				
		System.out.println("Horario que inicou a jogar.");
		horaInicial = sc.nextInt();
		System.out.println("horario que terminou de jogar.");
		horaFinal = sc.nextInt();
		
		if (horaInicial > 12) {
			duracao = (24 - horaInicial) + horaFinal;
			System.out.println(duracao);
		}
		else {
			duracao = horaFinal - horaInicial;
			System.out.println(duracao);
		}
		
		sc.close();
	}

}
