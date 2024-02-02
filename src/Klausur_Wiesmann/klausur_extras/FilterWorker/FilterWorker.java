package Klausur_Wiesmann.klausur_extras.FilterWorker;

import java.util.Collection;
import java.util.function.Predicate;

public class FilterWorker implements Runnable {
    private final Collection<String> liste;
    private String string;
    private Predicate<String> predicate;

    public FilterWorker(Collection<String> liste, String string, Predicate<String> predicate) {
        this.liste = liste;
        this.string = string;
        this.predicate = predicate;
    }

    @Override
    public void run() {
        synchronized (liste) {
            if (predicate.test(string)) {
                liste.add(string);
            }
        }
    }
}