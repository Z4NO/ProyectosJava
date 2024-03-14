/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_corriente;

/**
 *
 * @author Medac
 */
public class Cuentas {
    
    private String nombre;
    private double limite;
    private String dni;
    private double saldo;
    Persona persona;
    
    Cuentas(Persona persona, double saldo_e, double limite_e){
        this.persona = persona;
        this.saldo = saldo_e;
        this.limite = limite_e;
        System.out.println("");
        
    }
    
    
    Cuentas(String nombre_cuenta, String nuevo_DNI){
        this.nombre = nombre_cuenta;
        this.dni = nuevo_DNI;
        this.saldo = 0.0;
        this.limite = -50.0;
        System.out.println("");
        System.out.println("NUEVA CUENTA CREADA CON LOS SIGUIENTES DATOS");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DNI DE LA CUENTA: " +dni);
        System.out.println("CON SALDO: " + saldo);
    }
    
    /*
    Cuentas(String nombre_cuenta, String nuevo_DNI, double saldo_e, double limite_e){
        this.nombre = nombre_cuenta;
        this.dni = nuevo_DNI;
        this.saldo = saldo_e;
        this.limite = limite_e;
        System.out.println("");
        System.out.println("NUEVA CUENTA CREADA CON LOS SIGUIENTES DATOS");
        System.out.println("NOMBRE: " + nombre);
        System.out.println("DNI DE LA CUENTA: " +dni);
        System.out.println("CON SALDO: " + saldo);
        System.out.println("CON LÍMITE DE: "+ limite);
    }
    */
    public Cuentas(double e){
        if(e > 0){
            System.out.println("");
            System.out.println("CUNETA CREADA SOLO CON EL SALDO ");
            this.saldo = e;
            this.limite = -50.0;
            System.out.println("SALDO: " + saldo);
        }else{
            System.out.println("");
            System.out.println("No puedes crear una cuenta con números en rojos desde el inicio de esta");
        }
    }
    
    
    
    public void mostrar(){
        System.out.println("");
        System.out.println("SALDO DE LA CUENTA: " + saldo);
        System.out.println("NOMBRE DE LA CUNETA: "+ nombre);
        System.out.println("DNI DE LA CUENTA: "+ dni);
    }
    
    public void ingresar(double  e){
        this.saldo = saldo + e;
        System.out.println("");
        System.out.println("La cuenta a nombre de "+ nombre + " ahora tiene de saldo " + saldo);
    }
    
    public void retirar(double e){
        if(saldo - e >= limite){
            this.saldo = saldo -e;
            System.out.println("");
            System.out.println("Se ha retirado " + e+ " euros  de tu cuenta, ahora su saldo es de  " + saldo);
        }else{
            System.out.println("");
            System.out.println("No puedes sobrepasar el límite de tu cuenta que es "+ limite+ ". Tu cuenta actualmente tine " + saldo);
        }
    }
    
    
    
}


