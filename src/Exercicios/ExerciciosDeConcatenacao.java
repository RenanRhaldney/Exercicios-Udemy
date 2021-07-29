package Exercicios;

import java.util.Locale;

public class ExerciciosDeConcatenacao {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double prince1 = 2100.0;
		double prince2 = 650.50;
		double maesure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which prince is $ %.2f %n", product1, prince1);
		System.out.printf("%s, which prince is $ %.2f %n", product2, prince2);
		System.out.println("\n");
		System.out.printf("record: %d years old, code %d and gender: %c",age ,code ,gender);
		System.out.println("\n");
		System.out.printf("Measue with eight decimal places: %.8f%n", maesure);
		System.out.printf("Rouded (three decimal places: %.3f%n", maesure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", maesure);
		
		
	
		
		

	}

}
