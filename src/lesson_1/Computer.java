package lesson_1;

public class Computer {
    public void PrintInfo() {
        System.out.println("This is a computer");
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.PrintInfo();
    }
}