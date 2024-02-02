package Klausur_Wiesmann.klausur_extras.TimeListenerAufgabe;

public class Main {
    public static void main(String[] args) {
        Timer_2 timer = new Timer_2(5000);
        Zeitansage_2 zeitansage = new Zeitansage_2();
        timer.addTimeListener(zeitansage);

        Thread t = new Thread(timer);
         t.start();
    }
}