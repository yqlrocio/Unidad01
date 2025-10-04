package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio08 {

	public static void main(String[] args) {
		// pedir nombre del usuario
		//pedir edad del usuario
		
		//creación del scanner
		Scanner reader = new Scanner(System.in);
		String nombre;
		int edad; 
		
		//pedir al usuario su nombre
		System.out.println("Introduza su nombre:");
		nombre = reader.nextLine();
		
		//pedir al usuario su edad
		System.out.println("Introduza su edad:");
		edad = reader.nextInt();
		
		//mostrar al usuario una frase
		System.out.println("Hola " + nombre + ", tienes " + edad + " años, ¡Qué mayor eres!");
		
		reader.close(); 
}

}