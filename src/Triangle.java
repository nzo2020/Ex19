public class Triangle extends Shape {
    public double base;
    public double height;
    public double side1;
    public double side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public void calculateArea() {
        System.out.println((base * height)/2);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(side1 + side2 + base);
    }
}