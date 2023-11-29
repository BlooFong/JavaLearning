package Logica;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String Genero;
    protected String Generacion;

    public Pokemon(int numPokedex, String nombre, double peso, String genero, String generacion) {
        this.numPokedex = numPokedex;
        this.nombre = nombre;
        this.peso = peso;
        Genero = genero;
        Generacion = generacion;
    }

    protected abstract void atkPlacaje();
    protected abstract void atkAraniazo();
    protected abstract void atkMordisco();


}
