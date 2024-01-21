package Vorlesung.StreamsAPI.Filter.FilterExampleExternalClassImplemntaion;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class OlaWay {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList(
                "Yahaya", "Hasan", "Bayan", "Bana", "Basel", "Badr"
        ));


        list = filterOld(list, "b");
        sort(list);
        printOld(list);
    }

    public static void sort(LinkedList<String> names) {
        Collections.sort(names);
    }

    public static LinkedList<String> filterOld(LinkedList<String> names, String str) {
        LinkedList<String> erg = new LinkedList<>();
        for (String name : names) {
            if (name.toLowerCase().startsWith(str)) {
                erg.add(name);
            }
        }
        return erg;
    }

    public static void printOld(LinkedList<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

}
