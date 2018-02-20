package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import batalla.*;

public class PruebaUnitarias {
/*
 * 
 * 	@Test(expected = NumberFormatException.class)
	public void test() throws Exception {
		String linea = "test";
		Luchador prueba = new Luchador(linea);
		prueba.mejorarPersonaje();

	}

 */

	@Test
	public void test2() {
		//combinacion correcta es 20,5,20,5
		try {
			Luchador prueba = new Luchador();
			prueba.verPelea(2,5,20,5);
			fail("se esperaba un error");
		} catch (Exception e) {

		}
	}

}
