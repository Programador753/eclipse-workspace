package debug;

import java.util.Scanner;

public class Ejemplo_debug {

    public static void main(String[] args) {
        binario();
    }

    public static void binario() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese un numero en el sistema decimal positivo:");
            int numero = scanner.nextInt();
            String binario = " ";// para almacenar los restos
            if (numero > 0) { //NUMERO INGRESADO ES MAYOR A CERO
                while (numero > 0) {
                    if (numero % 2 == 0) {//12 es multiplo de dos?...
                        binario = "0" + binario; // si va cero
                    } else {
                        binario = "1" + binario;
                    }
                    numero = numero / 2;    //lo divido por dos
                }
            } else if (numero == 0) {
                binario = "0";
            } else {//NUMERO INGRESADO MENOR A CERO
                binario = "No se pudo convertir el número. Ingrese solo números positivos";
            }
            System.out.println("El numero convertido a binario es: " + binario);
            scanner.close();
        }
    }
}