package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class EstrCondAtiv1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner (System.in);
	    double numero;
	    System.out.println("digite um numero");
	    numero = sc.nextDouble();
	    
	    if (numero < 0) {
	    	System.out.println("NEGATIVO");
	    }
	    else {
	    	System.out.println("N�O NEGATIVO");
	    }
	    
	    
	    sc.close();
	}

}
