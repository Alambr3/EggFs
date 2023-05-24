/* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”. */

package extras;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int num, total = 0, max = 0, min = 0;
        System.out.println("Ingrese cantidad de valores a ingresar");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++){
        do {
        System.out.println("Ingrese numero " + (i+1));
        num = leer.nextInt();
        } while (num <= 0);
        total += num;
        if (num > max){
            max = num;
        }
        if (i == 0) {
            min = num;
        }
        if (num < min && i > 0){
            num = min;
        }
        }
        
        System.out.println("El promedio de los valores es: " + (double) (total/cant));
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimoo es: " + min);
    }

}