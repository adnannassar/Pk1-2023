package Studnets.Yahya.Wiesmann.Praktikums.Praktikum003;

import java.time.LocalDate;
import java.util.Objects;

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


    public int alter() {
        return LocalDate.now().getYear() - jahr;
    }

    public abstract void druckeDaten();

    public void druckeAlter() {
        System.out.println("\"" + getTitle() + "\"" + " ist " + alter() + " Jahre alt.");
    }

    @Override
    public int hashCode() {
        return Objects.hash(title,jahr);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Medium x = (Medium) o;
        if (this.jahr == x.jahr && this.title.equals(x.getTitle())) return true;
        else return false;
    }
}
