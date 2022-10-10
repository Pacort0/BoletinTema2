package boletintema2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner (System.in);
		//Creamos las variables en las que vamos a guardar los datos que el usuario introduzca.
		double num1;
		double num2;
		
		//Imprimimos el mensaje inicial y esperamos la entrada de datos por teclado, que guardaremos en las variables designadas.
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextDouble();
		//Repetimos el proceso.
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextDouble();
		
		//Si num1 es mayor que num2, imprimimos el mensaje y cerramos el programa.
		if (num1 > num2) {
			System.out.println(num1 + " es mayor que " + num2);
		}
		//De no ser así, imprimimos otro mensaje y cerramos el programa.
		else {
			System.out.println(num2 + " es mayor que " + num1);
		}
		//Cerramos el escáner.
		sc.close();
	}

}
