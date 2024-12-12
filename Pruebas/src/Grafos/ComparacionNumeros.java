package Grafos;

import java.util.Scanner;

public class ComparacionNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inicio del programa"); // 1 nodo inicial

        System.out.print("Ingrese el valor de A: "); // 2 nodo inicial
        int A = scanner.nextInt();

        System.out.print("Ingrese el valor de B: "); // 3 nodo inicial
        int B = scanner.nextInt();

        if (A > B) // Nodo 4 A es mayor que B
        {
            System.out.println("A es mayor que B"); // 5 nodo final
        } else if (A < B) // Nodo 6 A es menor que B
        {

            if (B % 2 == 0) // Nodo 7 B es par
            {
                System.out.println("B es mayor que A y es un número par"); // 8 nodo final
            }

            else {
                System.out.println("B es mayor que A y es un número impar"); // 9
            }
        } else {
            System.out.println("A y B son iguales"); // 10
        }
        
        if ((A + B) > 100) 
        {
            System.out.println("La suma de A y B es mayor que 100");
        }
        else
        {
            System.out.println("La suma de A y B es menor o igual que 100");
        }
        System.out.println("Fin del programa"); // 11
    }
}