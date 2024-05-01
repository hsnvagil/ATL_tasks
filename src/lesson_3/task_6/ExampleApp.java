package lesson_3.task_6;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 1 && num <= 3){
            System.out.println("First");
        } else if (num >= 4 && num <= 6) {
            System.out.println("Second");
        } else if (num >= 7 && num <= 9) {
            System.out.println("Third");
        } else if(num >= 10 && num <= 12) {
            System.out.println("Fourth");
        }
    }
}
