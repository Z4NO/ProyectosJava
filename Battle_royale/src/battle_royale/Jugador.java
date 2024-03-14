/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle_royale;

/**
 * @author Medac
 */
public class Jugador {
    
    private String nombre;
    private int vida;
    
    public Jugador(){
        
    }
    
    @Override
    public String toString(){
        return "el jugador con el nombre "  + nombre + " con el número de vidas " +vida;
    }
    
    public Jugador(String nom){
        this.nombre = nom;
        this.vida = 5;
    }
    
    public void luchar(Jugador jugador){
        int v = jugador.getvida();
        jugador.setvida(v-1);
    }
    
    public void setnombre(String nom){
        this.nombre = nom;
    }
    
    public void setvida(int vida){
        this.vida = vida;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public int getvida(){
        return vida;
    }
}
