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
