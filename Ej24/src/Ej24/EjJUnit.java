package Ej24;

import java.util.Scanner;

public class EjJUnit {
   public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Intenta adivinar el número, del 1 al 10.Tienes dos oportunidades. Si aciertas tendrás 5 puntos, si fallas se te restarán puntos ");
       System.out.print("Indica tu primer número: ");
int numero1 = scanner.nextInt();
System.out.print("Indica tu segundo número: ");
int numero2 = scanner.nextInt();

int numSecreto = (int) (Math.random() * 10) + 1;

System.out.println(metodo(numero1, numero2, numSecreto));

   }
   
   public static String metodo(int a, int b, int c) {
       
       String res="Tuviste suerte. Fallaste, pero no restas";
       int dif1 = Math.abs(a+b-c) ;
       int negativos = 0;
       while(dif1 > 0) {
           negativos=negativos+dif1;
           dif1--;
           res = "Fallaste. -" + negativos + " puntos";
       }
       if(a == c) {
           dif1=0;
           res = "Acertaste a la primera. 5 puntos";
       }
       if(b == c) {
           dif1=0;
           res = "Acertaste a la segunda. 5 puntos";
       }
       

       return res;
   }
}
