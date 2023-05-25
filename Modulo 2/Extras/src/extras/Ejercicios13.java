/* Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123 
*/

package extras;
import java.util.Scanner;

public class Ejercicios13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int cont = 1;
        System.out.println("Ingrese altura de la piramide");
        int alt = leer.nextInt();
        
        do {
            for (int i = 0; i < cont; i++){
                System.out.print(i+1);
            }
            System.out.println("");
            cont++;
        } while (cont < (alt+1));
    }

}