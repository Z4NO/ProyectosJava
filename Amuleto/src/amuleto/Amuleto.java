/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package amuleto;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
public class Amuleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File inventario = new File("amuletos.txt");
        
        try{
            FileReader filereader_frase = new FileReader(inventario);
            BufferedReader bufferedreader_frase = new BufferedReader(filereader_frase);
            
            boolean salir = true;
            int cont = 0;
            
            String [] inventario_temp = new String [100];
            
            
            while(salir){
                String item = bufferedreader_frase.readLine();
                if(item != null){
                    inventario_temp[cont] = item;
                    cont++;
                }else{
                    salir = false;
                }
            }
            bufferedreader_frase.close();
            
            Inventario agenda_defi = new Inventario(inventario_temp);
            
            boolean salir_principal = false;
            
            while(salir_principal == false){
                System.out.println("-----------  INVENTARIO  --------------\n");
                System.out.println("DIME QUE OPCIÓN QUIERES ELEGIR:\n1: PARA AGREGAR UN ITEM\n2: PARA MOSTRARLO TODO\n4: PARA SALIR\n");
                System.out.println("-----------------------------------\n");
                int opc = sc.nextInt();
                
                switch(opc){
                    case 1:
                        agenda_defi.Añadir_item();
                        break;
                    case 2:
                        agenda_defi.Mostrar_todo();
                        break;
                    case 4:
                        System.out.println("GRACIAS POR USAR EL GESTOR DE INVENTARIO DANI");
                        salir_principal = true;
                        break;
                }
            }
        
        }catch(IOException e){
            System.out.println("Error al leer el archivo de la agenda");
        }

    }
    
}
