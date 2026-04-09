package src;
import java.util.Arrays;
import java.util.Scanner;

public class Reto2_Anagrama {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         * las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */

        Scanner teclado = new Scanner(System.in);

        // LE PEDIMOS LAS DOS PALABRAS LAS CUALES DEBEMOS COMPROBAR SI SON ANAGRAMAS

        System.out.println("Comprobemos si son anagrama tus palabras:");
        System.out.println("Palabra 1:");
        String palabra1 = teclado.next();
        System.out.println("Palabra 2:");
        String palabra2 = teclado.next();

        System.out.println(esAnagrama( palabra1 , palabra2));
        
    }


    public static boolean esAnagrama(String palabra1, String palabra2) {
    if (palabra1.equalsIgnoreCase(palabra2)) {
        return false;
    }

    char[] letras1 = palabra1.toLowerCase().toCharArray();
    char[] letras2 = palabra2.toLowerCase().toCharArray();

    Arrays.sort(letras1);
    Arrays.sort(letras2);

    return Arrays.equals(letras1, letras2);
}
}
