package boletintema2;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		//Creamos la variable donde guardaremos los datos que el usuario introduzca.
		int num;
		//Creamos una variable que indique el número de cifras del número, y la iniciamos a 1, ya que es lo mínimo que puede tener un número.
		int cifras = 1;
		
		//Imprimimos el mensaje principal y esperamos a la entrada de datos, que guardaremos en la variable designada.
		System.out.print("Introduzca un número entre 0 y 99.999: ");
		num = sc.nextInt();
		
		//Si el número es mayor o igual a 100000, imprimimos el mensaje y cerramos el programa.
		if(num >= 100000) {
			System.out.print("Número introducido no válido. Por favor, inténtelo de nuevo.");
		}
		//Si el número se encuentra entre 10 y 99, tiene 2 cifras
		else if(num >= 10 && num < 100) {
			cifras = 2;
		}
		//Si el número se encuentra entre 100 y 999, tiene 3 cifras
		else if(num >= 100 && num < 1000) {
			cifras = 3;
		}
		//Si el número se encuentra entre 1000 y 9999, tiene 4 cifras
		else if(num >= 1000 && num < 10000) {
		    cifras = 4;		
		}
		//Si el número se encuentra entre 10000 y 99999, tiene 5 cifras
		else if(num >= 10000 && num <= 99999) {
		    cifras = 5;
		}		
		//Imprimimos el mensaje final y cerramos el escaner.
		System.out.print("El número tiene " + cifras + " cifra(s).");
		sc.close();
	}
}
