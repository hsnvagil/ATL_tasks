package lesson_1;

public class House {
    public void PrintInfo() {
        System.out.println("This is a house");
    }

    public static void main(String[] args) {
        House house = new House();
        house.PrintInfo();
    }
}