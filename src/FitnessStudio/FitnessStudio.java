package FitnessStudio;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;


public class FitnessStudio extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = new VBox();

        ListView<Mitglied> listView = new ListView<>();

        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 2) {
                    Mitglied selectedValue = listView.getSelectionModel().getSelectedItem();
                    if (selectedValue != null) {
                        // toggle the anwesend value!
                        selectedValue.setAnwesend(!selectedValue.isAnwesend());
                        if (selectedValue.isAnwesend()) {
                            selectedValue.setAnzahlTraining(selectedValue.getAnzahlTraining() + 1);
                        }
                        listView.refresh();
                    }
                }
            }
        });

        HBox vornameHBox = new HBox(15);
        Label vorname = new Label("Vorname");
        TextField vornameTF = new TextField();
        vornameHBox.getChildren().addAll(vorname, vornameTF);


        HBox nachnameHBox = new HBox(15);
        Label nachname = new Label("Nachname");
        TextField nachnameTF = new TextField();
        nachnameHBox.getChildren().addAll(nachname, nachnameTF);

        HBox buttonHbox = new HBox();
        Button registerBTN = new Button("Register");
        buttonHbox.getChildren().addAll(registerBTN);
        buttonHbox.setAlignment(Pos.CENTER);

        registerBTN.setOnAction(actionEvent -> {
            String vorname1 = vornameTF.getText();
            String nachname1 = nachnameTF.getText();
            if (!nachname1.isEmpty() && !vorname1.isEmpty()) {
                Mitglied m = new Mitglied(nachname1, vorname1, false, 0);
                listView.getItems().add(m);
                listView.refresh();
            }
        });


        vBox.getChildren().addAll(listView, vornameHBox, nachnameHBox, buttonHbox);
        Scene scene = new Scene(vBox, 500, 500);

        stage.setScene(scene);

        stage.setTitle("Fitness Studio");
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}