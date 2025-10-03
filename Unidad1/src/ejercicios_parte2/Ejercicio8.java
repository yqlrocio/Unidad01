package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Crear variable 
		float longitudEnMetro;
		int longitudEnCentimetro; 
		
		// Crear Scanner
		Scanner reader = new Scanner (System.in);
		
		// Preguntar al usuario la longitud de su lanzamiento
		System.out.println("¿Cuál es la longitud de tu lanzamiento en metro?:");
		longitudEnMetro = reader.nextFloat(); 
		
		// Calcular la longitud del lanzamiento en centimreto sin decimales
		longitudEnCentimetro = (int) (longitudEnMetro * 10); 
		
		// Mostar al usuario la longitud en cm
		System.out.println("Tu longitud del lanzamiento en centimetro es:" + longitudEnCentimetro);
		
		// Cerrar Scanner
		reader.close();

	}

}
