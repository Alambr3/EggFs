package extras;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int a = 1, b = 2, c = 3, d = 4, aux;
       
       aux = b;
       b = c;
       c = a;
       a = d;
       d = aux;
       
       System.out.println("a: " + a);
       System.out.println("b: " + b);
       System.out.println("c: " + c);
       System.out.println("d: " + d);
        
    }

}