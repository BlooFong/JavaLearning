package Logica;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(int numPokedex, String nombre, double peso, String genero, String generacion) {
        super(numPokedex, nombre, peso, genero, generacion);
    }

    @Override
    protected void atkPlacaje() {
        System.out.println("Charmander ha utilizado Placaje");
    }

    @Override
    protected void atkAraniazo() {
        System.out.println("Charmander ha utilizado Araniazo");
    }

    @Override
    protected void atkMordisco() {
        System.out.println("Charmander ha utilizado Mordisco");
    }

    @Override
    public void atkPunioFuego() {
        System.out.println("Charmander ha utilizado Punio de Fuego");
    }

    @Override
    public void atkLanzallamas() {
        System.out.println("Charmander ha utilizado Lanzallamas");
    }

    @Override
    public void atkAscuas() {
        System.out.println("Charmander ha utilizado Ataque de Ascuas");
    }
}
