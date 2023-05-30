package ejercicio1;

import ejercicio1.entidades.Libro;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        generarLibro();
    }

    public static void generarLibro() {
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro(leer.next(), leer.next(), leer.next(), leer.nextInt());
        mostrarLibro(libro1);
    }
    
    public static void mostrarLibro(Libro l1) {
        System.out.println(l1);
    }
}
