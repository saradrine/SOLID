package com.directi.training.dip.exercice_refactored;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
public class NetworkReader implements IReader {
    private String protocol;
    private String host;
    private String file;

    public NetworkReader(String protocol, String host, String file) {
        this.protocol = protocol;
        this.host = host;
        this.file = file;
    }

    @Override
    public String read() throws IOException {
        StringBuilder inputString1 = new StringBuilder();
        URL url = new URL(protocol, host, file);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        int c = reader.read();
        while (c != -1) {
            inputString1.append((char) c);
            c = reader.read();
        }
        return inputString1.toString();
    }
}
