/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias. */

package extras;
import java.util.Scanner;

public class Ejercicios14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int hijos, sum = 0, edades = 0;
        
        System.out.println("Ingrese cantidad de famlias");
        int fam = leer.nextInt();
        
        for (int i = 0; i < fam; i++){
            System.out.println("Ingrese cantidad de hijos de la familia " + (i+1));
            hijos = leer.nextInt();
            sum += hijos;
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese edad del hijo " + (j+1));
                edades += leer.nextInt();
            }
        }
        System.out.println("El promedio de edades es: " + (double) ((double) edades/(double) sum));
    }

}