package Studnets.Yahya.Joerges.praktikum004.pk.kontakt;


public class KontaktlisteArray {
    private Kontakt kontakts[];


    public KontaktlisteArray(int size) {
        kontakts = new Kontakt[size];
    }

    public void hinzufuegen(Kontakt kontakt) {
        if (kontakt != null) {
            for (int i = 0; i < kontakts.length; i++) {
                if (kontakts[i] == null) {
                    kontakts[i] = kontakt;
                    System.out.println("Done!\n" + kontakt + "\nwas added!\n");
                    break;
                }
            }
            if (kontakts[kontakts.length - 1] != null) {
                System.out.println("ein neues Kontakt hizufügen ist leider ummöglich");
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
                    System.out.println();
                }
            }
        }
    }

    public int gibAnzahlKontakte() {
        if (kontakts[0] != null) {
            int erg = 0;
            for (int i = 0; i < kontakts.length;i++){
                if(kontakts[i] != null ) erg++;
            }
            return erg;
        }
        else {
            return 0;
        }
    }

    public Kontakt[] findeKontakteMitNamen(String name) {
        int counter = 0;
        Kontakt ausgabeKontakts[] = null;

        for(int i = 0 ; i < kontakts.length ; i++){
            if(kontakts[i] != null && kontakts[i].getSuchkriterium().equals(name)){
                counter++;
            }
        }

        if(counter == 0){
            System.out.println("Keine gefunden!");
            return new Kontakt[0];
        }

        else {
            ausgabeKontakts = new Kontakt[counter];
            int index = 0;
            for(int i = 0 ; i < kontakts.length ; i++){
                if(kontakts[i] != null && kontakts[i].getSuchkriterium().equals(name)){
                    ausgabeKontakts[index] = kontakts[i];
                    index++;
                }
            }
            return ausgabeKontakts;
        }
    }
}
