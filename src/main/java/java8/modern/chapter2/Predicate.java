package java8.modern.chapter2;

/**
 * 3.2.1 함수형 인터페이스
 * @param <T>
 */
public interface Predicate<T> {
    boolean test (T t);
}
