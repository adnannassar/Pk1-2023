package Studnets.Yahya.Wiesmann.Praktikums.Praktikum001;


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
}
