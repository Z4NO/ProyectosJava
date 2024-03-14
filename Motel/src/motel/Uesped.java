/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;

/**
 *
 * @author Medac
 */
public class Uesped {
    // EL recipcionista tiene un menu
    //Con el 1 inserta uesped
    //Con el 2 n de habitaciones
    //Con el 3 Calcula precio por nombre del huesped (Precio por noche 50)
    //Con el 4 elimina uesped por nombre
    //Con el 5 Busca uesped por nombreç
    //Con el 6 Buscar uesped por n de habitación
    //Con el 7 Salir
    // Uesped(){
    // nombre
    // n de noches
    //      }
    
    private String nombre;
    private int numero_noches;
    private int Numero_habitacion;
    
    Uesped(String nombre, int numero_noches, int i){
        this.nombre = nombre;
        this.numero_noches = numero_noches;
        this.Numero_habitacion = i;
    }
    
    @Override
    public String toString(){
        return "La información de este huesped  es " + nombre + " y su n de noches es " + numero_noches + " y su numero de habitacion es " + Numero_habitacion;
    }
   
    public String getnombre(){
        return nombre;
    }
    
    public int getNumero_habitacion(){
        return Numero_habitacion;
    }
    
    public int getnnumero_noches(){
        return numero_noches;
    }
    
    public void calcularnoches(){
        int num = numero_noches * 50;
        System.out.println("El precio a pagar por "+ nombre + " es de " + num);
    }
    
    
   
    
    
    
    
    
}
