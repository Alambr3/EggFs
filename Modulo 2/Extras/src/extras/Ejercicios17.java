/* Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es
primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. */

package extras;
import java.util.Scanner;

public class Ejercicios17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese numero");
        int num = leer.nextInt();
       
        if (comprobador(num) == true) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }
    }
    
    public static boolean comprobador(int num) {
        int count = 0;
        for (int i = 1; i < (num+1); i++){
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }
}