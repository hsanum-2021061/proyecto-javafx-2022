package org.in5bm.henrysanum.bean;

/**
 *
 * @author informatica
 */
public class CambiarSigno extends Operacion {
    @Override
    public double operar(){
        setResultado(getNumero1() *-1);
        return getResultado();
    }
    
    
    @Override
    public double operar(double numero1, double numero2){
        setNumero1(numero1);
        setNumero2(numero2);
        setResultado(getNumero1() * getNumero2());
        return getResultado();
    }
}
