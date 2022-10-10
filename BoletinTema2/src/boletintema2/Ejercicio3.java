package boletintema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner (System.in);
		//Creamos la variable en la que guardaremos el numero que se introduzca por teclado.
		double num;
		
		//Imprimimos el mensaje inicial por pantalla y esperamos a la entrada de datos, que guardamos en la variable 'num'.
		System.out.print("Introduzca un número: ");
		num = sc.nextDouble();
		
		//Si el numero es igual a 0, imprimimos el mensaje y se acaba el programa.
		if(num == 0) {
			System.out.print("0 es cercano a 0.");
		}
		//Si el numero se encuentra entre -1 y 1, se imprime el mensaje por pantalla y se acaba el programa.
		else if(num > -1 && num < 1) {
			System.out.print("El numero introducido es cercano a 0.");
		}
		//De no ser así, imprimimos otro mensaje y se acaba el programa.
		else {
			System.out.print("El número introducido no es cercano a 0.");
		}
		//Cerramos el escáner.
		sc.close();
	}

}
