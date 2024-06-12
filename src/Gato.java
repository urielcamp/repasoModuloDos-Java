public class Gato extends Animal{

    private String sonido = "miau miau";

    public Gato(){}

    @Override
    public void hacerSonido(){
        System.out.println("Sonido del Gato");
        System.out.println(sonido);
        System.out.println("---------------------------");
    }

}
