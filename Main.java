
public class Main {
    public static void main(String[] args) {

//Circle class tests
        Circle circle = new Circle(10.5);
        //Getters Setters tests
        circle.setRadius(5.5);
        System.out.println("Circle radius: "+circle.getRadius());
        //Method tests
        System.out.println("Circle area: "+Math.round(circle.calculateArea()* 100.0)/ 100.0);
        System.out.println("Circle circumference: "+Math.round(circle.calculateCircumference()* 100.0)/ 100.0);
        System.out.println();

//Rectangle class tests
        Rectangle rectangle = new Rectangle(10,20);
        //Getters Setters tests
        rectangle.setWidth(20);
        System.out.println("Rectangle width: "+rectangle.getWidth());
        rectangle.setHeight(40);
        System.out.println("Rectangle height: "+rectangle.getHeight());
        //Method tests
        System.out.println("Rectangle area: "+rectangle.calculateArea());
        System.out.println("Rectangle perimeter: "+rectangle.calculateCircumference());
        System.out.println();

//Triangle class tests
        Triangle triangle = new Triangle(10,20);
        //Getters Setters tests
        triangle.setBase(20);
        System.out.println("Triangle width: "+triangle.getBase());
        triangle.setHeight(40);
        System.out.println("Triangle height: "+triangle.getHeight());
        //Method tests
        System.out.println("Triangle area: "+triangle.calculateArea());
        System.out.println("Triangle perimeter: "+triangle.calculateCircumference());
        System.out.println();

    }
}