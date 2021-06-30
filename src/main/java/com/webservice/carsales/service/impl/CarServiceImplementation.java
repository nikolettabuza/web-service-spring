package com.webservice.carsales.service.impl;

import com.webservice.carsales.model.Car;
import com.webservice.carsales.service.CarService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImplementation implements CarService {

    List<Car> cars = new ArrayList<>();

    public CarServiceImplementation() {
        setCars();
    }

    public void setCars() {
        cars.add(new Car(0L, "Subaru", "Impreza WRC '99"));
        cars.add(new Car(1L, "TOYOTA", "GR Supra"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public Car getCarById(Long id) {
        for (Car car : cars) {
            if (car.getId().equals(id)) {
                return car;
            }
        }
        return null;
    }
}
