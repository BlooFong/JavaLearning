package relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {
    public static void main(String[] args) {

        Auto aut = new Auto ();                     //Crear objeto auto vacío
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");

        List<Propietario> listaPropietarios = new ArrayList<Propietario>(); //Crear lista de propietarios vacíos

        Propietario prop1 = new Propietario(); //Crear objeto propietarios vacíos
        Propietario prop2 = new Propietario();

        //Settear valores del Objeto
        prop1.setId(25L);
        prop1.setNombre("Ibrahin");
        prop1.setApellido("Fong");
        prop2.setId(24L);
        prop2.setNombre("Larissa");
        prop2.setApellido("Carballo");

        //Agregar propietario 1 y 2 a la lista
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);

        aut.setListapropietarios(listaPropietarios);

        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo() + " " + "tiene como propietarios a: "
        + aut.getListapropietarios().toString());
    }
}