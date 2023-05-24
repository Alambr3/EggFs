/* Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java. */

package extras;
import java.util.Scanner;

public class Ejercicios10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        int aleatorio = ((int) (Math.random()*10+1) * (int) (Math.random()*10+1)), num1;
        
        do {
            System.out.println("Ingrese el numero");
            num1 = leer.nextInt();
            if (num1 > aleatorio) {
                System.out.println("Incorrecto! el numero es menor");
            }
            if (num1 < aleatorio) {
                System.out.println("Incorrecto! el numero es mayor");
            }
        } while (aleatorio != num1);
        
        System.out.println("Correcto! el numero era " + num1);
    }

}