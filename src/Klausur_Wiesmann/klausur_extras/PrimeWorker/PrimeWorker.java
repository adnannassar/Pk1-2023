package Klausur_Wiesmann.klausur_extras.PrimeWorker;

import java.util.Collection;

public class PrimeWorker implements Runnable {
    private int number;
    private Collection<Integer> primes;

    public PrimeWorker(int number, Collection<Integer> primes) {
        this.number = number;
        this.primes = primes;
    }

    @Override
    public void run() {
        if (isPrime(this.number)) {
            synchronized (primes) {
                primes.add(this.number);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}