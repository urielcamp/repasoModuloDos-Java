//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Libro

        Libro l1 = new Libro("Harry Potter", "Rowling", 1990, 250);

        l1.mostrarInformacion();

        //Estudiante

        Estudiante e1 = new Estudiante("Leo", 18, "Fisica");
        e1.cambiarCarrera("Musica");
        e1.mostrarEstudiante();

        //Cuadrado
    }
}