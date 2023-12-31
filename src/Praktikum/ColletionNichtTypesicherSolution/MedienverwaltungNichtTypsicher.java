package Praktikum.ColletionNichtTypesicherSolution;

import java.util.LinkedList;

public class MedienverwaltungNichtTypsicher {
    private LinkedList mediums;

    public MedienverwaltungNichtTypsicher() {
        this.mediums = new LinkedList();
    }

    public void aufnehmen(Medium m) {
        if (m != null) {
            mediums.add(m);
        }
    }

    public void zeigeMedien() {
        for (int i = 0; i < mediums.size(); i++) {
            if (mediums.get(i) != null) {
                ((Medium) mediums.get(i)).druckeDaten();
            }
        }
    }

    public void sucheNeuesMedium() {
        int minJahr = 0;
        Medium minMedium = null;
        for (int i = 0; i < mediums.size(); i++) {
            if (mediums.get(i) != null && ((Medium) mediums.get(i)).getJahr() > minJahr) {
                minJahr = ((Medium) mediums.get(i)).getJahr();
                minMedium = ((Medium) mediums.get(i));
            }
        }
        if (minMedium != null) {
            minMedium.druckeDaten();
        }
    }

    public double berechneErscheinungsjahr() {
        double summe = 0;
        int count = 0;
        for (int i = 0; i < mediums.size(); i++) {
            if (mediums.get(i) != null) {
                summe += ((Medium) mediums.get(i)).getJahr();
                count++;
            }
        }
        return summe / count;
    }


}
