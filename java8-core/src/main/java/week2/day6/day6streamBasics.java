package week2.day6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class day6streamBasics {
    public static void main(String[] args) {
        List<Integer> numbers = dataSets.numbers();
        List<String> names = dataSets.names();

        // 정렬
        List<Integer> sorted = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Sorted Numbers: " + sorted);

        // 중복 제거
        List<Integer> distinct = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct Numbers: " + distinct);

        // 개수 세기
        long countLength = names.stream().filter(name -> name.length() > 4).count();

        System.out.println("Names with length > 4: " + countLength);

        // 조건검사
        boolean anyLengthGreaterThan5 = names.stream().anyMatch(name -> name.length() > 5);

        System.out.println("Any name with length > 5: " + anyLengthGreaterThan5);

        boolean allLen3up = names.stream().allMatch(name -> name.length() >= 3);

        System.out.println("All names with length >= 3: " + allLen3up);

        boolean noneEmpty = names.stream().noneMatch(String::isEmpty);

        System.out.println("None of the names are empty: " + noneEmpty);

        String firstLen4UP =
                names.stream()
                        .filter(name -> name.length() >= 4)
                        .findFirst()
                        .orElse("No name found");

        System.out.println("First name with length >= 4: " + firstLen4UP);

        String anyLen4UP =
                names.stream()
                        .filter(name -> name.length() >= 4)
                        .findAny()
                        .orElse("No name found");
        System.out.println("Any name with length >= 4: " + anyLen4UP);

        System.out.println("forEach(len>=4)");

        names.stream()
                .filter(name -> name.length() >= 4)
                .forEach(System.out::println);


        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        int max = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);

        //        미션 1) 중복 제거 + 정렬
        //	•	numbers에서 중복 제거하고 오름차순 정렬해서 출력
        List<Integer> mission1 = numbers.stream()
                .distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        //        미션 2) 조건 검사
        //	•	names 중 길이 5 이상이 하나라도 있는지 출력 (anyMatch)
        boolean mission2 = names.stream().anyMatch(name -> name.length() >= 5);


        //                미션 3) 하나 찾기
        //	•	names 중 길이 4 이상인 첫 번째 값 출력 (findFirst, 없으면 “없음”)
        String mission3 = names.stream()
                .filter(name -> name.length() >= 4)
                .findFirst()
                .orElse("없음");
        //        미션 4) 접기
        //	•	numbers의 합계 출력 (reduce)
        int Mission4 = numbers.stream().reduce(0, (a, b) -> a + b);


    }
}
