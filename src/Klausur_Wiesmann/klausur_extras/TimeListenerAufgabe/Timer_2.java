package Klausur_Wiesmann.klausur_extras.TimeListenerAufgabe;

import java.util.ArrayList;
import java.util.List;

class Timer_2 implements Runnable {
    private long timeMillis;
    private List<TimeListener_2> listeners = new ArrayList<>();

    public Timer_2(long timeMillis) {
        this.timeMillis = timeMillis;
    }

    public void addTimeListener(TimeListener_2 listener) {
        listeners.add(listener);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(timeMillis);
            for (TimeListener_2 listener : listeners) {
                listener.onTimeElapsed();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}