package org.in5bm.henrysanum.bean;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 29/03/2022
 * @time 07:38:05
 */
public class Reciproco extends Operacion {
    
    public Reciproco(){
    
    }
    
    @Override
    public double operar(){
        setResultado(getNumero1() / getNumero2());
        return getResultado();
    }
    
    @Override
    public double operar(double numero1, double numero2){
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setResultado(getNumero1()/getNumero2());
        return this.getResultado();
        
        
    }

}
