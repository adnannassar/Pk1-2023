package Studnets.Yahya.Joerges.praktikum005.pk.kontakt;

import java.util.*;

public class Kontaktliste {
    private HashSet<Kontakt> kontakts;


    public Kontaktliste() {
        kontakts = new HashSet<>();


    }

    void hinzufuegen(Kontakt kontakt) {
        if (kontakt != null) {
            kontakts.add(kontakt);
            System.out.println("Done!\n" + kontakt + "\nwas added!\n");
        }
    }

    void druckeAlleKontakte() {
        LinkedList<Kontakt> kl = new LinkedList<>(kontakts);
        //comparable
        Collections.sort(kl);
        /*
        kl.sort(new Comparator<Kontakt>() {
            @Override
            public int compare(Kontakt o1, Kontakt o2) {
                return o1.getSuchkriterium().compareTo(o2.getSuchkriterium());
            }
        });
         */
            for (Kontakt k : kl) {
                if (k != null) {
                    System.out.println(k);
                    System.out.println();
                }
            }
        }

    public int gibAnzahlKontakte() {
        return kontakts.size();
    }

    Kontakt[] findeKontakteMitNamen(String name) {
        int counter = 0;
        Kontakt ausgabeKontakts[] = null;
        Iterator<Kontakt> ite = kontakts.iterator();
        while(ite.hasNext()){
            Kontakt k = ite.next();
            if(k.getSuchkriterium().equals(name)){
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
