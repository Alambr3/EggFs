package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("Frase en mayus: " + frase.toUpperCase());
        System.out.println("Frase en minus: " + frase.toLowerCase());
    }
}