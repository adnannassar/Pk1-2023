package Vorlesungsaufgaben;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Aufgabe_26 {
    public static void main(String[] args) {
        File file = new File("Exmaple_For_IO");
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    if (f.exists() && f.isDirectory()) {
                        System.out.println("[" + f.getName() + "]");
                        File[] inJavaFileArray = f.listFiles();
                        for (File a : inJavaFileArray) {
                            System.out.println("\t" + a.getName());
                        }
                    } else {
                        System.out.println(f.getName());
                    }
                }
            } else {
                System.out.println("File is Directory and cannot be looped!");
            }
        } else {
            System.out.println("File does not exists");
        }
    }
}
