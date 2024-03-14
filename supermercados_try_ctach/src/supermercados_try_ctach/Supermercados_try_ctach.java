/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercados_try_ctach;

import java.util.Scanner;
import java.util.Arrays;
public class Supermercados_try_ctach {

    public static void comparar(SuperMercado m1, SuperMercado m2, Cesta cesta){
        Scanner sc = new Scanner(System.in);
        boolean mayor = true;
        System.out.println("Dime el nombre del producto");
        String products = sc.next();
        Producto [] lis1 = m1.getProductos();
        Producto [] lis2 = m2.getProductos();
        Producto p1 = new Producto("null",0.00);
        Producto p2 = new Producto("null",0.00);
        for(int i = 0; i < lis1.length;i++){
            if(lis1[i].getNombre().equals(products)){
                 p1 = lis1[i];
            }
        }
        for(int i = 0; i < lis2.length;i++){
            if(lis2[i].getNombre().equals(products)){
                p2 = lis2[i];
            }
        }
        if(p1.getPrecio() < p2.getPrecio()){
            System.out.println("En el "+ m1 + " tienen el producto " + products +" más barato a " + p1.getPrecio() );
            mayor = false;
        }else{
            System.out.println("En el" + m2 +" tienen el producto " + products +" más barato a " + p1.getPrecio() );
        }    
        
        System.out.println(p1.getPrecio());
        System.out.println(p2.getPrecio());
        
        System.out.println("Quieres añadir a tu cesta este producto? 1 para si | 2 --> para no");
        int elecc = sc.nextInt();
        System.out.println("Dime la cantidad del producto que quieras añadir");
        int num = sc.nextInt();
        if(elecc == 1){
            if(mayor == false){
                p1.setNumero_unidades(num);
                cesta.añadir(p1);
            }else if(mayor == true){
                p2.setNumero_unidades(num);
                cesta.añadir(p2);
            }
        }else if(elecc == 2){
            System.out.println("Esta bien");
        }else{
            System.out.println("Opción no válida");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Producto leche1 = new Producto("leche",1.32);
        Producto leche2 = new Producto("leche",2.78);
        Producto manzana1 = new Producto("manzana",0.32);
        Producto manzana2 = new Producto("manzana",0.83);
        Producto platano1 = new Producto("platano",0.40);
        Producto platano2 = new Producto("platano",1.32);
        Producto te1 = new Producto("te",1.32);
        Producto te2 = new Producto("te",1.00);
        Producto pollo1 = new Producto("pollo",5.00);
        Producto pollo2 = new Producto("pollo",5.34);
        Producto Avena1 = new Producto("Avena",2.00);
        Producto Avena2 = new Producto("Avena",2.50);
        Producto cafe1 = new Producto("cafe",1.00);
        Producto cafe2 = new Producto("cafe",1.70);
        Producto agua1 = new Producto("agua",2.00);
        Producto agua2 = new Producto("agua",2.32);
        Producto pera1 = new Producto("pera",2.00);
        Producto pera2 = new Producto("pera",0.20);
        Producto ron1 = new Producto("ron",12.00);
        Producto ron2 = new Producto("ron",8.00);
        
        Cesta cesta = new Cesta();
        
        Producto [] mercadona = {leche1,manzana1,platano1,te1,pollo1,Avena1,cafe1,agua1,pera1,ron1};
        Producto [] lidel = {leche2,manzana2,platano2,te2,pollo2,Avena2,cafe2,agua2,pera2,ron2};
        
        SuperMercado Mercadona = new SuperMercado("Mercadona",mercadona);
        SuperMercado Lidel = new SuperMercado("Lidel",lidel);
        
        
        System.out.println("BIEVENIDO AL SUPERCOMPARATOR");
        System.out.println("");
        
        boolean salir = true;
        do{
            System.out.println("Dime que opción prefieres");
            System.out.println("1 ---> Para comparar productos");
            System.out.println("2 ---> Para ver tu cesta de la compra");
            System.out.println("3 ---> Para salir");
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                    comparar(Mercadona,Lidel,cesta);
                    break;   
                case 2:
                    cesta.mostrar_cesta();
                    break;
                case 3: 
                    salir = false;
                    break;
            }
            
            
        }while(salir);
        
        
    }
    
}
