package Studnets.Yahya.Wiesmann.Praktikums.Praktikum002.nichtTypSicher;


public class Main {
    public static void main(String[] args) {
        Medium m1 = new Audio("It Means Nothing", 2007, "Stereophonics", 229);
        Medium m2 = new Bild("Gebaeude FB Informatik", 2021, "Dortmund");
        Medium m3 = new Audio("It Means Nothing", 2007, "Stereophonics", 229);

        //System.out.println(m1);
        //isEquals(m1,m2);
        //isEquals(m1,m3);

        Medienverwaltung mv = new Medienverwaltung();

        mv.aufnehmen(m1);
        mv.aufnehmen(m2);
        mv.aufnehmen(m3);

        //mv.zeigeMedien();
        //mv.sucheNeuesMedium();
        System.out.println(mv.berechneErscheinungsjahr());

    }

    public static void isEquals(Medium m1, Medium m2) {
        if (m1.equals(m2)) {
            System.out.println("Die Objekte mit Id " + m1.getId() + " und Id " + m2.getId() + " sind (fachlich) gleich.\nDie gleichen Objekte haben den Hashcode " + m1.hashCode() + " und " + m2.hashCode());
        } else {
            System.out.println("Die Objekte mit Id " + m1.getId() + " und Id " + m2.getId() + " sind nicht gleich.\nDie unterschiedlichen Objekte haben den Hashcode " + m1.hashCode() + " und " + m2.hashCode());
        }
    }
}
