package ejercicios_parte1;

import java.util.Scanner;

public class ejercicio01 {

	public static void main(String[] args) {

		//Variable of the number that were typing in
		int number;
		
        //Ask to the user for a number
        System.out.println("Por favor, introduce un número:");

      //Creación del scanner
		Scanner reader = new Scanner (System.in);

        
    	//Then we read the number
        number = reader.nextInt();
        
    	//Now we know the number and we can print it
    		System.out.println("Tu número es "+ (number));
    		
    	//Finally, we close the Scanner we created
    		reader.close();

}

}