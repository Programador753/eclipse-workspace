package Ej24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EjJUnitTest {

   
    @Test
    void testMetodo() {
        assertEquals ("Acertaste a la primera. 5 puntos", EjJUnit.metodo(2,3,2));
    }
    @Test
    void testMetodo2() {
        assertEquals ("Acertaste a la segunda. 5 puntos", EjJUnit.metodo(2,3,3));
    }
    @Test
    void testMetodo3() {
        assertEquals ("Tuviste suerte. Fallaste, pero no restas", EjJUnit.metodo(2,3,5));
    }
   
    @Test
    void testMetodo4() {
        assertEquals ("Fallaste. -1 puntos", EjJUnit.metodo(2,3,6));
    }
}