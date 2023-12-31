package Vorlesungsaufgaben;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;


public class Aufgabe_40 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane borderPane = new BorderPane();

        Rectangle rectangle = new Rectangle(200, 200);
        rectangle.setFill(Color.GREEN);
        HBox hBox = new HBox();

        Button farbeBtb = new Button("Farbewechsel");

        hBox.getChildren().add(farbeBtb);
        hBox.setAlignment(Pos.CENTER);

        borderPane.setCenter(rectangle);
        borderPane.setBottom(hBox);

        farbeBtb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Random random = new Random();
                int r = random.nextInt(1, 256);
                int g = random.nextInt(1, 256);
                int b = random.nextInt(1, 256);
                rectangle.setFill(Color.rgb(r, g, b));
            }
        });

        Scene scene  = new Scene(borderPane , 600, 600);
        stage.setTitle("Farbe-Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
