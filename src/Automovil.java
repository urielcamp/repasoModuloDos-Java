public class Automovil extends Vehiculo{


    private int velocidad;
    private String tipo;

    public Automovil(String marca, int anio, int velocidad, String tipo ){
        super(marca, anio);
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    @Override
    public void mostrarVehiculo(){
        System.out.println("Informacion del automovil");
        System.out.println("---------------------------");
        System.out.println("   - Tipo: " + tipo);
        System.out.println("   - Marca: " + getMarca());
        System.out.println("   - Año: " + getAnio());
        System.out.println("   - Velocidad: " + velocidad);
        System.out.println("---------------------------");
    }


}
