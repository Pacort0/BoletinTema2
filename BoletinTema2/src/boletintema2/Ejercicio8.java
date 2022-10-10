package boletintema2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		//Creamos la variable en la que guardaremos la nota que el usuario introduzca.
		double nota;
		
		//Imprimimos el mensaje inicial y esperamos a la entrada de datos, que guardaremos en la variable 'nota'.
		System.out.print("Introduzca una nota del 0 al 10: ");
		nota = sc.nextDouble();
		
		//si la nota es menor a 0 o mayor que 10, es erróneo, así que imprimimos un mensaje y se acaba el programa.
		if(nota > 10 || nota < 0) {
			System.out.print("Introduzca una nota válida, por favor.");
		}
		//Si la nota es menor que 5, imprimimos INSUFICIENTE y cerramos el programa.
		if(nota < 5) {
			System.out.print("INSUFICIENTE");
		}
		//Si la nota se encuentra entre 5 y 6 (5 incluido), imprimimos SUFICIENTE y cerramos el programa.
		else if(nota < 6 && nota >= 5) {
			System.out.print("SUFICIENTE");
		}
		//Si la nota se encuentra entre 6 y 7 (6 incluido), imprimimos BIEN y cerramos el programa.
		else if(nota < 7 && nota >= 6) {
			System.out.print("BIEN");
		}//Si la nota se encuentra entre 7 y 9 (7 incluido), imprimimos NOTABLE y cerramos el programa.
		else if (nota < 9 && nota >= 7) {
			System.out.print("NOTABLE");
		}
		//Si la nota se encuentra entre 9 y 10 (9 y 10 incluidos), imprimimos SOBRESALIENTE y cerramos el programa.
		else if (nota <=10 && nota >= 9) {
			System.out.print("SOBRESALIENTE");
		}
		//Cerramos el escáner.
		sc.close();
	}
}
