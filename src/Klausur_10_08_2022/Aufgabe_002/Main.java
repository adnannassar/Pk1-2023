package Klausur_10_08_2022.Aufgabe_002;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        Track track1 = new Track("Title 1", "Interpret 1", 2024);
        Track track2 = new Track("Title 2", "Interpret 2", 2023);
        Track track3 = new Track("Title 3", "Interpret 3", 2025);
        Track track4 = new Track("Title 4", "Interpret 4", 2000);


        playlist.hinzufuegen(track1);
        playlist.hinzufuegen(track2);
        playlist.hinzufuegen(track3);
        playlist.hinzufuegen(track4);

        playlist.sortiere(new Comparator<Track>() {
            @Override
            public int compare(Track o1, Track o2) {
                if (o1 != null && o2 != null) {
                    return o1.getJahr() - o2.getJahr();
                } else {
                    return 0;
                }
            }
        });

        for(Track t: playlist.gibAlleInhalte()){
            if(t != null){
                System.out.println(t);
            }
        }
    }
}
