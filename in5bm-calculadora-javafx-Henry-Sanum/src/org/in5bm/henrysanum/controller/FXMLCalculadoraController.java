package org.in5bm.henrysanum.controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.in5bm.henrysanum.bean.Operacion;
import org.in5bm.henrysanum.bean.Reciproco;
import org.in5bm.henrysanum.bean.Resta;
import org.in5bm.henrysanum.bean.Suma;
import org.in5bm.henrysanum.bean.Multiplicacion;
import org.in5bm.henrysanum.bean.Division;
import org.in5bm.henrysanum.bean.Porcentaje;
import org.in5bm.henrysanum.bean.CambiarSigno;
import org.in5bm.henrysanum.bean.Potencia;
import org.in5bm.henrysanum.bean.RaizCuadrada;



/**
 * FXML Controller class
 *
 * @author UNICOM
 */
public class FXMLCalculadoraController implements Initializable {
    
    
    private double resultado = 0;
    private double numero;
    private int contadorOperadores = 0;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;
    
    
    @FXML
    private Button btnDel;
   
    @FXML
    private Button btnReciproco;
    
    @FXML
    private Button btnCambiarSigno;

    @FXML
    private Button btnCero;

    @FXML
    private Button btnPunto;

    @FXML
    private Button btnIgual;

    @FXML
    private Button btnUno;

    @FXML
    private Button btnDos;

    @FXML
    private Button btnTres;

    @FXML
    private Button btnSuma;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnPorcentaje;

    @FXML
    private Button btnDivision;

    @FXML
    private Button btnSiete;

    @FXML
    private Button btnCuatro;

    @FXML
    private Button btnCinco;

    @FXML
    private Button btnOcho;

    @FXML
    private Button btnNueve;

    @FXML
    private Button btnSeis;

    @FXML
    private Button btnMultiplicacion;

    @FXML
    private Button btnResta;

    @FXML
    private Label lblPantalla;
    
    @FXML
    private Button btnRaizCuadrada;
    
    @FXML
    private Button btnPotencia;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void clicUno(){
       actualizarPantalla("1");
    }
    
    @FXML
    private void clicDos(){
        actualizarPantalla("2");
    }
    
    @FXML
    private void clicTres(){
         actualizarPantalla("3");
    }
    
    @FXML
    private void clicCuatro(){
        actualizarPantalla("4");
    }
    
    @FXML
    private void clicCinco(){
        actualizarPantalla("5");
    }
    
    @FXML
    private void clicSeis(){
        actualizarPantalla("6");
    }
    
    @FXML
    private void clicSiete(){
        actualizarPantalla("7");
    }
    
    @FXML
    private void clicOcho(){
        actualizarPantalla("8");
    }
    
    @FXML
    private void clicNueve(){
        actualizarPantalla("9");
    }
    
    @FXML
    private void clicCambiarSigno(){
        contadorOperadores++;
        operadorAnterior = "+/-";
        ingresoNuevo=false;
        calcular("");
    }
    
    @FXML
    private void clicCero(){        
        if(lblPantalla.getText().equals("")){
            actualizarPantalla("0");
        }else if(!(lblPantalla.getText().charAt(0)=='0')){
            actualizarPantalla("0");
        }
    }
    
    @FXML
    private void clicPunto(){
          agregarPunto();

    }
    
    public void agregarPunto(){
        
        if (ingresoNuevo){
            lblPantalla.setText("");
        }
        
        String cadena = lblPantalla.getText();
        
        if (cadena.length()<= 0){
            lblPantalla.setText("0.");
            ingresoNuevo = false;
        }else if (!(lblPantalla.getText().contains("."))){
            actualizarPantalla(".");
        }
        
    }
    
    @FXML
    private void clicIgual(){
        calcular(this.operadorAnterior);
        lblPantalla.setText(String.valueOf(this.resultado));

    }
    
    @FXML
    private void clicSuma(){
        calcular("+");
    }
    
    @FXML
    private void clicResta(){
        calcular("-");
    }
    
