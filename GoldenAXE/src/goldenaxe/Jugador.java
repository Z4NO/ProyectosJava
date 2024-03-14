/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public abstract  class Jugador {
    protected int vida;
    protected int fuerza;
    protected boolean estaVivo;
    protected String nombre;
    
    
    public Jugador() {
        Carta [] cartas = new Carta[5];
        cartas[0]=  new Carta("Tienes 1 punto de vida",1,0);
        cartas[1]= new Carta("Te quitan 1 punto de vida",-1,0);
        cartas[2]= new Carta("Te quitan 1 punto de fuerza",0,-1);
        cartas[3]= new Carta("Tienes  1 punto de fuerza",0,1);
        cartas[4]= new Carta("Tienes  2 punto de fuerza",2,0);
    }
    
    
    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
