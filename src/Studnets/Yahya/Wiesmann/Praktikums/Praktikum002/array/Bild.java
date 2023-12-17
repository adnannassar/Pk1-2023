package Studnets.Yahya.Wiesmann.Praktikums.Praktikum002.array;


import java.util.Objects;

public class Bild extends Medium {
    private String ort;



    public Bild(String title, int jahr, String ort){
        super(title,jahr);
        this.ort = ort;
    }


    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public void druckeDaten() {
        System.out.println("ID = " + getId() + " \"" + getTitle() + " aufgenommen im Jahr " + getJahr() + " in " + getOrt());
    }

    @Override
    public String toString(){
        return "ID = " + getId() + " \"" + getTitle() + " aufgenommen im Jahr " + getJahr() + " in " + getOrt();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),ort);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        if (super.equals(o) == false) return false;
        Bild x = (Bild) o;
        if (this.ort.equals(x.ort)) return true;
        else return false;
    }
}
