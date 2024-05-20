package lesson_15;

import java.util.Arrays;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {
        Student[] students = {new Student(12L, "Agil", 23),
                new Student(32L, "Seyid", 24),
                new Student(23L, "Nihat", 25)};


        System.out.println(Arrays.toString(students));


        System.out.println("======== SORT ID ==========");
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));



        System.out.println("======== SORT NAME ==========");

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -o1.name.compareTo(o2.name);
            }
        });

        System.out.println(Arrays.toString(students));


        System.out.println("======== SORT AGE ==========");

        Arrays.sort(students, (o1, o2) -> Integer.compare(o1.age, o2.age));

        System.out.println(Arrays.toString(students));
    }
}


