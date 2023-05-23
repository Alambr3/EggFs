package ejercicios;

import java.util.Scanner;

public class Ejercicios21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[10][10];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = (int) (Math.random() * 99 + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz2[i][j] = (int) (Math.random() * 99 + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz1[0][0] == matriz2[i][j]) {

                }
            }
        }
    }

}
