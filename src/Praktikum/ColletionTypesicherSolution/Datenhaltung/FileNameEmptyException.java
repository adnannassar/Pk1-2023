package Praktikum.ColletionTypesicherSolution.Datenhaltung;

public class FileNameEmptyException extends Exception {
    public FileNameEmptyException() {
        super();
    }

    public FileNameEmptyException(String message) {
        super(message);
    }
}
