package Klausur_10_08_2022.Aufgabe_002;

public class Track {
	private String titel;
	private String interpret;
	private int jahr;

	public Track(String titel, String interpret, int jahr) {
		this.titel = titel;
		this.interpret = interpret;
		this.jahr = jahr;
	}

	public String getTitel() {
		return titel;
	}

	public String getInterpret() {
		return interpret;
	}

	public int getJahr() {
		return jahr;
	}

	@Override
	public String toString() {
		return titel + " von " + interpret + " (" + jahr + ")";
	}
}
