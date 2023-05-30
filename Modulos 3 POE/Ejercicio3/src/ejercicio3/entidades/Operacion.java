package ejercicio3.entidades;

import java.util.Scanner;

public class Operacion {

    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        num1 = leer.nextInt();

        System.out.println("Ingrese segundo numero");
        num2 = leer.nextInt();
    }

    public int sumar() {
        return num1 + num2;
    }

    public int restar() {
        return num1 - num2;
    }

    public int multiplicar() {
        if (num1 != 0 && num2 != 0) {
            return num1 * num2;
        } else {
            System.out.println("Error al multiplicar por 0");
            return 0;
        }
    }

    public double dividir() {
        if (num1 != 0 && num2 != 0) {
            return (double) num1 / (double) num2;
        } else {
            System.out.println("Error al multiplicar por 0");
            return 0;
        }
    }
}
