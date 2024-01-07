package Vorlesung.Threads;

public class BasicThread {
    public static void main(String[] args) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<5; i++){
                    System.out.println("Thread 1: " + i);
                }

            }
        };
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<5; i++){
                    System.out.println("Thread 2: " + i);
                }
            }
        };


        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();

        try {
            // Main wartet auf Thread 1 (t1)
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main Thread");



    }
}