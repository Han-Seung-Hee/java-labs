package week2.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleFilterExample {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 5, 10, 15, 20, 25, 30, 35, 40);

        List<Integer> result = number.stream()
                .filter(n -> n > 10)
                .filter(n -> n < 25)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);

        List<String> words = Arrays.asList("java", "stream", "api", "lambda", "code");
        List<String> result2 = words.stream()
                .filter(word -> word.length() >= 4)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result2);

    }
}
