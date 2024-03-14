/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolecturaescritura;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class ProyectoLecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        File file = new File("inspector.txt");
        try{
            if(file.canRead()){
            System.out.println("se puede leer");
            FileReader filereader = new FileReader(file);
            
            int num = filereader.read();
            char letra = (char) num;
                System.out.println(""+letra);
                
            while(num != -1){
                letra = (char) num;
                System.out.println(letra);
                num = filereader.read();
            }
            
            char [] letras = new char[20];
            char letra1 = 'l';
            num = filereader.read();
            while(num != -1){
                for(int i = 0;i < letras.length;i++){
                    letras[i] = letra1;
                    //num = filereader;
                    letra = (char) num;
                    ;
                }
            }
            
            for(int p = 0; p < letras.length; p++){
                System.out.println(letras[p]);
            }
          }
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
    
}
