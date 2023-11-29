package Logica;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(int numPokedex, String nombre, double peso, String genero, String generacion) {
        super(numPokedex, nombre, peso, genero, generacion);
    }

    @Override
    protected void atkPlacaje() {
        System.out.println("Squirtle ha utilizado Placaje");
    }

    @Override
    protected void atkAraniazo() {
        System.out.println("Squirtle ha utilizado Araniazo");
    }

    @Override
    protected void atkMordisco() {
        System.out.println("Squirtle ha utilizado Mordisco");
    }

    @Override
    public void atkHidrobomba() {
        System.out.println("Squirtle ha utilizado Hidrobomba");
    }

    @Override
    public void atkBurbuja() {
        System.out.println("Squirtle ha utilizado Burbuja");
    }

    @Override
    public void atkPistolaAgua() {
        System.out.println("Squirtle ha utilizado Pistola de Agua");
    }
}
