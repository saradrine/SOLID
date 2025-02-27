package com.directi.training.dip.exercice_refactored;
import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException
    {
        IReader reader = new FileReaderClass("DIP/src/com/directi/training/dip/exercice_refactored/beforeEncryption.txt");
        IWriter writer = new FileWriterClass("DIP/src/com/directi/training/dip/exercice_refactored/afterEncryption.txt");
        EncodingModule encodingModule = new EncodingModule(reader, writer);
        encodingModule.encode();

        IReader reader1 = new NetworkReader("http", "myfirstappwith.appspot.com", "/index.html");
        IWriter writer1 = new DatabaseWriter(new MyDatabase());
        EncodingModule encodingModule1 = new EncodingModule(reader1, writer1);
        encodingModule1.encode();
    }
}
