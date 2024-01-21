package Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_004;

import Klausur_Wiesmann.Klausur_14_02_2022.Aufgabe_002.Car;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PriceInfoView extends Stage {
    private Car c;

    public PriceInfoView(Stage primaryStage, Car c) {
        this.initOwner(primaryStage);
        this.initModality(Modality.WINDOW_MODAL);
    }


    public void shwView(Stage stage) {
        VBox vBox = new VBox(15);

        HBox hBox1 = new HBox(50);
        hBox1.getChildren().addAll(new Label("Model"), new Label("Price"));

        HBox hBox2 = new HBox(50);
        hBox2.getChildren().addAll(new Label(c.getModel()), new Label(String.valueOf(c.getPrice())));

        HBox hBox3 = new HBox();
        Button ok = new Button("Ok");

        ok.setOnAction(e-> Platform.exit());

        hBox3.getChildren().add(ok);
        hBox3.setAlignment(Pos.CENTER);


        vBox.getChildren().addAll(hBox1, hBox2, hBox3);

        Scene scene = new Scene(vBox, 250, 100);
        stage.setScene(scene);
        stage.setTitle("Price-Information");

        stage.show();
    }
}
