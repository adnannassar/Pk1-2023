package Studnets.Ola.Jörges;

public class Adresse {
    private String strasse;
    private int hausnummer;
    private int plz;
    private String ort;
    private String land;

    public Adresse(String strasse,int hausnummer,int plz,String ort,String land) {
        this.strasse=strasse;
        this.hausnummer=hausnummer;
        this.plz=plz;
        this.ort=ort;
        this.land=land;
    }
    public String toString() {
        return "Adresse" +this.strasse+ " "+this.hausnummer+ ", " +this.plz + " " + this.ort + ", " + this.land;


    }
}
