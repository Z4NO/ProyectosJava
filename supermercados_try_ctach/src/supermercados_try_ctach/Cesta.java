/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercados_try_ctach;

/**
 *
 * @author Medac
 */
public class Cesta {
    protected int contador = 0;
    protected Producto [] productos = new Producto[100];

    public Cesta() {
        
    }
    

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
    public void añadir(Producto po1){
        productos[contador] = po1;
        contador++;
    }
    
    public void mostrar_cesta(){
        double precio_final = 0;
        for(int i = 0; i < productos.length; i++){
            if(productos[i] != null){
                System.out.println(productos[i].getNombre()+ " unidades ---> " + productos[i].getNumero_unidades() );
                precio_final = precio_final + (productos[i].getPrecio() * productos[i].getNumero_unidades());
            }
        }
        System.out.println("Tu precio final es de " + precio_final);
    }
    
    
    
}
