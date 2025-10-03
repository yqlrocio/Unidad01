package exercise06;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) { 
		
		//Primer número pedido al usuario
		double numero1; 
		
		//Segundo número pedido al usuario
		double numero2;
		
		//Creación del scanner
		Scanner reader = new Scanner (System.in);
		
		//Pedir al usuario un número
		System.out.println("Introduce un número");
		numero1 = reader.nextDouble(); //aqui es donde el usuario lo verá
		
		//Pedir al usuario otro número
		System.out.println("Introduce otro número");
		numero2 = reader.nextDouble(); //aqui es donde el usuario lo verá
		
		// Cerrar Scanner
		reader.close(); 

	}

}
