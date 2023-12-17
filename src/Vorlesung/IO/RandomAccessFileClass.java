package Vorlesung.IO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileClass {
    public static void main(String[] args) {
        readFileUsingRandomAccessFileWithLength(new File("Exmaple_For_IO/test.txt"));
        readFileUsingRandomAccessFileWithFlagPosition(new File("Exmaple_For_IO/test.txt"));
    }

    private static void readFileUsingRandomAccessFileWithLength(File f) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "r");
            int i = 0;
            while (randomAccessFile.getFilePointer() != randomAccessFile.length()) {
                System.out.print((char) randomAccessFile.read());
                randomAccessFile.seek(++i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void readFileUsingRandomAccessFileWithFlagPosition(File f) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(f, "r");
            int i = 0;
            int b;
            while ((b = randomAccessFile.read()) != -1) {
                System.out.print((char) b);
                randomAccessFile.seek(++i);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
