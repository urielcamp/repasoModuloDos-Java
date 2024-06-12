public class Persona {

    private Direccion direccion;

    public Persona(){
        this.direccion = new Direccion();
        direccion.setPais("Uruguay");
        direccion.setCiudad("Salinas");
    }

    public String getPais(){
        return direccion.getPais();
    }

    public String getCiudad(){
        return direccion.getCiudad();
    }


}
