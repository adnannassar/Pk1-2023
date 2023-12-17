package Studnets.Yahya.Joerges.praktikum005.pk.kontakt;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adresse adresse = (Adresse) o;
        return hausnummer == adresse.hausnummer && plz == adresse.plz && this.strasse.equals(adresse.getStrasse()) && this.ort.equals(adresse.getOrt()) && this.land.equals(adresse.getLand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(strasse, hausnummer, plz, ort, land);
    }

    @Override
    public String toString() {
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
