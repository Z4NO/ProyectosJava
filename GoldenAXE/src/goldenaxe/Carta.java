/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public class Carta {
    
    String fraseCarta;
    int vida;
    int fuerza;

    public Carta(String FraseCarta,int Vida, int Fuerza) {
        this.fraseCarta = FraseCarta;
        this.vida = Vida;
        this.fuerza = Fuerza;   
    }

    public String getFraseCarta() {
        return fraseCarta;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFraseCarta(String fraseCarta) {
        this.fraseCarta = fraseCarta;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Carta{" + "fraseCarta=" + fraseCarta + ", vida=" + vida + ", fuerza=" + fuerza + '}';
    }
    
    
}
