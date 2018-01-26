package batalla;

import java.util.Scanner;

public class MainLucha {

	public static void main(String[] args) {
		final int LUCHAR = 1;
		final int DESCANSAR = 2;
		final int MEJORAR = 3;
		final int SALIR = 4;
		int opcion;
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println(LUCHAR + "-Ir a la batalla.");
			System.out.println(DESCANSAR + "-Descansar y recuperar vida.");
			System.out.println(MEJORAR + "-Mejorar al personaje.");
			System.out.println(SALIR + "-Salir del programa.");
			
			opcion = Integer.parseInt(scan.nextLine());
			
			switch (opcion){
			case LUCHAR:
				break;
			case DESCANSAR:
				break;
			case MEJORAR:
				break;
			case SALIR:
				break;
			default:
				break;
			}

		}while (opcion != 4);

	}

}
