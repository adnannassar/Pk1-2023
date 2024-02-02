package Klausur_Wiesmann.klausur_extras.FilterWorker;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;

public class StringFilterUtility {
    public static Collection<String> filterStrings(Collection<String> liste, Predicate<String> predicate) {
        Collection<String> abgabe = new LinkedList<>();
        Collection<Thread> threads = new LinkedList<>();
        for (String string : liste) {
            Thread thread = new Thread(new FilterWorker(abgabe, string, predicate));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return abgabe;
    }
}
