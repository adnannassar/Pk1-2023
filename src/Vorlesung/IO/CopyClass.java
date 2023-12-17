package Vorlesung.IO;

import java.io.*;


public class CopyClass {
    public static void main(String[] args) {
        File from = new File("Exmaple_For_IO/RandomAccessExamples/SourceFile.txt");
        File to = new File("Exmaple_For_IO/RandomAccessExamples/CopyOfSourceFile.txt");
        // copyFileUsingRandomAccessFile(from, to);
        // copyFileUsingFileInputOutputStreams(from, to);
        // copyFileUsingBufferedInputOutputStreams(from, to);
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
            System.out.println("Copy successful!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void copyFileUsingFileInputOutputStreams(File from, File to) {
        try (FileInputStream fis = new FileInputStream(from);
             FileOutputStream fos = new FileOutputStream(to)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("Copy successful!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
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
