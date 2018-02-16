package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import batalla.*;

public class PruebaUnitarias {

	@Test(expected = NumberFormatException.class)
	public void test() throws Exception {
		String linea = "test";
		Luchador prueba = new Luchador(linea);
		prueba.mejorarPersonaje();

	}

	@Test
	public void test2() {
		try {
			String linea = "test";
			Luchador prueba = new Luchador(linea);
			prueba.verPelea(9,9,9,9);
			fail("se esperaba un error");
		} catch (Exception e) {

		}
	}

}
