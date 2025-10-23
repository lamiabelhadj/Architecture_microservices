package com.directi.training.dip.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements Storage {
    private static Map<Integer, String> data = new HashMap<>();
    private static int count = 0;

    @Override
    public void write(String inputString) {
        data.put(++count, inputString);
        System.out.println("Data written with ID: " + count);
    }
}
