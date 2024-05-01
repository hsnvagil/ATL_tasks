package lesson_3.task_1;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var num1 = sc.nextInt();
        var num2 = sc.nextInt();
        var num3 = sc.nextInt();
        var num4 = sc.nextInt();

        var temp = num1;

        if(temp < num2){
            temp = num2;
        }

        if(temp < num3){
            temp = num3;
        }

        if(temp < num4){
            temp = num4;
        }

        System.out.println(temp);
    }
}