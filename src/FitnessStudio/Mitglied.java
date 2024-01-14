package FitnessStudio;

public class Mitglied {
    private String nachname, vorname;
    private boolean anwesend;
    private int anzahlTraining;

    public Mitglied(String nachname, String vorname, boolean anwesend, int anzahlTraining) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.anwesend = anwesend;
        this.anzahlTraining = anzahlTraining;
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

    public boolean isAnwesend() {
        return anwesend;
    }

    public void setAnwesend(boolean anwesend) {
        this.anwesend = anwesend;
    }

    public int getAnzahlTraining() {
        return anzahlTraining;
    }

    public void setAnzahlTraining(int anzahlTraining) {
        this.anzahlTraining = anzahlTraining;
    }

    @Override
    public String toString() {
        String erg = nachname + ", " + vorname + " (";
        if (!anwesend) {
            erg += "nicht anwesend, bis her ";
        } else {
            erg += "anwesend, bis her ";
        }
        erg += anzahlTraining + " Trainings)";
        return erg;
    }
}
