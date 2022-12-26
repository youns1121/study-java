package java8.modern;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ModernJavaInAction {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        });

        Thread t1 = new Thread(() -> System.out.println("Hello World"));

        /**
         * 2.4.3 Callable을 결과로 반환하기
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> threadName = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return Thread.currentThread().getName();
            }
        });

        Future<String> threadName2 = executorService.submit(() -> Thread.currentThread().getName());

    }
}
