package week1.day3;

public class ReturnLambdaExample {
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Calculator add = (a, b) -> {
            return a + b;
        };
        System.out.println(add.calculate(3, 5));

        Calculator add2 = (a, b) -> a + b;

    }
}
