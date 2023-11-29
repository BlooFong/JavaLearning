package Logica;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur(int numPokedex, String nombre, double peso, String genero, String generacion) {
        super(numPokedex, nombre, peso, genero, generacion);
    }

    @Override
    protected void atkPlacaje() {
        System.out.println("Bulbasaur ha utilizado Placaje");
    }

    @Override
    protected void atkAraniazo() {
        System.out.println("Bulbasaur ha utilizado Araniazo");
    }

    @Override
    protected void atkMordisco() {
        System.out.println("Bulbasaur ha utilizado Mordisco");
    }

    @Override
    public void atkDrenaje() {
        System.out.println("Bulbasaur ha utilizado Drenaje");
    }

    @Override
    public void atkParalizar() {
        System.out.println("Bulbasaur ha utilizado Paralizar");
    }
}
