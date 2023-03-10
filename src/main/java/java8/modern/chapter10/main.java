package java8.modern.chapter10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws IOException {

        List<String> numbers = Arrays.asList("one", "two", "three");
        numbers.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //내부 클래스 람다
        numbers.forEach(s -> System.out.println(s));

        // 메서드 참조
        numbers.forEach(System.out::println);

        /**
         * 10.2.1 스트림 API는 컬렉션을 조작하는 DSL
         */

        //Before
        String filename = "Hello.jpg";
        List<String> errors = new ArrayList<>();
        int errorCount = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = bufferedReader.readLine();
        while ( line != null && errorCount < 40) {
            if(line.startsWith("ERROR")) {
                errors.add(line);
                errorCount++;
            }
            line = bufferedReader.readLine();
        }

        //After

        List<String> errorsBr = Files.lines(Paths.get(filename))
                .filter(lineBr -> lineBr.startsWith("ERROR"))
                .limit(40)
                .collect(Collectors.toList());

        /**
         * 10.3.1 메서드 체인
         */

        MethodChainingOrderBuilder
                .forCustomer("BigBank")
                .buy(80)
                .stock("IBM")
                .on("NYSE")
                .at(125.00)
                .sell(50)
                .stock("GOOGLE")
                .on("NASDAQ")
                .at(375.00)
                .end();

    }
}
