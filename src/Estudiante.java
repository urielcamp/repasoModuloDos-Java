public class Estudiante {

    private String nombre;
    private int edad;
    private String carrera;

    //constructor

    public Estudiante(String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void mostrarEstudiante(){
        System.out.println("Informacion Estudiante");
        System.out.println("---------------------------");
        System.out.println("   - Nombre: " + nombre);
        System.out.println("   - Edad: " + edad);
        System.out.println("   - Carrera: " + carrera);
        System.out.println("---------------------------");
    }

    public void cambiarCarrera(String nCarrera){
        carrera = nCarrera;
    }



}
