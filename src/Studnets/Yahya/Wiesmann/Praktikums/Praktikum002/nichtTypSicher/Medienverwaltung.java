package Studnets.Yahya.Wiesmann.Praktikums.Praktikum002.nichtTypSicher;

import java.util.LinkedList;

public class Medienverwaltung {
    private LinkedList mediums;


    public Medienverwaltung() {
        mediums = new LinkedList();
    }


    public void aufnehmen(Medium m) {
        if (m != null) {
            mediums.add(m);
            System.out.println("Done!\n" + m + "\nwas added!");
        }
    }


    public void zeigeMedien() {
        if (mediums.size() == 0) {
            System.out.println("Keine Medien sind in dieser Medienverwaltung!!");
        } else {
            System.out.println("Diese Medienverwaltung hat die folgende Medien: ");
            for (int i = 0; i < mediums.size(); i++) {
                if (mediums.get(i) != null) {
                    System.out.println(mediums.get(i));
                }
            }
        }
    }

    public void sucheNeuesMedium() {
        int min = 0;
        Medium neuesteMedium = null;
        for (int i = 0; i < mediums.size(); i++) {
            if (mediums.get(i) != null && ((Medium)mediums.get(i)).getJahr() >= min) {
                min = ((Medium)mediums.get(i)).getJahr();
                neuesteMedium = (Medium)mediums.get(i);
            }

        }
        if (neuesteMedium != null) {
            System.out.println("Das neueste Medien ist vom Jahr " + min + ", und hat die folgende Daten:");
            System.out.println(neuesteMedium);
        } else {
            System.out.println("leider hat diese Medienverwaltung keine Medien!");
        }
    }

    public double berechneErscheinungsjahr() {
        double erg = 0;
        int count = 0;
        if (mediums.size() == 0) {
            return 0.0;
        }
        for (int i = 0; i < mediums.size(); i++) {
            if (mediums.get(i) != null) {
                erg += ((Medium)mediums.get(i)).getJahr();
                count++;
            }
        }
        return erg / count;
    }

}
