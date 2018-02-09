package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import batalla.Luchador;
import vista.LuchaMenu;

public class PruebaUnitarias {

	@Test(expected = NumberFormatException.class)
	public void test() throws Exception {
		LuchaMenu test = new LuchaMenu();
		test.lanzarMenu();
	}

	@Test
	public void test2() {
		try {
			LuchaMenu test = new LuchaMenu();
			test.lanzarMenu();
			fail("se esperaba un error");
		} catch (NumberFormatException e) {
			
		}
	}
	
	
}
