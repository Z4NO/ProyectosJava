/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battle_royale;

/**
 *
 * @author Medac
 */
public class Battle_royale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador("Alfonso");
        Jugador j2 = new Jugador("Monico");
        
        do{
            int a = (int)(Math.random()*2);
            if(a == 0){
                j1.luchar(j2);
                System.out.println("El jugador " + j2.getnombre() +" ha perdido una vida");
            }else{
                j2.luchar(j1);
                System.out.println("El jugador " + j1.getnombre() +" ha perdido una vida");
            }
        }while(j1.getvida() > 0 && j2.getvida() > 0);
        
        if(j1.getvida() == 0){
            System.out.println("Ha ganado " + j2.toString());
        }else{
            System.out.println("Ha ganado " + j1.toString());
        }
        
        
    }
    
}
