/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comienxo2_trimestre;

/**
 *
 * @author Medac
 */
public  class GATO extends ANIMAL {
    
     public GATO(){
        int pata = 4;
        nombre = "no name gato";
        
    }

   @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El gato está durmiendo");
    }
   
    
}
