/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1;

import java.util.Scanner;
import java.util.Arrays;
public class undir_flota {
    
    public static void introducirbarco(char[][] m, int tam, char letra){
        boolean condicion = false;
        int posx, posy;
        do{
            posx = (int) (Math.random()*10);
            posy = (int) (Math.random()*10);
            
            if (posy + tam < m[0].length){ //m,lenght = da tamaño de flas filas y m[0].length = da las columnas 
                condicion = true;
                //comprobar que no hay baco
                for(int i = 0; i < tam; i++){
                  if(m [posx][posy + i]!= 'A'){
                      condicion = false;
                  }  
                }
                if(condicion){
                    for(int i = 0; i <tam;i++){
                        m[posx][posy +i] =letra;
                    }
                }
            }
            
        }while(!condicion);
    }

   public static void mostrararray(char [][] a){
    for(int i = 0; i <a.length;i++){
        System.out.println(Arrays.toString(a[i]));
        }
    }
   
   public static void rellenar(char [] [] b){
       for(int i = 0; i < b.length; i++){
           for(int j = 0; j < b.length; j++){
               b[i][j] = 'A';
           }
       }
   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        char [] []  matriz = new char[10][10];
        char [][] copia = new char[10][10];
        int contB1 = 3, contB2 = 5;
        rellenar(matriz);
        rellenar(copia);
        introducirbarco(matriz,5,'B');
        introducirbarco(matriz,3,'C');
        introducirbarco(matriz,5,'B');
        introducirbarco(matriz,3,'C');
        introducirbarco(matriz,5,'B');
        introducirbarco(matriz,3,'C');
        mostrararray(matriz);
       
        do{
            System.out.println("");
            System.out.println("");
        
            mostrararray(copia);
            System.out.println("Introduce una coordenada x");
            int userx = sc.nextInt();
            System.out.println("Introduce una coordenada y");
            int usery = sc.nextInt();
            char letra = matriz[userx][usery];
            switch(letra){
                case 'A':
                    System.out.println("AGUA");
                    break;
                case 'B':
                    matriz[userx][usery] = 'T';
                    contB2--;
                    copia[userx][usery] = 'T';
                    System.out.println("TOCADO");
                    if(contB2 == 0){
                        System.out.println("Hundido ");
                    }
                    break;
                case 'C':
                    matriz[userx][usery] = 'T';
                    contB1--;
                    copia[userx][usery] = 'T';
                    System.out.println("TOCADO");
                    break;
         
               
            }
        }while(!(contB1 == 0 && contB2 == 0));
        
        
    }
    
}
