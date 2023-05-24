/* Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas

50
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.  */

package extras;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        int aux, coc = 0;
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        do {
            num1 = num1 - num2;
            coc++;
        } while (num2 <= num1);
        
        System.out.println("Cociente: " + coc);
        System.out.println("Residuo: " + num1);
    }

}