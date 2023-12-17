package Praktikum.Praktikum_001.ColletionNichtTypesicherSolution;

public class MainNichtTypsicher {
    public static void main(String[] args) {
        Audio audio = new Audio("It Means Nothing", 2007, "Stereophonics", 229);
        Bild bild = new Bild("Gebaeude FB Informatik", 2014, "Dortmund");

        MedienverwaltungNichtTypsicher mv = new MedienverwaltungNichtTypsicher();
        mv.aufnehmen(bild);
        mv.aufnehmen(audio);

        mv.zeigeMedien();
        mv.sucheNeuesMedium();
        System.out.println("Durchschnittliche Erscheinungsjahr: " + mv.berechneErscheinungsjahr());

    }

    private static void druckeAlter(Medium m) {
        System.out.println("\"" + m.getTitle() + "\"" + " ist " + m.alter() + " Jahre alt.");
    }

}
