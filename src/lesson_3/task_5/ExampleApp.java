package lesson_3.task_5;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1 > 100 || num2 > 100 || num3 > 100) {
            System.out.println("great than 100");
            return;
        }

        if (num1 == num3 && num1 == num2 && num3 == num2) {
            System.out.println(1);
        } else if (num1 == num3 || num1 == num2 || num3 == num2) {
            System.out.println(2);
        } else if (num1 != num3 && num1 != num2 && num3 != num2) {
            System.out.println(3);
        }
    }
}
