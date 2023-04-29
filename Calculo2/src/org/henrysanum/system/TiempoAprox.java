package org.henrysanum.system;

import java.util.Scanner;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 16:03:17
 */
public class TiempoAprox {
    public static void main(String[] args) {
        double kilometros;
        double fin;
        double tiempo = 45;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cuantos Kilometros Recorrio?");
        kilometros = sc.nextDouble();
        fin = kilometros * tiempo;
        System.out.println("Recorrio los siguientes kilometro y llego en: " + fin  + "km/s");
        
        
    }
}
