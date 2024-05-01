package lesson_6;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        try {
            int num = Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
