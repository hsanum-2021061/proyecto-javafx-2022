package org.henrysanum.bean;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 20/03/2022
 * @time 21:31:49
 */
public class Persona {
    
   //Atributos
    
   private String nombre;
   private String apellido;
   private String genero;
   private String ocupacion;
   private int edad;
 

   //Constructores
   
   
   public Persona (){
       
   }
   
   public Persona (String nombre){
       this.nombre = nombre;
   }
   
   public Persona (String nombre, String apellido){
       this.nombre = nombre;
       this.apellido = apellido;
   }
   
   
   //Metodos Setters
   
   
   public void setNombre(String nombre){
       this.nombre = nombre;
   }
   
   public void setApellido(String apellido){
       this.apellido = apellido;
   }
   
   public void setGenero(String genero){
       this.genero = genero;
   }
   
   public void setOcupacion(String ocupacion){
       this.ocupacion = ocupacion;
   }
   
   public void setEdad(int edad){
       this.edad = edad;
   }
   
   
   public void desplegarInformacion() {
       System.out.println("Nombre: " + nombre);
       System.out.println("Apellido: " + apellido);
   }
   
   
   //Metodos Getters
   
   
   public String getNombre() {
       return nombre;    
   }
   
   public String getApellido() {
       return apellido;       
   }
   
   public String getGenero() {
       return genero;
   }
   
   public String getOcupacion() {
       return ocupacion;
   }
   
   public int getEdad() {
       return edad;
   }
    
}
