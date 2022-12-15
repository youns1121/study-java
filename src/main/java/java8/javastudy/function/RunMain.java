package java8.javastudy.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RunMain {

    public static void main(String[] args) {
        int testNum = 20;

        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(1));

//        //람다를 사용하는 방법
//        Function<Integer, Integer> plus10Lamda = (i) -> {
//            return i + 20;
//        };

        Function<Integer, Integer> plus10Lamda = (i) -> i + 20;
        System.out.println(plus10Lamda.apply(20));

        //함수 조합
        Function<Integer, Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10Lamda.apply(2));

        //compose : 뒤에오는 함수를적용(multiply2) 한 후 이 값을 가지고
        //plus10의 입력값으로 사용한다.
        System.out.println(multiply2.apply(10));
        System.out.println(plus10.andThen(multiply2).apply(3));

        // Consumer
        Consumer<Integer> prinT = (i) -> System.out.println(i);
        prinT.accept(30);

        // Supplier
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        // Predicate
        Predicate<String> startWithMinSik = (s) -> s.startsWith("minsik");
        System.out.println(startWithMinSik.test("minsik"));

    }
}
