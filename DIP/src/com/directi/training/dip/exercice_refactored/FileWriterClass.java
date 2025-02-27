package com.directi.training.dip.exercice_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterClass implements IWriter {
    private String filePath;

    public FileWriterClass(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String encodedLine) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(encodedLine);
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
