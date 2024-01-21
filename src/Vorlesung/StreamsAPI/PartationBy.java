package Vorlesung.StreamsAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartationBy {
    public static void main(String[] args) {
     Map<Boolean, List<String>> map =
             Stream
                .of("Shaker", "Amani","Zainab", "Nesrin", "Israa", "Omar", "Abdou", "Mariam")
                .collect(Collectors.partitioningBy( name -> name.length() % 2 == 0));
     System.out.println(map);
    }
}
