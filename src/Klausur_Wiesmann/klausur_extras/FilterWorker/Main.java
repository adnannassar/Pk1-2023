package Klausur_Wiesmann.klausur_extras.FilterWorker;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Collection<String> strings = new LinkedList<>();
        strings.add("Hallo");
        strings.add("Welt");
        strings.add("Test");
        strings.add("Hallo Welt");
        strings.add("Beispiel");

        Predicate<String> predicate = s -> s.contains("Hallo"); // Prädikat für das Filtern

        Collection<String> gefilterteStrings = StringFilterUtility.filterStrings(strings, predicate);

        System.out.println("Gefilterte Strings:");
        gefilterteStrings.forEach(System.out::println);
    }
}
