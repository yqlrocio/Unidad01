package ejercicios_parte2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Crear variable 
		int descuento; 
		int EI;  
		int EA; 
		double a= 15.50;
		double b = 20.00;
		double sumaEI;
		double sumaEA;
		double sumaTotal;
		double descuento1;
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntar al usuario cuantas entradas quiere comprar 
		System.out.println("¿Cuántas entradas infantiles quieres comprar?:");
		EI = reader.nextInt(); 
		
		System.out.println("¿Cuántas entradas adultas quieres comprar?:");
		EA = reader.nextInt();
		
		// Calcular la suma de las entradas compradas: si la compra es superior a 100€ se le hara un descuento del 5%
		sumaEI = (EI * a); 
		sumaEA = (EA * b);
		sumaTotal = (sumaEI + sumaEA);
		descuento1 = (sumaTotal >= 100) ? sumaTotal - (sumaTotal * 0.05) : sumaTotal;
		
		//Mostar al usuario el precio total de su compra con el descuento en caso de compra superior a 100€
		System.out.println("Tu compra total es:" + descuento1);
		
		// Cerrar Scanner
		reader.close();
	}

}
