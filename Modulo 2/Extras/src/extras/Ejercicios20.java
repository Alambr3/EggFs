/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector. */

package extras;
import java.util.Scanner;

public class Ejercicios20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int [] nums = new int [5];
        
        rellena(nums);
    }
    
    public static void rellena(int [] nums){
        for (int i = 0; i < 5; i++){
            nums[i] = (int) (Math.random()*9+1);
        }
        imprime(nums);
    }
    
    public static void imprime(int [] nums) {
        for (int i = 0; i < 5; i++){
            System.out.print(nums[i] + " ");
        }
    }
}