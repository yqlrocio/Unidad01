package exercise11;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// pedir usuario la cantidad de dinero en peseta
		// hacer el factor de conversión de peseta a euro
		// mostrar al usuario el cambio en euro
		
		//Creamos un scanner
		Scanner reader = new Scanner (System.in); 
		double numero;
		
		//Pedimos un número al usuario
		System.out.println("Introduce la cantidad de dinero en peseta:");
		numero = reader.nextInt();
		
		//Mostrarle al usuario la cantidad de dinero introducido anteriormente en euro
		System.out.print("La cantidad de dinero introducido a euro es:"+ (numero/166) + "€" );
		
		//Cerramos el Scanner
		reader.close();

	}

}
