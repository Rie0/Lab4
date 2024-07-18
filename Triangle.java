public class Triangle extends Shape{

    private double height;
    private double base;

    //constructor

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    //getters setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    //Override methods
    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculateCircumference() {  //returns perimeter //if base has a different value it wouldn't make since
        return height*3;
    }
}
