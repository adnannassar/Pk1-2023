package Vorlesung.Threads.PingPong;

public class PingPong implements Runnable {
    private String text;
    private int delay;


    public PingPong(String text, int delay) {
        this.text = text;
        this.delay = delay;
    }


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(text);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread ping = new Thread(new PingPong("Ping", 2000));
        Thread pong = new Thread(new PingPong("Pong", 2000));
        ping.start();
        pong.start();
    }

}
