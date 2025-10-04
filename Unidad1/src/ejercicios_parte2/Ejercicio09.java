package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int volumen; 
		int dato; 
		
		//Ask the user for a number
		System.out.print("Introduce el número del problema: ");
		dato = sc.nextInt();
		
		//calculate what volume it is in 
		volumen = dato / 100;
		
		
		//Print result 
		System.out.println("El problema se encuentra en el volumen: " + volumen );
		
		//Close Scanner
		sc.close();
	}

}