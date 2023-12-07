package excepciones;

public class Excepciones {
    public static void main(String[] args) {

            int edades[] = {15, 12, 23, 30};
        try {
            System.out.println("La edad de la posición 4 es: " + edades[4]);
        } catch (Exception e){ // se utiliza "e" como referencia generica a excepciones
            System.out.println("Intentaste acceder a un indice que no existe");
        }
        /*
            try: Bloque en el que ocurrirá la excepción
            catch: Es como el "Else" del try (Se ejecuta al dispararse una excepción en el bloque try)
            finally: Bloque de código que se ejecuta siempre (sin importar si hubieron errores o no)
            throw: Lanzar una excepción cualquiera
            throws Determinar que excepciones puede lanzar un metodo

         */
    }
}