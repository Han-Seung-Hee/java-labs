package week2.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChaniningExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 10, 15, 20);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
