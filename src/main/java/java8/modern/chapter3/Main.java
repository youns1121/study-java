package java8.modern.chapter3;

public class Main {

    public static void process(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        Runnable r1 = () -> System.out.println("Hello World");

        Runnable r2 = new Runnable() {
            public void run() {
                System.out.println("Hello World 2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("Hellow World 3"));
    }
}
