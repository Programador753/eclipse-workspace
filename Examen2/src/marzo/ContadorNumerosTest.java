package marzo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContadorNumerosTest extends ContadorNumeros {

	@Test
	void testMain1() {
		assertEquals("El número inicial tiene que ser menor que el final",ContadorNumeros.contarParesEImpares(6, 1));
	}
	@Test
	void testMain2() {
		assertEquals("Hay más números pares que impares.",ContadorNumeros.contarParesEImpares(2, 6));
	}
	@Test
	void testMain3() {
		assertEquals("Hay más números impares que pares.",ContadorNumeros.contarParesEImpares(1, 3));
	}
	@Test
	void testMain4() {
		assertEquals("Hay la misma cantidad de números pares e impares.",ContadorNumeros.contarParesEImpares(1, 4));
	}
	
}
