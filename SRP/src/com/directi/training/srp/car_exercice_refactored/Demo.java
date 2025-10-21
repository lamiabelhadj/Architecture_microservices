package com.directi.training.srp.car_exercice_refactored;



import java.util.Optional;

//testtt
public class Demo {
    public static void main(String[] args) {
        CarManager manager = new CarManager();

        System.out.println("All cars: " + manager.getCarsNames());

        Optional<Car> byId = manager.getFromDb("2");
        System.out.println("Car 2: " + byId.map(Car::toString).orElse("Not found"));

        Optional<Car> best = manager.getBestCar();
        System.out.println("Best car: " + best.map(Car::toString).orElse("N/A"));
    }
}
