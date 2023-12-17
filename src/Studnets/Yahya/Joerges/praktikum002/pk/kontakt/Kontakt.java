package Studnets.Yahya.Joerges.praktikum002.pk.kontakt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Kontakt {
    private String nachname;
    private String vorname;
    private String telefon;
    private String email;
    private LocalDate geburtstag;
    private Adresse adresse;


    public Kontakt(String nachname, String vorname, String telefon, String email, int day, int mounth, int year, Adresse adresse) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.telefon = telefon;
        this.email = email;
        this.geburtstag =LocalDate.of(year,mounth,day);
        this.adresse = adresse;
    }

    public void drucke(){
        System.out.println("Name: " + vorname + " " + nachname +"\n"+
                "Telefon: " + telefon + "\n"+
                "E-Mail: " + email + "\n"+
                "Geburtstag: " + geburtstag.format(DateTimeFormatter.ofPattern("dd,MM,yyyy")) + "\n"+
                "Adresse: " + adresse);
    }

    @Override
    public String toString() {
        return "Name: " + vorname + " " + nachname +"\n"+
                "Telefon: " + telefon + "\n"+
                "E-Mail: " + email + "\n"+
                "Geburtstag: " + geburtstag.format(DateTimeFormatter.ofPattern("dd,MM,yyyy")) + "\n"+
                "Adresse: " + adresse;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
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

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public String getGeburtstagAsString() {
        return geburtstag.format(DateTimeFormatter.ofPattern("dd,MM,yyyy"));
    }

    public void setGeburtstag(int day, int mounth, int year) {
        this.geburtstag = LocalDate.of(year,mounth,day);
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
