package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		// Pedir al usuario las notas de los tres trimestres
		// Calcular la nota media entre los tres trismestres 
		// Mostrar al usuario la nota media con decimales 
		// Mostar al usario la nota media pero solo con la parte entera
		
		//Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		//Crear variables
		double nota1;
		double nota2;
		double nota3;
		
		
		//Pedir al usuario las notas del primer, segundo y tercer trimestre: mostra al usuario sus notas
		System.out.println("¿Cúanto has sacado en el primer trimestre?");
		nota1 = reader.nextDouble();
		
		System.out.println("¿Cúanto has sacado en el segundo trimestre?");
		nota2 = reader.nextDouble();
		
		System.out.println("¿Cúanto has sacado en el tercer trimestre?");
		nota3 = reader.nextDouble();

		//Calcular la media: nota que sale en el expediente académico (con decimales)
		System.out.println("Tu nota en el boletín es de:" +  (nota1 + nota2 + nota3)/3);
		
		//Calcular la media: nota que sale en el boletín (solo la parte entera)
		System.out.println("Tu nota en el boletín es de:" + (nota1 + nota2 + nota3)/3.0); 
		
		reader.close();
	}

}
