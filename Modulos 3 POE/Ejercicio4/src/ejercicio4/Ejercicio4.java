package ejercicio4;

import ejercicio4.entidades.Rectangulo;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("/n");

        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        System.out.println("Area");
        System.out.println(r1.calcularSuperficie());
        System.out.println("Perimetro");
        System.out.println(r1.calcularPerimetro());
    }

}
