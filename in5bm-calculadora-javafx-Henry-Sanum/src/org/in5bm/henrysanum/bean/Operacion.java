package org.in5bm.henrysanum.bean;


/**
 *
 * @author Henry Donaldo Sanum Barrios
 */
public abstract class Operacion {
    
    private double numero1;
    private double numero2;
    private double resultado;
    private char operador;
    
    //CONSTRUCTORES
    
    //Constructor Nulo
    public Operacion (){    
    }
    
    //Constructor con parametros
    public Operacion(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2; 
    }
    
    //Metodos Getters and Setters
    public double getNumero1(){
        return numero1;
    }
    
    public void setNumero1(double numero1){
        this.numero1 = numero1;
    }
    
    public double getNumero2(){
        return numero2;
    }
    
    public void setNumero2(double numero2){
        this.numero2 = numero2;
    }
    
    public double getResultado (){
     return resultado;
    }
    
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    
    public char getOperador(){
        return operador;
    }
    
    public void setOperador(char operador){
        this.operador = operador;
    }
    
    public abstract double operar();
        
    public abstract double operar(double numero1, double numero2);


 
}
