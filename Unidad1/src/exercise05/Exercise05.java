package exercise05;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Declaramos las variables
		
				//Radio de la circunferencia
				double radio; 
				
				//La longitud de la circunferencia
				double longitud; 
				
				//Área de la circunsferencia 
				double area;
				
				//Creación del scanner
				Scanner reader = new Scanner (System.in);

				//Pedir al usuario el radio de la circunferencia
				System.out.println("Introduce el radio de la circunsferencia");
				radio = reader.nextDouble(); //aqui es donde el usuario lo verá
				
				//Calcular la longitud
				longitud = 2*Math.PI*radio; 
				
				//Calculamos el área de la circunferencia 
				area = Math.PI * radio * radio;
						
				//Mostramos por pantalla el resultado de la longitud y área
				System.out.println("La longitud de la circunferencia es" + longitud); 
				System.out.println("La area de la circunferencia es" + area); 

				reader.close();
			}

		}
