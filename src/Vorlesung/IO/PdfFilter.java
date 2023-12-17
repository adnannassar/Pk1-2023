package Vorlesung.IO;

import java.io.File;
import java.io.FileFilter;

public class PdfFilter implements FileFilter {
    private String filter;

    public PdfFilter() {
    }

    public PdfFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean accept(File file) {
        return file.getName().toLowerCase().endsWith("." + filter);
    }
}
