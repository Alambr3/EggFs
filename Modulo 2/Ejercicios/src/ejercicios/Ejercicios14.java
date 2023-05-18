/* Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €  */

package ejercicios;
import java.util.Scanner;

public class Ejercicios14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de pesos");
        int monedaL = leer.nextInt();
        
        System.out.println("Ingrese moneda a convertir (DOLAR o EURO)");
        String monedaC = leer.nextLine();
        
        convertir(monedaL, monedaC);
    }   
     public static void convertir(int monedaL, String monedaC) {
         double conversion;
         if ("DOLAR".equals(monedaC)){
            conversion = monedaL * 0.00207;
            System.out.println("Sus " + monedaL + " pesos equivalen a: " + conversion + " dolares");
         }
         if ("EURO".equals(monedaC)){
            conversion = monedaL * 0.0040;
            System.out.println("Sus " + monedaL + " pesos equivalen a: " + conversion + " euros");
         }
         
     }      
}