package Vorlesungsaufgaben;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BindingExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        TextField tf = new TextField();


        grid.setPadding(new Insets(10));
        Label cursorPos = new Label("");
        Label textLaenge = new Label("");
        Label auswahl = new Label("");
        Label text = new Label("");
        cursorPos.textProperty().bind(tf.caretPositionProperty()
                .asString());
        textLaenge.textProperty().bind(tf.lengthProperty().asString());
        auswahl.textProperty().bind(tf.selectedTextProperty());
        text.textProperty().bind(tf.textProperty());


        grid.addRow(1, tf);
        grid.addRow(2, new Label("Cursor-Position"), cursorPos);
        grid.addRow(3, new Label("Länge"), textLaenge);
        grid.addRow(4, new Label("Auswahl"), auswahl);
        grid.addRow(5, new Label("Text"), text);


        Scene scene = new Scene(grid, 500, 500);

        stage.setTitle("Texteingabe");
        stage.setScene(scene);
        stage.show();
    }
}
