/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_5_daniel_lozano;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
public class Practica_5_Daniel_Lozano {

    public static void mostrar_pacientes(){
        File pacientes = new File("Pacientes.txt");
        try{
            FileReader filereader_pacientes = new FileReader(pacientes);
            BufferedReader bufferedreader_pacientes = new BufferedReader(filereader_pacientes);
            
            boolean salir = true;
           
            while(salir){
                String item = bufferedreader_pacientes.readLine();
                if(item != null){
                    String [] division = item.split(":");
                    System.out.print("ID: " + division[0]+" || ");
                    System.out.print("NOMBRE Y APELLIDO: "+ division[2]+" "+division[1]);
                    System.out.println("");
                }else{
                    salir = false;
                }
            }
        
            bufferedreader_pacientes.close();
        }catch(IOException e){
            System.out.println("Error al leer el archivo de pacientes");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        File config = new File("Config.txt");
        File pacientes = new File("Pacientes.txt");
        
        try{
            FileReader filereader_config = new FileReader(config);
            BufferedReader bufferedreader_config = new BufferedReader(filereader_config);
            
            FileReader filereader_paciente = new FileReader(pacientes);
            BufferedReader bufferedreader_paciente = new BufferedReader(filereader_paciente);
            
            String String_config = bufferedreader_config.readLine();
            
            int numero_config = 0;
            
            if(String_config  == null ){
                numero_config = 0;
            }else{
                 numero_config = Integer.parseInt(String_config);
            }
            
            bufferedreader_config.close();
            boolean salir = true;
            int cont = 0;
            
            String [] array_pacientes_temp = new String [numero_config];
            
            
            while(salir){
                String item = bufferedreader_paciente.readLine();
                if(item != null){
                    array_pacientes_temp[cont] = item;
                    cont++;
                }else{
                    salir = false;
                }
            }
            
            boolean salir_principal = true;
            
            while(salir_principal){
                System.out.println("-----------  DAMDental  --------------\n");
                System.out.println("DIME QUE OPCIÓN QUIERES ELEGIR:\n1: PARA AGREGAR UN PACIENTE\n2: PARA MOSTRARLO TODOS LOS PACIENTES\n4: PARA SALIR\n");
                System.out.println("-----------------------------------\n");
                int opc = sc.nextInt();
                
                switch(opc){
                    case 1:
                        System.out.println("DIME EL PRIMER APELLIDO DEL PACIENTE");
                        String apellido = sc.next();
                        System.out.println("DIME EL  NOMBRE DEL PACIENTE");
                        String nom = sc.next();
                        System.out.println("DIME LA EDAD DEL PACIENTE");
                        int ed = sc.nextInt();
                        Pacinete contenedor_paciente = new Pacinete(apellido,nom,ed);
                        contenedor_paciente.Añadir_paciente(contenedor_paciente, array_pacientes_temp);
                        break;
                    case 2:
                        mostrar_pacientes();
                        break;
                    case 4:
                        salir_principal = false;
                        System.out.println("GRACIAS POR USAR DAMDental DANI");
                           
                }
            }

        
        }catch(IOException e){
            System.out.println("Error al leer el archivo de la agenda");
        }
    }
    
}
