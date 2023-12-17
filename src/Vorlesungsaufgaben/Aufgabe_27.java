package Vorlesungsaufgaben;

import Vorlesung.IO.PdfFilter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class Aufgabe_27 {
    public static void main(String[] args) {
        File file = new File("Exmaple_For_IO");
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles(new PdfFilter("pdf"));
            for (File x : files) {
                System.out.println(x.getName());
            }
        }


    }
}
