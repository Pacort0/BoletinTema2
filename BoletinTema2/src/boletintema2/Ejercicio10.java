package boletintema2;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		//Creamos las variables que usaremos para guardar los datos que el usuario introduzca por consola.
		int num1, num2, num3;
		
		//Imprimimos el mensaje principal y esperamos a que el usuario introduzca los datos necesarios, que guardaremos en las variables asignadas.
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		//Repetimos el proceso dos veces más
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		System.out.println("Introduzca el tercer número: ");
		num3 = sc.nextInt();
		
		//Si num1 + num2 = num3, imprimimos el mensaje final y cerramos el programa.
		if(num1 + num2 == num3) {
			System.out.println("La suma del primer y segundo número da como resultado el tercero: " + num1 + " + " + num2 + " = " + num3);
		}
		//Si num2 + num3 = num1, imprimimos el mensaje final y cerramos el programa.
		else if (num2 + num3 == num1) {
			System.out.println("La suma del segundo y tercer número da como resultado el primero: " + num2 + " + " + num3 + " = " + num1);
		}
		//Si num1 + num3 = num2, imprimimos el mensaje final y cerramos el programa
		else if (num1 + num3 == num2) {
			System.out.println("La suma del primer y tercer número da como resultado el primero: " + num1 + " + " + num3 + " = " + num2);
		}
		//Pero si ninguna suma de dos de los números da como resultado el tercero, imprimimos el mensaje final y cerramos el programa
		else {
			System.out.println("Ninguna suma de dos de los números introducidos resulta en el número restante.");
		}
		//Cerramos el escáner.
		sc.close();
	}

}
