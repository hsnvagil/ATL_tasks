package lesson_1;

public class Cat {
    public void PrintInfo() {
        System.out.println("This is a cat");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.PrintInfo();
    }
}