/* Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio. */

package extras;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
     
        System.out.println("Ingrese la categoria de socio (A, B, C)");
        String socio = leer.nextLine();
       
        System.out.println("Ingrese costo del tratamiento");
        int precio = leer.nextInt();
        
        switch (socio) {
            case "A":
                System.out.println("Socio tipo A");
                System.out.println("El precio del medicamento es de: " + (precio / 2));
                break;
            case "B":
                System.out.println("Socio tipo B");
                System.out.println("El precio del medicamento es de: " + (precio * 0.65));
                break;
            case "C":
                System.out.println("Socio tipo C");
                System.out.println("El precio del medicamento es de: " + precio);
                break;
        }
    }

}