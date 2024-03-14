/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_daniel_lozano;

/**
 *
 * @author Medac
 */
public class ExceptionNonumero  extends Exception {
    public ExceptionNonumero(){
        super("Debes introducir un numero no una letra");
    }
}
