package Studnets.Yahya.Wiesmann.Praktikums.Praktikum001;

public class Audio extends Medium {
    private String interpret;
    private int dauer;


    public Audio (String title,int jahr, String interpret, int dauer){
        super(title,jahr);
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
}
