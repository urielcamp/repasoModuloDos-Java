public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int nPaginas;

    //constructor

    public Libro(String titulo, String autor, int anioPublicacion, int nPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.nPaginas = nPaginas;
    }

    public void mostrarInformacion(){
        System.out.println("Informacion del libro:");
        System.out.println("---------------------------");
        System.out.println("   - Titulo: " + titulo);
        System.out.println("   - Autor: " + autor);
        System.out.println("   - Año publicacion: " + anioPublicacion);
        System.out.println("   - Numero de paginas: " + nPaginas);
        System.out.println("---------------------------");
    }





}
