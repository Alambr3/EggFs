package ejercicios;
import java.util.Scanner;

public class Ejercicios15 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] nums = new int[100]; 
        
        for (int i = 0; i < 100; i++){
            nums[i] = i + 1;
        }
        
        for (int i = 100; i > 0; i--){
            System.out.print(nums[i] + " ");
        }
    }
    
}
