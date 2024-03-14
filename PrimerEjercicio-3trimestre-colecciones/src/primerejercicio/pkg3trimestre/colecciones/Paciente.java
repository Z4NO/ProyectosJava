/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primerejercicio.pkg3trimestre.colecciones;

/**
 *
 * @author Medac
 */
public class Paciente implements Comparable <Paciente>{
     static int cont = 0;
     int id;
     String nombre;
     int edad;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cont++;
        
    }
     
     

    @Override
    public int compareTo(Paciente o) {
        return (edad - o.edad);
    }
    
}
