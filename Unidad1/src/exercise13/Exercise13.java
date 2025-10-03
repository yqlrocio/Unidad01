package exercise13;

import java.io.Reader;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		// Preguntar al usuario si fuera está lloviendo y si ha realizado la tarea: solo en caso de ambos podrá salir: con booleano
		// Preguntar al usuario si tiene que ir a la biblioteca: si es así podrá salir: con booleano
		
		//Crear Scanner: porque tengo que pedir información al usuario
		Scanner reader = new Scanner (System.in); 
		
		//Crear variables
		boolean estaLloviendo; 
		boolean tareasTerminadas;
		boolean irBiblioteca; 
		boolean salir; 
		
		// Preguntar al usuario si fuera esta lloviendo, si a terminado de realizar la tarea y si necesita ir a la biblioteca
        System.out.println("¿Está fuera lloviendo?"); 
        estaLloviendo = reader.nextBoolean(); 
        
        System.out.println("¿Has terminado de hacer la tarea?"); 
        tareasTerminadas = reader.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca?");  
        irBiblioteca = reader.nextBoolean();
	
        salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;

       System.out.println("¿Puedo salir a la calle?" + salir);
       
       reader.close();
	}

}
