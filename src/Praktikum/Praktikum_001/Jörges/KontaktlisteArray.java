package Praktikum.Praktikum_001.Jörges;
import java.util.Arrays;
public class KontaktlisteArray {
	
	public Kontakt[] dieKontaktliste  = new Kontakt[2];
	public int anzKontakte =0;
	
	
	
	
	
	public KontaktlisteArray () {
		
	}
	
//	
	
	
	public void hinzufuegen (Kontakt kontakt) {
		if (anzKontakte<2)
		{
			dieKontaktliste[anzKontakte]=kontakt;
			anzKontakte++;
			
		}
		
//		if (anzKontakte>=dieKontaktliste.length) {
		else {	
			Kontakt[] ersatz = Arrays.copyOf(dieKontaktliste, dieKontaktliste.length+1); 
			
			ersatz[ersatz.length-1]=kontakt;
			anzKontakte++;

			dieKontaktliste = new Kontakt[ersatz.length];
			dieKontaktliste =ersatz;
			
		}
	}
	
	public void druckeAlleKontakte() {
		for (int i=0; i<anzKontakte; i++) {
			System.out.println();
			System.out.println(dieKontaktliste[i]);
		}	
	}
	
	
	
	public int gibAnzahlKontakte() {
		return anzKontakte=this.anzKontakte;
	}
	
	
	public Kontakt[]  findeKontakteMitName(String name) {
	
//		Länge vom Array von der gefundenen Kontakte durch variable counetr festlegen
		
    int counter = 0;                                            

    for (int i = 0; i < dieKontaktliste.length; i++) {
        if (dieKontaktliste[i].getSuchkriterium().equals(name)) {
        	counter++;	
        	}
    	}
    
//    wenn keine Kontakte gefunden 
//  wenn keine Kontakte gefunden 
    
    if (counter == 0) {
    	System.out.println("Keine gesuchte Nachname gefunden");
        return new Kontakt[counter];
    } 
    
//    ausfüllen vom neuen Array wenn Kontakte gefunden
    	
    else {
    	
    	Kontakt[] gesucht = new Kontakt[counter];
    	
    	int a=0;
        for (int j = 0; j < dieKontaktliste.length; j++) {
            if (dieKontaktliste[j].getSuchkriterium().equals(name)) {
            	gesucht[a] = dieKontaktliste[j];
            	a++;
            }
        }

        return gesucht;
    }
   
		
		
	}
	
}