package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio07 {

	public static void main(String[] args) {
		// pedir nombre 
		//pedir dirección
		//pedir teléfono 
		
		//creación del scanner
		Scanner reader = new Scanner(System.in);
		String nombre;
		String direccion;
		int telefono;
		
		//pedir al usuario su nombre
		System.out.println("Introduza su nombre:");
		nombre = reader.nextLine();
		
		//pedir al usuario su direción
		System.out.println("Introduza su dirección:");
		direccion = reader.nextLine();
		
		//pedir al usuario su número
		System.out.println("Introduza su número:");
		telefono = reader.nextInt();
		 
		reader.close();
	}

}