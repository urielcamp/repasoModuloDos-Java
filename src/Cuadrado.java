public class Cuadrado extends Figura{

    private int lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    @Override
    public void calcularArea(){
        int area = lado * lado;
        System.out.println("el area del Cuadrado es: " + area);
        System.out.println("---------------------------");
    }

    @Override
    public void calcularPerimetro(){
        int perimetro = lado * 4;
        System.out.println("el perimetro del Cuadrado es: " + perimetro);
        System.out.println("---------------------------");
    }





}
