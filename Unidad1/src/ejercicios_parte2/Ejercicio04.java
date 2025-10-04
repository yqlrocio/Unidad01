package ejercicios_parte2;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable 
		double a; 
		double b;
		double c; 
		double x;
		double resultado; 
		
		// Crear scanner
		Scanner reader = new Scanner(System.in); 
		
		// Pedir al usuario 4 números
		System.out.println("Introduce valor para a:");
		a = reader.nextDouble(); 

		System.out.println("Introduce valor para b:");
		b = reader.nextDouble(); 
		
		System.out.println("Introduce valor para c:");
		c = reader.nextDouble(); 
		
		System.out.println("Introduce valor para x:");
		x = reader.nextDouble(); 
		
		// Calcular la ecuación de segundo grado
		resultado = a * (x * x) + b * x + c;
		
		// Mostrar resultado de la ecuación de segundo grado
		System.out.println("El resultado de y=ax^2+bx+c, es:" + resultado);
		resultado = reader.nextDouble(); 
		
		// Cerrar Scanner
		reader.close();
	}

}
