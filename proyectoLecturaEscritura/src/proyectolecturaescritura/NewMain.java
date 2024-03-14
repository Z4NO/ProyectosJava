/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolecturaescritura;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char letra = 'o';
        int num = 0;
        File file = new File("inspector.txt");
        try{
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String frase = bufferedreader.readLine();
            System.out.println(frase);
            
            System.out.println("");
            System.out.println("SEGUNDA LINEA");
            System.out.println("");
            
            String frase2 = "";
            while(frase != null){
                frase2 = frase2 + frase + '\n';
                frase = bufferedreader.readLine();
            }
            System.out.println(frase2);
            bufferedreader.close();
            
            System.out.println("");
            System.out.println("TERCERA LINEA");
            System.out.println("");
            
            FileWriter filewriter = new FileWriter(file,true);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
            BufferedWriter  bufferedWriter = new BufferedWriter(filewriter);
            
            bufferedWriter.write("Hola como estas hace tiempo no se de ti");
            bufferedWriter.newLine();
            bufferedWriter.write("suuuuuuuuu");
            
            bufferedWriter.close();
            
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
    
}
