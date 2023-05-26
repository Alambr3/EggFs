/* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E */

package extras;

public class Ejercicios12 {

    public static void main(String[] args) {
        
        int a = 0, b = 0, c = 0;
        String numCadena1, numCadena2, numCadena3;
        
        for (int i = 0; i < 10; i++){
             for (int j = 0; j < 10; j++) {
                  for (int k = 0; k < 10; k++){
                       if (i == 3) {
                          System.out.println("E" + "-" + j + "-" + k); 
                       }
                       if (j == 3) {
                          System.out.println(i + "-" + "E" + "-" + k); 
                       }
                       if (k == 3) {
                          System.out.println(i + "-" + j + "-" + "E"); 
                       } 
                       if (i != 3 && j != 3 && k != 3){
                       System.out.println(i + "-" + j + "-" + k);
                       }
                  }
             }
        }
    }
}