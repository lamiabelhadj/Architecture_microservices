package com.directi.training.dip.exercise_refactored;

import java.net.URL;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        DataSource fileSource = new FileDataSource("beforeEncryption.txt");
        Storage database = new MyDatabase();

        EncodingModule module = new EncodingModule(fileSource, database);
        module.encodeAndStore();

        DataSource networkSource = new NetworkDataSource(new URL("http://myfirstappwith.appspot.com/index.html"));
        EncodingModule module2 = new EncodingModule(networkSource, database);
        module2.encodeAndStore();
    }
}