    @FXML
    private void clicMultiplicacion(){
        calcular("*");
    }
    
    @FXML
    private void clicDivision(){
        calcular("/");
    }
    
    @FXML
    private void clicPorcentaje(){
        calcular("%");
    }
    
    @FXML
    private void clicRaizCuadrada(){
        contadorOperadores++;
        resultado = 1; 
        operadorAnterior = "√";
        calcular ("");
        ingresoNuevo  = false;
    }
    
    
    @FXML
    private void clicReciproco(){
        contadorOperadores++;
        operadorAnterior = "1/x";
        ingresoNuevo=false;
        calcular("");
    }
    
    @FXML
    private void clicLimpiar(){
        limpiar();
       
    }
    
    @FXML
    private void clicPotencia(){
        contadorOperadores++;
        resultado = 1; 
        operadorAnterior = "x²";
        calcular ("");
        ingresoNuevo  = false;
    }
    
    @FXML
    private void clicDel(){
        
        String cadena;
        cadena=lblPantalla.getText();
        if(cadena.length()>0){
            cadena=cadena.substring(0, cadena.length()-1);
            lblPantalla.setText(cadena);
        }
    }
    
    @FXML
    private void limpiar(){
        lblPantalla.setText("");
        this.numero = 0.0; 
        this.resultado = 0.0; 
        this.contadorOperadores = 0;
        this.operadorAnterior = " ";
        contadorOperadores = 0;
        ingresoNuevo = false;
    }
    
    public void actualizarPantalla(String digito){
        
        if (ingresoNuevo){
            lblPantalla.setText("");
        }
        
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo = false;
    }
    
    public void limpiarPantalla(){
        lblPantalla.setText("");
    }
    
    
    private void calcular(String operador){
        
        System.out.println("\ncalcular ()");
        System.out.println("operador actual: " + operador);
        System.out.println("lblPantalla.getText(): "  + lblPantalla.getText());
        
        if(!(lblPantalla.getText().equals(""))){
            
           System.out.println("dentro del primer if");
            
           String strPantalla = lblPantalla.getText();
           
           System.out.println("ingreso nuevo: " + ingresoNuevo);
           
           if(ingresoNuevo == false){ 
               
               System.out.println("dentro del segundo if");
               
               this.numero = Double.parseDouble(strPantalla);
               
               System.out.println("numero: " + numero);
               
               contadorOperadores++;
               
               System.out.println("contadorOperadores: " + contadorOperadores);
               
               if(contadorOperadores == 1){
                   this.resultado = numero;
               }else if (contadorOperadores >= 2){
                   
                  System.out.println("if del switch");
                   Operacion calc = null;
                   switch(this.operadorAnterior){
                       case "+":
                            calc = new Suma();
                            resultado = calc.operar(resultado, numero);
                           break;
                        case "-":
                            calc = new Resta();
                            resultado = calc.operar(resultado, numero);
                           break;
                        case "*":
                            calc = new Multiplicacion();
                            resultado = calc.operar(resultado, numero);
                           break;
                        case "/":
                           calc = new Division();
                           resultado = calc.operar(resultado, numero);
                           break;
                        case "%":
                           calc = new Porcentaje();
                           resultado = calc.operar(resultado, numero);
                           break;
                        case "1/x":
                           calc = new Reciproco();
                           resultado = calc.operar(1, numero);
                           break;
                        case "+/-":
                           calc = new CambiarSigno();
                           resultado = calc.operar(numero, -1f);
                           break;
                        case "√":
                           calc = new RaizCuadrada();
                           resultado = calc.operar(1, numero);
                           break;
                        case "x²":
                           calc = new Potencia();
                           resultado = calc.operar(numero, 2f);
                           break;
                   
                   }
                   System.out.println("resultado: " + this.resultado);
                   lblPantalla.setText(String.valueOf(this.resultado));
               
               }
           
           }
           this.operadorAnterior = operador;
        }
        ingresoNuevo = true;
      
    }
    @FXML
    private void cerrar(){
        System.exit(0);
    }


}
