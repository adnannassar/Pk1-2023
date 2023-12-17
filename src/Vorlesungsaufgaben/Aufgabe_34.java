package Vorlesungsaufgaben;

import java.io.*;

public class Aufgabe_34 {
    public static void main(String[] args) {
        File file = new File("Exmaple_For_IO/Serialisierung/Kunde1.ser");

        // First we need to save the object!
        // Kunde k1 = new Kunde("Kunde", new Konto(100));
        // saveObject(k1, file);

        // loading (reading) the object
        Kunde k1 = loadObject(file);
        if (k1 != null) {
            k1.druckeDaten();
        }
    }

    private static void saveObject(Kunde k, File f) {
        try (ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream(f))) {
            obs.writeObject(k);
            obs.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Kunde loadObject(File f) {
        Kunde k;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            k = (Kunde) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return k;
    }


    static class Konto implements Serializable {
        private static final long serialVersionUID = 2L;
        private double guthaben;

        public Konto(double guthaben) {
            this.guthaben = guthaben;
        }

        public double getGuthaben() {
            return guthaben;
        }
    }

    static class Kunde implements Serializable {
        private static final long serialVersionUID = 1L;
        private Konto konto;
        private String nachname;

        public Kunde(String nachname, Konto konto) {
            this.konto = konto;
            this.nachname = nachname;
        }

        public void druckeDaten() {
            System.out.println(nachname + " " + konto.getGuthaben() +
                    "€");
        }
    }
}
