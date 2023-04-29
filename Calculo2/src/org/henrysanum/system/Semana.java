package org.henrysanum.system;
import java.util.Scanner;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 16:32:11
 */
public class Semana {
    public static void main(String[] args) {
        int dia;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("El programa te devuelve el día de la semana seleccionando:");
        System.out.println("1.- Lunes. Laboral");
        System.out.println("2.- Martes. Laboral");
        System.out.println("3.- Miércoles. Laboral");
        System.out.println("4.- Jueves. Laboral");
        System.out.println("5.- Viernes. Laboral");
        System.out.println("6.- Sábado. No Laboral");
        System.out.println("7.- Domingo. No Laboral");
        dia = scanner.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("El día seleccionado es LUNES");
                break;
            case 2:
                System.out.println("El día seleccionado es MARTES");
                break;
            case 3:
                System.out.println("El día seleccionado es MIÉRCOLES");
                break;
            case 4:
                System.out.println("El día seleccionado es JUEVES");
                break;
            case 5:
                System.out.println("El día seleccionado es VIERNES");
                break;
            case 6:
                System.out.println("El día seleccionado es SÁBADO");
                break;
            case 7:
                System.out.println("El día seleccionado es DOMINGO");
                break;
                default:
                System.out.println("ERROR: número incorrecto.");
    }
        }
    
}
