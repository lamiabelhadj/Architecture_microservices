package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor {
    public void register(ISensing sensing) {
        while (true) {
            if (isPersonClose()) {
                sensing.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}