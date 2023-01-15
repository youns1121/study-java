package java8.modern.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class finalEx {
    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        /**
         * 1. 2011년에 일어난 모든 트랜잭션을 찾아 오름차순으로 정리하시오.
         */
        List<String> ex1 = transactions.stream()
                .filter(tr -> tr.getYear() == 2011)
                .map(Transaction::toString)
                .collect(Collectors.toList());

        System.out.println("ex1 = " + ex1);

        /**
         * 2. 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
         */

        List<String> ex2 = transactions.stream()
                .map(tr -> tr.getTrader().getCity())
                .collect(Collectors.toList());
        System.out.println("ex2 = " + ex2);

        /**
         * 3. 케임브릿지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
         */
        List<String> ex3 = transactions.stream()
                .filter(tr -> tr.getTrader().getCity().equals("Cambridge"))
                .map(tr -> tr.getTrader().getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("ex3 = " + ex3);

        /**
         * 4. 모든 거래자의 이름을 알파벳순으로 정렬해서 반환하시오
         */
        List<String> ex4 = transactions.stream()
                .map(tr -> tr.getTrader().getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("ex4 = " + ex4);

        /**
         * 5. 밀라노에 거래자가 있는가?
         */
        boolean ex5 = transactions.stream()
                .anyMatch(tr -> tr.getTrader().getCity().equals("Milan"));

        System.out.println("ex5 = " + ex5);

        /**
         * 6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
         */
        List<Transaction> ex6 = transactions.stream()
                .filter(tr -> tr.getTrader().getCity().equals("Cambridge"))
                .collect(Collectors.toList());

        System.out.println("ex6 = " + ex6);

        /**
         * 7. 전체 트랜잭션 중 최댓값은 얼마인가?
         */
        Optional<Integer> ex7 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::max);
        System.out.println("ex7 = " + ex7);

        /**
         * 8. 전체 트랜잭션 중 최솟값은 얼마인가?
         */
        Optional<Integer> ex8 = transactions.stream()
                .map(Transaction::getValue)
                .reduce(Integer::min);

        System.out.println("ex8 = " + ex8);


    }
}
