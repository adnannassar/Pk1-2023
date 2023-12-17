package Studnets.Yahya.Joerges.praktikum003.pk.kontakt;


public class Firma extends Kontakt {

    private String name;
    private Adresse adresse;

    public Firma (String name,String telefon, String email,Adresse adresse){
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
