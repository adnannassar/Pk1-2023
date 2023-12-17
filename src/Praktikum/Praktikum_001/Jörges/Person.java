package Praktikum.Praktikum_001.Jörges;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Person extends Kontakt implements VcardExportable {

    private String nachname;
    private String vorname;
    private LocalDate geburtstag;
    private Adresse adressePrivat;
    private Adresse adresseBeruf;

    public Person(String vorname, String nachname, String telefon, String email, LocalDate geburtstag,
                  Adresse adressePrivat, Adresse adresseBeruf) {
        super(telefon, email);
        this.nachname = nachname;
        this.vorname = vorname;
        this.geburtstag = geburtstag;
        this.adressePrivat = adressePrivat;
        this.adresseBeruf = adresseBeruf;

    }


    @Override
    public void drucke() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateasString = geburtstag.format(formatter);

        System.out.println("Name: " + this.vorname + " " + this.nachname + "\n" +
                "Telefon: " + getTelefon() + "\nE-Mail: " + getEmail() +
                "\nGeburtstag: " + dateasString + "\nAdresse (privat) : " + this.adressePrivat.toString() +
                "\nAdresse (beruflich) : " + this.adresseBeruf.toString());
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateasString = geburtstag.format(formatter);

        return "Name: " + this.vorname + " " + this.nachname +
                "\nTelefon: " + getTelefon() + "\nE-Mail: " + getEmail() +
                "\nGeburtstag: " + dateasString + "\nAdresse (privat) : " + this.adressePrivat.toString() +
                "\nAdresse (beruflich) : " + this.adresseBeruf.toString();
    }


    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), nachname, vorname, geburtstag, adressePrivat, adresseBeruf);

    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person p = (Person) obj;
        if (this.nachname.equals(p.getNachname()) && this.vorname.equals(p.getVorname()) &&
                this.geburtstag.equals(p.getGeburtstag()) && this.adresseBeruf.equals(p.getAdresseBeruf()) &&
                this.adressePrivat.equals(p.getAdressePrivat()))
            return true;
        else return false;
    }


    public String getNachname() {
        return nachname;
    }


    public String getVorname() {
        return vorname;
    }


    public LocalDate getGeburtstag() {
        return geburtstag;
    }


    public Adresse getAdressePrivat() {
        return adressePrivat;
    }


    public Adresse getAdresseBeruf() {
        return adresseBeruf;
    }


    @Override
    public String getSuchkriterium() {

        return this.nachname;
    }

    @Override
    public String exportiereAlsVcard() {
        String erg = "BEGIN:VCARD\n" +
                "VERSION:4.0\n" +
                "N:" + nachname + ";" + vorname + "\n" +
                "FN:" + nachname + "\n" +
                "EMAIL;type=INTERNET;type=pref:" + getEmail() + "\n" +
                "TEL;type=VOICE:" + getTelefon() + "\n";
        if (adressePrivat != null) {
            erg += "ADR;type=WORK:;;" + adressePrivat.getStrasse() + ";" +
                    adressePrivat.getOrt() + ";;" + adressePrivat.getPlz() + ";" + adressePrivat.getLand() + "\n";
        }
        if (adresseBeruf != null) {
            erg += "ADR;type=WORK:;;" + adresseBeruf.getStrasse() + ";" +
                    adresseBeruf.getOrt() + ";;" + adresseBeruf.getPlz() + ";" + adresseBeruf.getLand() + "\n";
        }

        erg += "BDAY:" + getGeburtstag().getMonth() + "\n" +
                "END:VCARD\n";
        return erg;
    }
}
