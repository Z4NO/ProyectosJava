/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hasset;

import java.util.HashSet;
import java.util.Iterator;


public class HASSET {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            HashSet <Integer> numeros = new HashSet<>();
            HashSet <String> nombres = new HashSet<>();
            nombres.add("Juan");
            nombres.add("Pepe");
            nombres.add("Vicente");
            System.out.println(nombres);
            
            Iterator <String> it = nombres.iterator();
            while(it.hasNext()){
                System.out.println("NOMBRE ES "+it.next());
                        
            }
            String prubea = "Pepe";
            System.out.println(nombres.contains(prubea));
            
            
            //DEL 1 AL 10 QUE NUMEROS ESTAN CONTENIDOS EN EL CONJUNTO 1 ( 3 5 7)
            
            HashSet <Integer> conjunto1 = new HashSet<>();
            conjunto1.add(7);
            conjunto1.add(3);
            conjunto1.add(5);
            int cont = 0;
            
            for(int i = 0; i <= 10; i++){
                if(conjunto1.contains(i)){
                    System.out.println("NÚMERO CONTENIDO "+i);
                    cont++;
                }
            }
            System.out.println("Numeros contenidos en el conjunto = " + cont);
            
            HashSet <Persona> personas = new HashSet <>();
            
            Persona p1 = new Persona(12,"Pepe");
            Persona p2 = new Persona(52,"Juan");
            Persona p3 = new Persona(32,"alvaro");
            Persona p4 = new Persona(12,"Pepe");

            personas.add(p1);
            personas.add(p2);
            personas.add(p3);
            personas.add(p3);
            System.out.println(personas);
            System.out.println(personas.contains(p3));
            
            
            
            

    }
    
}
