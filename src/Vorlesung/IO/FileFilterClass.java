package Vorlesung.IO;

import java.io.File;
import java.io.FileFilter;

public class FileFilterClass {
    private static File file = new File("Exmaple_For_IO");

    public static void main(String[] args) {

        // printPdfUsingExternalFilterClass();
        // printPdfUsingExternalFilterClass("txt");
        // printPdfUsingInlineFilterClass();
        // printPdfUsingInlineFilterClass("txt");
    }


    private static void printPdfUsingExternalFilterClass() {
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles(new PdfFilter());
            for (File x : files) {
                System.out.println(x.getName());
            }
        }
    }

    private static void printPdfUsingExternalFilterClass(String filter) {
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles(new PdfFilter(filter));
            for (File x : files) {
                System.out.println(x.getName());
            }
        }
    }


    private static void printPdfUsingInlineFilterClass() {
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().toLowerCase().endsWith(".png") ||
                            file.getName().toLowerCase().endsWith(".jpeg");
                }
            });
            for (File x : files) {
                System.out.println(x.getName());
            }
        }
    }

    private static void printPdfUsingInlineFilterClass(String filter) {
        if (file.exists() && file.isDirectory()) {
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.getName().toLowerCase().endsWith("." + filter);
                }
            });
            for (File x : files) {
                System.out.println(x.getName());
            }
        }
    }


}
