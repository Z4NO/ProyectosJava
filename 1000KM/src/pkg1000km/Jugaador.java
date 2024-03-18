
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1000km;

/**
 *
 * @author Usuario
 */
public class Jugaador {
    int pos;
    boolean ganar;
    String name;
    int kilometraje;
    boolean poder_avanzar = false;
    boolean gasolina_rojo;
    boolean semafaro_rojo;

    public Jugaador(int pos, String name) {
        this.pos = pos;
        this.name = name;
    }

    public boolean isGasolina_rojo() {
        return gasolina_rojo;
    }

    public boolean isSemafaro_rojo() {
        return semafaro_rojo;
    }

    public void setGasolina_rojo(boolean gasolina_rojo) {
        this.gasolina_rojo = gasolina_rojo;
    }

    public void setSemafaro_rojo(boolean semafaro_rojo) {
        this.semafaro_rojo = semafaro_rojo;
    }
    
   
    public int getPos() {
        return pos;
    }

    public boolean isGanar() {
        return ganar;
    }

    public String getName() {
        return name;
    }
    
    
    public void avanzar(){
        pos++;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public boolean isPoder_avanzar() {
        return poder_avanzar;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setGanar(boolean ganar) {
        this.ganar = ganar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoder_avanzar(boolean poder_avanzar) {
        this.poder_avanzar = poder_avanzar;
    }
    
    
    
}

