package batalla;

import vista.LuchaMenu;

public class MainLucha {

	public static void main(String[] args) {

		try {
			LuchaMenu.luchaMenu();
		} catch (Exception e) {
			System.out.println("Por favor introduce un numero en el menu (el programa se reiniciara)");
			LuchaMenu.luchaMenu();
		}

	}

}
