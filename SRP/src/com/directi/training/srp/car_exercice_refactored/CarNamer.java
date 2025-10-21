package com.directi.training.srp.car_exercice_refactored;


import java.util.List;
import java.util.StringJoiner;

public class CarNamer {
    /** Formats "Brand Model, Brand Model, ..." */
    public String namesCommaSeparated(List<Car> cars) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Car c : cars) {
            joiner.add(c.getBrand() + " " + c.getModel());
        }
        return joiner.toString();
    }

    /** Example extra: CSV line*/
    public String toCsv(List<Car> cars) {
        StringBuilder sb = new StringBuilder("id,brand,model\n");
        for (Car c : cars) {
            sb.append(c.getId()).append(',')
              .append(c.getBrand()).append(',')
              .append(c.getModel()).append('\n');
        }
        return sb.toString();
    }
}
