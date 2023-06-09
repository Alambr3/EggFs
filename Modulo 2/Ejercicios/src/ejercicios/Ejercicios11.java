/* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú. */

package Ejercicios;
import java.util.Scanner;

public class Ejercicios11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opc, num1, num2;
        char opcL = 'n';
        float res;
        
        do {
            System.out.println("Ingrese numero 1");
            num1 = leer.nextInt();
        } while (num1 < 1);
        do {
            System.out.println("Ingrese numero 2");
            num2 = leer.nextInt();
        } while (num2 < 1);
        
        do {
            System.out.println("-------------------");
            System.out.println("       MENU");
            System.out.println("");
            System.out.println("1- Sumar");
            System.out.println("2- Restar");
            System.out.println("3- Multiplicar");
            System.out.println("4- Divir");
            System.out.println("5- Salir");
            System.out.println("-------------------");
            System.out.println("Ingrese su opcion");
            opc = leer.nextInt();
        
            switch (opc) {
                case 1:
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    res = (float) num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + res);
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir? s/n");
                    opcL = leer.next().charAt(0);
                default:
                    System.out.println("Opcion incorrecta");
            }
       
        } while (opc != 5 && opcL == 'n' || opcL == 'N');
       
    }
 
}