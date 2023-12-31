package Vorlesungsaufgaben;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class ListViewExample extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        createListView(stage);
    }

    void createListView(Stage stage){
        GridPane gridPane = new GridPane();

        ListView<String> listView = new ListView<>();

        ObservableList<String> observableList =
                FXCollections.observableArrayList();
        for (int i = 0; i < 20; i++) {
            observableList.add("This is item " + i);
        }
        listView.getItems().addAll(observableList);

        Label l1 = new Label("Label 1");
        Label l2 = new Label("Label 2");

        TextField tf0 = new TextField("TextFiled 0");
        TextField tf1 = new TextField("TextFiled 1");
        TextField tf2 = new TextField("TextFiled 2");

        Button start = new Button("Start");

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.add(listView, 0, 0 , 1 , 3);

        gridPane.add(l1, 1, 0);
        gridPane.add(l2, 1, 1);
        gridPane.add(tf0, 2, 0);
        gridPane.add(tf1, 2, 1);
        gridPane.add(tf2, 2, 2);
        gridPane.add(start, 2, 4);



        Scene scene = new Scene(gridPane, 500, 500);

        stage.setScene(scene);

        stage.setTitle("Demo Java FX App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}