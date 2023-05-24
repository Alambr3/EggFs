/* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas. */

package extras;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       
        System.out.println("Ingrese tiempo en minutos");
        int time = leer.nextInt();
        
        if (time > 1440) {
            int dias = time / 1440;
            time = time % 1440;
            int horas = time / 60;
            time = time % 60;
            
            if (dias > 0) {
               System.out.println("Es equivalenete a " + dias + " dias, " + horas + " horas y " + time + " minutos.");
            } else {
                System.out.println("Es equivalenete a " + horas + " Horas y " + time + " minutos.");
            }
           
        }
        
    }

}