public class Square extends Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println(side * side);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println(4 * side);
    }
}
