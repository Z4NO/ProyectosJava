/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.segundotri1;

/**
 *
 * @author Medac
 */
public class Carta {
    int vida;
    int ataque;

    @Override
    public String toString() {
        return "Carta{" + "vida=" + vida + ", ataque=" + ataque + '}';
    }

    public Carta(int vida, int ataque) {
        this.vida = vida;
        this.ataque = ataque;
    }
    
    
    

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    
    
    
    
}
