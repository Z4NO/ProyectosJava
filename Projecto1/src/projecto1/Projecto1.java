/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1;

import java.util.Scanner;
import javax.sound.midi.Soundbank;
import javax.xml.transform.OutputKeys;

        
        


public class Projecto1 {
    
  public static double media(int num1,int num2){
      double res = (num1 + num2)/2;
      return res;
  }
  
  public static int potencia(int b, int p){
      int res = 1;
      for(int i = 0; i <=p; i++){
        res = res*b;
      }
      return res;
  }
    

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad,nacimeinto,year,suma;
        int redondeo;
        double numero_elegir;
        double radio;
        double aerea;
        
        
        //float a = 5;
        //float b = 2;
        //System.out.println(a);
        //System.out.println(b);
        
        //float c = (a + b);
        //System.out.println("La suma de a + b = " + c );
        //System.out.println(a/b);
        
        //EJERCICIO GRADOS
         
       // float grado = 40;
         //   float grado_farenjei = 40 * 9/5 + 32;
          //  System.out.println("40 grados celsius a farengein da " + grado_farenjei);
        
        //Tipos de datos alfanuméricos
        
         //   char letra =  100;
         //   System.out.println("la letra es " + letra);
         //   char letra2 = 'b';
         //   System.out.println(letra - letra2);
        
        //Datos booleano
        
        //boolean respuesta = true;
        //System.out.println(respuesta);
         //boolean booleano1 = true;
        // boolean booleano2 = false;
         //System.out.println(booleano1 && booleano2);
        // // System.out.println(booleano1 || booleano2);
        // System.out.println(!booleano1);
         //System.out.println(!booleano2);
        
        //OPERADORES
       //int num1 = 3;
       //int num2 = 4;
       //System.out.println("¿es igual ?  " + (num1 == num2));
       
       //CASTING
        /*double num = 8.3;
        int resul = (int) num;
        System.out.println(resul);
        
        char let = 'a';
        int res = let;
        System.out.println(res);*/
        
        //int v = 20;
        //char tres = (char) v;
        //System.out.println(tres);
        
        //INPUTS 
        
        /*System.out.println("Introduce el año actual");
        
                
        year = sc.nextInt();
        System.out.println("Introduce el año de nacimeinto");
        nacimeinto = sc.nextInt();
        
        edad = year - nacimeinto;
        
        System.out.println("Tu edad es " + edad);*/
        
        /*System.out.println("Introduce un número real para redondear ");
      
        numero_elegir = sc.nextDouble();
        numero_elegir = numero_elegir + 0.5;
        redondeo = (int)numero_elegir;
        System.out.println("Tu número redondeado es " + (redondeo) );*/
        
        //EJERCICIO RADIO
        /*System.out.println("Vamos a calcular el raerea y longitud de un cículo, Introduzca su radio");
        radio = sc.nextDouble();
        radio = (int) radio;
        radio = Math.pow(radio, 2);
        System.out.println("El aerea del círculo es = "+ (Math.PI * radio));
        System.out.println("La longitud dek círculo es " + (2 * (Math.PI * radio)));*/
        
        //Ejercicio SEGUNDOS
       /* System.out.println("Introduce los segundos");
        double  seg;
        seg = sc.nextDouble();
        double hora;
        hora = seg/3600;
        hora = (int)hora;
        double minutos;
        minutos = (seg%3600) / 60;
        minutos = (int)minutos;
        double segundos;
        segundos = (seg%3600) % 60;
        System.out.println("Convertido a hora es " + hora + " con minutos = " + minutos +" con segundos " + segundos );*/
        
        
        
        //CONDICIONALES
        /*int numero;
        System.out.println("Escribe un número para saber si es par o impar");
        numero = sc.nextInt();
        
        if(numero%2 == 0){
            System.out.println("Este número es par");
        }
        else{
            System.out.println("Este númeor es impar");}*/
        
        //ej son iguales
        /*int num1;
        System.out.println("Dime un número");
        num1 = sc.nextInt();
        int num2;
        System.out.println("Dime otro numero");
        num2 = sc.nextInt();
        if(num1 == num2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");*/
        
