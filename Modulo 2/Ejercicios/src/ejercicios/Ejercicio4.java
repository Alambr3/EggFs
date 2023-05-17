package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese grados centigrados");
        double grados = leer.nextDouble();
        
        System.out.println("Su equivalente en Farenheit es: " + (32 + (9 * grados / 5)));
    }
}