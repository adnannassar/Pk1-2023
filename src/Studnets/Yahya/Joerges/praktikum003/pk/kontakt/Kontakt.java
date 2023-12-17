package Studnets.Yahya.Joerges.praktikum003.pk.kontakt;

public abstract class Kontakt {
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

}
