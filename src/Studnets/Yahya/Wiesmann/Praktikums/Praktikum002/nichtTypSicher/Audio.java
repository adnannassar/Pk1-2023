package Studnets.Yahya.Wiesmann.Praktikums.Praktikum002.nichtTypSicher;

import java.util.Objects;

public class Audio extends Medium {
    private String interpret;
    private int dauer;


    public Audio(String title, int jahr, String interpret, int dauer) {
        super(title, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }


    public String getInterpret() {
        return interpret;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public int getDauer() {
        return dauer;
    }


    public void setDauer(int dauer) {
        this.dauer = dauer;
    }

    @Override
    public void druckeDaten() {
        System.out.println("ID = " + getId() + " \"" + getTitle() + " von " + getInterpret() + " aus " + getJahr() + " Spieldauer: " + getDauer() + " sek.");
    }

    @Override
    public String toString(){
        return "ID = " + getId() + " \"" + getTitle() + " von " + getInterpret() + " aus " + getJahr() + " Spieldauer: " + getDauer() + " sek.";
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),interpret,dauer);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        if (super.equals(o) == false) return false;
        Audio x = (Audio) o;
        if (this.interpret.equals(x.interpret) && this.dauer == x.dauer) return true;
        else return false;
    }
}
