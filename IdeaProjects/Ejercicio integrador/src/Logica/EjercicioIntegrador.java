package Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
    Squirtle squirtle = new Squirtle(7, "Squirtle", 9.0 ,"Masculino", "Primera");
    Charmander charmander = new Charmander(4, "Charmander", 8.5, "Masculino", "Primera" );
    Bulbasaur bulbasaur = new Bulbasaur(1,"Bulbasaur", 6.9, "Masculino", "Primera" );
    Pikachu pikachu = new Pikachu(25, "Pikachu", 6.0, "Femenino", "Primera");

    squirtle.atkAraniazo();
    squirtle.atkHidrobomba();
    charmander.atkAraniazo();
    charmander.atkLanzallamas();
    bulbasaur.atkDrenaje();
    bulbasaur.atkPlacaje();
    pikachu.atkImpactrueno();
    pikachu.atkAraniazo();
    }
}