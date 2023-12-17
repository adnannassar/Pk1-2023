package Studnets.Yahya.Wiesmann.Praktikums.Praktikum002.array;

import java.time.LocalDate;

public class Medienverwaltung {
    private Medium[] mediums;


    public Medienverwaltung(int size) {
        mediums = new Medium[size];
    }


    public void aufnehmen(Medium m) {
        if (m != null) {
            for (int i = 0; i < mediums.length; i++) {
                if (mediums[i] == null) {
                    mediums[i] = m;
                    System.out.println("Done!\n" + m + "\nwas added!");
                    break;
                }
            }
            if (mediums[mediums.length - 1] != null) {
                System.out.println("ein neues Medium aufnehmen ist leider ummöglich");
            }
        }
    }


    public void zeigeMedien() {
        if (mediums[0] == null) {
            System.out.println("Keine Medien sind in dieser Medienverwaltung!!");
        } else {
            System.out.println("Diese Medienverwaltung hat die folgende Medien: ");
            for (int i = 0; i < mediums.length; i++) {
                if (mediums[i] != null) {
                    System.out.println(mediums[i]);
                }
            }
        }
    }

    public void sucheNeuesMedium() {
        int min = 0;
        Medium neuesteMedium = null;
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null && mediums[i].getJahr() >= min) {
                min = mediums[i].getJahr();
                neuesteMedium = mediums[i];
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
        if (mediums[0] == null) {
            return 0.0;
        }
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null) {
                erg += mediums[i].getJahr();
                count++;
            }
        }
        return erg / count;
    }

}
