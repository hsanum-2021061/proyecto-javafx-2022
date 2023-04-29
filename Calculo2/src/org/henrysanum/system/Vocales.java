package org.henrysanum.system;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 16:40:44
 */
public class Vocales {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una letra");
        char letra = (char) System.in.read();

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'  )  {

        } else {
            System.out.println("No es una vocal");
        }
    }
}

