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
        Cuadrado c1 = new Cuadrado(4);
        c1.calcularPerimetro();
        c1.calcularArea();

        //Automovil

        Automovil a1 = new Automovil("Honda", 2022, 190, "Sport");
        a1.mostrarVehiculo();
    }
}