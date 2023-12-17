package Studnets.Yahya.Joerges.praktikum002.pk.kontakt;

public class Main {

    public static void main(String[] args) {
        Kontakt Yahya = new Kontakt("Bek" , "Yahya", "01774637297","Yahyabeik96@gmail.com",17,8,1996,new Adresse("Butzstr ", 44,44359,"Dortmund" , "DE"));
        Kontakt AboZakor = new Kontakt("Bek" , "AboAlZak", "01774637297","Yahyabeik96@live.com",11,7,1996,new Adresse("Mallinckrodtstr ", 136,44149,"Dortmund" , "DE"));
        Kontakt Bek = new Kontakt("So" , "AboAlZak", "01774637297","Yahyabeik96@live.com",11,7,1996,new Adresse("Mallinckrodtstr ", 136,44149,"Dortmund" , "DE"));


        Kontaktliste kl = new Kontaktliste(100);
        System.out.println(kl.gibAnzahlKontakte());
        kl.hinzufuegen(Yahya);
        kl.hinzufuegen(AboZakor);
        kl.hinzufuegen(Bek);
        System.out.println(kl.gibAnzahlKontakte());





        Kontakt k [] = kl.findeKontakteMitNamen("Bek");
        for (Kontakt ko : k){
            System.out.println(ko);
        }


    }
}
