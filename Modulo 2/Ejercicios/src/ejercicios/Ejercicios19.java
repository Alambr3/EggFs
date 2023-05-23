package ejercicios;
import java.util.Scanner;

public class Ejercicios19 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       int aux = 0;
             
        int[][] nums = new int[4][4];
        int[][] nums2 = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random()*9+1);
                nums2[i][j] = (int) (Math.random()*9+1);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (nums[j][i] != nums2[i][j]) {
                aux++;    
                }
            }
        }
        
        if (aux > 0) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz es simetrica");
        }
    }

}