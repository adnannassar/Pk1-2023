package Vorlesung.Threads.BottlingVerwaltung;

public class Main {
    public static void main(String[] args) {
        Conveyor conveyor = new Conveyor();

        Thread btMachineThread = new Thread(new BottlingMachine(conveyor , 2000));
        Thread lbMachineThread = new Thread(new LabelingMachine(conveyor, 2000));

        btMachineThread.start();
        lbMachineThread.start();
    }
}
