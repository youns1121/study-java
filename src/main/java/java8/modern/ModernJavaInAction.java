package java8.modern;

import java8.modern.chapter2.Farm;

public class ModernJavaInAction {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });

        Thread t1 = new Thread(() -> System.out.println("Hello World"));

    }
}
