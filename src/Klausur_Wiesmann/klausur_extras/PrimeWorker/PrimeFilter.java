package Klausur_Wiesmann.klausur_extras.PrimeWorker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PrimeFilter {
        public static Collection<Integer> filterPrimes(Collection<Integer> numbers) {
            Collection<Integer> primes = new ArrayList<>();
            List<Thread> threads = new ArrayList<>();

            // Für jede Zahl in der übergebenen Collection wird ein PrimeWorker erstellt und gestartet
            for (int number : numbers) {
                PrimeWorker worker = new PrimeWorker(number, primes);
                Thread thread = new Thread(worker);
                thread.start();
                threads.add(thread);
            }

            // Warten auf die Beendigung aller Threads
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            return primes;
        }
    }
