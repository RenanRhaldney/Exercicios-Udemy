package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class EstrCondAtiv1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner (System.in);
	    double numero;
	    System.out.println("digite um numero");
	    numero = sc.nextDouble();
	    
	    if (numero < 0) {
	    	System.out.println("NEGATIVO");
	    }
	    else {
	    	System.out.println("NÃO NEGATIVO");
	    }
	    
	    
	    sc.close();
	}

}
