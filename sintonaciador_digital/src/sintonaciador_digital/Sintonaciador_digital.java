/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonaciador_digital;

/**
 *
 * @author Medac
 */
public class Sintonaciador_digital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM frecuencia1 = new SintonizadorFM();
        frecuencia1.subir();
        
        SintonizadorFM frecuencia2 = new SintonizadorFM(107.5);
        frecuencia2.subir();
        frecuencia2.subir();
        frecuencia2.mostrar();
        frecuencia2.disminuir();
        frecuencia2.mostrar();
    }
    
}
