package Praktikum.Praktikum_001.ColletionTypesicherSolution;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Menu {

    private Medienverwaltung mv;

    private Scanner scanner = new Scanner(System.in);

    public Menu(Medienverwaltung mv) {
        this.mv = mv;
    }

    public void showMenu() {

        int option;
        do {
            System.out.println("\nMedienverwaltung\n\n" +
                    "  1. Audio aufnehmen\n" +
                    "  2. Bild aufnehmen\n" +
                    "  3. Zeige alle Medien auf der Konsole\n" +
                    "  4. Zeige alle Medien in einer Text Datei\n" +
                    "  5. Speichern Medien Liste \n" +
                    "  6. Laden Medien Liste \n" +
                    "  7. Zeige neues Medium\n" +
                    "  8. Berechne durchschnittliches Erscheinungsjahr\n" +
                    "  9. Beenden\n");

            System.out.print("Bitte Menuepunkt waehlen: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addAudio();
                    break;
                case 2:
                    addBild();
                    break;
                case 3:
                    mv.zeigeMedien(System.out);
                    break;
                case 4:
                    String filename = JOptionPane.showInputDialog(null, "Filename");
                    if (filename != null) {
                        if (filename.length() == 0) {
                            boolean fileNameOkay;
                            do {
                                int confirmOption = JOptionPane.showConfirmDialog(null,
                                        "Filename ist leer!\nMöchten Sie nochmal eingeben?",
                                        "Filename Leer!", JOptionPane.YES_NO_OPTION);
                                System.out.println(confirmOption);
                                // yes = 0 , no = 1, cancel or exit = -1
                                if (confirmOption == -1 || confirmOption == 1) {
                                    fileNameOkay = true;
                                } else {
                                    filename = JOptionPane.showInputDialog(null, "Filename");
                                    break;
                                }
                            } while (!fileNameOkay);
                        } else {
                            try {
                                mv.zeigeMedien(new FileOutputStream("Exmaple_For_IO/MedienVerwaltungIO/" + filename + ".txt"));
                            } catch (FileNotFoundException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                    break;
                case 5:
                    mv.speichern();
                    break;
                case 6:
                    try {
                        mv.laden();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    mv.sucheNeuesMedium();
                    break;
                case 8:
                    System.out.println(mv.berechneErscheinungsjahr());
                    break;
                case 9:
                    System.out.println("Beenden");
                    break;
                default:
                    System.out.println("Bitte etwas gültiges auswählen");
            }
        } while (option != 9);

    }

    void addAudio() {
        String title = JOptionPane.showInputDialog(null, "Title eingeben");

        int jahr = 0;
        boolean jahrIsValid = false;
        do {
            try {
                jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr eingeben"));
                jahrIsValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte ein gültiges Erscheinungsjahr eingeben!");
            }
        } while (!jahrIsValid);


        String interpret = JOptionPane.showInputDialog(null, "Interpret eingeben");

        int dauer = 0;
        boolean dauerIsValid = false;
        do {
            try {
                dauer = Integer.parseInt(JOptionPane.showInputDialog(null, "Dauer eingeben"));
                dauerIsValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte ein gültiges Erscheinungsjahr eingeben!");
            }
        } while (!dauerIsValid);


        Audio a = new Audio(title, jahr, interpret, dauer);
        mv.aufnehmen(a);

        JOptionPane.showMessageDialog(null, "Audio wurde erfolgreich hinzugefügt!", "Erfolgreich!", JOptionPane.INFORMATION_MESSAGE);

    }

    void addBild() {
        String title = JOptionPane.showInputDialog(null, "Title eingeben");

        int jahr = 0;
        boolean jahrIsValid = false;
        do {
            try {
                jahr = Integer.parseInt(JOptionPane.showInputDialog(null, "Jahr eingeben"));
                jahrIsValid = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Bitte ein gültiges Erscheinungsjahr eingeben!");
            }
        } while (!jahrIsValid);


        String ort = JOptionPane.showInputDialog(null, "Ort eingeben");

        Bild a = new Bild(title, jahr, ort);
        mv.aufnehmen(a);

        JOptionPane.showMessageDialog(null, "Bild wurde erfolgreich hinzugefügt!", "Erfolgreich!", JOptionPane.INFORMATION_MESSAGE);
    }
}
