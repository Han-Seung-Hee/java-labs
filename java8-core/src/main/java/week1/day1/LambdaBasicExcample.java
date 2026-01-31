package week1.day1;

public class LambdaBasicExcample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Lambda Executed");
        task.run();
    }

    private void exampleMethod() {
        new Thread(() -> System.out.println("쓰레드 실행")).start();
        Runnable r = () -> System.out.println("Ruunnable 실행");
        r.run();
    }
}