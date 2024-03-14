/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_corriente;

/**
 *
 * @author Medac
 */
public class Persona {
    
    String nombre;
    int edad;
    String dni;
    String email;
    
    /*
    Persona(){
        System.out.println("Has creado una persona");
    }
    
    Persona(String nom, int e){
        this.nombre = nom;
        this.edad = e;
    }
    
    public void saludar() {
        System.out.println("Hola que tal " +  nombre);
    }
    public void comer(){
        System.out.println("Estas comiendo " +  nombre);
    }
    
    public void incrementar(int e){
        edad = this.edad + e;
        System.out.println("Ahora " + nombre + " tiene " + edad + " años");
    
    }
   */ 
    
    Persona(String nombre, int e, String dni){
        this.nombre = nombre;
        this.edad = e;
        this.dni = dni;
        
    }
    
    boolean mayoredad(){
        boolean respuesta;
        
        if( edad < 18){
            respuesta = false;
        }else{
            respuesta = true;
        }
        return respuesta;
    }
    
    public void mostrar(String a, int e, String o){
        
        nombre = a;
        edad = e;
        dni = o;
        System.out.println("EL nombre de esta persona es " + nombre);
        System.out.println("La edad de esta persona es " + edad);
        System.out.println("EL DNI de esta persona es " + dni);
        
    }
}

