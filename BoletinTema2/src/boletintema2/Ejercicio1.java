package boletintema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		//Creamos una variable donde guardar el valor que el usuario introduzca.
		int num;
		
		//Mostramos el mensaje inicial por consola, pidiéndole al usuario que introduzca un número, y guardando este en la variable asignada.
		System.out.print("Introduzca un número: ");
		num = sc.nextInt();
		
		//Creamos un condicional if, en el que si el resto de la división entre el número introducido es 0, es un número par; si no, es impar.
		if (num%2==0) {
			System.out.print("El numero introducido es par.");
		}
		else {
			System.out.print("El número introducido es impar.");
		}
		//Cerramos el escáner.
		sc.close();
	}

}
