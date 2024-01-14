package Vorlesung.Lampdas.HrManagmentSystem;

import java.util.Comparator;
import java.util.LinkedList;

public class VerwaltungOhneLampdas {
    private LinkedList<Employee> employees;

    public VerwaltungOhneLampdas() {
        this.employees = new LinkedList<>();
    }

    public void addEmployee(Employee e) {
        if (e != null) {
            employees.add(e);
        }
    }

    public void sortByLastName() {
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void printAllEmployeesLastNameStartWith(String prefix) {
        for (Employee e : employees) {
            if (e.getName().toLowerCase().startsWith(prefix.toLowerCase())) {
                System.out.println(e);
            }
        }
    }
}
