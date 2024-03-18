/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1000km;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;

public class MESA {

    public static void Crear_cartas_defensa(LinkedList <Carta> cartas1){
        for(int i = 0; i < 8; i++){
            Carta carta = new Carta(1,0,false,"Semáforo en verde");
            carta.setSemaforo_verde(true);
            cartas1.add(carta);
        }
        for(int i = 0; i < 8; i++){
            Carta carta = new Carta(1,0,false,"Añade_gasolina");
            carta.setAñadir_gasolina(true);
            cartas1.add(carta);
        }
    }
    public static void Crear_cartas_ataque(LinkedList <Carta> cartas1){
        for(int i = 0; i < 8; i++){
            Carta carta = new Carta(2,0,true,"Semáforo en rojo");
            carta.setSemaforo_rojo(true);
            cartas1.add(carta);
        }
        for(int i = 0; i < 8; i++){
            Carta carta = new Carta(2,0,true,"Añade gasolina");
            carta.setSin_gasolina(true);
            cartas1.add(carta);
        }
    }
    public static void Crear_cartas_avanzar(LinkedList <Carta> cartas1){
        for(int i = 0; i < 8;i++){
            if(i <2){
                cartas1.add(new Carta(3,25,false,"Avanza 25 KM"));
                cartas1.add(new Carta(3,50,false,"Avanza 50 KM"));
                cartas1.add(new Carta(3,75,false,"Avanza 75 KM"));
                cartas1.add(new Carta(3,150,false,"Avanza 150 KM"));
                cartas1.add(new Carta(3,200,false,"Avanza 200 KM"));
            }else{
               cartas1.add(new Carta(3,100,false,"Avanza 100 KM"));
            }
        }
    }
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       LinkedList <Carta> cartas1 = new LinkedList <>();
       LinkedList <Carta> jugador1 = new LinkedList <>();
       LinkedList <Carta> jugador2 = new LinkedList <>();
       
       Jugaador player = new Jugaador(0,"Dani");
       Jugaador player2 = new Jugaador(0,"Pepe");
       
       
       Crear_cartas_defensa(cartas1);
       Crear_cartas_ataque(cartas1);
       Crear_cartas_avanzar(cartas1);
       
       Collections.shuffle(cartas1);
       
       for(int i = 0; i < 6; i++){
           jugador1.add(cartas1.pollFirst());
           jugador2.add(cartas1.pollFirst());
       }
      
       int cont_turnos = 1;
       int cont_km_jugador1 = 0;
       int cont_km_jugador2 = 0;
       
        LinkedList <Carta> mesa1 = new LinkedList <>();
        LinkedList <Carta> mesa2 = new LinkedList <>();
        
