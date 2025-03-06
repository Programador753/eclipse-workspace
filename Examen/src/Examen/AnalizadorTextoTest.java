package Examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnalizadorTextoTest {

	@Test
	void testAnalizarCadena1() {
		assertEquals(3, AnalizadorTexto.analizarCadena("rst"));
	}
	
	@Test
	void testAnalizarCadena2() {
		assertEquals(2, AnalizadorTexto.analizarCadena("rt"));
	}
	
	@Test
	void testAnalizarCadena3() {
		assertEquals(1, AnalizadorTexto.analizarCadena("raaaa"));
	}
	
	@Test
	void testAnalizarCadena4() {
		assertEquals(0, AnalizadorTexto.analizarCadena("aaaa"));
	}
	
	@Test
	void testAnalizarCadena5() {
		assertEquals(4, AnalizadorTexto.analizarCadena("rrst"));
	}

}
