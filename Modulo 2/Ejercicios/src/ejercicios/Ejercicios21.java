/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P. */

package ejercicios;

import java.util.Scanner;

public class Ejercicios21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean comprobador = false;
        int coinc = 0;
        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
            matriz2[i][j] = (int) (Math.random() * 99 + 1);
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
//                matriz1[i][j] = (int) (Math.random() * 99 + 1);
                  matriz1[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                coinc = 0;
                if (matriz2[i][j] == matriz1[0][0]) {
                    if (j+3 < 11 && i+3 < 11) {
                    for (int k = i, m = 0; k < (i+3); k++, m++){
                        for (int l = j, n = 0; l < (j+3); l++, n++){
                            if (matriz2[k][l] == matriz1[m][n]){
                                coinc++;
                                if (coinc == 9) {
                                    comprobador = true;
                                    System.out.println("La matriz inicia en [" + (k - 1) + "," + (l - 1) + "]");
                                }
                            }
                        }
                    }  
                    }
                }
            }
        }
        
        if (comprobador == false) {
            System.out.println("La matriz no esta incluida");
        } else {
            System.out.println("La matriz esta incluida");
        }
    }

}
