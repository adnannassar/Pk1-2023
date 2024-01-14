package Vorlesung.StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CreationOfStream {
    public static void main(String[] args){
        // Create from Array
        Integer[] array = {1, 2, 3, 4};
        Stream<Integer> arrayStream = Arrays.stream(array);

        // Create from Collection
        List<Integer> list = Arrays.asList(1,2,3,4);
        Stream<Integer> listStream = list.stream();

        // Create from Values
        Stream<String> stringStream = Stream.of("Bayan", "Salam", "Hasan");
        Stream<Integer> integerStreamStream = Stream.of(1, 2, 3);

        // Create using Generates
        Stream<Double> randomNumbers = Stream.generate(Math::random);
    }
}
