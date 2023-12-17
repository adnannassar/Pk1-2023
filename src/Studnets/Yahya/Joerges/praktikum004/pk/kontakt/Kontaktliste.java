package Studnets.Yahya.Joerges.praktikum004.pk.kontakt;

import java.util.Iterator;
import java.util.LinkedList;

public class Kontaktliste {
    private LinkedList<Kontakt> kontakts;


    public Kontaktliste() {
        kontakts = new LinkedList<>();


    }

    public void hinzufuegen(Kontakt kontakt) {
        if (kontakt != null) {
            kontakts.add(kontakt);
            System.out.println("Done!\n" + kontakt + "\nwas added!");
        }
    }

    public void druckeAlleKontakte() {

        for (Kontakt k : kontakts) {
            System.out.println(k);
        }
    }

    public int gibAnzahlKontakte() {
        return kontakts.size();
    }

    public Kontakt[] findeKontakteMitNamen(String name) {
        int counter = 0;
        Kontakt ausgabeKontakts[] = null;
        for(int i = 0 ; i < kontakts.size() ; i++){
            if(kontakts.get(i).getSuchkriterium().equals(name)){
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
            Iterator<Kontakt> it = kontakts.iterator();

            while(it.hasNext()){
                Kontakt k = it.next();
                if(k.getSuchkriterium().equals(name)){
                    ausgabeKontakts[index] = k;
                    index++;
                }
            }

            return ausgabeKontakts;
        }
    }
}

