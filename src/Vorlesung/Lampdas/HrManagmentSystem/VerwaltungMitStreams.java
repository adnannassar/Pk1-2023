package Vorlesung.Lampdas.HrManagmentSystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class VerwaltungMitStreams {

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>(Arrays.asList(
                new Employee("Bayan", "Test", 25),
                new Employee("Salam", "Baaz", 22),
                new Employee("Hasan", "Müller", 27),
                new Employee("Basel", "Vollmer", 21)
        ));

        employees
                .stream()
                .filter(e -> e.getName().startsWith("Ba"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);
    }
}
