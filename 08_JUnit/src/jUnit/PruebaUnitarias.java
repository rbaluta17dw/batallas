package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;
import vista.LuchaMenu;

public class PruebaUnitarias {

	@Test(expected = NumberFormatException.class)
	public void test() {
		LuchaMenu test = new LuchaMenu();
		test.lanzarMenu();
	}
	@Test
	public void test2() {
		LuchaMenu test = new LuchaMenu();
		test.lanzarMenu();
	}
}
