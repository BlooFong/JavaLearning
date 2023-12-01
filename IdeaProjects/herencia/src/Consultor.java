public class Consultor extends Persona{

    String nombreDeConsultor;
    int numConstructor;

    public Consultor(){

    }
    public Consultor(int id, String dni, String nombre, String apellido, String domicilio, int telefono, String nombreDeConsultor, int numConstructor, int socialNumber) {
        super(id, dni, nombre, apellido, domicilio, telefono, socialNumber);
        this.nombreDeConsultor = nombreDeConsultor;
        this.numConstructor = numConstructor;
    }

    public String getNombreDeConsultor() {
        return nombreDeConsultor;
    }

    public void setNombreDeConsultor(String nombreDeConsultor) {
        this.nombreDeConsultor = nombreDeConsultor;
    }

    public int getNumConstructor() {
        return numConstructor;
    }

    public void setNumConstructor(int numConstructor) {
        this.numConstructor = numConstructor;
    }
}
