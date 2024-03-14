/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fronterizo;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Fronterizo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        Personas [] todas = new  Personas[100];
        int e = 0;
        int o = 0;
        boolean salir = true;
        
        System.out.println("Bievenido a la frontera dime que quieres hacer");
        
        do{
            System.out.println("");
            System.out.println("1-crear personas");
            System.out.println("2-imprimir personas");
            System.out.println("3-Buscar por nombre");
            System.out.println("4-Para salir");
            System.out.println("");
            int elecc = sc.nextInt();
            switch(elecc){
                case 1:
                   System.out.println("Dime el número de personas que crear");
                    int num = sc.nextInt();
                    do{
                        System.out.println("Dime el nombre y el dni");
                        Personas p  = new Personas(sc.next(),sc.next());
                        todas[e] = p;
                        e++;
                        o++;
                    }while( o < num);
                    break;
                case 2:
                    for(int i = 0; i < e; i++){
                    System.out.println(todas[i].toString());
                    }
                    break;
                case 3:
                    System.out.println("Introduece un nombre para buscar en la frontera");
                    String nom_pedir = sc.next();
        
                    int contador = 0;
                    for(int i = 0; i < e;i++){
                        if(nom_pedir.equals(todas[i].getnombre())){
                             System.out.println(todas[i].toString());
                            contador++;
                        }
                    }
        
                    if(contador != 0){
                         System.out.println("Se han encontrado " + contador + " coincidencias");
                    }else{
                        System.out.println("No se ha encontrado ninguna coincidencia");
                    }
                  break;
                case 4:
                    salir = false;
                    break;
                        }
        }while(salir);
        

        
       
    }
    
}
