public class Vehiculo {

    private String marca;
    private int anio;


    //constructor

    public Vehiculo(String marca, int anio){
        this.marca = marca;
        this.anio = anio;
    }

    public void mostrarVehiculo(){}

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }
}
