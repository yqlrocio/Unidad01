package exercise02;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		//Variable of the age that we are typing in
				int age;
			// Asking for the age
				System.out.println("Introduzca su edad:");
			//We create the Scanner
				Scanner reader = new Scanner (System.in) ;
			//Then we read the age
				age = reader.nextInt();
			//Now we 
				System.out.println("Tu edad el año que viene será:" + (age+1) );
			//Finally, we close the Scanner we created
				reader.close();
	}

	}
