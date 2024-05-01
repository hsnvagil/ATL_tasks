package lesson_4;

public class MainApp {
    public static void main(String[] args) {
        Computer notebook = new Notebook(ScreenSize._15_6INCH, "Hp", "Omen");
        notebook.start();
        if (notebook instanceof Computer) {
            System.out.println("YES");
        } else {
            throw new ClassCastException();
        }
    }
}