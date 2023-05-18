/* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. */

package Ejercicios;
import java.util.Scanner;

public class Ejercicios10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num, acum = 0;
        System.out.println("Ingrese un numero limite");
        int limite = leer.nextInt();
        
        while (acum < limite || acum != limite){
            System.out.println("Ingrese numero a sumar");
            num = leer.nextInt();
            
            acum += num;
            System.out.println(acum + "/" + limite);
        } 
        
        
        System.out.println("Alcanzate el limite de la suma: " + acum + "/" + limite);
    }
 
}