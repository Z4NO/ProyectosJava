/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercados_try_ctach;

/**
 *
 * @author Medac
 */
public class SuperMercado {
    protected Producto producto;
    protected String Nombre;
    protected Producto [] productos = new Producto[10];

    public Producto getProducto() {
        return producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }
    
    
    public SuperMercado(String Nombre,Producto[] produtcs) {
        this.Nombre = Nombre;
        this.productos = produtcs;
    }
    
    public  void muestra_productos(){
        for(int i = 0; i <productos.length ;i++){
            System.out.println(productos[i].getNombre());
        }
    }
    
    public void rellener_productos(Producto[] products){
        for(int i = 0; i < productos.length;i++){
            productos[i] = products[i];
        }
    }

    @Override
    public String toString() {
        return  Nombre;
    }
    
    
    
}
