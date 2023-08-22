package ejercicio6.entidades;

public class Cafetera {

    private int capMaxima;
    private int cantActual;

    public Cafetera() {
    }

    public Cafetera(int capMaxima, int cantActual) {
        this.capMaxima = capMaxima;
        this.cantActual = cantActual;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

    public void llenarCafetera() {
        cantActual = capMaxima;
    }

    public int servirTaza(int cantidad) {
        if (cantidad > cantActual) {
          System.out.println("La cantidad en la cafetera no alcanza, solo se llenó con " + cantActual);
          cantActual = 0;
        } else {
            cantActual -= cantidad;
        }
        return cantActual;
    }
    
    public void vaciarCafetera(){
        cantActual = 0;
    }
    
    public int agregarCafe(int cantidad){
        if (cantActual < capMaxima) {
            cantActual += cantidad;
        }
        return cantActual;
    }
           
}
