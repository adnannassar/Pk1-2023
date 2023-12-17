package Studnets.Yahya.Wiesmann.Praktikums.Praktikum001;
import java.time.LocalDate;

public abstract class Medium {
    private final int id;
    private String title;
    private int jahr;
    private static int counter = 0;


    public Medium(String title, int jahr){
        id = counter++;
        this.title = title;
        this.jahr = jahr;
    }


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Medium.counter = counter;
    }

    public int alter (){
        return LocalDate.now().getYear() - jahr;
    }

    public abstract void druckeDaten();
    public void druckeAlter(){
        System.out.println("\"" + getTitle() + "\"" + " ist " + alter() + " Jahre alt.");
    }

}
