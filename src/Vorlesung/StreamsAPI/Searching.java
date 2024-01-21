package Vorlesung.StreamsAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Searching {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 7));
        boolean anyMatch = list.stream().anyMatch(n -> n % 2 == 0);
        boolean allMatch = list.stream().allMatch(n -> n % 2 == 0);
        boolean noneMatch = list.stream().noneMatch(n -> n % 2 != 0);

        System.out.println("anyMatch  " + anyMatch);
        System.out.println("allMatch  " + allMatch);
        System.out.println("noneMatch " + noneMatch);
    }
}
