package com.directi.training.srp.car_exercice_refactored;


import java.util.*;
// A minimal in-memory repository(Serves as a data access layerr)
public class CarRepository {
    private final List<Car> carsDb;

    public CarRepository() {
        this(Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
        ));
    }

    public CarRepository(List<Car> initialCars) {
        this.carsDb = new ArrayList<>(Objects.requireNonNull(initialCars));
    }

    public Optional<Car> findById(String carId) {
        return carsDb.stream().filter(c -> c.getId().equals(carId)).findFirst();
    }

    public List<Car> findAll() {
        return Collections.unmodifiableList(carsDb);
    }
}
