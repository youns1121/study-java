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

        /**
         * 5.1.1 프레디케이트로 필터링
         */
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(Collectors.toList());
        System.out.println("vegetarianMenu = " + vegetarianMenu);

        /**
         * 5.1.2 고유 요소 필터링
         */
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        /**
         * 5.2.1 프리디케이트를 이용한 슬라이싱
         */
        List<Dish> filteredMenu = specialMenu.stream()
                .filter(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        System.out.println(filteredMenu);

        /**
         * 5.2.1 프리디케이트를 이용한 슬라이싱 : TAKEWHILE 활용
         */
        List<Dish> slicedMenu1 = specialMenu.stream()
                .takeWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());

        System.out.println("slicedMenu2 = " + slicedMenu1);

        /**
         * 5.2.1 프리디케이트를 이용한 슬라이싱 : DROPWHILE 활용
         */
        List<Dish> slicedMenu2 = specialMenu.stream()
                .dropWhile(dish -> dish.getCalories() < 320)
                .collect(Collectors.toList());
        System.out.println("slicedMenu2 = " + slicedMenu2);
        /**
         * 5.2.2 스트림 축소
         */
        List<Dish> dishes = specialMenu.stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("dishes = " + dishes);

        /**
         * 5.2.3 요소 건너뛰기
         */
        List<Dish> dishesSkip = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("dishesSkip = " + dishesSkip);

        /**
         * 5-1 필터링
         */
        List<Dish> dishesMEAT = menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println("dishesMEAT = " + dishesMEAT);

        /**
         * 5.3.1 스트림의 각 요소에 함수 적용하기
         */
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

        /**
         * 5.3.2 스트림 평면화
         */
        List<String> wordsTest = Arrays.asList("Hello", "World");

        List<String[]> collect = wordsTest.stream()
                .map(word -> word.split(""))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);

        String[] arrayOfWords = {"Goodbye", "World"};
        Stream<String> streamOfWords = Arrays.stream(arrayOfWords);

        /**
         * 5.3.2 스트림 평면화 : map과 Arrays.stream 활용
         */
        List<Stream<String>> collect1 = wordsTest.stream()
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);

        /**
         * 5.3.2 스트림 평면화 : flatMap 사용
         */
        List<String> uniqueCharacters = wordsTest.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueCharacters = " + uniqueCharacters);

        /**
         * 5-2 매핑 : 1번
         */
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numberList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("squares = " + squares);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(3, 4);

        /**
         * 5-2 매핑 : 2번
         */
        List<int[]> pairs = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .map(j -> new int[]{i, j})
                )
                .collect(Collectors.toList());
        /**
         * 5-2 매핑 : 3번
         */
        List<int[]> collect2 = numbers1.stream()
                .flatMap(i -> numbers2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j})
                )
                .collect(Collectors.toList());

        /**
         * 5.4.1 프레디케이트가 적어도 한 요소와 일치하는지 확인인
         */
       if(menu.stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is (somewhat vegetarian friendly!!");
        }

        /**
         * 5.4.2 프레디케이트가 모든 요소와 일치하는 검사 : ALLMATCH
         */
        boolean isHealthy = menu.stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("isHealthy = " + isHealthy);

        /**
         * 5.4.2 프레디케이트가 모든 요소와 일치하는 검사 : NONEMATCH
         */
        isHealthy = menu.stream()
                .noneMatch(d -> d.getCalories() >= 1000);
        System.out.println("isHealthy = " + isHealthy);

        /**
         * 5.4.3 요소 검색
         */
        Optional<Dish> any = menu.stream()
                .filter(Dish::isVegetarian)
                .findAny();
        System.out.println("any = " + any);

        /**
         * 5.4.4 첫 번째 요소 찾기
         */
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> first = someNumbers.stream()
                .map(n -> n * n)
                .filter(n -> n % 3 == 0)
                .findFirst();
        System.out.println("first = " + first);

        /**
         * 5.5.1 요소의 합
         */
        Integer product = someNumbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(product);
        Integer reduce = someNumbers.stream().reduce(0, Integer::sum);
        System.out.println("reduce = " + reduce);

        /**
         * 5.5.2 최대값과 최솟값
         */
        Optional<Integer> max = someNumbers.stream().reduce(Integer::max);
        System.out.println("max = " + max);

        Optional<Integer> min = someNumbers.stream().reduce(Integer::min);
        System.out.println("min = " + min);


        /**
         * 5-3 리듀스
         */
        Integer menuNums = menu.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> a + b);
        System.out.println("menuNums = " + menuNums);

        long count = menu.stream()
                .count();
        System.out.println("count = " + count);

        /**
         * 5.7 숫자형 스트림
         */
        Integer calories = menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("calories = " + calories);

        /**
         * 5.7.1 기본형 특화 스트림 : 숫자 스트림으로 매핑
        */
        calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("calories = " + calories);

        /**
         * 5.7.1 기본형 특화 스트림 : 객체 스트림으로 복원하기
         */
        IntStream intStream = menu.stream()
                .mapToInt(Dish::getCalories);
        Stream<Integer> stream = intStream.boxed();

        System.out.println("intStream = " + intStream);
        System.out.println("stream = " + stream.collect(Collectors.toList()));

        /**
         * 5.7.1 기본형 특화 스트림 : 기본값(OptionalInt)
         */
        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        System.out.println("maxCalories = " + maxCalories);

        int elseMax = maxCalories.orElse(1);
        System.out.println("elseMax = " + elseMax);

        /**
         * 5.7.2 숫자 범위 : RANGECLOSED
         */
        IntStream evenNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers.count());

        /**
         * 5.7.2 숫자 범위 : RANGE
         */
        evenNumbers = IntStream.range(1, 100)
                .filter(n -> n % 2 == 0);
        System.out.println("evenNumbers = " + evenNumbers.count());

        /**
         * 5.7.3 숫자 스트림 활용 : 피타고라스 수
         */
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

        /**
         * 5.8.2 null이 될 수 있는 객체로 스트림 만들기
         */
        String homeValue = System.getProperty("home");
        Stream<String> homeValueStream = homeValue == null ? Stream.empty() : Stream.of("home");
        System.out.println("homeValueStream = " + homeValueStream.collect(Collectors.toList()));

        homeValueStream = Stream.ofNullable(System.getProperty("home"));
        System.out.println("homeValueStream = " + homeValueStream.collect(Collectors.toList()));

        Stream<String> values = Stream.of("config", "home", "user")
                .flatMap(key -> Stream.ofNullable(System.getProperty(key)));
        System.out.println("values = " + values.collect(Collectors.toList()));

        /**
         * 5.8.3 배열로 스트림 만들기
         */
        int[] numberArray = {2, 3, 5, 7, 11, 13};
        int sum = Arrays.stream(numberArray).sum();
        System.out.println("sum = " + sum);

        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        /**
         * 퀴즈 5-4 피보나치수열 집합
         */
        Stream.iterate(new int[]{0, 1},
                t -> new int[]{t[1], t[0]+t[1]})
                .limit(20)
                .forEach(t -> System.out.println("("+t[0] + "," + t[1] +")"));

        IntStream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);
        /*종료할 수 없음*/
//        IntStream.iterate(0, n -> n + 4)
//            .filter(n -> n < 100)
//            .forEach(System.out::println);

        IntStream.iterate(0, n -> n + 4)
                .takeWhile(n -> n < 100)
                .forEach(System.out::println);
    }
}
