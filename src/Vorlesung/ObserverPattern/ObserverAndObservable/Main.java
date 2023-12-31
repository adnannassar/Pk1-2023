package Vorlesung.ObserverPattern.ObserverAndObservable;


public class Main {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("Coca Cola", 1.45);
        Artikel a2 = new Artikel("Sinalco Cola", 2.45);
        Artikel a3 = new Artikel("Fanzt Cola", 1.00);
        Artikel a4 = new Artikel("Pepsi Cola", 0.99);


        Customer c1 = new Customer("Sabri");
        Customer c2 = new Customer("Hasan");
        Customer c3 = new Customer("Salam");

        a1.addObserver(c1);
        a1.addObserver(c2);
        a1.addObserver(c3);


        a1.setPrice(1.35);
        a2.setPrice(1.25);
    }

}
