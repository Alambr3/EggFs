/* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break. */

package extras;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int num, cont = 0, contP = 0, contI = 0;
        do {
            do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            } while (num < 1);
            cont++;
            if (num % 2 == 0){
                contP++;
            } else {
                contI++;
            }
           
        } while (num % 5 != 0);
        
        System.out.println("Se ingresaron " + cont + " numeros");
        System.out.println(contP + " numeros par");
        System.out.println(contI + " numeros impar");
    }
    
}