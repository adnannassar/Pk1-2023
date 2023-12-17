package Studnets.Yahya.Joerges.praktikum005.pk.kontakt;

import java.util.Comparator;
import java.util.Objects;

public abstract class Kontakt implements Comparable<Kontakt> {
    private String telefon;
    private String email;


    public Kontakt(String telefon, String email) {
        this.telefon = telefon;
        this.email = email;
    }

    public abstract void drucke();
    public abstract String getSuchkriterium();

    @Override
    public String toString() {
        return "Telefon: " + telefon + "\n"+
                "E-Mail: " + email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kontakt k = (Kontakt) o;
        if (this.telefon.equals(k.getTelefon()) && this.email.equals(k.getEmail())) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(telefon, email);
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Kontakt k) {
        return this.getSuchkriterium().compareTo(k.getSuchkriterium());
    }
}
