package Klausur_Wiesmann.klausur_extras.TimeListenerAufgabe;

class Zeitansage_2 implements TimeListener_2 {
    @Override
    public void onTimeElapsed() {
        System.out.println("Die eingestellte Zeit ist abgelaufen!");
    }
}
