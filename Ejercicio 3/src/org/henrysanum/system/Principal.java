package org.henrysanum.system;
import org.henrysanum.bean.Triangulo;


/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 21/03/2022
 * @time 19:17:15
 */
public class Principal {
    
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        triangulo.capturarBase();
        triangulo.capturarAltura();
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        triangulo.mostrarResultados();
    }
}
