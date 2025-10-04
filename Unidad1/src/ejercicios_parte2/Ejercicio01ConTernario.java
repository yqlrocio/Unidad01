package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio01ConTernario {

	public static void main(String[] args) {
		// Con ternario
		
		// crear variables
		double numero;
		double parteDecimal; 
		int parteEntera;
		int resultado;
		
		// crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// pedir al usuario que introduzca un número decimal y mostrarselo 
		System.out.println("Introduce un número con parte decimal:");
		numero = reader.nextDouble(); 
		
		// Calcular la aproximación
		parteEntera = (int) numero; 
		
		parteDecimal = numero - parteEntera; 
		
		resultado = (parteDecimal < 0.5) ? parteEntera : parteEntera + 1; 
		
		// Mostrar la aproximación
		System.out.println("Tu número redondeado es:" + resultado);
		
		// Cerrar Scanner
		reader.close(); 

	}

}
