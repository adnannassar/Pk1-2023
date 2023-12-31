package Vorlesung.ObserverPattern.ClassicSolutionNoBinding;

import java.util.LinkedList;

public class Firma {
    private LinkedList<Artikel> artikels;
    private String name;

    public Firma( String name) {
        this.artikels = new LinkedList<>();
        this.name = name;
    }

    public void add(Artikel artikel){
        this.artikels.add(artikel);
    }

    public LinkedList<Artikel> getArtikels() {
        return artikels;
    }

    public void setArtikels(LinkedList<Artikel> artikels) {
        this.artikels = artikels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void werbungDrucken(){
        for(Artikel a: artikels){
            System.out.println(a);
        }
    }
}
