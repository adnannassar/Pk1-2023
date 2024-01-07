package Klausur_10_08_2022.Aufgabe_003;

public class SushiService {
    private String[] karte = new String[]{"Maki Sake", "Nigiri Ebi", "Inside-Out California Roll"};

    /**
     * TODO in dieser Methode:
     * <p>
     * 1. Behandeln von ArrayIndexOutBoundsExceptions mit Hilfe einer
     * BestellungException
     * <p>
     * 2. BestellungException soll Nachricht und ArrayIndexOutBoundsException als
     * Ausloeser (cause) enthalten
     */
    public void bestelle(int nummer) throws BestellungException {
        if (nummer < 0) {
            throw new BestellungException("Index ist negativ!", new ArrayIndexOutOfBoundsException());
        }

		if (nummer >= karte.length) {
			throw new BestellungException("Index ist großer als Array Grenzen!", new ArrayIndexOutOfBoundsException());
		}

        String sushiGericht = karte[nummer];

        // "Simulation" einer Bestellung durch eine Bildschirmausgabe
        System.out.println("Ich bestelle: " + sushiGericht);
    }

    /**
     * TODO in dieser Methode: bestelle-Aufruf absichern durch Fangen von
     * BestellungExceptions und Ausgabe der enthaltenen Nachricht
     */
    public static void main(String[] args) {
		try {
			new SushiService().bestelle(23);
		}catch (BestellungException e){
			System.out.println(e.getMessage() + ", Cause: " + e.getCause().toString());
		}
    }

    public class BestellungException extends Exception {
        public BestellungException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}