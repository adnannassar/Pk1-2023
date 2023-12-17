package Vorlesungsaufgaben;

import java.io.*;

public class Aufgabe_29 {
    public static void main(String[] args) {
        copyFileUsingBufferedInputOutputStreams(
                new File("Exmaple_For_IO/RandomAccessExamples/SourceFile.txt"),
                new File("Exmaple_For_IO/RandomAccessExamples/CopyOfSourceFile.txt"));
    }

    private static void copyFileUsingBufferedInputOutputStreams(File from, File to) {
        try (BufferedInputStream bfs = new BufferedInputStream(new FileInputStream(from));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to))) {

            int b;
            while ((b = bfs.read()) != -1) {
                bos.write(b);
            }
            System.out.println("Copy successful!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

