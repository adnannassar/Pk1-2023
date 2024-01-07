package Vorlesung.Threads.BottlingVerwaltung;

public class Bottle {
    private Label label ;

    public void setLabel(Label label) {
        this.label = label;
    }

    public Label getLabel() {
        return label;
    }

    public void printLabel(){
        System.out.println(label);
    }
}
