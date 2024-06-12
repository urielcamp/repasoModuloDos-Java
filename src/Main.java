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

        //Perro

        Perro perro1 = new Perro();
        perro1.hacerSonido();

        //Gato
        Gato gato1 = new Gato();
        gato1.hacerSonido();

        //Operaciones
        Operaciones o1 = new Operaciones();
        System.out.println("Resultado sumas");
        System.out.println(o1.sumar(2,3));
        System.out.println(o1.sumar(2,3,4));
        System.out.println(o1.sumar(1.5,1.5));
        System.out.println("---------------------------");

        //







    }
}