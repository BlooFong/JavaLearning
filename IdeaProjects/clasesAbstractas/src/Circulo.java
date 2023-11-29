
public class Circulo extends Figura{
    private double radio;

    public Circulo() {
    }

    public Circulo(double posX, double posY, double radio) {
        super(posX, posY);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double pi = 3.1416;
        double resultado = pi * radio * radio;
        return resultado;
    }
}
