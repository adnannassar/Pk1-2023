package Praktikum.Praktikum_001.Jörges;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class KontaktListe {

    public HashSet<Kontakt> dieKontaktListe;


    public KontaktListe() {
        this.dieKontaktListe = new HashSet<>();
    }

    public void hinzufuegen(Kontakt neu) {
        if (neu != null) {
            dieKontaktListe.add(neu);
        }
    }


    void druckeAlleKontakte() {
        System.out.println("Die Kontakte in der Liste sind:\n");
        LinkedList<Kontakt> kl = new LinkedList<>(dieKontaktListe);

        Collections.sort(kl);

        for (Kontakt k : kl) {
            if (k != null) {
                System.out.println(k);
                System.out.println();
            }
        }


    }

    public int gibtAnzahlKontakte() {
        return dieKontaktListe.size();
    }


    public Kontakt[] findeKontakteMitNamen(String name) {

        LinkedList<Kontakt> gesucht = new LinkedList<>();
        Iterator<Kontakt> it = dieKontaktListe.iterator();

        while (it.hasNext()) {
            Kontakt nexterKontakt = it.next();
            if (nexterKontakt.getSuchkriterium().equals(name)) {
                gesucht.add(nexterKontakt);
            }
        }

        Kontakt[] gefundeneKontakteArray = new Kontakt[gesucht.size()];
        int i = 0;
        for (Kontakt k : gesucht) {
            gefundeneKontakteArray[i++] = k;
        }

        return gefundeneKontakteArray;

        //1.Version mit Iterator
	    	 
	    	  
	    	  
	    	  
	        /*    LinkedList<Kontakt>gesucht= new LinkedList<>();
	            for(Kontakt k : dieKontaktListe) {
	            	if(k.getSuchkriterium().equals(name)) {
	            		gesucht.add(k);
	            	}
	            }
	        
	        Kontakt []gefundeneKontakteArray = new Kontakt[gesucht.size()];
	        int i=0;
	        for(Kontakt k : gesucht) {
	        	gefundeneKontakteArray[i++]=k;
	        }
	        
	        return gefundeneKontakteArray;*/

        // 2.Version ohne Iterator

    }

    void exportiereEintraegeAlsVcard(File datei) throws FileNotFoundException {
        String text = "";
        for (Kontakt k : dieKontaktListe) {
            text += k.exportiereAlsVcard();
        }
        try (PrintWriter pw = new PrintWriter(datei)) {
            pw.println(text);
            pw.flush();
        } catch (FileNotFoundException e) {
          throw new FileNotFoundException(e.getMessage());
        }
    }

}
