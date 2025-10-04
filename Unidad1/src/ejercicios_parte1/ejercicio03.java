package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio03 {

	public static void main(String[] args) {
		// Variable the actual year
		int añoactual;
				
		// Variable for the year of birth of the user.
		int nacimiento;

				// Asking for the actual year
				System.out.println("¿En qué año estamos?:");
				
				// We create the Scanner
				Scanner reader = new Scanner(System.in);
				
				// Then we read the number
				añoactual = reader.nextInt();
				
				// Asking for the year of birth
				System.out.println("¿En qué año naciste?:");
				
				// Then we read the number
				nacimiento = reader.nextInt();
				
				// Variable to obtain the age of the user
				int años = añoactual - nacimiento;
				
				// Now we know the number and we can print it
				System.out.println("Tu edad es " + (años));
				
				// Finally, we close the Scanner we've created
				reader.close();
			}

		}