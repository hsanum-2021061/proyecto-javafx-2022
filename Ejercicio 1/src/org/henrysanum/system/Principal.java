package org.henrysanum.system;
import org.henrysanum.bean.Persona;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 20/03/2022
 * @time 21:31:21
 */
public class Principal {
    public static void main(String[] args) {
         // Instanciar la Clase
        
        Persona p1 = new Persona("Valentina", "Sifuentes");
        //Persona p1 = new  Persona();
        //p1.desplegarInformacion();
        //p1.nombre = "Valentina"; 
        //p1.apellido = "Sifuentes"; 
        //p1.ocupacion = "Estudiante"; 
        //p1.genero = "Femenino"; 
        //p1.edad = 16; 
        
        //System.out.println(p1.apellido);
        //System.out.println(p1.ocupacion);
        //System.out.println(p1.genero);
        //System.out.println(p1.edad);
        
        //p1.setNombre("Valentina");
        //p1.setApellido("Sifuentes"); 
        p1.setOcupacion("Estudiante");
        p1.setGenero("Femenino");
        p1.setEdad(17);
        
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Apellido: " + p1.getApellido());
        System.out.println("Ocupacion: " + p1.getOcupacion());
        System.out.println("Genero: " + p1.getGenero());
        System.out.println("Edad: " + p1.getEdad());
    }
}
