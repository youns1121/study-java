package java8.modern.chapter2;

import static java8.modern.chapter2.Color.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
