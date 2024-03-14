/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercados_try_ctach;

/**
 *
 * @author Medac
 */
public class Producto {
    protected String nombre;
    protected double precio;
    protected int numero_unidades;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumero_unidades(int numero_unidades) {
        this.numero_unidades = numero_unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumero_unidades() {
        return numero_unidades;
    }
        
    
}
