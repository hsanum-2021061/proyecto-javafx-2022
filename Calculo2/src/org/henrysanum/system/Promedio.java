package org.henrysanum.system;

import java.util.Scanner;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 16:14:28
 */
public class Promedio {
    public static void main(String[] args) {
        int calfic1;
        int calfic2;
        int calfic3;
        int prom;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Primera Nota, Primer alumno");
        calfic1 = sc.nextInt();
        System.out.println("Segunda Nota, Segundo Alumno");
        calfic2 = sc.nextInt();
        System.out.println("Tercera Nota, Tercer Alumno");
        calfic3 = sc.nextInt();
        
        prom = (calfic1 + calfic2 + calfic3)/3;
        System.out.println("Promedio de las 3 notas es " + prom);
    }
}
