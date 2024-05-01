package lesson_1;

public class Car {
    public void PrintInfo() {
        System.out.println("This is a car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.PrintInfo();
    }
}