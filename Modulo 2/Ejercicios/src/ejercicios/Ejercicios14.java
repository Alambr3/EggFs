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