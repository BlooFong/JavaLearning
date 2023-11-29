public class Jefe extends Persona {

    int idJefe;
    String departamentoJefe;

    public Jefe() {

    }

    public Jefe(int edad, String nombre, String apellido, String curp, String domicilio, int telefono, int idJefe, String departamentoJefe) {
        super(edad, nombre, apellido, curp, domicilio, telefono);
        this.idJefe = idJefe;
        this.departamentoJefe = departamentoJefe;
    }

    public int getIdJefe() {
        return idJefe;
    }

    public void setIdJefe(int idJefe) {
        this.idJefe = idJefe;
    }

    public String getDepartamentoJefe() {
        return departamentoJefe;
    }

    public void setDepartamentoJefe(String departamentoJefe) {
        this.departamentoJefe = departamentoJefe;
    }
}
