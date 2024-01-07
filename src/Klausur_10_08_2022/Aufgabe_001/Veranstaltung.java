package Klausur_10_08_2022.Aufgabe_001;

import java.util.ArrayList;
import java.util.List;

/**
 * Programm 2
 * 
 * TODO Die Ausfuehrung des Programmes fuehrt zu einer falschen Ausgabe und
 * einer Exception. Erwartete Ausgabe: "Lineare Algebra, Algorithmen und
 * Datenstrukturen, "
 */
public class Veranstaltung {
	private String titel;
	private int semester;

	public Veranstaltung(String titel, int semester) {
		this.titel = titel;
		this.semester = semester;
	}

	public int getSemester() {
		return semester;
	}

	@Override
	public String toString() {
		return titel;
	}

	/**
	 * TODO Implementierung korrigieren!
	 * 
	 * Wichtig: Aenderungen nur in dieser Methode durchfuehren! Iterator weiterhin
	 * verwenden!
	 * 
	 * Diese Methode soll alle Veranstaltungen zum gegebenen Semester ausgeben.
	 */
	private static void printVeranstaltungenFuerSemester(List<Veranstaltung> veranstaltungen, int semester) {
		var iterator = veranstaltungen.iterator();
		while (iterator.hasNext()) {
			Veranstaltung v =  iterator.next();
			if (v.getSemester() == semester) {
				System.out.print(v + ", ");
			}
		}
	}

	public static void main(String[] args) {
		var veranstaltungen = new ArrayList<Veranstaltung>();
		veranstaltungen.add(new Veranstaltung("Programmierkurs", 3));
		veranstaltungen.add(new Veranstaltung("Web-Technologien", 4));
		veranstaltungen.add(new Veranstaltung("Lineare Algebra", 2));
		veranstaltungen.add(new Veranstaltung("Analysis", 1));
		veranstaltungen.add(new Veranstaltung("Einfuehrung in die Programmierung", 1));
		veranstaltungen.add(new Veranstaltung("Algorithmen und Datenstrukturen", 2));

		// Der folgende Aufruf fuehrt zu einer falschen Ausgabe und einer Exception.
		// Erwartete Ausgabe: "Lineare Algebra, Algorithmen und Datenstrukturen, "
		printVeranstaltungenFuerSemester(veranstaltungen, 2);
	}
}
