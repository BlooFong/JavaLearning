    public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(){

    }
        public Cuadrado(double posX, double posY, double lado) {
            super(posX, posY);
            this.lado = lado;
        }

        @Override
        public double calcularArea() {
            double resultado = lado*lado;
            return resultado;
        }
    }

