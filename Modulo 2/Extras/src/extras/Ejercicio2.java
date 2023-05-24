/* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,

49
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar. */

package extras;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int a = 1, b = 2, c = 3, d = 4, aux;
       
       aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
       
       System.out.println("a: " + a);
       System.out.println("b: " + b);
       System.out.println("c: " + c);
       System.out.println("d: " + d);
        
    }

}