package lesson_4;

public class Notebook extends Computer {
    ScreenSize screenSize;

    Notebook(ScreenSize screenSize, String Brand, String Model) {
        super(Brand, Model);
        this.screenSize = screenSize;
    }

    @Override
    public void shutdown() {
        System.out.println("turn off");
    }

    @Override
    public void start() {
        System.out.println("turn on");
    }
}
