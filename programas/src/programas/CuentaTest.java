package programas;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testGetSaldo() {
		Cuenta cuenta1 = new Cuenta ("ES21099865462528660871295", 100);
		float saldo = cuenta1.getSaldo();
		assertEquals(100,saldo);
	}

	@Test
	void testSetSaldo() {
		fail("Not yet implemented");
	}

	@Test
	void testIngresarDinero() {
		fail("Not yet implemented");
	}

	@Test
	void testExtraerDinero() {
		fail("Not yet implemented");
	}

}
