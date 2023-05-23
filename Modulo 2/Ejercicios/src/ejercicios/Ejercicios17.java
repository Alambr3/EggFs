/* Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos). */

package ejercicios;
import java.util.Scanner;

public class Ejercicios17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese tamaño del vector");
        int tam = leer.nextInt();
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        
        int[] nums = new int[tam]; 
        
        for (int i = 0; i < tam; i++) {
              nums[i] = (int) (Math.random()*999+1);
              System.out.println(nums[i]);
        }
        
        for (int j = 0; j < tam; j++) {
            int aux = 0;
            while ((double) nums[j] > 0.9) {
                nums[j] = nums[j] / 10;
                aux++;
            }
            
            switch (aux) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
            }
        }
        
        System.out.println("Se encontraron " + num1 + " nuneros de 1 cifra");
        System.out.println("Se encontraron " + num2 + " nuneros de 2 cifras");
        System.out.println("Se encontraron " + num3 + " nuneros de 3 cifras");
        System.out.println("Se encontraron " + num4 + " nuneros de 4 cifras");
        System.out.println("Se encontraron " + num5 + " nuneros de 5 cifras");
     
    }
}