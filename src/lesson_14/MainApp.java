package lesson_14;

import java.util.HashMap;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) {
        final String word = "AZERBAIJAN";
        char[] charArray = word.toCharArray();


        Map<Character, Integer> hashMap = new HashMap<>();
        for (char c : charArray) {
            hashMap.merge(c, 1, Integer::sum);
        }

        System.out.println(hashMap);
    }
}