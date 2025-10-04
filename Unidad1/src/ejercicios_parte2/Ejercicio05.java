package ejercicios_parte2;
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		// Crear variable
		double segundo;
		double minuto;
		double hora;
		int a = 60;
		int b = 3600; 
		
		// Crear Scanner
		Scanner reader = new Scanner(System.in); 
		
		// Pedir al usuario que introduzca una candidad de segundos
		System.out.println("Introduce la cantidad de segundos que desees:");
		segundo = reader.nextDouble(); 
		
		// Hacer el factor de conversión
		minuto = segundo/a;
		hora = segundo/b;
		
		// Mostrar el resultado del factor de conversión
		System.out.println("Tus segundo introducidos en minutos son:" + minuto);
		
		System.out.println("Tus segundo introducidos en horas son:" + hora);
		
		
		//Cerrar Scanner
		reader.close();
	}

}
