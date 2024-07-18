public class Circle extends Shape{

    private double radius;
    static final double PI = 3.141592653589793238462643383279502884197; //Not private because no need to.

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //getters setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Override methods
    @Override
    public double calculateArea() {
        return PI*(radius*radius); //change to 2 decimal points of precision.
    }

    @Override
    public double calculateCircumference() {
        return 2*PI*radius;
    }
}
