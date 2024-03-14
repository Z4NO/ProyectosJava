/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg1000km;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Medac
 */
public class Carta {
    Integer tipo;
    int distancia;
    boolean semaforo_rojo;
    boolean semaforo_verde;
    boolean ataque;
    boolean añadir_gasolina;
    boolean sin_gasolina;
    String descripccion;
    boolean poder_avanzar;
    
 
   
    public Carta(Integer tipo, int distancia, boolean ataque,String descripcion) {
        this.tipo = tipo;
        this.distancia = distancia;
        this.ataque = ataque;
        this.descripccion = descripcion;
    }

    @Override
    public String toString() {
        return descripccion;
    }
    
    
    

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public void setSemaforo_rojo(boolean semaforo_rojo) {
        this.semaforo_rojo = semaforo_rojo;
    }

    public void setSemaforo_verde(boolean semaforo_verde) {
        this.semaforo_verde = semaforo_verde;
    }

    public void setAtaque(boolean ataque) {
        this.ataque = ataque;
    }
    
    public Integer getTipo() {
        return tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public boolean isSemaforo_rojo() {
        return semaforo_rojo;
    }

    public boolean isSemaforo_verde() {
        return semaforo_verde;
    }

    public boolean isAtaque() {
        return ataque;
    }

    public void setAñadir_gasolina(boolean añadir_gasolina) {
        this.añadir_gasolina = añadir_gasolina;
    }

    public void setSin_gasolina(boolean sin_gasolina) {
        this.sin_gasolina = sin_gasolina;
    }

    public boolean isAñadir_gasolina() {
        return añadir_gasolina;
    }

    public boolean isSin_gasolina() {
        return sin_gasolina;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public boolean isPoder_avanzar() {
        return poder_avanzar;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public void setPoder_avanzar(boolean poder_avanzar) {
        this.poder_avanzar = poder_avanzar;
    }
    
    
    
}
