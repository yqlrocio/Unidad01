package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio06 {

public static void main(String[] args) { 
		
		// Crear variables
		double num1; 
		double num2;
		double suma;
		double resta;
		double multiplicación;
		double division;
		
		
		//Creación del scanner
		Scanner reader = new Scanner (System.in);
		
		//Pedir al usuario un número
		System.out.println("Introduce un número: ");
		num1 = reader.nextDouble(); //aqui es donde el usuario lo verá
		
		//Pedir al usuario otro número
		System.out.println("Introduce otro número: ");
		num2 = reader.nextDouble(); //aqui es donde el usuario lo verá
		
		// Calcular la suma, la resta, la mujltiplicación y la división de los números pedidos al usuario
		suma = num1 + num2;
		resta = num1 - num2; 
		multiplicación = num1 * num2; 
		division = num1 / num2;
		
		// Mostrarle al usuario los resultados de las operaciones realizadas
		System.out.println("La suma de los números introducidos es: " + suma);
		System.out.println("La resta de los números introducidos es: " + resta);
		System.out.println("La multiplicación de los números introducidos es: " + multiplicación);
		System.out.println("La división de los números introducidos es: " + division);
		
		// Cerrar Scanner
		reader.close(); 

	}

}
