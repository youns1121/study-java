package java8.modern.chapter3;


@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

