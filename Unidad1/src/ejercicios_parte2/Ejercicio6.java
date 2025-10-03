package ejercicios_parte2;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// Crear variable
		double milimetro;
		double centimetro; 
		double metro;
		double suma; 
		double milimetroACentimetro; 
		double metroACentimetro;
		// Craer Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedir al usuario milimetro, centimetro y metro
		System.out.println("Introduce la cantidad de milímetros:");
		milimetro = reader.nextDouble();  
		
		System.out.println("Introduce la cantidad de centimetro:");
		centimetro = reader.nextDouble();
		
		System.out.println("Introduce la cantidad de metro:");
		metro = reader.nextDouble();
		
		// Pasar todo a las mismas unidades, centimetros
		milimetroACentimetro = milimetro/10; 
		metroACentimetro = metro*100;
		
		// Calcular la suma
		suma = milimetroACentimetro + centimetro + metroACentimetro; 
		
		// Mostrar al usuario la suma realizado
		System.out.println("La suma en centimetro es:" + suma);
		
		// Cerrar Scanner
		reader.close(); 
	}

}
