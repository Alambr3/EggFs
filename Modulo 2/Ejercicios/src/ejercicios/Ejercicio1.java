package ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese primer numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese segundo numero");
        int num2 = leer.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Su suma es: " + sum);
    }
}