/* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario. */

package extras;
import java.util.Scanner;

public class Ejercicios18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int total = 0;
        
        System.out.println("Ingrese tamaño del vector");
        int tam = leer.nextInt();
        
        int [] numeros = new int [tam];
        
        System.out.println("Ingrese numeros");
        for (int i = 0; i < tam; i++) {
            numeros[i] = leer.nextInt();
            total += numeros[i];
        }
        System.out.println("La suma es: " + total);
    }

}