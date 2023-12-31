package Praktikum.ColletionTypesicherSolution.Datenhaltung;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Bild extends Medium implements Serializable {
    private static final long serialVersionUID = 3L;

    private String ort;
    public Bild() {
    }
    public Bild(String title, int jahr, String ort) {
        super(title, jahr);
        this.ort = ort;
    }

    @Override
    public void druckeDaten(OutputStream os) {
        PrintWriter pr = new PrintWriter(os);
        pr.println("ID = " + getId() + " \"" + getTitle() + " aufgenommen im Jahr " + getJahr() + " in " + this.ort);
        pr.flush();
    }

    @Override
    public String druckeDatenAsString() {
        return "ID = " + getId() + " \"" + getTitle() + " aufgenommen im Jahr " + getJahr() + " in " + this.ort + "\n";
    }

    @Override
    public String toString() {
        return "ID = " + getId() + " \"" + getTitle() + " aufgenommen im Jahr " + getJahr() + " in " + this.ort;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
