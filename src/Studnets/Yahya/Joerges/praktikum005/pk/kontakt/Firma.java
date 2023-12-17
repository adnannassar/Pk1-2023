package Studnets.Yahya.Joerges.praktikum005.pk.kontakt;


import java.util.Objects;

public class Firma extends Kontakt {

    private String name;
    private Adresse adresse;

    public Firma (String name, String telefon, String email, Adresse adresse){
        super(telefon,email);
        this.name = name;
        this.adresse = adresse;
    }

    @Override
    public void drucke() {
        System.out.println("Name: " + name +"\n" +
                "Telefon: " + super.getTelefon() + "\n" +
                "E-Mail: " + super.getEmail() + "\n" +
                "Adresses: " + adresse);
    }

    @Override
    public String toString() {
        return "Name: " + name +"\n" +
                "Telefon: " + super.getTelefon() + "\n" +
                "E-Mail: " + super.getEmail() + "\n" +
                "Adresses: " + adresse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Firma f = (Firma) o;
        return this.name.equals(f.getName()) && this.adresse.equals(f.getAdresse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, adresse);
    }

    @Override
    public String getSuchkriterium() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
