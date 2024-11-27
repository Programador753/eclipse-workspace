package letras;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Escribe tu apellido: ");
		String apellido = entrada.nextLine();
		System.out.println( " Tu apellido tiene " + Longitud.numLetras(apellido) + " letras");
	}
}