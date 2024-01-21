package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>(Arrays.asList(
                new Car("Tesla", "X", "Red", 100),
                new Car("BMW", "X5", "Blue", 50),
                new Car("AUDI", "Q7", "Yellow", 150),
                new Car("Tesla", "S", "Orange", 200)

        ));

        System.out.println("mostExpensive: "  + Dealership.mostExpensive(cars).get().getPrice());
        System.out.println("totalPriceOf: "  + Dealership.totalPriceOf(cars));
        System.out.println("totalNumberOf: "  + Dealership.totalNumberOf(new CarTeslaPredicate(),cars));
    }
}
