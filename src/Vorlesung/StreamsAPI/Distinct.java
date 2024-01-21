package Vorlesung.StreamsAPI;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream.of(1,1,2,2,3,4,5,5,6).distinct().forEach(System.out::println);
    }
}
