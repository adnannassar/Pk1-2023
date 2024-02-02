package Klausur_Wiesmann.klausur_extras.PrimeWorker;

import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer Collection von Zahlen zum Testen
        Collection<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 17, 19, 23, 29, 31);

        // Aufruf der filterPrimes Methode und Speichern des Ergebnisses
        Collection<Integer> primes = PrimeFilter.filterPrimes(numbers);

        // Ausgabe der gefundenen Primzahlen
        System.out.println("Gefundene Primzahlen:");
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}