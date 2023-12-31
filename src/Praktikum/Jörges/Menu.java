package Praktikum.Jörges;

import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Menu {

    KontaktListe kl;
    Scanner sc = new Scanner(System.in);

    public Menu(KontaktListe kl) {
        this.kl = kl;

    }

    public void ZeigeMenu() {

        int auswahl;
        do {
            System.out.println("Kontakt-App\r\n"
                    + "\r\n"
                    + " 1. Person hinzufügen\r\n"
                    + " 2. Drucke alle Kontakte\r\n"
                    + " 3. Drucke Kontakte mit Name\r\n"
                    + " 4. vCard-Exportr\n"
                    + " 4. Beenden");
            System.out.println("Kannst du bitte was auswählen (:");
            auswahl = sc.nextInt();
            switch (auswahl) {

                case 1:
                    addPerson();
                    break;
                case 2:
//                	JOptionPane.showMessageDialog(null, kl.durckeAlleKontakte(), "Kontaktliste" , JOptionPane.INFORMATION_MESSAGE );
                    kl.druckeAlleKontakte();
                    break;

                case 3:
                    String name = JOptionPane.showInputDialog(null, "Name eingeben bitte! ", "Eingabe");
                    JOptionPane.showInternalMessageDialog(null, kl.findeKontakteMitNamen(name));
                    break;

                case 4:
                    try {
                        kl.exportiereEintraegeAlsVcard(new File("Exmaple_For_IO/Jörges/KL.vcf"));
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("adiós");
                    break;

                default:
                    System.out.println(" bitte eine gültige Eingabe auswählen");

            }

//
        }
        while (auswahl < 5);
    }

    public void addPerson() {
        String nachname = JOptionPane.showInputDialog(null, "Nachname eingeben: ");
        String vorname = JOptionPane.showInputDialog(null, "Vorname eingeben: ");
        String telefon = JOptionPane.showInputDialog(null, "Telefon eingeben: ");
        String email = JOptionPane.showInputDialog(null, "Email eingeben: ");
        String dateasString = JOptionPane.showInputDialog(null, "Geburtstag eingeben: ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate geburtstag = LocalDate.parse(dateasString, formatter);

        String strasseBeruflich = JOptionPane.showInputDialog(null, "Staße(beruflich) eingeben: ");
        int hausnummerBeruflich = Integer.parseInt(JOptionPane.showInputDialog(null, "Hausnummer(beruflich) eingeben:  "));
        int plzBeruflich = Integer.parseInt(JOptionPane.showInputDialog(null, "plz(beruflich) eingeben:  "));
        String ortBeruflich = JOptionPane.showInputDialog(null, "Ort(beruflich) eingeben: ");
        String landBeruflich = JOptionPane.showInputDialog(null, "Land(beruflich) eingeben: ");

        Adresse adresseBeruf = new Adresse(strasseBeruflich, hausnummerBeruflich, plzBeruflich, ortBeruflich, landBeruflich);

        String strassePrivte = JOptionPane.showInputDialog(null, "Staße(privat) eingeben: ");
        int hausnummerPrivat = Integer.parseInt(JOptionPane.showInputDialog(null, "Hausnummer(privat) eingeben:  "));
        int plzPrivat = Integer.parseInt(JOptionPane.showInputDialog(null, "plz(privat) eingeben:  "));
        String ortPrivt = JOptionPane.showInputDialog(null, "Ort(privat) eingeben: ");
        String landPrivte = JOptionPane.showInputDialog(null, "Land(privat) eingeben: ");

        Adresse adressePrivat = new Adresse(strassePrivte, hausnummerPrivat, plzPrivat, ortPrivt, landPrivte);

        Person p = new Person(vorname, nachname, telefon, email, geburtstag, adressePrivat, adresseBeruf);


        kl.hinzufuegen(p);

        JOptionPane.showMessageDialog(null, "Erfolgreich", "Geschafft!", JOptionPane.INFORMATION_MESSAGE);
    }

}