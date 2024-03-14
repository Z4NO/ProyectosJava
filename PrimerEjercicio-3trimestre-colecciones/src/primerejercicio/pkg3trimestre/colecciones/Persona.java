/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerejercicio.pkg3trimestre.colecciones;

/**
 *
 * @author Medac
 */
public class Persona implements Comparable <Persona>{
    String Nombre;
    int edad;

    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", edad=" + edad + '}';
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   
    @Override
    public int compareTo(Persona p) {
        return ( edad -p.edad);
    }
    
    
    
}