       do{ 
           System.out.println("___________ TURNO: "+ cont_turnos + " ______________");
           System.out.println("");
           if(cont_turnos%2 == 0){
               System.out.println("KILOMETROS RECORRIDOS JUGADOR2: " + cont_km_jugador2);
           }else{
               System.out.println("KILOMETROS RECORRIDOS JUGADOR1: " + cont_km_jugador1);
           }
           System.out.println("");
           System.out.println(mesa1);
           System.out.println(mesa2);
           System.out.println("");
           if(cont_turnos%2 == 0){
               System.out.println("MAZO DEL JUGADOR 2: " + jugador2);
           }else{
               System.out.println("MAZO DEL JUGADOR 1: " + jugador1);
           }
           System.out.println("");
           System.out.println("DIME LA POSICIÓN DE LA CARTA QUE QUIERAS USAR");
           int opc = sc.nextInt();
           
           if(cont_turnos%2 != 0){
               if(jugador1.get(opc).getTipo() == 3){
                   if(player.isPoder_avanzar() == false){
                       if(player.isSemafaro_rojo() == true){
                           System.out.println("No puedes avanzar porque tienes un semáforo en rojo");
                           jugador1.remove(opc);
                       }else if(player.isGasolina_rojo() == true){
                           System.out.println("No puedes avanzar porque no tienes gasolina");
                           jugador1.remove(opc);
                       }else if(mesa1.size() < 1){
                           System.out.println("No puedes avanzar porque tienes que hechar un semáforo en verde la primera vez que te mueves"); 
                           jugador1.remove(opc);
                       }
                   }else{
                       player.setKilometraje(jugador1.get(opc).getDistancia());
                       cont_km_jugador1 = cont_km_jugador1 + jugador1.get(opc).getDistancia();
                       mesa1.add(jugador1.get(opc));
                       jugador1.remove(opc);
                   }
                }else if(jugador1.get(opc).getTipo() == 2){
                   if(player.isPoder_avanzar() == false && player2.isSemafaro_rojo() == true){
                       System.out.println("No puedes añadir un semáfaro en rojo porque el jugador ya está nerfeado");
                       jugador1.remove(opc);
                   }else if(jugador1.get(opc).isSemaforo_rojo() == true){
                       mesa2.add(jugador1.get(opc));
                       player2.setSemafaro_rojo(true);
                       player2.setPoder_avanzar(false);
                       System.out.println("Ahora el jugador 2 no puede avanzar hasta que no heche una carta de semáforo en verde");
                       jugador1.remove(opc);
                   }
                   else if(player.isPoder_avanzar() == false && (player2.isGasolina_rojo()== true)){
                       System.out.println("No puedes añadir un semáfaro en rojo porque el jugador ya está nerfeado");
                       jugador1.remove(opc);
                   }else if(jugador1.get(opc).isSin_gasolina() == true){
                     mesa2.add(jugador1.get(opc));
                     player2.setGasolina_rojo(true);
                     player2.setPoder_avanzar(false);
                     System.out.println("Ahora el jugador 2 no puede avanzar hasta que no heche una carta de repostar gasolina");
                     jugador1.remove(opc);
                   }
                   
                }else if(jugador1.get(opc).getTipo() == 1){
                    if(jugador1.get(opc).isSemaforo_verde() == true && mesa1.size() == 0){
                        mesa1.add(jugador1.get(opc));
                        jugador1.remove(opc);
                        player.setPoder_avanzar(true);
                        System.out.println("AHORA YA PUEDES AVANZAR");
                    }
                    else if(mesa1.getLast().isSemaforo_rojo() == true && jugador1.get(opc).isSemaforo_verde() == true){
                        mesa1.removeLast();
                        mesa1.add(jugador1.get(opc));
                        jugador1.remove(opc);
                        player.setPoder_avanzar(true);
                        player.setSemafaro_rojo(false);
                        System.out.println("");
                        System.out.println("AHORA YA PUEDES AVANZAR, SEMÁFORO EN ROJO QUITADO");
                    }
                }
             jugador1.add(cartas1.pollFirst());
            }else{
               if(jugador2.get(opc).getTipo() == 3){
                   if(player2.isPoder_avanzar() == false){
                       if(player2.isSemafaro_rojo() == true){
                           System.out.println("No puedes avanzar porque tienes un semáforo en rojo");
                           jugador2.remove(opc);
                       }else if(player2.isGasolina_rojo() == true){
                           System.out.println("No puedes avanzar porque no tienes gasolina");
                           jugador2.remove(opc);
                       }else if(mesa1.size() < 1){
                           System.out.println("No puedes avanzar porque tienes que hechar un semáforo en verde la primera vez que te mueves"); 
                           jugador2.remove(opc);
                       }
                   }else{
                       player2.setKilometraje(jugador2.get(opc).getDistancia());
                       cont_km_jugador2 = cont_km_jugador2 + jugador2.get(opc).getDistancia();
                       mesa2.add(jugador2.get(opc));
                       jugador2.remove(opc);
                   }
                }else if(jugador2.get(opc).getTipo() == 2){
                   if(player2.isPoder_avanzar() == false && player.isSemafaro_rojo() == true){
                       System.out.println("No puedes añadir un semáfaro en rojo porque el jugador ya está nerfeado");
                       jugador2.remove(opc);
                   }else if(jugador2.get(opc).isSemaforo_rojo() == true){
                       mesa1.add(jugador2.get(opc));
                       player.setSemafaro_rojo(true);
                       player.setPoder_avanzar(false);
                       System.out.println("Ahora el jugador 1 no puede avanzar hasta que no heche una carta de semáforo en verde");
                       jugador2.remove(opc);
                   }
                   if(player2.isPoder_avanzar() == false && (player.isGasolina_rojo()== true)){
                       System.out.println("No puedes añadir un semáfaro en rojo porque el jugador ya está nerfeado");
                       jugador2.remove(opc);
                   }else if(jugador2.get(opc).isSin_gasolina() == true){
                     mesa1.add(jugador1.get(opc));
                     player.setGasolina_rojo(true);
                     player.setPoder_avanzar(false);
                     System.out.println("Ahora el jugador 1 no puede avanzar hasta que no heche una carta de repostar gasolina");
                     jugador2.remove(opc);
                   }
                   
                }else if(jugador2.get(opc).getTipo() == 1){
                    if(jugador2.get(opc).isSemaforo_verde() == true && mesa2.size() == 0){
                        mesa2.add(jugador2.get(opc));
                        jugador2.remove(opc);
                        player2.setPoder_avanzar(true);
                        System.out.println("AHORA YA PUEDES AVANZAR");
                    }
                    else if(mesa2.getLast().isSemaforo_rojo() == true && jugador2.get(opc).isSemaforo_verde() == true){
                        mesa2.removeLast();
                        mesa2.add(jugador2.get(opc));
                        jugador2.remove(opc);
                        player2.setPoder_avanzar(true);
                        player2.setSemafaro_rojo(false);
                        System.out.println("");
                        System.out.println("AHORA YA PUEDES AVANZAR, SEMÁFORO EN ROJO QUITADO");
                    }
                }
             jugador2.add(cartas1.pollFirst());
           }
           System.out.println("");
           System.out.println("__________________________________");
           
           cont_turnos++;
       }while(player.getKilometraje() < 1000 && player2.getKilometraje() < 1000);

        }     
    }     
           
