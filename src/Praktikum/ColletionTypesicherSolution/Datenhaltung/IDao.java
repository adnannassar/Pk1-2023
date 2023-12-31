package Praktikum.ColletionTypesicherSolution.Datenhaltung;

import java.util.List;

public interface IDao {
    void speichern(List<Medium> liste) throws PersistenzException;
    List<Medium> laden() throws PersistenzException;
}
