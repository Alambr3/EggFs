package ejercicios;
import java.util.Scanner;

public class Ejercicios12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int countC = 0, countI = -1;
        
        do {
        System.out.println("Ingrese una palabra de 5 caracteres");
        palabra = leer.nextLine();
        
            if (palabra.length() == 5 && "X".equals(palabra.substring(0,1)) && "O".equals(palabra.substring(4,5))){
            countC++;
            } else {
                countI++;
                }   
        } while (!"&&&&&".equals(palabra));
        System.out.println("Ingresos correctos: " + countC);
        System.out.println("Ingresos incorrectos: " + countI);
    }
}
   
