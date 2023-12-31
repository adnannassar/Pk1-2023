package Vorlesung.ObserverPattern.SupportListner;


public class Main {
    public static void main(String[] args) {
        Artikel a1 = new Artikel("Coca Cola", 1.45);


        Customer c1 = new Customer("Sabri");
        Customer c2 = new Customer("Hasan");
        Customer c3 = new Customer("Salam");

         a1.addPropertyChangeListener(c1);
         a1.addPropertyChangeListener(c2);

         a1.setPrice(1.45);
    }

}
