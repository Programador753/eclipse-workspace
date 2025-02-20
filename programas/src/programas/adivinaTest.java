package programas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class adivinaTest {

    private String ejecutarProgramaConEntrada(String entrada) {
        // Simular la entrada del usuario
        ByteArrayInputStream in = new ByteArrayInputStream(entrada.getBytes());
        System.setIn(in);

        // Capturar la salida del programa
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Ejecutar el programa
        adivina.main(new String[]{});

        // Restaurar entrada y salida estándar
        System.setIn(System.in);
        System.setOut(System.out);

        return out.toString(); // Retornar la salida del programa
    }

    @Test
    void testAdivinaEnPrimerIntento() {
        String salida = ejecutarProgramaConEntrada("7\n");
        assertTrue(salida.contains("¡Correcto! ¡Has adivinado el número secreto en 1 intentos!"));
    }

    @Test
    void testAdivinaEnUltimoIntento() {
        String salida = ejecutarProgramaConEntrada("5\n6\n7\n");
        assertTrue(salida.contains("¡Correcto! ¡Has adivinado el número secreto en 3 intentos!"));
    }

    @Test
    void testNoAdivinaNumero() {
        String salida = ejecutarProgramaConEntrada("5\n6\n8\n");
        assertTrue(salida.contains("El número secreto es mayor."));
        assertTrue(salida.contains("El número secreto es menor."));
    }

    @Test
    void testNumeroMenor() {
        String salida = ejecutarProgramaConEntrada("3\n");
        assertTrue(salida.contains("El número secreto es mayor."));
    }

    @Test
    void testNumeroMayor() {
        String salida = ejecutarProgramaConEntrada("9\n");
        assertTrue(salida.contains("El número secreto es menor."));
    }
}
