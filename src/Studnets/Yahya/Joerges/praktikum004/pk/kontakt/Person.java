package Studnets.Yahya.Joerges.praktikum004.pk.kontakt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person extends Kontakt {
    private String nachname;
    private String vorname;
    private LocalDate geburtstag;
    private Adresse adresseBeruflich;
    private Adresse adressePrivate;

    public Person(String nachname, String vorname, int day,int mounth, int year, String telefon, String email) {
        super(telefon, email);
        this.nachname = nachname;
        this.vorname = vorname;
        this.geburtstag = LocalDate.of(year,mounth,day);
    }


    @Override
    public void drucke() {
        System.out.println("Name: " + vorname + " " + nachname + "\n" +
                "Telefon: " + super.getTelefon() + "\n" +
                "E-Mail: " + super.getEmail() + "\n" +
                "Geburtstag: " + geburtstag.format(DateTimeFormatter.ofPattern("dd,MM,yyyy")) + "\n" +
                "Berufliche Adresse : " + adresseBeruflich + "\n" +
                "Privat Adresse : " + adressePrivate);
    }

    @Override
    public String toString() {
        return "Name: " + vorname + " " + nachname + "\n" +
                "Telefon: " + super.getTelefon() + "\n" +
                "E-Mail: " + super.getEmail() + "\n" +
                "Geburtstag: " + geburtstag.format(DateTimeFormatter.ofPattern("dd,MM,yyyy")) + "\n" +
                "Berufliche Adresse : " + adresseBeruflich + "\n" +
                "Privat Adresse : " + adressePrivate;
    }


    @Override
    public String getSuchkriterium() {
        return nachname;
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

    public LocalDate getGeburtstag() {
        return geburtstag;
    }

    public String getGeburtstagAsString() {
        return geburtstag.format(DateTimeFormatter.ofPattern("dd,MM,yyyy"));
    }

    public void setGeburtstag(int day, int mounth, int year) {
        this.geburtstag = LocalDate.of(year,mounth,day);
    }

    public Adresse getAdresseBeruflich() {
        return adresseBeruflich;
    }

    public void setAdresseBeruflich(Adresse adresseBeruflich) {
        this.adresseBeruflich = adresseBeruflich;
    }

    public Adresse getAdressePrivate() {
        return adressePrivate;
    }

    public void setAdressePrivate(Adresse adressePrivate) {
        this.adressePrivate = adressePrivate;
    }
}

