package marzo;

import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número inicial: ");
        int inicio = scanner.nextInt();
        
        System.out.print("Ingresa un número final: ");
        int fin = scanner.nextInt();
        
        System.out.print(contarParesEImpares(inicio, fin));
        
        scanner.close();
    }
    
    public static String contarParesEImpares(int inicio, int fin) {
        int pares = 0, impares = 0;  
        String res="";
        for (int i = inicio; i <= fin; i++) {
        	if (i % 2 == 0) {
            pares++;
         } else {
             impares++;
                }
         }  
         if (fin < inicio) {
             res="El número inicial tiene que ser menor que el final";
         } else if (pares > impares) {
             res="Hay más números pares que impares.";
         } else if (impares > pares) {
             res="Hay más números impares que pares.";
         } else {
             res="Hay la misma cantidad de números pares e impares.";
         }
         return res;
    }
}