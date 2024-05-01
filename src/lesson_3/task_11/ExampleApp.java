package lesson_3.task_11;

import java.util.Scanner;

public class ExampleApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(String.valueOf(n).length() == 2){
            int first = n / 10;
            int second = n % 10;

            int sum = first + second;

            int result = sum * sum;

            System.out.println(result);
        }
    }
}