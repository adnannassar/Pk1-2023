package Klausur_10_08_2022.Aufgabe_001;

import java.util.HashMap;
import java.util.Map;

/**
 * Programm 3
 * <p>
 * TODO Die Ausfuehrung des Programmes fuehrt zu einer Exception. Erwartete
 * Ausgabe: "100"
 */
public class Rezept {
    private String titel;
    private Map<Zutat, Integer> zutaten;

    public Rezept(String titel, Map<Zutat, Integer> zutaten) {
        this.titel = titel;
        this.zutaten = zutaten;
    }

    /**
     * DIESE METHODE NICHT AENDERN!
     * <p>
     * Gibt die Menge zur gegebenen Zutat zurueck oder "null", falls die gegebene
     * Zutat nicht im Rezept enthalten ist.
     */
    public int gibMengeFuerZutat(String name) {
        for (Zutat zutat : zutaten.keySet()) {
            if (zutat.getName().equals(name)) {
                return zutaten.get(zutat);
            }
        }
        return 0;
    }

    private static class Zutat {
        private String name;

        public Zutat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        var zutaten = new HashMap<Zutat, Integer>();
        zutaten.put(new Zutat("Reis"), 100);
        zutaten.put(new Zutat("Buttergemuese"), 150);


        var rezept = new Rezept("Gemuesereis", zutaten);
        // Die folgende Anweisung fuehrt zu einer Exception.
        // Erwartete Ausgabe: "100"
        System.out.println(rezept.gibMengeFuerZutat("Reis"));
    }
}
