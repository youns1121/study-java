package java8.modern.chapter6;


import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<Dish> menu = asList(
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

        /**
         * 6.2 리듀싱과 요약
         */
        Long howManyDishesBefore = menu.stream().collect(counting());
        System.out.println("howManyDishesBefore = " + howManyDishesBefore);

        long howManyDishesAfter = menu.stream().count();
        System.out.println("howManyDishes = " + howManyDishesAfter);

        /**
         * 6.2.1 스트림값에서 최댓값과 최솟값 검색
         */
        Comparator<Dish> dishCaloriesComparator = comparingInt(Dish::getCalories);

        Optional<Dish> mostCalorieDish = menu.stream()
                .collect(maxBy(dishCaloriesComparator));
        System.out.println("mostCalorieDish = " + mostCalorieDish.orElse(null));

        /**
         * 6.2.2 요약 연산
         */
        Integer totalCalories = menu.stream().collect(summingInt(Dish::getCalories));
        System.out.println("totalCalories = " + totalCalories);

        double avgCalories = menu.stream().collect(averagingInt(Dish::getCalories));
        System.out.println("avgCalories = " + avgCalories);

        IntSummaryStatistics menuStatistics = menu.stream().collect(summarizingInt(Dish::getCalories));
        System.out.println("menuStatistics = " + menuStatistics);

        /**
         * 6.2.3 문자열 연결
         */
        String shortMenu = menu.stream().map(Dish::getName).collect(joining());
        System.out.println("shortMenu = " + shortMenu);

        shortMenu = menu.stream()
                .map(Dish::getName)
                .collect(joining(", "));
        System.out.println("shortMenu = " + shortMenu);

        /**
         * 6.2.4 범용 리듀싱 요약 연산
         */
        totalCalories = menu.stream().collect(reducing(0, Dish::getCalories, (i, j) -> i + j));
        System.out.println("totalCalories = " + totalCalories);

        mostCalorieDish = menu.stream()
                .collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        System.out.println("mostCalorieDish = " + mostCalorieDish.orElse(null));

        totalCalories = menu.stream()
                .collect(reducing(0, Dish::getCalories, Integer::sum));
        System.out.println("totalCalories = " + totalCalories);

        totalCalories = menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        System.out.println("totalCalories = " + totalCalories);

        totalCalories = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("totalCalories = " + totalCalories);

        /**
         * 퀴즈 6-1 리듀싱으로 문자열 연결하기
         */
        String collect = menu.stream().map(Dish::getName).collect(joining(", "));
        List<String> collect1 = menu.stream().map(Dish::getName).collect(toList());
        System.out.println("collect = " + collect);
        System.out.println("collect1 = " + collect1);

        /**
         * 6.3 그룹화
         */

        Map<Dish.Type, List<Dish>> dishByType = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println("dishByType = " + dishByType);

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(
                groupingBy(dish -> {
                    if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                })
        );
        System.out.println("dishesByCaloricLevel = " + dishesByCaloricLevel);

        /**
         * 6.3.1 그룹화된 요소 조작
         */
        Map<Dish.Type, List<Dish>> caloricDishesByType = menu.stream()
                .filter(dish -> dish.getCalories() > 500)
                .collect(groupingBy(Dish::getType));
        System.out.println("caloricDishesByType = " + caloricDishesByType);

        caloricDishesByType = menu.stream()
                .collect(groupingBy(Dish::getType, filtering(dish -> dish.getCalories() > 500, toList())));
        System.out.println("caloricDishesByType = " + caloricDishesByType);

        Map<Dish.Type, List<String>> dishNamesByType = menu.stream()
                .collect(groupingBy(Dish::getType, mapping(Dish::getName, toList())));
        System.out.println("dishNamesByType = " + dishNamesByType);

        Map<String, List<String>> dishTags = new HashMap<>();
        dishTags.put("pork", asList("greasy", "salty"));
        dishTags.put("beef", asList("salty", "roasted"));
        dishTags.put("chicken", asList("fried", "crisp"));
        dishTags.put("french fries", asList("greasy", "fried"));
        dishTags.put("rice", asList("light", "natural"));
        dishTags.put("season fruit", asList("fresh", "natural"));
        dishTags.put("pizza", asList("tasty", "salty"));
        dishTags.put("prawns", asList("tasty", "roasted"));
        dishTags.put("salmon", asList("delicious", "fresh"));

        Map<Dish.Type, Set<String>> dishNamesBySetType = menu.stream()
                .collect(groupingBy(Dish::getType, flatMapping(dish -> dishTags.get(dish.getName()).stream(), toSet())));
        System.out.println("dishNamesBySetType = " + dishNamesBySetType);
    }
}
