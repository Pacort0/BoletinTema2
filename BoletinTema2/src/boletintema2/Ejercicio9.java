package boletintema2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String [] args) {
		//Creamos una variable Scanner, con la que leeremos lo que el usuario introduzca por teclado.
		Scanner sc = new Scanner (System.in);
		//Creamos las constantes numéricas que usaremos para identificar cada "arma" que los usuarios puedan elegir.
		final int PIEDRA = 1;
		final int TIJERAS = 3;
		final int PAPEL = 2;
		//Creamos las variables de los jugadores, donde guardaremos lo que se introduzca por teclado, respectivamente.
		int jugador1, jugador2;
		
		//Imprimimos el mensaje inicial por pantalla, asociando cada opción a un número, y guardando lo que se introduzca en "jugador1."
		System.out.print("Jugador 1, escoja su arma (número): PIEDRA(1), PAPEL(2) o TIJERAS(3): ");
		jugador1 = sc.nextInt();
		
		//Repetimos el proceso.
		System.out.print("Jugador 2, escoja su arma (número): PIEDRA(1), PAPEL(2) o TIJERAS(3): ");
		jugador2 = sc.nextInt();
		
		//Si ambos usuarios elijen lo mismo, hay empate.
		if (jugador1 == jugador2) {
			System.out.print("EMPATE");
		}
		
		//Si el jugador1 elige piedra...
		if(jugador1 == 1) {
			//Y el jugador2 elige papel, gana papel.
			if(jugador2 == 2) {
				System.out.print("1(PIEDRA) PIERDE CONTRA 2(PAPEL). EL JUGADOR 2 GANA.");
			}
			//Y el jugador2 elige tijeras, gana piedra.
			else if (jugador2 == 3) {
				System.out.print("1(PIEDRA) GANA CONTRA 3(TIJERAS). EL JUGADOR 1 GANA.");
			}
		}
		//Si el jugador1 elige papel...
		else if(jugador1 == 2) {
			//Y el jugador2 elige piedra, gana papel.
			if(jugador2 == 1) {
				System.out.print("2(PAPEL) GANA CONTRA 1(PIEDRA). EL JUGADOR 1 GANA.");
			}
			//Y el jugador2 elige tijeras, gana tijeras.
			else if (jugador2 == 3) {
				System.out.print("2(PAPEL) PIERDE CONTRA 3(TIJERAS). EL JUGADOR 2 GANA.");
			}
		}
		//Si el jugador1 elige tijeras...
		else if(jugador1 == 3) {
			//Y el jugador2 elige piedra, gana piedra.
			if(jugador2 == 1) {
				System.out.print("3(TIJERAS) PIERDE CONTRA 1(PIEDRA). EL JUGADOR 1 GANA.");
			}
			//Y el jugador2 elige papel, gana papel.
			else if (jugador2 == 2) {
				System.out.print("3(TIJERAS GANA CONTRA 2(PAPEL). EL JUGADOR 2 GANA.");
			}
		}
		//Cerramos el escáner.
		sc.close();
	}
}
