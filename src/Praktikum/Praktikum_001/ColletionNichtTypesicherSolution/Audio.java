package Praktikum.Praktikum_001.ColletionNichtTypesicherSolution;

public class Audio extends Medium {
    private String interpret;
    private int dauer;

    public Audio(String title, int jahr, String interpret, int dauer) {
        super(title, jahr);
        this.interpret = interpret;
        this.dauer = dauer;
    }

    @Override
    public void druckeDaten() {
        System.out.println("ID = " + getId() + " \"" + getTitle() + " von " + this.interpret + " aus " + getJahr() + " Spieldauer: " + this.dauer + " sek.");
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
