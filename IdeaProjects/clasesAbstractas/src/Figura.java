public abstract class Figura {
    protected double posX; //posición en X
    protected double posY; //posición en y

   protected Figura(){

   }

    protected Figura(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }
    public abstract double calcularArea();
}
