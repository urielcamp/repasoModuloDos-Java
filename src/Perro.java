public class Perro extends Animal{


    private String sonido = "guau guau";

    public Perro(){

    }

    @Override
    public void hacerSonido(){
        System.out.println("Sonido del Perro");
        System.out.println(sonido);
        System.out.println("---------------------------");
    }

}
