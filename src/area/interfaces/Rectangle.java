package area.interfaces;

public class Rectangle implements Shape {

    private final double ancho;

    private final double largo;

    public Rectangle(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calculateArea() {
        return ancho * largo;
    }
}
