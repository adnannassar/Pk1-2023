package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_003;

public class Scheduler {

    public static void start(Thread t, Runnable r) throws InterruptedException {
        t.start();
        Thread t2 = new Thread(r);
        t2.start();
        t.join();
        t2.join();
    }
}
