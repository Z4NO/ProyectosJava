/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comienxo2_trimestre;

/**
 *
 * @author Medac
 */
public class Comienxo2_trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PERRO perro1 = new PERRO();
        perro1.comer();
        perro1.dormir();
        GATO gato1 = new GATO();
        gato1.comer();
        gato1.dormir();
        
        
        //POLIFORMISMO
        ANIMAL[] array = {perro1,gato1};
    }   
}
