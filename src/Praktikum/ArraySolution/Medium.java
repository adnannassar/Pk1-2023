package Praktikum.ArraySolution;

import java.time.LocalDate;

public abstract class Medium {
    private final int id;
    private String title;
    private int jahr;
    private static int counter = 0;


    public Medium(String title, int jahr) {
        id = counter++;
        this.title = title;
        this.jahr = jahr;
    }

    public Medium(String title) {
        this(title, 0);
    }

    public int alter() {
        return LocalDate.now().getYear() - jahr;
    }

    public abstract void druckeDaten();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
}
