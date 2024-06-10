public class Cuadrado {

    private int lado;

    public Cuadrado(int lado){
        this.lado = lado;
    }

    public void calcularArea(){
        int area = lado * lado;
        System.out.println("el area del Cuadrado es: " + area);
    }

    public void calcularPerimetro(){
        int perimetro = lado * 4;
        System.out.println("el perimetro del Cuadrado es: " + perimetro);
    }





}
