/* Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa). */

package ejercicios;
import java.util.Scanner;

public class Ejercicios18 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       
        int[][] nums = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random()*9+1);
            }
        }
        
//         for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println("");
//        }
//        
//          System.out.println("");
         
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[j][i] + " ");
            }
        System.out.println("");
        }
    }

}