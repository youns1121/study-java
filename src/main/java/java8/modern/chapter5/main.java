package java8.modern.chapter5;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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

        List<Dish> specialMenu = Arrays.asList(
                new Dish("seasonal fruit", true, 120, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER)
        );

        List<String> words = Arrays.asList("Modern", "Java", "In", "Action");

        List<Dish> vegetarianDishes = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        System.out.println(vegetarianDishes);

        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);


        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        System.out.println(filteredMenu);

        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        System.out.println("slicedMenu2 = " + slicedMenu1);

        List<Dish> slicedMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        System.out.println("slicedMenu2 = " + slicedMenu2);

        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("dishes = " + dishes);

        List<Dish> dishesSkip = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());

        System.out.println("dishesSkip = " + dishesSkip);

        List<Dish> dishesMEAT = menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());

        System.out.println("dishesMEAT = " + dishesMEAT);

        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());

        System.out.println("dishNames = " + dishNames);

        List<Integer> wordLength = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("wordLength = " + wordLength);

        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("dishNameLengths = " + dishNameLengths);

        List<String> wordsTest = Arrays.asList("Hello", "World");

        List<String[]> collect = wordsTest.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("collect = " + collect);

        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        List<Stream<String>> collect1 = wordsTest.stream()
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("collect1 = " + collect1);

        List<String> uniqueCharacters = wordsTest.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("uniqueCharacters = " + uniqueCharacters);

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numberList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("squares = " + squares);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        List<int[]> pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j})
                )
                .collect(Collectors.toList());

        List<int[]> collect2 = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j})
                )
                .collect(Collectors.toList());

        if(menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is (somewhat vegetarian friendly!!");
        }

        boolean isHealthy = menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);

        System.out.println("isHealthy = " + isHealthy);

        isHealthy = menu.stream()
                .noneMatch(d -> d.getCalories() > 1000);

        System.out.println("isHealthy = " + isHealthy);

        Optional<Dish> any = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();

        System.out.println("any = " + any);

        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first = someNumbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 3 == 0)
                .findFirst();

        System.out.println("first = " + first);

        Integer product = someNumbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
        Integer reduce = someNumbers.stream().reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);

        Optional<Integer> max = someNumbers.stream().reduce(Integer::max);
        System.out.println("max = " + max);

        Optional<Integer> min = someNumbers.stream().reduce(Integer::min);
        System.out.println("min = " + min);

        Integer menuNums = menu.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println("menuNums = " + menuNums);

        long count = menu.stream()
                .count();
        System.out.println("count = " + count);

        Integer calories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("calories = " + calories);

        calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("calories = " + calories);

        IntStream intStream = menu.stream()
                .mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();

        System.out.println("intStream = " + intStream);
        System.out.println("stream = " + stream.collect(Collectors.toList()));

        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();

        System.out.println("maxCalories = " + maxCalories);

        int elseMax = maxCalories.orElse(1);
        System.out.println("elseMax = " + elseMax);

        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers.count());

        evenNumbers = IntStream.range(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers.count());

        Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a ->
                        IntStream.rangeClosed(a, 100)
                                .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );

        pythagoreanTriples.limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));

        System.out.println("");
        Stream<double[]> pythagoreanTriples2 = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .mapToObj(
                                b -> new double[]{a, b, Math.sqrt(a * a + b * b)})
                        .filter(t -> t[2] % 1 == 0));
        pythagoreanTriples2.limit(5)
                .forEach(t -> System.out.println(t[0] + ", " + t[1] + ", " + t[2]));
        /**
         * 5.8.1 값으로 스트림 만들기
         */
        Stream<String> streamValues= Stream.of("Modern", "Java", "In ", "Action");
        streamValues.map(String::toUpperCase).forEach(System.out::println);
        Stream<String> emptyStream = Stream.empty();
        System.out.println("emptyStream = " + emptyStream.collect(Collectors.toList()));


    }
}
