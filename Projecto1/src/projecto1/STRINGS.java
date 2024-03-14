/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Medac
 */
public class STRINGS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String texto4 = "SI";
        String texto1 = "hola";
        String texto2 = "que tal";
        String texto3 = texto1 + texto2;
        System.out.println(texto3);
        System.out.println(texto1.equals(texto4));
        System.out.println(texto3.length());
        System.out.println(texto1.indexOf('H'));
        System.out.println(texto3.indexOf('2'));
        System.out.println(texto2.charAt(2));
        System.out.println(texto1.toUpperCase(Locale.ITALY));*/
        
        
        
        
        
        //EJRCICOS ENCONTRAR LA PALABRA
        Scanner sc = new Scanner(System.in);
        String palabra = "VETERINARIO";
        boolean palabra_encontrada = true;
        System.out.println("Intrpduce cual crees que es la palabra, las pistas son estas");
        for(int i = 0; i < palabra.length();i++){
            palabra.indexOf('_');
            System.out.println(palabra);
        }
        System.out.println(palabra.charAt(2));
        do{
            String intento_user = sc.next();
            if(intento_user.equalsIgnoreCase(palabra)){
                palabra_encontrada = false;
            }  
        }while(palabra_encontrada);
        
        
        
        
     }
    
}
