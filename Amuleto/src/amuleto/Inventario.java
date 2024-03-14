/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package amuleto;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Inventario {
    String [] Inventario = new String [100];

    public Inventario(String [] Inventario) {
        this.Inventario = Inventario;
    }

    public String[] getInventario() {
        return Inventario;
    }

    @Override
    public String toString() {
        return "Inventario{" + "Inventario=" + Inventario + '}';
    }
    
    
    
    public boolean comprobar_item(String [] Inventario,String nombre){
        boolean continuar = true;
        for(int i = 0; i < Inventario.length;i++){
                if(Inventario[i] != null){
                    if(Inventario[i].equalsIgnoreCase(nombre)){
                        continuar = false;
                    }
                }
        }
        return continuar;
    }
    
    public void Añadir_item(){
        File amuletos = new File("amuletos.txt");
        
        Scanner sc = new Scanner(System.in);
        boolean salir = true;
        
        System.out.println("DIME EL NOMBRE DEL ITEM");
        String nom = sc.next();
        System.out.println("\nDIME EL PRECIO DEL ITEM");
        String precio = sc.next();
        System.out.println("\nDIME LA CANTIDAD DEL ITEM");
        String cantidad = sc.next();
        
        if(comprobar_item(Inventario,nom) == true){
            try{
                FileReader filereader_amuletos = new FileReader(amuletos);
                BufferedReader bufferedreader_amuletos = new BufferedReader(filereader_amuletos);
                
                FileWriter filewriter = new FileWriter(amuletos,true);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
                BufferedWriter  bufferedWriter = new BufferedWriter(filewriter);
                
                
                String nuevo_item = nom+":"+precio+":"+cantidad;
                
                bufferedWriter.write(nuevo_item+"\n");
                bufferedWriter.close();
            
            
            }catch(IOException e){
            System.out.println("Error al leer el archivo del Inventario");
        }
        }else{
            System.out.println("No se puede añadir el item porque ya lo tienes en tu iventario");
        }
        
    }
    
    
}
