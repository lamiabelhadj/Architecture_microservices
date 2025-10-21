package com.directi.training.srp.car_exercice_refactored;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

//serves as the class holding the  business logic (how to choose the best car)  
public class CarRankingService {
    private final Comparator<Car> comparator;

    /** Default rule*/
    public CarRankingService() {
        this(Comparator.comparing(Car::getModel)
                       .thenComparing(Car::getBrand));
    }

    public CarRankingService(Comparator<Car> comparator) {
        this.comparator = comparator;
    }

    /** Single responsibility: pick the "best" per comparator */
    public Optional<Car> bestOf(List<Car> cars) {
        return cars.stream().max(comparator);
    }
}
