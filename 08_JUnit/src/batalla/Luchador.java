package batalla;

import java.util.Scanner;

public class Luchador {
	private String nombre;
	private int fuerza;
	private int vida;
	private int puntosxp;
	private int nivel;
	private int ph;

	public Luchador(String nombre, int fuerza, int vida) {
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.vida = vida;
		fuerza = 5;
		vida = 5;
		nivel = 1;
		puntosxp = 0;
		ph = 10;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getPuntosxp() {
		return puntosxp;
	}

	public void setPuntosxp(int puntosxp) {
		this.puntosxp = puntosxp;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getPh() {
		return ph;
	}

	public void setPh(int ph) {
		this.ph = ph;
	}

	public void subirNivel() {
		if (puntosxp == (100 * nivel)) {
			ph = ph + 1;
			mejorarPersonaje();
		}
	}

	public void mejorarPersonaje() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Puedes subir un atributo");
		System.out.println("Tienes " + ph + " puntos de habilidad");
		System.out.println("¿Cuantos puntos quieres subir a la fuerza?");
		int puntos;
		String resp;
		puntos = scan.nextInt();
		if ((ph - puntos) >= 0) {
			ph = ph - puntos;
			fuerza = fuerza + puntos;
		} else {
			System.out.println("No tienes puntos suficientes");
			System.out.println("Todos tus puntos se van a redirigir a tu fuerza (y/n");
			resp = scan.nextLine();
			if (resp.equalsIgnoreCase("y")) {
				fuerza = fuerza + ph;
			} else {
				System.out.println("Podras subir la fuerza en el menu de 'MEJORA'");
			}
			System.out.println("¿Cuantos puntos quieres subir a la vida?");
			puntos = scan.nextInt();
			if ((ph - puntos) >= 0) {
				ph = ph - puntos;
				vida = vida + puntos;
			} else {
				System.out.println("No tienes puntos suficientes");
				System.out.println("Todos tus puntos se van a redirigir a tu vida (y/n");
				resp = scan.nextLine();
				if (resp.equalsIgnoreCase("y")) {
					vida = vida + ph;
				} else {
					System.out.println("Podras subir la vida en el menu de 'MEJORA'");
				}
			}
		}

	}

	public void comenzarLucha() {

	}

}
