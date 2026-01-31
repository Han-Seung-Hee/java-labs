package day2;

public class MyActionExample {
    public static void main(String[] args) {
        MyAction action = () -> {
            System.out.println("My action performed");
        };

        action.perform();
    }
}
