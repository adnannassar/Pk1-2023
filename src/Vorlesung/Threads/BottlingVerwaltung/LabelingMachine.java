package Vorlesung.Threads.BottlingVerwaltung;

public class LabelingMachine implements Runnable {
    private Conveyor c;
    private int delay;

    public LabelingMachine(Conveyor c, int delay) {
        this.c = c;
        this.delay = delay;
    }

    @Override
    public void run() {
        Bottle b;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                synchronized (c) {
                    while (c.isEmpty()) {
                        c.wait();
                        System.out.println("Etikettiermaschine: Warten, da Foerderband leer.");
                    }
                    b = c.withDraw();
                    c.notifyAll();
                }
                b.setLabel(new Label("Cola", 2025));
                System.out.print("Etikettiermaschine: ");
                b.printLabel();
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                System.out.println("Thread is Interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }
}
