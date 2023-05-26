/* Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos). */

package extras;
import java.util.Scanner;

public class Ejercicios19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int [] vec1 = new int [5];
        int [] vec2 = new int [5];
        
        for (int i = 0; i < 5; i++){
            vec1[i] = (int) (Math.random()*9+1);
            vec2[i] = (int) (Math.random()*9+1);
        }

//        for (int i = 0; i < 5; i++){
//            vec1[i] = (int) (Math.random()*3+1);
//            System.out.print(vec1[i] + " ");
//        }
//        
//        System.out.println("");
//        
//        for (int k = 0; k < 5; k++){
//            vec2[k] = (int) (Math.random()*3+1);
//            System.out.print(vec2[k] + " ");
//        }
//
//        System.out.println("");
        
         for (int j = 0; j < 5; j++){
            if (vec1[j] != vec2[j]) {
                System.out.println("Corroborando valor " + (j+1));
                System.out.println("Se detecto un numero desigual");
                break;
            }    
        }
    }

}