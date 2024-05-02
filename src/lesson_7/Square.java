package lesson_7;

public class Square implements Shape {
    private double a;

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    Square(double a) {
        this.a = a;
    }

    @Override
    public double perimeter() {
        return 4 * a;
    }

    @Override
    public double area() {
        return a * a;
    }
}
