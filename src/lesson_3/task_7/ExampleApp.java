package lesson_3.task_7;

import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0){
            System.out.println("Positive");
        } else if(n < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
