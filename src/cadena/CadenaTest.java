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
	String cadena5 = "aña";
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
	
		Assertions.assertEquals(3, cadena.longitud(cadena5));
	}

	@Test
	void testLongitudConNumeros() {
	
		Assertions.assertEquals(4, cadena.longitud(cadena6));
	}
	
	@Test
	void testVocalesBasico() {
	
		Assertions.assertEquals(1, cadena.longitud(cadena1));
	}
	
	@Test
	void testVocalesCadenaVacia() {
	
		Assertions.assertEquals(0, cadena.longitud(cadena4));
	}
	
	@Test
	void testVocalesConN() {
	
		Assertions.assertEquals(2, cadena.longitud(cadena5));
	}
	
	@Test
	void testVocalesConAcento() {
	
		Assertions.assertEquals(2, cadena.longitud(cadena7));
	}
}
