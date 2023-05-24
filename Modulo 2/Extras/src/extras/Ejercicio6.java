/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general. */

package extras;
import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       double total = 0, totalMenor = 0, contMenor = 0;
       
        System.out.println("Ingrese cantidad de personas");
        int cant = leer.nextInt();
        
        for (int i = 0; i < cant; i++){
             System.out.println("Ingrese altura de persona " + (i+1) + " (en metros)");
             double alt = leer.nextDouble();
             if (alt < 1.6) {
                 totalMenor += alt;
                 contMenor += 1;
             }
             total += alt;
        }
        
        System.out.println("Promedio estatura en general: " + (total/cant));
        System.out.println("Promedio estatura en menores: " + (totalMenor/contMenor));
        
        
    }

}