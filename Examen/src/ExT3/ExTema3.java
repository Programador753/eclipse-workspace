package ExT3;

import java.util.Scanner;

public class ExTema3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer valor de la sucesión
        System.out.print("Ingrese el primer valor de la sucesión: ");
        int primerValor = scanner.nextInt();

        // Solicitar el segundo valor que representa el término de la sucesión
        System.out.print("Ingrese el término de la sucesión: ");
        int termino = scanner.nextInt();

        // Calcular la sucesión y mostrar los términos
        calcularSucesion(primerValor, termino);

        scanner.close();
    }

    private static void calcularSucesion(int primerValor, int termino) {
        System.out.println("Sucesión generada:");
        int terminoActual=0;
        for (int i = 1; i <= termino; i++) {
            terminoActual =terminoActual+i;
            
        }
        System.out.println("Término " + termino + ": " + terminoActual);
    }
}