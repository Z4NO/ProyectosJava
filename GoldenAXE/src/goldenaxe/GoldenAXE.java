/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goldenaxe;

import java.util.Scanner;
import java.util.Arrays;
public class GoldenAXE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean correcto = true;
        System.out.println("BIENVENIDO A GOLDENAXE");
        System.out.println("Especofique porfavor el número de jugadores que van a participar");
        do{
            int players = sc.nextInt();
            
        }while(correcto);
        
        
        Jugador [] jugadores = new Jugador[players];
        Cthulhu chu = new Cthulhu();
        chu.setVida(players);
        
    }
    
}
