/* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”. */

package extras;
import java.util.Scanner;

public class Ejercicios16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        String confirma;
        do {
            System.out.println("Ingrese nombre de persona");
            String nombre = leer.nextLine();
            System.out.println("Ingrede edad");
            int edad = leer.nextInt();
            if (edad < 18) {
                System.out.println("Es menor de edad");
            } else {
                System.out.println("Es mayor de edad");
            }
            do {
                System.out.println("");
                System.out.println("¿Desea ingresar otro nombre? (Si/No)");
                confirma = leer.nextLine();
            } while ("si".equalsIgnoreCase(confirma) || "no".equalsIgnoreCase(confirma));
            
        } while ("si".equalsIgnoreCase(confirma));
    }
}