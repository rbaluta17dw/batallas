package batalla;

import vista.LuchaMenu;

public class MainLucha {

	public static void main(String[] args) {
		try {
			LuchaMenu menu = new LuchaMenu();
			menu.lanzarMenu();
		} catch (Exception e) {
			System.out.println("Escribe un numero");
		}
	}
}
