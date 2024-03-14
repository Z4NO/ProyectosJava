/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_5_daniel_lozano;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
public class Pacinete {
    int id = 0;
    String nombre = "";
    String apellido = "";
    int edad = 0;

    public Pacinete(String nombre,String apellido,int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        Asignar_id();
    }
    
    public void Asignar_id(){
        File config = new File("Config.txt");
        
        try{
            FileReader filereader_config = new FileReader(config);
            BufferedReader bufferedreader_config = new BufferedReader(filereader_config);
            
            FileWriter filewriter_config = new FileWriter(config,false);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
            BufferedWriter  bufferedWriter_config = new BufferedWriter(filewriter_config);
            
            String String_config = bufferedreader_config.readLine();
            
            int numero_config = 0;
            
            if(String_config  == null ){
                numero_config = 1;
            }else{
                 numero_config = Integer.parseInt(String_config);
            }
            this.id = numero_config;
            
            bufferedreader_config.close();

        }catch(IOException e){
            System.out.println("Error al leer el archivo de configuracion en asigar_id");
        }
    }
    
    public boolean comprobar_paciente(String [] pacientes,String nombre){
        boolean continuar = true;
        for(int i = 0; i < pacientes.length;i++){
                if(pacientes[i] != null){
                    String [] division = pacientes[i].split(":");
                    if(division[2].equals(nombre)){
                        continuar = false;
                    }
                }
        }
        return continuar;
    }
    
    
    public void Añadir_paciente(Pacinete paciente,String [] Pacientes){
        File pacientes = new File("Pacientes.txt");
        File config = new File("Config.txt");
        
        try{
            FileReader filereader_paciente = new FileReader(pacientes);
            BufferedReader bufferedreader_paciente = new BufferedReader(filereader_paciente);
            
            FileReader filereader_config = new FileReader(config);
            BufferedReader bufferedreader_config = new BufferedReader(filereader_config);
            
            
            
            String nombre = paciente.getNombre();
            
            
            if(comprobar_paciente(Pacientes,nombre) == true){
                
                FileWriter filewriter = new FileWriter(pacientes,true);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
                BufferedWriter  bufferedWriter_pacientes = new BufferedWriter(filewriter);
                
                String nuevo_paciente = paciente.getId()+":"+paciente.getApellido()+":"+paciente.getNombre()+":"+paciente.getEdad();
                
                
                bufferedWriter_pacientes.write(nuevo_paciente);
                bufferedWriter_pacientes.newLine();
                bufferedWriter_pacientes.close();
                
                String numero_config_cambiar = bufferedreader_config.readLine();
                bufferedreader_config.close();
                FileWriter filewriter_config = new FileWriter(config,false);//TRUE TE MANTINE LO QUE HYA DENTRO  Y FALSE TE BORRA EL ARCHIVO PARA ESCRIBIR 
                BufferedWriter  bufferedWriter_config = new BufferedWriter(filewriter_config);
                if(numero_config_cambiar != null){
                    int numero_config = Integer.parseInt(numero_config_cambiar);
                    numero_config = numero_config +1;
                    String numero_config_string = String.valueOf(numero_config);
                    bufferedWriter_config.write(numero_config_string);
                }else{
                    int numero_null = 1;
                    String numero_null_string = String.valueOf(numero_null);
                    bufferedWriter_config.write(numero_null_string);
                }
                
                
                bufferedreader_config.close();
                bufferedWriter_config.close();
                bufferedreader_config.close();
    
            }else{
                System.out.println("\nNO SE PUEDE AÑADIR EL PACIENTE PORQUE YA ESTA EN LA LISTA");
            }

        }catch(IOException e){
            System.out.println("Error al leer los archivos de Paxiente o config");
        }
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
    
}
