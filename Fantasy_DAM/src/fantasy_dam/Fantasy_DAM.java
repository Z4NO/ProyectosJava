/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy_dam;

import java.util.Scanner;
import java.util.Arrays;

public class Fantasy_DAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jugador jugadores [] = new Jugador [22];
        
        Jugador plantilla [] = new Jugador [11];
        
        System.out.println("Bienvenido al Fantasy de la calse 1B DAM");
        System.out.println("Vamos a rellenar la lista de jugadores con 22 jugadores");
        
        boolean correcto = true;
        int o = 0;
        
        for(int i = 0; i < 22; i++){
            String nombre_ini ="";
            String posicion_ini ="";
            double valor_ini = 0.0;
            Jugador j1 =new Jugador(nombre_ini,posicion_ini,valor_ini);
            System.out.println("Dime el nombre del jugador");
            String nombre = sc.next();
            j1.setNombre(nombre);
            do{
                System.out.println("Dime la posición en la que va a jugar ( 1 para  portero, 2 para delantero, 3 para defensa o 4 para centrocampista)");
                int posicion = sc.nextInt();
                if(posicion == 1 || posicion == 2 || posicion == 3 || posicion == 4){
                    switch(posicion){
                        case 1:
                            j1.setPosicion("portero");
                            break;
                        case 2:
                            j1.setPosicion("delantero");
                            break;
                        case 3:
                            j1.setPosicion("defensa");
                            break;
                        case 4:
                            j1.setPosicion("centrocampista");
                            break;
                    }
                    correcto = false;
                }else{
                    System.out.println("Has puesto una posición no válida, porfavor revisa que elijas una posición indicada");
                }
            }while(correcto);
            System.out.println("Dime el valor de mercado que va a tener el jugador");
            double valor = sc.nextDouble();
            j1.setValor(valor);
            jugadores[o] = j1;
            o++;
        }
        
        
        
        int contador = 0;
        int contador_plan = 0;
        int contador_porteros = 0;
        int contador_delantero = 0;
        int contador_defensa = 0;
        int contador_centrocampista =0;
        
        boolean salir2 = true;
        
        do{
            int pos = (int)(Math.random()*22);
            System.out.println(pos);
            if(jugadores[pos] != null && contador_plan < 11){
                if(contador_porteros < 2 || contador_delantero < 5 || contador_defensa < 6 || contador_centrocampista < 6){
                    plantilla[contador_plan] = jugadores[pos];
                    if(jugadores[pos].getPosicion().equals("portero")){
                        contador_porteros++;
                    }
                    else if(jugadores[pos].getPosicion().equals("delantero")){
                        contador_delantero++;
                    }
                    else if(jugadores[pos].getPosicion().equals("defensa")){
                        contador_defensa++;
                    }
                    else if(jugadores[pos].getPosicion().equals("centrocampista")){
                        contador_centrocampista++;
                    }
                    jugadores[pos] = null;
                    contador++;
                    contador_plan++;
                }
                else if(contador == 11){
                    salir2 = false;
                }
            }  
        }while(salir2);
        
        boolean salir = true;
        
        do{
            System.out.println("Que opción te gustaría elegir");
            System.out.println("1 - Para mostrar la plantilla");
            System.out.println("2 - Para cambiar a un jugador");
            System.out.println("3 - Para mostrar el valor total del equipo");
            System.out.println("4 - Para salir del menu");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    for(int i = 0; i < plantilla.length; i++){
                        if(plantilla[i] != null){
                            System.out.println(plantilla[i].toString());
                            System.out.println(" y su posición dentro de la lista platinlla es " + i );
                        }
                    }
                    break;
                case 2:
                    System.out.println("Aquí te muestro todos los jugadores disponibles para elegir");
                    for(int i = 0; i < plantilla.length; i++){
                        if(jugadores[i] != null){
                            System.out.println(jugadores[i].toString());
                            System.out.print(" y su posición dentro de la lista platinlla es " + i );
                        }
                    }
                    System.out.println("Aquí te muestro todos los jugadores disponibles  de tu plantilla");
                    for(int i = 0; i < plantilla.length; i++){
                        if(plantilla[i] != null){
                            System.out.println(plantilla[i].toString());
                            System.out.print(" y su posición dentro de la lista platinlla es " + i );
                        }
                    }
                    System.out.println("Dime la posicion de la lista de jugaores para elegir el que quieres coger");
                    int eleccion_1 = sc.nextInt();
                    Jugador primero = jugadores[eleccion_1];
                    System.out.println("Dime la posicion de la lista de tu plantilla para ser cambiado");
                    int eleccion_2 = sc.nextInt();
                    Jugador segundo = jugadores[eleccion_2];
                    
                    jugadores[eleccion_1] = segundo;
                    plantilla[eleccion_2] = primero;
                    
                    System.out.println("Tu plantilla ha sido cambiada");
                    break;
                case 3:
                    double valor_plantilla = 0;
                    for(int i = 0; i < plantilla.length; i++){
                        if(plantilla[i] != null){
                            double valor_jugador = plantilla[i].getPrecio();
                            valor_plantilla = valor_plantilla + valor_jugador;
                        }
                    }
                    System.out.println("El valor de tu plantilla es de " + valor_plantilla);
                    break;
                case 4:
                    salir = false;
                    System.out.println("Gracias por utilizar este Fantasy");
                    break;
            }
            
        }while(salir);
        
    }
    
}
