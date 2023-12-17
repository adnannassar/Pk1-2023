package Studnets.Yahya.Joerges.praktikum002.pk.kontakt;

public class Adresse {
    private String strasse;
    private int hausnummer;
    private int plz;
    private String ort;
    private String land;

    public Adresse(String strasse, int hausnummer, int plz, String ort,String land){
        this.strasse = strasse;
        this.hausnummer= hausnummer;
        this.plz = plz;
        this.ort = ort;
        this.land = land;
    }

    @Override
    public java.lang.String toString() {
        return "Adresse: " + strasse + " " + hausnummer + " , " + plz + " " + ort + " " + land;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }
}
