package ejercicios;
import java.util.Scanner;

public class Ejercicios13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dimension del cuadro");
        int dim = leer.nextInt();
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
               if (i > 0 && i < dim-1 && j > 0 && j < dim-1) {
                   System.out.print(" ");
               } else {
                   System.out.print("*");
               }
            }
            System.out.println("");
        }
    }   
}
