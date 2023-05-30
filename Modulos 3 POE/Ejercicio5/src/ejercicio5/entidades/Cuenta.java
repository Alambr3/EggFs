package ejercicio5.entidades;

import java.util.Scanner;

public class Cuenta {

    private int numeroCuenta;
    private int dni;
    private int saldo;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int dni, int saldo) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDni() {
        return dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void crearCuenta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese numero cuenta");
        numeroCuenta = leer.nextInt();
        System.out.println("Ingrese DNI");
        dni = leer.nextInt();
        System.out.println("Ingrese saldo");
        saldo = leer.nextInt();
    }
    
    public void ingresar(double ingreso){
        saldo += ingreso;
    }
    
    public void retirar(int retiro){
        if (retiro > saldo){
            saldo = 0;
        } else {
        saldo -= retiro;
        }
    }
    
    public void extraccionRapida(int dinero){
        if (dinero > (saldo*0.2)) {
            saldo -= dinero;
        } else {
            System.out.println("El ingreso supera el 20% de su saldo");
        }
    }
    
    public int consultarSaldo() {
        return saldo;
    }
    
    public String consultarDatos() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", dni=" + dni + ", saldo=" + saldo + '}';
    }
 
}
