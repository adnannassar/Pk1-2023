package Vorlesung.StreamsAPI.Filter.FilterExampleExternalClassImplemntaion;

import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        Stream.of("Yahaya", "Hasan", "Bayan", "Bana", "Basel", "Badr")
                .filter(new MyFilter())
                .sorted()
                .forEach(new MyConsumer());
    }
}

