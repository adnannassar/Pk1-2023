package Vorlesungsaufgaben;

import java.io.*;

public class Aufgabe_28 {
    public static void main(String[] args) {
        copyFileUsingRandomAccessFile(
                new File("Exmaple_For_IO/RandomAccessExamples/SourceFile.txt"),
                new File("Exmaple_For_IO/RandomAccessExamples/CopyOfSourceFile.txt"));
    }

    private static void copyFileUsingRandomAccessFile(File from, File to) {
        try (RandomAccessFile rafFrom = new RandomAccessFile(from, "r");
             RandomAccessFile rafTo = new RandomAccessFile(to, "rw")) {
            int i = 0;
            int b;
            while ((b = rafFrom.read()) != -1) {
                rafTo.write(b);
                i++;
                rafFrom.seek(i);
                rafTo.seek(i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

