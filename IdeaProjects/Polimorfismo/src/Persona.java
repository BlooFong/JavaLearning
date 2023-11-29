public class Persona {
    int edad;
    String nombre;
    String apellido;
    String curp;
    String domicilio;
    int telefono;

    public Persona() {

    }

    public Persona(int edad, String nombre, String apellido, String curp, String domicilio, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curp = curp;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
