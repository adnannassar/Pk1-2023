package Vorlesung.StreamsAPI;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        Stream.of(-1, 2, 7, 3, 0, 100, 4, 6, 8, 10)
                .map(v -> v % 2 == 0)
                .sorted()
                .forEach(System.out::println);
    }
}
