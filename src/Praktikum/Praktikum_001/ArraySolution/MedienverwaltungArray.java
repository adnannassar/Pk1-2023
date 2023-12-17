package Praktikum.Praktikum_001.ArraySolution;

public class MedienverwaltungArray {
    private Medium[] mediums;

    public MedienverwaltungArray(int size) {
        this.mediums = new Medium[size];
    }

    public void aufnehmen(Medium m) {
        if (m != null) {
            for (int i = 0; i < mediums.length; i++) {
                if (mediums[i] == null) {
                    mediums[i] = m;
                    break;
                }
            }
        }
    }

    public void zeigeMedien() {
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null) {
                mediums[i].druckeDaten();
            }
        }
    }

    public void sucheNeuesMedium() {
        int minJahr = 0;
        Medium minMedium = null;
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null && mediums[i].getJahr() > minJahr) {
                minJahr = mediums[i].getJahr();
                minMedium = mediums[i];
            }
        }
        if (minMedium != null) {
            System.out.print("Das neuste Medium ist: ");
            minMedium.druckeDaten();
        }
    }

    public double berechneErscheinungsjahr() {
        double summe = 0;
        int count = 0;
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null) {
                summe += mediums[i].getJahr();
                count++;
            }
        }
        return summe / count;
    }


}
