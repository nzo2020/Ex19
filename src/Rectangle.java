public class Rectangle extends Shape {
    public double length;
    public double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println(length * width);
    }


    @Override
    public void calculatePerimeter() {
        System.out.println(2 * (length + width));
    }
}
