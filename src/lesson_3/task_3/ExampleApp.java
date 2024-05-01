package lesson_3.task_3;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();


        if(x >= a && x <= b){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
}
