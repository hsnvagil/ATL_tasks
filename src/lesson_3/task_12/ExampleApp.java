package lesson_3.task_12;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (i * i);
        }

        System.out.println(sum);
    }
}
