package Vorlesung.Lampdas.HrManagmentSystem;

import java.util.Comparator;
import java.util.LinkedList;

public class VerwaltungMitLampdas {
    private LinkedList<Employee> employees;

    public VerwaltungMitLampdas() {
        this.employees = new LinkedList<>();
    }

    public void addEmployee(Employee e) {
        if (e != null) {
            employees.add(e);
        }
    }

    public void sortByLastName() {
        employees.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
    }

    public void printAllEmployees() {
        employees.forEach(e -> System.out.println(e));
    }

    public void printAllEmployeesLastNameStartWith(String prefix) {
        employees.forEach(e -> {
            if(e.getName().toLowerCase().startsWith(prefix.toLowerCase()))
            System.out.println(e);
        });

    }
}
