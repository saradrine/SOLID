package com.directi.training.dip.exercice_refactored;
import java.io.IOException;

public class DatabaseWriter implements IWriter {
    private MyDatabase database;

    public DatabaseWriter(MyDatabase database) {
        this.database = database;
    }

    @Override
    public void write(String encodedString) throws IOException {
        database.write(encodedString);
    }
}
