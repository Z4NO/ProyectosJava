/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casino;

import java.util.Scanner;
import java.util.Arrays;

public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personas [] todas = new Personas [5];
        int cont = 0;
        System.out.println("Vamos a jugar");
        System.out.println("Dime 6 Oficios");
        
        for(int i = 0; i < todas.length;i++){
           Personas p = new Personas(sc.next());
           todas[i] = p;
        }
        
        for(int i = 0; i < todas.length; i++){
            todas[i].setLugar(todas);
        }
        
        for(int i = 0; i < todas.length; i++){
            todas.toString();
        }
      
        do{
            System.out.println("Que quieres hacer ");
            
        }while(cont < 1);
        
    }
    
}
