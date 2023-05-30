package ejercicio2;
import ejercicio2.entidades.Circunferencia;
import ejercicio2.servicios.ServicioCircunferencia;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("/n"); 
       
       ServicioCircunferencia sc = new ServicioCircunferencia();
       Circunferencia c1 = sc.crearCircunferencia();
       
       sc.area(c1);
       sc.perimetro(c1);
    }

}