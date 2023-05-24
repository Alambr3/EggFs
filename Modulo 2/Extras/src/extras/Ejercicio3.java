/* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String. */

package extras;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       
        System.out.println("Ingese una letra");
        String letra = leer.nextLine();
        
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)){
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }
    }

}