        /*int num1;
        System.out.println("Dime un numero");
        num1 = sc.nextInt();
        int num2;
        System.out.println("Dime otro numero");
        num2 = sc.nextInt();
        int num3;
        System.out.println("Dime un tercer número");
        num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " es mayor que " + num2 + " y que " + num3 );
        }else if(num2 > num1 && num2 > num3){
            System.out.println(num2 +" es mayor que " + num1 + " y que " + num3);
        }else{
            System.out.println(num3 +" es mayor que " + num1 + " y que " + num2);
        }*/
        
        
        //EJERCICO ECUACIÓN SEGUNDO GRADO 
        /*
        double a , b , c;
        System.out.println("Dime el primer numero");
        a = sc.nextDouble();
        System.out.println("Dime el segundo numero");
        b = sc.nextDouble();
        System.out.println("Dime el tercer número");
        c = sc.nextDouble();
       
        double resto = ((b * b) - (4*a*c));
        if(resto > 0){
            if (a != 0){
                double raiz1 = (Math.sqrt(resto));
                double resultado1 = (-b + raiz1);
                double finale = (resultado1/(2*a));
                System.out.println(finale + "  ESte es un resultado de la ecuqacuión");
                double raiz2 = (Math.sqrt(resto));
                double resultado2 = (-b - raiz2);
                double finale2 = (resultado2/(2*a));
                System.out.println(finale2 + " ESte es el otro resultado de la ecuqacuión");
            }else
                System.out.println("A no puede ser mayor que cero");
           
        }else
            System.out.println("No se puede resolver porque la raíz es negativa");
                
        */
        
        /*
        System.out.println("Quieres jugar al quien es quien 1 = Sí | 2 = Salir del juego");
        
        int respuesta = sc.nextInt();
        if(respuesta == 1 ){
            System.out.println("Okey, vamos a jugar");
            System.out.println("Tu personaje tiene bigote? ");
            String bigote = sc.next();
            System.out.println("Tu personaje tiene perilla? ");
            String perilla = sc.next();
            System.out.println("Tu persona tiene pelo? ");
            String pelo = sc.next();
            System.out.println("Tu personaje tieene gafas? ");
            String gafas = sc.next();
            System.out.println("Tu personaje tiene gorro ?");
            String gorro = sc.next();
            System.out.println("Tu personaje tiene baraba ?");
            String barba = sc.next();
            if(bigote.equals("si") && gafas.equals("no")  && pelo.equals("no") && gorro.equals("no") && barba.equals("no") && perilla.equals("no")){
                System.out.println("Tu personaje es NIKE");
            }
            else if(pelo.equals("si") && gorro.equals("si") && bigote.equals("no") && gafas.equals("no") && perilla.equals("no")&& barba.equals("no")){
                System.out.println("Tu personaje es KIKO");
            }
            else if(gorro.equals("si") && gafas.equals("no") && pelo.equals("no") && barba.equals("no") && perilla.equals("no") && bigote.equals("no")){
                System.out.println("Tu personaje es MÓNICO");   
            }
            else if(gafas.equals("si") && pelo.equals("no") && gorro.equals("no") && barba.equals("no") && perilla.equals("no") && bigote.equals("no")){
                System.out.println("tu personaje es LUPAS");
            }
            else if(barba.equals("si") && pelo.equals("no") && gorro.equals("no") && gafas.equals("no") && perilla.equals("no") && bigote.equals("no")){
                System.out.println("Tu pesonaje es MEDINILLA");
            }
            else if(gorro.equals("si") && perilla.equals("si") && gafas.equals("no") && pelo.equals("no") && barba.equals("no") && barba.equals("no")){
                System.out.println("Tu personaje es ALEJANDRO");
            }   
        }if( respuesta == 2){
            
        }
        */
        
        /*
        System.out.println("Introduce tu nota ");
        int nota = sc.nextInt();
        
        if(nota > 0 && nota < 11){
          switch(nota){
            case 0,1,2,3,4:
                System.out.println("Tu nota es insuficiente");
                break;
            case 5:
                System.out.println("Tu nota es un aprobado");
                break;
            case 6:
                System.out.println("Tu nota es un bien");
                break;
            case 7,8:
                System.out.println("Tu nota es un notable");
                break;
            case 9,10:
                System.out.println("Tu nota es un sobresaliente");
                break;
          }
        }else
            System.out.println("Las notas van del 0 al 10");
        */
        /*
        
        if (nota > 0 && nota <11){
            if(nota == 0 ||nota  == 1 || nota  == 2 || nota  == 3 || nota  == 4){
            System.out.println("Tu nota es insuficiente");
           }
            else if(nota == 5 ){
                System.out.println("Tu nota es un aprobado");
            }
            else if(nota == 6){
                System.out.println("Tu nota es un bien");
            }
            else if(nota == 7 || nota == 8){
                System.out.println("Tu nota es Notable");
            }
            else if(nota == 9 || nota == 10){
                System.out.println("Tu nota es un sobresaliente");
            }
        }
        
        */
        
