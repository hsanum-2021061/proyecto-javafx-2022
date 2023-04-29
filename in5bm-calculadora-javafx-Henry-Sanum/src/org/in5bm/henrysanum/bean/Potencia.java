package org.in5bm.henrysanum.bean;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 07:19:20
 */
public class Potencia extends Operacion{
    @Override
    public double operar(){
       setResultado((double)Math.pow(getNumero1(),getNumero2()));
       return getResultado();
    }

    @Override
    public double operar (double numero1, double numero2) {
        setNumero1(numero1);
        setNumero2 (numero2);
        setResultado((double) Math.pow (getNumero1(), getNumero2()));
        return getResultado();
    }
}

    
    
