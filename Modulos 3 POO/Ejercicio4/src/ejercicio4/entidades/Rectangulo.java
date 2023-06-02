package ejercicio4.entidades;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese base");
        base = leer.nextInt();
        System.out.println("Ingrese altura");
        altura = leer.nextInt();
    }
    
    public int calcularSuperficie() {
        return base * altura;
    }
    
    public int calcularPerimetro(){
        return (base + altura) * 2;
    }
}
