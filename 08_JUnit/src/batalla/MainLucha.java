package batalla;

import java.util.Scanner;

public class MainLucha {

	public static void main(String[] args) {
		final int LUCHAR = 1;
		final int INFO = 2;
		final int DESCANSAR = 3;
		final int MEJORAR = 4;
		final int SALIR = 5;
		int opcion;
		
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("¿Como se llamara tu luchador?");
		String nombre = scan.nextLine();
		Luchador jugador = new Luchador(nombre);	
		
		
		do{
			System.out.println(LUCHAR + "-Ir a la batalla.");
			System.out.println(INFO + "-Informacion sobre tu personaje.");
			System.out.println(DESCANSAR + "-Descansar y recuperar vida.");
			System.out.println(MEJORAR + "-Mejorar al personaje.");
			System.out.println(SALIR + "-Salir del programa.");
			
			opcion = Integer.parseInt(scan.nextLine());
			jugador.setXpneces(100*jugador.getNivel());
			switch (opcion){
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

		}while (opcion != SALIR);

	}

}
