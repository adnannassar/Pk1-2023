package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UtilClass {
    public static void writeToFile(Angestellter a, File f) throws DateiException {
        try (PrintWriter p = new PrintWriter(f)) {
            p.println("Name: " + a.getName());
            p.printf("Gehalt: %.2f", a.berechneJahresGehalt());
            p.flush();
        } catch (FileNotFoundException e) {
            throw new DateiException();
        }
    }
}
