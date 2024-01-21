package Vorlesung.StreamsAPI.Filter.FilterExampleLambda;

import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {

        Stream.of("Yahaya", "Hasan", "Bayan", "Bana", "Basel", "Badr")
                .filter(s -> s.toLowerCase().startsWith("b"))
                .sorted()
                .forEach(System.out::println);
    }
}

