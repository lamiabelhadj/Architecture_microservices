package com.directi.training.srp.car_exercice_refactored;


import java.util.List;
import java.util.Optional;

//serves as the initial carManager to delegate tasks (orchestrates)
public class CarManager {
    private final CarRepository repository;
    private final CarNamer namer;
    private final CarRankingService ranking;

    public CarManager() {
        this(new CarRepository(), new CarNamer(), new CarRankingService());
    }

    public CarManager(CarRepository repository, CarNamer namer, CarRankingService ranking) {
        this.repository = repository;
        this.namer = namer;
        this.ranking = ranking;
    }

    public Optional<Car> getFromDb(String carId) {
        return repository.findById(carId);
    }

    public String getCarsNames() {
        List<Car> all = repository.findAll();
        return namer.namesCommaSeparated(all);
    }

    public Optional<Car> getBestCar() {
        List<Car> all = repository.findAll();
        return ranking.bestOf(all);
    }
}
