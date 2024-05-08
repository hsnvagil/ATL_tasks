package lesson_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.*;

public class MainApp {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Moscow");
        cities.add("London");
        cities.add("New York");

        Consumer<String> consumer = System.out::println;
        cities.forEach(consumer);

        System.out.println();

        Predicate<String> predicate = city -> Objects.equals(city, "Moscow");
        cities.stream().filter(predicate).forEach(consumer);
    }
}
