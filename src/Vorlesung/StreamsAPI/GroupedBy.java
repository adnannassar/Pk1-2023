package Vorlesung.StreamsAPI;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupedBy {
    public static void main(String[] args) {
     Map<Integer, List<String>> map =
             Stream
                .of("Shaker", "Amani","Zainab", "Nesrin", "Israa", "Omar", "Abdou", "Mariam")
                .collect(Collectors.groupingBy( name -> name.length()));
     System.out.println(map);
    }
}
