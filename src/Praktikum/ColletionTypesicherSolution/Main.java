package Praktikum.ColletionTypesicherSolution;

import Praktikum.ColletionTypesicherSolution.Fachlogik.Medienverwaltung;
import Praktikum.ColletionTypesicherSolution.GUI.MedienVerwaltungFX;

public class Main {
    public static void main(String[] args) {
            new MedienVerwaltungFX(new Medienverwaltung()).showMenu();
    }

}
