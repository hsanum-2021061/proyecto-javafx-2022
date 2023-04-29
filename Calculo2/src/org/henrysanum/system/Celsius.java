package org.henrysanum.system;
import java.util.Scanner;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 16:25:33
 */
public class Celsius {
    public static void main(String[] args) {
        float gdcelsius;
        float gdfarenheit;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un numero ");
        gdcelsius = sc.nextFloat();
        gdfarenheit = (gdcelsius * 9/5) + 31;
        System.out.print("Su numero se convirtio a Grados farenheit, el resultado es: " + gdfarenheit);
        
    }
}
