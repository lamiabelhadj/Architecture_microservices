package com.directi.training.dip.exercise_refactored;

import java.util.Base64;

public class EncodingModule {
    private DataSource dataSource;
    private Storage storage;

    public EncodingModule(DataSource dataSource, Storage storage) {
        this.dataSource = dataSource;
        this.storage = storage;
    }

    public void encodeAndStore() throws Exception {
        String data = dataSource.getData();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        storage.write(encodedData);
    }
}
