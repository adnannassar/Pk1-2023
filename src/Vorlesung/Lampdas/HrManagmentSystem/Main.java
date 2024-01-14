package Vorlesung.Lampdas.HrManagmentSystem;

public class Main {
    public static void main(String[] args) {
        VerwaltungMitLampdas verwaltung = new VerwaltungMitLampdas();
        verwaltung.addEmployee(new Employee("Bayan", "Test", 25));
        verwaltung.addEmployee(new Employee("Salam", "Baaz", 22));
        verwaltung.addEmployee(new Employee("Hasan", "Müller", 27));
        verwaltung.addEmployee(new Employee("Basel", "Vollmer", 27));

        verwaltung.sortByLastName();
        verwaltung.printAllEmployees();
        System.out.println();
        verwaltung.printAllEmployeesLastNameStartWith("Ba");
    }
}
