package Vorlesung.ObserverPattern.SupportListner;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Artikel {
    private String name;
    private double price;
    private PropertyChangeSupport support;
    private static final String price_key = "price";

    public Artikel(String name, double price) {
        this.name = name;
        this.price = price;
        this.support = new PropertyChangeSupport(this);
    }

    public  void addPropertyChangeListener(PropertyChangeListener listener){
        this.support.addPropertyChangeListener(listener);
    }

    public  void removePropertyChangeListener(PropertyChangeListener listener){
        this.support.removePropertyChangeListener(listener);
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
       double oldPrice = this.price;
       this.price = newPrice;
       support.firePropertyChange(price_key, oldPrice, newPrice);
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
