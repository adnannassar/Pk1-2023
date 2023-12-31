package Praktikum.ColletionTypesicherSolution.Fachlogik;

import Praktikum.ColletionTypesicherSolution.Datenhaltung.Medium;
import Praktikum.ColletionTypesicherSolution.Datenhaltung.PersistenzException;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Medienverwaltung {
    private LinkedList<Medium> mediums;
    private Controller controller = new Controller(mediums);




    public Medienverwaltung() {
        try {
            laden();
        } catch (IOException e) {
            System.out.println(e.getMessage() + ", Eine neue (leere List wurde erzeugt!)");
            this.mediums = new LinkedList<>();
        }
    }

    public void aufnehmen(Medium m) {
        if (m != null) {
            mediums.add(m);
        }
    }

    public void zeigeMedien(OutputStream os) {
        if (mediums.isEmpty()) {
            System.out.println("Medium Liste ist leer!");
        }
        Iterator<Medium> it = mediums.iterator();
        Collections.sort(mediums);
        while (it.hasNext()) {
            it.next().druckeDaten(os);
        }
    }

    public String zeigeMedienAsAString() {
        String ausgabe = "";
        if (mediums.isEmpty()) {
            ausgabe = "Medium Liste ist leer!";
        }
        Iterator<Medium> it = mediums.iterator();
        Collections.sort(mediums);
        while (it.hasNext()) {
            ausgabe += it.next().druckeDatenAsString();
        }
        return ausgabe;
    }


    public void sucheNeuesMedium() {
        int minJahr = 0;
        Medium minMedium = null;
        for (Medium m : mediums) {
            if (m != null && m.getJahr() > minJahr) {
                minJahr = m.getJahr();
                minMedium = m;
            }
        }
        if (minMedium != null) {
            minMedium.druckeDaten(System.out);
        }
    }

    public String sucheNeuesMediumAsString() {
        String str = "";
        int minJahr = 0;
        Medium minMedium = null;
        for (Medium m : mediums) {
            if (m != null && m.getJahr() > minJahr) {
                minJahr = m.getJahr();
                minMedium = m;
            }
        }
        if (minMedium != null) {
            str = minMedium.druckeDatenAsString();
        }
        return str;
    }

    public double berechneErscheinungsjahr() {
        double summe = 0;
        int count = 0;
        Iterator<Medium> it = mediums.iterator();
        while (it.hasNext()) {
            summe += it.next().getJahr();
            count++;
        }
        return summe / count;
    }

    public void speichern()  {
        try {
            controller.speichern(mediums);
        } catch (PersistenzException e) {
            throw new RuntimeException(e);
        }
    }

    public void  laden() throws IOException {
        try {
        mediums = (LinkedList<Medium>) controller.laden();
        } catch (PersistenzException e) {
            throw new RuntimeException(e);
        }
    }
}
