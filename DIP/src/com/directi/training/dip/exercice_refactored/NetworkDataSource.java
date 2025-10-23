package com.directi.training.dip.exercise_refactored;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataSource implements DataSource {
    private URL url;

    public NetworkDataSource(URL url) {
        this.url = url;
    }

    @Override
    public String getData() throws Exception {
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder sb = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            sb.append((char) c);
        }
        reader.close();
        return sb.toString();
    }
}
