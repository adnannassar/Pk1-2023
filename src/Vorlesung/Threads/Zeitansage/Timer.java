package Vorlesung.Threads.Zeitansage;

public class Timer implements Runnable {
    private TimerListener timerListener;
    private int delay;

    public Timer(TimerListener timerListener, int delay) {
        this.timerListener = timerListener;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            this.timerListener.signalPerformed();
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                System.err.println("Thread Interrupted!!");
                Thread.currentThread().interrupt();
            }
        }
    }
}
