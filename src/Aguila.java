public class Aguila extends Ave{

    private double tamanio;

    public Aguila(String nombre, String color, double tamanio){
        super(nombre, color);
        this.tamanio = tamanio;
    }

    public void volarAlto(){
        System.out.println("El aguila esta volando alto");
    }
    


}
