package com.directi.training.srp.car_exercice_refactored;

import java.util.Objects;

public final class Car {
    private final String id;
    private final String model;
    private final String brand;

    public Car(String id, String model, String brand) {
        this.id = Objects.requireNonNull(id, "id");
        this.model = Objects.requireNonNull(model, "model");
        this.brand = Objects.requireNonNull(brand, "brand");
    }

    public String getId()     { return id; }
    public String getModel()  { return model; }
    public String getBrand()  { return brand; }

    @Override public String toString() {
        return brand + " " + model;
    }
}
