package ejercicio1.entidades;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int pag;

    public Libro(String isbn, String titulo, String autor, int pag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", pag=" + pag + '}';
    }
    
    
}
