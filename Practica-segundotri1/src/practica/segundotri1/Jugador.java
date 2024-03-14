/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica.segundotri1;

/**
 *
 * @author Medac
 */
public  abstract class Jugador {
    protected int vida;
    protected int ataque;
    protected boolean vivo;
    protected Carta [] cartas;
    

    public Jugador() {
        vivo = true;
        cartas = new Carta [100];
        
    }
    
    public void robarcarta(Carta carta){
        for(int i =0; i < cartas.length;i++){
            if(cartas[i] == null){
                cartas[i] = carta;
            }
        }
    }
    
    public void vercartas(){
        for(int i = 0; i < cartas.length;i++){
            if(cartas[i] != null){
                System.out.println(cartas[i] + "pos" + i);
            }
        }
    }
    
    public void usarcarta(int pos){
        vida = vida + cartas[pos].getVida();
        ataque = ataque + cartas[pos].getAtaque();
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public boolean isVivo() {
        return vivo;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }
    
    
    
    
    
}
