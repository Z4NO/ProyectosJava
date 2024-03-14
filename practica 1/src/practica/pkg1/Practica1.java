/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1;

/**
 *
 * @author Daniel Lozano berben
 */

import java.util.Scanner;

public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Dime tu inicial");
        char nombre = sc.next().charAt(0);
        
        System.out.println("Dime tu edad(Tienes que ser mayor de edad)");
        int edad = sc.nextInt();
        if(edad >= 18){
            if(edad >= 65){
                System.out.println("Llevas " + (edad - 65)+ "anos jubilado");
            }else{
                System.out.println("Te quedan "+ (65 -edad)+ "años para jubilarte");
            }
        }else{
            System.out.println("No eres mayor de edad");
        }
        */
        //EJERCICO 2 
        
        /*
        System.out.println("Vamo a convertir tus euros en dólares americanos");
        System.out.println("Introduzacame La cantidad de euros que quieres convertir");
        float euros = sc.nextFloat();
        System.out.println("Ahora introduzcame cuanto vale un dolar en comparación con el euro");
        float dolares = sc.nextFloat();
        float resultado = euros * dolares;
        System.out.println(euros + " euros equivalen a " + resultado + "dolares" );
        */
        
        //EJERCICO 3
        /*
        int i =0;
        for(int numeros = 0; i <= 99; numeros = numeros + 2){
            i++;
            System.out.println(numeros);
        }
       */
        
        
        //EJERCICO 4
        /*
        int numero_notas = 0;
        int suspenso = 0;
        int aprobados = 0;
        int notable = 0;
        int sobresaliente =0;
        while(numero_notas <= 10){
            numero_notas++;
            System.out.println("Introduzacame una numa ");
            int nota = sc.nextInt();
            switch(nota){
                case 1,2,3,4:
                    suspenso++;
                    break;
                case 5, 6:
                    aprobados++;
                    break;
                case 7 ,8:
                    notable++;
                    break;
                case 9 ,10:
                    sobresaliente++;
                    break;    
            }
                   
        }
     System.out.println("Hay" + suspenso + " suspensos");
     System.out.println("Hay" + aprobados + " aprobados");
     System.out.println("Hay" + notable + " notables");
     System.out.println("Hay" + sobresaliente + "sobresaliente");*/
        
        
        
     //EJERCICIO 5
     
     int romper = 0;
        do{
            System.out.println("Dime la inicialde  de tu producto");
            char inicial = sc.next().charAt(0);
            System.out.println("Dime el precio de producto");
            int precio = sc.nextInt();
            int precio2 = precio;
            int romper2 = 0;
            while(1 > romper2){
                System.out.println("Desea continuar ? pulsa s para continuar y n para parar");
                char  decision = sc.next().charAt(0);
                if(decision == 'n' || decision == 'N'){
                romper = 3;
                romper2 = 3;
                System.out.println("El precio total es de " +(precio2 + precio ));
                }
                else if(decision == 's' || decision == 'S'){
                    romper2 = 3;
                }
            }
        }while(1 > romper);
       
     
     
     
     
    }
    
}
