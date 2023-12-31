package Praktikum.ColletionTypesicherSolution.Datenhaltung;

import java.io.OutputStream;
import java.io.Serializable;
import java.time.LocalDate;

public abstract class Medium implements Comparable<Medium> , Serializable {
    private static final long serialVersionUID = 1L;
    private final int id;
    private String title;
    private int jahr;
    private static int counter = 0;

    public Medium() {
        id = counter++;
    }

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

    public abstract void druckeDaten(OutputStream os);
    public abstract String druckeDatenAsString();

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

    @Override
    public int compareTo(Medium o2) {
        return this.jahr - o2.getJahr();
    }
}
