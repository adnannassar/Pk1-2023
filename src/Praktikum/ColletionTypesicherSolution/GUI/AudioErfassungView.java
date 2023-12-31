package Praktikum.ColletionTypesicherSolution.GUI;

import Praktikum.ColletionTypesicherSolution.Datenhaltung.Audio;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AudioErfassungView extends Stage {

    private Audio audio;

    public AudioErfassungView( Stage primaryStage, Audio audio) {
        this.initOwner(primaryStage);
        this.initModality(Modality.WINDOW_MODAL);

    }

    public void showAudioErfassungView(){

    }
}
