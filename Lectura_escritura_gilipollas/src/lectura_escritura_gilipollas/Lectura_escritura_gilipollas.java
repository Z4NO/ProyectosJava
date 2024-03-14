/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lectura_escritura_gilipollas;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Lectura_escritura_gilipollas {

    public static void rellenar(String [] [] b){
        File palabrotas = new File("palabrotas.txt");
        int i=0; 
        try{
                FileReader filereader_palabrotas = new FileReader(palabrotas);
                BufferedReader bufferedreader_palabrotas = new BufferedReader(filereader_palabrotas);
                
                String frase_leida = bufferedreader_palabrotas.readLine();
            
                while(frase_leida != null && i < b.length){
                    String [] division = frase_leida.split(";");
                    b[i][0] = division[0];
                    b[i][1] = division[1];
                    i++;
                    frase_leida = bufferedreader_palabrotas.readLine();
                }
            
            
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
        
    }
    public static void muestra_tablero(String [][] a){
        for(int i = 0; i < a.length;i++){
            if(a[i][0] != null && a[i][1] != null){
                System.out.println(Arrays.toString(a[i]));
            }
        }
    }
    public static void main(String[] args) {
        
        File frase = new File("frase_corregir.txt");
        try{
            FileReader filereader_frase = new FileReader(frase);
            BufferedReader bufferedreader_frase = new BufferedReader(filereader_frase);
            
            System.out.println("Esta es la frase a corregir");
            System.out.println("");
            //System.out.println(bufferedreader_frase.readLine());

            String frase_guardada = bufferedreader_frase.readLine();
            
            System.out.println(frase_guardada);
            
            bufferedreader_frase.close();
            
            System.out.println("Frase corregirda:");
            String [] frase_array = frase_guardada.split(" ");
           
            String [] [] palabrotas_array = new String [100][2];
            rellenar(palabrotas_array);
            
            for(int i = 0; i < frase_array.length; i++){
                for(int j = 0; j < palabrotas_array.length; j++){
                    if(frase_array[i].equals(palabrotas_array[j][0])){
                        frase_array[i] = palabrotas_array[j][1];
                    }
                }
            }
            
            String le_frase = "";
            
            for(int i = 0; i < frase_array.length;i++){
                le_frase += frase_array[i] +" ";
            }
            
            System.out.println(le_frase);
            
            FileWriter filewriter = new FileWriter(frase,false);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
            BufferedWriter  bufferedWriter = new BufferedWriter(filewriter);
            
            bufferedWriter.write(le_frase);
            bufferedWriter.close();
            
        }catch(IOException e){
            System.out.println("Error al leer el archivo");
        }
    }
}