        /*while(true){
        System.out.println("hola, dime hola");
        String hola = sc.nextLine();
        if(hola.equalsIgnoreCase("hola")){
            System.out.println("AKSAJSALSA");
            break;
        }else{
            continue;
        }
                
        
        }*/
        
        
        /*
        System.out.println("Introduce un número del 1 al 8 ");
        int numero_dia;
        numero_dia = sc.nextInt();
        
        if(numero_dia > 0 && numero_dia < 9){
            switch(numero_dia){
                case 1:
                    System.out.println("Tu día es el lunes ");
                    break;
                case 2:
                    System.out.println("Tu día es el Martes ");
                    break;
                case 3:
                    System.out.println("Tu día es el Miércoles ");
                    break;
                case 4:
                    System.out.println("Tu día es el Jueves ");
                    break;
                case 5:
                    System.out.println("Tu día es el Viernes ");
                    break;
            }
        }else
            System.out.println("Tu número no es válido");
                
        */
        
        
        /*
        System.out.println("Dime la inicial de un día de la semana ");
        char letra;
        letra = sc.next().charAt(0);
        
        switch(letra){
            case 'L','l':
                System.out.println("Tu día es el lunes ");
                    break;
            case 'M','m':
                System.out.println("Tu día es el  Martes ");
                    break;
            case 'Mi':
                System.out.println("OdflkAÑLD")
                    break;
            case 'J','j':
                System.out.println("Tu día es el Jueves");
                    break;
            case 'V', 'v':
                System.out.println("Tu día es el Viernes ");
                    break;
        }
        
        */
        
        
        //BUCLES
        /*
        while(true){
        System.out.println("hola, dime hola");
        String hola = sc.nextLine();
        if(hola.equalsIgnoreCase("hola")){
            System.out.println("AKSAJSALSA");
            break;
        }else
            continue;
        }
        */
        /*
        System.out.println("Dime un número para saber si es par o impar, o introduce 0 para acabar el juego");
        int num2;
        num2 = sc.nextInt();
        int i = 1;
        if(num2 != 0 ){
            while(i<2){
                System.out.println("Dime un número para saber si es par o no");
                num2 = sc.nextInt();
                if(num2 == 0){
                    i++;
                }
                else if((num2 % 2) == 0){
                    System.out.println("Tu número es par");
                }else
                    System.out.println("Tu número es impar");
            }
        }else{
            
        }
         */ 
        
        /*
        int numero_random = (int)(Math.random() * 100);
        System.out.println(numero_random );
        int i = -1;
        int o = 0;
        while(i < o){
            System.out.println("Adivina el número del 1 al 100");
            int eleccion = sc.nextInt();
            if(eleccion == -1){
                o = (o-1);
            }
            else if(eleccion < numero_random){
                System.out.println("Tu número es menor ");
            }else if(eleccion > numero_random){
                System.out.println("Tu numero es mayor");
            }else{
                System.out.println("Felicidades has acertado en número");
                 o = (o-1);
            }
                
        }
           */
        /*
        int a = 1;
        do{
            System.out.println("hola"); 
            a++;
        }
        while(a<3);*/
        
        /*
        System.out.println("Introdce el primer valor del rango ");
            int a = sc.nextInt();
            System.out.println("introduce el segundo valor del rango");
            int b = sc.nextInt();
            System.out.println("Tu rango está esntre"+ a +"y"+ b);
        int l = 1;
        do{
            System.out.println("Introduce un valor para saber si está en el rango ");
            int c = sc.nextInt();
            if(c >= a && c <= b){
                System.out.println("Tu número está en el rango");
                l = 2;
        }
            else{
                System.out.println("Tu número no está en el rango");
            }
        }while(l < 2);*/
        
        
        /*
        int num_romper = 0;
        int tabla = 1;
        while(1 > num_romper){
            System.out.println("Introduce un número del 1 al 10");
            int a = sc.nextInt();
            if( a <= 10 && a >= 1){
                while(1 > num_romper){
            if(a >= 1 && a <= 10){
                System.out.println("Tu tabla es:");
                do{
                    System.out.println(a + "x" + tabla + "=" + (a * tabla ) );
                    tabla++;
                    if(tabla == 11){
                        num_romper = num_romper + 2;
                    }
                }while(1 > num_romper);
            }else{
                num_romper = num_romper + 2;
            }
            
        }
            }else{
                System.out.println("Tu número no es válido");
            }
        }
        */
        
        //PRIMER EXAMEN DE PROGRAMACIÓN CORRECCIÓN.
        /*
        int res = 0;
        int a = 0;
        while(a < 99){
            res = res + a;
            a = a + 3;
            System.out.println( a + ";");
        }
        
        System.out.println("resultado: " + res);*/
        
        //IMPORTANTE EXPPLICACIÓN BUCLES FOR
        /*
        for(int i = 0;  i < 3 ; i++){
            for(int j = 0; j < 3 ; j++){
                System.out.print("2");
            }
            System.out.println("");
        }
        */
        /*
        int cont = 0;
        for(int i = 0; i < 3 ; i++){
                for(int j = 0; j < 3 ; j++){
                    cont++;
                    System.out.print(cont);
                }
         System.out.println(""); 
         cont = 0;
        }
        */
        /*
         for(int i = 0; i < 4  ; i++){
             
            for(int j = 3 ; j > i; j--){
                
                System.out.print("+");
            }
           System.out.println("+");
        }*/
        
        //ARRAYS ++++++++++++++++++++
        
        
           int [] array ={5,3,2,1,7};
        System.out.print(array[0]);
       
         
        
        
 }
    
}
