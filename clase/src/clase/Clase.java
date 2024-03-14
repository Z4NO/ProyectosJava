/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase;

import java.util.Scanner;
import java.util.Arrays;
public class Clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int esp;
        
        Persona [] alumnos = new Persona[100];
        int pos =0;
        do{
            System.out.println("1 Para insertar un alumno");
            System.out.println("6 Para salir");
            esp = sc.nextInt();
            switch(esp){
                case 1:
                    System.out.println("1 para un alumno");
                    System.out.println("2 para una alumna");
                    int esp2 = sc.nextInt();
                    if(esp2 == 1){
                        System.out.println("Dime el nombre de el alumno");
                        String nom = sc.next();
                        alumnos[pos] = new alumno(nom);
                        alumnos[pos].InsertarNotas();
                        alumnos[pos].estaAprobado();
                        pos++;
                    }else if(esp2 == 2){
                        System.out.println("Dime el nombre de la alumna");
                        String nom2 = sc.next();
                        alumnos[pos] = new alumna(nom2);
                        alumnos[pos].InsertarNotas();
                        alumnos[pos].estaAprobado();
                        pos++;
                    }else{
                        System.out.println("Opción válida");
                    }
                    break;
                case 2:
                    for(int i =0; i <alumnos.length; i++ ){
                        if(alumnos[i] instanceof alumno){
                            System.out.println(alumnos[i]);
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("1.alumnos 2.alumnas");;
                    int resp3 = sc.nextInt();
                    for(int i =0; i < pos;i++){
                        alumnos[i].estaAprobado();
                        if(resp3 ==1){
                            if(alumnos[i] instanceof alumno && alumnos[i].suspenso){
                                System.out.println(alumnos[i].toString());
                            }
                        }
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(esp !=6);
    }
    
}
