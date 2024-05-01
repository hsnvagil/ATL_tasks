package lesson_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void printTable(char[][] array) {
        System.out.println();

        for (int i = 0; i <= array.length; i++) {
            System.out.print(i + " | ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    System.out.print(i + 1 + " | ");
                }
                System.out.print(array[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void fillTable(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array[i], '-');
        }
    }

    public static void main(String[] args) {
        char[][] array = new char[5][5];

        Random rand = new Random();

        int setRow = rand.nextInt(5) + 1;
        int setColumn = rand.nextInt(5) + 1;

        fillTable(array);
        System.out.println("All set. Get ready to rumble!");

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Set row (e.g 1-5): ");
            var row = sc.nextInt();
            System.out.print("Set column (e.g 1-5): ");
            var column = sc.nextInt();

            if (row > 0 && column > 0 && column < 6 && row < 6) {
                if (row == setRow && column == setColumn) {
                    System.out.println();
                    System.out.println("You Won!!!");
                    array[row - 1][column - 1] = 'x';
                    printTable(array);
                    break;
                }
                array[row - 1][column - 1] = '*';
                printTable(array);
            } else {
                System.out.println("Incorrect entry");
            }
        }
    }
}
