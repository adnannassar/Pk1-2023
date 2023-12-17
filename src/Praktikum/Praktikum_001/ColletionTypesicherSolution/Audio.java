package Praktikum.Praktikum_001.ColletionTypesicherSolution;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Audio extends Medium implements Serializable {
    private static final long serialVersionUID = 2L;

    private String interpret;
    private int dauer;

    public Audio(String title, int jahr, String interpret, int dauer) {
        super(title, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    @Override
    public void druckeDaten(OutputStream os) {
        PrintWriter pr = new PrintWriter(os);
        pr.println("ID = " + getId() + " \"" + getTitle() + " von " + this.interpret + " aus " + getJahr() + " Spieldauer: " + this.dauer + " sek.");
        pr.flush();
    }

    @Override
    public String druckeDatenAsString() {
       return "ID = " + getId() + " \"" + getTitle() + " von " + this.interpret + " aus " + getJahr() + " Spieldauer: " + this.dauer + " sek.\n";
    }

    @Override
    public String toString() {
        return "ID = " + getId() + " \"" + getTitle() + " von " + this.interpret + " aus " + getJahr() + " Spieldauer: " + this.dauer + " sek.";
    }

    public String getInterpret() {
        return interpret;
    }

    public int getDauer() {
        return dauer;
    }

    public void setInterpret(String interpret) {
        this.interpret = interpret;
    }

    public void setDauer(int dauer) {
        this.dauer = dauer;
    }
}
