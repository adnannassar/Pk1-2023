package Studnets.Yahya.Joerges.praktikum002.pk.kontakt;

public class Kontaktliste {
    private Kontakt [] kontakts;


    public Kontaktliste(int size) {
        kontakts = new Kontakt[size];
    }

    public void hinzufuegen(Kontakt k) {
        /*for (int i = 0; i < kontakts.length; i++) {
            if (kontakts[i] == null) {
                kontakts[i] = k;
                System.out.println("Done!\n" + k + "\nwas added!\n");
                break;
            }
        }*/
        if (k != null) {
            for (int i = 0; i < kontakts.length; i++) {
                if (kontakts[i] == null) {
                    kontakts[i] = k;
                    System.out.println("Done!\n" + k + "\nwas added!\n");
                    break;
                }
            }
            if (kontakts[kontakts.length - 1] != null) {
                Kontakt [] ersatzFeld = new Kontakt [(kontakts.length + 1)];
                for (int i = 0 ; i < kontakts.length ; i++){
                    kontakts[i] = ersatzFeld[i];
                }
                ersatzFeld[ersatzFeld.length -1] = k;
                this.kontakts = ersatzFeld;
            }
        }
    }

    public void druckeAlleKontakte() {
        if (kontakts[0] == null) {
            System.out.println("Keine Kontakts sind in dieser Kontaktliste!!");
        } else {
            System.out.println("Diese Kontaktliste hat die folgende Kontakts: ");
            for (int i = 0; i < kontakts.length; i++) {
                if (kontakts[i] != null) {
                    System.out.println(kontakts[i]);
                }
            }
        }
    }

    public int gibAnzahlKontakte() {
        if (kontakts != null) {
            int erg = 0;
            for (int i = 0; i < kontakts.length; i++){
                if(kontakts[i] != null){
                erg++;}
            }
            return erg;
        }
        else {
            return 0;
        }
    }

    public Kontakt[] findeKontakteMitNamen(String name) {
        int counter = 0;
        Kontakt [] ausgabeKontakts = null;
        for(int i = 0 ; i < kontakts.length ; i++) {
                if (kontakts[i] != null && kontakts[i].getNachname().equals(name)) {
                    counter++;
            }
        }


        if(counter == 0){
            System.out.println("Keine gefunden!");
            return new Kontakt[0];
        } else {
            ausgabeKontakts = new Kontakt[counter];
            int index = 0;
            for(int i = 0 ; i < kontakts.length ; i++){
                if(kontakts[i] != null && kontakts[i].getNachname().equals(name)){
                    ausgabeKontakts[index] = kontakts[i];
                    index++;
                }
            }
            return ausgabeKontakts;
        }
    }
}
