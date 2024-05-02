package lesson_7;


import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(7);

        ArrayList<Shape> arrayList = new ArrayList<>();
        arrayList.add(square);
        arrayList.add(rectangle);
        System.out.println(square.area());
    }
}

