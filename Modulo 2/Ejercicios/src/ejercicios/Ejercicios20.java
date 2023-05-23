package ejercicios;

import java.util.Scanner;

public class Ejercicios20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int aux = 0, auxC = 0, sumD = 0;
        boolean logic = true;
        int[][] nums = new int[3][3];

        System.out.println("Ingrese valor para: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print("[" + (i + 1) + "," + (j + 1) + "] ");
                    nums[i][j] = leer.nextInt();
                } while (nums[i][j] < 1 && nums[i][j] > 9);

                if (i == 0) {
                    aux = aux + nums[i][j];
                }
            }
        }

        ////////////// COMPROBADOR FILAS ///////////////
        for (int i = 0; i < 3; i++) {
            int sumF = 0;
            for (int j = 0; j < 3; j++) {
                sumF = sumF + nums[i][j];
            }

            if (sumF != aux) {
                logic = false;
                i = 3;
            }
        }

        ////////////// COMPROBADOR COLUMNAS ///////////////
        do {
            int sumC = 0;
            for (int i = 0; i < 3; i++) {
                sumC = sumC + nums[i][auxC];
            }
            if (sumC != aux) {
                logic = false;
                auxC = 3;
            }
            auxC = auxC + 1;
        } while (auxC != 3);

        ////////////// COMPROBADOR DIAGONAL ///////////////
        for (int i = 0; i < 3; i++) {
            sumD = sumD + nums[i][i];
        }
        if (sumD != aux) {
            logic = false;
        }

        System.out.println("¿Es una matriz magica? " + logic);
        if (logic == true) {
            System.out.println("La suma de la matriz magica es: " + aux);
        }
    }

}
