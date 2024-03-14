/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comienxo2_trimestre;

/**
 *
 * @author Medac
 */
public class PERRO extends ANIMAL {
    public PERRO(){
        int pata = 4;
        nombre = "no name";
        
    }
    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro está durmiendo");
    }
    
}
