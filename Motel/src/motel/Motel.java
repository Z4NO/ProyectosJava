/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motel;

import java.util.Scanner;
import java.util.Arrays;
public class Motel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al Motel dani");
        
        Uesped pers [] = new Uesped [20];
        int e = 0;
        int cont_h = 0;
        
        boolean salir = true;
        do{
            System.out.println("Que opción te gustaría hacer ");
            System.out.println("1-Para insertar huesped");
            System.out.println("2-para que te diga el N de habitaciones");
            System.out.println("3-Para Calcular el  precio por nombre del huesped (Precio por noche 50)");
            System.out.println("4-Elimina uesped por nombre");
            System.out.println("5-Busca uesped por nombre");
            System.out.println("6-Buscar uesped por n de habitación");
            System.out.println("7-Para salir");
            int opcion_re = sc.nextInt();
            switch(opcion_re){
                case 1:
                    if(cont_h < 20){
                        for(int i = 0; i < pers.length; i++){
                            if(pers[i] == null){
                                System.out.println("Dime el nombre del uesped");
                                String nom = sc.next();
                                System.out.println("Dime el número de noches que se va a quedar el uesped");
                                int num = sc.nextInt();
                                Uesped p =new Uesped(nom,num,cont_h);
                                pers[i] = p;
                                cont_h++;
                                i = pers.length;
                            }
                        }
                    }else{
                        System.out.println("El Motel está lleno");
                    }
                    break;
                case 2:
                    System.out.println("El número de habitaciones ocupadas es " + cont_h);
                    break;
                case 3:
                    System.out.println("Dime el nombre del uesped");
                    String nom_b = sc.next();
                    for(int i = 0; i < pers.length; i++){
                        if(pers[i] != null){
                            if(nom_b.equals(pers[i].getnombre())){
                                pers[i].calcularnoches();
                            }else{
                                System.out.println("Persona no encontrada");
                            }
                        }
                        
                    }
                    break;   
                case 4:
                    System.out.println("Dime el nombre del uesped");
                    String nom_c = sc.next();
                    for(int i = 0; i < pers.length; i++){
                        if(pers[i] != null ){
                            if(nom_c.equals(pers[i].getnombre())){
                                pers[i] = null;
                                System.out.println("Persona eliminada");
                                cont_h--;
                            }else{
                                System.out.println("No se ha encontrado a la persona");
                            }
                        } 
                    }
                    break;
                case 5:
                    System.out.println("Dime el nombre del uesped");
                    String nom_d = sc.next();
                    for(int i = 0; i < pers.length; i++){
                        if(pers[i] != null ){
                          if(pers[i].getnombre().equals(nom_d)){
                              System.out.println(pers[i].toString());
                          }else{
                            System.out.println("No se ha encontrado a la persona");
                          }
                       }
                    }
                    break;
                case 6:
                    System.out.println("Dime el numero de habitacion  del uesped");
                    int nom_e = sc.nextInt();
                    for(int i = 0; i < pers.length; i++){
                        if(pers[i] != null){
                            if(nom_e == pers[i].getNumero_habitacion()){
                                System.out.println(pers[i].toString());
                            }else{
                                System.out.println("No se ha encontrado a la persona");
                            }
                        }
                    }
                    break;
                case 7:
                    salir = false;
             
                 
                    
            }
            
        }while(salir);
    }
    
}
