package Vorlesung.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamClass {


    public static void main(String[] args) {
        File to = new File("Exmaple_For_IO/RandomAccessExamples/CopyOfSourceFile.txt");
        writeInFileUsingPrintStream(to);
    }

    private static void writeInFileUsingPrintStream(File to) {
        try (PrintStream printStream = new PrintStream(new FileOutputStream(to))) {
            printStream.println("Test Test!");
            System.out.println("Successful!");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
