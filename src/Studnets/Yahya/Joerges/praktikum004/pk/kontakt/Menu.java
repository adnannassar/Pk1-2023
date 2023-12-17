package Studnets.Yahya.Joerges.praktikum004.pk.kontakt;


import javax.swing.*;
import java.util.Scanner;

public class Menu {

    private Kontaktliste kl;

    public Menu (Kontaktliste kl){
        this.kl = kl;
    }



    public void run(){
        int option;
        Scanner sc = new Scanner(System.in);
        do { System.out.println("Kontakt-App:\n\n" +
                "1. Person hinzufügen\n" +
                "2. Drucke alle Kontakte\n" +
                "3. Drucke Kontakte mit Name\n" +
                "4. Beenden\n\n"+
                "Bitte Aktion wählen:");
            option = sc.nextInt();
            switch (option){
                case 1:
                    addPerson();
                    break;
                case 2:
                    kl.druckeAlleKontakte();
                    break;
                case 3:
                    String name = JOptionPane.showInputDialog(null, "Name eingeben: ");
                    for (Kontakt k : kl.findeKontakteMitNamen(name)){
                        System.out.println(k);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Tschüss!");
                    break;
            }
        } while (option != 4);
    }

    public void addPerson (){
        String nachname = JOptionPane.showInputDialog(null, "Nachname eingeben: ");
        String vorname = JOptionPane.showInputDialog(null, "Vorname eingeben: ");
        int dayOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "Geb.Datum Tag eingeben"));
        int mounthOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "Geb.Datum Monat eingeben"));
        int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null, "Geb.Datum Jahr eingeben"));
        String telefon = JOptionPane.showInputDialog(null, "telefon eingeben: ");
        String mail = JOptionPane.showInputDialog(null, "mail eingeben: ");
        Person p = new Person(nachname,vorname,dayOfBirth,mounthOfBirth,yearOfBirth,telefon,mail);
        kl.hinzufuegen(p);

        JOptionPane.showMessageDialog(null,"Erfolgreich" , "Done!" ,JOptionPane.INFORMATION_MESSAGE);
    }

    public void setKontaktListe(Kontaktliste kl){
        this.kl = kl;
    }
}
