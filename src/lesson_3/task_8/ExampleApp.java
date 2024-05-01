package lesson_3.task_8;

import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a % b == 0){
            System.out.println("Divisible");
        } else {
            int c = a / b;
            int d = a % b;
            System.out.println(c + " " + d);
        }
    }
}
