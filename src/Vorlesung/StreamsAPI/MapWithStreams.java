package Vorlesung.StreamsAPI;

import java.util.*;
import java.util.stream.Stream;

public class MapWithStreams {
    public static void main(String[] args) {
        List<Student> db = new ArrayList<>(Arrays.asList(
                new Student(1, "Yahya", 20),
                new Student(2, "Bayan", 20),
                new Student(3, "Hasan", 20)
        ));

        db.stream().map(s -> s.note).forEach(System.out::println);
    }
}

class Student {
    int note;
    String name;
    int age;

    public Student(int note, String name, int age) {
        this.note = note;
        this.name = name;
        this.age = age;
    }
}
