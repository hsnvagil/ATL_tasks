package lesson_3.task_4;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n > 0 && m > 0) {
            System.out.println("1");
        } else if(n < 0 && m < 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
