package Vorlesung.Threads.BottlingVerwaltung;

public class Label {

    private String type;
    private int bestBefore;

    public Label(String type, int bestBefore) {
        this.type = type;
        this.bestBefore = bestBefore;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return type + ", mindestens haltbar bis: " + bestBefore;
    }
}
