public class Rectangle extends Shape{

    private double height;
    private double width;

    //Constructor
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    //Getters Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Override methods
    @Override
    public double calculateArea() {
        return width*height;
    }

    @Override
    public double calculateCircumference() { // perimeters
        return 2*(width+height);
    }
}
