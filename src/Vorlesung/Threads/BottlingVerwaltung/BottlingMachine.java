package Vorlesung.Threads.BottlingVerwaltung;

public class BottlingMachine implements Runnable {
    private Conveyor c;
    private int delay;

    public BottlingMachine(Conveyor c , int delay) {
        this.c = c;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (c) {
                    while (c.isOverLoaded()) {
                        c.wait();
                    }
                    c.load(new Bottle());
                    c.notifyAll();
                    System.out.println("Abfuellanlage: Neue Flasche abgefuellt");
                }
                Thread.sleep(delay);
            }catch (InterruptedException ex){
                System.out.println("Thread is Interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }
}
