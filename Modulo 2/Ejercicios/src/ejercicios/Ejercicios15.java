/* Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente. */

package ejercicios;

public class Ejercicios15 {

    public static void main(String[] args) {
        
        int[] nums = new int[100]; 
        
        for (int i = 0; i < 100; i++){
            nums[i] = i + 1;
        }
        
        for (int i = 99; i > 0-1; i--){
            System.out.println(nums[i] + " ");
        }
    }
    
}