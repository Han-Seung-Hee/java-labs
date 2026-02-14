package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoopExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 10, 15, 20);
        List<Integer> result = new ArrayList<>();

        for (int n : numbers) {
            if (n > 10) {
                result.add(n * 2);
            }
        }

        System.out.println(result);
    }
}
