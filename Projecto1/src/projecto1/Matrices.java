/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1;

import java.util.Scanner;
import java.util.Arrays;

public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void mostrararray(char [][] a){
    for(int i = 0; i <a.length;i++){
        System.out.println(Arrays.toString(a[i]));
    }
    }
    public static void main(String[] args) {
        char a = 'x';
        char [] []  matriz = new char[3] [4];
        //rellenar 
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[0].length; j++){
                for(int p =0; p < matriz[1].length; p++){
                    matriz[i][j] = a;
                }
            }
        }
        
        mostrararray(matriz);
    }
    
}
