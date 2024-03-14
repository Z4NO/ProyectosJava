/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fronterizo;

/**
 *
 * @author Medac
 */
public class Personas {
    
    private String nombre;
    private String dni;
    
    
    Personas(String nom, String dni){
        this.nombre = nom;
        this.dni = dni;
    }
    
    @Override
    public String toString(){
        return "La información de estapersona es " + nombre + " y su dni es " + dni;
    }
    
    public String getnombre(){
        return nombre;
    }
    

}
