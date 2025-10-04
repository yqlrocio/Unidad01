package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio03ConTernario {

	public static void main(String[] args) {
	
		// Crear variable de un numero entero
		int num1;
		int num2;
		int numeroASumar;
		int resto;
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Preguntar al usuario número 1 
		System.out.println("Introduce un número:");
		num1 = reader.nextInt(); 
		
		// Preguntar al usuario número 2
		System.out.println("Introduce otro número:");
		num2 = reader.nextInt(); 
		
		// Calcular para que el primer número sea múltiplo del segundo número
		resto = num1 % num2;
		
		numeroASumar = (num1 == num2) ? 0 : (num2 - resto);
		
		// Mostar al usuario la cantidad que hay que sumarle al primer número para que sea múltiplo del segundo
		System.out.println("Para que sea múltiplo del segundo número, hay que sumarle al primero:" + numeroASumar);
		
		// Cerrar Scanner
		reader.close();

		
	}

}
