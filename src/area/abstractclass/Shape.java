package area.abstractclass;

public abstract class Shape {

    public abstract double calculateArea();

    public String display() {
        return "Area: " + calculateArea();
    }
}
