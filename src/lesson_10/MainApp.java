package lesson_10;

import java.lang.reflect.Field;

public class MainApp {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p = new Person("Agil", "Hasanov",26);
        Field age = p.getClass().getDeclaredField("age");
        age.setAccessible(true);
        age.set(p,100);

        System.out.println(p.getAge());
    }
}
