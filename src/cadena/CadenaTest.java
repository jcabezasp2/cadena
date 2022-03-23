package cadena;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CadenaTest {

	String cadena1 = "abcd";
	String cadena2 = "bbbbb";
	String cadena3 = "aaaaa";
	String cadena4 = "";
	String cadena5 = "Peña";
	String cadena6 = "1551";
	String cadena7 = "àbcd";
	Cadena cadena = new Cadena();
	
	@Test
	void testLongitudBasico() {
	
		Assertions.assertEquals(4, cadena.longitud(cadena1));
	}
	
	@Test
	void testLongitudConCadenaVacia() {
	
		Assertions.assertEquals(0, cadena.longitud(cadena4));
	}

	@Test
	void testLongitudConN() {
	
		Assertions.assertEquals(4, cadena.longitud(cadena5));
	}

	@Test
	void testLongitudConNumeros() {
	
		Assertions.assertEquals(4, cadena.longitud(cadena6));
	}
	
	@Test
	void testVocalesBasico() {
	
		Assertions.assertEquals(1, cadena.vocales(cadena1));
	}
	
	@Test
	void testVocalesCadenaVacia() {
	
		Assertions.assertEquals(0, cadena.vocales(cadena4));
	}
	
	@Test
	void testVocalesConN() {
	
		Assertions.assertEquals(2, cadena.vocales(cadena5));
	}
	
	@Test
	void testVocalesConAcento() {
	
		Assertions.assertEquals(1, cadena.vocales(cadena7));
	}
	

	@Test
	void testInvertirBasico() {
	
		Assertions.assertEquals("dcba", cadena.invertir(cadena1));
	}
	
	@Test
	void testInvertirCapicua() {
	
		Assertions.assertEquals("1551", cadena.invertir(cadena6));
	}
	
	@Test
	void testInvertirCadenaVacia() {
	
		Assertions.assertEquals("", cadena.invertir(cadena4));
	}
	
	@Test
	void testinvertirConN() {
	
		Assertions.assertEquals("añeP", cadena.invertir(cadena5));
	}
	

	@Test
	void testContarLetraBasico() {
	
		Assertions.assertEquals(1, cadena.contarLetra(cadena1, 'c'));
	}
	
	@Test
	void testContarLetraCadenaVacia() {
	
		Assertions.assertEquals(0, cadena.contarLetra(cadena4, 'a'));
	}
	@Test
	void testContarLetraConN() {
	
		Assertions.assertEquals(1, cadena.contarLetra(cadena5, 'ñ'));
	}
	
	@Test
	void testContarLetraConAcento() {
	
		Assertions.assertEquals(1, cadena.contarLetra(cadena7, 'à'));
	}
}
