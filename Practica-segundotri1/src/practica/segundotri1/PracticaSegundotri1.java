/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.segundotri1;

import java.util.Scanner;
import java.util.Arrays;
public class PracticaSegundotri1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aragon aragon = new Aragon();
        Legolass legolas = new Legolass();
        Gimli gimli = new Gimli();
        Orco orco = new Orco();
        
        Jugador [] jugadores = {aragon,legolas,gimli};
        
        Carta [] mazo = new Carta [10];
        for(int i =0; mazo.length < i; i++){
            int ataque = (int)(Math.random()*10);
            int vida = (int)(Math.random()*10);
            mazo[i] = new Carta(vida,ataque);
        }
        
        
        do{
            for(int i = 0; i < jugadores.length;i++){
                int random = (int)(Math.random()*10);
                jugadores[i].robarcarta(mazo[random]);
                jugadores[i].vercartas();
                System.out.println("Que quieres hacer 1 usarcarta /// 2.atacar");
                int resp = sc.nextInt();
                switch(resp){
                    case 1:
                        System.out.println("Que posicion de cartas quieres usar");
                        int respuesta = sc.nextInt();
                        jugadores[i].usarcarta(respuesta);
                        break;
                    case 2:
                        orco.setVida((orco.getVida())-(jugadores[i].getAtaque()));
                        break;            
                }   
            } 
        }while(orco.getVida() > 0);
    }
    
}
