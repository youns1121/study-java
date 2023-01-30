package java8.modern.chapter6;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

        /**
         * 6.3.2 다수준 그룹화
         */
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel = menu.stream().collect(
                groupingBy(Dish::getType,
                        groupingBy(dish -> {
                            if (dish.getCalories() <= 400)
                                return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700)
                                return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        })
                )
        );
        System.out.println("dishesByTypeCaloricLevel = " + dishesByTypeCaloricLevel);

        /**
         * 6.3.3 서브그룹으로 데이터 수집
         */
        Map<Dish.Type, Long> typesCount = menu.stream().collect(
                groupingBy(Dish::getType, counting()));
        System.out.println("typesCount = " + typesCount);

        Map<Dish.Type, Optional<Dish>> mostCaloricByTypeOptional = menu.stream()
                .collect(groupingBy(Dish::getType, maxBy(comparingInt(Dish::getCalories))));
        System.out.println("mostCaloricByTypeOptional = " + mostCaloricByTypeOptional);

        Map<Dish.Type, Dish> mostCaloricByType = menu.stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(maxBy(comparingInt(Dish::getCalories)),
                        Optional::get)));
        System.out.println("mostCaloricByType = " + mostCaloricByType);

        Map<Dish.Type, Integer> totalCaloriesByType = menu.stream().collect(groupingBy(Dish::getType,
                summingInt(Dish::getCalories)));
        System.out.println("totalCaloriesByType = " + totalCaloriesByType);

        Map<Dish.Type, Set<CaloricLevel>> caloricLevelsByType = menu.stream().collect(
                groupingBy(Dish::getType, mapping(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        },
                        toSet())));
        System.out.println("caloricLevelsByType = " + caloricLevelsByType);

        caloricLevelsByType = menu.stream().collect(
                groupingBy(Dish::getType, mapping(dish -> {
                            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                            else return CaloricLevel.FAT;
                        },
                        toCollection(HashSet::new) )));
        System.out.println("caloricLevelsByType = " + caloricLevelsByType);

        /**
         * 6.4 분할
         */

        Map<Boolean, List<Dish>> partitionedMenu = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println("partitionedMenu = " + partitionedMenu);

        /**
         * 6.4.1 분할의 장점
         */
        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream()
                .collect(
                        partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));

        System.out.println("vegetarianDishesByType = " + vegetarianDishesByType);

        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream().collect(
                partitioningBy(Dish::isVegetarian,
                        collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get))
        );
        System.out.println("mostCaloricPartitionedByVegetarian = " + mostCaloricPartitionedByVegetarian);

        Map<Boolean, Map<Boolean, List<Dish>>> quiz1 = menu.stream().collect(partitioningBy(Dish::isVegetarian, partitioningBy(d -> d.getCalories() > 500)));
        System.out.println("quiz1 = " + quiz1);
        //컴파일 되지 않음
        //R collect2 = menu.stream().collect(partitioningBy(Dish::isVegetarian, partitioningBy(Dish::getType)));
        Map<Boolean, Long> quiz3 = menu.stream().collect(partitioningBy(Dish::isVegetarian, counting()));
        System.out.println("quiz3 = " + quiz3);





    }
    /**
     * 6.4.2 숫자를 소수와 비소수로 분할하기
     */
    public boolean isPrimeV1(int candidate) {
        return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
    }

    public boolean isPrimeV2(int candidate) {
        int candidateRoot = (int) Math.sqrt((double)candidate);
        return IntStream.rangeClosed(2, candidateRoot)
                .noneMatch(i -> candidate % i == 0);
    }

    public Map<Boolean, List<Integer>> partitionPrimes(int n) {
        return IntStream.rangeClosed(2, n).boxed()
                .collect(
                        partitioningBy(candidate -> isPrimeV2(candidate)));
    }
}
