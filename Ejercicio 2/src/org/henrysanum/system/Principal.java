package org.henrysanum.system;

import org.henrysanum.bean.Motocicleta;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 20/03/2022
 * @time 21:44:38
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Motocicleta miMoto = new Motocicleta("Suzuki", "Katana", "Negro");
        System.out.println(miMoto.getModelo());
        miMoto.vender();
    }
}
