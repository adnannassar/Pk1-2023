package Vorlesung.StreamsAPI;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectToList {
    public static void main(String[] args) {
     List<String> list =     Stream
                .of("Shaker", "Amani","Zainab", "Nesrin", "Israa", "Omar", "Abdou", "Mariam")
                .filter(name -> name.toLowerCase().endsWith("r"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
