package boletintema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner (System.in);
		//Creamos las variables donde guardaremos los datos que el usuario introduzca.
		int num1;
		int num2;
		int num3;
		
		//Imprimimos el mensaje inical y esperamos a la entrada de datos, que guardaremos en la variable designada.
		System.out.print("Introduzca el primer número: ");
		num1 = sc.nextInt();
		//Repetimos el proceso dos veces más.
		System.out.print("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		System.out.print("Introduzca el tercer número: ");
		num3 = sc.nextInt();
		
		//Si el primer número es mayor que el primero y que el segundo.
		if (num1 > num2 && num2 > num3) {
			if(num3>num2) {
			//Y si el segundo número es mayor o igual que el tercero
			System.out.print(num1 + " > " + num2 + " > " + num3);
			}
			//de no ser el segundo mayor que el tercero, es porque el tercero es mayor que el segundo.
			else {
				System.out.print(num1 + " > " + num3 + " > " + num2);
			}
		}
		//Por otro lado, si el segundo número es mayor que el primero y el tercero,
		else if (num2 > num1 && num2>num3) {
			//Y el primer número es mayor o igual que el tercero,
			if(num1>=num3) {
				//imprimimos que num2>num1>num3.
				System.out.print(num2 + " > " + num1 + " > " + num3);
			}
			//De no ser así, es porque num3 es mayor que num1
			else {
				System.out.print(num2 + " > " + num3 + " > " + num1);
			}
		}
		//Por último, si el tercer número es mayor que los otros dos,
		else if (num3 > num1 && num3 > num2) {
			//y si num1 es mayor o igual que num2
			if(num1>=num2) {
				System.out.print(num3 + " > " + num1 + " > " + num2);
			}
			//de no ser num1 mayor que num2, num2 es mayor que num1
			else {
				System.out.print(num3 + " > " + num2 + " > " + num1);
			}
		}
		//Cerramos el escáner.
		sc.close();
	}

}
