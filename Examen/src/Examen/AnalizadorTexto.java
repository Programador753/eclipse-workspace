package Examen;

public class AnalizadorTexto {

    public static int analizarCadena(String texto) {
        int rCount = 0, sCount = 0, tCount = 0;
        int i = 0;
        int num=0;
        while (i < texto.length()) {  
        	
            char c = Character.toLowerCase(texto.charAt(i));  // Convertir a minúscula para comparación

            if (c == 'r') {  
                rCount++;
            } else if (c == 's') {  
                sCount++;
            } else if (c == 't') {  
                tCount++;
            }

            i++;  
        }
        
        System.out.println("Cantidad de 'r': " + rCount);
        System.out.println("Cantidad de 's': " + sCount);
        System.out.println("Cantidad de 't': " + tCount);
        num= rCount+sCount+tCount;
        return num;
    }

    public static void main(String[] args) {
        analizarCadena("");  
    }
}