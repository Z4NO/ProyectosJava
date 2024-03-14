/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonaciador_digital;

/**
 *
 * @author Medac
 */
public class SintonizadorFM {
    /* metodo para subir la frecuencia o.5 megahercio y otro para bajar
    y un display para mostrar la frecuencia actual
    solo puede ir desde 80 MHZ hasta 108MHZ
    si durante una operacion de subida o baja se pasa de bajado o subida la frecuencia pasa a ser del polo opuesto*/
    
    private double frecuencia ;
    
    
    SintonizadorFM(){
       this.frecuencia = 80.0; 
    }
    SintonizadorFM(double fr){
        this.frecuencia = fr;
    }
    
    public void subir(){
        if((frecuencia + 0.5) <= 108){
            this.frecuencia = frecuencia +0.5;
            System.out.println("La frecuencia ha sido aumentda a " + frecuencia);
        }else if(frecuencia + 0.5 > 108){
            this.frecuencia = 80;
            System.out.println("Te has pasado de recuencia, ahora se ha ajsutado a la mínima la cual es 80");
        }
    }
    
    public void disminuir(){
        if((frecuencia - 0.5) < 80){
            this.frecuencia = 108;
            System.out.println("Has disminuido de más ahora la frecuencia es la máxima  que es 108");
        }else if((frecuencia -0.5 >= 80)){
            this.frecuencia = frecuencia - 0.5;
            System.out.println("La frecuencia ha sido re ajustada a "+ frecuencia);
        }
    }
    
    public void mostrar(){
        System.out.println("La frecuencia es " + frecuencia);
    }
}
