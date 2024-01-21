package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_002;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
public class Dealership {

    public static Optional<Car> mostExpensive(List<Car> liste) {
        return liste.stream().max((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
    }

    public static double totalPriceOf(List<Car> liste) {
        return liste.stream().mapToDouble(car -> car.getPrice()).sum();
    }

    public static long totalNumberOf(Predicate<Car> p, List<Car> list) {
        return list.stream().filter(p).count();
    }
}
