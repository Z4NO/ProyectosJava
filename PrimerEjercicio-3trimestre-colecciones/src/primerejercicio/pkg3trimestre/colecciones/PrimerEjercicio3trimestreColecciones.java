/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerejercicio.pkg3trimestre.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
public class PrimerEjercicio3trimestreColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*ArrayList <Integer> numeros = new ArrayList <> ();
        System.out.println(numeros.size());
        
         numeros.add(5);
         numeros.add(3);
         numeros.add(8);
         
         System.out.println(numeros);
         System.out.println(numeros.size());
         
         numeros.add(1,4);
         System.out.println(numeros);
         
         System.out.println(numeros.get(0));
         
         for(int i = 0; i < numeros.size(); i ++){
             System.out.println(numeros.get(i));
         }
         
        ArrayList <String> Personas = new ArrayList <> ();
        Personas.add("Juan");
        Personas.add("Elena");
        Personas.add("Pepe");
        
        Personas.remove(1);
        System.out.println(Personas);
        
        for(String str:Personas){
            System.out.println(str);
        }
        
        //LIKEND LIST 
        
        //el linked permite elementos duplicados 
        
        LinkedList <String> arraylink = new LinkedList <> ();
        
        arraylink.add("PEPE");
        arraylink.add("JAUNA");
        arraylink.add(1,"PEPE");
        arraylink.remove(0);
        arraylink.addFirst("ANTONIO");
        arraylink.addLast("Silvia");
        System.out.println(arraylink);
        
        
        //TRABAJAMOS CON CLASES
        
        ArrayList <Persona> personas = new ArrayList <> ();
        
        personas.add(new Persona("Juan",18));
        personas.add(new Persona("Pepe",20));
        personas.add(new Persona());
        personas.add(new Persona("ELENA",23));
        
        System.out.println(personas);
        
        for(Persona pers:personas){
            if(pers.getNombre() == null){
                pers.setNombre("EMILIO");
                pers.setEdad(25);
            }
        }
        
        System.out.println(personas);
                
        
        ArrayList <Integer> numeros2 = new ArrayList <> ();
        
        numeros2.add(7);
        numeros2.add(2);
        numeros2.add(3);
        
        System.out.println(numeros2);
        Collections.sort(numeros2);
        System.out.println(numeros2);
        Collections.shuffle(numeros2);
        System.out.println(numeros2);
        
        
        Collections.sort(personas);
        System.out.println(personas);*/
        
        //CHARS
        ArrayList <Character> char3 = new ArrayList <> ();
        ArrayList <Character> char1 = new ArrayList <> ();
        System.out.println("DIME LA CADENA");
        String string1 = sc.next();
        
        for(Character c:string1.toCharArray()){
            char1.add(c);
        }
        System.out.println(char1);
        
        //OTRO MÉTODO
        
        System.out.println("INTRODUCE UNA PALABRA 2");
        String palabra1 = sc.next();
        ArrayList <Character> char2 = new ArrayList <> ();
        for( int i = 0;i < palabra1.length();i++){
            char2.add(palabra1.charAt(i));
        }
        char1.addAll(char2);
        
        System.out.println(char1);
    }
    
    
}
