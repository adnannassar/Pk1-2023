package Studnets.Yahya.Wiesmann.Praktikums.Praktikum003;

import java.time.LocalDate;

public class Medienverwaltung {
    private Medium[] mediums;


    public Medienverwaltung(Medium m) {
        mediums = new Medium[100];
        mediums[0] = m;
    }


    public void aufnehmen(Medium m) {
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] == null) {
                mediums[i] = m;
                break;
            } else {
                System.out.println("ein neues Medium aufnehmen ist leider ummöglich");
            }
        }
    }


    public void zeigeMedien() {
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null) {
                System.out.println(mediums);
            }
        }
    }

    public void sucheNeuesMedium() {
        int min = LocalDate.now().getYear();
        Medium neuesteMedium = null;
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] != null) {
                if (mediums[i].getJahr() <= min) {
                    min = mediums[i].getJahr();
                    neuesteMedium = mediums[i];
                }
            }
        }
        if (neuesteMedium != null) {
            System.out.println("Das neueste Medien ist vom Jahr " + min + ", und hat die folgende Daten:");
            System.out.println(neuesteMedium);
        }
        else {
            System.out.println("leider hat diese Medienverwaltung keine Medien!");
        }
    }

    public double berechneErscheinungsjahr(){
        double erg = 0;
        int count = 0;
        for (int i = 0; i < mediums.length; i++) {
            if (mediums[i] == null) {
                return 0.0;
            }
            if (mediums[i] != null) {
                erg += mediums[i].getJahr();
                count++;
            }
        }
        return erg/count;
    }

}
