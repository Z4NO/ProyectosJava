/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecto1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class ARRAYS {
    
    public static int sumaarray(int[] suma_array,int sum){
        int resultado = 0;
        
        for(int i = 0; i < sum; i++){
            resultado = suma_array[i] + resultado;
            
        }
        
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        /*
        int [] array ={5,3,2,1,7};
        System.out.print(array[0]);*/
        
        /*
        int [] array2 = new int[3];
        array2[0] = 2;
        array2[1] = 3;
        System.out.println(array2[0]+";"+array2[1]+";"+array2[2]+";");*/
        /*
        System.out.println("Cual quieres que sea el tamaño de la array");
        int num = sc.nextInt();
        
        int [] array_user = new int[num];
        for(int i = 0; i < num; i++){
            System.out.println("INTRODUCE LOS VALORES DEL ARRY");
            array_user[i] = sc.nextInt();
        }
        
        
        for(int i = 0; i <4; i++){
            System.out.print(array_user[i] +";");
           
        }
        System.out.println("");
    
        for(int i = 0; i < 4; i++){
             suma = array_user[i] + suma;
           
        }
        System.out.println(suma);

        
        
        System.out.println("La suma es " + sumaarray(array_user,num));
        
        for(int i = num - 1 ; i >= 0  ; i--){
           System.out.print(array_user[i]+";");
        }
        System.out.println("");
        
        int size = array_user.length;
        System.out.println(size);*/
        
        /*
        System.out.println("De que longitud quieres que sea tu combinación ?");
        int longitud = sc.nextInt();
        
        int [] combinaciob = new int[longitud];
        for(int i = 0; i < longitud ; i++){
            combinaciob[i] = (int)(Math.random()*10);
            System.out.print(combinaciob[i]+";");
        }
        System.out.println("");
        int romper = 0;
        while(romper < 1){
            int [] adivinar = new int[longitud ];
            for(int i = 0; i < longitud ; i++){
                System.out.println("Ve diciéndome los numeros de tu combinación, en este caso deben de ser "+longitud+" números");
                int numero = sc.nextInt();
                adivinar[i] = numero;
            }
            if(Arrays.equals(combinaciob,adivinar)){
                System.out.println("Combinación correcta");
                romper = 2;
            }else{
                System.out.println("Combinación incorrecta");
                continue;
            }
        }
        
        */
        /*
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
        System.out.println(Arrays.toString(no));
        System.out.print("Dime la posicion de la array en la que insertar el array");
        int posicoin = sc.nextInt();
        
        System.out.println("Dime el númeor a introducir");
        int numero = sc.nextInt();
        
        
        for(int i= posicoin; i < no.length;i++){
            no[i] = numero;
            posicoin++;
            numero = i;
        }
        System.out.println(Arrays.toString(no));
        */
        
        char [] [] tablero = new char [10][10];
        
        for(int i = 0; i<tablero.length; i++){
            for(int j = 0; j < tablero.length; j++){
                System.out.println(tablero[i][j]);
            }
        }
        
        
//ÚLTIMOS PARÉNTESISI   
    }
}
