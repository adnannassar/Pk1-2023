package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_002;

import java.util.function.Predicate;

public class CarTeslaPredicate implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        return car.getCarMark().equals("Tesla");
    }
}
