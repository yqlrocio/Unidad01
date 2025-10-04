package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio1 {
public static void main(String[] args) {
			// Sin ternario
	
			// Constante para almacenar decimal
			final double decimal = 0.5; 
			
			// Variable del número decimal
			double numeroDecimal;
			
			// Variable del número entero
			int numeroEntero; 
			
			// Crear Scanner
			Scanner reader = new Scanner(System.in); 
				
		    // Preguntar al usuario para que introduzca un número
		    System.out.println("Introduce un número con parte decimal:");
		    numeroDecimal = reader.nextDouble(); 
		    
		    
		    // Calcular la aproximación 
		    numeroEntero = (int) (numeroDecimal + decimal);
		    
		    System.out.println("El número redondeado es:" + numeroEntero);
		    numeroEntero = reader.nextInt(); 
	
		    //Cerrar Scanner
		    reader.close(); 
	}

}
