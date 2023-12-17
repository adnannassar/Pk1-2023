package Studnets.Yahya.Wiesmann.Praktikums.Praktikum001;



public class Main {
    public static void main(String[] args) {
        Medium m1 = new Audio("It Means Nothing",2007,"Stereophonics",229);
        Medium m2 = new Bild("Gebaeude FB Informatik",2021,"Dortmund");

        m1.druckeDaten();
        m2.druckeDaten();
        m1.druckeAlter();
        m2.druckeAlter();


    }
}
