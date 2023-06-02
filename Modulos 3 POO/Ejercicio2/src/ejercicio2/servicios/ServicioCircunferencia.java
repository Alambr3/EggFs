package ejercicio2.servicios;
import ejercicio2.entidades.Circunferencia;
import java.util.Scanner;


public class ServicioCircunferencia {
    
    public Circunferencia crearCircunferencia(){
        Circunferencia c1 = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese radio");
        c1.setRadio(leer.nextDouble());
        
        return c1;
    }
    
    public void area(Circunferencia c1){
        double n = c1.getRadio();
        System.out.println("Area");
        System.out.println(3.14 * Math.pow(n,2));
    }
    
    public void perimetro(Circunferencia c1){
        double n = c1.getRadio();
        System.out.println("Perimetro");
        System.out.println(2 * 3.14 * n);
    }

}
