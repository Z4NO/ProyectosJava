/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendatelefonica_dani;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class AgendaTelefonica_DANI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        File agenda = new File("agenda_dani.txt");
        
        try{
            FileReader filereader_frase = new FileReader(agenda);
            BufferedReader bufferedreader_frase = new BufferedReader(filereader_frase);
            
            boolean salir = true;
            int cont = 0;
            
            String [] agenda_temp = new String [20];
            
            while(salir){
                if(cont < 20){
                    String contacto = bufferedreader_frase.readLine();
                    agenda_temp[cont] = contacto;
                    cont++;
                }else{
                    salir = false;
                }
            }
            
            Agenda agenda_defi = new Agenda(agenda_temp);
            
            boolean salir_principal = false;
            
            while(salir_principal == false){
                System.out.println("-----------  AGENDA  --------------\n");
                System.out.println("DIME QUE OPCIÓN QUIERES ELEGIR:\n1: PARA AGREGAR CONTACTO\n2: PARA BUSCAR POR NOMBRE\n3: PARA MOSTRARLO TODO\n4: PARA SALIR\n");
                System.out.println("-----------------------------------\n");
                int opc = sc.nextInt();
                
                switch(opc){
                    case 2:
                        System.out.println("\n Dime el nombre que deseas buscar");
                        String nombre = sc.next();
                        agenda_defi.Buscar_por_Nombre(nombre);
                        break;
                    case 3:
                        agenda_defi.Mostrar_todo();
                        break;
                    case 4:
                        System.out.println("GRACIAS POR USAR LA AGENDA DANI");
                        salir_principal = true;
                        break;
                }
            }
        
        }catch(IOException e){
            System.out.println("Error al leer el archivo de la agenda");
        }
    }
    
}
