package Vorlesungsaufgaben;

import java.io.*;

public class Aufgabe_31 {
    public static void main(String[] args) {
        schreiben(
                new Angestellter("Obermeier", 10000),
                new File("Exmaple_For_IO/Aufgabe_31.txt"));

        Angestellter a = readFromFile(null);
    }

    private static Angestellter readFromFile(Object o) {
        return new Angestellter("name", 12039123);
    }

    private static void schreiben(Angestellter a, File f) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(f))) {
            printWriter.println("Name: " + a.getName() + "\nGehalt: " + a.getGehalt());
            System.out.println("Erfolgreich!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static class Angestellter {
        private String name;
        private double gehalt;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGehalt() {
            return gehalt;
        }

        public void setGehalt(double gehalt) {
            this.gehalt = gehalt;
        }

        public Angestellter(String name, double gehalt) {
            this.name = name;
            this.gehalt = gehalt;
        }

    }
}
