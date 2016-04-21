package area.abstractclass;

/**
 * Created by Carlos Gonzales on 4/18/2016.
 */
public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(3);
        System.out.println(circle.calculateArea());

        Shape rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.calculateArea());

        Shape square = new Square(5);
        System.out.println(square.calculateArea());
    }

}
