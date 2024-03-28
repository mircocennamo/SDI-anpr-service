package it.interno.anpr.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Lazy
@Component
public class FileReader {

    public BufferedReader zipReader(byte[] zipContent) {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(zipContent));
            ZipEntry entry;

            while ((entry = zipInputStream.getNextEntry()) != null) {
                if (entry.getName().endsWith(".csv")) {
                    System.out.println("CSV File name: " + entry.getName());
                    BufferedReader reader = new BufferedReader(new InputStreamReader(zipInputStream));
                    reader.readLine();
                    return reader;
                } else {
                    zipInputStream.closeEntry();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Errore nella lettura del file zip");
        }

        throw new RuntimeException("Nessun file CSV trovato nell'archivio ZIP");
    }
}
