package boletintema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner(System.in);
		//Creamos las variables donde guardaremos los datos que el usuario introduzca.
		int a, b, c;
		//Creamos las variables donde mostraremos los resultados del programa.
		double x1, x2;
		
		//Imprimimos el mensaje inicial y esperamos a la entrada de datos, que guardaremos en las variables correspondientes.
		System.out.print("Introduzca un valor para 'a': ");
		a = sc.nextInt();
		//Repetimos el proceso dos veces más.
		System.out.print("Introduzca un valor para 'b': ");
		b = sc.nextInt();
		System.out.print("Introduzca un valor para 'c': ");
		c = sc.nextInt();
		
		//Si el contenido de la raíz cuadrada es negativo, la ecuación no puede tener solución real. Se acaba el programa.
		if(Math.pow(b,2)-4*a*c < 0) {
			System.out.print("La ecuación no tiene solución real.");
		}
		//De no ser así, hacemos los cálculos pertinentes.
		else {
		x1 = -b+(Math.sqrt(Math.pow(b, 2))-4*a*c)/2*a;
		x2 = -b-(Math.sqrt(Math.pow(b, 2))-4*a*c)/2*a;
		
		//Imprimimos los resultados por consola.
		System.out.print("La primera solución de x es = " + x1);
		System.out.print("\nLa segunda solución de x es = " + x2);
		}
		
		//Cerramos el escáner.
		sc.close();
	}

}

