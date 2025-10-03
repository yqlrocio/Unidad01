package exercise04;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
	
				//We create a new Scanner
				Scanner sc = new Scanner(System.in);
					
				//We create the variables, the 2 different grades.
				int nota1; 
				int nota2;
						
				//We ask for the first grade
				System.out.println("Introduce una nota: ");
				
				//We read It
				nota2 = sc.nextInt(); 
				
				//Then we ask for the second grade
				System.out.println("Introduce otra nota: ");
				
				//We read it too
				nota1 = sc.nextInt(); 
				
				//We print the average of the grades
				System.out.println("Tu nota media es: " + ((nota2+nota1)/2));
				
				//Finally, we close the scanner
				sc.close();

			}
		}
