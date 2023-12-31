package Vorlesung.ObserverPattern.SupportListner;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Customer implements PropertyChangeListener {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Customer Name: " + name);
        System.out.println("Event Name " + evt.getPropertyName());
        System.out.println("Old Value: " + evt.getOldValue());
        System.out.println("New Value: " + evt.getNewValue());
        System.out.println();

    }
}
