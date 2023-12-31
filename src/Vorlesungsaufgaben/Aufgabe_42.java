package Vorlesungsaufgaben;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;


public class Aufgabe_42 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();



        Rectangle rectangle = new Rectangle(50, 50);
        rectangle.setFill(Color.BLUE);


        pane.getChildren().add(rectangle);
        Scene scene  = new Scene(pane , 600, 600);
        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                rectangle.setX( mouseEvent.getX());
                rectangle.setY( mouseEvent.getY());
            }
        });



        stage.setTitle("Quadrat");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
