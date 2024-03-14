/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

import java.util.Scanner;
import java.util.Arrays;
public class Personas {
    
    private String nombre;
    private boolean asesino;
    private String donde_estaba;
    
    String [] funciones = {"Entrada","Dormitorio","Jardin","Cocina","Salón","Baño"};
    
    @Override
    public String toString(){
        return "Mi posicióne es "+ donde_estaba;
    }
    
    Personas(String nombre){
        this.nombre = nombre;
        this.asesino = false;
    }
    
    public void setAsesino(Personas [] array_personas){
        int  pos = (int)(Math.random()*(array_personas.length+1));
        array_personas[pos].asesino = true;
        System.out.println("El asesino es " + array_personas[pos]);
    }
    
    public boolean guetAsesino(){
        return asesino;
    }
    
    public void getLugar(){
        if(asesino == false){
            System.out.println("Yo estaba en " + donde_estaba);
        }else{
          int  pos2 = (int)(Math.random()*(funciones.length+1));
            System.out.println("Yo estaba en " + funciones[pos2]);
        }
    }
      
    public void setLugar(Personas [] array_personas){
        int i = 0;
        int  po2 = (int)(Math.random()*(array_personas.length+1));
        do{
            
        }while((po2 != null) && (i < 1));
    }
}
