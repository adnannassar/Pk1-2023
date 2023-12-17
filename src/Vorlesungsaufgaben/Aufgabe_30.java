package Vorlesungsaufgaben;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Aufgabe_30
{
    public static void main(String[] args) {
        try {
            Utility.sayHello(new FileOutputStream("Exmaple_For_IO/Aufgabe_30.txt"));
            // Utility.sayHello(System.out); to write on console!
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static class Utility {
        public static void sayHello(OutputStream s) throws IOException {
            OutputStreamWriter sw = new OutputStreamWriter(s);
            sw.write("Hallo World!");
            sw.flush();
        }
    }
}
