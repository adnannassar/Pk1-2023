package Vorlesung.ObserverPattern.ObserverAndObservable;


import java.util.Observable;

public class Artikel extends Observable {
    private String name;
    private double price;

    public Artikel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double newPrice) {
        if(newPrice < price){
            setChanged();
            notifyObservers("Der Preis von "  + name
             + " wurde reduziert!, der neuer Preis ist " + newPrice);
        }
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
