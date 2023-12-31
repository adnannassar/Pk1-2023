package Vorlesung.ObserverPattern.ClassicSolutionNoBinding;

public class Main {
    public static void main(String[] args) {
        Firma f = new Firma("Kaufland");

        Artikel a1 = new Artikel("Coca Cola", 1.45, f);
        Artikel a2 = new Artikel("Sinalco Cola", 2.45, f);
        Artikel a3 = new Artikel("Fanzt Cola", 1.00, f);
        Artikel a4 = new Artikel("Pepsi Cola", 0.99, f);

        f.add(a1);
        f.add(a2);
        f.add(a3);
        f.add(a4);

        a1.setPrice(1);

    }
}
