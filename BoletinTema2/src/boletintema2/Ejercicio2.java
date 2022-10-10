package boletintema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		//Creamos variables donde guardar los valores que el usuario introduzca.
		int num1;
		int num2;
		
		////Mostramos el mensaje inicial por consola, pidiéndole al usuario que introduzca un número, y guardando este en la variable asignada.
		System.out.print("Introduzca un número entero: ");
		num1=sc.nextInt();
		//Repetimos el proceso, pero para otro número.
		System.out.print("Introduzca otro número entero: ");
		num2=sc.nextInt();
		
		//Creamos un condicional if en el que si ambos números son iguales, imprime un mensaje por pantalla y, si no lo son, imprime otro.
		if(num1 == num2) {
			System.out.print("Los dos números introducidos son iguales.");
		}
		else{
			System.out.print("Los dos números introducidos son diferentes.");
		}
		//Cerramos el escáner.
		sc.close();
	}

}
