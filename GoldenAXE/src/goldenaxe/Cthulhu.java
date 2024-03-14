/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public class Cthulhu {
    int fuerza;
    boolean estaVivo;
    int vida;
    
    public Cthulhu(){
        fuerza = 1;
        estaVivo = true;
        vida = 0;
        
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public int getVida() {
        return vida;
    }
    
    
}
