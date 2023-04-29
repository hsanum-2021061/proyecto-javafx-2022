package org.in5bm.henrysanum.bean;

/**
 *
 * @author Henry Donaldo Sanum Barrios
 * @date 1/04/2022
 * @time 06:23:40
 */
public class RaizCuadrada extends Operacion {
    
    @Override
        public double operar(){
            setOperador('√');
            setResultado( (double) Math.sqrt(getNumero2()));
            return getResultado();
    }
    @Override
        public double operar(double numero1, double numero2){
            setNumero1(numero1);
            setNumero2(numero2);
            setOperador('√');
            setResultado((double)Math.sqrt(getNumero2()));
            return getResultado();
    }

  
}

