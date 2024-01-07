package Klausur_10_08_2022.Aufgabe_004;

import java.io.*;

public class FileUtil {
	public static void zaehleZeichenProZeile(File quelle, File ziel) {
        try (
				BufferedReader bufferedReader = new BufferedReader(new FileReader(quelle));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ziel))
		) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				bufferedWriter.write(line + " (" + line.length() + " Zeichen" + ")\n");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
    }

	public static void main(String[] args) {
		FileUtil.zaehleZeichenProZeile(new File("Exmaple_For_IO/SourceFileForKlausurAufgabe.txt"),
				new File("Exmaple_For_IO/CopyOFSourceFileForKlausurAufgabe.txt"));
	}
}