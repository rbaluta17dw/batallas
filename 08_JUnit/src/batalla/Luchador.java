package batalla;

import java.util.Scanner;

public class Luchador {
	private String nombre;
	private int fuerza;
	private int vida;
	private int vidamax;
	private int puntosxp;
	private int xpneces;
	private int nivel;
	private int ph;

	public Luchador() {

	}

	public Luchador(String nombre) {
		this.nombre = nombre;
		fuerza = 5;
		vidamax = 5;
		vida = vidamax;
		nivel = 1;
		puntosxp = 0;
		ph = 10;
		mejorarPersonaje();
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

	public int getVidamax() {
		return vidamax;
	}

	public void setVidamax(int vidamax) {
		this.vidamax = vidamax;
	}

	public int getXpneces() {
		return xpneces;
	}

	public void setXpneces(int xpneces) {
		this.xpneces = xpneces;
	}

	public void getInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Fuerza: " + fuerza);
		System.out.println("Vida " + vida + "/" + vidamax);
		System.out.println("Nivel " + nivel);
		System.out.println("Experiencia " + puntosxp + "/" + xpneces);
	}

	public void subirNivel() {
		if (puntosxp >= xpneces) {
			ph = ph + 1;
			mejorarPersonaje();
			vida = vidamax;
		} else {
			System.out.println("Aun no tienes suficiente xp, vuelve cuando tengas mas");
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
				ph = 0;
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
					ph = 0;
				} else {
					System.out.println("Podras subir la vida en el menu de 'MEJORA'");
				}
			}
		}

	}

	int rangoFueEnemigo() {
		int min = fuerza - 3;
		int max = fuerza + 2;
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;

	}

	int rangoVidEnemigo() {
		int min = vida - 2;
		int max = vida + 3;
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;

	}

	public void comenzarLucha() {
		Luchador enem = new Luchador();
		enem.setNombre("Contrincante");
		enem.setFuerza(rangoFueEnemigo());
		enem.setVida(rangoVidEnemigo());
		int ronda = 0;
		while (vida >= 0 || enem.vida >= 0) {
			ronda++;
			System.out.println("Ronda " + ronda);
			System.out.println(nombre + " hace " + fuerza + " daño a " + enem.nombre);
			enem.vida = enem.vida - fuerza;
			System.out.println(enem.nombre + " hace " + enem.fuerza + " daño a " + nombre);
			vida = vida - enem.fuerza;
		}
		if (vida <= 0) {
			System.out.println("¡HAS MUERTO!");
			System.exit(0);
		}
		if (vida > 0) {
			System.out.println("Sales victorioso de la batallas");
			puntosxp = puntosxp + 10;
			System.out.println("Recomendamos que descanses");
		}
	}

	public void descansar() {
		System.out.println("Te sientes descansado, tus puntos de vida vuelven a estar llenos");
		vida = vidamax;
		System.out.println("Tienes " + vida + " vida");
	}
}
