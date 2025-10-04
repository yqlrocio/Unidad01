package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio02ConTernario {

	public static void main(String[] args) {
		
		// Crear variable de un numero entero
		int numero;
		int numeroASumar;
		int resto;
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Preguntar al usuario un número 
		System.out.println("Introduce un número");
		numero = reader.nextInt(); 
		
		// Operar para que el número introducido sea múltiplo de 7
		resto = numero % 7;
		
		numeroASumar = (resto == 0) ? 0 : (7-resto);
		
		System.out.println("Para que sea múltiplo de 7, hay que sumarle:" + numeroASumar);
		
		reader.close();

	}

}
