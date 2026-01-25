package day1;

public class AnonymousCalssExample {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class implementing Runnable");
            }
        };

        task.run();
    }
}
