package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		// crear variables de las frutas de la frutertia (manzana y pera)
		// mostrar al usuario el precio de la fruta comprada en euro por kilo
		
		// Crear el Scanner
		Scanner sc = new Scanner (System.in); 
	 
		//2.35€ el kilo de manzana y 1.95€ el kilo de pera
		double manzana;
		double pera;  
        
        // Preguntar al usuario cuántas manzanas quiere comprar 
        System.out.println("¿Cúantos kilos de manzanas has vendido?");
        manzana = sc.nextDouble(); 
        
        // Preguntar al usuario cuánto quiere comprar 
        System.out.println("¿Cúantos kilos de peras has vendido?");
        pera = sc.nextInt();
        
        // Mostrarle al usuario cuánto ha ganado en sus manzanas y peras
        System.out.println("Tus beneficios de manzanas son:" + manzana * 2.35 + "€");
        System.out.println("Tus beneficios de peras son:" + pera * 1.95 + "€");
        
       //Cerramos el Scanner
        sc.close();
	}

}
