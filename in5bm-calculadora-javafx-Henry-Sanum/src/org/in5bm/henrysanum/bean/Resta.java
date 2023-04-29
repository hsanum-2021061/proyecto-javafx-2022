package org.in5bm.henrysanum.bean;

/**
 *
 * @author informatica
 */
public class Resta extends Operacion {
     
    @Override
    public double operar(){
        setOperador('-');
        setResultado(getNumero1() - getNumero2());
        return getResultado();
    }
    
    
    @Override
    public double operar(double numero1, double numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('-');
        setResultado(getNumero1() - getNumero2());
        return getResultado();
    }
    
}