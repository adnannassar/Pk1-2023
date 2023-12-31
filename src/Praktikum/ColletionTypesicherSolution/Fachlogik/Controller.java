package Praktikum.ColletionTypesicherSolution.Fachlogik;

import Praktikum.ColletionTypesicherSolution.Datenhaltung.IDao;
import Praktikum.ColletionTypesicherSolution.Datenhaltung.Medium;
import Praktikum.ColletionTypesicherSolution.Datenhaltung.PersistenzException;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Controller implements IDao {

    private LinkedList<Medium> mediums;

    public Controller(LinkedList<Medium> mediums) {
        this.mediums = mediums;
    }

    @Override
    public void speichern(List<Medium> liste) throws PersistenzException {
        try (ObjectOutputStream ost = new ObjectOutputStream(new FileOutputStream("Exmaple_For_IO/MedienVerwaltungIO/MedienList.ser"))) {
            ost.writeObject(mediums);
            System.out.println("Medien List wurde erfolgreich gespeichert!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Medium> laden() throws PersistenzException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Exmaple_For_IO/MedienVerwaltungIO/MedienList.ser"))) {
            return  (LinkedList<Medium>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new PersistenzException("Es gibt keine gespeicherte Liste!");
        }
    }
}
