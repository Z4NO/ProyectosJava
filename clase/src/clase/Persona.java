/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;

import java.util.Scanner;
import java.util.Arrays;

public class Persona {
    protected  String nombre;
    protected double [] notas;
    boolean suspenso = false;

    public Persona(String nombre) {
        this.nombre = nombre;
        notas = new double[6];
    }
    
    public void InsertarNotas(){
        Scanner sc = new Scanner(System.in);
        String [] nombres = {"Programación","Sistemas","Base de datos","Lenguaje de Marcas","Entorno","Fol"};
        for(int i = 0; i < notas.length;i++){
            System.out.println("Cual es la nota de de "+nombres[i]);
            notas[i] = sc.nextDouble();
        }
    }
    
    public void estaAprobado(){
        for(int i = 0; i <notas.length;i++){
            if(notas[i] < 5){
                suspenso = true;
            }
        }
        if(suspenso == true){
            System.out.println("Tienes uno o más suspensos");
        }
    }

    @Override
    public String toString() {
        String respuesta = " ";
        for(int i = 0; i < notas.length;i++){
            respuesta = respuesta+notas[i] +" | ";
        }
        return nombre+" " +respuesta;
    }
    
    
    
    
}
