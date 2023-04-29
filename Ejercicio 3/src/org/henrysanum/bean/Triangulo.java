package org.henrysanum.bean;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 21/03/2022
 * @time 19:20:10
 */
public class Triangulo {
    
    //Atributos
    private double base;
    private double altura;
    private double lado;
    private double area;
    private double perimetro;
    private Scanner sc;
    
    //Metodos Constructores
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
        this.lado = 0;
        this.area = 0;
        this.perimetro = 0;
        sc = new Scanner (System.in);
    }
    
    public double capturarBase(){
        //System.out.println("Ingrese la base del triangulo: ");
        //this.base = sc.nextDouble();
        this.base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo: "));
        return this.base;
    }
    
    public double capturarAltura() {
        //System.out.println("Ingrese la altura del triangulo: ");
        //this.altura = sc. nextDouble();
        this.altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo: "));
        return this.altura;
    }
    
    public double calcularArea() {
        this.area = (this.base * this.altura) / 2;
        return this.area;
    }
    
    public double calcularPerimetro(){
        this.perimetro = this.base * 3;
        return this.perimetro;
    }
    
    public void mostrarResultados () {
        //System.out.printf("El área del triangulo es: %.2f y del perimetro es: %.2f  \n" , area, perimetro);
        JOptionPane.showMessageDialog(null, "El area del triangulo es: " + this.area);
        JOptionPane.showMessageDialog(null, "El perimetro del triangulo es: " + this.perimetro);
    }
    
}
