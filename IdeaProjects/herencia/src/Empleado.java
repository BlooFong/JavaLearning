public class Empleado extends Persona{

    int numDeEmpleado;
    String cargo;
    Double sueldo;

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int numDeEmpleado, String cargo, Double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numDeEmpleado = numDeEmpleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado() {

    }

    public int getNumDeEmpleado() {
        return numDeEmpleado;
    }

    public void setNumDeEmpleado(int numDeEmpleado) {
        this.numDeEmpleado = numDeEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

}
