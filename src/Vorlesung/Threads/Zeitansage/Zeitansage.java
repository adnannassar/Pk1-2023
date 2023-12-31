package Vorlesung.Threads.Zeitansage;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Zeitansage extends Application implements TimerListener {
    int second = 1;
    @Override
    public void signalPerformed() {
        System.out.println( second + " Sekunden seit Start!");
        second++;
    }

    @Override
    public void start(Stage stage) throws Exception {
        Thread t1 = new Thread(new Timer(this, 1000));
        t1.start();
        MessageView.create(stage, "Message", "Zeitansage stoopen!").showView();
        t1.interrupt();
        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
