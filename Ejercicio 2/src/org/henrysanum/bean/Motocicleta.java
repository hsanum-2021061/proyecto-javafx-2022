package org.henrysanum.bean;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 20/03/2022
 * @time 21:47:17
 */
public class Motocicleta {
    
    private int hp;
    private String marca;
    private String chasis;
    private String color;
    private String placa;
    private String modelo;
    private String motor;
    private double octanaje;
    private String cilindraje;
    
   //Constructor nulo

    public Motocicleta() {
        
    }
    
    public Motocicleta(String marca, String modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public Motocicleta(int hp, String marca, String chasis, String color, String placa, String modelo, String motor, double octanaje, String cilindraje) {
        this.hp = hp;
        this.marca = marca;
        this.chasis = chasis;
        this.color = color;
        this.placa = placa;
        this.modelo = modelo;
        this.motor = motor;
        this.octanaje = octanaje;
        this.cilindraje = cilindraje;
    }
    
   
    
     //Getters
    
    public int getHp() {
        return hp;
    }

    public String getMarca() {
        return marca;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotor() {
        return motor;
    }

    public double getOctanaje() {
        return octanaje;
    }

    public String getCilindraje() {
        return cilindraje;
    }
    
    //Setters

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setOctanaje(double octanaje) {
        this.octanaje = octanaje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    public void vender(){
        System.out.println("Vendida");
    }
    
    
}
