package java8.modern.chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );

//        System.out.println(menu);
        List<String> threeHighCaloricSishNames = menu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(Collectors.toList());

//        System.out.println(threeHighCaloricSishNames);

        List<String> title = Arrays.asList("Java8", "In", "Action");
        Stream<String> s = title.stream();
//        s.forEach(System.out::println);
//        List<String> names = new ArrayList<>();
//        for(Dish dish : menu) {
//            names.add(dish.getName());
//        }

//         names = menu.stream()
//                .map(Dish::getName)
//                .collect(Collectors.toList());

        List<String> names = menu.stream()
                .filter(dish -> {
                    System.out.println("filtering:" + dish.getName());
                    return dish.getCalories() > 300;
                })
                .map(dish -> {
                    System.out.println("mapping:" + dish.getName());
                    return dish.getName();
                })
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(names);

    }


}
