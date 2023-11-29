package Logica;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu(int numPokedex, String nombre, double peso, String genero, String generacion) {
        super(numPokedex, nombre, peso, genero, generacion);
    }

    @Override
    protected void atkPlacaje() {
        System.out.println("Pikachu ha utilizado Placaje");
    }

    @Override
    protected void atkAraniazo() {
        System.out.println("Pikachu ha utilizado Araniazo");
    }

    @Override
    protected void atkMordisco() {
        System.out.println("Pikachu ha utilizado Mordisco");
    }

    @Override
    public void atkImpactrueno() {
        System.out.println("Pikachu ha utilizado Impactrueno");
    }

    @Override
    public void atkPunioTrueno() {
        System.out.println("Pikachu ha utilizado Punio de Trueno");
    }
}
