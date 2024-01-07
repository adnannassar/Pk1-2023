package Klausur_10_08_2022.Aufgabe_002;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class Playlist implements IPlaylist<Track> {
    private Track[] tracks;

    public Playlist() {
        this.tracks = new Track[10];
    }

    @Override
    public void hinzufuegen(Track element) {
        if (tracks[tracks.length - 1] != null) {
            System.out.println("Playlist ist voll!");
        } else {
            for (int i = 0; i < tracks.length; i++) {
                if (tracks[i] == null) {
                    tracks[i] = element;
                    break;
                }
            }
        }
    }

    @Override
    public void sortiere(Comparator<Track> comparator) {
        Arrays.sort(tracks, comparator);
    }

    @Override
    public Track[] gibAlleInhalte() {
        return this.tracks;
    }
}
