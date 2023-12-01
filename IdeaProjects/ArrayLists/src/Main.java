import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona (1,"Ibrahin",24));
        lista.add(new Persona (2,"Lari",24));
        lista.add(new Persona (3,"Mamuel",22));
        lista.add(new Persona (4,"Wyla",24));

        System.out.println("-------------------FOR------------------");
        //Recorrer por índice

        for (int i = 0; i < lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }

        System.out.println("-------------------FOR EACH------------------");
        //Recorrido foreach

        for (Persona ppl:lista){
            System.out.println("Prueba: " + ppl.getNombre());
        }
    }
}