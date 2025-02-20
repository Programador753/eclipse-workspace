package programas;


import java.util.Scanner;

public class adivina {

    public static void main(String[] args) {
        int numeroSecreto = 7;
        int intentos = 0;
        int numeroUsuario;
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Adivina el número secreto!");

        while (intentos < 3) { // Punto de decisión 1
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario == numeroSecreto) { // Punto de decisión 2
                System.out.println("¡Correcto! ¡Has adivinado el número secreto en " + intentos + " intentos!");
                break; // Rompe el bucle while porque el usuario ha adivinado
            }

            // Combinamos las dos condiciones en un solo if-else
            if (numeroUsuario < numeroSecreto) { // Punto de decisión 3
                System.out.println("El número secreto es mayor.");
            } else { // Punto de decisión 4 (else cubre tanto > como !=)
                System.out.println("El número secreto es menor.");
            }
        }

        scanner.close();
    }
}