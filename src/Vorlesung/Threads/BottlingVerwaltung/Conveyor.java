package Vorlesung.Threads.BottlingVerwaltung;

import java.util.LinkedList;

public class Conveyor {
    private LinkedList<Bottle> bottles;

    public Conveyor() {
        this.bottles = new LinkedList<>();
    }
    public void load(Bottle b){
        this.bottles.add(b);
    }

    public Bottle withDraw(){
        return bottles.remove();
    }

    public boolean isEmpty(){
        return bottles.isEmpty();
    }

    public boolean isOverLoaded(){
            return bottles.size() >= 50;
    }

}
