package Ejercicios;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        double num = leer.nextDouble();
        
        System.out.println("El doble es: " + num * 2);
        System.out.println("El triple es: " + num * 3);
        System.out.println("El doble es: " + Math.sqrt(num));
    }
}