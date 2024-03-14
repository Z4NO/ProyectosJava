/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasy_dam;

/**
 *
 * @author Medac
 */
public class Jugador {
 
    private String Nombre;
    private String Posicion;
    private double  Precio;
    
    
    Jugador(String Nombre, String Posicion, double Precio){
        
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.Precio = Precio;
        
    }
    
    @Override
    public String toString(){
        return "La información de este jugador es. Nombre: " + Nombre + " su posicion es  " + Posicion;
    }
    
    public double getPrecio(){
        return Precio;
    }
    
    public String getPosicion(){
        return Posicion;
    }
    
    public void setPosicion(String pos){
        this.Posicion = pos;
    }
    
    public void setNombre(String pos){
        this.Nombre = pos;
    }
    
    public void setValor(double pos){
        this.Precio = pos;
    }
    
    
}
