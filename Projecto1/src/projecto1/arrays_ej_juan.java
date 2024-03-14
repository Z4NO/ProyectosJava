/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projecto1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class arrays_ej_juan {
    
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in); 
        
        //distintos metodos para crear arrays 
        //int [] array= {5,3,2,1,7};
        //System.out.println(array[0]);
        //int[] array= new int [3];
        //System.out.println(array[0]);
        
        //para cambiar el valor de la posicion
        /*
        array[0]=2;
        array[1]=3;
        System.out.println(array[0]+";"+array[1]+";"+array[2]);

        
        //Array que el usuario escribe 4 numeros
        Scanner sc = new Scanner(System.in);
        int [] array = new int [4];
        for(int i=0;i<4;i++){
            array[i] = sc.nextInt();
        }
        // dos maneras diferentes de mostrar un array por pantalla una con bucle for y otra sin bucle
        for(int i=0;i<4;i++){
            System.out.print(array[i] + ":---");
        }
        System.out.println(array[0]+";"+array[1]+";"+array[2]+";"+array[3]);

 */   
        /*
        //array tamaño 7 el usuario pone los valores; el resultado de la suma de los valores del array
        Scanner sc = new Scanner(System.in);
        int [] array = new int [7];
        for(int i = 0;i<7;i++){
            array[i] = sc.nextInt();
        }
        
        System.out.println(sumaArray(array));

        for (int i=0;i<7;i++){
            suma= array[i]+suma;
        }
        System.out.println(suma);

        
        //array que el usuario introduzca el tam´ño del array, el usuario introduce los valores del tamaño, se muestra y a la inversa
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cuantas posiciones tiene el array");
        int [] array= new int[sc.nextInt()];
        
        for(int i =0;i<array.length;i++){
            System.out.println("Introduce valores del array");
            array[i]=sc.nextInt();
          }
        for(int i =0;i<array.length;i++){
        System.out.print(array[i]);
        
        }
        for(int i = array.length-1;i>=0;i--){
            System.out.print(array[i]);
        }

        
        int []a = {3,2,7};
        int []b = new int [3];
        b=a;
        System.out.println(b[0]);
        a[0]=5;
        System.out.println(b[0]);

        //generar un array de tamaño 3 random de numeros y introducir 3 numeros por consola y chequear si es la combinacion
        // si no son pedir otra vez numeros, si pone num negativo se sale
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, numero3;
        int [] array = new int [3];
        for(int i =0; i<3; i++){
            array[i]= (int) (Math.random()*10 +1);
            
        }
        System.out.println(Arrays.toString(array));
        int []array2= new int[3];
        for(int i=0;i<3;i++){
            array2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(array2));
        boolean respuesta;
        if(respuesta=true){
            System.out.println("Correcto");
        }
        while(!(Arrays.equals(array,array2))){
        if(Arrays.equals(array,array2)) {
                respuesta=true;
                System.out.println("Correcto");
            } else {
                respuesta=false;
                System.out.println("Introduce otra vez");
                for(int i=0;i<3;i++){
                    array2[i]=sc.nextInt();
                    
        }
                
            }
        }  

        char a []= new char[5];
        Arrays.fill(a,'_');
        System.out.println(Arrays.toString(a));


        //creo un array fijo y luego uno segundo introduce tamaño y numeros tamaño minimo 3, los compara y ver si los valores del segunda estan en el uno
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce array 1");
        int[] array1 = {1,2,3};
        
        System.out.println(array1.toString());
        System.out.println("Introduce dimensiones del Array 2");
        int [] array2 = new int [sc.nextInt()];
        System.out.println("Introduce elementos del array");
        for(int i=0; i<array2.length; i++){
            array2[i]=sc.nextInt();
        }
        System.out.println(comparar(array1,array2));
        
        // para un equals y comparar se usa Arrays.equals(a,0,2,b,0,2) compara dos arrays hasta cuando quieras
        
        */
        /*
        Scanner sc = new Scanner(System.in);
        int intentos;
        int fallos=0;
        char letra;
        boolean aux;
        System.out.println("Indica intentos");
        intentos= sc.nextInt();
        System.out.println("Introduce dimensión Array con palabras");
        char [] array1 = new char [sc.nextInt()];
        System.out.println("Introduce las letras");
        for(int i =0;i<array1.length;i++){
            array1[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(array1));
        char [] array2 = new char [array1.length];
        Arrays.fill(array2,'-');
        System.out.println(Arrays.toString(array2));
        do{
        aux=false;
        System.out.println("Introduce una letra");
        letra = sc.next().charAt(0);
        for(int i=0;i<array1.length;i++){
            if(letra==array1[i]){
                array2[i]=letra;
                aux = true;
                
            
            }
            
        }
      
        
            if(!aux){
                System.out.println("Letra incorrecta");
                intentos--;
                System.out.println("Intentos restantes: "+ intentos);
            } 
            else{
                 System.out.println(Arrays.toString(array2));
            }
        
        }      
        while(!(Arrays.equals(array1, array2)) || (intentos==0));
        
        
    }  
    
    public static int sumaArray(int [] suma){
        int result=0;
        for(int i=0;i<7;i++){
            result= suma[i]+result;
        }
        return result;
    
}
    
    public static boolean comparar(int [] array,int array1[]){
        
        boolean aux = true;
        
        /*if(array[0]==array1[0] && array[1]==array1[1] && array[2]==array1[2]){
            return true;
        } else {
            return false;
        }
        
*/
        /*
        for(int i =0;i<array.length;i++){
            
            if(array[i]!=array1[i]){
                aux= false;
            } 
            
        }
        return aux;
        */
        
        
        
        
        
        System.out.println("Indica la dimensión de la araray a mover ");
        int [] array = new int[sc.nextInt()];
        System.out.println("Introduce los númeors");
        for(int i =0;i<array.length;i++){
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
        
        int[] no = new int[array.length + 1];
        
        for(int i = 0; i < array.length; i++){
            no[i] = array[i];
        }
           
       
        System.out.println("Dime la posicion de la array en la que insertar el array");
        int posicoin = sc.nextInt();
        
        System.out.println("Dime el númeor a introducir");
        int numero = sc.nextInt();
        
        
        for(int i= posicoin; i < array.length;i++){
            int actual = no[i];
            no[i +1] = actual;
            no[posicoin] = numero;
         
        }
        System.out.println(Arrays.toString(no));
    }
    
}
