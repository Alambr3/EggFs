package ejercicio3;

import ejercicio3.entidades.Operacion;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Operacion op = new Operacion();
        op.crearOperacion();
        System.out.println("Suma");
        System.out.println(op.sumar());
        System.out.println("Resta");
        System.out.println(op.restar());
        System.out.println("Multiplicacion");
        System.out.println(op.multiplicar());
        System.out.println("Division");
        System.out.println(op.dividir());
                            
    }

}
