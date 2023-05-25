/* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main. */

package extras;
import java.util.Scanner;

public class Ejercicios15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese numero 1");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese numero 2");
        int num2 = leer.nextInt();
        
        System.out.println("");
        System.out.println("¿Que desea hacer?");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("");
        System.out.println("Ingrese opcion");
        int opc = leer.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println(sumar(num1, num2));
                break;
            case 2:
                System.out.println(restar(num1, num2));
                break;
            case 3:
                System.out.println(multiplicar(num1, num2));
                break;
            case 4:
                System.out.println(dividir(num1, num2));
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int restar(int num1, int num2) {
        return num1 - num2;
    }
     
    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }
    
     public static int dividir(int num1, int num2) {
        return num1 / num2;
    }
}