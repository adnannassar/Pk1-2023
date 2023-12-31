package Vorlesung.ObserverPattern.ClassicSolutionNoBinding;

public class Artikel {
    private String name;
    private double price;

    private Firma firma;

    public Artikel(String name, double price, Firma firma) {
        this.name = name;
        this.price = price;
        this.firma = firma;
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
            System.out.println("Es gibt neue Angebote!");
            firma.werbungDrucken();
        }
        this.price = newPrice;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}
