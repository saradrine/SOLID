package com.directi.training.srp.exercice_refactored;
import java.util.List;

public class CarManager {
    private final CarRepository carRepository;
    private final CarFormatter carFormatter;
    private final CarComparator carComparator;

    public CarManager() {
        this.carRepository = new CarRepository();
        this.carFormatter = new CarFormatter();
        this.carComparator = new CarComparator();
    }

    public Car getCarById(String carId) {
        return carRepository.getFromDb(carId);
    }

    public String getAllCarNames() {
        List<Car> cars = carRepository.getAllCars();
        return carFormatter.getCarsNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carRepository.getAllCars();
        return carComparator.getBestCar(cars);
    }
}
