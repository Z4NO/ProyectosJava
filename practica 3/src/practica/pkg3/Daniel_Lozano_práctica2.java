/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg3;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Daniel_Lozano_práctica2 {
     
    public static void muestra_tablero(char [][] a){
        for(int i = 0; i <a.length;i++){
        System.out.println(Arrays.toString(a[i]));
        }
    }

    public static void mostrar(char [] a){
        System.out.println(Arrays.toString(a));
    }
    public static void rellenar2(char [] [] b){
       for(int i = 0; i < b.length; i++){
           for(int j = 0; j < b.length; j++){
               b[i][j] = 'X';
           }
       }
   }
    
    public static void tablero(char [] [] c ){
         rellenar2(c);
         for(int i = 0;  i < 3; i++){
             c[0 ][0 + i] = ' ';
         }
         c[0][0] = 'O';
         for(int b = 2;  b < 3; b++){
                 c[1][0 + b] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[2][0 + b] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[2][0+ b ] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[3][0 + b] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[4][0 + b] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[5][0 + b] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[6][0 + b] = ' ';
         }
         for(int b = 2;  b < 3; b++){
                 c[7][0 + b] = ' ';
         }
         for(int b = 2; b < 7; b++){
             c[8][0 + b] = ' '; 
         }
         for(int b = 6;  b < 10; b++){
             
                 c[9][0 + b] = ' ';
         }
         
    }
    public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
        char [] [] tablero = new char [10][10];
        tablero(tablero);
        
        muestra_tablero(tablero);
        
        int posx = 0;
        int posy = 0;
        int vidas = 2;
        boolean correcto = true;
        do{
            
            System.out.println("");
            System.out.println("Dime hacia donde quieres avanzara");
            System.out.println("1 para derecha");
            System.out.println("2 Para izquierda");
            System.out.println("3 Para abajo");
            System.out.println("4 Para Arriba");
            System.out.println("5 PARA SALIR DEL JEUGO");
            int input_jugador  = sc.nextInt();
            if(input_jugador == 1 || input_jugador == 2 || input_jugador == 3 || input_jugador == 4 || input_jugador == 5){
                switch(input_jugador){
                    case 1:
                        if(posy + 1 < 10){
                            if(tablero[posx][posy + 1] == ' '  ){
                            tablero[posx][posy+1] = 'O';
                            tablero[posx][posy] = ' ';
                            posy++;
                        }else{
                            System.out.println("Movimiento no válido");
                            System.out.println("Te quedan " + vidas +"vidas");
                            vidas--;
                        }
                        }
                       break;
                    case 3:
                        if(posx + 1 < 10){
                           if(tablero[posx +1][posy] == ' '){
                            tablero[posx +1][posy] ='O';
                            tablero[posx][posy] = ' ';
                            posx++;
                        }else{
                            System.out.println("Movimiento no válido");
                            System.out.println("Te quedan " + vidas +"vidas");
                            vidas--;
                        } 
                        }
                       break;
                    case 2:
                        if(posy -1 > 0 ){
                           if(tablero[posx][posy -1 ] == ' '){
                               tablero[posx][posy -1] = 'O';
                               tablero[posx][posy] = ' ';
                               posy--;  
                        }else{
                            System.out.println("Movimiento no válido");
                            System.out.println("Te quedan " + vidas +"vidas");
                            vidas--;
                        } 
                        }
                       break;
                    case 4:
                        if(posx-1 > 0){
                           if(tablero[posx -1][posy] == ' '){
                                tablero[posx][posy] = ' ';
                                tablero[posx -1][posy] = 'O';
                                posx--; 
                        }else{
                            System.out.println("Movimiento no válido");
                            System.out.println("Te quedan " + vidas +"vidas");
                            vidas--;
                        }
                        }
                        
                       break;
                    case 5:
                        vidas = 0;
                }
                
               if(tablero[9][9] == 'O'){
                        System.out.println("Has ganado");
                        vidas = 0;
                        }
               muestra_tablero(tablero);
        }else{
               System.out.println("Debes elegir una de las opciones correctas");        
            }
        }while(vidas > 0);  
    }
}
