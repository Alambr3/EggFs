/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finara resolver ealizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Pl ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals(). */

package ejercicios;
import java.util.Scanner;

public class Ejercicios12 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);   
    
    String palabra;
    int contC = 0, contI = 0;
    
    do {
        System.out.println("Ingrese cadena de texto");
        palabra = leer.nextLine();
        if ("&&&&&".equals(palabra)) {
            System.out.println("Se finalizaron los envios de cadenas");
        }
        else if (palabra.length() == 5 && "X".equals(palabra.substring(0,1)) && "O".equals(palabra.substring(4))) {
           System.out.println("Se registro un ingreso de cadena correcto");
            contC++;
        } else {
            System.out.println("Se registro un ingreso de cadena incorrecto");
           contI++;
        }

        } while (!"&&&&&".equals(palabra));
    
        System.out.println("Se realizaron " + contC + " ingreso correctos");
        System.out.println("Se realizaron " + contI + " ingreso incorrectos");
    }
}