package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner reader = new Scanner(System.in);
		
		//Create variables 
		int siglo; 
		int año; 
		
		//Ask the user for a number
		System.out.print("Introduce un año: ");
		año = reader.nextInt();
		
		//calculate what century it is 
		siglo = (año / 100)+1;
		
		
		//Print result 
		System.out.println("El año " + año + " se encuentra en el siglo " + siglo );
		
		//Close Scanner
		reader.close();
	}

}