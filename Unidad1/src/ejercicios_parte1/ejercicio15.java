package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		/* 
		 * Pedir precio al usuario (tiene decimales)
		 * Mostrar el precio con el IVA
		 */
		
		// Crear Scammer
		Scanner reader = new Scanner(System.in);
		
		// Constante para almacenar el valor del IVA
		final int IVA = 21;
		
		// Precio a leer de consola
		double precio;
		
		// Variable donde almacenar el precio total con el IVA incluido
		double precioConIVA;
		
		// Le pedimos al usuario el precio
		System.out.println("Introduce el precio:");
		precio = reader.nextDouble();
		
		// Calculamos el precio con IVA
		precioConIVA = precio + precio*IVA/100;
		System.out.println("El precio con IVA es:" + precioConIVA);
	
		reader.close();
	}

}
