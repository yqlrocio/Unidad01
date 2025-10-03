package exercise10;

import java.util.Scanner;

public class Exercise10 {

			public static void main(String[] args) {
				// pedir número al usuario (imprimir mensaje y esperar el dato del usuario)
				//compruebo si es par 
				//imrpimo mensaje
				
			//Creamos un scanner
			Scanner reader = new Scanner (System.in); 
			int numero;
			boolean esPar;
			
			//Pedimos un número al usuario
			System.out.println("Introduce un número");
			numero = reader.nextInt();
			
			//Comprovamos si el número es par
			esPar = numero%2 == 0; 
			
			System.out.print("¿El número es par?"+esPar);
			
			//Cerramos el Scanner
			reader.close();
			
			}

		}
