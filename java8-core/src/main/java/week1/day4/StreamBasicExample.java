package week1.day4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 10, 15, 20);

        List<Integer> result2 = numbers.stream().filter(n -> n > 10).map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result2);

        List<String> names = Arrays.asList("kim", "lee", "park", "choi");

        List<String> result = names.stream().filter(name -> name.length() >= 4).map(name -> name.toUpperCase())
                .collect(Collectors.toList());


    }
}
