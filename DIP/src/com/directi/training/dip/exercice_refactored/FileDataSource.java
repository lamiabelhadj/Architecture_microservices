package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileDataSource implements DataSource {
    private String filePath;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String getData() throws Exception {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }
        return sb.toString();
    }
}
