package week1.day3;

public class InputLambdaExample {
    interface Printer {
        void print(String message);
    }

    public static void main(String[] args) {
//        Printer printer = System.out::println;
        Printer printer = (msg) -> System.out.println(msg);
    }

}
