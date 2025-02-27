package com.directi.training.dip.exercice_refactored;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderClass implements IReader {
    private String filePath;

    public FileReaderClass(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String aLine;
            while ((aLine = reader.readLine()) != null) {
                content.append(aLine);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return content.toString();
    }
}
