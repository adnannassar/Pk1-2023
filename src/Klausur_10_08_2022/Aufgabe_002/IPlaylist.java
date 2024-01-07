package Klausur_10_08_2022.Aufgabe_002;

import java.util.Comparator;

public interface IPlaylist<T> {
	/** Fuegt das gegebene Element zu der Playlist hinzu. */
	public void hinzufuegen(T element);

	/** Sortiert die Playlist mit Hilfe des gegebenen Comparators. */
	public void sortiere(Comparator<T> comparator);
	
	/** Gibt alle Inhalte der Playlist zurueck. */
	public T[] gibAlleInhalte();
}
