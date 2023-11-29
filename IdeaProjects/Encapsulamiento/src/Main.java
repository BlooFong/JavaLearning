public class Main {
    public static void main(String[] args) {

        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno(15, "Ricardo", "Fong");

        System.out.println("Id: " + alumno2.getId());
        System.out.println("Nombre: " + alumno2.getNombre());
        System.out.println(("Apellido: " + alumno2.getApellido()));
    }
}