package vista;

import java.util.Scanner;

import batalla.Luchador;

public class LuchaMenu {
	final int LUCHAR = 1;
	final int INFO = 2;
	final int DESCANSAR = 3;
	final int MEJORAR = 4;
	final int SALIR = 5;

	public void lanzarMenu() throws NumberFormatException{
		Scanner scan = new Scanner(System.in);

		Luchador jugador = Luchador.crearLuchador();
		int opcion;
		do {

			System.out.println(LUCHAR + "-Ir a la batalla.");
			System.out.println(INFO + "-Informacion sobre tu personaje.");
			System.out.println(DESCANSAR + "-Descansar y recuperar vida.");
			System.out.println(MEJORAR + "-Mejorar al personaje.");
			System.out.println(SALIR + "-Salir del programa.");

			opcion = Integer.parseInt(scan.nextLine());
			jugador.setXpneces(100 * jugador.getNivel());
			switch (opcion) {
			case LUCHAR:
				jugador.comenzarLucha();
				break;
			case INFO:
				jugador.getInfo();
				break;
			case DESCANSAR:
				jugador.descansar();
				jugador.subirNivel();
				break;
			case MEJORAR:
				jugador.mejorarPersonaje();
				break;
			case SALIR:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion mal...");
				break;
			}

		} while (opcion != SALIR);
	}
}
