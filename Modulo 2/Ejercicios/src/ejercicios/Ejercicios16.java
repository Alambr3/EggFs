/* Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido */

package ejercicios;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        Random r = new Random();
        int aux = 0;
        System.out.println("Ingrese tamaño del vector");
        int tam = leer.nextInt();
        
        int[] nums = new int[tam]; 
        
        for (int i = 0; i < tam; i++) {
            nums[i] = r.nextInt(10)+1;
        }
        
        for (int k = 0; k < tam; k++) {
            System.out.println(nums[k]);
        }
        
        System.out.println("Ingrese el numero a buscar en el array");
        int find = leer.nextInt();
        
        for (int j = 0; j < tam; j++) {
            if (nums[j] == find) {
                System.out.println("Se encontró el numero en la posicion " + j + " del array");
                aux++;
            }
        }
        
        if (aux < 1) {
            System.out.println("No se encontró el valor en el array");
        }
    }
}