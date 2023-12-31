package Praktikum.ColletionTypesicherSolution;

import java.io.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Medienverwaltung {
    private LinkedList<Medium> mediums;

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

    public void speichern() {
        try (ObjectOutputStream ost = new ObjectOutputStream(new FileOutputStream("Exmaple_For_IO/MedienVerwaltungIO/MedienList.ser"))) {
            ost.writeObject(mediums);
            System.out.println("Medien List wurde erfolgreich gespeichert!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void laden() throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Exmaple_For_IO/MedienVerwaltungIO/MedienList.ser"))) {
            mediums = (LinkedList<Medium>) ois.readObject();
            System.out.println("Medien List wurde erfolgreich geladen!");
        } catch (IOException | ClassNotFoundException e) {
            throw new IOException("Es gibt keine gespeicherte Liste!");
        }
    }
}
