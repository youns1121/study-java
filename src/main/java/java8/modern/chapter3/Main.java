package java8.modern.chapter3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void process(Runnable r) {
        r.run();
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for(T t: list){
            c.accept(t);
        }
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

        forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
    }


}
