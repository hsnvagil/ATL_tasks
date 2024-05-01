package lesson_1;

public class Mouse {
    public void PrintInfo() {
        System.out.println("This is a mouse");
    }

    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.PrintInfo();
    }
}