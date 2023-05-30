package ejercicio5;

import ejercicio5.entidades.Cuenta;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("/n");
        Cuenta c1 = new Cuenta();
        c1.crearCuenta();
        System.out.println(c1.consultarDatos());

//        System.out.println("¿Que desea hacer?");
//        System.out.println("1- Ingresar dinero");
//        System.out.println("2- Retirar dinero");
//        System.out.println("3- Retiro rapido");
//        System.out.println("4- Consultar saldo");
//        System.out.println("5- Consultar datos");
//        int opc = leer.nextInt();
//        switch (opc) {
//            case 1:
//                System.out.println("¿Cuanto desea ingresar?");
//                c1.ingresar(leer.nextDouble());
//                break;
//            case 2:
//                System.out.println("¿Cuanto desea retirar?");
//                c1.retirar(leer.nextInt());
//                break;
//            case 3:
//                System.out.println("¿Cuanto desea retirar?");
//                c1.extraccionRapida(leer.nextInt());
//                break;
//            case 4:
//                System.out.println("Su saldo es de: " + c1.consultarSaldo());
//                break;
//            case 5:
//                System.out.println(c1.consultarDatos());
//                break;
//        }
    }

    
}
